// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;

import android.net.LocalServerSocket;
import java.io.IOException;

public class e
{

    private final String a;
    private LocalServerSocket b;

    public e(String s)
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
        long l = System.currentTimeMillis();
        long l1 = i;
_L5:
        long l2 = System.currentTimeMillis();
        if (l2 <= l + l1) goto _L2; else goto _L1
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
        try
        {
            Thread.sleep(10L, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            this;
        }
        if (true) goto _L5; else goto _L4
_L4:
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        LocalServerSocket localserversocket = b;
        Exception exception;
        if (localserversocket != null)
        {
            try
            {
                b.close();
            }
            catch (IOException ioexception) { }
            finally
            {
                this;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        throw exception;
    }
}
