// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.HashMap;
import java.util.Map;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSRecord, ServiceInfoImpl, ServiceEventImpl, JmDNSImpl

public static class _os extends DNSRecord
{

    String _cpu;
    String _os;

    public ServiceEvent getServiceEvent(JmDNSImpl jmdnsimpl)
    {
        ServiceInfo serviceinfo = getServiceInfo(false);
        ((ServiceInfoImpl)serviceinfo).setDns(jmdnsimpl);
        return new ServiceEventImpl(jmdnsimpl, serviceinfo.getType(), serviceinfo.getName(), serviceinfo);
    }

    public ServiceInfo getServiceInfo(boolean flag)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("cpu", _cpu);
        hashmap.put("os", _os);
        return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, flag, hashmap);
    }

    boolean handleQuery(JmDNSImpl jmdnsimpl, long l)
    {
        return false;
    }

    boolean handleResponse(JmDNSImpl jmdnsimpl)
    {
        return false;
    }

    public boolean isSingleValued()
    {
        return true;
    }

    boolean sameValue(DNSRecord dnsrecord)
    {
        if (dnsrecord instanceof getQualifiedNameMap)
        {
            dnsrecord = (getQualifiedNameMap)dnsrecord;
            if ((_cpu != null || ((_cpu) (dnsrecord))._cpu == null) && (_os != null || ((_os) (dnsrecord))._os == null) && _cpu.equals(((_cpu) (dnsrecord))._cpu) && _os.equals(((_os) (dnsrecord))._os))
            {
                return true;
            }
        }
        return false;
    }

    protected void toString(StringBuilder stringbuilder)
    {
        super.toString(stringbuilder);
        stringbuilder.append((new StringBuilder()).append(" cpu: '").append(_cpu).append("' os: '").append(_os).append("'").toString());
    }

    void write(tream tream)
    {
        String s = (new StringBuilder()).append(_cpu).append(" ").append(_os).toString();
        tream.writeUTF(s, 0, s.length());
    }

    public tream(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, String s1, String s2)
    {
        super(s, DNSRecordType.TYPE_HINFO, dnsrecordclass, flag, i);
        _cpu = s1;
        _os = s2;
    }
}
