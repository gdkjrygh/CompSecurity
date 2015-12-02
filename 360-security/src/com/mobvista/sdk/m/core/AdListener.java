// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import com.mobvista.sdk.m.core.entity.Campaign;

public interface AdListener
{

    public abstract void onAdClick(Campaign campaign);

    public abstract void onAdLoadError(String s);

    public abstract void onAdLoaded(Campaign campaign);
}
