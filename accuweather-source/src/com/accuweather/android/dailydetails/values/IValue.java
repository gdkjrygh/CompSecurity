// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dailydetails.values;

import android.content.Context;

public interface IValue
{

    public abstract String getNonConvertedValue(Object obj);

    public abstract String getValue(Object obj, Integer integer, Context context);
}
