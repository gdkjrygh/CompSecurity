// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.selector.DefaultContextSelector;
import fs.ch.qos.logback.core.util.Loader;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ContextSelectorStaticBinder
{

    static ContextSelectorStaticBinder singleton = new ContextSelectorStaticBinder();
    ContextSelector contextSelector;
    Object key;

    public ContextSelectorStaticBinder()
    {
    }

    static ContextSelector dynamicalContextSelector(LoggerContext loggercontext, String s)
        throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
    {
        return (ContextSelector)Loader.loadClass(s).getConstructor(new Class[] {
            ch/qos/logback/classic/LoggerContext
        }).newInstance(new Object[] {
            loggercontext
        });
    }

    public static ContextSelectorStaticBinder getSingleton()
    {
        return singleton;
    }

    public ContextSelector getContextSelector()
    {
        return contextSelector;
    }

    public void init(LoggerContext loggercontext, Object obj)
        throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException
    {
        if (key == null)
        {
            key = obj;
        } else
        if (key != obj)
        {
            throw new IllegalAccessException("Only certain classes can access this method.");
        }
        obj = OptionHelper.getSystemProperty("logback.ContextSelector");
        if (obj == null)
        {
            contextSelector = new DefaultContextSelector(loggercontext);
            return;
        }
        if (((String) (obj)).equals("JNDI"))
        {
            throw new RuntimeException("JNDI not supported");
        } else
        {
            contextSelector = dynamicalContextSelector(loggercontext, ((String) (obj)));
            return;
        }
    }

}
