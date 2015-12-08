// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Random;

public class zzbf extends zzbl.zza
{

    private Object zznh;
    private final Random zzpl = new Random();
    private long zzpm;

    public zzbf()
    {
        zznh = new Object();
        zzbG();
    }

    public long getValue()
    {
        return zzpm;
    }

    public void zzbG()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        int i;
        long l;
        i = 3;
        l = 0L;
_L2:
        int j;
        j = i - 1;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        long l1 = (long)zzpl.nextInt() + 0x80000000L;
        l = l1;
        i = j;
        if (l1 == zzpm) goto _L2; else goto _L1
_L1:
        l = l1;
        i = j;
        if (l1 == 0L) goto _L2; else goto _L3
_L3:
        l = l1;
        zzpm = l;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
