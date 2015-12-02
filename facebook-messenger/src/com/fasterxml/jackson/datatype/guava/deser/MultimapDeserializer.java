// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.google.common.a.es;
import com.google.common.a.gw;
import com.google.common.a.hp;
import com.google.common.a.iw;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public class MultimapDeserializer extends JsonDeserializer
    implements ContextualDeserializer
{

    private static final List METHOD_NAMES = es.a("copyOf", "create");
    private final Method creatorMethod;
    private final JsonDeserializer elementDeserializer;
    private final TypeDeserializer elementTypeDeserializer;
    private final KeyDeserializer keyDeserializer;
    private final MapLikeType type;

    public MultimapDeserializer(MapLikeType mapliketype, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        this(mapliketype, keydeserializer, typedeserializer, jsondeserializer, findTransformer(mapliketype.getRawClass()));
    }

    public MultimapDeserializer(MapLikeType mapliketype, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer, Method method)
    {
        type = mapliketype;
        keyDeserializer = keydeserializer;
        elementTypeDeserializer = typedeserializer;
        elementDeserializer = jsondeserializer;
        creatorMethod = method;
    }

    private Throwable _peel(Throwable throwable)
    {
        for (; throwable.getCause() != null; throwable = throwable.getCause()) { }
        return throwable;
    }

    private void expect(JsonParser jsonparser, JsonToken jsontoken)
    {
        if (jsonparser.getCurrentToken() != jsontoken)
        {
            throw new JsonMappingException((new StringBuilder()).append("Expecting ").append(jsontoken).append(", found ").append(jsonparser.getCurrentToken()).toString(), jsonparser.getCurrentLocation());
        } else
        {
            return;
        }
    }

    private static Method findTransformer(Class class1)
    {
        Iterator iterator;
        if (class1 == com/google/common/a/gw || class1 == com/google/common/a/hp || class1 == com/google/common/a/iw)
        {
            return null;
        }
        iterator = METHOD_NAMES.iterator();
_L4:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = (String)iterator.next();
        obj = class1.getMethod(((String) (obj)), new Class[] {
            com/google/common/a/iw
        });
        if (obj != null)
        {
            return ((Method) (obj));
        }
        continue; /* Loop/switch isn't completed */
        iterator = METHOD_NAMES.iterator();
_L2:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = (String)iterator.next();
        obj = class1.getMethod(((String) (obj)), new Class[] {
            com/google/common/a/iw
        });
        if (obj != null)
        {
            return ((Method) (obj));
        }
        continue; /* Loop/switch isn't completed */
        return null;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        if (true) goto _L2; else goto _L1
_L1:
        nosuchmethodexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        Object obj = keyDeserializer;
        KeyDeserializer keydeserializer = ((KeyDeserializer) (obj));
        if (obj == null)
        {
            keydeserializer = deserializationcontext.findKeyDeserializer(type.getKeyType(), beanproperty);
        }
        Object obj1 = elementDeserializer;
        obj = obj1;
        if (obj1 == null)
        {
            obj = deserializationcontext.findContextualValueDeserializer(type.getContentType(), beanproperty);
        }
        obj1 = elementTypeDeserializer;
        deserializationcontext = ((DeserializationContext) (obj1));
        if (obj1 != null)
        {
            deserializationcontext = ((DeserializationContext) (obj1));
            if (beanproperty != null)
            {
                deserializationcontext = ((TypeDeserializer) (obj1)).forProperty(beanproperty);
            }
        }
        return new MultimapDeserializer(type, keydeserializer, deserializationcontext, ((JsonDeserializer) (obj)), creatorMethod);
    }

    public iw deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        gw gw1 = gw.a();
        while (jsonparser.nextToken() != JsonToken.END_OBJECT) 
        {
            Object obj;
            if (keyDeserializer != null)
            {
                obj = keyDeserializer.deserializeKey(jsonparser.getCurrentName(), deserializationcontext);
            } else
            {
                obj = jsonparser.getCurrentName();
            }
            jsonparser.nextToken();
            expect(jsonparser, JsonToken.START_ARRAY);
            while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
            {
                if (elementTypeDeserializer != null)
                {
                    gw1.a(obj, elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, elementTypeDeserializer));
                } else
                {
                    gw1.a(obj, elementDeserializer.deserialize(jsonparser, deserializationcontext));
                }
            }
        }
        if (creatorMethod == null)
        {
            return gw1;
        }
        try
        {
            jsonparser = (iw)creatorMethod.invoke(null, new Object[] {
                gw1
            });
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw new JsonMappingException((new StringBuilder()).append("Could not map to ").append(type).toString(), _peel(jsonparser));
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw new JsonMappingException((new StringBuilder()).append("Could not map to ").append(type).toString(), _peel(jsonparser));
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw new JsonMappingException((new StringBuilder()).append("Could not map to ").append(type).toString(), _peel(jsonparser));
        }
        return jsonparser;
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

}
