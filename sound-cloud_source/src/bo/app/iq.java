// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            jo, ir, ku, it, 
//            jg

public class iq
{

    public static final String a = bo/app/iq.getSimpleName();
    private static volatile iq e;
    public ir b;
    public it c;
    public final jg d = new jo();

    protected iq()
    {
    }

    public static iq a()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        bo/app/iq;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new iq();
        }
        bo/app/iq;
        JVM INSTR monitorexit ;
_L2:
        return e;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ir ir1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        if (ir1.u)
        {
            ku.a("Initialize ImageLoader with configuration", new Object[0]);
        }
        c = new it(ir1);
        b = ir1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ku.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
        ir1;
        throw ir1;
    }

}
