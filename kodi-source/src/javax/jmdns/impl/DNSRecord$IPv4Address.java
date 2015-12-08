// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.net.Inet4Address;
import java.net.InetAddress;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSRecord, ServiceInfoImpl

public static class ss extends ss
{

    public ServiceInfo getServiceInfo(boolean flag)
    {
        ServiceInfoImpl serviceinfoimpl = (ServiceInfoImpl)super.erviceInfo(flag);
        serviceinfoimpl.addAddress((Inet4Address)_addr);
        return serviceinfoimpl;
    }

    void write(putStream putstream)
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
            putstream.writeBytes(abyte0, 0, abyte0.length);
        }
    }

    ss(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, InetAddress inetaddress)
    {
        super(s, DNSRecordType.TYPE_A, dnsrecordclass, flag, i, inetaddress);
    }

    ss(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, byte abyte0[])
    {
        super(s, DNSRecordType.TYPE_A, dnsrecordclass, flag, i, abyte0);
    }
}
