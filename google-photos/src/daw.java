// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.content.ClipData;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import java.util.Deque;

public class daw extends AdapterView
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, dbc
{

    private static final String b = daw.getSimpleName();
    private static final ClipData c;
    public final dbd a;
    private final DataSetObserver d;
    private final daz e;
    private final dbb f[];
    private final LongSparseArray g;
    private final SparseIntArray h;
    private final Runnable i;
    private final int j;
    private final int k;
    private int l;
    private Adapter m;

    public daw(Context context)
    {
        this(context, null, 0);
    }

    public daw(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public daw(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = new daz();
        g = new LongSparseArray();
        h = new SparseIntArray();
        m = null;
        context = context.obtainStyledAttributes(attributeset, bhx.f, i1, 0);
        j = (int)context.getDimension(bhx.h, 0.0F);
        k = context.getInt(bhx.g, -1);
        float f1;
        boolean flag;
        if (k == 0 || k == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = k;
        b.a(flag, (new StringBuilder(60)).append("orientation must be horizontal or vertical, not: ").append(i1).toString());
        f1 = context.getDimension(bhx.i, 0.0F);
        if (f1 > 0.0F)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec((int)f1, 0x80000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        l = i1;
        context.recycle();
        d = new day(this);
        a = new dbd(b(), j, false);
        f = a();
        i = new dax(this);
        setChildrenDrawingOrderEnabled(true);
        setClipToPadding(false);
    }

    private void a(View view)
    {
        int i1;
        int j1;
        if (b())
        {
            j1 = l;
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), 0x40000000);
        } else
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x40000000);
            i1 = l;
        }
        view.measure(j1, i1);
    }

    static void a(daw daw1)
    {
        daw1.f();
    }

    static void b(daw daw1)
    {
        int j1 = daw1.g.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            dba dba1 = (dba)daw1.g.valueAt(i1);
            daw1.e.a(dba1.c, dba1.a);
        }

        daw1.g.clear();
        daw1.removeAllViewsInLayout();
    }

    private void f()
    {
        removeCallbacks(i);
        if (m == null)
        {
            return;
        }
        aln.a("refreshInternal");
        a.h = m;
        a.d.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        getGlobalVisibleRect(a.e);
        int l1 = getChildCount();
        for (int i1 = 0; i1 < l1; i1++)
        {
            View view = getChildAt(i1);
            if (view.isLayoutRequested())
            {
                a(view);
            }
        }

        dbb adbb[] = f;
        l1 = adbb.length;
        for (int j1 = 0; j1 < l1; j1++)
        {
            adbb[j1].a(a);
        }

        int k1;
        if (b())
        {
            setScrollX(a.i);
        } else
        {
            setScrollY(a.i);
        }
        k1 = g.size();
        for (int i2 = 0; i2 < k1; i2++)
        {
            dba dba1 = (dba)g.valueAt(i2);
            if (a.c.indexOfValue(dba1) < 0)
            {
                g.delete(dba1.b);
                e.a(dba1.c, dba1.a);
                removeViewInLayout(dba1.a);
                i2--;
                k1--;
            }
        }

        h.clear();
        for (int j2 = 0; j2 < k1; j2++)
        {
            dba dba2 = (dba)g.valueAt(j2);
            int k2 = indexOfChild(dba2.a);
            short word0 = dba2.d;
            h.put((word0 << 15) - k2, k2);
        }

        invalidate();
        aln.a();
    }

    public final dba a(Adapter adapter, int i1)
    {
label0:
        {
            byte byte0 = -2;
            long l1 = adapter.getItemId(i1);
            int j1 = adapter.getItemViewType(i1);
            dba dba1 = (dba)g.get(l1);
            Object obj;
            if (dba1 != null)
            {
                obj = dba1;
                if (dba1.c == j1)
                {
                    break label0;
                }
            }
            int k1 = adapter.getItemViewType(i1);
            obj = (Deque)e.a.get(k1);
            if (obj == null || ((Deque) (obj)).isEmpty())
            {
                obj = null;
            } else
            {
                obj = (View)((Deque) (obj)).pop();
            }
            adapter = adapter.getView(i1, ((View) (obj)), this);
            if (indexOfChild(adapter) != -1)
            {
                Log.w(b, "Adapter.getView() returned a View that is already a child of the StripView");
            }
            if (b())
            {
                i1 = -1;
            } else
            {
                i1 = -2;
                byte0 = -1;
            }
            addViewInLayout(adapter, -1, new android.view.ViewGroup.LayoutParams(byte0, i1));
            adapter.setTranslationX(0.0F);
            adapter.setTranslationY(0.0F);
            adapter.setAlpha(1.0F);
            adapter.setLongClickable(true);
            adapter.setOnLongClickListener(this);
            obj = new dba(adapter, l1, j1);
            a(((dba) (obj)).a);
            ((dba) (obj)).a.layout(getPaddingLeft(), getPaddingTop(), ((dba) (obj)).a.getMeasuredWidth() + getPaddingLeft(), ((dba) (obj)).a.getMeasuredHeight() + getPaddingTop());
            g.put(l1, obj);
        }
        return ((dba) (obj));
    }

    public final dbb a(Class class1)
    {
        dbb adbb[] = f;
        int j1 = adbb.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            dbb dbb1 = adbb[i1];
            if (class1.isInstance(dbb1))
            {
                return (dbb)class1.cast(dbb1);
            }
        }

        return null;
    }

    public final void a(android.view.View.DragShadowBuilder dragshadowbuilder, Object obj)
    {
        super.startDrag(c, dragshadowbuilder, null, 0);
    }

    public dbb[] a()
    {
        return (new dbb[] {
            new dcq(this), new dco(this)
        });
    }

    public final boolean b()
    {
        return k == 0;
    }

    public final void c()
    {
        boolean flag;
        if (getWidth() > 0 || getHeight() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            postOnAnimation(i);
        }
    }

    public final void d()
    {
        invalidate();
    }

    public boolean dispatchDragEvent(DragEvent dragevent)
    {
        dbb adbb[] = f;
        int j1 = adbb.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            adbb[i1].a(a, dragevent);
        }

        return true;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        dbb adbb[] = f;
        int j1 = adbb.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            adbb[i1].a(a, canvas);
        }

    }

    public final Context e()
    {
        return getContext();
    }

    public Adapter getAdapter()
    {
        return m;
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        i1 = j1;
        if (j1 < h.size())
        {
            i1 = h.valueAt(j1);
        }
        return i1;
    }

    public View getSelectedView()
    {
        return null;
    }

    public void onClick(View view)
    {
        int j1 = a.d(view);
        if (j1 >= 0)
        {
            view = f;
            int k1 = view.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                view[i1].b(a, j1);
            }

        }
    }

    protected void onDetachedFromWindow()
    {
        dbd dbd1 = a;
        if (dbd1.a())
        {
            dbd1.l.cancel();
        }
        dbd1.l = null;
        removeCallbacks(i);
        super.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return onTouchEvent(motionevent);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        f();
    }

    public boolean onLongClick(View view)
    {
        boolean flag1 = false;
        boolean flag = false;
        int j1 = a.d(view);
        if (j1 >= 0)
        {
            view = f;
            int k1 = view.length;
            int i1 = 0;
            do
            {
                flag1 = flag;
                if (i1 >= k1)
                {
                    break;
                }
                flag1 = view[i1].a(a, j1);
                i1++;
                flag = flag1 | flag;
            } while (true);
        }
        return flag1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = 0;
        dbb adbb[] = f;
        int j1 = adbb.length;
        boolean flag = false;
        for (; i1 < j1; i1++)
        {
            flag |= adbb[i1].a(a, motionevent);
        }

        if (flag)
        {
            requestDisallowInterceptTouchEvent(true);
        }
        return flag;
    }

    public void setAdapter(Adapter adapter)
    {
        if (m != null)
        {
            m.unregisterDataSetObserver(d);
        }
        g.clear();
        removeAllViewsInLayout();
        e.a.clear();
        m = adapter;
        if (m != null)
        {
            b.a(m.hasStableIds(), "StripView currently only works with adapters that have stable ids");
            m.registerDataSetObserver(d);
            c();
        }
    }

    public void setSelection(int i1)
    {
    }

    static 
    {
        android.content.ClipData.Item item = new android.content.ClipData.Item("");
        c = new ClipData("", new String[] {
            "application/octet-stream"
        }, item);
    }
}
