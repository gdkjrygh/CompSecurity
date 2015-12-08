// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Locale;

public final class kn extends Enum
{

    public static final kn a;
    public static final kn b;
    public static final kn c;
    public static final kn d;
    public static final kn e;
    public static final kn f;
    public static final kn g;
    private static final kn j[];
    private String h;
    private String i;

    private kn(String s, int k, String s1)
    {
        super(s, k);
        h = s1;
        i = (new StringBuilder()).append(s1).append("://").toString();
    }

    public static kn a(String s)
    {
        if (s != null)
        {
            kn akn[] = values();
            int l = akn.length;
            for (int k = 0; k < l; k++)
            {
                kn kn1 = akn[k];
                if (kn1.d(s))
                {
                    return kn1;
                }
            }

        }
        return g;
    }

    private boolean d(String s)
    {
        return s.toLowerCase(Locale.US).startsWith(i);
    }

    public static kn valueOf(String s)
    {
        return (kn)Enum.valueOf(bo/app/kn, s);
    }

    public static kn[] values()
    {
        return (kn[])j.clone();
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
        a = new kn("HTTP", 0, "http");
        b = new kn("HTTPS", 1, "https");
        c = new kn("FILE", 2, "file");
        d = new kn("CONTENT", 3, "content");
        e = new kn("ASSETS", 4, "assets");
        f = new kn("DRAWABLE", 5, "drawable");
        g = new kn("UNKNOWN", 6, "");
        j = (new kn[] {
            a, b, c, d, e, f, g
        });
    }
}
