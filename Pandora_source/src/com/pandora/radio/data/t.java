// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;


public class t
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        private static final a h[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/t$a, s);
        }

        public static a[] values()
        {
            return (a[])h.clone();
        }

        static 
        {
            a = new a("ARTIST", 0);
            b = new a("ALBUM", 1);
            c = new a("SONG", 2);
            d = new a("GENRE_STATION", 3);
            e = new a("AD_STATION", 4);
            f = new a("CATEGORY_TITLE", 5);
            g = new a("UNKNOWN", 6);
            h = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public static final byte a[] = (new String(new char[] {
        '1', '8', 'E', 'y', '0', '2', '1', '#', '3', '7', 
        'D', '5', 'F', '6'
    })).getBytes();

}
