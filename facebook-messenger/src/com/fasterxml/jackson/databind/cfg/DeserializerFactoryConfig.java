// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

public class DeserializerFactoryConfig
{

    protected static final AbstractTypeResolver NO_ABSTRACT_TYPE_RESOLVERS[] = new AbstractTypeResolver[0];
    protected static final Deserializers NO_DESERIALIZERS[] = new Deserializers[0];
    protected static final KeyDeserializers NO_KEY_DESERIALIZERS[] = new KeyDeserializers[0];
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
            adeserializers = NO_KEY_DESERIALIZERS;
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
        return ArrayBuilders.arrayAsIterable(_abstractTypeResolvers);
    }

    public Iterable deserializerModifiers()
    {
        return ArrayBuilders.arrayAsIterable(_modifiers);
    }

    public Iterable deserializers()
    {
        return ArrayBuilders.arrayAsIterable(_additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers()
    {
        return _abstractTypeResolvers.length > 0;
    }

    public boolean hasDeserializerModifiers()
    {
        return _modifiers.length > 0;
    }

    public boolean hasDeserializers()
    {
        return _additionalDeserializers.length > 0;
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
        return ArrayBuilders.arrayAsIterable(_additionalKeyDeserializers);
    }

    public Iterable valueInstantiators()
    {
        return ArrayBuilders.arrayAsIterable(_valueInstantiators);
    }

    public DeserializerFactoryConfig withAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
    {
        if (abstracttyperesolver == null)
        {
            throw new IllegalArgumentException("Can not pass null resolver");
        } else
        {
            abstracttyperesolver = (AbstractTypeResolver[])ArrayBuilders.insertInListNoDup(_abstractTypeResolvers, abstracttyperesolver);
            return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, _modifiers, abstracttyperesolver, _valueInstantiators);
        }
    }

    public DeserializerFactoryConfig withAdditionalDeserializers(Deserializers deserializers1)
    {
        if (deserializers1 == null)
        {
            throw new IllegalArgumentException("Can not pass null Deserializers");
        } else
        {
            return new DeserializerFactoryConfig((Deserializers[])ArrayBuilders.insertInListNoDup(_additionalDeserializers, deserializers1), _additionalKeyDeserializers, _modifiers, _abstractTypeResolvers, _valueInstantiators);
        }
    }

    public DeserializerFactoryConfig withAdditionalKeyDeserializers(KeyDeserializers keydeserializers)
    {
        if (keydeserializers == null)
        {
            throw new IllegalArgumentException("Can not pass null KeyDeserializers");
        } else
        {
            keydeserializers = (KeyDeserializers[])ArrayBuilders.insertInListNoDup(_additionalKeyDeserializers, keydeserializers);
            return new DeserializerFactoryConfig(_additionalDeserializers, keydeserializers, _modifiers, _abstractTypeResolvers, _valueInstantiators);
        }
    }

    public DeserializerFactoryConfig withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
    {
        if (beandeserializermodifier == null)
        {
            throw new IllegalArgumentException("Can not pass null modifier");
        } else
        {
            beandeserializermodifier = (BeanDeserializerModifier[])ArrayBuilders.insertInListNoDup(_modifiers, beandeserializermodifier);
            return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, beandeserializermodifier, _abstractTypeResolvers, _valueInstantiators);
        }
    }

    public DeserializerFactoryConfig withValueInstantiators(ValueInstantiators valueinstantiators)
    {
        if (valueinstantiators == null)
        {
            throw new IllegalArgumentException("Can not pass null resolver");
        } else
        {
            valueinstantiators = (ValueInstantiators[])ArrayBuilders.insertInListNoDup(_valueInstantiators, valueinstantiators);
            return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, _modifiers, _abstractTypeResolvers, valueinstantiators);
        }
    }

}
