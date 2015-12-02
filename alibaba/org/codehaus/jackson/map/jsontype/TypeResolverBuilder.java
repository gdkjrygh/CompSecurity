// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.jsontype;

import java.util.Collection;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.jsontype:
//            TypeIdResolver

public interface TypeResolverBuilder
{

    public abstract TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, Collection collection, BeanProperty beanproperty);

    public abstract TypeSerializer buildTypeSerializer(SerializationConfig serializationconfig, JavaType javatype, Collection collection, BeanProperty beanproperty);

    public abstract TypeResolverBuilder defaultImpl(Class class1);

    public abstract Class getDefaultImpl();

    public abstract TypeResolverBuilder inclusion(org.codehaus.jackson.annotate.JsonTypeInfo.As as);

    public abstract TypeResolverBuilder init(org.codehaus.jackson.annotate.JsonTypeInfo.Id id, TypeIdResolver typeidresolver);

    public abstract TypeResolverBuilder typeProperty(String s);
}
