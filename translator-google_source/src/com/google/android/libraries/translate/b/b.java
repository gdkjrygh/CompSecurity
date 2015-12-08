// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.b;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

public final class b
{

    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final SharedPreferences c;

    public b(Context context, String s)
    {
        c = context.getSharedPreferences(s, 0);
    }

    public static String c(Long long1)
    {
        String s = String.valueOf("id_");
        long1 = String.valueOf(long1);
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(long1).length())).append(s).append(long1).toString();
    }

    public static String d(Long long1)
    {
        String s = String.valueOf("id_reverse_");
        long1 = String.valueOf(long1);
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(long1).length())).append(s).append(long1).toString();
    }

    public final long a(Long long1)
    {
        Long long3 = (Long)a.get(long1);
        Long long2 = long3;
        if (long3 == null)
        {
            if (c.contains(c(long1)))
            {
                long2 = Long.valueOf(c.getLong(c(long1), 0x8000000000000000L));
                a.put(long1, long2);
            } else
            {
                long2 = Long.valueOf(0x8000000000000000L);
            }
        }
        return long2.longValue();
    }

    public final long b(Long long1)
    {
        Long long3 = (Long)b.get(long1);
        Long long2 = long3;
        if (long3 == null)
        {
            if (c.contains(d(long1)))
            {
                long2 = Long.valueOf(c.getLong(d(long1), 0x8000000000000000L));
                b.put(long1, long2);
            } else
            {
                long2 = Long.valueOf(0x8000000000000000L);
            }
        }
        return long2.longValue();
    }
}
