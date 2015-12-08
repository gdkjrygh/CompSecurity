// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.NetworkTopologyDiscovery;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;

// Referenced classes of package javax.jmdns.impl:
//            DNSStatefulObject, JmDNSImpl

public class HostInfo
    implements DNSStatefulObject
{
    private static final class HostInfoState extends DNSStatefulObject.DefaultImplementation
    {

        public HostInfoState(JmDNSImpl jmdnsimpl)
        {
            setDns(jmdnsimpl);
        }
    }


    private static Logger logger = Logger.getLogger(javax/jmdns/impl/HostInfo.getName());
    protected InetAddress _address;
    protected NetworkInterface _interfaze;
    protected String _name;
    private final HostInfoState _state;
    private int hostNameCount;

    private HostInfo(InetAddress inetaddress, String s, JmDNSImpl jmdnsimpl)
    {
        _state = new HostInfoState(jmdnsimpl);
        _address = inetaddress;
        _name = s;
        if (inetaddress == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        _interfaze = NetworkInterface.getByInetAddress(inetaddress);
        return;
        inetaddress;
        logger.log(Level.SEVERE, "LocalHostInfo() exception ", inetaddress);
        return;
    }

    private DNSRecord.Address getDNS4AddressRecord(boolean flag, int i)
    {
        if ((getInetAddress() instanceof Inet4Address) || (getInetAddress() instanceof Inet6Address) && ((Inet6Address)getInetAddress()).isIPv4CompatibleAddress())
        {
            return new DNSRecord.IPv4Address(getName(), DNSRecordClass.CLASS_IN, flag, i, getInetAddress());
        } else
        {
            return null;
        }
    }

    private DNSRecord.Pointer getDNS4ReverseAddressRecord(boolean flag, int i)
    {
        if (getInetAddress() instanceof Inet4Address)
        {
            return new DNSRecord.Pointer((new StringBuilder()).append(getInetAddress().getHostAddress()).append(".in-addr.arpa.").toString(), DNSRecordClass.CLASS_IN, flag, i, getName());
        }
        if ((getInetAddress() instanceof Inet6Address) && ((Inet6Address)getInetAddress()).isIPv4CompatibleAddress())
        {
            byte abyte0[] = getInetAddress().getAddress();
            String s = (new StringBuilder()).append(abyte0[12] & 0xff).append(".").append(abyte0[13] & 0xff).append(".").append(abyte0[14] & 0xff).append(".").append(abyte0[15] & 0xff).toString();
            return new DNSRecord.Pointer((new StringBuilder()).append(s).append(".in-addr.arpa.").toString(), DNSRecordClass.CLASS_IN, flag, i, getName());
        } else
        {
            return null;
        }
    }

    private DNSRecord.Address getDNS6AddressRecord(boolean flag, int i)
    {
        if (getInetAddress() instanceof Inet6Address)
        {
            return new DNSRecord.IPv6Address(getName(), DNSRecordClass.CLASS_IN, flag, i, getInetAddress());
        } else
        {
            return null;
        }
    }

    private DNSRecord.Pointer getDNS6ReverseAddressRecord(boolean flag, int i)
    {
        if (getInetAddress() instanceof Inet6Address)
        {
            return new DNSRecord.Pointer((new StringBuilder()).append(getInetAddress().getHostAddress()).append(".ip6.arpa.").toString(), DNSRecordClass.CLASS_IN, flag, i, getName());
        } else
        {
            return null;
        }
    }

    private static InetAddress loopbackAddress()
    {
        InetAddress inetaddress;
        try
        {
            inetaddress = InetAddress.getByName(null);
        }
        catch (UnknownHostException unknownhostexception)
        {
            return null;
        }
        return inetaddress;
    }

    public static HostInfo newHostInfo(InetAddress inetaddress, JmDNSImpl jmdnsimpl, String s)
    {
        InetAddress inetaddress1 = inetaddress;
        if (inetaddress1 != null) goto _L2; else goto _L1
_L1:
        Object obj = System.getProperty("net.mdns.interface");
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = InetAddress.getByName(((String) (obj)));
_L12:
        Object obj2 = ((InetAddress) (obj)).getHostName();
        Object obj1;
        obj1 = obj2;
        inetaddress1 = ((InetAddress) (obj));
        if (!((InetAddress) (obj)).isLoopbackAddress())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        logger.warning("Could not find any address beside the loopback.");
        inetaddress1 = ((InetAddress) (obj));
        obj1 = obj2;
_L14:
        if (((String) (obj1)).contains("in-addr.arpa")) goto _L6; else goto _L5
_L5:
        obj = obj1;
        obj2 = inetaddress1;
        if (!((String) (obj1)).equals(inetaddress1.getHostAddress())) goto _L7; else goto _L6
_L6:
        if (s == null) goto _L9; else goto _L8
_L8:
        int i = s.length();
        if (i <= 0) goto _L9; else goto _L10
_L10:
        obj2 = inetaddress1;
        obj = s;
_L7:
        inetaddress = ((String) (obj)).replace('.', '-');
        return new HostInfo(((InetAddress) (obj2)), (new StringBuilder()).append(inetaddress).append(".local.").toString(), jmdnsimpl);
_L4:
        inetaddress1 = InetAddress.getLocalHost();
        obj = inetaddress1;
        if (!inetaddress1.isLoopbackAddress()) goto _L12; else goto _L11
_L11:
        obj1 = javax.jmdns.NetworkTopologyDiscovery.Factory.getInstance().getInetAddresses();
        obj = inetaddress1;
        if (obj1.length <= 0) goto _L12; else goto _L13
_L13:
        obj = obj1[0];
          goto _L12
_L2:
        obj1 = inetaddress1.getHostName();
          goto _L14
_L9:
        obj = inetaddress1.getHostAddress();
        obj2 = inetaddress1;
          goto _L7
        IOException ioexception;
        ioexception;
        logger.log(Level.WARNING, (new StringBuilder()).append("Could not intialize the host network interface on ").append(inetaddress).append("because of an error: ").append(ioexception.getMessage()).toString(), ioexception);
        obj2 = loopbackAddress();
        if (s != null && s.length() > 0)
        {
            ioexception = s;
        } else
        {
            ioexception = "computer";
        }
          goto _L7
    }

    public boolean advanceState(DNSTask dnstask)
    {
        return _state.advanceState(dnstask);
    }

    public Collection answers(boolean flag, int i)
    {
        ArrayList arraylist = new ArrayList();
        DNSRecord.Address address = getDNS4AddressRecord(flag, i);
        if (address != null)
        {
            arraylist.add(address);
        }
        address = getDNS6AddressRecord(flag, i);
        if (address != null)
        {
            arraylist.add(address);
        }
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

    public boolean closeState()
    {
        return _state.closeState();
    }

    public boolean conflictWithRecord(DNSRecord.Address address)
    {
        boolean flag1 = false;
        DNSRecord.Address address1 = getDNSAddressRecord(address.getRecordType(), address.isUnique(), 3600);
        boolean flag = flag1;
        if (address1 != null)
        {
            flag = flag1;
            if (address1.sameType(address))
            {
                flag = flag1;
                if (address1.sameName(address))
                {
                    flag = flag1;
                    if (!address1.sameValue(address))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    DNSRecord.Address getDNSAddressRecord(DNSRecordType dnsrecordtype, boolean flag, int i)
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
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_A6.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_AAAA.ordinal()] = 3;
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
            return null;

        case 1: // '\001'
            return getDNS4AddressRecord(flag, i);

        case 2: // '\002'
        case 3: // '\003'
            return getDNS6AddressRecord(flag, i);
        }
    }

    DNSRecord.Pointer getDNSReverseAddressRecord(DNSRecordType dnsrecordtype, boolean flag, int i)
    {
        switch (_cls1..SwitchMap.javax.jmdns.impl.constants.DNSRecordType[dnsrecordtype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return getDNS4ReverseAddressRecord(flag, i);

        case 2: // '\002'
        case 3: // '\003'
            return getDNS6ReverseAddressRecord(flag, i);
        }
    }

    Inet4Address getInet4Address()
    {
        if (getInetAddress() instanceof Inet4Address)
        {
            return (Inet4Address)_address;
        } else
        {
            return null;
        }
    }

    Inet6Address getInet6Address()
    {
        if (getInetAddress() instanceof Inet6Address)
        {
            return (Inet6Address)_address;
        } else
        {
            return null;
        }
    }

    public InetAddress getInetAddress()
    {
        return _address;
    }

    public NetworkInterface getInterface()
    {
        return _interfaze;
    }

    public String getName()
    {
        return _name;
    }

    String incrementHostName()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        String s;
        int i;
        int j;
        hostNameCount = hostNameCount + 1;
        i = _name.indexOf(".local.");
        j = _name.lastIndexOf('-');
        obj = new StringBuilder();
        s = _name;
        if (j != -1)
        {
            i = j;
        }
        _name = ((StringBuilder) (obj)).append(s.substring(0, i)).append("-").append(hostNameCount).append(".local.").toString();
        obj = _name;
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isAnnounced()
    {
        return _state.isAnnounced();
    }

    public boolean isAssociatedWithTask(DNSTask dnstask, DNSState dnsstate)
    {
        return _state.isAssociatedWithTask(dnstask, dnsstate);
    }

    public boolean isCanceled()
    {
        return _state.isCanceled();
    }

    public boolean isCanceling()
    {
        return _state.isCanceling();
    }

    public boolean isClosed()
    {
        return _state.isClosed();
    }

    public boolean isClosing()
    {
        return _state.isClosing();
    }

    public boolean isProbing()
    {
        return _state.isProbing();
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

    boolean shouldIgnorePacket(DatagramPacket datagrampacket)
    {
        boolean flag1 = false;
        boolean flag3 = false;
        boolean flag = flag1;
        if (getInetAddress() != null)
        {
            datagrampacket = datagrampacket.getAddress();
            flag = flag1;
            if (datagrampacket != null)
            {
                boolean flag2 = flag3;
                if (datagrampacket.isLinkLocalAddress())
                {
                    flag2 = flag3;
                    if (!getInetAddress().isLinkLocalAddress())
                    {
                        flag2 = true;
                    }
                }
                flag = flag2;
                if (datagrampacket.isLoopbackAddress())
                {
                    flag = flag2;
                    if (!getInetAddress().isLoopbackAddress())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(1024);
        stringbuilder.append("local host info[");
        String s;
        if (getName() != null)
        {
            s = getName();
        } else
        {
            s = "no name";
        }
        stringbuilder.append(s);
        stringbuilder.append(", ");
        if (getInterface() != null)
        {
            s = getInterface().getDisplayName();
        } else
        {
            s = "???";
        }
        stringbuilder.append(s);
        stringbuilder.append(":");
        if (getInetAddress() != null)
        {
            s = getInetAddress().getHostAddress();
        } else
        {
            s = "no address";
        }
        stringbuilder.append(s);
        stringbuilder.append(", ");
        stringbuilder.append(_state);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public boolean waitForAnnounced(long l)
    {
        return _state.waitForAnnounced(l);
    }

    public boolean waitForCanceled(long l)
    {
        if (_address == null)
        {
            return true;
        } else
        {
            return _state.waitForCanceled(l);
        }
    }

}
