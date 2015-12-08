// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import java.util.TreeSet;

// Referenced classes of package kik.android.i:
//            b, a

final class c
    implements Runnable
{

    final int a;
    final a b;
    final b c;

    c(b b1, int i, a a1)
    {
        c = b1;
        a = i;
        b = a1;
        super();
    }

    public final void run()
    {
        while (kik.android.i.b.b(c).contains(Integer.valueOf(kik.android.i.b.a(c))) && kik.android.i.b.a(c) > a || !kik.android.i.b.b(c).contains(Integer.valueOf(a))) 
        {
            return;
        }
        b.a(a);
        this;
        JVM INSTR monitorenter ;
        kik.android.i.b.a(c, a);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
