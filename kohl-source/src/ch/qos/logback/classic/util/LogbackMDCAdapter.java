// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.util;

import fs.org.slf4j.spi.MDCAdapter;
import java.util.HashMap;
import java.util.Map;

public final class LogbackMDCAdapter
    implements MDCAdapter
{

    final InheritableThreadLocal copyOnInheritThreadLocal = new InheritableThreadLocal();
    final ThreadLocal lastOperation = new ThreadLocal();

    public LogbackMDCAdapter()
    {
    }

    public Map getCopyOfContextMap()
    {
        lastOperation.set(Integer.valueOf(2));
        Map map = (Map)copyOnInheritThreadLocal.get();
        if (map == null)
        {
            return null;
        } else
        {
            return new HashMap(map);
        }
    }

    public Map getPropertyMap()
    {
        lastOperation.set(Integer.valueOf(2));
        return (Map)copyOnInheritThreadLocal.get();
    }
}
