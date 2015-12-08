// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.internal:
//            lk

public class mg
{

    private static final ThreadLocal UV = new ThreadLocal();

    public static String bw(String s)
    {
        return r(s, (String)UV.get());
    }

    public static DataSource c(DataSource datasource)
    {
        if (datasource.jz())
        {
            String s = (String)UV.get();
            if (!jN() && !s.equals(datasource.getAppPackageName()))
            {
                return datasource.jA();
            }
        }
        return datasource;
    }

    public static boolean jN()
    {
        String s = (String)UV.get();
        return s == null || s.startsWith("com.google");
    }

    private static String r(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            return s;
        } else
        {
            byte abyte0[] = new byte[s.length() + s1.length()];
            System.arraycopy(s.getBytes(), 0, abyte0, 0, s.length());
            System.arraycopy(s1.getBytes(), 0, abyte0, s.length(), s1.length());
            return Integer.toHexString(lk.a(abyte0, 0, abyte0.length, 0));
        }
    }

}
