// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks;

import java.io.IOException;
import java.util.TimerTask;
import javax.jmdns.impl.DNSIncoming;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSQuestion;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.JmDNSImpl;

public abstract class DNSTask extends TimerTask
{

    private final JmDNSImpl _jmDNSImpl;

    protected DNSTask(JmDNSImpl jmdnsimpl)
    {
        _jmDNSImpl = jmdnsimpl;
    }

    public DNSOutgoing addAnswer(DNSOutgoing dnsoutgoing, DNSIncoming dnsincoming, DNSRecord dnsrecord)
        throws IOException
    {
        try
        {
            dnsoutgoing.addAnswer(dnsincoming, dnsrecord);
        }
        catch (IOException ioexception)
        {
            int i = dnsoutgoing.getFlags();
            boolean flag = dnsoutgoing.isMulticast();
            int j = dnsoutgoing.getMaxUDPPayload();
            int k = dnsoutgoing.getId();
            dnsoutgoing.setFlags(i | 0x200);
            dnsoutgoing.setId(k);
            _jmDNSImpl.send(dnsoutgoing);
            dnsoutgoing = new DNSOutgoing(i, flag, j);
            dnsoutgoing.addAnswer(dnsincoming, dnsrecord);
            return dnsoutgoing;
        }
        return dnsoutgoing;
    }

    public DNSOutgoing addAnswer(DNSOutgoing dnsoutgoing, DNSRecord dnsrecord, long l)
        throws IOException
    {
        try
        {
            dnsoutgoing.addAnswer(dnsrecord, l);
        }
        catch (IOException ioexception)
        {
            int i = dnsoutgoing.getFlags();
            boolean flag = dnsoutgoing.isMulticast();
            int j = dnsoutgoing.getMaxUDPPayload();
            int k = dnsoutgoing.getId();
            dnsoutgoing.setFlags(i | 0x200);
            dnsoutgoing.setId(k);
            _jmDNSImpl.send(dnsoutgoing);
            dnsoutgoing = new DNSOutgoing(i, flag, j);
            dnsoutgoing.addAnswer(dnsrecord, l);
            return dnsoutgoing;
        }
        return dnsoutgoing;
    }

    public DNSOutgoing addAuthoritativeAnswer(DNSOutgoing dnsoutgoing, DNSRecord dnsrecord)
        throws IOException
    {
        try
        {
            dnsoutgoing.addAuthorativeAnswer(dnsrecord);
        }
        catch (IOException ioexception)
        {
            int i = dnsoutgoing.getFlags();
            boolean flag = dnsoutgoing.isMulticast();
            int j = dnsoutgoing.getMaxUDPPayload();
            int k = dnsoutgoing.getId();
            dnsoutgoing.setFlags(i | 0x200);
            dnsoutgoing.setId(k);
            _jmDNSImpl.send(dnsoutgoing);
            dnsoutgoing = new DNSOutgoing(i, flag, j);
            dnsoutgoing.addAuthorativeAnswer(dnsrecord);
            return dnsoutgoing;
        }
        return dnsoutgoing;
    }

    public DNSOutgoing addQuestion(DNSOutgoing dnsoutgoing, DNSQuestion dnsquestion)
        throws IOException
    {
        try
        {
            dnsoutgoing.addQuestion(dnsquestion);
        }
        catch (IOException ioexception)
        {
            int i = dnsoutgoing.getFlags();
            boolean flag = dnsoutgoing.isMulticast();
            int j = dnsoutgoing.getMaxUDPPayload();
            int k = dnsoutgoing.getId();
            dnsoutgoing.setFlags(i | 0x200);
            dnsoutgoing.setId(k);
            _jmDNSImpl.send(dnsoutgoing);
            dnsoutgoing = new DNSOutgoing(i, flag, j);
            dnsoutgoing.addQuestion(dnsquestion);
            return dnsoutgoing;
        }
        return dnsoutgoing;
    }

    public JmDNSImpl getDns()
    {
        return _jmDNSImpl;
    }

    public abstract String getName();

    public String toString()
    {
        return getName();
    }
}
