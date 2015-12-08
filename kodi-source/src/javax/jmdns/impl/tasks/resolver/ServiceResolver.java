// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks.resolver;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSQuestion;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl.tasks.resolver:
//            DNSResolverTask

public class ServiceResolver extends DNSResolverTask
{

    private final String _type;

    public ServiceResolver(JmDNSImpl jmdnsimpl, String s)
    {
        super(jmdnsimpl);
        _type = s;
    }

    protected DNSOutgoing addAnswers(DNSOutgoing dnsoutgoing)
        throws IOException
    {
        long l = System.currentTimeMillis();
        for (Iterator iterator = getDns().getServices().values().iterator(); iterator.hasNext();)
        {
            ServiceInfo serviceinfo = (ServiceInfo)iterator.next();
            dnsoutgoing = addAnswer(dnsoutgoing, new javax.jmdns.impl.DNSRecord.Pointer(serviceinfo.getType(), DNSRecordClass.CLASS_IN, false, 3600, serviceinfo.getQualifiedName()), l);
        }

        return dnsoutgoing;
    }

    protected DNSOutgoing addQuestions(DNSOutgoing dnsoutgoing)
        throws IOException
    {
        return addQuestion(dnsoutgoing, DNSQuestion.newQuestion(_type, DNSRecordType.TYPE_PTR, DNSRecordClass.CLASS_IN, false));
    }

    protected String description()
    {
        return "querying service";
    }

    public String getName()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("ServiceResolver(");
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
