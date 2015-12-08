// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;


// Referenced classes of package me.lyft.android.ui.landing:
//            LandingScreens

public class isLoadingAnimationEnabled extends LandingScreens
{

    private boolean isLoadingAnimationEnabled;

    public isLoadingAnimationEnabled enableLoadingAnimation()
    {
        isLoadingAnimationEnabled = true;
        return this;
    }

    public boolean isLoadingAnimationEnabled()
    {
        return isLoadingAnimationEnabled;
    }

    public ()
    {
        isLoadingAnimationEnabled = false;
    }
}
