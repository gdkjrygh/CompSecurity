// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.eb;

import java.nio.ByteBuffer;

public interface d
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/eb/d$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("CONTINUOUS", 0);
            b = new a("TEXT", 1);
            c = new a("BINARY", 2);
            d = new a("PING", 3);
            e = new a("PONG", 4);
            f = new a("CLOSING", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract ByteBuffer c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract a f();
}
