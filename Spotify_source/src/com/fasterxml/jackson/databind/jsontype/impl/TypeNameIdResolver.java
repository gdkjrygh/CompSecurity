// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            TypeIdResolverBase

public class TypeNameIdResolver extends TypeIdResolverBase
{

    protected final MapperConfig _config;
    protected final HashMap _idToType;
    protected final HashMap _typeToId;

    protected TypeNameIdResolver(MapperConfig mapperconfig, JavaType javatype, HashMap hashmap, HashMap hashmap1)
    {
        super(javatype, mapperconfig.getTypeFactory());
        _config = mapperconfig;
        _typeToId = hashmap;
        _idToType = hashmap1;
    }

    protected static String _defaultTypeId(Class class1)
    {
        class1 = class1.getName();
        int i = class1.lastIndexOf('.');
        if (i < 0)
        {
            return class1;
        } else
        {
            return class1.substring(i + 1);
        }
    }

    public static TypeNameIdResolver construct(MapperConfig mapperconfig, JavaType javatype, Collection collection, boolean flag, boolean flag1)
    {
        if (flag == flag1)
        {
            throw new IllegalArgumentException();
        }
        HashMap hashmap;
        HashMap hashmap1;
        if (flag)
        {
            hashmap = new HashMap();
        } else
        {
            hashmap = null;
        }
        if (flag1)
        {
            hashmap1 = new HashMap();
        } else
        {
            hashmap1 = null;
        }
        if (collection != null)
        {
            Iterator iterator = collection.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                collection = (NamedType)iterator.next();
                Class class1 = collection.getType();
                if (collection.hasName())
                {
                    collection = collection.getName();
                } else
                {
                    collection = _defaultTypeId(class1);
                }
                if (flag)
                {
                    hashmap.put(class1.getName(), collection);
                }
                if (flag1)
                {
                    JavaType javatype1 = (JavaType)hashmap1.get(collection);
                    if (javatype1 == null || !class1.isAssignableFrom(javatype1.getRawClass()))
                    {
                        hashmap1.put(collection, mapperconfig.constructType(class1));
                    }
                }
            } while (true);
        }
        return new TypeNameIdResolver(mapperconfig, javatype, hashmap, hashmap1);
    }

    protected JavaType _typeFromId(String s)
    {
        return (JavaType)_idToType.get(s);
    }

    public String idFromValue(Object obj)
    {
        String s;
        Class class1;
        class1 = _typeFactory.constructType(obj.getClass()).getRawClass();
        s = class1.getName();
        HashMap hashmap = _typeToId;
        hashmap;
        JVM INSTR monitorenter ;
        obj = (String)_typeToId.get(s);
        Object obj1;
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (_config.isAnnotationProcessingEnabled())
        {
            obj = _config.introspectClassAnnotations(class1);
            obj = _config.getAnnotationIntrospector().findTypeName(((BeanDescription) (obj)).getClassInfo());
        }
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj1 = _defaultTypeId(class1);
        _typeToId.put(s, obj1);
        hashmap;
        JVM INSTR monitorexit ;
        return ((String) (obj1));
        obj;
        hashmap;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public String idFromValueAndType(Object obj, Class class1)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return idFromValue(obj);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[').append(getClass().getName());
        stringbuilder.append("; id-to-type=").append(_idToType);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public JavaType typeFromId(DatabindContext databindcontext, String s)
    {
        return _typeFromId(s);
    }

    public JavaType typeFromId(String s)
    {
        return _typeFromId(s);
    }
}
