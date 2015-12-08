// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.internal:
//            kb

public class kw
{

    private static final ThreadLocal Ty = new ThreadLocal();

    public static String bt(String s1)
    {
        return s(s1, (String)Ty.get());
    }

    public static DataSource c(DataSource datasource)
    {
        if (datasource.iO())
        {
            String s1 = (String)Ty.get();
            if (!jc() && !s1.equals(datasource.getAppPackageName()))
            {
                return datasource.iP();
            }
        }
        return datasource;
    }

    public static boolean jc()
    {
        String s1 = (String)Ty.get();
        return s1 == null || s1.startsWith("com.google");
    }

    private static String s(String s1, String s2)
    {
        if (s1 == null || s2 == null)
        {
            return s1;
        } else
        {
            byte abyte0[] = new byte[s1.length() + s2.length()];
            System.arraycopy(s1.getBytes(), 0, abyte0, 0, s1.length());
            System.arraycopy(s2.getBytes(), 0, abyte0, s1.length(), s2.length());
            return Integer.toHexString(kb.a(abyte0, 0, abyte0.length, 0));
        }
    }

}
