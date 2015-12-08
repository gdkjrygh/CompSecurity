// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            jv

public final class la
{

    public static int a(Object aobj[], Object obj)
    {
        int j = 0;
        int i;
        if (aobj != null)
        {
            i = aobj.length;
        } else
        {
            i = 0;
        }
        for (; j < i; j++)
        {
            if (jv.equal(aobj[j], obj))
            {
                return j;
            }
        }

        return -1;
    }

    public static void a(StringBuilder stringbuilder, double ad[])
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

    public static void a(StringBuilder stringbuilder, float af[])
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

    public static void a(StringBuilder stringbuilder, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Integer.toString(ai[i]));
        }

    }

    public static void a(StringBuilder stringbuilder, long al[])
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

    public static void a(StringBuilder stringbuilder, Object aobj[])
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

    public static void a(StringBuilder stringbuilder, String as[])
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

    public static void a(StringBuilder stringbuilder, boolean aflag[])
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

    public static Integer[] a(int ai[])
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        Integer ainteger[] = null;
_L4:
        return ainteger;
_L2:
        int j = ai.length;
        Integer ainteger1[] = new Integer[j];
        int i = 0;
        do
        {
            ainteger = ainteger1;
            if (i >= j)
            {
                continue;
            }
            ainteger1[i] = Integer.valueOf(ai[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static ArrayList b(Object aobj[])
    {
        int j = aobj.length;
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aobj[i]);
        }

        return arraylist;
    }

    public static boolean b(Object aobj[], Object obj)
    {
        return a(aobj, obj) >= 0;
    }

    public static ArrayList ie()
    {
        return new ArrayList();
    }
}
