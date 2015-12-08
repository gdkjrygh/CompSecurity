// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class eyn
    implements eyg
{

    private final eyq b;
    private final eyf c;

    private eyn(dtz dtz1, eyf eyf)
    {
        b = new eyl(dtz1);
        c = eyf;
    }

    public static eyg a(dtz dtz1)
    {
        dtz1 = dtz1.a();
        return new eyn(dtz1, b(dtz1));
    }

    static eyq a(eyn eyn1)
    {
        return eyn1.b;
    }

    private static eyf b(dtz dtz1)
    {
        dty dty1 = new dty(dtz1.c);
        int i = 0;
        while (i < dtz1.c) 
        {
            long l = dtz1.b[i];
            int j = dtz1.a[i];
            if (dty1.c != 0 && l <= dty1.a[dty1.c - 1])
            {
                dty1.b(l, j);
            } else
            {
                int k = dty1.c;
                if (k >= dty1.a.length)
                {
                    dty1.a(k + 1);
                }
                dty1.a[k] = l;
                dty1.b[k] = j;
                dty1.c = k + 1;
            }
            i++;
        }
        return new eyp(dty1);
    }

    private int d()
    {
        return Math.max(0, b.a() - 1);
    }

    static int f(int i)
    {
        if (i >= 0)
        {
            throw new IllegalArgumentException("index should be a negative number");
        } else
        {
            return ~i;
        }
    }

    public final long a(int i)
    {
        i = b.a(b, i);
        if (i != -1)
        {
            return b.a(i);
        } else
        {
            return 0x8000000000000000L;
        }
    }

    public final eyh a()
    {
        if (b() == 0)
        {
            return new eyj();
        } else
        {
            return new eyo(this, 0, d());
        }
    }

    public final eyh a(int i, int j)
    {
        eyq eyq1;
        long l;
        boolean flag;
        if (i <= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "startPosition < endPosition");
        if (b() == 0 || (long)i > b.b(d()) || (long)j < b.b(0))
        {
            return new eyj();
        }
        eyq1 = b;
        l = i;
        if (eyq1.a() == 0) goto _L2; else goto _L1
_L1:
        int k = b.a(eyq1, l);
        i = k;
        if (k == -1)
        {
            i = 0;
        }
        if (eyq1.b(i) < l) goto _L4; else goto _L3
_L3:
        j = b.a(b, j);
        if (i > j)
        {
            return new eyj();
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (i + 1 < eyq1.a())
        {
            i++;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        i = -1;
        if (true) goto _L3; else goto _L5
_L5:
        if (i == -1)
        {
            i = 0;
        }
        if (j == -1)
        {
            j = d();
        }
        return new eyo(this, i, j);
    }

    public final int b()
    {
        return b.a();
    }

    public final long b(int i)
    {
        return b.a(i, 0x8000000000000000L);
    }

    public final int c(int i)
    {
        i = b.a(b, i);
        if (i != -1)
        {
            return (int)b.b(i);
        } else
        {
            return 0x80000000;
        }
    }

    public final eyf c()
    {
        if (c == null)
        {
            String s = String.valueOf(this);
            throw new NullPointerException((new StringBuilder(String.valueOf(s).length() + 46)).append("no inverse available for this implementation: ").append(s).toString());
        } else
        {
            return c;
        }
    }

    public final int d(int i)
    {
        i = b.a(b, i);
        if (i != -1)
        {
            return i + 1;
        } else
        {
            return 0;
        }
    }

    public final eyh e(int i)
    {
        return a(i, 0x7fffffff);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        eyh eyh1 = a();
        stringbuilder.append("SparseArrayDateHeaderMap{\n");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);
        for (; eyh1.a(); stringbuilder.append('\n'))
        {
            stringbuilder.append("  position=");
            stringbuilder.append(eyh1.b());
            stringbuilder.append(", timestamp=");
            stringbuilder.append(eyh1.c());
            String s = String.valueOf(simpledateformat.format(new Date(eyh1.c())));
            stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 3)).append(" (").append(s).append(")").toString());
        }

        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
