// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ContextUtil extends ContextAwareBase
{

    public ContextUtil(Context context)
    {
        setContext(context);
    }

    public void addHostNameAsProperty()
    {
        context.putProperty("HOSTNAME", "localhost");
    }

    public void addProperties(Properties properties)
    {
        if (properties != null)
        {
            Iterator iterator = properties.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                context.putProperty(s, properties.getProperty(s));
            }
        }
    }
}
