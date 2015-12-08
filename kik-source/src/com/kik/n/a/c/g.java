// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.c;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.n.a.c:
//            h

public final class g
    implements n, Externalizable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a d[];
        public final int c;

        public static a a(int i)
        {
            switch (i)
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
            return (a)Enum.valueOf(com/kik/n/a/c/g$a, s);
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

        private a(String s, int i, int j)
        {
            super(s, i);
            c = j;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b e[];
        public final int d;

        public static b a(int i)
        {
            switch (i)
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
            return (b)Enum.valueOf(com/kik/n/a/c/g$b, s);
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

        private b(String s, int i, int j)
        {
            super(s, i);
            d = j;
        }
    }


    static final g a = new g();
    static final u d = new com.kik.n.a.c.h();
    a b;
    b c;

    public g()
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

    public final void readExternal(ObjectInput objectinput)
    {
        h.a(objectinput, this, d);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        h.a(objectoutput, this, d);
    }

}
