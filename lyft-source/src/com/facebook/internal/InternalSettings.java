// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


public class InternalSettings
{

    private static volatile String mCustomUserAgent;

    public InternalSettings()
    {
    }

    public static String getCustomUserAgent()
    {
        return mCustomUserAgent;
    }

    public static void setCustomUserAgent(String s)
    {
        mCustomUserAgent = s;
    }
}
