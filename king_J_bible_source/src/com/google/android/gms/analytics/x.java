// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;

class x
{

    private String vh;
    private final long vi;
    private final long vj;
    private String vk;

    x(String s, long l, long l1)
    {
        vk = "https:";
        vh = s;
        vi = l;
        vj = l1;
    }

    void J(String s)
    {
        vh = s;
    }

    void K(String s)
    {
        while (s == null || TextUtils.isEmpty(s.trim()) || !s.toLowerCase().startsWith("http:")) 
        {
            return;
        }
        vk = "http:";
    }

    String cO()
    {
        return vh;
    }

    long cP()
    {
        return vi;
    }

    long cQ()
    {
        return vj;
    }

    String cR()
    {
        return vk;
    }
}
