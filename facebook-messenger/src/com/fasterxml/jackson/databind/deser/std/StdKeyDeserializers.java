// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

public class StdKeyDeserializers
{

    protected final HashMap _keyDeserializers = new HashMap();

    protected StdKeyDeserializers()
    {
        add(new StdKeyDeserializer.BoolKD());
        add(new StdKeyDeserializer.ByteKD());
        add(new StdKeyDeserializer.CharKD());
        add(new StdKeyDeserializer.ShortKD());
        add(new StdKeyDeserializer.IntKD());
        add(new StdKeyDeserializer.LongKD());
        add(new StdKeyDeserializer.FloatKD());
        add(new StdKeyDeserializer.DoubleKD());
        add(new StdKeyDeserializer.DateKD());
        add(new StdKeyDeserializer.CalendarKD());
        add(new StdKeyDeserializer.UuidKD());
        add(new StdKeyDeserializer.LocaleKD());
    }

    private void add(StdKeyDeserializer stdkeydeserializer)
    {
        Class class1 = stdkeydeserializer.getKeyClass();
        _keyDeserializers.put(TypeFactory.defaultInstance().constructType(class1), stdkeydeserializer);
    }

    public static HashMap constructAll()
    {
        return (new StdKeyDeserializers())._keyDeserializers;
    }

    public static KeyDeserializer constructDelegatingKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        return new StdKeyDeserializer.DelegatingKD(javatype.getRawClass(), jsondeserializer);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumresolver)
    {
        return new StdKeyDeserializer.EnumKD(enumresolver, null);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
    {
        return new StdKeyDeserializer.EnumKD(enumresolver, annotatedmethod);
    }

    public static KeyDeserializer constructStringKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        return StdKeyDeserializer.StringKD.forType(javatype.getRawClass());
    }

    public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        javatype = deserializationconfig.introspect(javatype);
        java.lang.reflect.Constructor constructor = javatype.findSingleArgConstructor(new Class[] {
            java/lang/String
        });
        if (constructor != null)
        {
            if (deserializationconfig.canOverrideAccessModifiers())
            {
                ClassUtil.checkAndFixAccess(constructor);
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(constructor);
        }
        javatype = javatype.findFactoryMethod(new Class[] {
            java/lang/String
        });
        if (javatype != null)
        {
            if (deserializationconfig.canOverrideAccessModifiers())
            {
                ClassUtil.checkAndFixAccess(javatype);
            }
            return new StdKeyDeserializer.StringFactoryKeyDeserializer(javatype);
        } else
        {
            return null;
        }
    }
}
