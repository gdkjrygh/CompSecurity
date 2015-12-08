// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            e, j, b

static final class <init>
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/bk/e$c$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("EMPTY_MESH", 0);
            b = new a("TESSELLATE_MONOTONE", 1);
            c = new a("CUT_AND_TESSELLATE", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    public a a;
    public j b;
    public b c;
    public int d;
    public int e;
    public a f;
    public List g;
    public int h[];
    public int i;

    public final a a(a a1, j j, b b1, int k, int l, a a2, List list)
    {
        a = a1;
        b = j;
        c = b1;
        d = k;
        e = l;
        f = a2;
        g = list;
        return this;
    }

    private a()
    {
    }

    a(byte byte0)
    {
        this();
    }
}
