// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ClassUtils
{
    public static final class Interfaces extends Enum
    {

        private static final Interfaces $VALUES[];
        public static final Interfaces EXCLUDE;
        public static final Interfaces INCLUDE;

        public static Interfaces valueOf(String s)
        {
            return (Interfaces)Enum.valueOf(org/apache/commons/lang3/ClassUtils$Interfaces, s);
        }

        public static Interfaces[] values()
        {
            return (Interfaces[])$VALUES.clone();
        }

        static 
        {
            INCLUDE = new Interfaces("INCLUDE", 0);
            EXCLUDE = new Interfaces("EXCLUDE", 1);
            $VALUES = (new Interfaces[] {
                INCLUDE, EXCLUDE
            });
        }

        private Interfaces(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String INNER_CLASS_SEPARATOR = String.valueOf('$');
    public static final String PACKAGE_SEPARATOR = String.valueOf('.');
    private static final Map abbreviationMap;
    private static final Map primitiveWrapperMap;
    private static final Map reverseAbbreviationMap;
    private static final Map wrapperPrimitiveMap;

    static 
    {
        primitiveWrapperMap = new HashMap();
        primitiveWrapperMap.put(Boolean.TYPE, java/lang/Boolean);
        primitiveWrapperMap.put(Byte.TYPE, java/lang/Byte);
        primitiveWrapperMap.put(Character.TYPE, java/lang/Character);
        primitiveWrapperMap.put(Short.TYPE, java/lang/Short);
        primitiveWrapperMap.put(Integer.TYPE, java/lang/Integer);
        primitiveWrapperMap.put(Long.TYPE, java/lang/Long);
        primitiveWrapperMap.put(Double.TYPE, java/lang/Double);
        primitiveWrapperMap.put(Float.TYPE, java/lang/Float);
        primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
        wrapperPrimitiveMap = new HashMap();
        Object obj = primitiveWrapperMap.keySet().iterator();
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
