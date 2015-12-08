// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.current.CurrentConditionsResults;

public interface ICurrentConditionService
{

    public abstract CurrentConditionsResults retrieveCurrentConditions(String s, String s1, boolean flag)
        throws Exception;
}
