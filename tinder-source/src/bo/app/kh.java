// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Locale;

public final class kh extends Enum
{

    public static final kh a;
    public static final kh b;
    public static final kh c;
    public static final kh d;
    public static final kh e;
    public static final kh f;
    public static final kh g;
    private static final kh j[];
    private String h;
    private String i;

    private kh(String s, int k, String s1)
    {
        super(s, k);
        h = s1;
        i = (new StringBuilder()).append(s1).append("://").toString();
    }

    public static kh a(String s)
    {
        if (s != null)
        {
            kh akh[] = values();
            int l = akh.length;
            for (int k = 0; k < l; k++)
            {
                kh kh1 = akh[k];
                if (kh1.d(s))
                {
                    return kh1;
                }
            }

        }
        return g;
    }

    private boolean d(String s)
    {
        return s.toLowerCase(Locale.US).startsWith(i);
    }

    public static kh valueOf(String s)
    {
        return (kh)Enum.valueOf(bo/app/kh, s);
    }

    public static kh[] values()
    {
        return (kh[])j.clone();
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
        a = new kh("HTTP", 0, "http");
        b = new kh("HTTPS", 1, "https");
        c = new kh("FILE", 2, "file");
        d = new kh("CONTENT", 3, "content");
        e = new kh("ASSETS", 4, "assets");
        f = new kh("DRAWABLE", 5, "drawable");
        g = new kh("UNKNOWN", 6, "");
        j = (new kh[] {
            a, b, c, d, e, f, g
        });
    }
}
