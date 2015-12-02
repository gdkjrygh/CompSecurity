// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            Serializers, BeanSerializerModifier

public abstract class SerializerFactory
{

    public SerializerFactory()
    {
    }

    public abstract JsonSerializer createKeySerializer(SerializationConfig serializationconfig, JavaType javatype);

    public abstract JsonSerializer createSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanProperty beanproperty);

    public abstract TypeSerializer createTypeSerializer(SerializationConfig serializationconfig, JavaType javatype);

    public abstract SerializerFactory withAdditionalKeySerializers(Serializers serializers);

    public abstract SerializerFactory withAdditionalSerializers(Serializers serializers);

    public abstract SerializerFactory withSerializerModifier(BeanSerializerModifier beanserializermodifier);
}
