// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;


// Referenced classes of package com.google.android.play.onboard:
//            OnboardHostControl, OnboardNavFooterButtonInfo

public interface OnboardPageInfo
{

    public abstract boolean allowSwipeToNext$5669347f();

    public abstract boolean allowSwipeToPrevious$5669347f();

    public abstract OnboardNavFooterButtonInfo getEndButtonInfo(OnboardHostControl onboardhostcontrol);

    public abstract int getGroupPageCount$5669346e();

    public abstract int getGroupPageIndex$5669346e();

    public abstract OnboardNavFooterButtonInfo getStartButtonInfo(OnboardHostControl onboardhostcontrol);

    public abstract boolean isNavFooterVisible$5669347f();

    public abstract boolean shouldAdjustPagePaddingToFitNavFooter$5669347f();
}
