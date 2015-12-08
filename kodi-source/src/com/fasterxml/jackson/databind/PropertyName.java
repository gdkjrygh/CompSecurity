// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

public class PropertyName
    implements Serializable
{

    public static final PropertyName NO_NAME = new PropertyName(new String(""), null);
    public static final PropertyName USE_DEFAULT = new PropertyName("", null);
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
        boolean flag2;
        boolean flag3;
        flag2 = true;
        flag3 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag3;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag3;
        if (obj.getClass() != getClass()) goto _L4; else goto _L5
_L5:
        obj = (PropertyName)obj;
        if (_simpleName != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        flag = flag3;
        if (((PropertyName) (obj))._simpleName != null) goto _L4; else goto _L6
_L6:
        if (_namespace == null)
        {
            boolean flag1;
            if (((PropertyName) (obj))._namespace == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            return flag1;
        } else
        {
            return _namespace.equals(((PropertyName) (obj))._namespace);
        }
        if (!_simpleName.equals(((PropertyName) (obj))._simpleName))
        {
            return false;
        }
          goto _L6
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

    public SerializableString simpleAsEncoded(MapperConfig mapperconfig)
    {
        SerializableString serializablestring = _encodedSimple;
        Object obj = serializablestring;
        if (serializablestring == null)
        {
            if (mapperconfig == null)
            {
                mapperconfig = new SerializedString(_simpleName);
            } else
            {
                mapperconfig = mapperconfig.compileString(_simpleName);
            }
            _encodedSimple = mapperconfig;
            obj = mapperconfig;
        }
        return ((SerializableString) (obj));
    }

    public String toString()
    {
        if (_namespace == null)
        {
            return _simpleName;
        } else
        {
            return (new StringBuilder()).append("{").append(_namespace).append("}").append(_simpleName).toString();
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
