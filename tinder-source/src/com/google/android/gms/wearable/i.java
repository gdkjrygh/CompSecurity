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

public final class i
{

    public final HashMap a = new HashMap();

    public i()
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

    private boolean k(String s)
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

    private int l(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return 0;
        }
        int i1;
        try
        {
            i1 = ((Integer)obj).intValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Integer", classcastexception);
            return 0;
        }
        return i1;
    }

    private float m(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return 0.0F;
        }
        float f1;
        try
        {
            f1 = ((Float)obj).floatValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Float", Float.valueOf(0.0F), classcastexception);
            return 0.0F;
        }
        return f1;
    }

    private double n(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return 0.0D;
        }
        double d1;
        try
        {
            d1 = ((Double)obj).doubleValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Double", Double.valueOf(0.0D), classcastexception);
            return 0.0D;
        }
        return d1;
    }

    public final void a(i i1)
    {
        String s;
        for (Iterator iterator = i1.a.keySet().iterator(); iterator.hasNext(); a.put(s, i1.b(s)))
        {
            s = (String)iterator.next();
        }

    }

    public final void a(String s, long l1)
    {
        a.put(s, Long.valueOf(l1));
    }

    public final void a(String s, Asset asset)
    {
        a.put(s, asset);
    }

    public final void a(String s, String s1)
    {
        a.put(s, s1);
    }

    public final void a(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public final boolean a(String s)
    {
        return a.containsKey(s);
    }

    public final Object b(String s)
    {
        return a.get(s);
    }

    public final void b(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public final boolean c(String s)
    {
        return k(s);
    }

    public final int d(String s)
    {
        return l(s);
    }

    public final long e(String s)
    {
        return f(s);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof i))
        {
            return false;
        }
        obj = (i)obj;
        if (a.size() != ((i) (obj)).a.size())
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
            Object obj1 = b(((String) (obj2)));
            obj2 = ((i) (obj)).b(((String) (obj2)));
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
                if (!TextUtils.isEmpty(((Asset) (obj1)).c))
                {
                    flag = ((Asset) (obj1)).c.equals(((Asset) (obj2)).c);
                } else
                {
                    flag = Arrays.equals(((Asset) (obj1)).b, ((Asset) (obj2)).b);
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
                if (!Arrays.equals((String[])(String[])obj1, (String[])(String[])obj2))
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
                if (!Arrays.equals((long[])(long[])obj1, (long[])(long[])obj2))
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
                if (!Arrays.equals((float[])(float[])obj1, (float[])(float[])obj2))
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
                if (!Arrays.equals((byte[])(byte[])obj1, (byte[])(byte[])obj2))
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

    public final long f(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return 0L;
        }
        long l1;
        try
        {
            l1 = ((Long)obj).longValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "long", classcastexception);
            return 0L;
        }
        return l1;
    }

    public final float g(String s)
    {
        return m(s);
    }

    public final double h(String s)
    {
        return n(s);
    }

    public final int hashCode()
    {
        return a.hashCode() * 29;
    }

    public final String i(String s)
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

    public final String[] j(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return null;
        }
        String as[];
        try
        {
            as = (String[])(String[])obj;
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "String[]", classcastexception);
            return null;
        }
        return as;
    }

    public final String toString()
    {
        return a.toString();
    }
}
