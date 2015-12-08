// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;

public class zzve
{

    private final Integer zzaBM;
    private final String zzaBN;
    private final boolean zzaBO;
    private final String zzaxw;
    private final String zzazP;

    public zzve(String s, Integer integer, String s1, boolean flag)
    {
        this(s, integer, s1, flag, "");
    }

    public zzve(String s, Integer integer, String s1, boolean flag, String s2)
    {
        zzx.zzl(s);
        zzx.zzl(s2);
        zzaxw = s;
        zzaBM = integer;
        zzaBN = s1;
        zzaBO = flag;
        zzazP = s2;
    }

    public String getContainerId()
    {
        return zzaxw;
    }

    public Integer zzuh()
    {
        return zzaBM;
    }

    public String zzui()
    {
        return zzaBN;
    }

    public String zzuj()
    {
        if (zzaBN != null)
        {
            return (new StringBuilder()).append(zzaBN).append("_").append(zzaxw).toString();
        } else
        {
            return zzaxw;
        }
    }

    public boolean zzuk()
    {
        return zzaBO;
    }

    public String zzul()
    {
        return zzazP;
    }
}
