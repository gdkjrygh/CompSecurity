// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;

class x
{

    private String wv;
    private final long ww;
    private final long wx;
    private String wy;

    x(String s, long l, long l1)
    {
        wy = "https:";
        wv = s;
        ww = l;
        wx = l1;
    }

    void Q(String s)
    {
        wv = s;
    }

    void R(String s)
    {
        while (s == null || TextUtils.isEmpty(s.trim()) || !s.toLowerCase().startsWith("http:")) 
        {
            return;
        }
        wy = "http:";
    }

    String dk()
    {
        return wv;
    }

    long dl()
    {
        return ww;
    }

    long dm()
    {
        return wx;
    }

    String dn()
    {
        return wy;
    }
}
