// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bz;

import com.pandora.android.data.s;

public class aa
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bz/aa$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("FALSE", 0);
            b = new a("PENDING", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final p.ca.bf.b a;
    public final s b;
    public final long c;
    public final long d;
    public final long e;
    public final a f;

    public aa(s s)
    {
        this(p.ca.bf.b.a, s, 0x8000000000000000L, 0x8000000000000000L, 0L, a.a);
    }

    public aa(p.ca.bf.b b1, s s, long l, long l1, long l2, a a1)
    {
        b = s;
        c = l;
        d = l1;
        e = l2;
        a = b1;
        f = a1;
    }
}
