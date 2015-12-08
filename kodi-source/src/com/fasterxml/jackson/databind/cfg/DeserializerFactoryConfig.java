// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import java.io.Serializable;

public class DeserializerFactoryConfig
    implements Serializable
{

    protected static final KeyDeserializers DEFAULT_KEY_DESERIALIZERS[] = {
        new StdKeyDeserializers()
    };
    protected static final AbstractTypeResolver NO_ABSTRACT_TYPE_RESOLVERS[] = new AbstractTypeResolver[0];
    protected static final Deserializers NO_DESERIALIZERS[] = new Deserializers[0];
    protected static final BeanDeserializerModifier NO_MODIFIERS[] = new BeanDeserializerModifier[0];
    protected static final ValueInstantiators NO_VALUE_INSTANTIATORS[] = new ValueInstantiators[0];
    protected final AbstractTypeResolver _abstractTypeResolvers[];
    protected final Deserializers _additionalDeserializers[];
    protected final KeyDeserializers _additionalKeyDeserializers[];
    protected final BeanDeserializerModifier _modifiers[];
    protected final ValueInstantiators _valueInstantiators[];

    public DeserializerFactoryConfig()
    {
        this(null, null, null, null, null);
    }

    protected DeserializerFactoryConfig(Deserializers adeserializers[], KeyDeserializers akeydeserializers[], BeanDeserializerModifier abeandeserializermodifier[], AbstractTypeResolver aabstracttyperesolver[], ValueInstantiators avalueinstantiators[])
    {
        Deserializers adeserializers1[] = adeserializers;
        if (adeserializers == null)
        {
            adeserializers1 = NO_DESERIALIZERS;
        }
        _additionalDeserializers = adeserializers1;
        adeserializers = akeydeserializers;
        if (akeydeserializers == null)
        {
            adeserializers = DEFAULT_KEY_DESERIALIZERS;
        }
        _additionalKeyDeserializers = adeserializers;
        adeserializers = abeandeserializermodifier;
        if (abeandeserializermodifier == null)
        {
            adeserializers = NO_MODIFIERS;
        }
        _modifiers = adeserializers;
        adeserializers = aabstracttyperesolver;
        if (aabstracttyperesolver == null)
        {
            adeserializers = NO_ABSTRACT_TYPE_RESOLVERS;
        }
        _abstractTypeResolvers = adeserializers;
        adeserializers = avalueinstantiators;
        if (avalueinstantiators == null)
        {
            adeserializers = NO_VALUE_INSTANTIATORS;
        }
        _valueInstantiators = adeserializers;
    }

    public Iterable abstractTypeResolvers()
    {
        return new ArrayIterator(_abstractTypeResolvers);
    }

    public Iterable deserializerModifiers()
    {
        return new ArrayIterator(_modifiers);
    }

    public Iterable deserializers()
    {
        return new ArrayIterator(_additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers()
    {
        return _abstractTypeResolvers.length > 0;
    }

    public boolean hasDeserializerModifiers()
    {
        return _modifiers.length > 0;
    }

    public boolean hasKeyDeserializers()
    {
        return _additionalKeyDeserializers.length > 0;
    }

    public boolean hasValueInstantiators()
    {
        return _valueInstantiators.length > 0;
    }

    public Iterable keyDeserializers()
    {
        return new ArrayIterator(_additionalKeyDeserializers);
    }

    public Iterable valueInstantiators()
    {
        return new ArrayIterator(_valueInstantiators);
    }

}
