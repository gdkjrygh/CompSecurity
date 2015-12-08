// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.data;


public class c
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/supersonicads/sdk/data/c$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("None", 0);
            b = new a("Device", 1);
            c = new a("Controller", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        private static final d e[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/supersonicads/sdk/data/c$d, s);
        }

        public static d[] values()
        {
            return (d[])e.clone();
        }

        static 
        {
            a = new d("BrandConnect", 0);
            b = new d("OfferWall", 1);
            c = new d("Interstitial", 2);
            d = new d("OfferWallCredits", 3);
            e = (new d[] {
                a, b, c, d
            });
        }

        private d(String s, int i)
        {
            super(s, i);
        }
    }


    public c()
    {
    }

    // Unreferenced inner class com/supersonicads/sdk/data/c$b
    /* block-local class not found */
    class b {}


    // Unreferenced inner class com/supersonicads/sdk/data/c$c
    /* block-local class not found */
    class c {}

}
