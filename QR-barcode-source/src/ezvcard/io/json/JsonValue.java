// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.json;

import java.util.List;
import java.util.Map;

public class JsonValue
{

    private final List array;
    private final boolean isNull;
    private final Map object;
    private final Object value;

    public JsonValue(Object obj)
    {
        value = obj;
        array = null;
        object = null;
        boolean flag;
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isNull = flag;
    }

    public JsonValue(List list)
    {
        array = list;
        value = null;
        object = null;
        boolean flag;
        if (list == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isNull = flag;
    }

    public JsonValue(Map map)
    {
        object = map;
        value = null;
        array = null;
        boolean flag;
        if (map == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isNull = flag;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (JsonValue)obj;
        if (array == null)
        {
            if (((JsonValue) (obj)).array != null)
            {
                return false;
            }
        } else
        if (!array.equals(((JsonValue) (obj)).array))
        {
            return false;
        }
        if (isNull != ((JsonValue) (obj)).isNull)
        {
            return false;
        }
        if (object == null)
        {
            if (((JsonValue) (obj)).object != null)
            {
                return false;
            }
        } else
        if (!object.equals(((JsonValue) (obj)).object))
        {
            return false;
        }
        if (value != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((JsonValue) (obj)).value == null) goto _L1; else goto _L3
_L3:
        return false;
        if (value.equals(((JsonValue) (obj)).value)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List getArray()
    {
        return array;
    }

    public Map getObject()
    {
        return object;
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        char c;
        int j;
        if (array == null)
        {
            i = 0;
        } else
        {
            i = array.hashCode();
        }
        if (isNull)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (object == null)
        {
            j = 0;
        } else
        {
            j = object.hashCode();
        }
        if (value != null)
        {
            k = value.hashCode();
        }
        return (((i + 31) * 31 + c) * 31 + j) * 31 + k;
    }

    public boolean isNull()
    {
        return isNull;
    }

    public String toString()
    {
        if (isNull)
        {
            return "NULL";
        }
        if (value != null)
        {
            return (new StringBuilder()).append("VALUE = ").append(value).toString();
        }
        if (array != null)
        {
            return (new StringBuilder()).append("ARRAY = ").append(array).toString();
        }
        if (object != null)
        {
            return (new StringBuilder()).append("OBJECT = ").append(object).toString();
        } else
        {
            return "";
        }
    }
}
