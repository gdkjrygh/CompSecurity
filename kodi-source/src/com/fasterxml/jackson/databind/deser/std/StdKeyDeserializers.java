// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

public class StdKeyDeserializers
    implements KeyDeserializers, Serializable
{

    public StdKeyDeserializers()
    {
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

    public KeyDeserializer findKeyDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
        throws JsonMappingException
    {
        deserializationconfig = javatype.getRawClass();
        javatype = deserializationconfig;
        if (deserializationconfig.isPrimitive())
        {
            javatype = ClassUtil.wrapperType(deserializationconfig);
        }
        return StdKeyDeserializer.forType(javatype);
    }
}
