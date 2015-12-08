// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;

class x
{

    private String ws;
    private final long wt;
    private final long wu;
    private String wv;

    x(String s, long l, long l1)
    {
        wv = "https:";
        ws = s;
        wt = l;
        wu = l1;
    }

    void Q(String s)
    {
        ws = s;
    }

    void R(String s)
    {
        while (s == null || TextUtils.isEmpty(s.trim()) || !s.toLowerCase().startsWith("http:")) 
        {
            return;
        }
        wv = "http:";
    }

    String df()
    {
        return ws;
    }

    long dg()
    {
        return wt;
    }

    long dh()
    {
        return wu;
    }

    String di()
    {
        return wv;
    }
}
