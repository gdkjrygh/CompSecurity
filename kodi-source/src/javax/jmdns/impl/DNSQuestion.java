// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSEntry, ServiceInfoImpl, JmDNSImpl, HostInfo

public class DNSQuestion extends DNSEntry
{
    private static class AllRecords extends DNSQuestion
    {

        public void addAnswers(JmDNSImpl jmdnsimpl, Set set)
        {
            String s = getName().toLowerCase();
            if (jmdnsimpl.getLocalHost().getName().equalsIgnoreCase(s))
            {
                set.addAll(jmdnsimpl.getLocalHost().answers(isUnique(), 3600));
                return;
            }
            if (jmdnsimpl.getServiceTypes().containsKey(s))
            {
                (new Pointer(getName(), DNSRecordType.TYPE_PTR, getRecordClass(), isUnique())).addAnswers(jmdnsimpl, set);
                return;
            } else
            {
                addAnswersForServiceInfo(jmdnsimpl, set, (ServiceInfoImpl)jmdnsimpl.getServices().get(s));
                return;
            }
        }

        public boolean iAmTheOnlyOne(JmDNSImpl jmdnsimpl)
        {
            String s = getName().toLowerCase();
            return jmdnsimpl.getLocalHost().getName().equals(s) || jmdnsimpl.getServices().keySet().contains(s);
        }

        public boolean isSameType(DNSEntry dnsentry)
        {
            return dnsentry != null;
        }

        AllRecords(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
        {
            super(s, dnsrecordtype, dnsrecordclass, flag);
        }
    }

    private static class DNS4Address extends DNSQuestion
    {

        public void addAnswers(JmDNSImpl jmdnsimpl, Set set)
        {
            jmdnsimpl = jmdnsimpl.getLocalHost().getDNSAddressRecord(getRecordType(), true, 3600);
            if (jmdnsimpl != null)
            {
                set.add(jmdnsimpl);
            }
        }

        public boolean iAmTheOnlyOne(JmDNSImpl jmdnsimpl)
        {
            String s = getName().toLowerCase();
            return jmdnsimpl.getLocalHost().getName().equals(s) || jmdnsimpl.getServices().keySet().contains(s);
        }

        DNS4Address(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
        {
            super(s, dnsrecordtype, dnsrecordclass, flag);
        }
    }

    private static class DNS6Address extends DNSQuestion
    {

        public void addAnswers(JmDNSImpl jmdnsimpl, Set set)
        {
            jmdnsimpl = jmdnsimpl.getLocalHost().getDNSAddressRecord(getRecordType(), true, 3600);
            if (jmdnsimpl != null)
            {
                set.add(jmdnsimpl);
            }
        }

        public boolean iAmTheOnlyOne(JmDNSImpl jmdnsimpl)
        {
            String s = getName().toLowerCase();
            return jmdnsimpl.getLocalHost().getName().equals(s) || jmdnsimpl.getServices().keySet().contains(s);
        }

        DNS6Address(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
        {
            super(s, dnsrecordtype, dnsrecordclass, flag);
        }
    }

    private static class HostInformation extends DNSQuestion
    {

        HostInformation(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
        {
            super(s, dnsrecordtype, dnsrecordclass, flag);
        }
    }

    private static class Pointer extends DNSQuestion
    {

