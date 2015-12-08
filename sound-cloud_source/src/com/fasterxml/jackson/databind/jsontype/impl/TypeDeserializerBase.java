// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

public abstract class TypeDeserializerBase extends TypeDeserializer
    implements Serializable
{

    protected final JavaType _baseType;
    protected final JavaType _defaultImpl;
    protected JsonDeserializer _defaultImplDeserializer;
    protected final HashMap _deserializers;
    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;
    protected final boolean _typeIdVisible;
    protected final String _typePropertyName;

    protected TypeDeserializerBase(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
    {
        _baseType = javatype;
        _idResolver = typeidresolver;
        _typePropertyName = s;
        _typeIdVisible = flag;
        _deserializers = new HashMap();
        if (class1 == null)
        {
            _defaultImpl = null;
        } else
        {
            _defaultImpl = javatype.forcedNarrowBy(class1);
        }
        _property = null;
    }

    protected TypeDeserializerBase(TypeDeserializerBase typedeserializerbase, BeanProperty beanproperty)
    {
        _baseType = typedeserializerbase._baseType;
        _idResolver = typedeserializerbase._idResolver;
        _typePropertyName = typedeserializerbase._typePropertyName;
        _typeIdVisible = typedeserializerbase._typeIdVisible;
        _deserializers = typedeserializerbase._deserializers;
        _defaultImpl = typedeserializerbase._defaultImpl;
        _defaultImplDeserializer = typedeserializerbase._defaultImplDeserializer;
        _property = beanproperty;
    }

    protected final JsonDeserializer _findDefaultImplDeserializer(DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_defaultImpl == null)
        {
            return null;
        }
        synchronized (_defaultImpl)
        {
            if (_defaultImplDeserializer == null)
            {
                _defaultImplDeserializer = deserializationcontext.findContextualValueDeserializer(_defaultImpl, _property);
            }
            deserializationcontext = _defaultImplDeserializer;
        }
        return deserializationcontext;
        deserializationcontext;
        javatype;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
    }

    protected final JsonDeserializer _findDeserializer(DeserializationContext deserializationcontext, String s)
        throws IOException, JsonProcessingException
    {
        HashMap hashmap = _deserializers;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj1 = (JsonDeserializer)_deserializers.get(s);
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = _idResolver.typeFromId(s);
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        if (_defaultImpl == null)
        {
            throw deserializationcontext.unknownTypeException(_baseType, s);
        }
        break MISSING_BLOCK_LABEL_70;
        deserializationcontext;
        hashmap;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        deserializationcontext = _findDefaultImplDeserializer(deserializationcontext);
_L5:
        _deserializers.put(s, deserializationcontext);
        obj = deserializationcontext;
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return ((JsonDeserializer) (obj));
_L4:
        obj = obj1;
        if (_baseType == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj = obj1;
        if (_baseType.getClass() == obj1.getClass())
        {
            obj = _baseType.narrowBy(((JavaType) (obj1)).getRawClass());
        }
        deserializationcontext = deserializationcontext.findContextualValueDeserializer(((JavaType) (obj)), _property);
          goto _L5
    }

    public String baseTypeName()
    {
        return _baseType.getRawClass().getName();
    }

    public Class getDefaultImpl()
    {
        if (_defaultImpl == null)
        {
            return null;
        } else
        {
            return _defaultImpl.getRawClass();
        }
    }

    public final String getPropertyName()
    {
        return _typePropertyName;
    }

    public TypeIdResolver getTypeIdResolver()
    {
        return _idResolver;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[').append(getClass().getName());
        stringbuilder.append("; base-type:").append(_baseType);
        stringbuilder.append("; id-resolver: ").append(_idResolver);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }
}
