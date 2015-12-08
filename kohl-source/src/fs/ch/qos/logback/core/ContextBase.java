// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core;

import fs.ch.qos.logback.core.spi.LogbackLock;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.util.EnvUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package fs.ch.qos.logback.core:
//            Context, BasicStatusManager

public class ContextBase
    implements Context
{

    private static final int CORE_POOL_SIZE;
    private long birthTime;
    LogbackLock configurationLock;
    ExecutorService executorService;
    private String name;
    Map objectMap;
    Map propertyMap;
    private StatusManager sm;

    public ContextBase()
    {
        birthTime = System.currentTimeMillis();
        sm = new BasicStatusManager();
        propertyMap = new HashMap();
        objectMap = new HashMap();
        configurationLock = new LogbackLock();
        executorService = new ThreadPoolExecutor(CORE_POOL_SIZE, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public long getBirthTime()
    {
        return birthTime;
    }

    public Object getConfigurationLock()
    {
        return configurationLock;
    }

    public Map getCopyOfPropertyMap()
    {
        return new HashMap(propertyMap);
    }

    public ExecutorService getExecutorService()
    {
        return executorService;
    }

    public String getName()
    {
        return name;
    }

    public Object getObject(String s)
    {
        return objectMap.get(s);
    }

    public String getProperty(String s)
    {
        if ("CONTEXT_NAME".equals(s))
        {
            return getName();
        } else
        {
            return (String)propertyMap.get(s);
        }
    }

    public StatusManager getStatusManager()
    {
        return sm;
    }

    public void putObject(String s, Object obj)
    {
        objectMap.put(s, obj);
    }

    public void putProperty(String s, String s1)
    {
        propertyMap.put(s, s1);
    }

    public void reset()
    {
        propertyMap.clear();
        objectMap.clear();
    }

    public void setName(String s)
        throws IllegalStateException
    {
        if (s != null && s.equals(name))
        {
            return;
        }
        if (name == null || "default".equals(name))
        {
            name = s;
            return;
        } else
        {
            throw new IllegalStateException("Context has been already given a name");
        }
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        int i;
        if (EnvUtil.isJDK5())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        CORE_POOL_SIZE = i;
    }
}
