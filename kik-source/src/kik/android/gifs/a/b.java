// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.a;

import android.content.Context;
import com.android.volley.p;
import com.android.volley.toolbox.t;
import java.util.Locale;

public abstract class b
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        private static final int f[];

        public static int[] a()
        {
            return (int[])f.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = (new int[] {
                a, b, c, d, e
            });
        }
    }


    protected p a;

    protected b(Context context)
    {
        a = t.a(context);
    }

    public abstract com.kik.g.p a();

    public abstract com.kik.g.p a(String s, int i, Locale locale);

    public abstract com.kik.g.p a(Locale locale);

    public final void a(String s)
    {
        if (a != null)
        {
            a.a(s);
        }
    }

    public abstract void a(String s, String s1, int i);

    public final void b()
    {
        if (a != null)
        {
            a.b();
            a = null;
        }
    }
}
