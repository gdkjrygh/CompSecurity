// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns;

import java.util.EventListener;

// Referenced classes of package javax.jmdns:
//            ServiceEvent

public interface ServiceListener
    extends EventListener
{

    public abstract void serviceAdded(ServiceEvent serviceevent);

    public abstract void serviceRemoved(ServiceEvent serviceevent);

    public abstract void serviceResolved(ServiceEvent serviceevent);
}
