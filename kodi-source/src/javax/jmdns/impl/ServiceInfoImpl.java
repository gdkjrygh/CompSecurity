// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;

// Referenced classes of package javax.jmdns.impl:
//            DNSListener, DNSStatefulObject, DNSRecord, HostInfo, 
//            DNSEntry, ServiceEventImpl, JmDNSImpl, DNSCache

public class ServiceInfoImpl extends ServiceInfo
    implements DNSListener, DNSStatefulObject
{
    private static final class ServiceInfoState extends DNSStatefulObject.DefaultImplementation
    {

        private final ServiceInfoImpl _info;

        public void setDns(JmDNSImpl jmdnsimpl)
        {
            super.setDns(jmdnsimpl);
        }

        protected void setTask(DNSTask dnstask)
        {
            super.setTask(dnstask);
            if (_task != null || !_info.needTextAnnouncing())
            {
                break MISSING_BLOCK_LABEL_86;
            }
            lock();
            if (_task == null && _info.needTextAnnouncing())
            {
                if (_state.isAnnounced())
                {
                    setState(DNSState.ANNOUNCING_1);
                    if (getDns() != null)
                    {
                        getDns().startAnnouncer();
                    }
                }
                _info.setNeedTextAnnouncing(false);
            }
            unlock();
            return;
            dnstask;
            unlock();
            throw dnstask;
        }

        public ServiceInfoState(ServiceInfoImpl serviceinfoimpl)
        {
            _info = serviceinfoimpl;
        }
    }


    private static Logger logger = Logger.getLogger(javax/jmdns/impl/ServiceInfoImpl.getName());
    private String _application;
    private String _domain;
    private final Set _ipv4Addresses;
    private final Set _ipv6Addresses;
    private transient String _key;
    private String _name;
    private boolean _needTextAnnouncing;
    private boolean _persistent;
    private int _port;
    private int _priority;
    private Map _props;
    private String _protocol;
    private String _server;
    private final ServiceInfoState _state;
    private String _subtype;
    private byte _text[];
    private int _weight;

    public ServiceInfoImpl(String s, String s1, String s2, int i, int j, int k, boolean flag, 
            byte abyte0[])
    {
        this(decodeQualifiedNameMap(s, s1, s2), i, j, k, flag, abyte0);
    }

    ServiceInfoImpl(Map map, int i, int j, int k, boolean flag, String s)
    {
        this(map, i, j, k, flag, (byte[])null);
        _server = s;
        try
        {
            map = new ByteArrayOutputStream(s.length());
            writeUTF(map, s);
            _text = map.toByteArray();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder()).append("unexpected exception: ").append(map).toString());
        }
    }

    public ServiceInfoImpl(Map map, int i, int j, int k, boolean flag, Map map1)
    {
        this(map, i, j, k, flag, textFromProperties(map1));
    }

    ServiceInfoImpl(Map map, int i, int j, int k, boolean flag, byte abyte0[])
    {
        map = checkQualifiedNameMap(map);
        _domain = (String)map.get(javax.jmdns.ServiceInfo.Fields.Domain);
        _protocol = (String)map.get(javax.jmdns.ServiceInfo.Fields.Protocol);
        _application = (String)map.get(javax.jmdns.ServiceInfo.Fields.Application);
        _name = (String)map.get(javax.jmdns.ServiceInfo.Fields.Instance);
        _subtype = (String)map.get(javax.jmdns.ServiceInfo.Fields.Subtype);
        _port = i;
        _weight = j;
        _priority = k;
        _text = abyte0;
        setNeedTextAnnouncing(false);
        _state = new ServiceInfoState(this);
        _persistent = flag;
        _ipv4Addresses = Collections.synchronizedSet(new LinkedHashSet());
        _ipv6Addresses = Collections.synchronizedSet(new LinkedHashSet());
    }

    ServiceInfoImpl(ServiceInfo serviceinfo)
    {
        _ipv4Addresses = Collections.synchronizedSet(new LinkedHashSet());
        _ipv6Addresses = Collections.synchronizedSet(new LinkedHashSet());
        if (serviceinfo != null)
        {
            _domain = serviceinfo.getDomain();
            _protocol = serviceinfo.getProtocol();
            _application = serviceinfo.getApplication();
            _name = serviceinfo.getName();
            _subtype = serviceinfo.getSubtype();
            _port = serviceinfo.getPort();
            _weight = serviceinfo.getWeight();
            _priority = serviceinfo.getPriority();
            _text = serviceinfo.getTextBytes();
            _persistent = serviceinfo.isPersistent();
            Inet6Address ainet6address[] = serviceinfo.getInet6Addresses();
            int k = ainet6address.length;
            for (int i = 0; i < k; i++)
            {
                Inet6Address inet6address = ainet6address[i];
                _ipv6Addresses.add(inet6address);
            }

            serviceinfo = serviceinfo.getInet4Addresses();
            k = serviceinfo.length;
            for (int j = 0; j < k; j++)
            {
                Object obj = serviceinfo[j];
                _ipv4Addresses.add(obj);
            }

        }
        _state = new ServiceInfoState(this);
    }

    protected static Map checkQualifiedNameMap(Map map)
    {
        Object obj;
label0:
        {
            HashMap hashmap = new HashMap(5);
            String s;
            if (map.containsKey(javax.jmdns.ServiceInfo.Fields.Domain))
            {
                obj = (String)map.get(javax.jmdns.ServiceInfo.Fields.Domain);
            } else
            {
                obj = "local";
            }
            if (obj != null)
            {
                s = ((String) (obj));
                if (((String) (obj)).length() != 0)
                {
                    break label0;
                }
            }
            s = "local";
        }
label1:
        {
            obj = removeSeparators(s);
            hashmap.put(javax.jmdns.ServiceInfo.Fields.Domain, obj);
            if (map.containsKey(javax.jmdns.ServiceInfo.Fields.Protocol))
            {
                obj = (String)map.get(javax.jmdns.ServiceInfo.Fields.Protocol);
            } else
            {
                obj = "tcp";
            }
            if (obj != null)
            {
                s = ((String) (obj));
                if (((String) (obj)).length() != 0)
                {
                    break label1;
                }
            }
            s = "tcp";
        }
label2:
        {
            obj = removeSeparators(s);
            hashmap.put(javax.jmdns.ServiceInfo.Fields.Protocol, obj);
            if (map.containsKey(javax.jmdns.ServiceInfo.Fields.Application))
            {
                obj = (String)map.get(javax.jmdns.ServiceInfo.Fields.Application);
            } else
            {
                obj = "";
            }
            if (obj != null)
            {
                s = ((String) (obj));
                if (((String) (obj)).length() != 0)
                {
                    break label2;
                }
            }
            s = "";
        }
label3:
        {
            obj = removeSeparators(s);
            hashmap.put(javax.jmdns.ServiceInfo.Fields.Application, obj);
            if (map.containsKey(javax.jmdns.ServiceInfo.Fields.Instance))
            {
                obj = (String)map.get(javax.jmdns.ServiceInfo.Fields.Instance);
            } else
            {
                obj = "";
            }
            if (obj != null)
            {
                s = ((String) (obj));
                if (((String) (obj)).length() != 0)
                {
                    break label3;
                }
            }
            s = "";
        }
label4:
        {
            obj = removeSeparators(s);
            hashmap.put(javax.jmdns.ServiceInfo.Fields.Instance, obj);
            if (map.containsKey(javax.jmdns.ServiceInfo.Fields.Subtype))
            {
                map = (String)map.get(javax.jmdns.ServiceInfo.Fields.Subtype);
            } else
            {
                map = "";
            }
            if (map != null)
            {
                obj = map;
                if (map.length() != 0)
                {
                    break label4;
                }
            }
            obj = "";
        }
        map = removeSeparators(((String) (obj)));
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Subtype, map);
        return hashmap;
    }

    public static Map decodeQualifiedNameMap(String s, String s1, String s2)
    {
        s = decodeQualifiedNameMapForType(s);
        s.put(javax.jmdns.ServiceInfo.Fields.Instance, s1);
        s.put(javax.jmdns.ServiceInfo.Fields.Subtype, s2);
        return checkQualifiedNameMap(s);
    }

    public static Map decodeQualifiedNameMapForType(String s)
    {
        String s2;
        String s3;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        s3 = s;
        s5 = s.toLowerCase();
        s6 = s5;
        s2 = "";
        s8 = "";
        s9 = "";
        s7 = "";
        if (!s5.contains("in-addr.arpa") && !s5.contains("ip6.arpa")) goto _L2; else goto _L1
_L1:
        String s4;
        HashMap hashmap;
        int i;
        if (s5.contains("in-addr.arpa"))
        {
            i = s5.indexOf("in-addr.arpa");
        } else
        {
            i = s5.indexOf("ip6.arpa");
        }
        s4 = removeSeparators(s3.substring(0, i));
        s3 = s3.substring(i);
        s = "";
        s7 = s2;
_L4:
        hashmap = new HashMap(5);
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Domain, removeSeparators(s3));
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Protocol, s7);
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Application, removeSeparators(s));
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Instance, s4);
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Subtype, s8);
        return hashmap;
