// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.util.HashMap;

public class SimpleSerializers extends com.fasterxml.jackson.databind.ser.Serializers.Base
{

    protected HashMap _classMappings;
    protected HashMap _interfaceMappings;

    public SimpleSerializers()
    {
        _classMappings = null;
        _interfaceMappings = null;
    }

    private void _addSerializer(Class class1, JsonSerializer jsonserializer)
    {
        ClassKey classkey = new ClassKey(class1);
        if (class1.isInterface())
        {
            if (_interfaceMappings == null)
            {
                _interfaceMappings = new HashMap();
            }
            _interfaceMappings.put(classkey, jsonserializer);
            return;
        }
        if (_classMappings == null)
        {
            _classMappings = new HashMap();
        }
        _classMappings.put(classkey, jsonserializer);
    }

    protected JsonSerializer _findInterfaceMapping(Class class1, ClassKey classkey)
    {
        Class aclass[];
        int i;
        int j;
        aclass = class1.getInterfaces();
        j = aclass.length;
        i = 0;
_L5:
        Object obj;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aclass[i];
        classkey.reset(((Class) (obj)));
        class1 = (JsonSerializer)_interfaceMappings.get(classkey);
        if (class1 == null) goto _L2; else goto _L1
_L1:
        return class1;
_L2:
        obj = _findInterfaceMapping(((Class) (obj)), classkey);
        class1 = ((Class) (obj));
        if (obj != null) goto _L1; else goto _L3
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return null;
    }

    public void addSerializer(JsonSerializer jsonserializer)
    {
        Class class1 = jsonserializer.handledType();
        if (class1 == null || class1 == java/lang/Object)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("JsonSerializer of type ").append(jsonserializer.getClass().getName()).append(" does not define valid handledType() -- must either register with method that takes type argument ").append(" or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'").toString());
        } else
        {
            _addSerializer(class1, jsonserializer);
            return;
        }
    }

    public void addSerializer(Class class1, JsonSerializer jsonserializer)
    {
        _addSerializer(class1, jsonserializer);
    }

    public JsonSerializer findArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return findSerializer(serializationconfig, arraytype, beandescription);
    }

    public JsonSerializer findCollectionLikeSerializer(SerializationConfig serializationconfig, CollectionLikeType collectionliketype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return findSerializer(serializationconfig, collectionliketype, beandescription);
    }

    public JsonSerializer findCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return findSerializer(serializationconfig, collectiontype, beandescription);
    }

    public JsonSerializer findMapLikeSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        return findSerializer(serializationconfig, mapliketype, beandescription);
    }

    public JsonSerializer findMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        return findSerializer(serializationconfig, maptype, beandescription);
    }

    public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
    {
        ClassKey classkey;
        javatype = javatype.getRawClass();
        classkey = new ClassKey(javatype);
        if (!javatype.isInterface()) goto _L2; else goto _L1
_L1:
        if (_interfaceMappings == null) goto _L4; else goto _L3
_L3:
        serializationconfig = (JsonSerializer)_interfaceMappings.get(classkey);
        if (serializationconfig == null) goto _L4; else goto _L5
_L5:
        return serializationconfig;
_L2:
        if (_classMappings == null) goto _L4; else goto _L6
_L6:
        beandescription = (JsonSerializer)_classMappings.get(classkey);
        serializationconfig = beandescription;
        if (beandescription != null) goto _L5; else goto _L7
_L7:
        beandescription = javatype;
_L10:
        if (beandescription == null) goto _L4; else goto _L8
_L8:
        JsonSerializer jsonserializer;
        classkey.reset(beandescription);
        jsonserializer = (JsonSerializer)_classMappings.get(classkey);
        serializationconfig = jsonserializer;
        if (jsonserializer != null) goto _L5; else goto _L9
_L9:
        beandescription = beandescription.getSuperclass();
          goto _L10
_L4:
        if (_interfaceMappings == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        beandescription = _findInterfaceMapping(javatype, classkey);
        serializationconfig = beandescription;
        if (beandescription != null) goto _L5; else goto _L11
_L11:
        if (javatype.isInterface())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        serializationconfig = javatype;
        do
        {
            serializationconfig = serializationconfig.getSuperclass();
            if (serializationconfig == null)
            {
                break MISSING_BLOCK_LABEL_169;
            }
            javatype = _findInterfaceMapping(serializationconfig, classkey);
        } while (javatype == null);
        return javatype;
        return null;
    }
}
