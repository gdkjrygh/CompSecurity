// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;

import com.ford.syncV4.util.c;
import java.io.IOException;
import java.io.OutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

// Referenced classes of package com.ford.syncV4.i:
//            h

final class k extends Thread
{

    short a;
    private Boolean b;

    private k()
    {
        b = Boolean.valueOf(false);
    }

    k(byte byte0)
    {
        this();
    }

    private boolean a()
    {
        Object obj = Boolean.valueOf(false);
        a = 7474;
        do
        {
            if (!((Boolean) (obj)).booleanValue())
            {
                try
                {
                    h.a(new ServerSocket(a));
                }
                catch (BindException bindexception)
                {
                    a = (short)(a + 1);
                    if (a > h.b().intValue() + 7474)
                    {
                        return false;
                    }
                    continue;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return false;
                }
                obj = Boolean.valueOf(true);
                continue;
            }
            return ((Boolean) (obj)).booleanValue();
        } while (true);
    }

    public final void run()
    {
        if (!a())
        {
            break MISSING_BLOCK_LABEL_134;
        }
_L1:
        Socket socket;
        do
        {
            if (b.booleanValue())
            {
                break MISSING_BLOCK_LABEL_134;
            }
            socket = com.ford.syncV4.i.h.c().accept();
        } while (b.booleanValue());
        Object obj = h.d();
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = h.e();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Exception exception2;
        try
        {
            h.e().close();
        }
        catch (IOException ioexception4) { }
        h.a(null);
        obj1 = h.f();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        try
        {
            h.f().close();
        }
        catch (IOException ioexception3) { }
        h.a(null);
        h.a(socket);
        h.f().setKeepAlive(true);
        h.a(h.f().getOutputStream());
        c.c("Siphon connected.");
        obj;
        JVM INSTR monitorexit ;
          goto _L1
        exception2;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception2;
        }
        catch (Exception exception) { }
        finally
        {
            if (com.ford.syncV4.i.h.c() == null) goto _L0; else goto _L0
        }
        if (com.ford.syncV4.i.h.c() != null)
        {
            Exception exception1;
            IOException ioexception2;
            try
            {
                com.ford.syncV4.i.h.c().close();
            }
            catch (IOException ioexception) { }
            h.a(null);
        }
        return;
        if (com.ford.syncV4.i.h.c() != null)
        {
            try
            {
                com.ford.syncV4.i.h.c().close();
            }
            catch (IOException ioexception1) { }
            h.a(null);
            return;
        } else
        {
            break MISSING_BLOCK_LABEL_133;
        }
    }
}
