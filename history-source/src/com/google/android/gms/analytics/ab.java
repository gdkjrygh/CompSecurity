// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;

public class ab
{

    private String Bu;
    private final long Bv;
    private final long Bw;
    private final String Bx;
    private String By;
    private String Bz;

    public ab(String s, long l, long l1, String s1)
    {
        Bz = "https:";
        Bu = s;
        Bv = l;
        Bw = l1;
        Bx = s1;
    }

    public void aj(String s)
    {
        Bu = s;
    }

    public void ak(String s)
    {
        if (s != null && !TextUtils.isEmpty(s.trim()))
        {
            By = s;
            if (s.toLowerCase().startsWith("http:"))
            {
                Bz = "http:";
                return;
            }
        }
    }

    public String fa()
    {
        return Bu;
    }

    public long fb()
    {
        return Bv;
    }

    public long fc()
    {
        return Bw;
    }

    public String fd()
    {
        return Bz;
    }
}
