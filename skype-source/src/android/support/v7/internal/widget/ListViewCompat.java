// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import android.support.v7.graphics.drawable.b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ListViewCompat extends ListView
{
    private static final class a extends b
    {

        private boolean a;

        final void a(boolean flag)
        {
            a = flag;
        }

        public final void draw(Canvas canvas)
        {
            if (a)
            {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f1, float f2)
        {
            if (a)
            {
                super.setHotspot(f1, f2);
            }
        }

        public final void setHotspotBounds(int i, int j, int k, int l)
        {
            if (a)
            {
                super.setHotspotBounds(i, j, k, l);
            }
        }

        public final boolean setState(int ai[])
        {
            if (a)
            {
                return super.setState(ai);
            } else
            {
                return false;
            }
        }

        public final boolean setVisible(boolean flag, boolean flag1)
        {
            if (a)
            {
                return super.setVisible(flag, flag1);
            } else
            {
                return false;
            }
        }

        public a(Drawable drawable)
        {
            super(drawable);
            a = true;
        }
    }


    private static final int f[] = {
        0
    };
    final Rect a;
    int b;
    int c;
    int d;
    int e;
    private Field g;
    private a h;

    public ListViewCompat(Context context)
    {
        this(context, null);
    }

    public ListViewCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListViewCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Rect();
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        try
        {
            g = android/widget/AbsListView.getDeclaredField("mIsChildViewEnabled");
            g.setAccessible(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public final int a(int i, int j)
    {
        Object obj;
        ListAdapter listadapter;
        int k;
        int l;
        int i1;
        k = getListPaddingTop();
        i1 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        l = getDividerHeight();
        obj = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        k += i1;
_L4:
        return k;
_L2:
        k += i1;
        int k1;
        int i2;
        if (l <= 0 || obj == null)
        {
            l = 0;
        }
        obj = null;
        k1 = 0;
        i2 = listadapter.getCount();
        i1 = 0;
        do
        {
label0:
            {
                if (i1 >= i2)
                {
                    break label0;
                }
                int l1 = listadapter.getItemViewType(i1);
                int j1 = k1;
                if (l1 != k1)
                {
                    obj = null;
                    j1 = l1;
                }
                obj = listadapter.getView(i1, ((View) (obj)), this);
                android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
                if (layoutparams != null && layoutparams.height > 0)
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                } else
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                ((View) (obj)).measure(i, k1);
                k1 = k;
                if (i1 > 0)
                {
                    k1 = k + l;
                }
                k1 += ((View) (obj)).getMeasuredHeight();
                k = j;
                if (k1 >= j)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
                k = k1;
                k1 = j1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return k;
    }

    protected final void a(int i, View view, float f1, float f2)
    {
        boolean flag1;
        boolean flag2 = true;
        Drawable drawable = getSelector();
        float f3;
        float f4;
        Rect rect;
        boolean flag;
        if (drawable != null && i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            drawable.setVisible(false, false);
        }
        rect = a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left = rect.left - b;
        rect.top = rect.top - c;
        rect.right = rect.right + d;
        rect.bottom = rect.bottom + e;
        flag1 = g.getBoolean(this);
        if (view.isEnabled() == flag1)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        view = g;
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.set(this, Boolean.valueOf(flag1));
        if (i != -1)
        {
            try
            {
                refreshDrawableState();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view.printStackTrace();
            }
        }
        if (flag)
        {
            view = a;
            f3 = view.exactCenterX();
            f4 = view.exactCenterY();
            if (getVisibility() == 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            drawable.setVisible(flag1, false);
            android.support.v4.graphics.drawable.a.a(drawable, f3, f4);
        }
        view = getSelector();
        if (view != null && i != -1)
        {
            android.support.v4.graphics.drawable.a.a(view, f1, f2);
        }
        return;
    }

    protected final void a(boolean flag)
    {
        if (h != null)
        {
            h.a(flag);
        }
    }

    protected boolean a()
    {
        return false;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (!a.isEmpty())
        {
            Drawable drawable = getSelector();
            if (drawable != null)
            {
                drawable.setBounds(a);
                drawable.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    protected void drawableStateChanged()
    {
        boolean flag = true;
        super.drawableStateChanged();
        a(true);
        Drawable drawable = getSelector();
        if (drawable != null)
        {
            if (!a() || !isPressed())
            {
                flag = false;
            }
            if (flag)
            {
                drawable.setState(getDrawableState());
            }
        }
    }

    public void setSelector(Drawable drawable)
    {
        Object obj;
        if (drawable != null)
        {
            obj = new a(drawable);
        } else
        {
            obj = null;
        }
        h = ((a) (obj));
        super.setSelector(h);
        obj = new Rect();
        if (drawable != null)
        {
            drawable.getPadding(((Rect) (obj)));
        }
        b = ((Rect) (obj)).left;
        c = ((Rect) (obj)).top;
        d = ((Rect) (obj)).right;
        e = ((Rect) (obj)).bottom;
    }

}
