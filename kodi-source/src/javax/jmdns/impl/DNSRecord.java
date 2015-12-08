// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSEntry, DNSIncoming, JmDNSImpl, ServiceInfoImpl, 
//            ServiceEventImpl, HostInfo, DNSCache

public abstract class DNSRecord extends DNSEntry
{
    public static abstract class Address extends DNSRecord
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
            if (dnsrecord instanceof Address)
            {
                dnsrecord = (Address)dnsrecord;
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
            toByteArray(dataoutputstream);
            byte abyte0[] = getAddress().getAddress();
            for (int i = 0; i < abyte0.length; i++)
            {
                dataoutputstream.writeByte(abyte0[i]);
            }

        }

        protected void toString(StringBuilder stringbuilder)
        {
            toString(stringbuilder);
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


        protected Address(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag, int i, InetAddress inetaddress)
        {
            super(s, dnsrecordtype, dnsrecordclass, flag, i);
            _addr = inetaddress;
        }

        protected Address(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag, int i, byte abyte0[])
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

    public static class HostInformation extends DNSRecord
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
            if (dnsrecord instanceof HostInformation)
            {
                dnsrecord = (HostInformation)dnsrecord;
                if ((_cpu != null || ((HostInformation) (dnsrecord))._cpu == null) && (_os != null || ((HostInformation) (dnsrecord))._os == null) && _cpu.equals(((HostInformation) (dnsrecord))._cpu) && _os.equals(((HostInformation) (dnsrecord))._os))
                {
                    return true;
                }
            }
            return false;
        }

        protected void toString(StringBuilder stringbuilder)
        {
            toString(stringbuilder);
            stringbuilder.append((new StringBuilder()).append(" cpu: '").append(_cpu).append("' os: '").append(_os).append("'").toString());
        }

        void write(DNSOutgoing.MessageOutputStream messageoutputstream)
        {
            String s = (new StringBuilder()).append(_cpu).append(" ").append(_os).toString();
            messageoutputstream.writeUTF(s, 0, s.length());
        }

