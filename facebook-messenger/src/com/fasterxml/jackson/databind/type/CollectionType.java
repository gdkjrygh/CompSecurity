// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            CollectionLikeType

public final class CollectionType extends CollectionLikeType
{

    private CollectionType(Class class1, JavaType javatype, Object obj, Object obj1)
    {
        super(class1, javatype, obj, obj1);
    }

    public static CollectionType construct(Class class1, JavaType javatype)
    {
        return new CollectionType(class1, javatype, null, null);
    }

    protected JavaType _narrow(Class class1)
    {
        return new CollectionType(class1, _elementType, null, null);
    }

    public JavaType narrowContentsBy(Class class1)
    {
        if (class1 == _elementType.getRawClass())
        {
            return this;
        } else
        {
            return new CollectionType(_class, _elementType.narrowBy(class1), _valueHandler, _typeHandler);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[collection type; class ").append(_class.getName()).append(", contains ").append(_elementType).append("]").toString();
    }

    public JavaType widenContentsBy(Class class1)
    {
        if (class1 == _elementType.getRawClass())
        {
            return this;
        } else
        {
            return new CollectionType(_class, _elementType.widenBy(class1), _valueHandler, _typeHandler);
        }
    }

    public volatile JavaType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public volatile CollectionLikeType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public CollectionType withContentTypeHandler(Object obj)
    {
        return new CollectionType(_class, _elementType.withTypeHandler(obj), _valueHandler, _typeHandler);
    }

    public volatile JavaType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public volatile CollectionLikeType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public CollectionType withContentValueHandler(Object obj)
    {
        return new CollectionType(_class, _elementType.withValueHandler(obj), _valueHandler, _typeHandler);
    }

    public volatile JavaType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public volatile CollectionLikeType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public CollectionType withTypeHandler(Object obj)
    {
        return new CollectionType(_class, _elementType, _valueHandler, obj);
    }

    public volatile JavaType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public volatile CollectionLikeType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public CollectionType withValueHandler(Object obj)
    {
        return new CollectionType(_class, _elementType, obj, _typeHandler);
    }
}
