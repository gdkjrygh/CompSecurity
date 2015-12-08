// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;

public class zzab
{

    private final String zzEA;
    private String zzEB;
    private String zzEC;
    private String zzEx;
    private final long zzEy;
    private final long zzEz;

    public zzab(String s, long l, long l1, String s1)
    {
        zzEC = "https:";
        zzEx = s;
        zzEy = l;
        zzEz = l1;
        zzEA = s1;
    }

    public void zzap(String s)
    {
        zzEx = s;
    }

    public void zzaq(String s)
    {
        if (s != null && !TextUtils.isEmpty(s.trim()))
        {
            zzEB = s;
            if (s.toLowerCase().startsWith("http:"))
            {
                zzEC = "http:";
                return;
            }
        }
    }

    public String zzgr()
    {
        return zzEx;
    }

    public long zzgs()
    {
        return zzEy;
    }

    public long zzgt()
    {
        return zzEz;
    }

    public String zzgu()
    {
        return zzEC;
    }
}
