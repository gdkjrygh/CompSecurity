// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            ClassUtil

public final class EnumValues
{

    private final Class _enumClass;
    private final EnumMap _values;

    private EnumValues(Class class1, Map map)
    {
        _enumClass = class1;
        _values = new EnumMap(map);
    }

    public static EnumValues construct(SerializationConfig serializationconfig, Class class1)
    {
        if (serializationconfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
        {
            return constructFromToString(serializationconfig, class1);
        } else
        {
            return constructFromName(serializationconfig, class1);
        }
    }

    public static EnumValues constructFromName(MapperConfig mapperconfig, Class class1)
    {
        Enum aenum[] = (Enum[])ClassUtil.findEnumType(class1).getEnumConstants();
        if (aenum != null)
        {
            HashMap hashmap = new HashMap();
            int j = aenum.length;
            for (int i = 0; i < j; i++)
            {
                Enum enum = aenum[i];
                hashmap.put(enum, mapperconfig.compileString(mapperconfig.getAnnotationIntrospector().findEnumValue(enum)));
            }

            return new EnumValues(class1, hashmap);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not determine enum constants for Class ").append(class1.getName()).toString());
        }
    }

    public static EnumValues constructFromToString(MapperConfig mapperconfig, Class class1)
    {
        Enum aenum[] = (Enum[])ClassUtil.findEnumType(class1).getEnumConstants();
        if (aenum != null)
        {
            HashMap hashmap = new HashMap();
            int j = aenum.length;
            for (int i = 0; i < j; i++)
            {
                Enum enum = aenum[i];
                hashmap.put(enum, mapperconfig.compileString(enum.toString()));
            }

            return new EnumValues(class1, hashmap);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not determine enum constants for Class ").append(class1.getName()).toString());
        }
    }

    public SerializableString serializedValueFor(Enum enum)
    {
        return (SerializableString)_values.get(enum);
    }
}
