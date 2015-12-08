// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            BackgroundInitializer, ConcurrentException

public class MultiBackgroundInitializer extends BackgroundInitializer
{
    public static class MultiBackgroundInitializerResults
    {

        private final Map exceptions;
        private final Map initializers;
        private final Map resultObjects;

        private BackgroundInitializer checkName(String s)
        {
            BackgroundInitializer backgroundinitializer = (BackgroundInitializer)initializers.get(s);
            if (backgroundinitializer == null)
            {
                throw new NoSuchElementException((new StringBuilder()).append("No child initializer with name ").append(s).toString());
            } else
            {
                return backgroundinitializer;
            }
        }

        public ConcurrentException getException(String s)
        {
            checkName(s);
            return (ConcurrentException)exceptions.get(s);
        }

        public BackgroundInitializer getInitializer(String s)
        {
            return checkName(s);
        }

        public Object getResultObject(String s)
        {
            checkName(s);
            return resultObjects.get(s);
        }

        public Set initializerNames()
        {
            return Collections.unmodifiableSet(initializers.keySet());
        }

        public boolean isException(String s)
        {
            checkName(s);
            return exceptions.containsKey(s);
        }

        public boolean isSuccessful()
        {
            return exceptions.isEmpty();
        }

        private MultiBackgroundInitializerResults(Map map, Map map1, Map map2)
        {
            initializers = map;
            resultObjects = map1;
            exceptions = map2;
        }

    }


    private final Map childInitializers;

    public MultiBackgroundInitializer()
    {
        childInitializers = new HashMap();
    }

    public MultiBackgroundInitializer(ExecutorService executorservice)
    {
        super(executorservice);
        childInitializers = new HashMap();
    }

    public void addInitializer(String s, BackgroundInitializer backgroundinitializer)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name of child initializer must not be null!");
        }
        if (backgroundinitializer == null)
        {
            throw new IllegalArgumentException("Child initializer must not be null!");
        }
        this;
        JVM INSTR monitorenter ;
        if (isStarted())
        {
            throw new IllegalStateException("addInitializer() must not be called after start()!");
        }
        break MISSING_BLOCK_LABEL_52;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        childInitializers.put(s, backgroundinitializer);
        this;
        JVM INSTR monitorexit ;
    }

    protected int getTaskCount()
    {
        int i = 1;
        for (Iterator iterator = childInitializers.values().iterator(); iterator.hasNext();)
        {
            i += ((BackgroundInitializer)iterator.next()).getTaskCount();
        }

        return i;
    }

    protected volatile Object initialize()
        throws Exception
    {
        return initialize();
    }

    protected MultiBackgroundInitializerResults initialize()
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new HashMap(childInitializers);
        this;
        JVM INSTR monitorexit ;
        ExecutorService executorservice = getActiveExecutor();
        BackgroundInitializer backgroundinitializer;
        for (Iterator iterator = ((Map) (obj)).values().iterator(); iterator.hasNext(); backgroundinitializer.start())
        {
            backgroundinitializer = (BackgroundInitializer)iterator.next();
            if (backgroundinitializer.getExternalExecutor() == null)
            {
                backgroundinitializer.setExternalExecutor(executorservice);
            }
        }

        break MISSING_BLOCK_LABEL_81;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        for (Iterator iterator1 = ((Map) (obj)).entrySet().iterator(); iterator1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            try
            {
                hashmap.put(entry.getKey(), ((BackgroundInitializer)entry.getValue()).get());
            }
            catch (ConcurrentException concurrentexception)
            {
                hashmap1.put(entry.getKey(), concurrentexception);
            }
        }

        return new MultiBackgroundInitializerResults(((Map) (obj)), hashmap, hashmap1);
    }
}
