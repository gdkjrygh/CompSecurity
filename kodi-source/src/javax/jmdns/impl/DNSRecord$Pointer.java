// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Map;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSRecord, ServiceInfoImpl, ServiceEventImpl, JmDNSImpl, 
//            DNSEntry

public static class _alias extends DNSRecord
{

    private final String _alias;

    String getAlias()
    {
        return _alias;
    }

    public ServiceEvent getServiceEvent(JmDNSImpl jmdnsimpl)
    {
        ServiceInfo serviceinfo = getServiceInfo(false);
        ((ServiceInfoImpl)serviceinfo).setDns(jmdnsimpl);
        String s = serviceinfo.getType();
        return new ServiceEventImpl(jmdnsimpl, s, JmDNSImpl.toUnqualifiedName(s, getAlias()), serviceinfo);
    }

    public ServiceInfo getServiceInfo(boolean flag)
    {
        if (isServicesDiscoveryMetaQuery())
        {
            return new ServiceInfoImpl(ServiceInfoImpl.decodeQualifiedNameMapForType(getAlias()), 0, 0, 0, flag, (byte[])null);
        }
        if (isReverseLookup())
        {
            return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, flag, (byte[])null);
        }
        if (isDomainDiscoveryQuery())
        {
            return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, flag, (byte[])null);
        } else
        {
            Map map = ServiceInfoImpl.decodeQualifiedNameMapForType(getAlias());
            map.put(javax.jmdns..Subtype, getQualifiedNameMap().get(javax.jmdns..Subtype));
            return new ServiceInfoImpl(map, 0, 0, 0, flag, getAlias());
        }
    }

    boolean handleQuery(JmDNSImpl jmdnsimpl, long l)
    {
        return false;
    }

    boolean handleResponse(JmDNSImpl jmdnsimpl)
    {
        return false;
    }

    public boolean isSameEntry(DNSEntry dnsentry)
    {
        return super.isSameEntry(dnsentry) && (dnsentry instanceof try) && sameValue((sameValue)dnsentry);
    }

    public boolean isSingleValued()
    {
        return false;
    }

    boolean sameValue(DNSRecord dnsrecord)
    {
        if (dnsrecord instanceof sameValue)
        {
            dnsrecord = (sameValue)dnsrecord;
            if (_alias != null || ((_alias) (dnsrecord))._alias == null)
            {
                return _alias.equals(((_alias) (dnsrecord))._alias);
            }
        }
        return false;
    }

    protected void toString(StringBuilder stringbuilder)
    {
        super.toString(stringbuilder);
        StringBuilder stringbuilder1 = (new StringBuilder()).append(" alias: '");
        String s;
        if (_alias != null)
        {
            s = _alias.toString();
        } else
        {
            s = "null";
        }
        stringbuilder.append(stringbuilder1.append(s).append("'").toString());
    }

    void write(eOutputStream eoutputstream)
    {
        eoutputstream.writeName(_alias);
    }

    public dClass(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, String s1)
    {
        super(s, DNSRecordType.TYPE_PTR, dnsrecordclass, flag, i);
        _alias = s1;
    }
}
