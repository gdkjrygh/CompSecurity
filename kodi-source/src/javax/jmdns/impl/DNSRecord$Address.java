// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSRecord, ServiceInfoImpl, ServiceEventImpl, JmDNSImpl, 
//            HostInfo, DNSCache

public static abstract class logger1 extends DNSRecord
{

    private static Logger logger1 = Logger.getLogger(javax/jmdns/impl/DNSRecord$Address.getName());
    InetAddress _addr;

    InetAddress getAddress()
    {
        return _addr;
    }

    public ServiceEvent getServiceEvent(JmDNSImpl jmdnsimpl)
    {
        ServiceInfo serviceinfo = getServiceInfo(false);
        ((ServiceInfoImpl)serviceinfo).setDns(jmdnsimpl);
        return new ServiceEventImpl(jmdnsimpl, serviceinfo.getType(), serviceinfo.getName(), serviceinfo);
    }

    public ServiceInfo getServiceInfo(boolean flag)
    {
        return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, flag, (byte[])null);
    }

    boolean handleQuery(JmDNSImpl jmdnsimpl, long l)
    {
        int i;
label0:
        {
            if (jmdnsimpl.getLocalHost().conflictWithRecord(this))
            {
                i = compareTo(jmdnsimpl.getLocalHost().getDNSAddressRecord(getRecordType(), isUnique(), 3600));
                if (i != 0)
                {
                    break label0;
                }
                logger1.finer("handleQuery() Ignoring an identical address query");
            }
            return false;
        }
        logger1.finer("handleQuery() Conflicting query detected.");
        if (jmdnsimpl.isProbing() && i > 0)
        {
            jmdnsimpl.getLocalHost().incrementHostName();
            jmdnsimpl.getCache().clear();
            for (Iterator iterator = jmdnsimpl.getServices().values().iterator(); iterator.hasNext(); ((ServiceInfoImpl)(ServiceInfo)iterator.next()).revertState()) { }
        }
        jmdnsimpl.revertState();
        return true;
    }

    boolean handleResponse(JmDNSImpl jmdnsimpl)
    {
        if (jmdnsimpl.getLocalHost().conflictWithRecord(this))
        {
            logger1.finer("handleResponse() Denial detected");
            if (jmdnsimpl.isProbing())
            {
                jmdnsimpl.getLocalHost().incrementHostName();
                jmdnsimpl.getCache().clear();
                for (Iterator iterator = jmdnsimpl.getServices().values().iterator(); iterator.hasNext(); ((ServiceInfoImpl)(ServiceInfo)iterator.next()).revertState()) { }
            }
            jmdnsimpl.revertState();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isSingleValued()
    {
        return false;
    }

    boolean sameName(DNSRecord dnsrecord)
    {
        return getName().equalsIgnoreCase(dnsrecord.getName());
    }

    boolean sameValue(DNSRecord dnsrecord)
    {
        if (dnsrecord instanceof getName)
        {
            dnsrecord = (getName)dnsrecord;
            if (getAddress() != null || dnsrecord.getAddress() == null)
            {
                return getAddress().equals(dnsrecord.getAddress());
            }
        }
        return false;
    }

    protected void toByteArray(DataOutputStream dataoutputstream)
        throws IOException
    {
        super.toByteArray(dataoutputstream);
        byte abyte0[] = getAddress().getAddress();
        for (int i = 0; i < abyte0.length; i++)
        {
            dataoutputstream.writeByte(abyte0[i]);
        }

    }

    protected void toString(StringBuilder stringbuilder)
    {
        super.toString(stringbuilder);
        StringBuilder stringbuilder1 = (new StringBuilder()).append(" address: '");
        String s;
        if (getAddress() != null)
        {
            s = getAddress().getHostAddress();
        } else
        {
            s = "null";
        }
        stringbuilder.append(stringbuilder1.append(s).append("'").toString());
    }


    protected dClass(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag, int i, InetAddress inetaddress)
    {
        super(s, dnsrecordtype, dnsrecordclass, flag, i);
        _addr = inetaddress;
    }

    protected dClass(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag, int i, byte abyte0[])
    {
        super(s, dnsrecordtype, dnsrecordclass, flag, i);
        try
        {
            _addr = InetAddress.getByAddress(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            logger1.log(Level.WARNING, "Address() exception ", s);
        }
    }
}
