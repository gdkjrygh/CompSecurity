// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.internal.util.s;

public class AdError
{

    public static final AdError INTERNAL_ERROR = new AdError(2001, "Internal Error");
    public static final int INTERNAL_ERROR_CODE = 2001;
    public static final AdError LOAD_TOO_FREQUENTLY = new AdError(1002, "Ad was re-loaded too frequently");
    public static final int LOAD_TOO_FREQUENTLY_ERROR_CODE = 1002;
    public static final AdError MISSING_PROPERTIES = new AdError(2002, "Native ad failed to load due to missing properties");
    public static final AdError NETWORK_ERROR = new AdError(1000, "Network Error");
    public static final int NETWORK_ERROR_CODE = 1000;
    public static final AdError NO_FILL = new AdError(1001, "No Fill");
    public static final int NO_FILL_ERROR_CODE = 1001;
    public static final AdError SERVER_ERROR = new AdError(2000, "Server Error");
    public static final int SERVER_ERROR_CODE = 2000;
    private final int a;
    private final String b;

    public AdError(int i, String s1)
    {
        String s2 = s1;
        if (s.a(s1))
        {
            s2 = "unknown error";
        }
        a = i;
        b = s2;
    }

    public int getErrorCode()
    {
        return a;
    }

    public String getErrorMessage()
    {
        return b;
    }

}
