// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.quarter.QuarterResults;

public interface IQuartersService
{

    public abstract QuarterResults retrieveQuarters(String s, boolean flag)
        throws Exception;
}
