// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.name;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.binder.LinkedBindingBuilder;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// Referenced classes of package com.google.inject.name:
//            NamedImpl, Named

public class Names
{

    private Names()
    {
    }

    public static void bindProperties(Binder binder, Map map)
    {
        binder = binder.skipSources(new Class[] {
            com/google/inject/name/Names
        });
        String s;
        Object obj;
        for (map = map.entrySet().iterator(); map.hasNext(); binder.bind(Key.get(java/lang/String, new NamedImpl(s))).toInstance(obj))
        {
            obj = (java.util.Map.Entry)map.next();
            s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (String)((java.util.Map.Entry) (obj)).getValue();
        }

    }

    public static void bindProperties(Binder binder, Properties properties)
    {
        binder = binder.skipSources(new Class[] {
            com/google/inject/name/Names
        });
        String s;
        String s1;
        for (Enumeration enumeration = properties.propertyNames(); enumeration.hasMoreElements(); binder.bind(Key.get(java/lang/String, new NamedImpl(s))).toInstance(s1))
        {
            s = (String)enumeration.nextElement();
            s1 = properties.getProperty(s);
        }

    }

    public static Named named(String s)
    {
        return new NamedImpl(s);
    }
}
