// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core.internal.models;


public class SignalData
{

    public final String code;
    public final long faultAddress;
    public final String name;

    public SignalData(String s, String s1, long l)
    {
        name = s;
        code = s1;
        faultAddress = l;
    }
}
