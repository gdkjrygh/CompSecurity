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
        if (CoordinatorLayout.access$100(a) != null)
        {
            CoordinatorLayout.access$100(a).onChildViewAdded(view, view1);
        }
    }

    public final void onChildViewRemoved(View view, View view1)
    {
        a.dispatchDependentViewRemoved(view1);
        if (CoordinatorLayout.access$100(a) != null)
        {
            CoordinatorLayout.access$100(a).onChildViewRemoved(view, view1);
        }
    }

    (CoordinatorLayout coordinatorlayout)
    {
        a = coordinatorlayout;
        super();
    }
}
