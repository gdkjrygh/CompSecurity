// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;

// Referenced classes of package javax.jmdns.impl:
//            ServiceInfoImpl, JmDNSImpl

public class ServiceEventImpl extends ServiceEvent
{

    private final ServiceInfo _info;
    private final String _name;
    private final String _type;

    public ServiceEventImpl(JmDNSImpl jmdnsimpl, String s, String s1, ServiceInfo serviceinfo)
    {
        super(jmdnsimpl);
        _type = s;
        _name = s1;
        _info = serviceinfo;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public volatile ServiceEvent clone()
    {
        return clone();
    }

    public ServiceEventImpl clone()
    {
        ServiceInfoImpl serviceinfoimpl = new ServiceInfoImpl(getInfo());
        return new ServiceEventImpl((JmDNSImpl)getDNS(), getType(), getName(), serviceinfoimpl);
    }

    public JmDNS getDNS()
    {
        return (JmDNS)getSource();
    }

    public ServiceInfo getInfo()
    {
        return _info;
    }

    public String getName()
    {
        return _name;
    }

    public String getType()
    {
        return _type;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("[").append(getClass().getSimpleName()).append("@").append(System.identityHashCode(this)).append(" ").toString());
        stringbuilder.append("\n\tname: '");
        stringbuilder.append(getName());
        stringbuilder.append("' type: '");
        stringbuilder.append(getType());
        stringbuilder.append("' info: '");
        stringbuilder.append(getInfo());
        stringbuilder.append("']");
        return stringbuilder.toString();
    }
}
