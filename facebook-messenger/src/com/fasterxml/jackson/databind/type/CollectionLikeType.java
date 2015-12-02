// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            TypeBase

public class CollectionLikeType extends TypeBase
{

    protected final JavaType _elementType;

    protected CollectionLikeType(Class class1, JavaType javatype, Object obj, Object obj1)
    {
        super(class1, javatype.hashCode(), obj, obj1);
        _elementType = javatype;
    }

    public static CollectionLikeType construct(Class class1, JavaType javatype)
    {
        return new CollectionLikeType(class1, javatype, null, null);
    }

    protected JavaType _narrow(Class class1)
    {
        return new CollectionLikeType(class1, _elementType, _valueHandler, _typeHandler);
    }

    protected String buildCanonicalName()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(_class.getName());
        if (_elementType != null)
        {
            stringbuilder.append('<');
            stringbuilder.append(_elementType.toCanonical());
            stringbuilder.append('>');
        }
        return stringbuilder.toString();
    }

    public volatile ResolvedType containedType(int i)
    {
        return containedType(i);
    }

    public JavaType containedType(int i)
    {
        if (i == 0)
        {
            return _elementType;
        } else
        {
            return null;
        }
    }

    public int containedTypeCount()
    {
        return 1;
    }

    public String containedTypeName(int i)
    {
        if (i == 0)
        {
            return "E";
        } else
        {
            return null;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (CollectionLikeType)obj;
            if (_class != ((CollectionLikeType) (obj))._class || !_elementType.equals(((CollectionLikeType) (obj))._elementType))
            {
                return false;
            }
        }
        return true;
    }

    public volatile ResolvedType getContentType()
    {
        return getContentType();
    }

    public JavaType getContentType()
    {
        return _elementType;
    }

    public StringBuilder getErasedSignature(StringBuilder stringbuilder)
    {
        return _classSignature(_class, stringbuilder, true);
    }

    public StringBuilder getGenericSignature(StringBuilder stringbuilder)
    {
        _classSignature(_class, stringbuilder, false);
        stringbuilder.append('<');
        _elementType.getGenericSignature(stringbuilder);
        stringbuilder.append(">;");
        return stringbuilder;
    }

    public boolean isCollectionLikeType()
    {
        return true;
    }

    public boolean isContainerType()
    {
        return true;
    }

    public boolean isTrueCollectionType()
    {
        return java/util/Collection.isAssignableFrom(_class);
    }

    public JavaType narrowContentsBy(Class class1)
    {
        if (class1 == _elementType.getRawClass())
        {
            return this;
        } else
        {
            return new CollectionLikeType(_class, _elementType.narrowBy(class1), _valueHandler, _typeHandler);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[collection-like type; class ").append(_class.getName()).append(", contains ").append(_elementType).append("]").toString();
    }

    public JavaType widenContentsBy(Class class1)
    {
        if (class1 == _elementType.getRawClass())
        {
            return this;
        } else
        {
            return new CollectionLikeType(_class, _elementType.widenBy(class1), _valueHandler, _typeHandler);
        }
    }

    public volatile JavaType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public CollectionLikeType withContentTypeHandler(Object obj)
    {
        return new CollectionLikeType(_class, _elementType.withTypeHandler(obj), _valueHandler, _typeHandler);
    }

    public volatile JavaType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public CollectionLikeType withContentValueHandler(Object obj)
    {
        return new CollectionLikeType(_class, _elementType.withValueHandler(obj), _valueHandler, _typeHandler);
    }

    public volatile JavaType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public CollectionLikeType withTypeHandler(Object obj)
    {
        return new CollectionLikeType(_class, _elementType, _valueHandler, obj);
    }

    public volatile JavaType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public CollectionLikeType withValueHandler(Object obj)
    {
        return new CollectionLikeType(_class, _elementType, obj, _typeHandler);
    }
}
