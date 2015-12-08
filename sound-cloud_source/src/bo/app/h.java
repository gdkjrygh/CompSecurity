// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.a.b;

// Referenced classes of package bo.app:
//            bz, cs

public final class h
{

    public String a;
    private final bz b;
    private final b c;
    private String d;
    private String e;

    public h(b b1, bz bz1)
    {
        c = b1;
        b = bz1;
    }

    public final String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (d == null)
        {
            d = b.d();
        }
        s = d;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public final String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (e == null)
        {
            e = c.b().toString();
        }
        s = e;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
