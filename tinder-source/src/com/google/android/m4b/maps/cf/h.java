// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;


// Referenced classes of package com.google.android.m4b.maps.cf:
//            g

public abstract class h
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static a g;
        private static a h;
        private static final a i[];
        final int f;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/cf/h$a, s);
        }

        public static a[] values()
        {
            return (a[])i.clone();
        }

        static 
        {
            a = new a("PICK", 0, 0);
            b = new a("TEXTURE0", 1, 1);
            c = new a("TEXTURE1", 2, 2);
            d = new a("SHADER", 3, 3);
            g = new a("STENCIL", 4, 4);
            h = new a("POLYGON", 5, 5);
            e = new a("BLEND", 6, 6);
            i = (new a[] {
                a, b, c, d, g, h, e
            });
        }

        private a(String s, int i1, int j1)
        {
            super(s, i1);
            f = j1;
        }
    }


    private static int a;
    public static final int j = a.values().length;
    private g b;
    protected boolean k;
    public int l;
    final a m;

    protected h(a a1)
    {
        k = false;
        l = 0;
        b = null;
        m = a1;
    }

    boolean a(g g, f.a a1)
    {
        while (a1.d == k && !a1.e || !a1.d && !a1.e && l != 0) 
        {
            return false;
        }
        k = a1.d;
        if (!k)
        {
            g = null;
        }
        b = g;
        return true;
    }

    static 
    {
        a = a.b.f;
    }
}
