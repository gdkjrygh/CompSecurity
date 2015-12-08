// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.daily.ForecastResult;

public interface IForecastService
{

    public abstract boolean isPaid();

    public abstract ForecastResult retrieveForecast(String s, String s1, boolean flag)
        throws Exception;

    public abstract void setPaid(boolean flag);
}
