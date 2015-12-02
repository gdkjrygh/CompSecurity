// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import com.mobvista.sdk.m.core.entity.Campaign;

public interface AdTrackingListener
{

    public abstract void onDownloadError(String s);

    public abstract void onDownloadFinish(Campaign campaign);

    public abstract void onDownloadProgress(Campaign campaign, int i);

    public abstract void onDownloadStart(Campaign campaign);

    public abstract void onFinishRedirection(Campaign campaign, String s);

    public abstract void onRedirectionFailed(Campaign campaign, String s);

    public abstract void onStartRedirection(Campaign campaign, String s);
}
