// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.h;
import java.util.HashMap;
import java.util.Map;

public final class d extends Enum
{

    public static final d A;
    private static final Map B;
    private static final Map C;
    private static final d F[];
    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final d r;
    public static final d s;
    public static final d t;
    public static final d u;
    public static final d v;
    public static final d w;
    public static final d x;
    public static final d y;
    public static final d z;
    private final int D[];
    private final String E[];

    private d(String s1, int i1, int j1)
    {
        this(s1, i1, new int[] {
            j1
        }, new String[0]);
    }

    private transient d(String s1, int i1, int j1, String as[])
    {
        super(s1, i1);
        D = (new int[] {
            j1
        });
        E = as;
    }

    private transient d(String s1, int i1, int ai[], String as[])
    {
        super(s1, i1);
        D = ai;
        E = as;
    }

    public static d a(int i1)
    {
        if (i1 < 0 || i1 >= 900)
        {
            throw com.google.b.h.a();
        } else
        {
            return (d)B.get(Integer.valueOf(i1));
        }
    }

    public static d a(String s1)
    {
        return (d)C.get(s1);
    }

    public static d valueOf(String s1)
    {
        return (d)Enum.valueOf(com/google/b/b/d, s1);
    }

    public static d[] values()
    {
        return (d[])F.clone();
    }

    public int a()
    {
        return D[0];
    }

    static 
    {
        a = new d("Cp437", 0, new int[] {
            0, 2
        }, new String[0]);
        b = new d("ISO8859_1", 1, new int[] {
            1, 3
        }, new String[] {
            "ISO-8859-1"
        });
        c = new d("ISO8859_2", 2, 4, new String[] {
            "ISO-8859-2"
        });
        d = new d("ISO8859_3", 3, 5, new String[] {
            "ISO-8859-3"
        });
        e = new d("ISO8859_4", 4, 6, new String[] {
            "ISO-8859-4"
        });
        f = new d("ISO8859_5", 5, 7, new String[] {
            "ISO-8859-5"
        });
        g = new d("ISO8859_6", 6, 8, new String[] {
            "ISO-8859-6"
        });
        h = new d("ISO8859_7", 7, 9, new String[] {
            "ISO-8859-7"
        });
        i = new d("ISO8859_8", 8, 10, new String[] {
            "ISO-8859-8"
        });
        j = new d("ISO8859_9", 9, 11, new String[] {
            "ISO-8859-9"
        });
        k = new d("ISO8859_10", 10, 12, new String[] {
            "ISO-8859-10"
        });
        l = new d("ISO8859_11", 11, 13, new String[] {
            "ISO-8859-11"
        });
        m = new d("ISO8859_13", 12, 15, new String[] {
            "ISO-8859-13"
        });
        n = new d("ISO8859_14", 13, 16, new String[] {
            "ISO-8859-14"
        });
        o = new d("ISO8859_15", 14, 17, new String[] {
            "ISO-8859-15"
        });
        p = new d("ISO8859_16", 15, 18, new String[] {
            "ISO-8859-16"
        });
        q = new d("SJIS", 16, 20, new String[] {
            "Shift_JIS"
        });
        r = new d("Cp1250", 17, 21, new String[] {
            "windows-1250"
        });
        s = new d("Cp1251", 18, 22, new String[] {
            "windows-1251"
        });
        t = new d("Cp1252", 19, 23, new String[] {
            "windows-1252"
        });
        u = new d("Cp1256", 20, 24, new String[] {
            "windows-1256"
        });
        v = new d("UnicodeBigUnmarked", 21, 25, new String[] {
            "UTF-16BE", "UnicodeBig"
        });
        w = new d("UTF8", 22, 26, new String[] {
            "UTF-8"
        });
        x = new d("ASCII", 23, new int[] {
            27, 170
        }, new String[] {
            "US-ASCII"
        });
        y = new d("Big5", 24, 28);
        z = new d("GB18030", 25, 29, new String[] {
            "GB2312", "EUC_CN", "GBK"
        });
        A = new d("EUC_KR", 26, 30, new String[] {
            "EUC-KR"
        });
        F = (new d[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A
        });
        B = new HashMap();
        C = new HashMap();
        d ad[] = values();
        int l1 = ad.length;
        for (int i1 = 0; i1 < l1; i1++)
        {
            d d1 = ad[i1];
            Object aobj[] = d1.D;
            int i2 = aobj.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                int j2 = aobj[j1];
                B.put(Integer.valueOf(j2), d1);
            }

            C.put(d1.name(), d1);
            aobj = d1.E;
            i2 = aobj.length;
            for (int k1 = 0; k1 < i2; k1++)
            {
                String s1 = aobj[k1];
                C.put(s1, d1);
            }

        }

    }
}
