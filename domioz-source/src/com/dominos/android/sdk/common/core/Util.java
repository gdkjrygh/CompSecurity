// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import com.dominos.android.sdk.common.StringHelper;
import com.google.a.b.by;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            IsComparator, Seq

public final class Util
{

    private Util()
    {
    }

    public static String glue(String s, String s1, String s2)
    {
        String s3;
        if (StringHelper.isEmpty(s))
        {
            s3 = StringHelper.defaultString(s2);
        } else
        {
            s3 = s;
            if (!StringHelper.isEmpty(s2))
            {
                return (new StringBuilder()).append(s).append(s1).append(s2).toString();
            }
        }
        return s3;
    }

    public static IsComparator is(Comparable comparable)
    {
        return new IsComparator(comparable);
    }

    public static transient ArrayList newList(Object aobj[])
    {
        return by.a(aobj);
    }

    public static transient Map newMap(Object aobj[])
    {
        int i = 0;
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (aobj.length != 2 || (aobj[0] instanceof String))
        {
            for (i = 0; i < aobj.length - 1; i += 2)
            {
                linkedhashmap.put((String)aobj[i], aobj[i + 1]);
            }

        } else
        if (aobj[0] instanceof List)
        {
            List list = (List)aobj[0];
            List list1 = (List)aobj[1];
            int j = list.size();
            int k = list1.size();
            i = 0;
            while (i < j) 
            {
                Object obj = list.get(i);
                if (i < k)
                {
                    aobj = ((Object []) (list1.get(i)));
                } else
                {
                    aobj = "";
                }
                linkedhashmap.put(obj, ((Object) (aobj)));
                i++;
            }
        } else
        {
            String as[] = (String[])aobj[0];
            Object aobj1[] = (Object[])aobj[1];
            while (i < as.length) 
            {
                String s = as[i];
                if (i < aobj1.length)
                {
                    aobj = ((Object []) (aobj1[i]));
                } else
                {
                    aobj = "";
                }
                linkedhashmap.put(s, ((Object) (aobj)));
                i++;
            }
        }
        return linkedhashmap;
    }

    public static String notEmpty(String s)
    {
        if (StringHelper.isEmpty(s))
        {
            throw new IllegalArgumentException("This string MUST be non-empty.");
        } else
        {
            return s;
        }
    }

    public static String notEmpty(String s, String s1)
    {
        if (StringHelper.isEmpty(s))
        {
            throw new IllegalArgumentException(s1);
        } else
        {
            return s;
        }
    }

    public static Collection notEmpty(Collection collection)
    {
        if (collection == null || collection.size() == 0)
        {
            throw new IllegalArgumentException("This collection MUST be non-empty.");
        } else
        {
            return collection;
        }
    }

    public static Collection notEmpty(Collection collection, String s)
    {
        if (collection == null || collection.size() == 0)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return collection;
        }
    }

    public static Map notEmpty(Map map)
    {
        if (map == null || map.size() == 0)
        {
            throw new IllegalArgumentException("This map MUST be non-empty.");
        } else
        {
            return map;
        }
    }

    public static Map notEmpty(Map map, String s)
    {
        if (map == null || map.size() == 0)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return map;
        }
    }

    public static double notNegative(double d)
    {
        if (d < 0.0D)
        {
            throw new IllegalArgumentException("This double MUST be non-negative.");
        } else
        {
            return d;
        }
    }

    public static double notNegative(double d, String s)
    {
        if (d < 0.0D)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return d;
        }
    }

    public static int notNegative(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("This int MUST be non-negative.");
        } else
        {
            return i;
        }
    }

    public static int notNegative(int i, String s)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return i;
        }
    }

    public static long notNegative(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("This long MUST be non-negative.");
        } else
        {
            return l;
        }
    }

    public static long notNegative(long l, String s)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return l;
        }
    }

    public static Object notNull(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("This object MUST be non-null.");
        } else
        {
            return obj;
        }
    }

    public static Object notNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return obj;
        }
    }

    public static Seq seq(Iterable iterable)
    {
        return new Seq(iterable);
    }
}
