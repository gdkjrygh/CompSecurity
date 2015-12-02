// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            TypeBase, TypeFactory

public final class ArrayType extends TypeBase
{

    protected final JavaType _componentType;
    protected final Object _emptyArray;

    private ArrayType(JavaType javatype, Object obj, Object obj1, Object obj2)
    {
        super(obj.getClass(), javatype.hashCode(), obj1, obj2);
        _componentType = javatype;
        _emptyArray = obj;
    }

    public static ArrayType construct(JavaType javatype, Object obj, Object obj1)
    {
        return new ArrayType(javatype, Array.newInstance(javatype.getRawClass(), 0), null, null);
    }

    protected JavaType _narrow(Class class1)
    {
        if (!class1.isArray())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Incompatible narrowing operation: trying to narrow ").append(toString()).append(" to class ").append(class1.getName()).toString());
        } else
        {
            class1 = class1.getComponentType();
            return construct(TypeFactory.defaultInstance().constructType(class1), _valueHandler, _typeHandler);
        }
    }

    protected String buildCanonicalName()
    {
        return _class.getName();
    }

    public volatile ResolvedType containedType(int i)
    {
        return containedType(i);
    }

    public JavaType containedType(int i)
    {
        if (i == 0)
        {
            return _componentType;
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
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj.getClass() == getClass())
                {
                    obj = (ArrayType)obj;
                    return _componentType.equals(((ArrayType) (obj))._componentType);
                }
            }
        }
        return flag;
    }

    public volatile ResolvedType getContentType()
    {
        return getContentType();
    }

    public JavaType getContentType()
    {
        return _componentType;
    }

    public StringBuilder getErasedSignature(StringBuilder stringbuilder)
    {
        stringbuilder.append('[');
        return _componentType.getErasedSignature(stringbuilder);
    }

    public StringBuilder getGenericSignature(StringBuilder stringbuilder)
    {
        stringbuilder.append('[');
        return _componentType.getGenericSignature(stringbuilder);
    }

    public boolean hasGenericTypes()
    {
        return _componentType.hasGenericTypes();
    }

    public boolean isAbstract()
    {
        return false;
    }

    public boolean isArrayType()
    {
        return true;
    }

    public boolean isConcrete()
    {
        return true;
    }

    public boolean isContainerType()
    {
        return true;
    }

    public JavaType narrowContentsBy(Class class1)
    {
        if (class1 == _componentType.getRawClass())
        {
            return this;
        } else
        {
            return construct(_componentType.narrowBy(class1), _valueHandler, _typeHandler);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[array type, component type: ").append(_componentType).append("]").toString();
    }

    public JavaType widenContentsBy(Class class1)
    {
        if (class1 == _componentType.getRawClass())
        {
            return this;
        } else
        {
            return construct(_componentType.widenBy(class1), _valueHandler, _typeHandler);
        }
    }

    public volatile JavaType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public ArrayType withContentTypeHandler(Object obj)
    {
        if (obj == _componentType.getTypeHandler())
        {
            return this;
        } else
        {
            return new ArrayType(_componentType.withTypeHandler(obj), _emptyArray, _valueHandler, _typeHandler);
        }
    }

    public volatile JavaType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public ArrayType withContentValueHandler(Object obj)
    {
        if (obj == _componentType.getValueHandler())
        {
            return this;
        } else
        {
            return new ArrayType(_componentType.withValueHandler(obj), _emptyArray, _valueHandler, _typeHandler);
        }
    }

    public volatile JavaType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public ArrayType withTypeHandler(Object obj)
    {
        if (obj == _typeHandler)
        {
            return this;
        } else
        {
            return new ArrayType(_componentType, _emptyArray, _valueHandler, obj);
        }
    }

    public volatile JavaType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public ArrayType withValueHandler(Object obj)
    {
        if (obj == _valueHandler)
        {
            return this;
        } else
        {
            return new ArrayType(_componentType, _emptyArray, obj, _typeHandler);
        }
    }
}
