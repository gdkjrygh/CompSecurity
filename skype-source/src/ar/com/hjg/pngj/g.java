// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;


// Referenced classes of package ar.com.hjg.pngj:
//            m, w

public final class g
{

    final m a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;

    public g(m m1)
    {
        l = -1;
        m = -1;
        h = 0;
        o = false;
        a = m1;
        i = 0;
        n = 0;
        b(1);
        a(0);
    }

    private void a(int i1)
    {
        l = i1;
        m = b * i1 + d;
        if (m < 0 || m >= a.b)
        {
            throw new w("bad row - this should not happen");
        } else
        {
            return;
        }
    }

    private void b(int i1)
    {
        if (i == i1)
        {
            return;
        }
        i = i1;
        i1;
        JVM INSTR tableswitch 1 7: default 56
    //                   1 80
    //                   2 267
    //                   3 296
    //                   4 325
    //                   5 354
    //                   6 383
    //                   7 412;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_412;
_L1:
        throw new w((new StringBuilder("bad interlace pass")).append(i1).toString());
_L2:
        byte abyte0[];
        abyte0 = new byte[4];
        abyte0;
        abyte0[0] = 8;
        abyte0[1] = 8;
        abyte0[2] = 0;
        abyte0[3] = 0;
_L9:
        c = abyte0[0];
        b = abyte0[1];
        e = abyte0[2];
        d = abyte0[3];
        if (a.b > d)
        {
            i1 = ((a.b + b) - 1 - d) / b;
        } else
        {
            i1 = 0;
        }
        j = i1;
        if (a.a > e)
        {
            i1 = ((a.a + c) - 1 - e) / c;
        } else
        {
            i1 = 0;
        }
        k = i1;
        if (k == 0)
        {
            j = 0;
        }
        g = c * a.d;
        f = e * a.d;
        return;
_L3:
        abyte0 = new byte[4];
        abyte0;
        abyte0[0] = 8;
        abyte0[1] = 8;
        abyte0[2] = 4;
        abyte0[3] = 0;
          goto _L9
_L4:
        abyte0 = new byte[4];
        abyte0;
        abyte0[0] = 4;
        abyte0[1] = 8;
        abyte0[2] = 0;
        abyte0[3] = 4;
          goto _L9
_L5:
        abyte0 = new byte[4];
        abyte0;
        abyte0[0] = 4;
        abyte0[1] = 4;
        abyte0[2] = 2;
        abyte0[3] = 0;
          goto _L9
_L6:
        abyte0 = new byte[4];
        abyte0;
        abyte0[0] = 2;
        abyte0[1] = 4;
        abyte0[2] = 0;
        abyte0[3] = 2;
          goto _L9
_L7:
        abyte0 = new byte[4];
        abyte0;
        abyte0[0] = 2;
        abyte0[1] = 2;
        abyte0[2] = 1;
        abyte0[3] = 0;
          goto _L9
        abyte0 = new byte[4];
        abyte0;
        abyte0[0] = 1;
        abyte0[1] = 2;
        abyte0[2] = 0;
        abyte0[3] = 1;
          goto _L9
    }

    final boolean a()
    {
        a(0);
_L2:
        return true;
        do
        {
            n = n + 1;
            if (j != 0 && l < j - 1)
            {
                break;
            }
label0:
            {
                if (i == 7)
                {
                    o = true;
                    return false;
                }
                b(i + 1);
                if (j != 0)
                {
                    break label0;
                }
                n = n - 1;
            }
        } while (true);
        a(l + 1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    final int b()
    {
        return l;
    }

    final int c()
    {
        return m;
    }

    final int d()
    {
        return i;
    }

    final int e()
    {
        return j;
    }

    final int f()
    {
        return k;
    }

    public final int g()
    {
        return (a.i * k + 7) / 8;
    }
}
