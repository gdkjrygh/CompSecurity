// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.a;

import java.util.HashMap;
import java.util.Map;
import kik.android.gifs.a;

// Referenced classes of package kik.android.gifs.a:
//            e

public final class f
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
            return (a)Enum.valueOf(kik/android/gifs/a/f$a, s);
        }

        public static a[] values()
        {
            return (a[])j.clone();
        }

        static 
        {
            a = new a("MP4", 0);
            b = new a("WebM", 1);
            c = new a("TinyWebM", 2);
            d = new a("NanoWebM", 3);
            e = new a("TinyGif", 4);
            f = new a("NanoGif", 5);
            g = new a("TinyMP4", 6);
            h = new a("NanoMP4", 7);
            i = new a("GIF", 8);
            j = (new a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    private String a;
    private final Map b = new HashMap();

    public f()
    {
    }

    public final String a()
    {
        return a;
    }

    public final e a(a a1)
    {
        return (e)b.get(a1);
    }

    public final void a(String s)
    {
        a = s;
    }

    protected final void a(a a1, e e1)
    {
        b.put(a1, e1);
    }

    protected final boolean b()
    {
        return b.containsKey(kik.android.gifs.a.d) && b.containsKey(kik.android.gifs.a.c);
    }

    public final e c()
    {
        return (e)b.get(kik.android.gifs.a.c);
    }
}
