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

public class DataMap
{

    private final HashMap a = new HashMap();

    public DataMap()
    {
    }

    private void a(String s, Object obj, String s1, ClassCastException classcastexception)
    {
        a(s, obj, s1, "<null>", classcastexception);
    }

    private void a(String s, Object obj, String s1, Object obj1, ClassCastException classcastexception)
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

    private static boolean a(Asset asset, Asset asset1)
    {
        if (asset == null || asset1 == null)
        {
            return asset == asset1;
        }
        if (!TextUtils.isEmpty(asset.b()))
        {
            return asset.b().equals(asset1.b());
        } else
        {
            return Arrays.equals(asset.a(), asset1.a());
        }
    }

    private static boolean a(DataMap datamap, DataMap datamap1)
    {
        if (datamap.a() == datamap1.a()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator = datamap.b().iterator();
_L4:
        Object obj;
        Object obj1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_280;
        }
        obj1 = (String)iterator.next();
        obj = datamap.b(((String) (obj1)));
        obj1 = datamap1.b(((String) (obj1)));
        if (!(obj instanceof Asset))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (!(obj1 instanceof Asset)) goto _L1; else goto _L3
_L3:
        if (!a((Asset)obj, (Asset)obj1))
        {
            return false;
        }
          goto _L4
        if (!(obj instanceof String[]))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (!(obj1 instanceof String[])) goto _L1; else goto _L5
_L5:
        if (!Arrays.equals((String[])(String[])obj, (String[])(String[])obj1))
        {
            return false;
        }
          goto _L4
        if (!(obj instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (!(obj1 instanceof long[])) goto _L1; else goto _L6
_L6:
        if (!Arrays.equals((long[])(long[])obj, (long[])(long[])obj1))
        {
            return false;
        }
          goto _L4
        if (!(obj instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        if (!(obj1 instanceof float[])) goto _L1; else goto _L7
_L7:
        if (!Arrays.equals((float[])(float[])obj, (float[])(float[])obj1))
        {
            return false;
        }
          goto _L4
        if (!(obj instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_242;
        }
        if (!(obj1 instanceof byte[])) goto _L1; else goto _L8
_L8:
        if (!Arrays.equals((byte[])(byte[])obj, (byte[])(byte[])obj1))
        {
            return false;
        }
          goto _L4
        if (obj == null || obj1 == null)
        {
            boolean flag;
            if (obj == obj1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }
        if (!obj.equals(obj1))
        {
            return false;
        }
          goto _L4
        return true;
    }

    public int a()
    {
        return a.size();
    }

    public void a(String s, byte byte0)
    {
        a.put(s, Byte.valueOf(byte0));
    }

    public void a(String s, double d1)
    {
        a.put(s, Double.valueOf(d1));
    }

    public void a(String s, float f1)
    {
        a.put(s, Float.valueOf(f1));
    }

    public void a(String s, int j)
    {
        a.put(s, Integer.valueOf(j));
    }

    public void a(String s, long l)
    {
        a.put(s, Long.valueOf(l));
    }

    public void a(String s, Asset asset)
    {
        a.put(s, asset);
    }

    public void a(String s, DataMap datamap)
    {
        a.put(s, datamap);
    }

    public void a(String s, String s1)
    {
        a.put(s, s1);
    }

    public void a(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public void a(String s, boolean flag)
    {
        a.put(s, Boolean.valueOf(flag));
    }

    public void a(String s, byte abyte0[])
    {
        a.put(s, abyte0);
    }

    public void a(String s, float af[])
    {
        a.put(s, af);
    }

    public void a(String s, long al[])
    {
        a.put(s, al);
    }

    public void a(String s, String as[])
    {
        a.put(s, as);
    }

    public boolean a(String s)
    {
        return a.containsKey(s);
    }

    public double b(String s, double d1)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return d1;
        }
        double d2;
        try
        {
            d2 = ((Double)obj).doubleValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Double", Double.valueOf(d1), classcastexception);
            return d1;
        }
        return d2;
    }

    public float b(String s, float f1)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return f1;
        }
        float f2;
        try
        {
            f2 = ((Float)obj).floatValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Float", Float.valueOf(f1), classcastexception);
            return f1;
        }
        return f2;
    }

    public int b(String s, int j)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return j;
        }
        int k;
        try
        {
            k = ((Integer)obj).intValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Integer", classcastexception);
            return j;
        }
        return k;
    }

    public long b(String s, long l)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return l;
        }
        long l1;
        try
        {
            l1 = ((Long)obj).longValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "long", classcastexception);
            return l;
        }
        return l1;
    }

    public Object b(String s)
    {
        return a.get(s);
    }

    public Set b()
    {
        return a.keySet();
    }

    public void b(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public boolean b(String s, boolean flag)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return flag;
        }
        boolean flag1;
        try
        {
            flag1 = ((Boolean)obj).booleanValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Boolean", Boolean.valueOf(flag), classcastexception);
            return flag;
        }
        return flag1;
    }

    public void c(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public boolean c(String s)
    {
        return b(s, false);
    }

    public int d(String s)
    {
        return b(s, 0);
    }

    public long e(String s)
    {
        return b(s, 0L);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof DataMap))
        {
            return false;
        } else
        {
            return a(this, (DataMap)obj);
        }
    }

    public float f(String s)
    {
        return b(s, 0.0F);
    }

    public double g(String s)
    {
        return b(s, 0.0D);
    }

    public String h(String s)
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

    public int hashCode()
    {
        return a.hashCode() * 29;
    }

    public String[] i(String s)
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

    public String toString()
    {
        return a.toString();
    }
}
