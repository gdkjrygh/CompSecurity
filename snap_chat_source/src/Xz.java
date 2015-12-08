// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.nio.charset.Charset;

public abstract class Xz
{

    public Xz()
    {
    }

    public static Xz a(Xu xu, String s)
    {
        Charset charset1 = XO.c;
        Xu xu1 = xu;
        if (xu != null)
        {
            Charset charset;
            if (xu.b != null)
            {
                charset = Charset.forName(xu.b);
            } else
            {
                charset = null;
            }
            charset1 = charset;
            xu1 = xu;
            if (charset == null)
            {
                charset1 = XO.c;
                xu1 = Xu.a((new StringBuilder()).append(xu).append("; charset=utf-8").toString());
            }
        }
        return a(xu1, s.getBytes(charset1));
    }

    public static Xz a(Xu xu, byte abyte0[])
    {
        int i = abyte0.length;
        if (abyte0 == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            XO.a(abyte0.length, i);
            return new Xz(xu, i, abyte0) {

                private Xu a;
                private int b;
                private byte c[];

                public final Xu a()
                {
                    return a;
                }

                public final void a(ahY ahy)
                {
                    ahy.a(c, b);
                }

                public final long b()
                {
                    return (long)b;
                }

            
            {
                a = xu;
                b = i;
                c = abyte0;
                super();
            }
            };
        }
    }

    public abstract Xu a();

    public abstract void a(ahY ahy);

    public long b()
    {
        return -1L;
    }

    // Unreferenced inner class Xz$2

/* anonymous class */
    public static final class _cls2 extends Xz
    {

        private Xu a;
        private File b;

        public final Xu a()
        {
            return a;
        }

        public final void a(ahY ahy)
        {
            aio aio = null;
            aio aio1 = aii.a(b);
            aio = aio1;
            ahy.a(aio1);
            XO.a(aio1);
            return;
            ahy;
            XO.a(aio);
            throw ahy;
        }

        public final long b()
        {
            return b.length();
        }

            public 
            {
                a = xu;
                b = file;
                super();
            }
    }

}
