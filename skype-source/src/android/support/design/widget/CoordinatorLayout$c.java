// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

final class a
    implements android.view.yChangeListener
{

    final CoordinatorLayout a;

    public final void onChildViewAdded(View view, View view1)
    {
        if (CoordinatorLayout.a(a) != null)
        {
            CoordinatorLayout.a(a).onChildViewAdded(view, view1);
        }
    }

    public final void onChildViewRemoved(View view, View view1)
    {
        CoordinatorLayout coordinatorlayout = a;
        int j = coordinatorlayout.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view2 = coordinatorlayout.getChildAt(i);
            nChildViewAdded nchildviewadded = ((tChildAt)view2.getLayoutParams()).a;
            if (nchildviewadded != null && nchildviewadded.a(view1))
            {
                nchildviewadded.a(view2, view1);
            }
        }

        if (CoordinatorLayout.a(a) != null)
        {
            CoordinatorLayout.a(a).onChildViewRemoved(view, view1);
        }
    }

    (CoordinatorLayout coordinatorlayout)
    {
        a = coordinatorlayout;
        super();
    }
}
