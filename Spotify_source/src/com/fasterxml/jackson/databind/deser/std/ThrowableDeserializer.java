// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.HashSet;

public class ThrowableDeserializer extends BeanDeserializer
{

    private static final long serialVersionUID = 1L;

    public ThrowableDeserializer(BeanDeserializer beandeserializer)
    {
        super(beandeserializer);
        _vanillaProcessing = false;
    }

    protected ThrowableDeserializer(BeanDeserializer beandeserializer, NameTransformer nametransformer)
    {
        super(beandeserializer, nametransformer);
    }

    public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        boolean flag = false;
        if (_propertyBasedCreator == null) goto _L2; else goto _L1
_L1:
        jsonparser = ((JsonParser) (_deserializeUsingPropertyBased(jsonparser, deserializationcontext)));
_L7:
        return jsonparser;
_L2:
        Object obj;
        Object obj1;
        int i;
        boolean flag1;
        if (_delegateDeserializer != null)
        {
            return _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (_beanType.isAbstract())
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Can not instantiate abstract type ")).append(_beanType).append(" (need to add/enable type information?)").toString());
        }
        flag1 = _valueInstantiator.canCreateFromString();
        boolean flag2 = _valueInstantiator.canCreateUsingDefault();
        if (!flag1 && !flag2)
        {
            throw new JsonMappingException((new StringBuilder("Can not deserialize Throwable of type ")).append(_beanType).append(" without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator").toString());
        }
        i = 0;
        obj1 = null;
        obj = null;
_L4:
        Object obj2;
        if (jsonparser.getCurrentToken() == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        obj2 = jsonparser.getCurrentName();
        SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj2)));
        jsonparser.nextToken();
        if (settablebeanproperty == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj != null)
        {
            settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        } else
        {
            obj2 = obj1;
            if (obj1 == null)
            {
                int j = _beanProperties.size();
                obj2 = ((Object) (new Object[j + j]));
            }
            int k = i + 1;
            obj2[i] = settablebeanproperty;
            i = k + 1;
            obj2[k] = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
            obj1 = obj;
            obj = obj2;
        }
_L5:
        jsonparser.nextToken();
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        if ("message".equals(obj2) && flag1)
        {
            obj2 = _valueInstantiator.createFromString(deserializationcontext, jsonparser.getText());
            obj = obj2;
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_459;
            }
            for (int l = 0; l < i; l += 2)
            {
                ((SettableBeanProperty)obj1[l]).set(obj2, obj1[l + 1]);
            }

            obj1 = obj2;
            obj = null;
        } else
        if (_ignorableProps != null && _ignorableProps.contains(obj2))
        {
            jsonparser.skipChildren();
            obj2 = obj;
            obj = obj1;
            obj1 = obj2;
        } else
        {
label0:
            {
                if (_anySetter == null)
                {
                    break label0;
                }
                _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj2)));
                obj2 = obj;
                obj = obj1;
                obj1 = obj2;
            }
        }
          goto _L5
        handleUnknownProperty(jsonparser, deserializationcontext, obj, ((String) (obj2)));
        Object obj3 = obj;
        obj = obj1;
        obj1 = obj3;
          goto _L5
        jsonparser = ((JsonParser) (obj));
        if (obj != null)
        {
            continue;
        }
        int i1;
        if (flag1)
        {
            deserializationcontext = ((DeserializationContext) (_valueInstantiator.createFromString(deserializationcontext, null)));
        } else
        {
            deserializationcontext = ((DeserializationContext) (_valueInstantiator.createUsingDefault(deserializationcontext)));
        }
        jsonparser = deserializationcontext;
        if (obj1 == null)
        {
            continue;
        }
        i1 = ((flag) ? 1 : 0);
        do
        {
            jsonparser = deserializationcontext;
            if (i1 >= i)
            {
                continue;
            }
            ((SettableBeanProperty)obj1[i1]).set(deserializationcontext, obj1[i1 + 1]);
            i1 += 2;
        } while (true);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
    {
        if (getClass() != com/fasterxml/jackson/databind/deser/std/ThrowableDeserializer)
        {
            return this;
        } else
        {
            return new ThrowableDeserializer(this, nametransformer);
        }
    }
}
