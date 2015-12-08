// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oic extends oib
{

    private final Object c = new Object();

    public oic(int i)
    {
        super(64);
    }

    public final Object a()
    {
        Object obj1;
        synchronized (c)
        {
            obj1 = super.a();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(Object obj)
    {
        boolean flag;
        synchronized (c)
        {
            flag = super.a(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
