// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;


public class PropertyName
{

    public static final PropertyName NO_NAME = new PropertyName(new String("#disabled"), null);
    public static final PropertyName USE_DEFAULT = new PropertyName("", null);
    protected final String _namespace;
    protected final String _simpleName;

    public PropertyName(String s)
    {
        this(s, null);
    }

    public PropertyName(String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        _simpleName = s2;
        _namespace = s1;
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
            obj = (PropertyName)obj;
            if (_simpleName == null)
            {
                if (((PropertyName) (obj))._simpleName != null)
                {
                    return false;
                }
            } else
            if (!_simpleName.equals(((PropertyName) (obj))._simpleName))
            {
                return false;
            }
            if (_namespace == null)
            {
                if (((PropertyName) (obj))._namespace != null)
                {
                    return false;
                }
            } else
            {
                return _namespace.equals(((PropertyName) (obj))._namespace);
            }
        }
        return true;
    }

    public String getSimpleName()
    {
        return _simpleName;
    }

    public boolean hasSimpleName()
    {
        return _simpleName.length() > 0;
    }

    public int hashCode()
    {
        if (_namespace == null)
        {
            return _simpleName.hashCode();
        } else
        {
            return _namespace.hashCode() ^ _simpleName.hashCode();
        }
    }

    public String toString()
    {
        if (_namespace == null)
        {
            return _simpleName;
        } else
        {
            return (new StringBuilder("{")).append(_namespace).append("}").append(_simpleName).toString();
        }
    }

}
