// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.transport.SiphonServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public final class axn extends Thread
{

    private Boolean a;
    private short b;

    private axn()
    {
        a = Boolean.valueOf(false);
    }

    public axn(byte byte0)
    {
        this();
    }

    private boolean a()
    {
        Object obj = Boolean.valueOf(false);
        b = 7474;
        do
        {
            if (!((Boolean) (obj)).booleanValue())
            {
                try
                {
                    SiphonServer.a(new ServerSocket(b));
                }
                catch (BindException bindexception)
                {
                    b = (short)(b + 1);
                    if (b > SiphonServer.b().intValue() + 7474)
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
            if (a.booleanValue())
            {
                break MISSING_BLOCK_LABEL_134;
            }
            socket = SiphonServer.c().accept();
        } while (a.booleanValue());
        Object obj = SiphonServer.d();
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = SiphonServer.e();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Exception exception2;
        try
        {
            SiphonServer.e().close();
        }
        catch (IOException ioexception4) { }
        SiphonServer.a(null);
        obj1 = SiphonServer.f();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        try
        {
            SiphonServer.f().close();
        }
        catch (IOException ioexception3) { }
        SiphonServer.a(null);
        SiphonServer.a(socket);
        SiphonServer.f().setKeepAlive(true);
        SiphonServer.a(SiphonServer.f().getOutputStream());
        axt.c("Siphon connected.");
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
            if (SiphonServer.c() == null) goto _L0; else goto _L0
        }
        if (SiphonServer.c() != null)
        {
            Exception exception1;
            IOException ioexception2;
            try
            {
                SiphonServer.c().close();
            }
            catch (IOException ioexception) { }
            SiphonServer.a(null);
        }
        return;
        if (SiphonServer.c() != null)
        {
            try
            {
                SiphonServer.c().close();
            }
            catch (IOException ioexception1) { }
            SiphonServer.a(null);
            return;
        } else
        {
            break MISSING_BLOCK_LABEL_133;
        }
    }
}
