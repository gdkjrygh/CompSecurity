// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


public interface AdMarvelAdapterListener
{

    public abstract void onClickAd(String s);

    public abstract void onClose();

    public abstract void onExpand();

    public abstract void onFailedToReceiveAd(int i, AdMarvelUtils.ErrorReason errorreason);

    public abstract void onReceiveAd();
}
