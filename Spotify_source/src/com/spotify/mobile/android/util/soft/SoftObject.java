// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.soft;


public final class SoftObject
{

    public int a;
    public boolean b;
    public SoftObject c[];
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i[];
    private int j[];
    private int k[];

    public SoftObject(String s)
    {
        this(s, 0);
    }

    private SoftObject(String s, int l)
    {
        d = s;
        e = d.length();
        a(l, 0, false);
    }

    private int a(int l, int i1, boolean flag)
    {
        int j1 = 0;
        h(l);
        JVM INSTR lookupswitch 7: default 76
    //                   33: 144
    //                   35: 208
    //                   40: 495
    //                   64: 86
    //                   91: 647
    //                   123: 893
    //                   126: 348;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new InvalidTypeException("invalid or broken soft object");
_L5:
        j1 = l + 1;
        if (flag)
        {
            i[i1] = l;
            j[i1] = j1;
            k[i1] = 0;
            return j1;
        } else
        {
            f = l;
            g = j1;
            h = 0;
            a = 0;
            return j1;
        }
_L2:
        j1 = l + 1;
        int k1 = j1 + 1;
        if (flag)
        {
            i[i1] = l;
            j[i1] = j1;
            k[i1] = 1;
            return k1;
        } else
        {
            f = l;
            g = j1;
            h = 1;
            a = 1;
            return k1;
        }
_L3:
        int l2 = l + 1;
        char c1 = d.charAt(l2);
        j1 = l2;
        int l1;
        do
        {
            if (c1 < '0' || c1 > '9')
            {
                l1 = j1;
                if (c1 != '-')
                {
                    break;
                }
            }
            j1++;
            l1 = j1;
            if (j1 >= e)
            {
                break;
            }
            c1 = d.charAt(j1);
        } while (true);
        j1 = l1 - l2;
        if (flag)
        {
            i[i1] = l;
            j[i1] = l2;
            k[i1] = j1;
            return l1;
        } else
        {
            f = l;
            g = l2;
            h = j1;
            a = 1;
            return l1;
        }
_L8:
        int i3 = l + 1;
        char c2 = d.charAt(i3);
        j1 = i3;
        int i2;
        do
        {
            if ((c2 < '0' || c2 > '9') && c2 != '-')
            {
                i2 = j1;
                if (c2 != '.')
                {
                    break;
                }
            }
            j1++;
            i2 = j1;
            if (j1 >= e)
            {
                break;
            }
            c2 = d.charAt(j1);
        } while (true);
        j1 = i2 - i3;
        if (flag)
        {
            i[i1] = l;
            j[i1] = i3;
            k[i1] = j1;
            return i2;
        } else
        {
            f = l;
            g = i3;
            h = j1;
            a = 1;
            return i2;
        }
_L4:
        int j2 = l + 1;
_L21:
        int k2;
        char c3;
        String s = d;
        k2 = j2 + 1;
        c3 = s.charAt(j2);
        j2 = j1;
        if (c3 < '0') goto _L10; else goto _L9
_L9:
        j2 = j1;
        if (c3 > '9') goto _L10; else goto _L11
_L11:
        j1 = (j1 * 10 + c3) - 48;
        if (k2 < e) goto _L13; else goto _L12
_L12:
        j2 = j1;
_L10:
        j1 = d.offsetByCodePoints(k2, j2) - k2;
        j2 = k2 + j1;
        if (flag)
        {
            i[i1] = l;
            j[i1] = k2;
            k[i1] = j1;
            return j2;
        } else
        {
            f = l;
            g = k2;
            h = j1;
            a = 1;
            return j2;
        }
_L6:
        k2 = l + 1;
        j1 = 0;
_L19:
        String s1 = d;
        j2 = k2 + 1;
        c3 = s1.charAt(k2);
        k2 = j1;
        if (c3 < '0') goto _L15; else goto _L14
_L14:
        k2 = j1;
        if (c3 > '9') goto _L15; else goto _L16
_L16:
        j1 = (j1 * 10 + c3) - 48;
        if (j2 < e) goto _L18; else goto _L17
_L17:
        k2 = j1;
_L15:
        if (flag)
        {
            i[i1] = l;
            j[i1] = j2;
            c[i1] = new SoftObject(d, l);
            l = c[i1].h + j2;
            k[i1] = l;
            return l;
        }
        f = l;
        g = j2;
        a = k2;
        b = true;
        if (i == null || i.length < a)
        {
            i = new int[k2];
            j = new int[k2];
            k = new int[k2];
            c = new SoftObject[k2];
        }
        l = 0;
        i1 = j2;
        for (; l < k2; l++)
        {
            i1 = a(i1, l, true);
        }

        h = i1 - j2;
        return i1;
_L7:
        throw new InvalidTypeException("dictionaries are not supported yet");
_L18:
        k2 = j2;
        if (true) goto _L19; else goto _L13
_L13:
        j2 = k2;
        if (true) goto _L21; else goto _L20
_L20:
    }

    private long f(int l)
    {
        int i1 = g;
        int j1 = h + i1;
        if (b)
        {
            i1 = j[l];
            j1 = k[l] + i1;
        }
        long l2 = 0L;
        int k1;
        long l1;
        if (d.charAt(i1) == '-')
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k1 = i1;
        l1 = l2;
        if (l != 0)
        {
            l = i1 + 1;
            l1 = l2;
            do
            {
                l2 = l1;
                if (l >= j1)
                {
                    break;
                }
                l1 = l1 * 10L - (long)(d.charAt(l) - 48);
                l++;
            } while (true);
        } else
        {
            do
            {
                l2 = l1;
                if (k1 >= j1)
                {
                    break;
                }
                l1 = (l1 * 10L + (long)d.charAt(k1)) - 48L;
                k1++;
            } while (true);
        }
        return l2;
    }

    private double g(int l)
    {
        int i1;
        if (b)
        {
            int j1 = j[l];
            i1 = k[l] + j1;
            l = j1;
        } else
        {
            l = g;
            i1 = h + l;
        }
        return Double.parseDouble(d.substring(l, i1));
    }

    private int h(int l)
    {
        return d.charAt(l);
    }

    public final int a(int l)
    {
        if (b)
        {
            return h(i[l]);
        } else
        {
            return h(f);
        }
    }

    public final long b(int l)
    {
        switch (a(l))
        {
        default:
            throw new InvalidTypeException("can't get as number");

        case 33: // '!'
            return !d(l) ? 0L : 1L;

        case 35: // '#'
            return f(l);

        case 126: // '~'
            return Math.round(g(l));

        case 40: // '('
            return Long.parseLong(e(l));
        }
    }

    public final double c(int l)
    {
        switch (a(l))
        {
        default:
            throw new InvalidTypeException("can't get as float");

        case 33: // '!'
            return !d(l) ? 0.0D : 1.0D;

        case 35: // '#'
            return (double)f(l);

        case 126: // '~'
            return g(l);

        case 40: // '('
            return Double.parseDouble(e(l));
        }
    }

    public final boolean d(int l)
    {
        int i1 = g;
        if (b)
        {
            i1 = j[l];
        }
        return d.charAt(i1) == '1';
    }

    public final String e(int l)
    {
        int i1;
        if (b)
        {
            int j1 = j[l];
            i1 = k[l] + j1;
            l = j1;
        } else
        {
            l = g;
            i1 = h + l;
        }
        return d.substring(l, i1);
    }

    private class InvalidTypeException extends RuntimeException
    {

        private static final long serialVersionUID = 1L;

        public InvalidTypeException(String s)
        {
            super(s);
        }
    }

}
