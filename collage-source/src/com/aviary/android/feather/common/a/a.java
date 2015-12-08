// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.a;

import android.util.Log;

public class com.aviary.android.feather.common.a.a
{
    static abstract class a
        implements c
    {

        String a;

        public a(String s)
        {
            a = s;
        }
    }

    static class b extends a
    {

        public void a(String s)
        {
            Log.d(a, s);
        }

        public transient void a(String s, Object aobj[])
        {
            Log.v(a, String.format(s, aobj));
        }

        public void b(String s)
        {
            Log.i(a, s);
        }

        public transient void b(String s, Object aobj[])
        {
            Log.d(a, String.format(s, aobj));
        }

        public void c(String s)
        {
            Log.w(a, s);
        }

        public transient void c(String s, Object aobj[])
        {
            Log.i(a, String.format(s, aobj));
        }

        public void d(String s)
        {
            Log.e(a, s);
        }

        public transient void d(String s, Object aobj[])
        {
            Log.w(a, String.format(s, aobj));
        }

        public transient void e(String s, Object aobj[])
        {
            Log.e(a, String.format(s, aobj));
        }

        public b(String s)
        {
            super(s);
        }
    }

    public static interface c
    {

        public abstract void a(String s);

        public transient abstract void a(String s, Object aobj[]);

        public abstract void b(String s);

        public transient abstract void b(String s, Object aobj[]);

        public abstract void c(String s);

        public transient abstract void c(String s, Object aobj[]);

        public abstract void d(String s);

        public transient abstract void d(String s, Object aobj[]);

        public transient abstract void e(String s, Object aobj[]);
    }

    public static final class d extends Enum
    {

        public static final d a;
        private static final d b[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/aviary/android/feather/common/a/a$d, s);
        }

        public static d[] values()
        {
            return (d[])b.clone();
        }

        static 
        {
            a = new d("ConsoleLoggerType", 0);
            b = (new d[] {
                a
            });
        }

        private d(String s, int i)
        {
            super(s, i);
        }
    }

    static class e extends a
    {

        public void a(String s)
        {
        }

        public transient void a(String s, Object aobj[])
        {
        }

        public void b(String s)
        {
        }

        public transient void b(String s, Object aobj[])
        {
        }

        public void c(String s)
        {
        }

        public transient void c(String s, Object aobj[])
        {
        }

        public void d(String s)
        {
        }

        public transient void d(String s, Object aobj[])
        {
        }

        public transient void e(String s, Object aobj[])
        {
        }

        public e(String s)
        {
            super(s);
        }
    }


    public static boolean a = true;

    public com.aviary.android.feather.common.a.a()
    {
    }

    public static c a(String s, d d1)
    {
        if (a && d1 == d.a)
        {
            return new b(s);
        } else
        {
            return new e(s);
        }
    }

    public static void a(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("==================================================\n");
        stringbuffer.append("==================================================\n");
        stringbuffer.append(s);
        stringbuffer.append("\n");
        stringbuffer.append("==================================================\n");
        stringbuffer.append("==================================================\n");
        Log.e("Aviary-SDK", stringbuffer.toString());
    }

}
