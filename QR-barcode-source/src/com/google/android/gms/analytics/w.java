// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;

class w
{

    private String AE;
    private final long AF;
    private final long AG;
    private String AH;

    w(String s, long l, long l1)
    {
        AH = "https:";
        AE = s;
        AF = l;
        AG = l1;
    }

    void aj(String s)
    {
        AE = s;
    }

    void ak(String s)
    {
        while (s == null || TextUtils.isEmpty(s.trim()) || !s.toLowerCase().startsWith("http:")) 
        {
            return;
        }
        AH = "http:";
    }

    String eF()
    {
        return AE;
    }

    long eG()
    {
        return AF;
    }

    long eH()
    {
        return AG;
    }

    String eI()
    {
        return AH;
    }
}
