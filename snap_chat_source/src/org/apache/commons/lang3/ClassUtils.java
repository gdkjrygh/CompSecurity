// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.apache.commons.lang3:
//            StringUtils

public class ClassUtils
{

    public static final String INNER_CLASS_SEPARATOR = "$";
    public static final String PACKAGE_SEPARATOR = ".";
    private static final Map abbreviationMap;
    private static final Map primitiveWrapperMap;
    private static final Map reverseAbbreviationMap;
    private static final Map wrapperPrimitiveMap;

    public static String getShortClassName(Class class1)
    {
        if (class1 == null)
        {
            return "";
        } else
        {
            return getShortClassName(class1.getName());
        }
    }

    public static String getShortClassName(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        String s1 = s;
        if (s.startsWith("["))
        {
            for (s1 = s; s1.charAt(0) == '['; stringbuilder.append("[]"))
            {
                s1 = s1.substring(1);
            }

            s = s1;
            if (s1.charAt(0) == 'L')
            {
                s = s1;
                if (s1.charAt(s1.length() - 1) == ';')
                {
                    s = s1.substring(1, s1.length() - 1);
                }
            }
            s1 = s;
            if (reverseAbbreviationMap.containsKey(s))
            {
                s1 = (String)reverseAbbreviationMap.get(s);
            }
        }
        int j = s1.lastIndexOf('.');
        int i;
        if (j == -1)
        {
            i = 0;
        } else
        {
            i = j + 1;
        }
        i = s1.indexOf('$', i);
        s1 = s1.substring(j + 1);
        s = s1;
        if (i != -1)
        {
            s = s1.replace('$', '.');
        }
        return (new StringBuilder()).append(s).append(stringbuilder).toString();
    }

    static 
    {
        Object obj = new HashMap();
        primitiveWrapperMap = ((Map) (obj));
        ((Map) (obj)).put(Boolean.TYPE, java/lang/Boolean);
        primitiveWrapperMap.put(Byte.TYPE, java/lang/Byte);
        primitiveWrapperMap.put(Character.TYPE, java/lang/Character);
        primitiveWrapperMap.put(Short.TYPE, java/lang/Short);
        primitiveWrapperMap.put(Integer.TYPE, java/lang/Integer);
        primitiveWrapperMap.put(Long.TYPE, java/lang/Long);
        primitiveWrapperMap.put(Double.TYPE, java/lang/Double);
        primitiveWrapperMap.put(Float.TYPE, java/lang/Float);
        primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
        wrapperPrimitiveMap = new HashMap();
        obj = primitiveWrapperMap.keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Class class1 = (Class)((Iterator) (obj)).next();
            Class class2 = (Class)primitiveWrapperMap.get(class1);
            if (!class1.equals(class2))
            {
                wrapperPrimitiveMap.put(class2, class1);
            }
        } while (true);
        obj = new HashMap();
        ((Map) (obj)).put("int", "I");
        ((Map) (obj)).put("boolean", "Z");
        ((Map) (obj)).put("float", "F");
        ((Map) (obj)).put("long", "J");
        ((Map) (obj)).put("short", "S");
        ((Map) (obj)).put("byte", "B");
        ((Map) (obj)).put("double", "D");
        ((Map) (obj)).put("char", "C");
        ((Map) (obj)).put("void", "V");
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = ((Map) (obj)).entrySet().iterator(); iterator.hasNext(); hashmap.put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        abbreviationMap = Collections.unmodifiableMap(((Map) (obj)));
        reverseAbbreviationMap = Collections.unmodifiableMap(hashmap);
    }
}
