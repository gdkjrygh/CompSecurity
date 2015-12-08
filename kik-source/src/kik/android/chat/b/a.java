// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.b;

import android.graphics.Color;
import com.kik.scan.KikCode;

public final class kik.android.chat.b.a
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
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        private static final a s[];
        int q;
        String r;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(kik/android/chat/b/a$a, s1);
        }

        public static a[] values()
        {
            return (a[])s.clone();
        }

        public final String a()
        {
            return r;
        }

        static 
        {
            a = new a("KIK_BLUE", 0, "#42B4E6", "Kik Blue");
            b = new a("TURQUOISE", 1, "#42DFD8", "Turquoise");
            c = new a("MINT", 2, "#24D7A7", "Mint");
            d = new a("FOREST", 3, "#25912B", "Forest");
            e = new a("KIK_GREEN", 4, "#87D300", "Kik Green");
            f = new a("SUNSHINE", 5, "#F8CB1C", "Sunshine");
            g = new a("ORANGE_CREAMSICLE", 6, "#FC971B", "Orange Creamsicle");
            h = new a("BLOOD_ORANGE", 7, "#F9703A", "Blood Orange");
            i = new a("CANDY_APPLE_RED", 8, "#F7373C", "Candy Apple Red");
            j = new a("SALMON", 9, "#F88585", "Salmon");
            k = new a("CORAL", 10, "#F767C3", "Coral");
            l = new a("CRANBERRY", 11, "#940D65", "Cranberry");
            m = new a("LAVENDER", 12, "#CB94FF", "Lavender");
            n = new a("ROYAL_PURPLE", 13, "#8737F8", "Royal Purple");
            o = new a("MARINE", 14, "#353CD4", "Marine");
            p = new a("STEEL_BLUE", 15, "#5D7687", "Steel Blue");
            s = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p
            });
        }

        private a(String s1, int i1, String s2, String s3)
        {
            super(s1, i1);
            q = Color.parseColor(s2);
            r = s3;
        }
    }


    public static int a()
    {
        return a.values()[0].q;
    }

    public static String a(KikCode kikcode)
    {
        if (kikcode != null && kikcode.getColour() < a.values().length)
        {
            return a.values()[kikcode.getColour()].r;
        } else
        {
            return null;
        }
    }

    public static int b(KikCode kikcode)
    {
        if (kikcode != null && kikcode.getColour() < a.values().length)
        {
            return a.values()[kikcode.getColour()].q;
        } else
        {
            return a();
        }
    }
}
