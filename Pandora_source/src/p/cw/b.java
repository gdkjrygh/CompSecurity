// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cw;

import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.y;
import p.dd.bg;

public interface p.cw.b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/cw/b$a, s1);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("INITIALIZING", 0);
            b = new a("PLAYING", 1);
            c = new a("PAUSED", 2);
            d = new a("TIMEDOUT", 3);
            e = new a("STOPPED", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s1, int i)
        {
            super(s1, i);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(p/cw/b$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("STARTING", 0);
            b = new b("REPLAYING", 1);
            c = new b("RESUMING", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i)
        {
            super(s1, i);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c c[];

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(p/cw/b$c, s1);
        }

        public static c[] values()
        {
            return (c[])c.clone();
        }

        static 
        {
            a = new c("USER_INTENT", 0);
            b = new c("INTERNAL", 1);
            c = (new c[] {
                a, b
            });
        }

        private c(String s1, int i)
        {
            super(s1, i);
        }
    }


    public abstract boolean A();

    public abstract void B();

    public abstract void C();

    public abstract boolean D();

    public abstract boolean W();

    public abstract void X();

    public abstract boolean Y();

    public abstract void a();

    public abstract void a(aa aa);

    public abstract void a(ac ac);

    public abstract void a(y y1, String s1, boolean flag, b b1, Object obj);

    public abstract void a(String s1, String s2);

    public abstract void a(a a1);

    public abstract void a(c c1);

    public abstract void a(boolean flag, String s1);

    public abstract boolean a(y y1);

    public abstract void b();

    public abstract void b(ac ac);

    public abstract void b(String s1);

    public abstract void b(a a1);

    public abstract void b(c c1);

    public abstract void b(boolean flag);

    public abstract void c();

    public abstract void d();

    public abstract void d(y y1);

    public abstract boolean e();

    public abstract void f();

    public abstract bg getTrackElapsedTimeEvent();

    public abstract void k();

    public abstract void l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract void r();

    public abstract aa s();

    public abstract y t();

    public abstract a u();

    public abstract a v();

    public abstract int w();

    public abstract void x();

    public abstract void y();

    public abstract boolean z();
}
