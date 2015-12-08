// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.activity;


public interface IDownloadReceiver
{

    public abstract void onDownloadFailed();

    public abstract void onGiveUsAMoment(int i);

    public abstract void onLoadingWeatherData(int i);

    public abstract void onOptimizingForDevice(int i);

    public abstract void onProgressComplete();
}
