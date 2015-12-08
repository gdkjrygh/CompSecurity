// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            y

public class x extends ListView
{

    private static final int f[] = {
        0
    };
    final Rect a = new Rect();
    int b;
    int c;
    int d;
    int e;
    private Field g;
    private y h;

    public x(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
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

    public int a(int i, int j, int k, int l, int i1)
    {
        Object obj;
        ListAdapter listadapter;
        int j1;
        j = getListPaddingTop();
        j1 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        k = getDividerHeight();
        obj = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        i = j + j1;
_L4:
        return i;
_L2:
        j = j1 + j;
        int l1;
        int i2;
        int k2;
        if (k <= 0 || obj == null)
        {
            k = 0;
        }
        l1 = 0;
        obj = null;
        i2 = 0;
        k2 = listadapter.getCount();
        for (int k1 = 0; k1 < k2;)
        {
            int j2 = listadapter.getItemViewType(k1);
            if (j2 != i2)
            {
                obj = null;
                i2 = j2;
            }
            obj = listadapter.getView(k1, ((View) (obj)), this);
            android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
            if (layoutparams != null && layoutparams.height > 0)
            {
                j2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
            } else
            {
                j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            ((View) (obj)).measure(i, j2);
            if (k1 > 0)
            {
                j += k;
            }
            j += ((View) (obj)).getMeasuredHeight();
            if (j >= l)
            {
                i = l;
                if (i1 >= 0)
                {
                    i = l;
                    if (k1 > i1)
                    {
                        i = l;
                        if (l1 > 0)
                        {
                            i = l;
                            if (j != l)
                            {
                                return l1;
                            }
                        }
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            j2 = l1;
            if (i1 >= 0)
            {
                j2 = l1;
                if (k1 >= i1)
                {
                    j2 = j;
                }
            }
            k1++;
            l1 = j2;
        }

        return j;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a()
    {
        Drawable drawable = getSelector();
        if (drawable != null && b())
        {
            drawable.setState(getDrawableState());
        }
    }

    protected void a(int i, View view)
    {
        boolean flag1 = true;
        Drawable drawable = getSelector();
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
        b(i, view);
        if (flag)
        {
            view = a;
            float f1 = view.exactCenterX();
            float f2 = view.exactCenterY();
            if (getVisibility() != 0)
            {
                flag1 = false;
            }
            drawable.setVisible(flag1, false);
            android.support.v4.b.a.a.a(drawable, f1, f2);
        }
    }

    protected void a(int i, View view, float f1, float f2)
    {
        a(i, view);
        view = getSelector();
        if (view != null && i != -1)
        {
            android.support.v4.b.a.a.a(view, f1, f2);
        }
    }

    protected void a(Canvas canvas)
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
    }

    protected void b(int i, View view)
    {
        Rect rect = a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left = rect.left - b;
        rect.top = rect.top - c;
        rect.right = rect.right + d;
        rect.bottom = rect.bottom + e;
        boolean flag;
        flag = g.getBoolean(this);
        if (view.isEnabled() == flag)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        view = g;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            view.set(this, Boolean.valueOf(flag));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
            return;
        }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        refreshDrawableState();
    }

    protected boolean b()
    {
        return c() && isPressed();
    }

    protected boolean c()
    {
        return false;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        a();
    }

    public void setSelector(Drawable drawable)
    {
        Object obj;
        if (drawable != null)
        {
            obj = new y(drawable);
        } else
        {
            obj = null;
        }
        h = ((y) (obj));
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

    protected void setSelectorEnabled(boolean flag)
    {
        if (h != null)
        {
            h.a(flag);
        }
    }

}
