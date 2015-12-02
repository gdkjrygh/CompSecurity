// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.deser.BeanDeserializerModifier;
import org.codehaus.jackson.map.deser.ValueInstantiators;
import org.codehaus.jackson.map.ser.BeanSerializerModifier;
import org.codehaus.jackson.map.type.TypeModifier;

// Referenced classes of package org.codehaus.jackson.map:
//            Module, AbstractTypeResolver, Deserializers, KeyDeserializers, 
//            Serializers, AnnotationIntrospector, DeserializationConfig, SerializationConfig

public static interface Feature
{

    public abstract void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver);

    public abstract void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier);

    public abstract void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier);

    public abstract void addDeserializers(Deserializers deserializers);

    public abstract void addKeyDeserializers(KeyDeserializers keydeserializers);

    public abstract void addKeySerializers(Serializers serializers);

    public abstract void addSerializers(Serializers serializers);

    public abstract void addTypeModifier(TypeModifier typemodifier);

    public abstract void addValueInstantiators(ValueInstantiators valueinstantiators);

    public abstract void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract DeserializationConfig getDeserializationConfig();

    public abstract Version getMapperVersion();

    public abstract SerializationConfig getSerializationConfig();

    public abstract void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract boolean isEnabled(org.codehaus.jackson.e e);

    public abstract boolean isEnabled(org.codehaus.jackson.ext ext);

    public abstract boolean isEnabled(g.Feature feature);

    public abstract boolean isEnabled(Feature feature);

    public abstract void setMixInAnnotations(Class class1, Class class2);
}
