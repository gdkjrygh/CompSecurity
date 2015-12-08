// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            TypeBase

public final class SimpleType extends TypeBase
{

    private static final long serialVersionUID = 0xf4e47f55695bcb98L;
    protected final String _typeNames[];
    protected final JavaType _typeParameters[];

    protected SimpleType(Class class1)
    {
        this(class1, null, null, null, null, false);
    }

    protected SimpleType(Class class1, String as[], JavaType ajavatype[], Object obj, Object obj1, boolean flag)
    {
        super(class1, 0, obj, obj1, flag);
        if (as == null || as.length == 0)
        {
            _typeNames = null;
            _typeParameters = null;
            return;
        } else
        {
            _typeNames = as;
            _typeParameters = ajavatype;
            return;
        }
    }

    public static SimpleType constructUnsafe(Class class1)
    {
        return new SimpleType(class1, null, null, null, null, false);
    }

    protected final JavaType _narrow(Class class1)
    {
        return new SimpleType(class1, _typeNames, _typeParameters, _valueHandler, _typeHandler, _asStatic);
    }

    protected final String buildCanonicalName()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(_class.getName());
        if (_typeParameters != null && _typeParameters.length > 0)
        {
            stringbuilder.append('<');
            boolean flag = true;
            JavaType ajavatype[] = _typeParameters;
            int j = ajavatype.length;
            int i = 0;
            while (i < j) 
            {
                JavaType javatype = ajavatype[i];
                if (flag)
                {
                    flag = false;
                } else
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append(javatype.toCanonical());
                i++;
            }
            stringbuilder.append('>');
        }
        return stringbuilder.toString();
    }

    public final JavaType containedType(int i)
    {
        if (i < 0 || _typeParameters == null || i >= _typeParameters.length)
        {
            return null;
        } else
        {
            return _typeParameters[i];
        }
    }

    public final int containedTypeCount()
    {
        if (_typeParameters == null)
        {
            return 0;
        } else
        {
            return _typeParameters.length;
        }
    }

    public final String containedTypeName(int i)
    {
        if (i < 0 || _typeNames == null || i >= _typeNames.length)
        {
            return null;
        } else
        {
            return _typeNames[i];
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (obj.getClass() != getClass())
        {
            return false;
        }
        SimpleType simpletype = (SimpleType)obj;
        if (simpletype._class != _class)
        {
            return false;
        }
        obj = _typeParameters;
        JavaType ajavatype[] = simpletype._typeParameters;
        if (obj == null)
        {
            if (ajavatype != null && ajavatype.length != 0)
            {
                return false;
            }
        } else
        {
            if (ajavatype == null)
            {
                return false;
            }
            if (obj.length != ajavatype.length)
            {
                return false;
            }
            int j = obj.length;
            int i = 0;
            while (i < j) 
            {
                if (!obj[i].equals(ajavatype[i]))
                {
                    return false;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean isContainerType()
    {
        return false;
    }

    public final JavaType narrowContentsBy(Class class1)
    {
        throw new IllegalArgumentException("Internal error: SimpleType.narrowContentsBy() should never be called");
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(40);
        stringbuilder.append("[simple type, class ").append(buildCanonicalName()).append(']');
        return stringbuilder.toString();
    }

    public final JavaType widenContentsBy(Class class1)
    {
        throw new IllegalArgumentException("Internal error: SimpleType.widenContentsBy() should never be called");
    }

    public final JavaType withContentTypeHandler(Object obj)
    {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
    }

    public final volatile JavaType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public final SimpleType withContentValueHandler(Object obj)
    {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenValueHandler()");
    }

    public final volatile JavaType withStaticTyping()
    {
        return withStaticTyping();
    }

    public final SimpleType withStaticTyping()
    {
        if (_asStatic)
        {
            return this;
        } else
        {
            return new SimpleType(_class, _typeNames, _typeParameters, _valueHandler, _typeHandler, _asStatic);
        }
    }

    public final volatile JavaType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public final SimpleType withTypeHandler(Object obj)
    {
        return new SimpleType(_class, _typeNames, _typeParameters, _valueHandler, obj, _asStatic);
    }

    public final volatile JavaType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }

    public final SimpleType withValueHandler(Object obj)
    {
        if (obj == _valueHandler)
        {
            return this;
        } else
        {
            return new SimpleType(_class, _typeNames, _typeParameters, obj, _typeHandler, _asStatic);
        }
    }
}
