// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

public final class SerializerFactoryConfig
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

    public boolean hasSerializers()
    {
        return _additionalSerializers.length > 0;
    }

    public Iterable keySerializers()
    {
        return ArrayBuilders.arrayAsIterable(_additionalKeySerializers);
    }

    public Iterable serializerModifiers()
    {
        return ArrayBuilders.arrayAsIterable(_modifiers);
    }

    public Iterable serializers()
    {
        return ArrayBuilders.arrayAsIterable(_additionalSerializers);
    }

    public SerializerFactoryConfig withAdditionalKeySerializers(Serializers serializers1)
    {
        if (serializers1 == null)
        {
            throw new IllegalArgumentException("Can not pass null Serializers");
        } else
        {
            serializers1 = (Serializers[])ArrayBuilders.insertInListNoDup(_additionalKeySerializers, serializers1);
            return new SerializerFactoryConfig(_additionalSerializers, serializers1, _modifiers);
        }
    }

    public SerializerFactoryConfig withAdditionalSerializers(Serializers serializers1)
    {
        if (serializers1 == null)
        {
            throw new IllegalArgumentException("Can not pass null Serializers");
        } else
        {
            return new SerializerFactoryConfig((Serializers[])ArrayBuilders.insertInListNoDup(_additionalSerializers, serializers1), _additionalKeySerializers, _modifiers);
        }
    }

    public SerializerFactoryConfig withSerializerModifier(BeanSerializerModifier beanserializermodifier)
    {
        if (beanserializermodifier == null)
        {
            throw new IllegalArgumentException("Can not pass null modifier");
        } else
        {
            beanserializermodifier = (BeanSerializerModifier[])ArrayBuilders.insertInListNoDup(_modifiers, beanserializermodifier);
            return new SerializerFactoryConfig(_additionalSerializers, _additionalKeySerializers, beanserializermodifier);
        }
    }

}