        public HostInformation(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, String s1, String s2)
        {
            super(s, DNSRecordType.TYPE_HINFO, dnsrecordclass, flag, i);
            _cpu = s1;
            _os = s2;
        }
    }

    public static class IPv4Address extends Address
    {

        public ServiceInfo getServiceInfo(boolean flag)
        {
            ServiceInfoImpl serviceinfoimpl = (ServiceInfoImpl)super.getServiceInfo(flag);
            serviceinfoimpl.addAddress((Inet4Address)_addr);
            return serviceinfoimpl;
        }

        void write(DNSOutgoing.MessageOutputStream messageoutputstream)
        {
            if (_addr != null)
            {
                byte abyte0[] = _addr.getAddress();
                if (!(_addr instanceof Inet4Address))
                {
                    byte abyte1[] = new byte[4];
                    System.arraycopy(abyte0, 12, abyte1, 0, 4);
                    abyte0 = abyte1;
                }
                messageoutputstream.writeBytes(abyte0, 0, abyte0.length);
            }
        }

        IPv4Address(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, InetAddress inetaddress)
        {
            super(s, DNSRecordType.TYPE_A, dnsrecordclass, flag, i, inetaddress);
        }

        IPv4Address(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, byte abyte0[])
        {
            super(s, DNSRecordType.TYPE_A, dnsrecordclass, flag, i, abyte0);
        }
    }

    public static class IPv6Address extends Address
    {

        public ServiceInfo getServiceInfo(boolean flag)
        {
            ServiceInfoImpl serviceinfoimpl = (ServiceInfoImpl)super.getServiceInfo(flag);
            serviceinfoimpl.addAddress((Inet6Address)_addr);
            return serviceinfoimpl;
        }

        void write(DNSOutgoing.MessageOutputStream messageoutputstream)
        {
            if (_addr != null)
            {
                byte abyte1[] = _addr.getAddress();
                byte abyte0[] = abyte1;
                if (_addr instanceof Inet4Address)
                {
                    byte abyte2[] = new byte[16];
                    int i = 0;
                    do
                    {
                        abyte0 = abyte2;
                        if (i >= 16)
                        {
                            break;
                        }
                        if (i < 11)
                        {
                            abyte2[i] = abyte1[i - 12];
                        } else
                        {
                            abyte2[i] = 0;
                        }
                        i++;
                    } while (true);
                }
                messageoutputstream.writeBytes(abyte0, 0, abyte0.length);
            }
        }

        IPv6Address(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, InetAddress inetaddress)
        {
            super(s, DNSRecordType.TYPE_AAAA, dnsrecordclass, flag, i, inetaddress);
        }

        IPv6Address(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, byte abyte0[])
        {
            super(s, DNSRecordType.TYPE_AAAA, dnsrecordclass, flag, i, abyte0);
        }
    }

    public static class Pointer extends DNSRecord
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
                map.put(javax.jmdns.ServiceInfo.Fields.Subtype, getQualifiedNameMap().get(javax.jmdns.ServiceInfo.Fields.Subtype));
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
            return isSameEntry(dnsentry) && (dnsentry instanceof Pointer) && sameValue((Pointer)dnsentry);
        }

        public boolean isSingleValued()
        {
            return false;
        }

        boolean sameValue(DNSRecord dnsrecord)
        {
            if (dnsrecord instanceof Pointer)
            {
                dnsrecord = (Pointer)dnsrecord;
                if (_alias != null || ((Pointer) (dnsrecord))._alias == null)
                {
                    return _alias.equals(((Pointer) (dnsrecord))._alias);
                }
            }
            return false;
        }

        protected void toString(StringBuilder stringbuilder)
        {
            toString(stringbuilder);
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

        void write(DNSOutgoing.MessageOutputStream messageoutputstream)
        {
            messageoutputstream.writeName(_alias);
        }

        public Pointer(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, String s1)
        {
            super(s, DNSRecordType.TYPE_PTR, dnsrecordclass, flag, i);
            _alias = s1;
        }
    }

    public static class Service extends DNSRecord
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
                Service service = new Service(serviceinfoimpl.getQualifiedName(), DNSRecordClass.CLASS_IN, true, 3600, serviceinfoimpl.getPriority(), serviceinfoimpl.getWeight(), serviceinfoimpl.getPort(), jmdnsimpl.getLocalHost().getName());
                int i;
                try
                {
                    if (jmdnsimpl.getInterface().equals(getRecordSource()))
                    {
                        logger1.warning((new StringBuilder()).append("Got conflicting probe from ourselves\nincoming: ").append(toString()).append("\n").append("local   : ").append(service.toString()).toString());
                    }
                }
                catch (IOException ioexception)
                {
                    logger1.log(Level.WARNING, "IOException", ioexception);
                }
                i = compareTo(service);
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
            if (dnsrecord instanceof Service)
            {
                if (_priority == ((Service) (dnsrecord = (Service)dnsrecord))._priority && _weight == ((Service) (dnsrecord))._weight && _port == ((Service) (dnsrecord))._port && _server.equals(((Service) (dnsrecord))._server))
                {
                    return true;
                }
            }
            return false;
        }

        protected void toByteArray(DataOutputStream dataoutputstream)
            throws IOException
        {
            toByteArray(dataoutputstream);
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
            toString(stringbuilder);
            stringbuilder.append((new StringBuilder()).append(" server: '").append(_server).append(":").append(_port).append("'").toString());
        }

        void write(DNSOutgoing.MessageOutputStream messageoutputstream)
        {
            messageoutputstream.writeShort(_priority);
            messageoutputstream.writeShort(_weight);
            messageoutputstream.writeShort(_port);
            if (DNSIncoming.USE_DOMAIN_NAME_FORMAT_FOR_SRV_TARGET)
            {
                messageoutputstream.writeName(_server);
                return;
            } else
            {
                messageoutputstream.writeUTF(_server, 0, _server.length());
                messageoutputstream.writeByte(0);
                return;
            }
        }


        public Service(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, int j, int k, int l, 
                String s1)
        {
            super(s, DNSRecordType.TYPE_SRV, dnsrecordclass, flag, i);
            _priority = j;
            _weight = k;
            _port = l;
            _server = s1;
        }
    }

    public static class Text extends DNSRecord
    {

        private final byte _text[];

        public ServiceEvent getServiceEvent(JmDNSImpl jmdnsimpl)
        {
            ServiceInfo serviceinfo = getServiceInfo(false);
            ((ServiceInfoImpl)serviceinfo).setDns(jmdnsimpl);
            return new ServiceEventImpl(jmdnsimpl, serviceinfo.getType(), serviceinfo.getName(), serviceinfo);
        }

        public ServiceInfo getServiceInfo(boolean flag)
        {
            return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, flag, _text);
        }

        byte[] getText()
        {
            return _text;
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
            if (dnsrecord instanceof Text) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            dnsrecord = (Text)dnsrecord;
            if ((_text != null || ((Text) (dnsrecord))._text == null) && ((Text) (dnsrecord))._text.length == _text.length)
            {
                int i = _text.length;
label0:
                do
                {
label1:
                    {
                        int j = i - 1;
                        if (i <= 0)
                        {
                            break label1;
                        }
                        if (((Text) (dnsrecord))._text[j] != _text[j])
                        {
                            break label0;
                        }
                        i = j;
                    }
                } while (true);
            }
            if (true) goto _L1; else goto _L3
_L3:
            return true;
        }

        protected void toString(StringBuilder stringbuilder)
        {
            toString(stringbuilder);
            StringBuilder stringbuilder1 = (new StringBuilder()).append(" text: '");
            String s;
            if (_text.length > 20)
            {
                s = (new StringBuilder()).append(new String(_text, 0, 17)).append("...").toString();
            } else
            {
                s = new String(_text);
            }
            stringbuilder.append(stringbuilder1.append(s).append("'").toString());
        }

        void write(DNSOutgoing.MessageOutputStream messageoutputstream)
        {
            messageoutputstream.writeBytes(_text, 0, _text.length);
        }

        public Text(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, byte abyte0[])
        {
            super(s, DNSRecordType.TYPE_TXT, dnsrecordclass, flag, i);
            if (abyte0 == null || abyte0.length <= 0)
            {
                abyte0 = EMPTY_TXT;
            }
            _text = abyte0;
        }
    }


    public static final byte EMPTY_TXT[] = {
        0
    };
    private static Logger logger = Logger.getLogger(javax/jmdns/impl/DNSRecord.getName());
    private long _created;
    private InetAddress _source;
    private int _ttl;

    DNSRecord(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag, int i)
    {
        super(s, dnsrecordtype, dnsrecordclass, flag);
        _ttl = i;
        _created = System.currentTimeMillis();
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof DNSRecord) && super.equals(obj) && sameValue((DNSRecord)obj);
    }

    long getExpirationTime(int i)
    {
        return _created + (long)(_ttl * i) * 10L;
    }

    public InetAddress getRecordSource()
    {
        return _source;
    }

    int getRemainingTTL(long l)
    {
        return (int)Math.max(0L, (getExpirationTime(100) - l) / 1000L);
    }

    public abstract ServiceEvent getServiceEvent(JmDNSImpl jmdnsimpl);

    public ServiceInfo getServiceInfo()
    {
        return getServiceInfo(false);
    }

    public abstract ServiceInfo getServiceInfo(boolean flag);

    public int getTTL()
    {
        return _ttl;
    }

    abstract boolean handleQuery(JmDNSImpl jmdnsimpl, long l);

    abstract boolean handleResponse(JmDNSImpl jmdnsimpl);

    public boolean isExpired(long l)
    {
        return getExpirationTime(100) <= l;
    }

    public abstract boolean isSingleValued();

    public boolean isStale(long l)
    {
        return getExpirationTime(50) <= l;
    }

    void resetTTL(DNSRecord dnsrecord)
    {
        _created = dnsrecord._created;
        _ttl = dnsrecord._ttl;
    }

    boolean sameType(DNSRecord dnsrecord)
    {
        return getRecordType() == dnsrecord.getRecordType();
    }

    abstract boolean sameValue(DNSRecord dnsrecord);

    public void setRecordSource(InetAddress inetaddress)
    {
        _source = inetaddress;
    }

    void setWillExpireSoon(long l)
    {
        _created = l;
        _ttl = 1;
    }

    boolean suppressedBy(DNSIncoming dnsincoming)
    {
        boolean flag1 = false;
        Iterator iterator;
        boolean flag;
        try
        {
            iterator = dnsincoming.getAllAnswers().iterator();
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            logger.log(Level.WARNING, (new StringBuilder()).append("suppressedBy() message ").append(dnsincoming).append(" exception ").toString(), arrayindexoutofboundsexception);
            return false;
        }
        flag = flag1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = suppressedBy((DNSRecord)iterator.next());
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_13;
_L1:
        return flag;
    }

    boolean suppressedBy(DNSRecord dnsrecord)
    {
        return equals(dnsrecord) && dnsrecord._ttl > _ttl / 2;
    }

    protected void toString(StringBuilder stringbuilder)
    {
        super.toString(stringbuilder);
        stringbuilder.append((new StringBuilder()).append(" ttl: '").append(getRemainingTTL(System.currentTimeMillis())).append("/").append(_ttl).append("'").toString());
    }

    abstract void write(DNSOutgoing.MessageOutputStream messageoutputstream);

}
