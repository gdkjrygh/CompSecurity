// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Map;
import java.util.Set;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSQuestion, JmDNSImpl, ServiceInfoImpl, HostInfo

private static class rdClass extends DNSQuestion
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

    rdClass(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
    {
        super(s, dnsrecordtype, dnsrecordclass, flag);
    }
}
