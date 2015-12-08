// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.util.Log;
import java.util.concurrent.ExecutorService;

// Referenced classes of package crittercism.android:
//            co, ec, dg

public final class dx
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(crittercism/android/dx$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("UNINITIALIZED", 0);
            b = new a("ON", 1);
            c = new a("OFF", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public static a a;
    private static ec b;

    public static void a()
    {
    }

    public static void a(ec ec1)
    {
        b = ec1;
    }

    public static void a(String s, String s1)
    {
        Log.i(s, s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        Log.e(s, s1, throwable);
    }

    public static void a(Throwable throwable)
    {
        if (throwable instanceof co)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ec ec1 = b;
        if (b != null && a == a.b)
        {
            ec ec2 = b;
            throwable = new ec._cls1(ec2, throwable, Thread.currentThread().getId());
            if (!ec2.c.a(throwable))
            {
                ec2.b.execute(throwable);
            }
        }
        return;
        throwable;
        throw throwable;
        throwable;
    }

    public static void b()
    {
    }

    public static void b(String s, String s1)
    {
        Log.e(s, s1);
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        Log.w(s, s1, throwable);
    }

    public static void c()
    {
    }

    public static void c(String s, String s1)
    {
        Log.w(s, s1);
    }

    static 
    {
        a = a.a;
    }
}
