// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            az

public abstract class fp
{
    public static interface a
    {

        public abstract void a(fp fp1);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        private static final b f[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/videoad/fp$b, s);
        }

        public static b[] values()
        {
            return (b[])f.clone();
        }

        static 
        {
            a = new b("Invalid", 0);
            b = new b("Complete", 1);
            c = new b("Error", 2);
            d = new b("FatalError", 3);
            e = new b("Cancelled", 4);
            f = (new b[] {
                a, b, c, d, e
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        private static final c d[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/tremorvideo/sdk/android/videoad/fp$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        static 
        {
            a = new c("Initialized", 0);
            b = new c("Stopped", 1);
            c = new c("Running", 2);
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        public static final d g;
        private static final d h[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/tremorvideo/sdk/android/videoad/fp$d, s);
        }

        public static d[] values()
        {
            return (d[])h.clone();
        }

        static 
        {
            a = new d("Asset", 0);
            b = new d("Video", 1);
            c = new d("Survey", 2);
            d = new d("HTML5", 3);
            e = new d("VAST", 4);
            f = new d("ProcessBIN", 5);
            g = new d("Invalid", 6);
            h = (new d[] {
                a, b, c, d, e, f, g
            });
        }

        private d(String s, int i)
        {
            super(s, i);
        }
    }


    private c a;
    private b b;
    private a c;

    public fp(a a1)
    {
        c = a1;
        b = b.a;
        a = c.a;
    }

    public b a()
    {
        return b;
    }

    protected void a(b b1)
    {
        a = c.b;
        b = b1;
        c.a(this);
    }

    public void a(String s, az az)
        throws Exception
    {
    }

    public void b()
    {
        if (a == c.a)
        {
            a = c.c;
            b = b.a;
            e();
        }
    }

    public void c()
    {
        if (a == c.c)
        {
            f();
        }
    }

    public void d()
    {
        if (a == c.b)
        {
            a = c.c;
            g();
        }
    }

    protected abstract void e();

    protected abstract void f();

    protected abstract void g();
}
