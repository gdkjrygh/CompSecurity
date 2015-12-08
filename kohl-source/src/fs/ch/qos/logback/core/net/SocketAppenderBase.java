// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.net;

import fs.ch.qos.logback.core.AppenderBase;
import fs.ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;

public abstract class SocketAppenderBase extends AppenderBase
{
    class Connector extends Thread
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
            Socket socket1 = new Socket(address, port);
            this;
            JVM INSTR monitorenter ;
            oos = new ObjectOutputStream(socket1.getOutputStream());
            connector = null;
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

        Connector()
        {
            this$0 = SocketAppenderBase.this;
            super();
            interrupted = false;
        }
    }


    protected InetAddress address;
    private Connector connector;
    protected int counter;
    private boolean initialized;
    private boolean lazyInit;
    protected ObjectOutputStream oos;
    protected int port;
    protected int reconnectionDelay;
    protected String remoteHost;
    protected Socket socket;

    public SocketAppenderBase()
    {
        port = 4560;
        reconnectionDelay = 30000;
        initialized = false;
        lazyInit = false;
        counter = 0;
    }

    protected static InetAddress getAddressByName(String s)
    {
        try
        {
            s = InetAddress.getByName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    protected void append(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (address == null)
        {
            addError((new StringBuilder()).append("No remote host is set for SocketAppender named \"").append(name).append("\". For more information, please visit http://logback.qos.ch/codes.html#socket_no_host").toString());
            return;
        }
        if (!initialized && lazyInit)
        {
            initialized = true;
            connect(address, port);
        }
        if (oos == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i;
        postProcessEvent(obj);
        obj = getPST().transform(obj);
        oos.writeObject(obj);
        oos.flush();
        i = counter + 1;
        counter = i;
        if (i >= 70)
        {
            try
            {
                counter = 0;
                oos.reset();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            if (oos != null)
            {
                try
                {
                    oos.close();
                }
                catch (IOException ioexception) { }
            }
            oos = null;
            addWarn((new StringBuilder()).append("Detected problem with connection: ").append(obj).toString());
            if (reconnectionDelay > 0)
            {
                fireConnector();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void cleanUp()
    {
        if (oos != null)
        {
            try
            {
                oos.close();
            }
            catch (IOException ioexception)
            {
                addError("Could not close oos.", ioexception);
            }
            oos = null;
        }
        if (connector != null)
        {
            addInfo("Interrupting the connector.");
            connector.interrupted = true;
            connector = null;
        }
    }

    void connect(InetAddress inetaddress, int i)
    {
        if (address == null)
        {
            return;
        }
        try
        {
            cleanUp();
            socket = new Socket(inetaddress, i);
            oos = new ObjectOutputStream(socket.getOutputStream());
            return;
        }
        catch (IOException ioexception)
        {
            String s = (new StringBuilder()).append("Could not connect to remote logback server at [").append(inetaddress.getHostName()).append("].").toString();
            inetaddress = s;
            if (reconnectionDelay > 0)
            {
                inetaddress = (new StringBuilder()).append(s).append(" We will try again later.").toString();
                fireConnector();
            }
            addInfo(inetaddress, ioexception);
            return;
        }
    }

    void fireConnector()
    {
        if (connector == null)
        {
            addInfo("Starting a new connector thread.");
            connector = new Connector();
            connector.setDaemon(true);
            connector.setPriority(1);
            connector.start();
        }
    }

    protected abstract PreSerializationTransformer getPST();

    protected abstract void postProcessEvent(Object obj);

    public void setPort(int i)
    {
        port = i;
    }

    public void setRemoteHost(String s)
    {
        address = getAddressByName(s);
        remoteHost = s;
    }

    public void start()
    {
        int i = 0;
        if (port == 0)
        {
            addError((new StringBuilder()).append("No port was configured for appender").append(name).append(" For more information, please visit http://logback.qos.ch/codes.html#socket_no_port").toString());
            i = 1;
        }
        int j = i;
        if (address == null)
        {
            j = i + 1;
            addError((new StringBuilder()).append("No remote address was configured for appender").append(name).append(" For more information, please visit http://logback.qos.ch/codes.html#socket_no_host").toString());
        }
        if (!lazyInit)
        {
            connect(address, port);
        }
        if (j == 0)
        {
            started = true;
        }
    }

    public void stop()
    {
        if (!isStarted())
        {
            return;
        } else
        {
            started = false;
            cleanUp();
            return;
        }
    }


/*
    static Connector access$002(SocketAppenderBase socketappenderbase, Connector connector1)
    {
        socketappenderbase.connector = connector1;
        return connector1;
    }

*/
}
