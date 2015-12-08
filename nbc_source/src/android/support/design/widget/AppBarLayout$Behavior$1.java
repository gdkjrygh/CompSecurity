// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            AppBarLayout, ValueAnimatorCompat, CoordinatorLayout

class val.child
    implements atorUpdateListener
{

    final nimatedIntValue this$0;
    final AppBarLayout val$child;
    final CoordinatorLayout val$coordinatorLayout;

    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
    {
        tAppBarTopBottomOffset(val$coordinatorLayout, val$child, valueanimatorcompat.getAnimatedIntValue());
    }

    atorUpdateListener()
    {
        this$0 = final_atorupdatelistener;
        val$coordinatorLayout = coordinatorlayout;
        val$child = AppBarLayout.this;
        super();
    }
}
