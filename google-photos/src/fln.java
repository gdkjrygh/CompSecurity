// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fln
    implements fli
{

    static final mjw a;
    private static mjw b;
    private static mjw c;
    private static final mjw d;
    private static final ayt e;
    private final Context f;
    private final flk g;
    private ayt h;
    private ayt i;
    private ayt j;
    private ayt k;
    private ayt l;
    private ayt m;
    private ayt n;
    private ayt o;
    private ayt p;

    fln(Context context, flk flk1)
    {
        f = context;
        g = flk1;
    }

    private ayt i()
    {
        if (k == null)
        {
            k = (ayt)((ayt)e.b()).c();
        }
        return k;
    }

    private ayt j()
    {
        if (n == null)
        {
            n = (ayt)((ayt)((ayt)i().a(f)).a(apa.a)).c();
        }
        return n;
    }

    public final anf a()
    {
        return flx.a;
    }

    public final ayt b()
    {
        this;
        JVM INSTR monitorenter ;
        ayt ayt1;
        if (i == null)
        {
            i = (ayt)((ayt)((ayt)e.a(flx.a, b)).b()).c();
        }
        ayt1 = i;
        this;
        JVM INSTR monitorexit ;
        return ayt1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ayt c()
    {
        this;
        JVM INSTR monitorenter ;
        ayt ayt1;
        if (h == null)
        {
            h = (ayt)((ayt)e.a(flx.a, a)).c();
        }
        ayt1 = h;
        this;
        JVM INSTR monitorexit ;
        return ayt1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ayt d()
    {
        this;
        JVM INSTR monitorenter ;
        ayt ayt1;
        if (j == null)
        {
            j = (ayt)((ayt)((ayt)((ayt)i().b(f)).a(flx.a, b)).a(g.c(), g.c())).c();
        }
        ayt1 = j;
        this;
        JVM INSTR monitorexit ;
        return ayt1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ayt e()
    {
        this;
        JVM INSTR monitorenter ;
        ayt ayt1;
        if (l == null)
        {
            l = (ayt)((ayt)((ayt)((ayt)i().b(f)).a(flx.a, d)).a(g.b(), g.b())).c();
        }
        ayt1 = l;
        this;
        JVM INSTR monitorexit ;
        return ayt1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ayt f()
    {
        this;
        JVM INSTR monitorenter ;
        ayt ayt1;
        if (o == null)
        {
            o = (ayt)((ayt)((ayt)j().a(flx.a, d)).a(g.b(), g.b())).c();
        }
        ayt1 = o;
        this;
        JVM INSTR monitorexit ;
        return ayt1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ayt g()
    {
        this;
        JVM INSTR monitorenter ;
        ayt ayt1;
        if (m == null)
        {
            m = (ayt)((ayt)((ayt)j().a(flx.a, d)).a(g.a(), g.a())).c();
        }
        ayt1 = m;
        this;
        JVM INSTR monitorexit ;
        return ayt1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ayt h()
    {
        this;
        JVM INSTR monitorenter ;
        ayt ayt1;
        if (p == null)
        {
            p = (ayt)((ayt)(new ayt()).a(flx.a, c)).c();
        }
        ayt1 = p;
        this;
        JVM INSTR monitorexit ;
        return ayt1;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        mjw mjw1 = (new mjw()).a();
        mjw1.a(4);
        a = mjw1;
        mjw1 = new mjw(a);
        mjw1.a(16);
        b = mjw1;
        mjw1 = new mjw();
        if ((mjw1.a & 0x2000) != 0)
        {
            throw new IllegalStateException("Cannot set both app and sync domains");
        } else
        {
            mjw1.a = mjw1.a | 0x80;
            mjw1.a(4);
            c = mjw1;
            d = (new mjw(b)).c();
            e = (ayt)((ayt)(new ayt()).a(awd.a, Long.valueOf(0L))).c();
        }
    }
}
