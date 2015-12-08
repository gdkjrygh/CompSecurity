// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;


// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            e

public static final class k extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i l[];
    private final String j;
    private final String k;

    public static k a(String s)
    {
        if (s != null)
        {
            k ak[] = values();
            int j1 = ak.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                k k1 = ak[i1];
                if (k1.e(s))
                {
                    return k1;
                }
            }

        }
        return i;
    }

    public static String d(String s)
    {
        String s1 = s;
        if (a(s) == i)
        {
            s1 = c.b(s);
        }
        return s1;
    }

    private boolean e(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return s.regionMatches(true, 0, k, 0, k.length());
        }
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/cardinalblue/android/piccollage/lib/e$a, s);
    }

    public static k[] values()
    {
        return (k[])l.clone();
    }

    public String a()
    {
        return k;
    }

    public String b(String s)
    {
        return (new StringBuilder()).append(k).append(s).toString();
    }

    public String c(String s)
    {
        if (!e(s))
        {
            throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[] {
                s, j
            }));
        } else
        {
            return s.substring(k.length());
        }
    }

    static 
    {
        a = new <init>("HTTP", 0, "http");
        b = new <init>("HTTPS", 1, "https");
        c = new <init>("FILE", 2, "file");
        d = new <init>("CONTENT", 3, "content");
        e = new <init>("ASSETS", 4, "assets");
        f = new <init>("RESOURCE", 5, "resource");
        g = new <init>("BUNDLED", 6, "bundled", "bundled:/");
        h = new <init>("YOUTUBE", 7, "youtube", "youtube:/");
        i = new <init>("UNKNOWN", 8, "");
        l = (new l[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int i1, String s1)
    {
        this(s, i1, s1, (new StringBuilder()).append(s1).append("://").toString());
    }

    private <init>(String s, int i1, String s1, String s2)
    {
        super(s, i1);
        j = s1;
        k = s2;
    }
}
