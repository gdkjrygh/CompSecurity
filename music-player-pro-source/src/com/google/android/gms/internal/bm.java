// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

public final class bm
{

    private String pd;
    private String pe;
    private String pf;
    private String pg;

    public bm()
    {
        pd = null;
        pe = null;
        pf = null;
        pg = null;
        pd = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html";
        pe = null;
        pf = null;
        pg = null;
    }

    public bm(String s, String s1, String s2, String s3)
    {
        pd = null;
        pe = null;
        pf = null;
        pg = null;
        if (TextUtils.isEmpty(s))
        {
            pd = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html";
        } else
        {
            pd = s;
        }
        pe = s1;
        pf = s2;
        pg = s3;
    }

    public String bu()
    {
        return pd;
    }

    public String bv()
    {
        return pe;
    }

    public String bw()
    {
        return pf;
    }

    public String bx()
    {
        return pg;
    }
}
