// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.text.f;
import android.support.v4.view.af;
import android.support.v4.view.m;
import android.support.v4.widget.k;
import android.support.v4.widget.l;
import android.support.v7.internal.widget.ListViewCompat;
import android.support.v7.internal.widget.e;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class j
{
    private static final class a extends ListViewCompat
    {

        private boolean f;
        private boolean g;
        private boolean h;
        private af i;
        private k j;

        static boolean a(a a1, boolean flag)
        {
            a1.f = flag;
            return flag;
        }

        protected final boolean a()
        {
            return h || super.a();
        }

        public final boolean a(MotionEvent motionevent, int i1)
        {
            boolean flag;
            int j1;
            boolean flag1;
            boolean flag2;
            flag1 = true;
            flag2 = true;
            flag = false;
            j1 = android.support.v4.view.m.a(motionevent);
            j1;
            JVM INSTR tableswitch 1 3: default 44
        //                       1 148
        //                       2 151
        //                       3 139;
               goto _L1 _L2 _L3 _L4
_L1:
            flag1 = flag2;
            i1 = ((flag) ? 1 : 0);
_L10:
            if (!flag1 || i1 != 0)
            {
                h = false;
                setPressed(false);
                drawableStateChanged();
                if (i != null)
                {
                    i.d();
                    i = null;
                }
            }
            if (!flag1) goto _L6; else goto _L5
_L5:
            if (j == null)
            {
                j = new k(this);
            }
            j.a(true);
            j.onTouch(this, motionevent);
_L8:
            return flag1;
_L4:
            flag1 = false;
            i1 = ((flag) ? 1 : 0);
            continue; /* Loop/switch isn't completed */
_L2:
            flag1 = false;
_L3:
            int k1 = motionevent.findPointerIndex(i1);
            if (k1 < 0)
            {
                flag1 = false;
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = (int)motionevent.getX(k1);
                int l1 = (int)motionevent.getY(k1);
                k1 = pointToPosition(i1, l1);
                if (k1 == -1)
                {
                    i1 = 1;
                } else
                {
                    View view = getChildAt(k1 - getFirstVisiblePosition());
                    float f1 = i1;
                    float f2 = l1;
                    h = true;
                    setPressed(true);
                    layoutChildren();
                    setSelection(k1);
                    a(k1, view, f1, f2);
                    a(false);
                    refreshDrawableState();
                    boolean flag3 = true;
                    i1 = ((flag) ? 1 : 0);
                    flag1 = flag3;
                    if (j1 == 1)
                    {
                        performItemClick(view, k1, getItemIdAtPosition(k1));
                        i1 = ((flag) ? 1 : 0);
                        flag1 = flag3;
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (j == null) goto _L8; else goto _L7
_L7:
            j.a(false);
            return flag1;
            if (true) goto _L10; else goto _L9
_L9:
        }

        public final boolean hasFocus()
        {
            return g || super.hasFocus();
        }

        public final boolean hasWindowFocus()
        {
            return g || super.hasWindowFocus();
        }

        public final boolean isFocused()
        {
            return g || super.isFocused();
        }

        public final boolean isInTouchMode()
        {
            return g && f || super.isInTouchMode();
        }

        public a(Context context, boolean flag)
        {
            super(context, null, android.support.v7.appcompat.a.a.dropDownListViewStyle);
            g = flag;
            setCacheColorHint(0);
        }
    }

    public static abstract class b
        implements android.view.View.OnTouchListener
    {

        private final float a;
        private final int b = ViewConfiguration.getTapTimeout();
        private final int c;
        private final View d;
        private Runnable e;
        private Runnable f;
        private boolean g;
        private boolean h;
        private int i;
        private final int j[] = new int[2];

        static View a(b b1)
        {
            return b1.d;
        }

        private boolean a(MotionEvent motionevent)
        {
            boolean flag1 = true;
            View view = d;
            Object obj = a();
            if (obj == null || !((j) (obj)).n())
            {
                flag1 = false;
            } else
            {
                obj = j.a(((j) (obj)));
                if (obj == null || !((a) (obj)).isShown())
                {
                    return false;
                }
                MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
                int ai1[] = j;
                view.getLocationOnScreen(ai1);
                motionevent1.offsetLocation(ai1[0], ai1[1]);
                int ai[] = j;
                ((View) (obj)).getLocationOnScreen(ai);
                motionevent1.offsetLocation(-ai[0], -ai[1]);
                boolean flag2 = ((a) (obj)).a(motionevent1, i);
                motionevent1.recycle();
                int i1 = android.support.v4.view.m.a(motionevent);
                boolean flag;
                if (i1 != 1 && i1 != 3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag2 || !flag)
                {
                    return false;
                }
            }
            return flag1;
        }

        static void b(b b1)
        {
            b1.d();
            View view;
            for (view = b1.d; !view.isEnabled() || view.isLongClickable() || !b1.b();)
            {
                return;
            }

            view.getParent().requestDisallowInterceptTouchEvent(true);
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            view.onTouchEvent(motionevent);
            motionevent.recycle();
            b1.g = true;
            b1.h = true;
        }

        private void d()
        {
            if (f != null)
            {
                d.removeCallbacks(f);
            }
            if (e != null)
            {
                d.removeCallbacks(e);
            }
        }

        public abstract j a();

        protected boolean b()
        {
            j j1 = a();
            if (j1 != null && !j1.n())
            {
                j1.c();
            }
            return true;
        }

        protected boolean c()
        {
            j j1 = a();
            if (j1 != null && j1.n())
            {
                j1.k();
            }
            return true;
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            boolean flag2;
            boolean flag3;
            flag2 = false;
            flag3 = g;
            if (!flag3) goto _L2; else goto _L1
_L1:
            boolean flag;
            if (h)
            {
                flag = a(motionevent);
            } else
            if (a(motionevent) || !c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
_L9:
label0:
            {
                g = flag;
                if (!flag)
                {
                    flag = flag2;
                    if (!flag3)
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            return flag;
_L2:
            view = d;
            if (!view.isEnabled()) goto _L4; else goto _L3
_L3:
            android.support.v4.view.m.a(motionevent);
            JVM INSTR tableswitch 0 3: default 128
        //                       0 192
        //                       1 401
        //                       2 277
        //                       3 401;
               goto _L5 _L6 _L7 _L8 _L7
_L5:
            break; /* Loop/switch isn't completed */
_L7:
            break MISSING_BLOCK_LABEL_401;
_L4:
            int i1 = 0;
_L12:
            float f1;
            float f2;
            float f3;
            boolean flag1;
            if (i1 != 0 && b())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1;
            if (flag1)
            {
                long l1 = SystemClock.uptimeMillis();
                view = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
                d.onTouchEvent(view);
                view.recycle();
                flag = flag1;
            }
              goto _L9
_L6:
            i = motionevent.getPointerId(0);
            h = false;
            if (e == null)
            {
                e = new a(this, (byte)0);
            }
            view.postDelayed(e, b);
            if (f == null)
            {
                f = new b(this, (byte)0);
            }
            view.postDelayed(f, c);
              goto _L4
_L8:
            i1 = motionevent.findPointerIndex(i);
            if (i1 < 0) goto _L4; else goto _L10
_L10:
            f1 = motionevent.getX(i1);
            f2 = motionevent.getY(i1);
            f3 = a;
            if (f1 >= -f3 && f2 >= -f3 && f1 < (float)(view.getRight() - view.getLeft()) + f3 && f2 < (float)(view.getBottom() - view.getTop()) + f3)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0) goto _L4; else goto _L11
_L11:
            d();
            view.getParent().requestDisallowInterceptTouchEvent(true);
            i1 = 1;
              goto _L12
            d();
              goto _L4
        }

        public b(View view)
        {
            d = view;
            a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            c = (b + ViewConfiguration.getLongPressTimeout()) / 2;
        }
    }

    private final class b.a
        implements Runnable
    {

        final b a;

        public final void run()
        {
            b.a(a).getParent().requestDisallowInterceptTouchEvent(true);
        }

        private b.a(b b1)
        {
            a = b1;
            super();
        }

        b.a(b b1, byte byte0)
        {
            this(b1);
        }
    }

    private final class b.b
        implements Runnable
    {

        final b a;

        public final void run()
        {
            b.b(a);
        }

        private b.b(b b1)
        {
            a = b1;
            super();
        }

        b.b(b b1, byte byte0)
        {
            this(b1);
        }
    }

    private final class c
        implements Runnable
    {

        final j a;

        public final void run()
        {
            a.m();
        }

        private c()
        {
            a = j.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    private final class d extends DataSetObserver
    {

        final j a;

        public final void onChanged()
        {
            if (a.n())
            {
                a.c();
            }
        }

        public final void onInvalidated()
        {
            a.k();
        }

        private d()
        {
            a = j.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    private final class e
        implements android.widget.AbsListView.OnScrollListener
    {

        final j a;

        public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
        {
        }

        public final void onScrollStateChanged(AbsListView abslistview, int i1)
        {
            if (i1 == 1 && !a.o() && j.b(a).getContentView() != null)
            {
                j.d(a).removeCallbacks(j.c(a));
                j.c(a).run();
            }
        }

        private e()
        {
            a = j.this;
            super();
        }

        e(byte byte0)
        {
            this();
        }
    }

    private final class f
        implements android.view.View.OnTouchListener
    {

        final j a;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            int i1;
            int j1;
            int k1;
            i1 = motionevent.getAction();
            j1 = (int)motionevent.getX();
            k1 = (int)motionevent.getY();
            if (i1 != 0 || j.b(a) == null || !j.b(a).isShowing() || j1 < 0 || j1 >= j.b(a).getWidth() || k1 < 0 || k1 >= j.b(a).getHeight()) goto _L2; else goto _L1
_L1:
            j.d(a).postDelayed(j.c(a), 250L);
_L4:
            return false;
_L2:
            if (i1 == 1)
            {
                j.d(a).removeCallbacks(j.c(a));
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private f()
        {
            a = j.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }

    private final class g
        implements Runnable
    {

        final j a;

        public final void run()
        {
            if (j.a(a) != null && j.a(a).getCount() > j.a(a).getChildCount() && j.a(a).getChildCount() <= a.b)
            {
                j.b(a).setInputMethodMode(2);
                a.c();
            }
        }

        private g()
        {
            a = j.this;
            super();
        }

        g(byte byte0)
        {
            this();
        }
    }


    private static Method a;
    private Handler A;
    private Rect B;
    private boolean C;
    private int D;
    int b;
    private Context c;
    private PopupWindow d;
    private ListAdapter e;
    private a f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    private View o;
    private int p;
    private DataSetObserver q;
    private View r;
    private Drawable s;
    private android.widget.AdapterView.OnItemClickListener t;
    private android.widget.AdapterView.OnItemSelectedListener u;
    private final g v;
    private final f w;
    private final e x;
    private final c y;
    private Runnable z;

    public j(Context context)
    {
        this(context, null, android.support.v7.appcompat.a.a.listPopupWindowStyle);
    }

    public j(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, 0);
    }

    public j(Context context, AttributeSet attributeset, int i1, int j1)
    {
        g = -2;
        h = -2;
        l = 0;
        m = false;
        n = false;
        b = 0x7fffffff;
        p = 0;
        v = new g((byte)0);
        w = new f((byte)0);
        x = new e((byte)0);
        y = new c((byte)0);
        A = new Handler();
        B = new Rect();
        c = context;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.a.k.ListPopupWindow, i1, j1);
        i = typedarray.getDimensionPixelOffset(android.support.v7.appcompat.a.k.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        j = typedarray.getDimensionPixelOffset(android.support.v7.appcompat.a.k.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (j != 0)
        {
            k = true;
        }
        typedarray.recycle();
        d = new android.support.v7.internal.widget.e(context, attributeset, i1);
        d.setInputMethodMode(1);
        D = android.support.v4.text.f.a(c.getResources().getConfiguration().locale);
    }

    static a a(j j1)
    {
        return j1.f;
    }

    static PopupWindow b(j j1)
    {
        return j1.d;
    }

    static g c(j j1)
    {
        return j1.v;
    }

    static Handler d(j j1)
    {
        return j1.A;
    }

    public final void a(int i1)
    {
        i = i1;
    }

    public final void a(Drawable drawable)
    {
        d.setBackgroundDrawable(drawable);
    }

    public final void a(View view)
    {
        r = view;
    }

    public final void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        t = onitemclicklistener;
    }

    public void a(ListAdapter listadapter)
    {
        if (q != null) goto _L2; else goto _L1
_L1:
        q = new d((byte)0);
_L4:
        e = listadapter;
        if (e != null)
        {
            listadapter.registerDataSetObserver(q);
        }
        if (f != null)
        {
            f.setAdapter(e);
        }
        return;
_L2:
        if (e != null)
        {
            e.unregisterDataSetObserver(q);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        d.setOnDismissListener(ondismisslistener);
    }

    public final void b(int i1)
    {
        j = i1;
        k = true;
    }

    public void c()
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        if (f != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        View view;
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        obj1 = c;
        z = new Runnable() {

            final j a;

            public final void run()
            {
                View view1 = a.g();
                if (view1 != null && view1.getWindowToken() != null)
                {
                    a.c();
                }
            }

            
            {
                a = j.this;
                super();
            }
        };
        if (!C)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = new a(((Context) (obj1)), flag);
        if (s != null)
        {
            f.setSelector(s);
        }
        f.setAdapter(e);
        f.setOnItemClickListener(t);
        f.setFocusable(true);
        f.setFocusableInTouchMode(true);
        f.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final j a;

            public final void onItemSelected(AdapterView adapterview, View view1, int i2, long l2)
            {
                if (i2 != -1)
                {
                    adapterview = j.a(a);
                    if (adapterview != null)
                    {
                        a.a(adapterview, false);
                    }
                }
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = j.this;
                super();
            }
        });
        f.setOnScrollListener(x);
        if (u != null)
        {
            f.setOnItemSelectedListener(u);
        }
        obj = f;
        view = o;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_1184;
        }
        obj1 = new LinearLayout(((Context) (obj1)));
        ((LinearLayout) (obj1)).setOrientation(1);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        p;
        JVM INSTR tableswitch 0 1: default 220
    //                   0 563
    //                   1 548;
           goto _L3 _L4 _L5
_L3:
        Log.e("ListPopupWindow", (new StringBuilder("Invalid hint position ")).append(p).toString());
_L10:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(h, 0x80000000), 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i1 = view.getMeasuredHeight();
        j1 = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
        i1 = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i1 + j1);
        obj = obj1;
_L19:
        d.setContentView(((View) (obj)));
_L11:
        obj = d.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(B);
            j1 = B.top + B.bottom;
            k1 = j1;
            if (!k)
            {
                j = -B.top;
                k1 = j1;
            }
        } else
        {
            B.setEmpty();
            k1 = 0;
        }
        d.getInputMethodMode();
        l1 = d.getMaxAvailableHeight(r, j);
        if (!m && g != -1) goto _L7; else goto _L6
_L6:
        i1 = l1 + k1;
_L15:
        j1 = 0;
        k1 = 0;
        flag = o();
        if (!d.isShowing()) goto _L9; else goto _L8
_L8:
        if (h == -1)
        {
            j1 = -1;
        } else
        if (h == -2)
        {
            j1 = r.getWidth();
        } else
        {
            j1 = h;
        }
        if (g == -1)
        {
            if (!flag)
            {
                i1 = -1;
            }
            if (flag)
            {
                obj = d;
                if (h == -1)
                {
                    k1 = -1;
                } else
                {
                    k1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(k1, 0);
            } else
            {
                obj = d;
                if (h == -1)
                {
                    k1 = -1;
                } else
                {
                    k1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(k1, -1);
            }
        } else
        if (g != -2)
        {
            i1 = g;
        }
        obj = d;
        if (!n && !m)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        d.update(r, i, j, j1, i1);
_L18:
        return;
_L5:
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
        ((LinearLayout) (obj1)).addView(view);
          goto _L10
_L4:
        ((LinearLayout) (obj1)).addView(view);
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
          goto _L10
_L2:
        d.getContentView();
        obj = o;
        Exception exception;
        if (obj != null)
        {
            obj1 = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            i1 = ((View) (obj)).getMeasuredHeight();
            j1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin;
            i1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin + (i1 + j1);
        } else
        {
            i1 = 0;
        }
          goto _L11
_L7:
        h;
        JVM INSTR tableswitch -2 -1: default 668
    //                   -2 722
    //                   -1 762;
           goto _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_762;
_L12:
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(h, 0x40000000);
_L16:
        l1 = f.a(j1, l1 - i1);
        j1 = i1;
        if (l1 > 0)
        {
            j1 = i1 + k1;
        }
        i1 = l1 + j1;
          goto _L15
_L13:
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels - (B.left + B.right), 0x80000000);
          goto _L16
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels - (B.left + B.right), 0x40000000);
          goto _L16
_L9:
        if (h == -1)
        {
            j1 = -1;
        } else
        if (h == -2)
        {
            d.setWidth(r.getWidth());
        } else
        {
            d.setWidth(h);
        }
        if (g == -1)
        {
            i1 = -1;
        } else
        if (g == -2)
        {
            d.setHeight(i1);
            i1 = k1;
        } else
        {
            d.setHeight(g);
            i1 = k1;
        }
        d.setWindowLayoutMode(j1, i1);
        if (a != null)
        {
            try
            {
                a.invoke(d, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        obj = d;
        if (!n && !m)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        d.setTouchInterceptor(w);
        android.support.v4.widget.l.a(d, r, i, j, l);
        f.setSelection(-1);
        if (!C || f.isInTouchMode())
        {
            m();
        }
        if (C) goto _L18; else goto _L17
_L17:
        A.post(y);
        return;
        i1 = 0;
          goto _L19
    }

    public final void c(int i1)
    {
        l = i1;
    }

    public final void d()
    {
        p = 0;
    }

    public final void d(int i1)
    {
        Drawable drawable = d.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(B);
            h = B.left + B.right + i1;
            return;
        } else
        {
            h = i1;
            return;
        }
    }

    public final void e()
    {
        C = true;
        d.setFocusable(true);
    }

    public final void e(int i1)
    {
        a a1 = f;
        if (d.isShowing() && a1 != null)
        {
            a.a(a1, false);
            a1.setSelection(i1);
            if (android.os.Build.VERSION.SDK_INT >= 11 && a1.getChoiceMode() != 0)
            {
                a1.setItemChecked(i1, true);
            }
        }
    }

    public final Drawable f()
    {
        return d.getBackground();
    }

    public final View g()
    {
        return r;
    }

    public final int h()
    {
        return i;
    }

    public final int i()
    {
        if (!k)
        {
            return 0;
        } else
        {
            return j;
        }
    }

    public final int j()
    {
        return h;
    }

    public final void k()
    {
        d.dismiss();
        if (o != null)
        {
            ViewParent viewparent = o.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(o);
            }
        }
        d.setContentView(null);
        f = null;
        A.removeCallbacks(v);
    }

    public final void l()
    {
        d.setInputMethodMode(2);
    }

    public final void m()
    {
        a a1 = f;
        if (a1 != null)
        {
            a.a(a1, true);
            a1.requestLayout();
        }
    }

    public final boolean n()
    {
        return d.isShowing();
    }

    public final boolean o()
    {
        return d.getInputMethodMode() == 2;
    }

    public final ListView p()
    {
        return f;
    }

    static 
    {
        try
        {
            a = android/widget/PopupWindow.getDeclaredMethod("setClipToScreenEnabled", new Class[] {
                Boolean.TYPE
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }
}
