// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import android.net.LocalServerSocket;
import java.io.IOException;

public class g
{

    private final String a;
    private LocalServerSocket b;

    public g(String s)
    {
        a = s;
    }

    public final void a()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        b = new LocalServerSocket(a);
        this;
        JVM INSTR monitorexit ;
        return;
        throw new IllegalStateException("tryLock but has locked");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(int i)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        i /= 100;
        i++;
_L5:
        int j = i - 1;
        if (i > 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        a();
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        obj;
        Thread.sleep(100L, 0);
        i = j;
        continue; /* Loop/switch isn't completed */
        obj;
        i = j;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        throw obj;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        LocalServerSocket localserversocket = b;
        if (localserversocket == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        Exception exception;
        try
        {
            b.close();
        }
        catch (IOException ioexception) { }
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }
}
