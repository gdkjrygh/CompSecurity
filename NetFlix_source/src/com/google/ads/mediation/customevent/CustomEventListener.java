// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.customevent;


public interface CustomEventListener
{

    public abstract void onDismissScreen();

    public abstract void onFailedToReceiveAd();

    public abstract void onLeaveApplication();

    public abstract void onPresentScreen();
}
