// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;

public final class z
{

    private String Bs;
    private final long Bt;
    private final long Bu;
    private final String Bv;
    private String Bw;
    private String Bx;

    public z(String s, long l, long l1, String s1)
    {
        Bx = "https:";
        Bs = s;
        Bt = l;
        Bu = l1;
        Bv = s1;
    }

    public final void ai(String s)
    {
        Bs = s;
    }

    public final void aj(String s)
    {
        if (s != null && !TextUtils.isEmpty(s.trim()))
        {
            Bw = s;
            if (s.toLowerCase().startsWith("http:"))
            {
                Bx = "http:";
                return;
            }
        }
    }

    public final String eV()
    {
        return Bs;
    }

    public final long eW()
    {
        return Bt;
    }

    public final long eX()
    {
        return Bu;
    }

    public final String eY()
    {
        return Bx;
    }
}
