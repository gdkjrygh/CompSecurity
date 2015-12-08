// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

public final class bm
{

    private String oU;
    private String oV;
    private String oW;

    public bm()
    {
        oU = null;
        oV = null;
        oW = null;
        oU = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html";
        oV = null;
        oW = null;
    }

    public bm(String s, String s1, String s2)
    {
        oU = null;
        oV = null;
        oW = null;
        if (TextUtils.isEmpty(s))
        {
            oU = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html";
        } else
        {
            oU = s;
        }
        oV = s1;
        oW = s2;
    }

    public String bp()
    {
        return oU;
    }

    public String bq()
    {
        return oV;
    }

    public String br()
    {
        return oW;
    }
}
