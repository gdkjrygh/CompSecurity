// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyValueBuffer, PropertyValue, ObjectIdReader

public final class PropertyBasedCreator
{

    protected final Object _defaultValues[];
    protected final HashMap _properties = new HashMap();
    protected final SettableBeanProperty _propertiesWithInjectables[];
    protected final int _propertyCount;
    protected final ValueInstantiator _valueInstantiator;

    protected PropertyBasedCreator(ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[], Object aobj[])
    {
        _valueInstantiator = valueinstantiator;
        int j = asettablebeanproperty.length;
        _propertyCount = j;
        valueinstantiator = null;
        for (int i = 0; i < j;)
        {
            SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
            _properties.put(settablebeanproperty.getName(), settablebeanproperty);
            Object obj = valueinstantiator;
            if (settablebeanproperty.getInjectableValueId() != null)
            {
                obj = valueinstantiator;
                if (valueinstantiator == null)
                {
                    obj = new SettableBeanProperty[j];
                }
                obj[i] = settablebeanproperty;
            }
            i++;
            valueinstantiator = ((ValueInstantiator) (obj));
        }

        _defaultValues = aobj;
        _propertiesWithInjectables = valueinstantiator;
    }

    public static PropertyBasedCreator construct(DeserializationContext deserializationcontext, ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[])
    {
        int j = asettablebeanproperty.length;
        SettableBeanProperty asettablebeanproperty1[] = new SettableBeanProperty[j];
        int i = 0;
        Object obj = null;
        while (i < j) 
        {
            Object obj1 = asettablebeanproperty[i];
            Object obj2 = obj1;
            if (!((SettableBeanProperty) (obj1)).hasValueDeserializer())
            {
                obj2 = ((SettableBeanProperty) (obj1)).withValueDeserializer(deserializationcontext.findContextualValueDeserializer(((SettableBeanProperty) (obj1)).getType(), ((com.fasterxml.jackson.databind.BeanProperty) (obj1))));
            }
            asettablebeanproperty1[i] = ((SettableBeanProperty) (obj2));
            obj1 = ((SettableBeanProperty) (obj2)).getValueDeserializer();
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = ((JsonDeserializer) (obj1)).getNullValue();
            }
            if (obj1 == null && ((SettableBeanProperty) (obj2)).getType().isPrimitive())
            {
                obj2 = ClassUtil.defaultValue(((SettableBeanProperty) (obj2)).getType().getRawClass());
            } else
            {
                obj2 = obj1;
            }
            obj1 = obj;
            if (obj2 != null)
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = ((Object) (new Object[j]));
                }
                obj1[i] = obj2;
            }
            i++;
            obj = obj1;
        }
        return new PropertyBasedCreator(valueinstantiator, asettablebeanproperty1, ((Object []) (obj)));
    }

    public final Object build(DeserializationContext deserializationcontext, PropertyValueBuffer propertyvaluebuffer)
    {
        Object obj = propertyvaluebuffer.handleIdValue(deserializationcontext, _valueInstantiator.createFromObjectWith(deserializationcontext, propertyvaluebuffer.getParameters(_defaultValues)));
        for (deserializationcontext = propertyvaluebuffer.buffered(); deserializationcontext != null; deserializationcontext = ((PropertyValue) (deserializationcontext)).next)
        {
            deserializationcontext.assign(obj);
        }

        return obj;
    }

    public final SettableBeanProperty findCreatorProperty(String s)
    {
        return (SettableBeanProperty)_properties.get(s);
    }

    public final Collection properties()
    {
        return _properties.values();
    }

    public final PropertyValueBuffer startBuilding(JsonParser jsonparser, DeserializationContext deserializationcontext, ObjectIdReader objectidreader)
    {
        jsonparser = new PropertyValueBuffer(jsonparser, deserializationcontext, _propertyCount, objectidreader);
        if (_propertiesWithInjectables != null)
        {
            jsonparser.inject(_propertiesWithInjectables);
        }
        return jsonparser;
    }
}
