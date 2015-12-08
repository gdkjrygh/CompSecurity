// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class ap
{

    private final long afC;
    private String afD;
    private final long wt;
    private final long wu;

    ap(long l, long l1, long l2)
    {
        wt = l;
        wu = l1;
        afC = l2;
    }

    void R(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            afD = s;
            return;
        }
    }

    long dg()
    {
        return wt;
    }

    long lI()
    {
        return afC;
    }

    String lJ()
    {
        return afD;
    }
}
