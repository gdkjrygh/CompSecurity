// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable:
//            Asset

public final class g
{

    private final HashMap a = new HashMap();

    public g()
    {
    }

    public final Object a(String s)
    {
        return a.get(s);
    }

    public final Set a()
    {
        return a.keySet();
    }

    public final void a(String s, int i)
    {
        a.put(s, Integer.valueOf(i));
    }

    public final void a(String s, long l)
    {
        a.put(s, Long.valueOf(l));
    }

    public final void a(String s, String s1)
    {
        a.put(s, s1);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof g))
        {
            return false;
        }
        obj = (g)obj;
        if (a.size() != ((g) (obj)).a.size())
        {
            return false;
        }
        Iterator iterator = a.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (String)iterator.next();
            Object obj1 = a(((String) (obj2)));
            obj2 = ((g) (obj)).a(((String) (obj2)));
            if (obj1 instanceof Asset)
            {
                if (!(obj2 instanceof Asset))
                {
                    return false;
                }
                obj1 = (Asset)obj1;
                obj2 = (Asset)obj2;
                boolean flag;
                if (obj1 == null || obj2 == null)
                {
                    if (obj1 == obj2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                if (!TextUtils.isEmpty(((Asset) (obj1)).b()))
                {
                    flag = ((Asset) (obj1)).b().equals(((Asset) (obj2)).b());
                } else
                {
                    flag = Arrays.equals(((Asset) (obj1)).a(), ((Asset) (obj2)).a());
                }
                if (!flag)
                {
                    return false;
                }
                continue;
            }
            if (obj1 instanceof String[])
            {
                if (!(obj2 instanceof String[]))
                {
                    return false;
                }
                if (!Arrays.equals((String[])obj1, (String[])obj2))
                {
                    return false;
                }
                continue;
            }
            if (obj1 instanceof long[])
            {
                if (!(obj2 instanceof long[]))
                {
                    return false;
                }
                if (!Arrays.equals((long[])obj1, (long[])obj2))
                {
                    return false;
                }
                continue;
            }
            if (obj1 instanceof float[])
            {
                if (!(obj2 instanceof float[]))
                {
                    return false;
                }
                if (!Arrays.equals((float[])obj1, (float[])obj2))
                {
                    return false;
                }
                continue;
            }
            if (obj1 instanceof byte[])
            {
                if (!(obj2 instanceof byte[]))
                {
                    return false;
                }
                if (!Arrays.equals((byte[])obj1, (byte[])obj2))
                {
                    return false;
                }
                continue;
            }
            if (obj1 == null || obj2 == null)
            {
                if (obj1 != obj2)
                {
                    return false;
                }
                break;
            }
            if (!obj1.equals(obj2))
            {
                return false;
            }
        } while (true);
        return true;
    }

    public final int hashCode()
    {
        return a.hashCode() * 29;
    }

    public final String toString()
    {
        return a.toString();
    }
}
