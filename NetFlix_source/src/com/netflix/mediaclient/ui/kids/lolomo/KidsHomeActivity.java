// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import com.netflix.mediaclient.ui.home.HomeActivity;

public class KidsHomeActivity extends HomeActivity
{

    public KidsHomeActivity()
    {
    }

    public boolean isForKids()
    {
        return true;
    }

    public boolean shouldApplyPaddingToSlidingPanel()
    {
        return true;
    }
}
