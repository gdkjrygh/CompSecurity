// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.text.format.Formatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

public final class noy
{

    final String a;
    final Object b;

    public noy(String s, Object obj)
    {
        a = s;
        b = obj;
    }

    public static long a()
    {
        if (b())
        {
            return SystemClock.elapsedRealtimeNanos();
        } else
        {
            return SystemClock.elapsedRealtime();
        }
    }

    public static noy a(int i)
    {
        return a("account", Integer.valueOf(i));
    }

    public static noy a(long l)
    {
        return new noy("size", Long.valueOf(l));
    }

    public static noy a(Context context, long l)
    {
        return a("size", Formatter.formatFileSize(context, l));
    }

    public static noy a(String s, int i, int j)
    {
        return a(s, (new StringBuilder(25)).append("[").append(i).append("x").append(j).append("]").toString());
    }

    public static noy a(String s, long l)
    {
        return b(s, a() - l);
    }

    public static noy a(String s, Object obj)
    {
        return new noy(s, obj);
    }

    public static noy a(String s, Collection collection)
    {
        return new noy(s, Arrays.toString(collection.toArray(new Object[collection.size()])));
    }

    public static String b(long l)
    {
        return String.format(Locale.ENGLISH, "%.3f seconds", new Object[] {
            Double.valueOf((double)l / 1000D)
        });
    }

    public static noy b(String s, long l)
    {
        String s1;
        if (b())
        {
            s1 = String.format(Locale.ENGLISH, "%.6f millis", new Object[] {
                Double.valueOf((double)l / 1000000D)
            });
        } else
        {
            s1 = b(l);
        }
        return a(s, s1);
    }

    private static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }
}
