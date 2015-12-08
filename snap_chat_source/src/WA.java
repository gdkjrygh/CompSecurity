// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;

public final class WA extends Wq
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(WA$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("ORIGINAL", 0);
            b = new a("SILENCE", 1);
            c = new a("DISABLED", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(WA$b, s);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("ORIGINAL", 0);
            b = new b("DISABLED", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s, int j)
        {
            super(s, j);
        }
    }


    public final Bitmap b;
    final b d;
    public final a e;
    public WP.b f;
    public long g;
    public final double h;
    private long i;

    public WA(String s, WK wk, Bitmap bitmap, WP.b b1, double d1, b b2, 
            a a1)
    {
        WD.a();
        this(s, wk, bitmap, b1, d1, b2, a1, new WN(new File(s)));
    }

    private WA(String s, WK wk, Bitmap bitmap, WP.b b1, double d1, b b2, 
            a a1, WN wn)
    {
label0:
        {
            boolean flag1 = false;
            super(s, wk);
            i = -1L;
            f = WP.b.a;
            g = i;
            boolean flag;
            if (d1 > 0.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dv.a(flag);
            b = bitmap;
            if (b1 == null)
            {
                b1 = WP.b.a;
            }
            f = b1;
            h = d1;
            d = (b)dv.a(b2);
            e = (a)dv.a(a1);
            if (b2 == b.b)
            {
                flag = flag1;
                if (a1 == a.c)
                {
                    break label0;
                }
            }
            flag = true;
        }
        dv.a(flag);
        g = wn.e();
        wn.a();
        return;
        s;
        throw new Wu((new StringBuilder("Failed to read duration metadata: ")).append(s.toString()).toString(), s);
        s;
        wn.a();
        throw s;
    }

    public final long a()
    {
        return (long)((double)g / h);
    }
}
