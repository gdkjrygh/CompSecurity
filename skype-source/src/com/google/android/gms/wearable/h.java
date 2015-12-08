// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable:
//            Asset

public final class h
{

    private final HashMap a = new HashMap();

    public h()
    {
    }

    private static void a(String s, Object obj, String s1, ClassCastException classcastexception)
    {
        a(s, obj, s1, "<null>", classcastexception);
    }

    private static void a(String s, Object obj, String s1, Object obj1, ClassCastException classcastexception)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Key ");
        stringbuilder.append(s);
        stringbuilder.append(" expected ");
        stringbuilder.append(s1);
        stringbuilder.append(" but value was a ");
        stringbuilder.append(obj.getClass().getName());
        stringbuilder.append(".  The default value ");
        stringbuilder.append(obj1);
        stringbuilder.append(" was returned.");
        Log.w("DataMap", stringbuilder.toString());
        Log.w("DataMap", "Attempt to cast generated internal exception:", classcastexception);
    }

    public final Object a(String s)
    {
        return a.get(s);
    }

    public final Set a()
    {
        return a.keySet();
    }

    public final void a(h h1)
    {
        String s;
        for (Iterator iterator = h1.a.keySet().iterator(); iterator.hasNext(); a.put(s, h1.a(s)))
        {
            s = (String)iterator.next();
        }

    }

    public final void a(String s, byte byte0)
    {
        a.put(s, Byte.valueOf(byte0));
    }

    public final void a(String s, double d1)
    {
        a.put(s, Double.valueOf(d1));
    }

    public final void a(String s, float f1)
    {
        a.put(s, Float.valueOf(f1));
    }

    public final void a(String s, int i)
    {
        a.put(s, Integer.valueOf(i));
    }

    public final void a(String s, long l)
    {
        a.put(s, Long.valueOf(l));
    }

    public final void a(String s, Asset asset)
    {
        a.put(s, asset);
    }

    public final void a(String s, h h1)
    {
        a.put(s, h1);
    }

    public final void a(String s, String s1)
    {
        a.put(s, s1);
    }

    public final void a(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public final void a(String s, boolean flag)
    {
        a.put(s, Boolean.valueOf(flag));
    }

    public final void a(String s, byte abyte0[])
    {
        a.put(s, abyte0);
    }

    public final void a(String s, float af[])
    {
        a.put(s, af);
    }

    public final void a(String s, long al[])
    {
        a.put(s, al);
    }

    public final void a(String s, String as[])
    {
        a.put(s, as);
    }

    public final void b(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public final boolean b(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = ((Boolean)obj).booleanValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Boolean", Boolean.valueOf(false), classcastexception);
            return false;
        }
        return flag;
    }

    public final int c(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return 0;
        }
        int i;
        try
        {
            i = ((Integer)obj).intValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Integer", classcastexception);
            return 0;
        }
        return i;
    }

    public final void c(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public final long d(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return 0L;
        }
        long l;
        try
        {
            l = ((Long)obj).longValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "long", classcastexception);
            return 0L;
        }
        return l;
    }

    public final String e(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return null;
        }
        String s1;
        try
        {
            s1 = (String)obj;
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "String", classcastexception);
            return null;
        }
        return s1;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof h))
        {
            return false;
        }
        obj = (h)obj;
        if (a.size() != ((h) (obj)).a.size())
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
            obj2 = ((h) (obj)).a(((String) (obj2)));
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

    public final Asset f(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return null;
        }
        Asset asset;
        try
        {
            asset = (Asset)obj;
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Asset", classcastexception);
            return null;
        }
        return asset;
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
