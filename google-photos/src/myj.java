// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public final class myj
{

    final Context a;

    public myj(Context context)
    {
        a = context;
    }

    static String a(String s)
    {
        s = String.valueOf(s);
        String s1 = String.valueOf(".flags");
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public static String b(String s)
    {
        s = String.valueOf(s);
        String s1 = String.valueOf(".timestamp");
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    SharedPreferences a()
    {
        return a.getSharedPreferences("accounts", 0);
    }
}
