// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class ap
{

    private final long Bv;
    private final long Bw;
    private String By;
    private final long arw;

    ap(long l, long l1, long l2)
    {
        Bv = l;
        Bw = l1;
        arw = l2;
    }

    void ak(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            By = s;
            return;
        }
    }

    long fb()
    {
        return Bv;
    }

    long pK()
    {
        return arw;
    }

    String pL()
    {
        return By;
    }
}
