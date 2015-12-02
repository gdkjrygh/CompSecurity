// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            MapLikeType

public final class MapType extends MapLikeType
{

    private MapType(Class class1, JavaType javatype, JavaType javatype1, Object obj, Object obj1)
    {
        super(class1, javatype, javatype1, obj, obj1);
    }

    public static MapType construct(Class class1, JavaType javatype, JavaType javatype1)
    {
        return new MapType(class1, javatype, javatype1, null, null);
    }

    protected JavaType _narrow(Class class1)
    {
        return new MapType(class1, _keyType, _valueType, _valueHandler, _typeHandler);
    }

    public JavaType narrowContentsBy(Class class1)
    {
        if (class1 == _valueType.getRawClass())
        {
            return this;
        } else
        {
            return new MapType(_class, _keyType, _valueType.narrowBy(class1), _valueHandler, _typeHandler);
        }
    }

    public JavaType narrowKey(Class class1)
    {
        if (class1 == _keyType.getRawClass())
        {
            return this;
        } else
        {
            return new MapType(_class, _keyType.narrowBy(class1), _valueType, _valueHandler, _typeHandler);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[map type; class ").append(_class.getName()).append(", ").append(_keyType).append(" -> ").append(_valueType).append("]").toString();
    }

    public JavaType widenContentsBy(Class class1)
    {
        if (class1 == _valueType.getRawClass())
        {
            return this;
        } else
        {
            return new MapType(_class, _keyType, _valueType.widenBy(class1), _valueHandler, _typeHandler);
        }
    }

    public JavaType widenKey(Class class1)
    {
        if (class1 == _keyType.getRawClass())
        {
            return this;
        } else
        {
            return new MapType(_class, _keyType.widenBy(class1), _valueType, _valueHandler, _typeHandler);
        }
    }

    public volatile JavaType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public volatile MapLikeType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public MapType withContentTypeHandler(Object obj)
    {
        return new MapType(_class, _keyType, _valueType.withTypeHandler(obj), _valueHandler, _typeHandler);
    }

    public volatile JavaType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public volatile MapLikeType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public MapType withContentValueHandler(Object obj)
    {
        return new MapType(_class, _keyType, _valueType.withValueHandler(obj), _valueHandler, _typeHandler);
    }

    public volatile MapLikeType withKeyTypeHandler(Object obj)
    {
        return withKeyTypeHandler(obj);
    }

    public MapType withKeyTypeHandler(Object obj)
    {
        return new MapType(_class, _keyType.withTypeHandler(obj), _valueType, _valueHandler, _typeHandler);
    }

    public volatile MapLikeType withKeyValueHandler(Object obj)
    {
        return withKeyValueHandler(obj);
    }

    public MapType withKeyValueHandler(Object obj)
    {
        return new MapType(_class, _keyType.withValueHandler(obj), _valueType, _valueHandler, _typeHandler);
    }

    public volatile JavaType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public volatile MapLikeType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public MapType withTypeHandler(Object obj)
    {
        return new MapType(_class, _keyType, _valueType, _valueHandler, obj);
    }

    public volatile JavaType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public volatile MapLikeType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public MapType withValueHandler(Object obj)
    {
        return new MapType(_class, _keyType, _valueType, obj, _typeHandler);
    }
}
