// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.t;

import android.graphics.Bitmap;
import p.ap.h;

// Referenced classes of package p.t:
//            g, e, h, b

class p.t.a
    implements g
{
    static class a
        implements p.t.h
    {

        private final b a;
        private int b;
        private int c;
        private android.graphics.Bitmap.Config d;

        public void a()
        {
            a.a(this);
        }

        public void a(int i, int j, android.graphics.Bitmap.Config config)
        {
            b = i;
            c = j;
            d = config;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof a)
            {
                obj = (a)obj;
                flag = flag1;
                if (b == ((a) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((a) (obj)).c)
                    {
                        flag = flag1;
                        if (d == ((a) (obj)).d)
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            int j = b;
            int k = c;
            int i;
            if (d != null)
            {
                i = d.hashCode();
            } else
            {
                i = 0;
            }
            return i + (j * 31 + k) * 31;
        }

        public String toString()
        {
            return p.t.a.c(b, c, d);
        }

        public a(b b1)
        {
            a = b1;
        }
    }

    static class b extends p.t.b
    {

        protected a a()
        {
            return new a(this);
        }

        public a a(int i, int j, android.graphics.Bitmap.Config config)
        {
            a a1 = (a)c();
            a1.a(i, j, config);
            return a1;
        }

        protected p.t.h b()
        {
            return a();
        }

        b()
        {
        }
    }


    private final b a = new b();
    private final e b = new e();

    p.t.a()
    {
    }

    static String c(int i, int j, android.graphics.Bitmap.Config config)
    {
        return d(i, j, config);
    }

    private static String d(int i, int j, android.graphics.Bitmap.Config config)
    {
        return (new StringBuilder()).append("[").append(i).append("x").append(j).append("], ").append(config).toString();
    }

    private static String d(Bitmap bitmap)
    {
        return d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public Bitmap a()
    {
        return (Bitmap)b.a();
    }

    public Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        config = a.a(i, j, config);
        return (Bitmap)b.a(config);
    }

    public void a(Bitmap bitmap)
    {
        a a1 = a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        b.a(a1, bitmap);
    }

    public String b(int i, int j, android.graphics.Bitmap.Config config)
    {
        return d(i, j, config);
    }

    public String b(Bitmap bitmap)
    {
        return d(bitmap);
    }

    public int c(Bitmap bitmap)
    {
        return h.a(bitmap);
    }

    public String toString()
    {
        return (new StringBuilder()).append("AttributeStrategy:\n  ").append(b).toString();
    }
}
