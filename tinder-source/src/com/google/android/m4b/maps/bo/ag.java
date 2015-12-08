// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.y.h;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            af, bd

public final class ag
{

    public final af a = new af();

    public ag()
    {
    }

    public final af a()
    {
        af af2;
        synchronized (a)
        {
            af2 = new af(a);
        }
        return af2;
        exception;
        af1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(bd bd1)
    {
        if (bd1 == null)
        {
            return false;
        }
        synchronized (a)
        {
            if (!h.a(a.a(bd1.a()), bd1))
            {
                break MISSING_BLOCK_LABEL_42;
            }
        }
        return false;
        bd1;
        af1;
        JVM INSTR monitorexit ;
        throw bd1;
        a.a(bd1);
        af1;
        JVM INSTR monitorexit ;
        return true;
    }

    public final long b()
    {
        long l;
        synchronized (a)
        {
            l = a.hashCode();
        }
        return l;
        exception;
        af1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
