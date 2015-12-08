// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;


// Referenced classes of package com.google.android.play.onboard:
//            OnboardPageInfo, OnboardHostControl

public interface OnboardPage
{

    public static final int DK_PAGE_ID = 0x7f0d0055;
    public static final int DK_PAGE_INFO = 0x7f0d0056;

    public abstract OnboardPageInfo getPageInfo();

    public abstract void setOnboardHostControl(OnboardHostControl onboardhostcontrol);

}
