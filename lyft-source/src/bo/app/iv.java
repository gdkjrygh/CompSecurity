// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            jt, iw, kz, iy, 
//            jl

public class iv
{

    public static final String a = bo/app/iv.getSimpleName();
    private static volatile iv e;
    public iw b;
    public iy c;
    public final jl d = new jt();

    protected iv()
    {
    }

    public static iv a()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        bo/app/iv;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new iv();
        }
        bo/app/iv;
        JVM INSTR monitorexit ;
_L2:
        return e;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(iw iw1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        if (iw1.u)
        {
            kz.a("Initialize ImageLoader with configuration", new Object[0]);
        }
        c = new iy(iw1);
        b = iw1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        kz.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
        iw1;
        throw iw1;
    }

}
