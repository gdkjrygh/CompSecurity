// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import com.google.android.m4b.maps.bm.d;

// Referenced classes of package com.google.android.m4b.maps.bb:
//            g, c

public final class e
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/bb/e$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("FADE_IN", 0);
            b = new a("FADE_OUT", 1);
            c = new a("FADE_BETWEEN", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final g a;

    public e(long l, long l1, a a1)
    {
        this(l, l1, a1, 0, 0);
    }

    public e(long l, long l1, a a1, int i, int j)
    {
        a = new g(new c((float)l / (float)(l + l1)));
        a.setDuration(l + l1);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.a(0);
            a.a(0x10000);
            return;

        case 2: // '\002'
            a.a(0x10000);
            a.a(0);
            return;

        case 3: // '\003'
            a.a(i);
            break;
        }
        a.a(j);
    }

    public e(a a1)
    {
        this(0L, 500L, a1);
    }

    public final int a(d d1)
    {
        long l = d1.j;
        if (!a.hasStarted())
        {
            a.start();
        }
        g g1 = a;
        float f = g1.c(l);
        float f1 = g1.a;
        g1.c = Math.round(f * (float)(g1.b - g1.a) + f1);
        int i = a.c;
        if (!a.hasEnded())
        {
            d1.h = true;
        }
        return i;
    }
}
