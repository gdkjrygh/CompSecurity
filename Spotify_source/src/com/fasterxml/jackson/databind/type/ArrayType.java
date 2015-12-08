// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            TypeBase, TypeFactory

public final class ArrayType extends TypeBase
{

    private static final long serialVersionUID = 0x7d74bce994c9ddf5L;
    protected final JavaType _componentType;
    protected final Object _emptyArray;

    private ArrayType(JavaType javatype, Object obj, Object obj1, Object obj2, boolean flag)
    {
        super(obj.getClass(), javatype.hashCode(), obj1, obj2, flag);
        _componentType = javatype;
        _emptyArray = obj;
    }

    public static ArrayType construct(JavaType javatype, Object obj, Object obj1)
    {
        return new ArrayType(javatype, Array.newInstance(javatype.getRawClass(), 0), null, null, false);
    }

    protected final JavaType _narrow(Class class1)
    {
        if (!class1.isArray())
        {
            throw new IllegalArgumentException((new StringBuilder("Incompatible narrowing operation: trying to narrow ")).append(toString()).append(" to class ").append(class1.getName()).toString());
        } else
        {
            class1 = class1.getComponentType();
            return construct(TypeFactory.defaultInstance().constructType(class1), _valueHandler, _typeHandler);
        }
    }

    protected final String buildCanonicalName()
    {
        return _class.getName();
    }

    public final JavaType containedType(int i)
    {
        if (i == 0)
        {
            return _componentType;
        } else
        {
            return null;
        }
    }

    public final int containedTypeCount()
    {
        return 1;
    }

    public final String containedTypeName(int i)
    {
        if (i == 0)
        {
            return "E";
        } else
        {
            return null;
        }
    }

    public final boolean equals(Object obj)
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

    public final JavaType getContentType()
    {
        return _componentType;
    }

    public final boolean hasGenericTypes()
    {
        return _componentType.hasGenericTypes();
    }

    public final boolean isAbstract()
    {
        return false;
    }

    public final boolean isArrayType()
    {
        return true;
    }

    public final boolean isConcrete()
    {
        return true;
    }

    public final boolean isContainerType()
    {
        return true;
    }

    public final JavaType narrowContentsBy(Class class1)
    {
        if (class1 == _componentType.getRawClass())
        {
            return this;
        } else
        {
            return construct(_componentType.narrowBy(class1), _valueHandler, _typeHandler);
        }
    }

    public final String toString()
    {
        return (new StringBuilder("[array type, component type: ")).append(_componentType).append("]").toString();
    }

    public final JavaType widenContentsBy(Class class1)
    {
        if (class1 == _componentType.getRawClass())
        {
            return this;
        } else
        {
            return construct(_componentType.widenBy(class1), _valueHandler, _typeHandler);
        }
    }

    public final volatile JavaType withContentTypeHandler(Object obj)
    {
        return withContentTypeHandler(obj);
    }

    public final ArrayType withContentTypeHandler(Object obj)
    {
        if (obj == _componentType.getTypeHandler())
        {
            return this;
        } else
        {
            return new ArrayType(_componentType.withTypeHandler(obj), _emptyArray, _valueHandler, _typeHandler, _asStatic);
        }
    }

    public final volatile JavaType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public final ArrayType withContentValueHandler(Object obj)
    {
        if (obj == _componentType.getValueHandler())
        {
            return this;
        } else
        {
            return new ArrayType(_componentType.withValueHandler(obj), _emptyArray, _valueHandler, _typeHandler, _asStatic);
        }
    }

    public final volatile JavaType withStaticTyping()
    {
        return withStaticTyping();
    }

    public final ArrayType withStaticTyping()
    {
        if (_asStatic)
        {
            return this;
        } else
        {
            return new ArrayType(_componentType.withStaticTyping(), _emptyArray, _valueHandler, _typeHandler, true);
        }
    }

    public final volatile JavaType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public final ArrayType withTypeHandler(Object obj)
    {
        if (obj == _typeHandler)
        {
            return this;
        } else
        {
            return new ArrayType(_componentType, _emptyArray, _valueHandler, obj, _asStatic);
        }
    }

    public final volatile JavaType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public final ArrayType withValueHandler(Object obj)
    {
        if (obj == _valueHandler)
        {
            return this;
        } else
        {
            return new ArrayType(_componentType, _emptyArray, obj, _typeHandler, _asStatic);
        }
    }
}
