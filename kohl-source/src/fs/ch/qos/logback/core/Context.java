// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core;

import fs.ch.qos.logback.core.spi.PropertyContainer;
import fs.ch.qos.logback.core.status.StatusManager;
import java.util.concurrent.ExecutorService;

public interface Context
    extends PropertyContainer
{

    public abstract long getBirthTime();

    public abstract Object getConfigurationLock();

    public abstract ExecutorService getExecutorService();

    public abstract String getName();

    public abstract Object getObject(String s);

    public abstract String getProperty(String s);

    public abstract StatusManager getStatusManager();

    public abstract void putObject(String s, Object obj);

    public abstract void putProperty(String s, String s1);

    public abstract void setName(String s);
}
