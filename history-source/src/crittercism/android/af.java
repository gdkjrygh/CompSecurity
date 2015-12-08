// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package crittercism.android:
//            as, al

public abstract class af
{

    al a;
    CharArrayBuffer b;
    protected int c;
    private int d;

    public af(af af1)
    {
        a(af1.a, af1.c);
    }

    public af(al al1)
    {
        a(al1, 0);
    }

    private void a(al al1, int i)
    {
        a = al1;
        d = e();
        b = new CharArrayBuffer(d());
        c = i;
    }

    private void g()
    {
        a.a(as.d);
    }

    public final int a()
    {
        return c;
    }

    public final void a(byte abyte0[], int i, int j)
    {
        int k = b(abyte0, i, j);
        do
        {
            if (k <= 0 || k >= j)
            {
                break;
            }
            int l = a.a().b(abyte0, i + k, j - k);
            if (l <= 0)
            {
                break;
            }
            k += l;
        } while (true);
    }

    public boolean a(int i)
    {
        if (i == -1)
        {
            g();
        } else
        {
            c = c + 1;
            char c1 = (char)i;
            Object obj;
            if (c1 == '\n')
            {
                if (a(b))
                {
                    obj = b();
                } else
                {
                    obj = as.d;
                }
            } else
            if (b.length() < d)
            {
                b.append(c1);
                obj = this;
            } else
            {
                obj = c();
            }
            if (obj != this)
            {
                a.a(((af) (obj)));
            }
            if (obj == this)
            {
                return false;
            }
        }
        return true;
    }

    public abstract boolean a(CharArrayBuffer chararraybuffer);

    protected int b(byte abyte0[], int i, int j)
    {
        int k;
        boolean flag;
        flag = false;
        k = -1;
        if (j != -1) goto _L2; else goto _L1
_L1:
        int l;
        g();
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

    public abstract af b();

    public final void b(int i)
    {
        c = i;
    }

    public abstract af c();

    protected abstract int d();

    protected abstract int e();

    public void f()
    {
        if (a != null)
        {
            a.a(as.d);
        }
    }

    public final String toString()
    {
        return b.toString();
    }
}
