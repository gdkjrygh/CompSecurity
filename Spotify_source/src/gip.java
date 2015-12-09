// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public final class gip
{

    private static final Set b = new HashSet(64);
    public final String a;

    private gip(String s)
    {
        a = s;
    }

    public static gip a(String s)
    {
        gip;
        JVM INSTR monitorenter ;
        ctz.a(s);
        if (b.contains(s))
        {
            throw new AssertionError((new StringBuilder("Requesting same string for a key previously defined somewhere else: ")).append(s).toString());
        }
        break MISSING_BLOCK_LABEL_50;
        s;
        gip;
        JVM INSTR monitorexit ;
        throw s;
        b.add(s);
        s = new gip(s);
        gip;
        JVM INSTR monitorexit ;
        return s;
    }

    public static gip b(String s)
    {
        gip;
        JVM INSTR monitorenter ;
        ctz.a(s);
        if (b.contains(s))
        {
            throw new AssertionError((new StringBuilder("Requesting same string for a key previously defined somewhere else: ")).append(s).toString());
        }
        break MISSING_BLOCK_LABEL_50;
        s;
        gip;
        JVM INSTR monitorexit ;
        throw s;
        b.add(s);
        s = new gip(s);
        gip;
        JVM INSTR monitorexit ;
        return s;
    }

    public static gip c(String s)
    {
        gip;
        JVM INSTR monitorenter ;
        ctz.a(s);
        s = new gip(s);
        gip;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static gip d(String s)
    {
        gip;
        JVM INSTR monitorenter ;
        ctz.a(s);
        s = new gip(s);
        gip;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

}
