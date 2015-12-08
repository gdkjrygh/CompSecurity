// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            MultiBackgroundInitializer, BackgroundInitializer, ConcurrentException

public static class <init>
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

    private (Map map, Map map1, Map map2)
    {
        initializers = map;
        resultObjects = map1;
        exceptions = map2;
    }

    exceptions(Map map, Map map1, Map map2, exceptions exceptions1)
    {
        this(map, map1, map2);
    }
}
