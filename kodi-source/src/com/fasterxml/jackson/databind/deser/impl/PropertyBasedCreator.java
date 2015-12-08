// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
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
        valueinstantiator = null;
        int j = asettablebeanproperty.length;
        _propertyCount = j;
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
        throws JsonMappingException
    {
        int j = asettablebeanproperty.length;
        SettableBeanProperty asettablebeanproperty1[] = new SettableBeanProperty[j];
        Object obj = null;
        int i = 0;
        while (i < j) 
        {
            Object obj1 = asettablebeanproperty[i];
            SettableBeanProperty settablebeanproperty = ((SettableBeanProperty) (obj1));
            if (!((SettableBeanProperty) (obj1)).hasValueDeserializer())
            {
                settablebeanproperty = ((SettableBeanProperty) (obj1)).withValueDeserializer(deserializationcontext.findContextualValueDeserializer(((SettableBeanProperty) (obj1)).getType(), ((com.fasterxml.jackson.databind.BeanProperty) (obj1))));
            }
            asettablebeanproperty1[i] = settablebeanproperty;
            obj1 = settablebeanproperty.getValueDeserializer();
            Object obj2;
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = ((JsonDeserializer) (obj1)).getNullValue();
            }
            obj2 = obj1;
            if (obj1 == null)
            {
                obj2 = obj1;
                if (settablebeanproperty.getType().isPrimitive())
                {
                    obj2 = ClassUtil.defaultValue(settablebeanproperty.getType().getRawClass());
                }
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

    public Object build(DeserializationContext deserializationcontext, PropertyValueBuffer propertyvaluebuffer)
        throws IOException
    {
        Object obj = propertyvaluebuffer.handleIdValue(deserializationcontext, _valueInstantiator.createFromObjectWith(deserializationcontext, propertyvaluebuffer.getParameters(_defaultValues)));
        for (deserializationcontext = propertyvaluebuffer.buffered(); deserializationcontext != null; deserializationcontext = ((PropertyValue) (deserializationcontext)).next)
        {
            deserializationcontext.assign(obj);
        }

        return obj;
    }

    public SettableBeanProperty findCreatorProperty(String s)
    {
        return (SettableBeanProperty)_properties.get(s);
    }

    public Collection properties()
    {
        return _properties.values();
    }

    public PropertyValueBuffer startBuilding(JsonParser jsonparser, DeserializationContext deserializationcontext, ObjectIdReader objectidreader)
    {
        jsonparser = new PropertyValueBuffer(jsonparser, deserializationcontext, _propertyCount, objectidreader);
        if (_propertiesWithInjectables != null)
        {
            jsonparser.inject(_propertiesWithInjectables);
        }
        return jsonparser;
    }
}
