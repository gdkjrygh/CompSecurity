// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            jn, iq, kt, is, 
//            jf

public class ip
{

    public static final String a = bo/app/ip.getSimpleName();
    private static volatile ip e;
    public iq b;
    public is c;
    public final jf d = new jn();

    protected ip()
    {
    }

    public static ip a()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        bo/app/ip;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new ip();
        }
        bo/app/ip;
        JVM INSTR monitorexit ;
_L2:
        return e;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(iq iq1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        if (iq1.u)
        {
            kt.a("Initialize ImageLoader with configuration", new Object[0]);
        }
        c = new is(iq1);
        b = iq1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        kt.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
        iq1;
        throw iq1;
    }

}
