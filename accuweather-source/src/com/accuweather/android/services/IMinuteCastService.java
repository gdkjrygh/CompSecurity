// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.minutecast.MinuteCastResult;

public interface IMinuteCastService
{

    public abstract MinuteCastResult retrieveMinuteCastResult(Double double1, Double double2, String s, boolean flag, boolean flag1)
        throws Exception;
}
