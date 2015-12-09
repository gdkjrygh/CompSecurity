// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            ViewOffsetBehavior, CoordinatorLayout

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior
{

    public HeaderScrollingViewBehavior()
    {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    abstract View findFirstDependency(List list);

    int getScrollRange(View view)
    {
        return view.getMeasuredHeight();
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
    {
        int j1 = view.getLayoutParams().height;
        if (j1 == -1 || j1 == -2)
        {
            Object obj = coordinatorlayout.getDependencies(view);
            if (!((List) (obj)).isEmpty())
            {
                if ((obj = findFirstDependency(((List) (obj)))) != null && ViewCompat.isLaidOut(((View) (obj))))
                {
                    if (ViewCompat.getFitsSystemWindows(((View) (obj))))
                    {
                        ViewCompat.setFitsSystemWindows(view, true);
                    }
                    int i1 = android.view.View.MeasureSpec.getSize(k);
                    k = i1;
                    if (i1 == 0)
                    {
                        k = coordinatorlayout.getHeight();
                    }
                    int k1 = ((View) (obj)).getMeasuredHeight();
                    int l1 = getScrollRange(((View) (obj)));
                    if (j1 == -1)
                    {
                        i1 = 0x40000000;
                    } else
                    {
                        i1 = 0x80000000;
                    }
                    coordinatorlayout.onMeasureChild(view, i, j, android.view.View.MeasureSpec.makeMeasureSpec(l1 + (k - k1), i1), l);
                    return true;
                }
            }
        }
        return false;
    }
}
