// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.agg;


public abstract class PeopleAggregator
{

    static volatile boolean sUseContactablesApi = true;

    public static void setUseContactablesApi(boolean flag)
    {
        sUseContactablesApi = flag;
    }

}
