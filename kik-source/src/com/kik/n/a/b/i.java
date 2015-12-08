// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.b;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.n.a.b:
//            j

public final class i
    implements n, Externalizable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a d[];
        public final int c;

        public static a a(int k)
        {
            switch (k)
            {
            default:
                return null;

            case 1: // '\001'
                return a;

            case 2: // '\002'
                return b;
            }
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/kik/n/a/b/i$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("PROFILE", 0, 1);
            b = new a("LOCATION", 1, 2);
            d = (new a[] {
                a, b
            });
        }

        private a(String s, int k, int l)
        {
            super(s, k);
            c = l;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b e[];
        public final int d;

        public static b a(int k)
        {
            switch (k)
            {
            default:
                return null;

            case 0: // '\0'
                return a;

            case 1: // '\001'
                return b;

            case 2: // '\002'
                return c;
            }
        }

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/kik/n/a/b/i$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("UNSPECIFIED", 0, 0);
            b = new b("ALLOWED", 1, 1);
            c = new b("DECLINED", 2, 2);
            e = (new b[] {
                a, b, c
            });
        }

        private b(String s, int k, int l)
        {
            super(s, k);
            d = l;
        }
    }


    static final i a = new i();
    static final u d = new j();
    a b;
    b c;

    public i()
    {
    }

    public static u b()
    {
        return d;
    }

    public final u a()
    {
        return d;
    }

    public final i a(a a1)
    {
        b = a1;
        return this;
    }

    public final i a(b b1)
    {
        c = b1;
        return this;
    }

    public final a c()
    {
        if (b == null)
        {
            return a.a;
        } else
        {
            return b;
        }
    }

    public final b d()
    {
        if (c == null)
        {
            return b.a;
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
