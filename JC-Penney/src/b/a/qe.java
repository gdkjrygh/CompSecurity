// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            j, c

public abstract class qe
{

    private int a;
    c d;
    CharArrayBuffer e;
    protected int f;

    public qe(c c1)
    {
        a(c1, 0);
    }

    public qe(qe qe1)
    {
        a(qe1.d, qe1.f);
    }

    private void a(c c1, int i)
    {
        d = c1;
        a = e();
        e = new CharArrayBuffer(d());
        f = i;
    }

    private void b()
    {
        d.a(j.a);
    }

    protected int a(byte abyte0[], int i, int k)
    {
        int l;
        boolean flag;
        flag = false;
        l = -1;
        if (k != -1) goto _L2; else goto _L1
_L1:
        int i1;
        b();
        i1 = l;
_L4:
        return i1;
_L2:
        i1 = l;
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        i1 = l;
        if (k == 0) goto _L4; else goto _L5
_L5:
        l = 0;
_L8:
        i1 = l;
        if (flag) goto _L4; else goto _L6
_L6:
        i1 = l;
        if (l >= k) goto _L4; else goto _L7
_L7:
        flag = a((char)abyte0[i + l]);
        l++;
          goto _L8
    }

    public abstract qe a();

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
                    obj = j.a;
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
                d.a(((qe) (obj)));
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

    public final void b(byte abyte0[], int i, int k)
    {
        int l = a(abyte0, i, k);
        do
        {
            if (l <= 0 || l >= k)
            {
                break;
            }
            int i1 = d.a().a(abyte0, i + l, k - l);
            if (i1 <= 0)
            {
                break;
            }
            l += i1;
        } while (true);
    }

    public abstract qe c();

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
            d.a(j.a);
        }
    }

    public final String toString()
    {
        return e.toString();
    }
}
