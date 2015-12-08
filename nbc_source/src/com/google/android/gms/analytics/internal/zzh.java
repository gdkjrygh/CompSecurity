// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzh
{

    private final long zzJS;
    private final String zzJT;
    private final boolean zzJU;
    private long zzJV;
    private final String zzJd;
    private final Map zzyn;

    public zzh(long l, String s, String s1, boolean flag, long l1, 
            Map map)
    {
        zzu.zzcj(s);
        zzu.zzcj(s1);
        zzJS = l;
        zzJd = s;
        zzJT = s1;
        zzJU = flag;
        zzJV = l1;
        if (map != null)
        {
            zzyn = new HashMap(map);
            return;
        } else
        {
            zzyn = Collections.emptyMap();
            return;
        }
    }

    public String getClientId()
    {
        return zzJd;
    }

    public long zzii()
    {
        return zzJS;
    }

    public String zzij()
    {
        return zzJT;
    }

    public boolean zzik()
    {
        return zzJU;
    }

    public long zzil()
    {
        return zzJV;
    }

    public Map zzn()
    {
        return zzyn;
    }

    public void zzn(long l)
    {
        zzJV = l;
    }
}
