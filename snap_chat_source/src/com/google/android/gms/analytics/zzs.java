// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            zzae

public final class zzs
{

    public static String zzG(int i)
    {
        return zzd("&pr", i);
    }

    public static String zzH(int i)
    {
        return zzd("&promo", i);
    }

    public static String zzI(int i)
    {
        return zzd("pi", i);
    }

    public static String zzJ(int i)
    {
        return zzd("&il", i);
    }

    public static String zzK(int i)
    {
        return zzd("cd", i);
    }

    public static String zzL(int i)
    {
        return zzd("cm", i);
    }

    private static String zzd(String s, int i)
    {
        if (i <= 0)
        {
            zzae.zzZ((new StringBuilder("index out of range for ")).append(s).append(" (").append(i).append(")").toString());
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(i).toString();
        }
    }
}
