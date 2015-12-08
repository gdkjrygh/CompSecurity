// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.be.c;
import java.io.File;
import java.util.Locale;

public final class k
{

    com.google.android.m4b.maps.be.k a;
    c b;
    volatile boolean c;
    int d;
    final boolean e;
    Locale f;
    final String g;
    File h;

    public k(String s, com.google.android.m4b.maps.be.k k1, c c1, boolean flag, Locale locale, File file)
    {
        g = s;
        a = k1;
        b = c1;
        d = -1;
        e = flag;
        f = locale;
        h = file;
    }

    public final c a()
    {
        if (b == null || c) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            while (b != null && !c) 
            {
                wait();
            }
            break MISSING_BLOCK_LABEL_48;
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        Thread.currentThread().interrupt();
        this;
        JVM INSTR monitorexit ;
        return null;
        this;
        JVM INSTR monitorexit ;
_L2:
        return b;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final int b()
    {
        c c1 = a();
        if (c1 != null)
        {
            return c1.c();
        } else
        {
            return d;
        }
    }
}
