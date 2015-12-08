// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.graphics.Rect;
import android.support.v4.view.af;
import android.support.v4.view.x;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButton, AppBarLayout, s, a, 
//            CoordinatorLayout

public static class A extends A
{

    private static final boolean a;
    private Rect b;

    private boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, FloatingActionButton floatingactionbutton)
    {
        if (((A)floatingactionbutton.getLayoutParams()).Params != appbarlayout.getId())
        {
            return false;
        }
        if (b == null)
        {
            b = new Rect();
        }
        Rect rect = b;
        s.a(coordinatorlayout, appbarlayout, rect);
        if (rect.bottom <= appbarlayout.f())
        {
            floatingactionbutton.b();
        } else
        {
            floatingactionbutton.a();
        }
        return true;
    }

    public final void a(View view, View view1)
    {
        view = (FloatingActionButton)view;
        if ((view1 instanceof b) && x.p(view) != 0.0F)
        {
            x.s(view).c(0.0F).b().c().a(1.0F).a(a.b).a(null);
        }
    }

    public final boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
    {
        Object obj;
        boolean flag;
        flag = false;
        view = (FloatingActionButton)view;
        obj = coordinatorlayout.b(view);
        int l = ((List) (obj)).size();
        int j = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            View view1 = (View)((List) (obj)).get(j);
            if ((view1 instanceof AppBarLayout) && a(coordinatorlayout, (AppBarLayout)view1, ((FloatingActionButton) (view))))
            {
                break;
            }
            j++;
        } while (true);
        coordinatorlayout.a(view, i);
        obj = FloatingActionButton.a(view);
        if (obj == null || ((Rect) (obj)).centerX() <= 0 || ((Rect) (obj)).centerY() <= 0) goto _L2; else goto _L1
_L1:
        b b1 = (a)view.getLayoutParams();
        int k;
        if (view.getRight() >= coordinatorlayout.getWidth() - b1.n)
        {
            i = ((Rect) (obj)).right;
        } else
        if (view.getLeft() <= b1.)
        {
            i = -((Rect) (obj)).left;
        } else
        {
            i = 0;
        }
        if (view.getBottom() < coordinatorlayout.getBottom() - b1.in) goto _L4; else goto _L3
_L3:
        k = ((Rect) (obj)).bottom;
_L6:
        view.offsetTopAndBottom(k);
        view.offsetLeftAndRight(i);
_L2:
        return true;
_L4:
        k = ((flag) ? 1 : 0);
        if (view.getTop() <= b1.tAndRight)
        {
            k = -((Rect) (obj)).top;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final volatile boolean a(View view)
    {
        return a && (view instanceof a);
    }

    public final boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        view = (FloatingActionButton)view;
        if (view1 instanceof a)
        {
            if (view.getVisibility() == 0)
            {
                float f = 0.0F;
                view1 = coordinatorlayout.b(view);
                int j = view1.size();
                for (int i = 0; i < j; i++)
                {
                    View view2 = (View)view1.get(i);
                    if ((view2 instanceof lity) && coordinatorlayout.a(view, view2))
                    {
                        f = Math.min(f, x.p(view2) - (float)view2.getHeight());
                    }
                }

                x.b(view, f);
            }
        } else
        if (view1 instanceof AppBarLayout)
        {
            a(coordinatorlayout, (AppBarLayout)view1, view);
            return false;
        }
        return false;
    }

    static 
    {
        boolean flag;
        if (android.os.ionButton >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public A()
    {
    }
}
