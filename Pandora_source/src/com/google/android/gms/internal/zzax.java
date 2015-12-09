// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zzax
{

    private final long zzsl;
    private final String zzsm;
    private final zzax zzsn;

    public zzax(long l, String s, zzax zzax1)
    {
        zzsl = l;
        zzsm = s;
        zzsn = zzax1;
    }

    long getTime()
    {
        return zzsl;
    }

    String zzcr()
    {
        return zzsm;
    }

    zzax zzcs()
    {
        return zzsn;
    }
}
