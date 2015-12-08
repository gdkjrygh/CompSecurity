// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            u, AppBarLayout, CoordinatorLayout, a

public static class overlapTop extends u
{

    private int a;

    public final volatile boolean a(int i)
    {
        return super.a(i);
    }

    public final volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
    {
        return super.a(coordinatorlayout, view, i);
    }

    public final boolean a(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
    {
        int i1 = view.getLayoutParams().lingViewBehavior;
        if (i1 != -1 && i1 != -2) goto _L2; else goto _L1
_L1:
        Object obj;
        int l;
        int j1;
        obj = coordinatorlayout.b(view);
        if (((List) (obj)).isEmpty())
        {
            return false;
        }
        j1 = ((List) (obj)).size();
        l = 0;
_L9:
        if (l >= j1) goto _L4; else goto _L3
_L3:
        View view1 = (View)((List) (obj)).get(l);
        if (!(view1 instanceof AppBarLayout)) goto _L6; else goto _L5
_L5:
        obj = (AppBarLayout)view1;
_L7:
        if (obj != null && x.E(((View) (obj))))
        {
            if (x.x(((View) (obj))))
            {
                x.a(view, true);
            }
            l = android.view.b(k);
            k = l;
            if (l == 0)
            {
                k = coordinatorlayout.getHeight();
            }
            int k1 = ((AppBarLayout) (obj)).getMeasuredHeight();
            int l1 = ((AppBarLayout) (obj)).a();
            if (i1 == -1)
            {
                l = 0x40000000;
            } else
            {
                l = 0x80000000;
            }
            coordinatorlayout.a(view, i, j, android.view.a(l1 + (k - k1), l));
            return true;
        }
          goto _L2
_L6:
        l++;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = null;
          goto _L7
_L2:
        return false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean a(View view)
    {
        return view instanceof AppBarLayout;
    }

    public final volatile int b()
    {
        return super.b();
    }

    public final boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
    {
        overlapTop overlaptop = ((overlapTop)view1.getLayoutParams()).overlapTop;
        if (overlaptop instanceof overlapTop)
        {
            int i = ((overlapTop)overlaptop).overlapTop();
            int j = view1.getHeight();
            int k = a;
            int l = coordinatorlayout.getHeight();
            int i1 = view.getHeight();
            if (a != 0 && (view1 instanceof AppBarLayout))
            {
                int j1 = ((AppBarLayout)view1).a();
                super.a(android.support.design.widget.a.a(j - k, l - i1, (float)Math.abs(i) / (float)j1));
            } else
            {
                super.a((view1.getHeight() - a) + i);
            }
        }
        return false;
    }

    public ()
    {
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, android.support.design.havior);
        a = context.getDimensionPixelSize(android.support.design.havior_overlapTop, 0);
        context.recycle();
    }
}
