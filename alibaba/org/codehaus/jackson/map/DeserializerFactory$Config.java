// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.map.deser.BeanDeserializerModifier;
import org.codehaus.jackson.map.deser.ValueInstantiators;

// Referenced classes of package org.codehaus.jackson.map:
//            DeserializerFactory, AbstractTypeResolver, Deserializers, KeyDeserializers

public static abstract class ier
{

    public abstract Iterable abstractTypeResolvers();

    public abstract Iterable deserializerModifiers();

    public abstract Iterable deserializers();

    public abstract boolean hasAbstractTypeResolvers();

    public abstract boolean hasDeserializerModifiers();

    public abstract boolean hasDeserializers();

    public abstract boolean hasKeyDeserializers();

    public abstract boolean hasValueInstantiators();

    public abstract Iterable keyDeserializers();

    public abstract Iterable valueInstantiators();

    public abstract ier withAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver);

    public abstract ier withAdditionalDeserializers(Deserializers deserializers1);

    public abstract ier withAdditionalKeyDeserializers(KeyDeserializers keydeserializers);

    public abstract ier withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier);

    public abstract ier withValueInstantiators(ValueInstantiators valueinstantiators);

    public ier()
    {
    }
}
