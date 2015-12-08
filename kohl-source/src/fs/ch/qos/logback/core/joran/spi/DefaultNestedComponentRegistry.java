// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package fs.ch.qos.logback.core.joran.spi:
//            HostClassAndPropertyDouble

public class DefaultNestedComponentRegistry
{

    Map defaultComponentMap;

    public DefaultNestedComponentRegistry()
    {
        defaultComponentMap = new HashMap();
    }

    private Class oneShotFind(Class class1, String s)
    {
        class1 = new HostClassAndPropertyDouble(class1, s);
        return (Class)defaultComponentMap.get(class1);
    }

    public void add(Class class1, String s, Class class2)
    {
        class1 = new HostClassAndPropertyDouble(class1, s.toLowerCase());
        defaultComponentMap.put(class1, class2);
    }

    public Class findDefaultComponentType(Class class1, String s)
    {
        s = s.toLowerCase();
        for (; class1 != null; class1 = class1.getSuperclass())
        {
            Class class2 = oneShotFind(class1, s);
            if (class2 != null)
            {
                return class2;
            }
        }

        return null;
    }
}
