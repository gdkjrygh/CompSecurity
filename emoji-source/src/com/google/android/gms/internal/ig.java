// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;

public final class ig
{

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

    public static ArrayList ga()
    {
        return new ArrayList();
    }
}