        public void addAnswers(JmDNSImpl jmdnsimpl, Set set)
        {
            for (Iterator iterator = jmdnsimpl.getServices().values().iterator(); iterator.hasNext(); addAnswersForServiceInfo(jmdnsimpl, set, (ServiceInfoImpl)(ServiceInfo)iterator.next())) { }
            if (isServicesDiscoveryMetaQuery())
            {
                Object obj1;
                for (Iterator iterator1 = jmdnsimpl.getServiceTypes().keySet().iterator(); iterator1.hasNext(); set.add(new DNSRecord.Pointer("_services._dns-sd._udp.local.", DNSRecordClass.CLASS_IN, false, 3600, ((JmDNSImpl.ServiceTypeEntry) (obj1)).getType())))
                {
                    obj1 = (String)iterator1.next();
                    obj1 = (JmDNSImpl.ServiceTypeEntry)jmdnsimpl.getServiceTypes().get(obj1);
                }

            } else
            if (isReverseLookup())
            {
                String s = (String)getQualifiedNameMap().get(javax.jmdns.ServiceInfo.Fields.Instance);
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

        Pointer(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
        {
            super(s, dnsrecordtype, dnsrecordclass, flag);
        }
    }

    private static class Service extends DNSQuestion
    {

        public void addAnswers(JmDNSImpl jmdnsimpl, Set set)
        {
            String s = getName().toLowerCase();
            if (jmdnsimpl.getLocalHost().getName().equalsIgnoreCase(s))
            {
                set.addAll(jmdnsimpl.getLocalHost().answers(isUnique(), 3600));
                return;
            }
            if (jmdnsimpl.getServiceTypes().containsKey(s))
            {
                (new Pointer(getName(), DNSRecordType.TYPE_PTR, getRecordClass(), isUnique())).addAnswers(jmdnsimpl, set);
                return;
            } else
            {
                addAnswersForServiceInfo(jmdnsimpl, set, (ServiceInfoImpl)jmdnsimpl.getServices().get(s));
                return;
            }
        }

        public boolean iAmTheOnlyOne(JmDNSImpl jmdnsimpl)
        {
            String s = getName().toLowerCase();
            return jmdnsimpl.getLocalHost().getName().equals(s) || jmdnsimpl.getServices().keySet().contains(s);
        }

        Service(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
        {
            super(s, dnsrecordtype, dnsrecordclass, flag);
        }
    }

    private static class Text extends DNSQuestion
    {

        public void addAnswers(JmDNSImpl jmdnsimpl, Set set)
        {
            addAnswersForServiceInfo(jmdnsimpl, set, (ServiceInfoImpl)jmdnsimpl.getServices().get(getName().toLowerCase()));
        }

        public boolean iAmTheOnlyOne(JmDNSImpl jmdnsimpl)
        {
            String s = getName().toLowerCase();
            return jmdnsimpl.getLocalHost().getName().equals(s) || jmdnsimpl.getServices().keySet().contains(s);
        }

        Text(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
        {
            super(s, dnsrecordtype, dnsrecordclass, flag);
        }
    }


    private static Logger logger = Logger.getLogger(javax/jmdns/impl/DNSQuestion.getName());

    DNSQuestion(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
    {
        super(s, dnsrecordtype, dnsrecordclass, flag);
    }

    public static DNSQuestion newQuestion(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
    {
        static class _cls1
        {

            static final int $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[];

            static 
            {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType = new int[DNSRecordType.values().length];
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_A.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_A6.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_AAAA.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_ANY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_HINFO.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_PTR.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_SRV.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_TXT.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.javax.jmdns.impl.constants.DNSRecordType[dnsrecordtype.ordinal()])
        {
        default:
            return new DNSQuestion(s, dnsrecordtype, dnsrecordclass, flag);

        case 1: // '\001'
            return new DNS4Address(s, dnsrecordtype, dnsrecordclass, flag);

        case 2: // '\002'
            return new DNS6Address(s, dnsrecordtype, dnsrecordclass, flag);

        case 3: // '\003'
            return new DNS6Address(s, dnsrecordtype, dnsrecordclass, flag);

        case 4: // '\004'
            return new AllRecords(s, dnsrecordtype, dnsrecordclass, flag);

        case 5: // '\005'
            return new HostInformation(s, dnsrecordtype, dnsrecordclass, flag);

        case 6: // '\006'
            return new Pointer(s, dnsrecordtype, dnsrecordclass, flag);

        case 7: // '\007'
            return new Service(s, dnsrecordtype, dnsrecordclass, flag);

        case 8: // '\b'
            return new Text(s, dnsrecordtype, dnsrecordclass, flag);
        }
    }

    public void addAnswers(JmDNSImpl jmdnsimpl, Set set)
    {
    }

    protected void addAnswersForServiceInfo(JmDNSImpl jmdnsimpl, Set set, ServiceInfoImpl serviceinfoimpl)
    {
        if (serviceinfoimpl != null && serviceinfoimpl.isAnnounced())
        {
            if (getName().equalsIgnoreCase(serviceinfoimpl.getQualifiedName()) || getName().equalsIgnoreCase(serviceinfoimpl.getType()))
            {
                set.addAll(jmdnsimpl.getLocalHost().answers(true, 3600));
                set.addAll(serviceinfoimpl.answers(true, 3600, jmdnsimpl.getLocalHost()));
            }
            if (logger.isLoggable(Level.FINER))
            {
                logger.finer((new StringBuilder()).append(jmdnsimpl.getName()).append(" DNSQuestion(").append(getName()).append(").addAnswersForServiceInfo(): info: ").append(serviceinfoimpl).append("\n").append(set).toString());
            }
        }
    }

    boolean answeredBy(DNSEntry dnsentry)
    {
        return isSameRecordClass(dnsentry) && isSameType(dnsentry) && getName().equals(dnsentry.getName());
    }

    public boolean iAmTheOnlyOne(JmDNSImpl jmdnsimpl)
    {
        return false;
    }

    public boolean isExpired(long l)
    {
        return false;
    }

    public void toString(StringBuilder stringbuilder)
    {
    }

}
