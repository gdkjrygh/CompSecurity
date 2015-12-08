// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


final class kc
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.google.ads.AdRequest.ErrorCode.values().length];
        try
        {
            b[com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[com.google.ads.AdRequest.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.google.ads.AdRequest.ErrorCode.NO_FILL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[com.google.ads.AdRequest.Gender.values().length];
        try
        {
            a[com.google.ads.AdRequest.Gender.FEMALE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.ads.AdRequest.Gender.MALE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.ads.AdRequest.Gender.UNKNOWN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
