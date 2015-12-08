// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSRecord, ServiceInfoImpl, ServiceEventImpl, JmDNSImpl

public static class _text extends DNSRecord
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
        if (dnsrecord instanceof _text) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        dnsrecord = (_text)dnsrecord;
        if ((_text != null || ((_text) (dnsrecord))._text == null) && ((_text) (dnsrecord))._text.length == _text.length)
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
                    if (((_text) (dnsrecord))._text[j] != _text[j])
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
        super.toString(stringbuilder);
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

    void write(sageOutputStream sageoutputstream)
    {
        sageoutputstream.writeBytes(_text, 0, _text.length);
    }

    public cordClass(String s, DNSRecordClass dnsrecordclass, boolean flag, int i, byte abyte0[])
    {
        super(s, DNSRecordType.TYPE_TXT, dnsrecordclass, flag, i);
        if (abyte0 == null || abyte0.length <= 0)
        {
            abyte0 = EMPTY_TXT;
        }
        _text = abyte0;
    }
}
