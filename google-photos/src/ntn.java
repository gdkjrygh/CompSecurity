// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class ntn
{

    private static onh a = new onh("debug.nots.logging", false);
    private static final int b = 18;

    public static String a(Class class1)
    {
        return a(class1.getSimpleName());
    }

    public static String a(String s)
    {
        String s1 = s;
        if (s.startsWith("Gns"))
        {
            s1 = s.replace("Gns", "");
        }
        s = s1;
        if (s1.startsWith("Guns"))
        {
            s = s1.replace("Guns", "");
        }
        if (s.length() <= b)
        {
            String s2 = String.valueOf("Gns:");
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                return s2.concat(s);
            } else
            {
                return new String(s2);
            }
        } else
        {
            String s3 = String.valueOf("Gns:");
            s = String.valueOf(s.substring(0, b));
            String s4 = String.valueOf("~");
            return (new StringBuilder(String.valueOf(s3).length() + 0 + String.valueOf(s).length() + String.valueOf(s4).length())).append(s3).append(s).append(s4).toString();
        }
    }

    public static void a(String s, String s1)
    {
    }

    public static void a(String s, String s1, Throwable throwable)
    {
    }

    private static boolean a(String s, int i)
    {
        return Log.isLoggable(s, i);
    }

    public static void b(String s, String s1)
    {
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        if (a(s, 6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public static void c(String s, String s1)
    {
    }

    public static void d(String s, String s1)
    {
        if (a(s, 6))
        {
            Log.e(s, s1);
        }
    }

}
