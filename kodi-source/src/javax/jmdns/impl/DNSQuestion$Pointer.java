// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSQuestion, JmDNSImpl, ServiceInfoImpl, HostInfo

private static class lass extends DNSQuestion
{

    public void addAnswers(JmDNSImpl jmdnsimpl, Set set)
    {
        for (Iterator iterator = jmdnsimpl.getServices().values().iterator(); iterator.hasNext(); addAnswersForServiceInfo(jmdnsimpl, set, (ServiceInfoImpl)(ServiceInfo)iterator.next())) { }
        if (isServicesDiscoveryMetaQuery())
        {
            Object obj1;
            for (Iterator iterator1 = jmdnsimpl.getServiceTypes().keySet().iterator(); iterator1.hasNext(); set.add(new nit>("_services._dns-sd._udp.local.", DNSRecordClass.CLASS_IN, false, 3600, ((eEntry) (obj1)).getType())))
            {
                obj1 = (String)iterator1.next();
                obj1 = (eEntry)jmdnsimpl.getServiceTypes().get(obj1);
            }

        } else
        if (isReverseLookup())
        {
            String s = (String)getQualifiedNameMap().get(javax.jmdns.nstance);
            if (s != null && s.length() > 0)
            {
                Object obj = jmdnsimpl.getLocalHost().getInetAddress();
                if (obj != null)
                {
                    obj = ((InetAddress) (obj)).getHostAddress();
                } else
                {
                    obj = "";
                }
                if (s.equalsIgnoreCase(((String) (obj))))
                {
                    if (isV4ReverseLookup())
                    {
                        set.add(jmdnsimpl.getLocalHost().getDNSReverseAddressRecord(DNSRecordType.TYPE_A, false, 3600));
                    }
                    if (isV6ReverseLookup())
                    {
                        set.add(jmdnsimpl.getLocalHost().getDNSReverseAddressRecord(DNSRecordType.TYPE_AAAA, false, 3600));
                    }
                }
            }
        } else
        if (isDomainDiscoveryQuery())
        {
            return;
        }
    }

    lass(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
    {
        super(s, dnsrecordtype, dnsrecordclass, flag);
    }
}
