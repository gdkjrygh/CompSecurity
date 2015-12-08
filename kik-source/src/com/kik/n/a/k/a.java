// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.k;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.n.a.k:
//            b

public final class com.kik.n.a.k.a
    implements n, Externalizable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        private static final a x[];
        public final int w;

        public static a a(int i1)
        {
            switch (i1)
            {
            default:
                return null;

            case 0: // '\0'
                return a;

            case 1: // '\001'
                return b;

            case 2: // '\002'
                return c;

            case 3: // '\003'
                return d;

            case 4: // '\004'
                return e;

            case 5: // '\005'
                return f;

            case 6: // '\006'
                return g;

            case 7: // '\007'
                return h;

            case 8: // '\b'
                return i;

            case 9: // '\t'
                return j;

            case 10: // '\n'
                return k;

            case 11: // '\013'
                return l;

            case 12: // '\f'
                return m;

            case 13: // '\r'
                return n;

            case 14: // '\016'
                return o;

            case 15: // '\017'
                return p;

            case 16: // '\020'
                return q;

            case 17: // '\021'
                return r;

            case 18: // '\022'
                return s;

            case 19: // '\023'
                return t;

            case 20: // '\024'
                return u;

            case 21: // '\025'
                return v;
            }
        }

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/kik/n/a/k/a$a, s1);
        }

        public static a[] values()
        {
            return (a[])x.clone();
        }

        static 
        {
            a = new a("COLOR_BRIGHT_RED", 0, 0);
            b = new a("COLOR_BRIGHT_PINK", 1, 1);
            c = new a("COLOR_BRIGHT_MAGENTA", 2, 2);
            d = new a("COLOR_BRIGHT_VIOLET", 3, 3);
            e = new a("COLOR_BRIGHT_BLUE", 4, 4);
            f = new a("COLOR_BRIGHT_GREEN", 5, 5);
            g = new a("COLOR_BRIGHT_KIK_GREEN", 6, 6);
            h = new a("COLOR_BRIGHT_YELLOW", 7, 7);
            i = new a("COLOR_BRIGHT_ORANGE", 8, 8);
            j = new a("COLOR_BRIGHT_BROWN", 9, 9);
            k = new a("COLOR_BRIGHT_GREY", 10, 10);
            l = new a("COLOR_LIGHT_RED", 11, 11);
            m = new a("COLOR_LIGHT_PINK", 12, 12);
            n = new a("COLOR_LIGHT_MAGENTA", 13, 13);
            o = new a("COLOR_LIGHT_VIOLET", 14, 14);
            p = new a("COLOR_LIGHT_BLUE", 15, 15);
            q = new a("COLOR_LIGHT_AQUA", 16, 16);
            r = new a("COLOR_LIGHT_KIK_GREEN", 17, 17);
            s = new a("COLOR_LIGHT_YELLOW", 18, 18);
            t = new a("COLOR_LIGHT_ORANGE", 19, 19);
            u = new a("COLOR_LIGHT_BROWN", 20, 20);
            v = new a("COLOR_LIGHT_GREY", 21, 21);
            x = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v
            });
        }

        private a(String s1, int i1, int j1)
        {
            super(s1, i1);
            w = j1;
        }
    }


    static final com.kik.n.a.k.a a = new com.kik.n.a.k.a();
    static final u d = new b();
    Boolean b;
    a c;

    public com.kik.n.a.k.a()
    {
    }

    public final u a()
    {
        return d;
    }

    public final com.kik.n.a.k.a a(a a1)
    {
        c = a1;
        return this;
    }

    public final com.kik.n.a.k.a a(Boolean boolean1)
    {
        b = boolean1;
        return this;
    }

    public final Boolean b()
    {
        return b;
    }

    public final a c()
    {
        if (c == null)
        {
            return a.a;
        } else
        {
            return c;
        }
    }

    public final void readExternal(ObjectInput objectinput)
    {
        h.a(objectinput, this, d);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        h.a(objectoutput, this, d);
    }

}
