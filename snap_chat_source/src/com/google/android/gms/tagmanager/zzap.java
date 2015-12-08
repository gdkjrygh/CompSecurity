// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzap
{

    private String zzEB;
    private final long zzEy;
    private final long zzEz;
    private final long zzayJ;

    zzap(long l, long l1, long l2)
    {
        zzEy = l;
        zzEz = l1;
        zzayJ = l2;
    }

    void zzaq(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            zzEB = s;
            return;
        }
    }

    long zzgs()
    {
        return zzEy;
    }

    long zztj()
    {
        return zzayJ;
    }

    String zztk()
    {
        return zzEB;
    }
}
