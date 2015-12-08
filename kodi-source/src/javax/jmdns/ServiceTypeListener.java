// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns;

import java.util.EventListener;

// Referenced classes of package javax.jmdns:
//            ServiceEvent

public interface ServiceTypeListener
    extends EventListener
{

    public abstract void serviceTypeAdded(ServiceEvent serviceevent);

    public abstract void subTypeForServiceTypeAdded(ServiceEvent serviceevent);
}
