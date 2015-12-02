// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//            TypeDeserializer, TypeSerializer, TypeIdResolver

public interface TypeResolverBuilder
{

    public abstract TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, Collection collection);

    public abstract TypeSerializer buildTypeSerializer(SerializationConfig serializationconfig, JavaType javatype, Collection collection);

    public abstract TypeResolverBuilder defaultImpl(Class class1);

    public abstract Class getDefaultImpl();

    public abstract TypeResolverBuilder inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As as);

    public abstract TypeResolverBuilder init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id id, TypeIdResolver typeidresolver);

    public abstract TypeResolverBuilder typeIdVisibility(boolean flag);

    public abstract TypeResolverBuilder typeProperty(String s);
}
