// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.charset.Charset;
import java.util.Stack;

final class bcq
    implements bcs
{

    private final byte a[] = new byte[8];
    private final Stack b = new Stack();
    private final bcu c = new bcu();
    private bct d;
    private int e;
    private int f;
    private long g;

    bcq()
    {
    }

    private long a(bby bby1, int i)
    {
        int j = 0;
        bby1.b(a, 0, i);
        long l = 0L;
        for (; j < i; j++)
        {
            l = l << 8 | (long)(a[j] & 0xff);
        }

        return l;
    }

    public final void a()
    {
        e = 0;
        b.clear();
        c.a();
    }

    public final void a(bct bct1)
    {
        d = bct1;
    }

    public final boolean a(bby bby1)
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        do
        {
            if (!b.isEmpty() && bby1.a() >= ((bcr)b.peek()).b)
            {
                d.b(((bcr)b.pop()).a);
                return true;
            }
            if (e == 0)
            {
                long l1 = c.a(bby1, true, false);
                if (l1 == -1L)
                {
                    return false;
                }
                f = (int)l1;
                e = 1;
            }
            if (e == 1)
            {
                g = c.a(bby1, false, true);
                e = 2;
            }
            int i = d.a(f);
            switch (i)
            {
            default:
                throw new IllegalStateException((new StringBuilder("Invalid element type ")).append(i).toString());

            case 1: // '\001'
                long l2 = bby1.a();
                long l4 = g;
                b.add(new bcr(f, l4 + l2, (byte)0));
                d.a(f, l2, g);
                e = 0;
                return true;

            case 2: // '\002'
                if (g > 8L)
                {
                    throw new IllegalStateException((new StringBuilder("Invalid integer size: ")).append(g).toString());
                } else
                {
                    d.a(f, a(bby1, (int)g));
                    e = 0;
                    return true;
                }

            case 5: // '\005'
                if (g != 4L && g != 8L)
                {
                    throw new IllegalStateException((new StringBuilder("Invalid float size: ")).append(g).toString());
                }
                bct bct1 = d;
                int j = f;
                int l = (int)g;
                long l3 = a(bby1, l);
                double d1;
                if (l == 4)
                {
                    d1 = Float.intBitsToFloat((int)l3);
                } else
                {
                    d1 = Double.longBitsToDouble(l3);
                }
                bct1.a(j, d1);
                e = 0;
                return true;

            case 3: // '\003'
                if (g > 0x7fffffffL)
                {
                    throw new IllegalStateException((new StringBuilder("String element size: ")).append(g).toString());
                } else
                {
                    bct bct2 = d;
                    int k = f;
                    int i1 = (int)g;
                    byte abyte0[] = new byte[i1];
                    bby1.b(abyte0, 0, i1);
                    bct2.a(k, new String(abyte0, Charset.forName("UTF-8")));
                    e = 0;
                    return true;
                }

            case 4: // '\004'
                d.a(f, (int)g, bby1);
                e = 0;
                return true;

            case 0: // '\0'
                bby1.a((int)g);
                e = 0;
                break;
            }
        } while (true);
    }
}
