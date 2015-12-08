// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.constants.DNSConstants;

// Referenced classes of package javax.jmdns.impl:
//            JmDNSImpl, HostInfo, DNSIncoming

class SocketListener extends Thread
{

    static Logger logger = Logger.getLogger(javax/jmdns/impl/SocketListener.getName());
    private final JmDNSImpl _jmDNSImpl;

    SocketListener(JmDNSImpl jmdnsimpl)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("SocketListener(");
        String s;
        if (jmdnsimpl != null)
        {
            s = jmdnsimpl.getName();
        } else
        {
            s = "";
        }
        super(stringbuilder.append(s).append(")").toString());
        setDaemon(true);
        _jmDNSImpl = jmdnsimpl;
    }

    public void run()
    {
        byte abyte0[];
        DatagramPacket datagrampacket;
        abyte0 = new byte[8972];
        datagrampacket = new DatagramPacket(abyte0, abyte0.length);
_L6:
        if (_jmDNSImpl.isCanceling() || _jmDNSImpl.isCanceled()) goto _L2; else goto _L1
_L1:
        datagrampacket.setLength(abyte0.length);
        _jmDNSImpl.getSocket().receive(datagrampacket);
        if (_jmDNSImpl.isCanceling() || _jmDNSImpl.isCanceled() || _jmDNSImpl.isClosing()) goto _L2; else goto _L3
_L3:
        boolean flag = _jmDNSImpl.isClosed();
        if (!flag) goto _L4; else goto _L2
_L2:
        if (logger.isLoggable(Level.FINEST))
        {
            logger.finest((new StringBuilder()).append(getName()).append(".run() exiting.").toString());
        }
        return;
_L4:
        if (_jmDNSImpl.getLocalHost().shouldIgnorePacket(datagrampacket)) goto _L6; else goto _L5
_L5:
        Object obj;
        obj = new DNSIncoming(datagrampacket);
        if (logger.isLoggable(Level.FINEST))
        {
            logger.finest((new StringBuilder()).append(getName()).append(".run() JmDNS in:").append(((DNSIncoming) (obj)).print(true)).toString());
        }
        if (!((DNSIncoming) (obj)).isQuery())
        {
            break MISSING_BLOCK_LABEL_383;
        }
        if (datagrampacket.getPort() != DNSConstants.MDNS_PORT)
        {
            _jmDNSImpl.handleQuery(((DNSIncoming) (obj)), datagrampacket.getAddress(), datagrampacket.getPort());
        }
        _jmDNSImpl.handleQuery(((DNSIncoming) (obj)), _jmDNSImpl.getGroup(), DNSConstants.MDNS_PORT);
          goto _L6
        obj;
        logger.log(Level.WARNING, (new StringBuilder()).append(getName()).append(".run() exception ").toString(), ((Throwable) (obj)));
          goto _L6
        IOException ioexception;
        ioexception;
        if (!_jmDNSImpl.isCanceling() && !_jmDNSImpl.isCanceled() && !_jmDNSImpl.isClosing() && !_jmDNSImpl.isClosed())
        {
            logger.log(Level.WARNING, (new StringBuilder()).append(getName()).append(".run() exception ").toString(), ioexception);
            _jmDNSImpl.recover();
        }
          goto _L2
        _jmDNSImpl.handleResponse(((DNSIncoming) (obj)));
          goto _L6
    }

}
