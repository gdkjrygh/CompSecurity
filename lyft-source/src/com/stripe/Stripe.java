// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe;


public abstract class Stripe
{

    public static final String LIVE_API_BASE = "https://api.stripe.com";
    public static final String UPLOAD_API_BASE = "https://uploads.stripe.com";
    public static final String VERSION = "1.31.0";
    private static volatile String apiBase = "https://api.stripe.com";
    public static volatile String apiKey;
    public static volatile String apiVersion;

    public Stripe()
    {
    }

    public static String getApiBase()
    {
        return apiBase;
    }

    public static void overrideApiBase(String s)
    {
        apiBase = s;
    }

}
