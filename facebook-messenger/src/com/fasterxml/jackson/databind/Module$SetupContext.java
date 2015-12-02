// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;

// Referenced classes of package com.fasterxml.jackson.databind:
//            AbstractTypeResolver, AnnotationIntrospector, DeserializationFeature, MapperFeature, 
//            SerializationFeature

public interface 
{

    public abstract void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver);

    public abstract void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier);

    public abstract void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier);

    public abstract void addDeserializationProblemHandler(DeserializationProblemHandler deserializationproblemhandler);

    public abstract void addDeserializers(Deserializers deserializers);

    public abstract void addKeyDeserializers(KeyDeserializers keydeserializers);

    public abstract void addKeySerializers(Serializers serializers);

    public abstract void addSerializers(Serializers serializers);

    public abstract void addTypeModifier(TypeModifier typemodifier);

    public abstract void addValueInstantiators(ValueInstantiators valueinstantiators);

    public abstract void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract Version getMapperVersion();

    public abstract ObjectCodec getOwner();

    public abstract TypeFactory getTypeFactory();

    public abstract void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract boolean isEnabled(com.fasterxml.jackson.core.ext ext);

    public abstract boolean isEnabled(com.fasterxml.jackson.core.e e);

    public abstract boolean isEnabled(com.fasterxml.jackson.core.ext ext);

    public abstract boolean isEnabled(DeserializationFeature deserializationfeature);

    public abstract boolean isEnabled(MapperFeature mapperfeature);

    public abstract boolean isEnabled(SerializationFeature serializationfeature);

    public transient abstract void registerSubtypes(NamedType anamedtype[]);

    public transient abstract void registerSubtypes(Class aclass[]);

    public abstract void setMixInAnnotations(Class class1, Class class2);
}
