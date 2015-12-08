// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            CollectionLikeType

public final class CollectionType extends CollectionLikeType
{

    private static final long serialVersionUID = 0x9344cea1407bca10L;

    private CollectionType(Class class1, JavaType javatype, Object obj, Object obj1, boolean flag)
    {
        super(class1, javatype, obj, obj1, flag);
    }

    public static CollectionType construct(Class class1, JavaType javatype)
    {
        return new CollectionType(class1, javatype, null, null, false);
    }

    protected final JavaType _narrow(Class class1)
    {
        return new CollectionType(class1, _elementType, null, null, _asStatic);
    }

    public final JavaType narrowContentsBy(Class class1)
    {
        if (class1 == _elementType.getRawClass())
        {
            return this;
        } else
        {
            return new CollectionType(_class, _elementType.narrowBy(class1), _valueHandler, _typeHandler, _asStatic);
        }
    }

    public final String toString()
    {
        return (new StringBuilder("[collection type; class ")).append(_class.getName()).append(", contains ").append(_elementType).append("]").toString();
    }

    public final JavaType widenContentsBy(Class class1)
    {
        if (class1 == _elementType.getRawClass())
        {
            return this;
        } else
        {
            return new CollectionType(_class, _elementType.widenBy(class1), _valueHandler, _typeHandler, _asStatic);
        }
    }

    public final volatile JavaType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public final volatile CollectionLikeType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public final CollectionType withContentTypeHandler(Object obj)
    {
        return new CollectionType(_class, _elementType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
    }

    public final volatile JavaType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public final volatile CollectionLikeType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public final CollectionType withContentValueHandler(Object obj)
    {
        return new CollectionType(_class, _elementType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
    }

    public final volatile JavaType withStaticTyping()
    {
        return withStaticTyping();
    }

    public final volatile CollectionLikeType withStaticTyping()
    {
        return withStaticTyping();
    }

    public final CollectionType withStaticTyping()
    {
        if (_asStatic)
        {
            return this;
        } else
        {
            return new CollectionType(_class, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);
        }
    }

    public final volatile JavaType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public final volatile CollectionLikeType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public final CollectionType withTypeHandler(Object obj)
    {
        return new CollectionType(_class, _elementType, _valueHandler, obj, _asStatic);
    }

    public final volatile JavaType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public final volatile CollectionLikeType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public final CollectionType withValueHandler(Object obj)
    {
        return new CollectionType(_class, _elementType, obj, _typeHandler, _asStatic);
    }
}
