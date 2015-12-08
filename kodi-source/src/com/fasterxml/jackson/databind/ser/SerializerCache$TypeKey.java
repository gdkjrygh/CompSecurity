// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            SerializerCache

public static final class hash
{

    protected Class _class;
    protected int _hashCode;
    protected boolean _isTyped;
    protected JavaType _type;

    private static final int hash(JavaType javatype, boolean flag)
    {
        int j = javatype.hashCode() - 1;
        int i = j;
        if (flag)
        {
            i = j - 1;
        }
        return i;
    }

    private static final int hash(Class class1, boolean flag)
    {
        int j = class1.getName().hashCode();
        int i = j;
        if (flag)
        {
            i = j + 1;
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        boolean flag = true;
        if (obj != null)
        {
            if (obj == this)
            {
                return true;
            }
            if (obj.getClass() == getClass())
            {
                obj = (hash)obj;
                if (((hash) (obj))._isTyped == _isTyped)
                {
                    if (_class != null)
                    {
                        if (((_class) (obj))._class != _class)
                        {
                            flag = false;
                        }
                        return flag;
                    } else
                    {
                        return _type.equals(((_type) (obj))._type);
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return _hashCode;
    }

    public void resetTyped(Class class1)
    {
        _type = null;
        _class = class1;
        _isTyped = true;
        _hashCode = hash(class1, true);
    }

    public void resetUntyped(JavaType javatype)
    {
        _type = javatype;
        _class = null;
        _isTyped = false;
        _hashCode = hash(javatype, false);
    }

    public void resetUntyped(Class class1)
    {
        _type = null;
        _class = class1;
        _isTyped = false;
        _hashCode = hash(class1, false);
    }

    public final String toString()
    {
        if (_class != null)
        {
            return (new StringBuilder()).append("{class: ").append(_class.getName()).append(", typed? ").append(_isTyped).append("}").toString();
        } else
        {
            return (new StringBuilder()).append("{type: ").append(_type).append(", typed? ").append(_isTyped).append("}").toString();
        }
    }

    public (JavaType javatype, boolean flag)
    {
        _type = javatype;
        _class = null;
        _isTyped = flag;
        _hashCode = hash(javatype, flag);
    }

    public hash(Class class1, boolean flag)
    {
        _class = class1;
        _type = null;
        _isTyped = flag;
        _hashCode = hash(class1, flag);
    }
}
