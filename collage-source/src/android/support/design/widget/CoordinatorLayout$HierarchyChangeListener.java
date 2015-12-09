// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

final class this._cls0
    implements android.view.hyChangeListener
{

    final CoordinatorLayout this$0;

    public void onChildViewAdded(View view, View view1)
    {
        if (CoordinatorLayout.access$100(CoordinatorLayout.this) != null)
        {
            CoordinatorLayout.access$100(CoordinatorLayout.this).dViewAdded(view, view1);
        }
    }

    public void onChildViewRemoved(View view, View view1)
    {
        dispatchDependentViewRemoved(view1);
        if (CoordinatorLayout.access$100(CoordinatorLayout.this) != null)
        {
            CoordinatorLayout.access$100(CoordinatorLayout.this).dViewRemoved(view, view1);
        }
    }

    ()
    {
        this$0 = CoordinatorLayout.this;
        super();
    }
}
