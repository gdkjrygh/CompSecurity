// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class Wv
{
    public static interface a
    {

        public abstract void a(c c1, String s);
    }

    public static interface b
    {

        public abstract void a(int i);
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        private static final c g[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(Wv$c, s);
        }

        public static c[] values()
        {
            return (c[])g.clone();
        }

        static 
        {
            a = new c("INVALID", 0);
            b = new c("CONFIG_ERROR", 1);
            c = new c("RUNNING", 2);
            d = new c("ABORTED", 3);
            e = new c("FAILED", 4);
            f = new c("FINISHED", 5);
            g = (new c[] {
                a, b, c, d, e, f
            });
        }

        private c(String s, int i)
        {
            super(s, i);
        }
    }


    public volatile c d;

    public Wv()
    {
        d = c.a;
    }

    public abstract c a();

    public abstract void a(b b1);

    public abstract String b();

    // Unreferenced inner class Wv$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private Wv a;
        private b b;
        private a c;
        private Wv d;

        public final void run()
        {
            a.a(b);
            if (c != null)
            {
                c.a(a.d, d.b());
            }
_L2:
            return;
            Object obj;
            obj;
            if (c == null) goto _L2; else goto _L1
_L1:
            c.a(c.b, ((Wu) (obj)).toString());
            return;
            obj;
            if (c == null) goto _L2; else goto _L3
_L3:
            c.a(c.e, ((Wy) (obj)).toString());
            return;
            obj;
            if (c != null)
            {
                c.a(c.e, ((Throwable) (obj)).toString());
                return;
            }
              goto _L2
        }

            
            {
                d = Wv.this;
                a = wv1;
                b = b1;
                c = a1;
                super();
            }
    }

}
