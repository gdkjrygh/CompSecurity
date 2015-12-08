// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cw;


public class d
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
        private static final a j[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cw/d$a, s);
        }

        public static a[] values()
        {
            return (a[])j.clone();
        }

        static 
        {
            a = new a("NO_ERROR", 0);
            b = new a("SKIP_LIMIT_REACHED", 1);
            c = new a("SKIPPING_AUDIO_AD", 2);
            d = new a("SKIPPING_NO_TRACK", 3);
            e = new a("THUMB_UP_AD", 4);
            f = new a("THUMB_UP_SHARED", 5);
            g = new a("THUMB_DOWN_AD", 6);
            h = new a("THUMB_DOWN_SHARED", 7);
            i = new a("SKIP_THUMBS_DOWN", 8);
            j = (new a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    public static boolean a(a a1)
    {
        return a1 != a.a;
    }

    public static boolean b(a a1)
    {
        return a1 == a.a;
    }
}
