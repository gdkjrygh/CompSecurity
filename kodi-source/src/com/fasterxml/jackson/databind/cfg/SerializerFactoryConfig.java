// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import java.io.Serializable;

public final class SerializerFactoryConfig
    implements Serializable
{

    protected static final BeanSerializerModifier NO_MODIFIERS[] = new BeanSerializerModifier[0];
    protected static final Serializers NO_SERIALIZERS[] = new Serializers[0];
    protected final Serializers _additionalKeySerializers[];
    protected final Serializers _additionalSerializers[];
    protected final BeanSerializerModifier _modifiers[];

    public SerializerFactoryConfig()
    {
        this(null, null, null);
    }

    protected SerializerFactoryConfig(Serializers aserializers[], Serializers aserializers1[], BeanSerializerModifier abeanserializermodifier[])
    {
        Serializers aserializers2[] = aserializers;
        if (aserializers == null)
        {
            aserializers2 = NO_SERIALIZERS;
        }
        _additionalSerializers = aserializers2;
        aserializers = aserializers1;
        if (aserializers1 == null)
        {
            aserializers = NO_SERIALIZERS;
        }
        _additionalKeySerializers = aserializers;
        aserializers = abeanserializermodifier;
        if (abeanserializermodifier == null)
        {
            aserializers = NO_MODIFIERS;
        }
        _modifiers = aserializers;
    }

    public boolean hasKeySerializers()
    {
        return _additionalKeySerializers.length > 0;
    }

    public boolean hasSerializerModifiers()
    {
        return _modifiers.length > 0;
    }

    public Iterable keySerializers()
    {
        return new ArrayIterator(_additionalKeySerializers);
    }

    public Iterable serializerModifiers()
    {
        return new ArrayIterator(_modifiers);
    }

    public Iterable serializers()
    {
        return new ArrayIterator(_additionalSerializers);
    }

}
