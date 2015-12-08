// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.view.View;

interface IAmobee
{

    public abstract void adFailed();

    public abstract void adRecieved();

    public abstract void getAd();

    public abstract View getAdView();

    public abstract void onError();

    public abstract void onLeavingApplication();

    public abstract void onOverlay();

    public abstract void onOverlayDismissed();
}
