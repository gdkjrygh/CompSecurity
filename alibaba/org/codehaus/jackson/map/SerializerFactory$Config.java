// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.map.ser.BeanSerializerModifier;

// Referenced classes of package org.codehaus.jackson.map:
//            SerializerFactory, Serializers

public static abstract class r
{

    public abstract boolean hasKeySerializers();

    public abstract boolean hasSerializerModifiers();

    public abstract boolean hasSerializers();

    public abstract Iterable keySerializers();

    public abstract Iterable serializerModifiers();

    public abstract Iterable serializers();

    public abstract r withAdditionalKeySerializers(Serializers serializers1);

    public abstract r withAdditionalSerializers(Serializers serializers1);

    public abstract r withSerializerModifier(BeanSerializerModifier beanserializermodifier);

    public r()
    {
    }
}
