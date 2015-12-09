// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            qe, j, c

public final class qf extends qe
{

    private int a;
    private int b;

    public qf(qe qe1, int i)
    {
        super(qe1);
        b = 0;
        a = i;
    }

    public final int a(byte abyte0[], int i, int k)
    {
        if (k == -1)
        {
            super.d.a(j.a);
            return -1;
        }
        if (b + k < a)
        {
            b = b + k;
            f = f + k;
            return k;
        } else
        {
            i = a - b;
            f = f + i;
            super.d.b(f());
            super.d.a(super.d.b());
            return i;
        }
    }

    public final qe a()
    {
        return j.a;
    }

    public final boolean a(int i)
    {
        if (i == -1)
        {
            super.d.a(j.a);
            return true;
        }
        b = b + 1;
        f = f + 1;
        if (b == a)
        {
            super.d.b(f());
            qe qe1 = super.d.b();
            super.d.a(qe1);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        return true;
    }

    public final qe c()
    {
        return j.a;
    }

    protected final int d()
    {
        return 0;
    }

    protected final int e()
    {
        return 0;
    }

    public final void g()
    {
        super.d.b(f());
        super.d.a(j.a);
    }
}
