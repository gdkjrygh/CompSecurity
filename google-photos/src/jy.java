// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jy extends jx
{

    private final Object a = new Object();

    public jy(int i)
    {
        super(i);
    }

    public final Object a()
    {
        Object obj1;
        synchronized (a)
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
        synchronized (a)
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
