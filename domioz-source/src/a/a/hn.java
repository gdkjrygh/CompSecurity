// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            il, ho, js, hq, 
//            ie

public class hn
{

    public static final String a = a/a/hn.getSimpleName();
    private static volatile hn e;
    public ho b;
    public hq c;
    public final ie d = new il();

    protected hn()
    {
    }

    public static hn a()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        a/a/hn;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new hn();
        }
        a/a/hn;
        JVM INSTR monitorexit ;
_L2:
        return e;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ho ho1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        if (ho1.u)
        {
            js.a("Initialize ImageLoader with configuration", new Object[0]);
        }
        c = new hq(ho1);
        b = ho1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        js.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
        ho1;
        throw ho1;
    }

}
