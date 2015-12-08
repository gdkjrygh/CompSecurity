// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Locale;

public final class ki extends Enum
{

    public static final ki a;
    public static final ki b;
    public static final ki c;
    public static final ki d;
    public static final ki e;
    public static final ki f;
    public static final ki g;
    private static final ki j[];
    private String h;
    private String i;

    private ki(String s, int k, String s1)
    {
        super(s, k);
        h = s1;
        i = (new StringBuilder()).append(s1).append("://").toString();
    }

    public static ki a(String s)
    {
        if (s != null)
        {
            ki aki[] = values();
            int l = aki.length;
            for (int k = 0; k < l; k++)
            {
                ki ki1 = aki[k];
                if (ki1.d(s))
                {
                    return ki1;
                }
            }

        }
        return g;
    }

    private boolean d(String s)
    {
        return s.toLowerCase(Locale.US).startsWith(i);
    }

    public static ki valueOf(String s)
    {
        return (ki)Enum.valueOf(bo/app/ki, s);
    }

    public static ki[] values()
    {
        return (ki[])j.clone();
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
        a = new ki("HTTP", 0, "http");
        b = new ki("HTTPS", 1, "https");
        c = new ki("FILE", 2, "file");
        d = new ki("CONTENT", 3, "content");
        e = new ki("ASSETS", 4, "assets");
        f = new ki("DRAWABLE", 5, "drawable");
        g = new ki("UNKNOWN", 6, "");
        j = (new ki[] {
            a, b, c, d, e, f, g
        });
    }
}
