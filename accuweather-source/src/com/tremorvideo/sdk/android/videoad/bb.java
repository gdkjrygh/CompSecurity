// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


public class bb
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/bb$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("TopRight", 0);
            b = new a("TopLeft", 1);
            c = new a("BottomRight", 2);
            d = new a("BottomLeft", 3);
            e = new a("Manual", 4);
            f = new a("None", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

}
