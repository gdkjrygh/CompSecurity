// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.SortedSet;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.analytics:
//            bc

final class bb
{

    private static final bb d = new bb();
    private SortedSet a;
    private StringBuilder b;
    private boolean c;

    private bb()
    {
        a = new TreeSet();
        b = new StringBuilder();
        c = false;
    }

    public static bb a()
    {
        return d;
    }

    public final void a(bc bc1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            a.add(bc1);
            b.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(bc1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        bc1;
        throw bc1;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        c = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
