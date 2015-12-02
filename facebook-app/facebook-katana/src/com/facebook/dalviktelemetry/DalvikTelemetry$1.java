// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalviktelemetry;


class 
{

    static final int a[];

    static 
    {
        a = new int[com.facebook.dalvik.r.Result.values().length];
        try
        {
            a[com.facebook.dalvik.r.Result.FAILURE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.facebook.dalvik.r.Result.NOT_ATTEMPTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.facebook.dalvik.r.Result.SUCCESS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
