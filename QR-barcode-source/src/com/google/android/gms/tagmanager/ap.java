// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class ap
{

    private final long AF;
    private final long AG;
    private final long apm;
    private String apn;

    ap(long l, long l1, long l2)
    {
        AF = l;
        AG = l1;
        apm = l2;
    }

    void ak(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            apn = s;
            return;
        }
    }

    long eG()
    {
        return AF;
    }

    long ot()
    {
        return apm;
    }

    String ou()
    {
        return apn;
    }
}
