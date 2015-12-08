// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;

import com.pandora.radio.data.aa;

public class bh
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
            return (a)Enum.valueOf(p/dd/bh$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("STARTED", 1);
            c = new a("PLAYING", 2);
            d = new a("PAUSED", 3);
            e = new a("STOPPED", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final a a;
    public final aa b;
    public final String c;
    private final boolean d;

    public bh(a a1, aa aa)
    {
        this(a1, aa, false, null);
    }

    public bh(a a1, aa aa, boolean flag, String s)
    {
        a = a1;
        b = aa;
        d = flag;
        c = s;
    }

    public boolean a()
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a.ordinal()])
        {
        default:
            return d;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            throw new UnsupportedOperationException("Invalid operation for canSkip(): can only be called if type is Type.Playing.");
        }
    }
}
