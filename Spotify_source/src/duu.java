// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;

public final class duu
{

    public duu()
    {
    }

    public static String a()
    {
        if (gcl.j)
        {
            StringBuilder stringbuilder = new StringBuilder();
            String as[] = Build.SUPPORTED_ABIS;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append(as[i]).append('/');
            }

            if (stringbuilder.length() > 0)
            {
                stringbuilder.setLength(stringbuilder.length() - 1);
            }
            return stringbuilder.toString();
        } else
        {
            return (new StringBuilder()).append(Build.CPU_ABI).append('/').append(Build.CPU_ABI2).toString();
        }
    }
}
