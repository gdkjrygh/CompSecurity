// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.a.a.a.c.a;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            MapNode, ListNode, Util

abstract class NodeAdapter
{

    NodeAdapter()
    {
    }

    private Double toDouble(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        double d;
        if (obj instanceof Double)
        {
            d = ((Double)obj).doubleValue();
        } else
        if (obj instanceof Number)
        {
            d = ((Number)obj).doubleValue();
        } else
        {
            d = a.b(obj.toString());
        }
        return Double.valueOf(d);
    }

    private Integer toInteger(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        int i;
        if (obj instanceof Integer)
        {
            i = ((Integer)obj).intValue();
        } else
        if (obj instanceof Number)
        {
            i = ((Number)obj).intValue();
        } else
        {
            i = a.a(obj.toString());
        }
        return Integer.valueOf(i);
    }

    public abstract boolean contains(Object obj);

    public abstract Object find(Object obj);

    public MapNode get(Object obj)
    {
        return new MapNode((Map)find(obj));
    }

    public Boolean getBool(Object obj, Boolean boolean1)
    {
        obj = getObj(obj, boolean1);
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        obj = (String)obj;
        if (obj != "true") goto _L4; else goto _L3
_L3:
        obj = Boolean.TRUE;
_L12:
        char c;
        char c1;
        char c2;
        char c3;
        char c4;
        boolean flag;
        if (obj != null && ((Boolean) (obj)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
_L4:
        if (obj == null) goto _L6; else goto _L5
_L5:
        ((String) (obj)).length();
        JVM INSTR tableswitch 1 5: default 92
    //                   1 97
    //                   2 165
    //                   3 244
    //                   4 358
    //                   5 446;
           goto _L6 _L7 _L8 _L9 _L10 _L11
_L6:
        obj = null;
          goto _L12
_L7:
        c = ((String) (obj)).charAt(0);
        if (c != 'y' && c != 'Y' && c != 't' && c != 'T')
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = Boolean.TRUE;
          goto _L12
        if (c != 'n' && c != 'N' && c != 'f' && c != 'F') goto _L6; else goto _L13
_L13:
        obj = Boolean.FALSE;
          goto _L12
_L8:
        c = ((String) (obj)).charAt(0);
        c1 = ((String) (obj)).charAt(1);
        if (c != 'o' && c != 'O' || c1 != 'n' && c1 != 'N')
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = Boolean.TRUE;
          goto _L12
        if (c != 'n' && c != 'N' || c1 != 'o' && c1 != 'O') goto _L6; else goto _L14
_L14:
        obj = Boolean.FALSE;
          goto _L12
_L9:
        c = ((String) (obj)).charAt(0);
        c1 = ((String) (obj)).charAt(1);
        c2 = ((String) (obj)).charAt(2);
        if (c != 'y' && c != 'Y' || c1 != 'e' && c1 != 'E' || c2 != 's' && c2 != 'S')
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = Boolean.TRUE;
          goto _L12
        if (c != 'o' && c != 'O' || c1 != 'f' && c1 != 'F' || c2 != 'f' && c2 != 'F') goto _L6; else goto _L15
_L15:
        obj = Boolean.FALSE;
          goto _L12
_L10:
        c = ((String) (obj)).charAt(0);
        c1 = ((String) (obj)).charAt(1);
        c2 = ((String) (obj)).charAt(2);
        c3 = ((String) (obj)).charAt(3);
        if (c != 't' && c != 'T' || c1 != 'r' && c1 != 'R' || c2 != 'u' && c2 != 'U' || c3 != 'e' && c3 != 'E') goto _L6; else goto _L16
_L16:
        obj = Boolean.TRUE;
          goto _L12
_L11:
        c = ((String) (obj)).charAt(0);
        c1 = ((String) (obj)).charAt(1);
        c2 = ((String) (obj)).charAt(2);
        c3 = ((String) (obj)).charAt(3);
        c4 = ((String) (obj)).charAt(4);
        if (c != 'f' && c != 'F' || c1 != 'a' && c1 != 'A' || c2 != 'l' && c2 != 'L' || c3 != 's' && c3 != 'S' || c4 != 'e' && c4 != 'E') goto _L6; else goto _L17
_L17:
        obj = Boolean.FALSE;
          goto _L12
_L2:
        return (Boolean)obj;
    }

    public Double getDbl(Object obj, Double double1)
    {
        return toDouble(getObj(obj, double1));
    }

    public Integer getInt(Object obj)
    {
        return toInteger(getObj(obj));
    }

    public Integer getInt(Object obj, Integer integer)
    {
        return toInteger(getObj(obj, integer));
    }

    public ListNode getList(Object obj)
    {
        if (contains(obj))
        {
            return new ListNode(find(obj));
        } else
        {
            return new ListNode(Collections.EMPTY_LIST);
        }
    }

    public List getListText(Object obj, List list)
    {
        obj = getObj(obj, list);
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof List)
        {
            return (List)obj;
        } else
        {
            return Util.newList(new String[] {
                (String)obj
            });
        }
    }

    public Map getMap(Object obj, Map map)
    {
        return (Map)getObj(obj, map);
    }

    public Object getObj(Object obj)
    {
        Object obj1 = find(obj);
        if (obj1 == null && !contains(obj))
        {
            throw new NoSuchElementException(obj.toString());
        } else
        {
            return obj1;
        }
    }

    public Object getObj(Object obj, Object obj1)
    {
        Object obj2 = find(obj);
        if (obj2 == null && !contains(obj))
        {
            return obj1;
        } else
        {
            return obj2;
        }
    }

    public String getText(Object obj)
    {
        obj = getObj(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return obj.toString();
        }
    }

    public String getText(Object obj, String s)
    {
        obj = getObj(obj, s);
        if (obj == null)
        {
            return null;
        } else
        {
            return obj.toString();
        }
    }

    public abstract boolean isEmpty();

    public abstract int size();
}
