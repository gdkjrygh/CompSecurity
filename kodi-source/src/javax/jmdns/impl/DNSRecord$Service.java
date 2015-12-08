// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSRecord, ServiceInfoImpl, ServiceEventImpl, JmDNSImpl, 
//            HostInfo, DNSIncoming

public static class _server extends DNSRecord
{

    private static Logger logger1 = Logger.getLogger(javax/jmdns/impl/DNSRecord$Service.getName());
    private final int _port;
    private final int _priority;
    private final String _server;
    private final int _weight;

    public int getPort()
    {
        return _port;
    }

    public int getPriority()
    {
        return _priority;
    }

    String getServer()
    {
        return _server;
    }

    public ServiceEvent getServiceEvent(JmDNSImpl jmdnsimpl)
    {
        ServiceInfo serviceinfo = getServiceInfo(false);
        ((ServiceInfoImpl)serviceinfo).setDns(jmdnsimpl);
        return new ServiceEventImpl(jmdnsimpl, serviceinfo.getType(), serviceinfo.getName(), serviceinfo);
    }

    public ServiceInfo getServiceInfo(boolean flag)
    {
        return new ServiceInfoImpl(getQualifiedNameMap(), _port, _weight, _priority, flag, _server);
    }

    public int getWeight()
    {
        return _weight;
    }

    boolean handleQuery(JmDNSImpl jmdnsimpl, long l)
    {
        ServiceInfoImpl serviceinfoimpl = (ServiceInfoImpl)jmdnsimpl.getServices().get(getKey());
        if (serviceinfoimpl != null && (serviceinfoimpl.isAnnouncing() || serviceinfoimpl.isAnnounced()) && (_port != serviceinfoimpl.getPort() || !_server.equalsIgnoreCase(jmdnsimpl.getLocalHost().getName())))
        {
            logger1.finer((new StringBuilder()).append("handleQuery() Conflicting probe detected from: ").append(getRecordSource()).toString());
            dClass dclass = new <init>(serviceinfoimpl.getQualifiedName(), DNSRecordClass.CLASS_IN, true, 3600, serviceinfoimpl.getPriority(), serviceinfoimpl.getWeight(), serviceinfoimpl.getPort(), jmdnsimpl.getLocalHost().getName());
            int i;
            try
            {
                if (jmdnsimpl.getInterface().equals(getRecordSource()))
                {
                    logger1.warning((new StringBuilder()).append("Got conflicting probe from ourselves\nincoming: ").append(toString()).append("\n").append("local   : ").append(dclass.toString()).toString());
                }
            }
            catch (IOException ioexception)
            {
                logger1.log(Level.WARNING, "IOException", ioexception);
            }
            i = compareTo(dclass);
            if (i == 0)
            {
                logger1.finer("handleQuery() Ignoring a identical service query");
                return false;
            }
            if (serviceinfoimpl.isProbing() && i > 0)
            {
                String s = serviceinfoimpl.getQualifiedName().toLowerCase();
                serviceinfoimpl.setName(jmdnsimpl.incrementName(serviceinfoimpl.getName()));
                jmdnsimpl.getServices().remove(s);
                jmdnsimpl.getServices().put(serviceinfoimpl.getQualifiedName().toLowerCase(), serviceinfoimpl);
                logger1.finer((new StringBuilder()).append("handleQuery() Lost tie break: new unique name chosen:").append(serviceinfoimpl.getName()).toString());
                serviceinfoimpl.revertState();
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
    }

    boolean handleResponse(JmDNSImpl jmdnsimpl)
    {
        ServiceInfoImpl serviceinfoimpl = (ServiceInfoImpl)jmdnsimpl.getServices().get(getKey());
        if (serviceinfoimpl != null && (_port != serviceinfoimpl.getPort() || !_server.equalsIgnoreCase(jmdnsimpl.getLocalHost().getName())))
        {
            logger1.finer("handleResponse() Denial detected");
            if (serviceinfoimpl.isProbing())
            {
                String s = serviceinfoimpl.getQualifiedName().toLowerCase();
                serviceinfoimpl.setName(jmdnsimpl.incrementName(serviceinfoimpl.getName()));
                jmdnsimpl.getServices().remove(s);
                jmdnsimpl.getServices().put(serviceinfoimpl.getQualifiedName().toLowerCase(), serviceinfoimpl);
                logger1.finer((new StringBuilder()).append("handleResponse() New unique name chose:").append(serviceinfoimpl.getName()).toString());
            }
            serviceinfoimpl.revertState();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isSingleValued()
    {
        return true;
    }

    boolean sameValue(DNSRecord dnsrecord)
    {
        if (dnsrecord instanceof vertState)
        {
            if (_priority == ((_priority) (dnsrecord = (_priority)dnsrecord))._priority && _weight == ((_weight) (dnsrecord))._weight && _port == ((_port) (dnsrecord))._port && _server.equals(((_server) (dnsrecord))._server))
            {
                return true;
            }
        }
        return false;
    }

    protected void toByteArray(DataOutputStream dataoutputstream)
        throws IOException
    {
        super.toByteArray(dataoutputstream);
        dataoutputstream.writeShort(_priority);
        dataoutputstream.writeShort(_weight);
        dataoutputstream.writeShort(_port);
        try
        {
            dataoutputstream.write(_server.getBytes("UTF-8"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DataOutputStream dataoutputstream)
        {
            return;
        }
    }

    protected void toString(StringBuilder stringbuilder)
    {
        super.toString(stringbuilder);
        stringbuilder.append((new StringBuilder()).append(" server: '").append(_server).append(":").append(_port).append("'").toString());
    }

    void write(eOutputStream eoutputstream)
    {
        eoutputstream.writeShort(_priority);
        eoutputstream.writeShort(_weight);
        eoutputstream.writeShort(_port);
        if (DNSIncoming.USE_DOMAIN_NAME_FORMAT_FOR_SRV_TARGET)
        {
            eoutputstream.writeName(_server);
            return;
        } else
        {
            eoutputstream.writeUTF(_server, 0, _server.length());
            eoutputstream.writeByte(0);
            return;
        }
    }


    public dClass(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, int j, int k, int l, 
            String s1)
    {
        super(s, DNSRecordType.TYPE_SRV, dnsrecordclass, flag, i);
        _priority = j;
        _weight = k;
        _port = l;
        _server = s1;
    }
}
