// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;

import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.status:
//            Status, StatusListener

public interface StatusManager
{

    public abstract void add(Status status);

    public abstract void add(StatusListener statuslistener);

    public abstract boolean addUniquely(StatusListener statuslistener, Object obj);

    public abstract List getCopyOfStatusList();

    public abstract List getCopyOfStatusListenerList();

    public abstract void remove(StatusListener statuslistener);
}