_L2:
        String s1;
label0:
        {
            if (!s5.contains("_") && s5.contains("."))
            {
                int j = s5.indexOf('.');
                s4 = removeSeparators(s3.substring(0, j));
                s3 = removeSeparators(s3.substring(j));
                s = "";
                s7 = s2;
                continue; /* Loop/switch isn't completed */
            }
            if (s5.startsWith("_"))
            {
                s4 = s5;
                s = s3;
                s1 = s9;
                if (!s5.startsWith("_services"))
                {
                    break label0;
                }
            }
            int k = s5.indexOf('.');
            s4 = s5;
            s = s3;
            s1 = s9;
            if (k > 0)
            {
                String s10 = s3.substring(0, k);
                s4 = s5;
                s = s3;
                s1 = s10;
                if (k + 1 < s5.length())
                {
                    s4 = s5.substring(k + 1);
                    s = s3.substring(k + 1);
                    s1 = s10;
                }
            }
        }
        int l = s4.lastIndexOf("._");
        if (l > 0)
        {
            l += 2;
            s2 = s.substring(l, s4.indexOf('.', l));
        }
        s5 = s7;
        if (s2.length() > 0)
        {
            int j1 = s4.indexOf((new StringBuilder()).append("_").append(s2.toLowerCase()).append(".").toString());
            int k1 = s2.length();
            int l1 = s4.length();
            int i1;
            if (s4.endsWith("."))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            s5 = s.substring(k1 + j1 + 2, l1 - i1);
            s6 = s.substring(0, j1 - 1);
        }
        i1 = s6.toLowerCase().indexOf("._sub");
        s = s6;
        s3 = s5;
        s4 = s1;
        s7 = s2;
        if (i1 > 0)
        {
            s8 = removeSeparators(s6.substring(0, i1));
            s = s6.substring(i1 + 5);
            s3 = s5;
            s4 = s1;
            s7 = s2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final boolean hasInetAddress()
    {
        return _ipv4Addresses.size() > 0 || _ipv6Addresses.size() > 0;
    }

    private static String removeSeparators(String s)
    {
        if (s == null)
        {
            s = "";
        } else
        {
            String s1 = s.trim();
            s = s1;
            if (s1.startsWith("."))
            {
                s = s1.substring(1);
            }
            s1 = s;
            if (s.startsWith("_"))
            {
                s1 = s.substring(1);
            }
            s = s1;
            if (s1.endsWith("."))
            {
                return s1.substring(0, s1.length() - 1);
            }
        }
        return s;
    }

    private static byte[] textFromProperties(Map map)
    {
        byte abyte0[] = null;
        if (map == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Iterator iterator;
        obj = new ByteArrayOutputStream(256);
        iterator = map.keySet().iterator();
_L12:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        String s;
        OutputStream outputstream;
        s = (String)iterator.next();
        abyte0 = ((byte []) (map.get(s)));
        outputstream = new ByteArrayOutputStream(100);
        writeUTF(outputstream, s);
        if (abyte0 != null) goto _L6; else goto _L5
_L5:
        outputstream = outputstream.toByteArray();
        if (outputstream.length <= 255) goto _L8; else goto _L7
_L7:
        obj = (new StringBuilder()).append("Cannot have individual values larger that 255 chars. Offending value: ").append(s);
        if (abyte0 == null) goto _L10; else goto _L9
_L9:
        map = "";
_L11:
        try
        {
            throw new IOException(((StringBuilder) (obj)).append(map).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder()).append("unexpected exception: ").append(map).toString());
        }
_L6:
label0:
        {
            if (!(abyte0 instanceof String))
            {
                break label0;
            }
            outputstream.write(61);
            writeUTF(outputstream, (String)abyte0);
        }
          goto _L5
label1:
        {
            if (!(abyte0 instanceof byte[]))
            {
                break label1;
            }
            byte abyte1[] = (byte[])(byte[])abyte0;
            if (abyte1.length <= 0)
            {
                break MISSING_BLOCK_LABEL_329;
            }
            outputstream.write(61);
            outputstream.write(abyte1, 0, abyte1.length);
        }
          goto _L5
        throw new IllegalArgumentException((new StringBuilder()).append("invalid property value: ").append(abyte0).toString());
_L10:
        map = (new StringBuilder()).append("=").append(abyte0).toString();
          goto _L11
_L8:
        ((ByteArrayOutputStream) (obj)).write((byte)outputstream.length);
        ((ByteArrayOutputStream) (obj)).write(outputstream, 0, outputstream.length);
          goto _L12
_L4:
        abyte0 = ((ByteArrayOutputStream) (obj)).toByteArray();
_L2:
        if (abyte0 != null && abyte0.length > 0)
        {
            return abyte0;
        } else
        {
            return DNSRecord.EMPTY_TXT;
        }
        abyte0 = null;
          goto _L5
    }

    static void writeUTF(OutputStream outputstream, String s)
        throws IOException
    {
        int i = 0;
        int j = s.length();
        while (i < j) 
        {
            char c = s.charAt(i);
            if (c >= '\001' && c <= '\177')
            {
                outputstream.write(c);
            } else
            if (c > '\u07FF')
            {
                outputstream.write(c >> 12 & 0xf | 0xe0);
                outputstream.write(c >> 6 & 0x3f | 0x80);
                outputstream.write(c >> 0 & 0x3f | 0x80);
            } else
            {
                outputstream.write(c >> 6 & 0x1f | 0xc0);
                outputstream.write(c >> 0 & 0x3f | 0x80);
            }
            i++;
        }
    }

    void _setText(byte abyte0[])
    {
        _text = abyte0;
        _props = null;
    }

    void addAddress(Inet4Address inet4address)
    {
        _ipv4Addresses.add(inet4address);
    }

    void addAddress(Inet6Address inet6address)
    {
        _ipv6Addresses.add(inet6address);
    }

    public boolean advanceState(DNSTask dnstask)
    {
        return _state.advanceState(dnstask);
    }

    public Collection answers(boolean flag, int i, HostInfo hostinfo)
    {
        ArrayList arraylist = new ArrayList();
        if (getSubtype().length() > 0)
        {
            arraylist.add(new DNSRecord.Pointer(getTypeWithSubtype(), DNSRecordClass.CLASS_IN, false, i, getQualifiedName()));
        }
        arraylist.add(new DNSRecord.Pointer(getType(), DNSRecordClass.CLASS_IN, false, i, getQualifiedName()));
        arraylist.add(new DNSRecord.Service(getQualifiedName(), DNSRecordClass.CLASS_IN, flag, i, _priority, _weight, _port, hostinfo.getName()));
        arraylist.add(new DNSRecord.Text(getQualifiedName(), DNSRecordClass.CLASS_IN, flag, i, getTextBytes()));
        return arraylist;
    }

    public void associateWithTask(DNSTask dnstask, DNSState dnsstate)
    {
        _state.associateWithTask(dnstask, dnsstate);
    }

    public boolean cancelState()
    {
        return _state.cancelState();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public volatile ServiceInfo clone()
    {
        return clone();
    }

    public ServiceInfoImpl clone()
    {
        ServiceInfoImpl serviceinfoimpl = new ServiceInfoImpl(getQualifiedNameMap(), _port, _weight, _priority, _persistent, _text);
        Object aobj[] = getInet6Addresses();
        int k = aobj.length;
        for (int i = 0; i < k; i++)
        {
            Inet6Address inet6address = aobj[i];
            serviceinfoimpl._ipv6Addresses.add(inet6address);
        }

        aobj = getInet4Addresses();
        k = aobj.length;
        for (int j = 0; j < k; j++)
        {
            Inet4Address inet4address = aobj[j];
            serviceinfoimpl._ipv4Addresses.add(inet4address);
        }

        return serviceinfoimpl;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ServiceInfoImpl) && getQualifiedName().equals(((ServiceInfoImpl)obj).getQualifiedName());
    }

    public String getApplication()
    {
        if (_application != null)
        {
            return _application;
        } else
        {
            return "";
        }
    }

    public JmDNSImpl getDns()
    {
        return _state.getDns();
    }

    public String getDomain()
    {
        if (_domain != null)
        {
            return _domain;
        } else
        {
            return "local";
        }
    }

    public String[] getHostAddresses()
    {
        Inet4Address ainet4address[] = getInet4Addresses();
        Inet6Address ainet6address[] = getInet6Addresses();
        String as[] = new String[ainet4address.length + ainet6address.length];
        for (int i = 0; i < ainet4address.length; i++)
        {
            as[i] = ainet4address[i].getHostAddress();
        }

        for (int j = 0; j < ainet6address.length; j++)
        {
            as[ainet4address.length + j] = (new StringBuilder()).append("[").append(ainet6address[j].getHostAddress()).append("]").toString();
        }

        return as;
    }

    public Inet4Address[] getInet4Addresses()
    {
        return (Inet4Address[])_ipv4Addresses.toArray(new Inet4Address[_ipv4Addresses.size()]);
    }

    public Inet6Address[] getInet6Addresses()
    {
        return (Inet6Address[])_ipv6Addresses.toArray(new Inet6Address[_ipv6Addresses.size()]);
    }

    public InetAddress[] getInetAddresses()
    {
        ArrayList arraylist = new ArrayList(_ipv4Addresses.size() + _ipv6Addresses.size());
        arraylist.addAll(_ipv4Addresses);
        arraylist.addAll(_ipv6Addresses);
        return (InetAddress[])arraylist.toArray(new InetAddress[arraylist.size()]);
    }

    public String getKey()
    {
        if (_key == null)
        {
            _key = getQualifiedName().toLowerCase();
        }
        return _key;
    }

    public String getName()
    {
        if (_name != null)
        {
            return _name;
        } else
        {
            return "";
        }
    }

    public int getPort()
    {
        return _port;
    }

    public int getPriority()
    {
        return _priority;
    }

    Map getProperties()
    {
        this;
        JVM INSTR monitorenter ;
        if (_props != null || getTextBytes() == null) goto _L2; else goto _L1
_L1:
        Hashtable hashtable = new Hashtable();
        int i = 0;
_L14:
        if (i >= getTextBytes().length) goto _L4; else goto _L3
_L3:
        byte abyte0[] = getTextBytes();
        int j;
        int k;
        j = i + 1;
        k = abyte0[i] & 0xff;
        if (k == 0) goto _L6; else goto _L5
_L5:
        if (j + k <= getTextBytes().length) goto _L7; else goto _L6
_L6:
        hashtable.clear();
_L4:
        _props = hashtable;
_L2:
        if (_props == null) goto _L9; else goto _L8
_L8:
        Object obj = _props;
_L15:
        this;
        JVM INSTR monitorexit ;
        return ((Map) (obj));
_L7:
        i = 0;
_L11:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        if (getTextBytes()[j + i] == 61)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        obj = readUTF(getTextBytes(), j, i);
        if (obj != null) goto _L13; else goto _L12
_L12:
        hashtable.clear();
          goto _L4
        obj;
_L16:
        logger.log(Level.WARNING, "Malformed TXT Field ", ((Throwable) (obj)));
          goto _L4
        obj;
        throw obj;
_L13:
        if (i != k)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        hashtable.put(obj, NO_VALUE);
        i = j;
          goto _L14
        i++;
        byte abyte1[] = new byte[k - i];
        System.arraycopy(getTextBytes(), j + i, abyte1, 0, k - i);
        hashtable.put(obj, abyte1);
        i = j + k;
          goto _L14
_L9:
        obj = Collections.emptyMap();
          goto _L15
        obj;
          goto _L16
    }

    public String getProtocol()
    {
        if (_protocol != null)
        {
            return _protocol;
        } else
        {
            return "tcp";
        }
    }

    public String getQualifiedName()
    {
        String s1 = getDomain();
        String s2 = getProtocol();
        Object obj = getApplication();
        String s = getName();
        StringBuilder stringbuilder = new StringBuilder();
        if (s.length() > 0)
        {
            s = (new StringBuilder()).append(s).append(".").toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (((String) (obj)).length() > 0)
        {
            s = (new StringBuilder()).append("_").append(((String) (obj))).append(".").toString();
        } else
        {
            s = "";
        }
        obj = stringbuilder.append(s);
        if (s2.length() > 0)
        {
            s = (new StringBuilder()).append("_").append(s2).append(".").toString();
        } else
        {
            s = "";
        }
        return ((StringBuilder) (obj)).append(s).append(s1).append(".").toString();
    }

    public Map getQualifiedNameMap()
    {
        HashMap hashmap = new HashMap(5);
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Domain, getDomain());
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Protocol, getProtocol());
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Application, getApplication());
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Instance, getName());
        hashmap.put(javax.jmdns.ServiceInfo.Fields.Subtype, getSubtype());
        return hashmap;
    }

    public String getServer()
    {
        if (_server != null)
        {
            return _server;
        } else
        {
            return "";
        }
    }

    public String getSubtype()
    {
        if (_subtype != null)
        {
            return _subtype;
        } else
        {
            return "";
        }
    }

    public byte[] getTextBytes()
    {
        if (_text != null && _text.length > 0)
        {
            return _text;
        } else
        {
            return DNSRecord.EMPTY_TXT;
        }
    }

    public String getType()
    {
        String s1 = getDomain();
        String s2 = getProtocol();
        String s = getApplication();
        StringBuilder stringbuilder = new StringBuilder();
        if (s.length() > 0)
        {
            s = (new StringBuilder()).append("_").append(s).append(".").toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (s2.length() > 0)
        {
            s = (new StringBuilder()).append("_").append(s2).append(".").toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(s1).append(".").toString();
    }

    public String getTypeWithSubtype()
    {
        String s = getSubtype();
        StringBuilder stringbuilder = new StringBuilder();
        if (s.length() > 0)
        {
            s = (new StringBuilder()).append("_").append(s.toLowerCase()).append("._sub.").toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(getType()).toString();
    }

    public int getWeight()
    {
        return _weight;
    }

    public boolean hasData()
    {
        this;
        JVM INSTR monitorenter ;
        if (getServer() == null || !hasInetAddress() || getTextBytes() == null) goto _L2; else goto _L1
_L1:
        int i = getTextBytes().length;
        if (i <= 0) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public int hashCode()
    {
        return getQualifiedName().hashCode();
    }

    public boolean isAnnounced()
    {
        return _state.isAnnounced();
    }

    public boolean isAnnouncing()
    {
        return _state.isAnnouncing();
    }

    public boolean isAssociatedWithTask(DNSTask dnstask, DNSState dnsstate)
    {
        return _state.isAssociatedWithTask(dnstask, dnsstate);
    }

    public boolean isPersistent()
    {
        return _persistent;
    }

    public boolean isProbing()
    {
        return _state.isProbing();
    }

    public boolean needTextAnnouncing()
    {
        return _needTextAnnouncing;
    }

    String readUTF(byte abyte0[], int i, int j)
    {
        StringBuffer stringbuffer;
        int k;
        stringbuffer = new StringBuffer();
        k = i;
_L12:
        if (k >= i + j) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        int j1;
        i1 = k + 1;
        j1 = abyte0[k] & 0xff;
        l = j1;
        k = i1;
        j1 >> 4;
        JVM INSTR tableswitch 0 14: default 124
    //                   0 164
    //                   1 164
    //                   2 164
    //                   3 164
    //                   4 164
    //                   5 164
    //                   6 164
    //                   7 164
    //                   8 124
    //                   9 124
    //                   10 124
    //                   11 124
    //                   12 134
    //                   13 134
    //                   14 176;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L3 _L3 _L3 _L3 _L5 _L5 _L6
_L3:
        if (i1 + 1 < j) goto _L8; else goto _L7
_L7:
        return null;
_L5:
        if (i1 >= j) goto _L7; else goto _L9
_L9:
        l = (j1 & 0x1f) << 6 | abyte0[i1] & 0x3f;
        k = i1 + 1;
_L4:
        stringbuffer.append((char)l);
        continue; /* Loop/switch isn't completed */
_L6:
        if (i1 + 2 >= j) goto _L7; else goto _L10
_L10:
        l = i1 + 1;
        i1 = abyte0[i1];
        k = l + 1;
        l = (j1 & 0xf) << 12 | (i1 & 0x3f) << 6 | abyte0[l] & 0x3f;
          goto _L4
_L8:
        l = (j1 & 0x3f) << 4 | abyte0[i1] & 0xf;
        k = i1 + 1;
          goto _L4
_L2:
        return stringbuffer.toString();
        if (true) goto _L12; else goto _L11
_L11:
    }

    public boolean recoverState()
    {
        return _state.recoverState();
    }

    public void removeAssociationWithTask(DNSTask dnstask)
    {
        _state.removeAssociationWithTask(dnstask);
    }

    public boolean revertState()
    {
        return _state.revertState();
    }

    public void setDns(JmDNSImpl jmdnsimpl)
    {
        _state.setDns(jmdnsimpl);
    }

    void setName(String s)
    {
        _name = s;
        _key = null;
    }

    public void setNeedTextAnnouncing(boolean flag)
    {
        _needTextAnnouncing = flag;
        if (_needTextAnnouncing)
        {
            _state.setTask(null);
        }
    }

    void setServer(String s)
    {
        _server = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("[").append(getClass().getSimpleName()).append("@").append(System.identityHashCode(this)).append(" ").toString());
        stringbuilder.append("name: '");
        StringBuilder stringbuilder1 = new StringBuilder();
        Object obj;
        if (getName().length() > 0)
        {
            obj = (new StringBuilder()).append(getName()).append(".").toString();
        } else
        {
            obj = "";
        }
        stringbuilder.append(stringbuilder1.append(((String) (obj))).append(getTypeWithSubtype()).toString());
        stringbuilder.append("' address: '");
        obj = getInetAddresses();
        if (obj.length > 0)
        {
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append(obj[i]);
                stringbuilder.append(':');
                stringbuilder.append(getPort());
                stringbuilder.append(' ');
            }

        } else
        {
            stringbuilder.append("(null):");
            stringbuilder.append(getPort());
        }
        stringbuilder.append("' status: '");
        stringbuilder.append(_state.toString());
        if (isPersistent())
        {
            obj = "' is persistent,";
        } else
        {
            obj = "',";
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(" has ");
        if (hasData())
        {
            obj = "";
        } else
        {
            obj = "NO ";
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("data");
        if (getTextBytes().length > 0)
        {
            obj = getProperties();
            if (!((Map) (obj)).isEmpty())
            {
                stringbuilder.append("\n");
                String s;
                for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\t").append(s).append(": ").append(new String((byte[])((Map) (obj)).get(s))).append("\n").toString()))
                {
                    s = (String)iterator.next();
                }

            } else
            {
                stringbuilder.append(" empty");
            }
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void updateRecord(DNSCache dnscache, long l, DNSEntry dnsentry)
    {
        if (!(dnsentry instanceof DNSRecord) || dnsentry.isExpired(l)) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
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
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_AAAA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_SRV.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_TXT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_PTR.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.javax.jmdns.impl.constants.DNSRecordType[dnsentry.getRecordType().ordinal()];
        JVM INSTR tableswitch 1 5: default 68
    //                   1 136
    //                   2 182
    //                   3 228
    //                   4 454
    //                   5 491;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        boolean flag = flag1;
_L10:
        if (flag && hasData())
        {
            dnscache = getDns();
            if (dnscache != null)
            {
                dnsentry = ((DNSRecord)dnsentry).getServiceEvent(dnscache);
                dnscache.handleServiceResolved(new ServiceEventImpl(dnscache, dnsentry.getType(), dnsentry.getName(), this));
            }
        }
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
_L2:
        return;
_L4:
        flag = flag1;
        if (dnsentry.getName().equalsIgnoreCase(getServer()))
        {
            _ipv4Addresses.add((Inet4Address)((DNSRecord.Address)dnsentry).getAddress());
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        flag = flag1;
        if (dnsentry.getName().equalsIgnoreCase(getServer()))
        {
            _ipv6Addresses.add((Inet6Address)((DNSRecord.Address)dnsentry).getAddress());
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        flag = flag1;
        if (!dnsentry.getName().equalsIgnoreCase(getQualifiedName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        DNSRecord.Service service = (DNSRecord.Service)dnsentry;
        if (_server == null || !_server.equalsIgnoreCase(service.getServer()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _server = service.getServer();
        _port = service.getPort();
        _weight = service.getWeight();
        _priority = service.getPriority();
        if (flag)
        {
            _ipv4Addresses.clear();
            _ipv6Addresses.clear();
            for (Iterator iterator = dnscache.getDNSEntryList(_server, DNSRecordType.TYPE_A, DNSRecordClass.CLASS_IN).iterator(); iterator.hasNext(); updateRecord(dnscache, l, (DNSEntry)iterator.next())) { }
            Iterator iterator1 = dnscache.getDNSEntryList(_server, DNSRecordType.TYPE_AAAA, DNSRecordClass.CLASS_IN).iterator();
            do
            {
                flag = flag1;
                if (!iterator1.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                updateRecord(dnscache, l, (DNSEntry)iterator1.next());
            } while (true);
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
_L7:
        flag = flag1;
        if (dnsentry.getName().equalsIgnoreCase(getQualifiedName()))
        {
            _text = ((DNSRecord.Text)dnsentry).getText();
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        flag = flag1;
        if (getSubtype().length() == 0)
        {
            flag = flag1;
            if (dnsentry.getSubtype().length() != 0)
            {
                _subtype = dnsentry.getSubtype();
                flag = true;
            }
        }
        if (true) goto _L10; else goto _L9
_L9:
        dnscache;
        this;
        JVM INSTR monitorexit ;
        throw dnscache;
    }

    public boolean waitForAnnounced(long l)
    {
        return _state.waitForAnnounced(l);
    }

    public boolean waitForCanceled(long l)
    {
        return _state.waitForCanceled(l);
    }

}
