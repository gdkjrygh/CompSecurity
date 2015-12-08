// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.IInterface;

public interface zzo
    extends IInterface
{

    public abstract void onAdClosed();

    public abstract void onAdFailedToLoad(int i);

    public abstract void onAdLeftApplication();

    public abstract void onAdLoaded();

    public abstract void onAdOpened();
}
