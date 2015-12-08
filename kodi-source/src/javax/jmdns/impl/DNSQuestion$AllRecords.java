// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Map;
import java.util.Set;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSQuestion, JmDNSImpl, HostInfo, ServiceInfoImpl, 
//            DNSEntry

private static class s extends DNSQuestion
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
            (new it>(getName(), DNSRecordType.TYPE_PTR, getRecordClass(), isUnique())).addAnswers(jmdnsimpl, set);
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

    s(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
    {
        super(s, dnsrecordtype, dnsrecordclass, flag);
    }
}
