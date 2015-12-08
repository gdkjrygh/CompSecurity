// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.net;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;

// Referenced classes of package fs.ch.qos.logback.core.net:
//            SocketAppenderBase

class interrupted extends Thread
{

    boolean interrupted;
    final SocketAppenderBase this$0;

    public void run()
    {
_L2:
        if (interrupted)
        {
            break; /* Loop/switch isn't completed */
        }
        sleep(reconnectionDelay);
        addInfo((new StringBuilder()).append("Attempting connection to ").append(address.getHostName()).toString());
        Socket socket = new Socket(address, port);
        this;
        JVM INSTR monitorenter ;
        oos = new ObjectOutputStream(socket.getOutputStream());
        SocketAppenderBase.access$002(SocketAppenderBase.this, null);
        addInfo("Connection established. Exiting connector thread.");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (InterruptedException interruptedexception)
        {
            addInfo("Connector interrupted. Leaving loop.");
            return;
        }
        catch (ConnectException connectexception)
        {
            addInfo((new StringBuilder()).append("Remote host ").append(address.getHostName()).append(" refused connection. ").append(connectexception.getMessage()).toString());
        }
        catch (IOException ioexception)
        {
            addInfo((new StringBuilder()).append("Could not connect to ").append(address.getHostName()).append(". Exception is ").append(ioexception).toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
        this$0 = SocketAppenderBase.this;
        super();
        interrupted = false;
    }
}
