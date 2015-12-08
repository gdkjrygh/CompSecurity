// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class ArrayUtils
{

    public static Object[] appendToArray(Object aobj[], Object obj)
    {
        if (aobj == null && obj == null)
        {
            throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
        }
        if (aobj == null)
        {
            aobj = (Object[])Array.newInstance(obj.getClass(), 1);
        } else
        {
            aobj = Arrays.copyOf(aobj, aobj.length + 1);
        }
        aobj[aobj.length - 1] = obj;
        return aobj;
    }

    public static transient Object[] concat(Object aobj[][])
    {
        if (aobj.length == 0)
        {
            return (Object[])Array.newInstance(((Object) (aobj)).getClass(), 0);
        }
        int k = 0;
        for (int i = 0; i < aobj.length; i++)
        {
            k += aobj[i].length;
        }

        Object aobj1[] = Arrays.copyOf(aobj[0], k);
        k = aobj[0].length;
        for (int j = 1; j < aobj.length; j++)
        {
            Object aobj2[] = aobj[j];
            System.arraycopy(((Object) (aobj2)), 0, ((Object) (aobj1)), k, aobj2.length);
            k += aobj2.length;
        }

        return aobj1;
    }

    public static boolean contains(int ai[], int i)
    {
        if (ai != null)
        {
            int k = ai.length;
            int j = 0;
            while (j < k) 
            {
                if (ai[j] == i)
                {
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public static boolean contains(Object aobj[], Object obj)
    {
        int i;
        boolean flag = false;
        int j;
        if (aobj != null)
        {
            j = aobj.length;
        } else
        {
            j = 0;
        }
        i = 0;
_L3:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (!Objects.equal(aobj[i], obj)) goto _L2; else goto _L1
_L1:
        if (i >= 0)
        {
            flag = true;
        }
        return flag;
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public static ArrayList toArrayList(Object aobj[])
    {
        int j = aobj.length;
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aobj[i]);
        }

        return arraylist;
    }

    public static long[] toLongArray(Collection collection)
    {
        if (collection != null && collection.size() != 0) goto _L2; else goto _L1
_L1:
        collection = new long[0];
_L4:
        return collection;
_L2:
        int i = 0;
        long al[] = new long[collection.size()];
        Iterator iterator = collection.iterator();
        do
        {
            collection = al;
            if (!iterator.hasNext())
            {
                continue;
            }
            al[i] = ((Long)iterator.next()).longValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void writeArray(StringBuilder stringbuilder, double ad[])
    {
        int j = ad.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Double.toString(ad[i]));
        }

    }

    public static void writeArray(StringBuilder stringbuilder, float af[])
    {
        int j = af.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Float.toString(af[i]));
        }

    }

    public static void writeArray(StringBuilder stringbuilder, long al[])
    {
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Long.toString(al[i]));
        }

    }

    public static void writeArray(StringBuilder stringbuilder, Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(aobj[i].toString());
        }

    }

    public static void writeArray(StringBuilder stringbuilder, boolean aflag[])
    {
        int j = aflag.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Boolean.toString(aflag[i]));
        }

    }

    public static void writeStringArray(StringBuilder stringbuilder, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append("\"").append(as[i]).append("\"");
        }

    }
}
