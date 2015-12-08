// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.util.CharArrayBuffer;

public abstract class afi
{

    private int a;
    ZC d;
    CharArrayBuffer e;
    protected int f;

    public afi(ZC zc)
    {
        a(zc, 0);
    }

    public afi(afi afi1)
    {
        a(afi1.d, afi1.f);
    }

    private void a(ZC zc, int i)
    {
        d = zc;
        a = e();
        e = new CharArrayBuffer(d());
        f = i;
    }

    private void b()
    {
        d.a(ZJ.a);
    }

    protected int a(byte abyte0[], int i, int j)
    {
        int k;
        boolean flag;
        flag = false;
        k = -1;
        if (j != -1) goto _L2; else goto _L1
_L1:
        int l;
        b();
        l = k;
_L4:
        return l;
_L2:
        l = k;
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        l = k;
        if (j == 0) goto _L4; else goto _L5
_L5:
        k = 0;
_L8:
        l = k;
        if (flag) goto _L4; else goto _L6
_L6:
        l = k;
        if (k >= j) goto _L4; else goto _L7
_L7:
        flag = a((char)abyte0[i + k]);
        k++;
          goto _L8
    }

    public abstract afi a();

    public boolean a(int i)
    {
        if (i == -1)
        {
            b();
        } else
        {
            f = f + 1;
            char c1 = (char)i;
            Object obj;
            if (c1 == '\n')
            {
                if (a(e))
                {
                    obj = a();
                } else
                {
                    obj = ZJ.a;
                }
            } else
            if (e.length() < a)
            {
                e.append(c1);
                obj = this;
            } else
            {
                obj = c();
            }
            if (obj != this)
            {
                d.a(((afi) (obj)));
            }
            if (obj == this)
            {
                return false;
            }
        }
        return true;
    }

    public abstract boolean a(CharArrayBuffer chararraybuffer);

    public final void b(int i)
    {
        f = i;
    }

    public final void b(byte abyte0[], int i, int j)
    {
        int k = a(abyte0, i, j);
        do
        {
            if (k <= 0 || k >= j)
            {
                break;
            }
            int l = d.a().a(abyte0, i + k, j - k);
            if (l <= 0)
            {
                break;
            }
            k += l;
        } while (true);
    }

    public abstract afi c();

    protected abstract int d();

    protected abstract int e();

    public final int f()
    {
        return f;
    }

    public void g()
    {
        if (d != null)
        {
            d.a(ZJ.a);
        }
    }

    public final String toString()
    {
        return e.toString();
    }
}
