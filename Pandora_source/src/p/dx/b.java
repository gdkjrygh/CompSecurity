// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dx;

import java.net.InetSocketAddress;
import java.nio.channels.NotYetConnectedException;
import p.eb.d;

public interface p.dx.b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dx/b$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("NOT_YET_CONNECTED", 0);
            b = new a("CONNECTING", 1);
            c = new a("OPEN", 2);
            d = new a("CLOSING", 3);
            e = new a("CLOSED", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(p/dx/b$b, s);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("CLIENT", 0);
            b = new b("SERVER", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract InetSocketAddress a();

    public abstract void a(int i);

    public abstract void a(int i, String s);

    public abstract void a(d d1);

    public abstract boolean b();

    public abstract void c(String s)
        throws NotYetConnectedException;

    public abstract boolean c();

    public abstract boolean d();
}
