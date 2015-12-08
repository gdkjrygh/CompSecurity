// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//            MessageThreadUtil

static class next
{

    private static sPool sPool;
    private static final Object sPoolLock = new Object();
    public int arg1;
    public int arg2;
    public int arg3;
    public int arg4;
    public int arg5;
    public Object data;
    private sPool next;
    public int what;

    static next obtainMessage(int i, int j, int k)
    {
        return obtainMessage(i, j, k, 0, 0, 0, null);
    }

    static obtainMessage obtainMessage(int i, int j, int k, int l, int i1, int j1, Object obj)
    {
        Object obj1 = sPoolLock;
        obj1;
        JVM INSTR monitorenter ;
        obtainMessage obtainmessage;
        if (sPool != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obtainmessage = new <init>();
_L1:
        obtainmessage.what = i;
        obtainmessage.arg1 = j;
        obtainmessage.arg2 = k;
        obtainmessage.arg3 = l;
        obtainmessage.arg4 = i1;
        obtainmessage.arg5 = j1;
        obtainmessage.data = obj;
        return obtainmessage;
        obtainmessage = sPool;
        sPool = sPool.next;
        obtainmessage.next = null;
          goto _L1
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    static next obtainMessage(int i, int j, Object obj)
    {
        return obtainMessage(i, j, 0, 0, 0, 0, obj);
    }

    void recycle()
    {
        next = null;
        arg5 = 0;
        arg4 = 0;
        arg3 = 0;
        arg2 = 0;
        arg1 = 0;
        what = 0;
        data = null;
        synchronized (sPoolLock)
        {
            if (sPool != null)
            {
                next = sPool;
            }
            sPool = this;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }




/*
    static  access$202( ,  1)
    {
        .next = 1;
        return 1;
    }

*/

    next()
    {
    }
}
