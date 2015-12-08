// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class ap
{

    private final long afF;
    private String afG;
    private final long ww;
    private final long wx;

    ap(long l, long l1, long l2)
    {
        ww = l;
        wx = l1;
        afF = l2;
    }

    void R(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            afG = s;
            return;
        }
    }

    long dl()
    {
        return ww;
    }

    long lN()
    {
        return afF;
    }

    String lO()
    {
        return afG;
    }
}
