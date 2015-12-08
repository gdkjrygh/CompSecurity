// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import java.util.Arrays;
import java.util.List;

public final class ac
{
    public static final class a
    {

        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public final String a()
        {
            return a;
        }

        public final String b()
        {
            return b;
        }

        public final String c()
        {
            return d;
        }

        private a(String s, String s1, String s2, String s3)
        {
            a = s;
            b = s1;
            c = s2;
            d = s3;
        }

        a(String s, String s1, String s2, String s3, byte byte0)
        {
            this(s, s1, s2, s3);
        }
    }


    private static final a a[];
    private static final List b;

    public static List a()
    {
        return b;
    }

    static 
    {
        a aa[] = new a[6];
        aa[0] = new a("Stickers", "https://stickers.kik.com/", "icon.png?v=5", "https://stickers.kik.com/icon_square.png?v=5", (byte)0);
        aa[1] = new a("Viral Videos", "http://videos.kik.com/", "img/icon.png?v=5", "http://videos.kik.com/img/icon_square.png?v=5", (byte)0);
        aa[2] = new a("Sketch", "http://sketch.kik.com/", "http://sketch.kik.com/icon.png?v=5", "http://sketch.kik.com/icon_square.png?v=5", (byte)0);
        aa[3] = new a("Image Search", "http://image-search.kik.com/", "http://image-search.kik.com/img/icon.png?v=5", "http://image-search.kik.com/img/icon_square.png?v=5", (byte)0);
        aa[4] = new a("Memes", "http://meme.kik.com/", "http://meme.kik.com/img/icon.png?v=5", "http://meme.kik.com/img/icon-square.png?v=5", (byte)0);
        aa[5] = new a("Browser", "https://home.kik.com/", "https://home.kik.com/img/icon.png?v=5", "https://home.kik.com/img/icon.png?v=5", (byte)0);
        a = aa;
        b = Arrays.asList(aa);
    }
}
