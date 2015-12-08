// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns;

import java.util.EventObject;

// Referenced classes of package javax.jmdns:
//            JmDNS, ServiceInfo

public abstract class ServiceEvent extends EventObject
    implements Cloneable
{

    public ServiceEvent(Object obj)
    {
        super(obj);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public ServiceEvent clone()
    {
        ServiceEvent serviceevent;
        try
        {
            serviceevent = (ServiceEvent)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return serviceevent;
    }

    public abstract JmDNS getDNS();

    public abstract ServiceInfo getInfo();

    public abstract String getName();

    public abstract String getType();
}
