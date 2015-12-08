// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.events;


public class j
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a g[];
        private int f;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/events/j$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public int a()
        {
            return f;
        }

        static 
        {
            a = new a("PICCOLLAGE", 0, 0x7f07012a);
            b = new a("FACEBOOK", 1, 0x7f070128);
            c = new a("TWITTER", 2, 0x7f07012c);
            d = new a("TUMBLR", 3, 0x7f07012b);
            e = new a("KDDI", 4, 0x7f070129);
            g = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i, int k)
        {
            super(s, i);
            f = k;
        }
    }


    public final String a;
    public final a b;

    public j(String s, a a1)
    {
        a = s;
        b = a1;
    }
}
