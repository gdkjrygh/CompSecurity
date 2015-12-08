// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.mtp.MtpDevice;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ndl
{

    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(14344), Integer.valueOf(14337), Integer.valueOf(14347), Integer.valueOf(14343), Integer.valueOf(14340)
    })));
    private static Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(47492), Integer.valueOf(12298), Integer.valueOf(47490), Integer.valueOf(12299)
    })));
    private static final ndl h = new ndl(ndo.a());
    public MtpDevice b;
    long c;
    public volatile ndr d;
    private ndm f;
    private final ndp g;

    private ndl(ndp ndp)
    {
        g = ndp;
    }

    public static ndl a()
    {
        return h;
    }

    public static boolean a(int i)
    {
        return a.contains(Integer.valueOf(i)) || e.contains(Integer.valueOf(i));
    }

    private void g()
    {
        c = c + 1L;
        d = null;
    }

    public final void a(MtpDevice mtpdevice)
    {
        this;
        JVM INSTR monitorenter ;
        MtpDevice mtpdevice1 = b;
        if (mtpdevice != mtpdevice1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = mtpdevice;
        g();
        if (true) goto _L1; else goto _L3
_L3:
        mtpdevice;
        throw mtpdevice;
    }

    protected final void a(ndg ndg, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            f.a(ndg, i);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ndg;
        throw ndg;
    }

    public final void a(ndm ndm1)
    {
        this;
        JVM INSTR monitorenter ;
        f = ndm1;
        this;
        JVM INSTR monitorexit ;
        return;
        ndm1;
        throw ndm1;
    }

    protected final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        g();
        if (f != null)
        {
            f.h();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final boolean a(MtpDevice mtpdevice, long l)
    {
        return c == l && b == mtpdevice;
    }

    protected final boolean a(MtpDevice mtpdevice, long l, ndr ndr)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = a(mtpdevice, l);
        if (flag1) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        d = ndr;
        a(true);
        if (true) goto _L4; else goto _L3
_L3:
        mtpdevice;
        throw mtpdevice;
    }

    public final MtpDevice b()
    {
        this;
        JVM INSTR monitorenter ;
        MtpDevice mtpdevice = b;
        this;
        JVM INSTR monitorexit ;
        return mtpdevice;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(ndm ndm1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == ndm1)
        {
            f = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ndm1;
        throw ndm1;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        MtpDevice mtpdevice = b;
        boolean flag;
        if (mtpdevice != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final Runnable d()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c()) goto _L2; else goto _L1
_L1:
        Object obj = d;
        if (obj == null) goto _L3; else goto _L2
_L2:
        obj = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((Runnable) (obj));
_L3:
        obj = new ndo(this);
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        ndr ndr = d;
        boolean flag;
        if (ndr != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            f.g();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
