// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

public class PropertyName
    implements Serializable
{

    public static final PropertyName NO_NAME = new PropertyName(new String(""), null);
    public static final PropertyName USE_DEFAULT = new PropertyName("", null);
    private static final long serialVersionUID = 0x6e0fe282c0ebea86L;
    protected SerializableString _encodedSimple;
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

    public static PropertyName construct(String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        if (s1 == null && s2.length() == 0)
        {
            return USE_DEFAULT;
        } else
        {
            return new PropertyName(s2, s1);
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

    public boolean hasSimpleName(String s)
    {
        if (s == null)
        {
            return _simpleName == null;
        } else
        {
            return s.equals(_simpleName);
        }
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

    public PropertyName internSimpleName()
    {
        String s;
        if (_simpleName.length() != 0)
        {
            if ((s = InternCache.instance.intern(_simpleName)) != _simpleName)
            {
                return new PropertyName(s, _namespace);
            }
        }
        return this;
    }

    public boolean isEmpty()
    {
        return _namespace == null && _simpleName.isEmpty();
    }

    protected Object readResolve()
    {
        PropertyName propertyname;
        if (_simpleName == null || "".equals(_simpleName))
        {
            propertyname = USE_DEFAULT;
        } else
        {
            propertyname = this;
            if (_simpleName.equals(""))
            {
                propertyname = this;
                if (_namespace == null)
                {
                    return NO_NAME;
                }
            }
        }
        return propertyname;
    }

    public SerializableString simpleAsEncoded(MapperConfig mapperconfig)
    {
        SerializableString serializablestring1 = _encodedSimple;
        SerializableString serializablestring = serializablestring1;
        if (serializablestring1 == null)
        {
            serializablestring = mapperconfig.compileString(_simpleName);
            _encodedSimple = serializablestring;
        }
        return serializablestring;
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

    public PropertyName withSimpleName(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (s1.equals(_simpleName))
        {
            return this;
        } else
        {
            return new PropertyName(s1, _namespace);
        }
    }

}
