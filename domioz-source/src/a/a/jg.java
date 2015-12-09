// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Locale;

public final class jg extends Enum
{

    public static final jg a;
    public static final jg b;
    public static final jg c;
    public static final jg d;
    public static final jg e;
    public static final jg f;
    public static final jg g;
    private static final jg j[];
    private String h;
    private String i;

    private jg(String s, int k, String s1)
    {
        super(s, k);
        h = s1;
        i = (new StringBuilder()).append(s1).append("://").toString();
    }

    public static jg a(String s)
    {
        if (s != null)
        {
            jg ajg[] = values();
            int l = ajg.length;
            for (int k = 0; k < l; k++)
            {
                jg jg1 = ajg[k];
                if (jg1.d(s))
                {
                    return jg1;
                }
            }

        }
        return g;
    }

    private boolean d(String s)
    {
        return s.toLowerCase(Locale.US).startsWith(i);
    }

    public static jg valueOf(String s)
    {
        return (jg)Enum.valueOf(a/a/jg, s);
    }

    public static jg[] values()
    {
        return (jg[])j.clone();
    }

    public final String b(String s)
    {
        return (new StringBuilder()).append(i).append(s).toString();
    }

    public final String c(String s)
    {
        if (!d(s))
        {
            throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[] {
                s, h
            }));
        } else
        {
            return s.substring(i.length());
        }
    }

    static 
    {
        a = new jg("HTTP", 0, "http");
        b = new jg("HTTPS", 1, "https");
        c = new jg("FILE", 2, "file");
        d = new jg("CONTENT", 3, "content");
        e = new jg("ASSETS", 4, "assets");
        f = new jg("DRAWABLE", 5, "drawable");
        g = new jg("UNKNOWN", 6, "");
        j = (new jg[] {
            a, b, c, d, e, f, g
        });
    }
}
