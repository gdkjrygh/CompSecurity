// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks.resolver;

import java.io.IOException;
import javax.jmdns.impl.DNSCache;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSQuestion;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl.tasks.resolver:
//            DNSResolverTask

public class ServiceInfoResolver extends DNSResolverTask
{

    private final ServiceInfoImpl _info;

    public ServiceInfoResolver(JmDNSImpl jmdnsimpl, ServiceInfoImpl serviceinfoimpl)
    {
        super(jmdnsimpl);
        _info = serviceinfoimpl;
        serviceinfoimpl.setDns(getDns());
        getDns().addListener(serviceinfoimpl, DNSQuestion.newQuestion(serviceinfoimpl.getQualifiedName(), DNSRecordType.TYPE_ANY, DNSRecordClass.CLASS_IN, false));
    }

    protected DNSOutgoing addAnswers(DNSOutgoing dnsoutgoing)
        throws IOException
    {
        DNSOutgoing dnsoutgoing1 = dnsoutgoing;
        dnsoutgoing = dnsoutgoing1;
        if (!_info.hasData())
        {
            long l = System.currentTimeMillis();
            dnsoutgoing1 = addAnswer(addAnswer(dnsoutgoing1, (DNSRecord)getDns().getCache().getDNSEntry(_info.getQualifiedName(), DNSRecordType.TYPE_SRV, DNSRecordClass.CLASS_IN), l), (DNSRecord)getDns().getCache().getDNSEntry(_info.getQualifiedName(), DNSRecordType.TYPE_TXT, DNSRecordClass.CLASS_IN), l);
            dnsoutgoing = dnsoutgoing1;
            if (_info.getServer().length() > 0)
            {
                dnsoutgoing = addAnswer(addAnswer(dnsoutgoing1, (DNSRecord)getDns().getCache().getDNSEntry(_info.getServer(), DNSRecordType.TYPE_A, DNSRecordClass.CLASS_IN), l), (DNSRecord)getDns().getCache().getDNSEntry(_info.getServer(), DNSRecordType.TYPE_AAAA, DNSRecordClass.CLASS_IN), l);
            }
        }
        return dnsoutgoing;
    }

    protected DNSOutgoing addQuestions(DNSOutgoing dnsoutgoing)
        throws IOException
    {
        DNSOutgoing dnsoutgoing1 = dnsoutgoing;
        dnsoutgoing = dnsoutgoing1;
        if (!_info.hasData())
        {
            dnsoutgoing1 = addQuestion(addQuestion(dnsoutgoing1, DNSQuestion.newQuestion(_info.getQualifiedName(), DNSRecordType.TYPE_SRV, DNSRecordClass.CLASS_IN, false)), DNSQuestion.newQuestion(_info.getQualifiedName(), DNSRecordType.TYPE_TXT, DNSRecordClass.CLASS_IN, false));
            dnsoutgoing = dnsoutgoing1;
            if (_info.getServer().length() > 0)
            {
                dnsoutgoing = addQuestion(addQuestion(dnsoutgoing1, DNSQuestion.newQuestion(_info.getServer(), DNSRecordType.TYPE_A, DNSRecordClass.CLASS_IN, false)), DNSQuestion.newQuestion(_info.getServer(), DNSRecordType.TYPE_AAAA, DNSRecordClass.CLASS_IN, false));
            }
        }
        return dnsoutgoing;
    }

    public boolean cancel()
    {
        boolean flag = super.cancel();
        if (!_info.isPersistent())
        {
            getDns().removeListener(_info);
        }
        return flag;
    }

    protected String description()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("querying service info: ");
        String s;
        if (_info != null)
        {
            s = _info.getQualifiedName();
        } else
        {
            s = "null";
        }
        return stringbuilder.append(s).toString();
    }

    public String getName()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("ServiceInfoResolver(");
        String s;
        if (getDns() != null)
        {
            s = getDns().getName();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(")").toString();
    }
}
