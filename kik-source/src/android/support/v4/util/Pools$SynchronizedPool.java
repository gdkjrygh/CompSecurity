// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            Pools

public static class  extends 
{

    private final Object mLock = new Object();

    public Object acquire()
    {
        Object obj1;
        synchronized (mLock)
        {
            obj1 = super.e();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean release(Object obj)
    {
        boolean flag;
        synchronized (mLock)
        {
            flag = super.e(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public (int i)
    {
        super(i);
    }
}
