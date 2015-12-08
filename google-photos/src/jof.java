// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jof
{

    private static final Object a;
    private static jof b;
    private final jpx c = new jpx();

    protected jof()
    {
        new joc();
        new jog();
        new jnz();
        new ktt();
        new jps();
    }

    public static jpx a()
    {
        return b().c;
    }

    private static jof b()
    {
        jof jof1;
        synchronized (a)
        {
            jof1 = b;
        }
        return jof1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        jof jof1 = new jof();
        synchronized (a)
        {
            b = jof1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
