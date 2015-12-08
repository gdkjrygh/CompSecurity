// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.nio.BufferOverflowException;

final class jkr
{

    final jnl a = new jnl(24576);
    int b;
    int c;
    private final int d = 12288;
    private int e;

    public jkr(int i)
    {
    }

    private boolean c(jke jke1, byte abyte0[], int i, int j)
    {
        if (!b(jke1, j))
        {
            return false;
        }
        if (abyte0 != null)
        {
            System.arraycopy(a.a, b, abyte0, i, j);
        }
        b = b + j;
        return true;
    }

    public final void a()
    {
        b = 0;
        c = 0;
        e = 0;
    }

    public final void a(jke jke1, int i)
    {
        if (!c(jke1, null, 0, i))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final void a(jke jke1, byte abyte0[], int i, int j)
    {
        if (!c(jke1, abyte0, 0, j))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final void b()
    {
        if (b > d)
        {
            System.arraycopy(a.a, b, a.a, 0, c - b);
            c = c - b;
            b = 0;
        }
        e = b;
    }

    boolean b(jke jke1, int i)
    {
label0:
        {
            boolean flag = true;
            if ((b + i) - e > d)
            {
                throw new BufferOverflowException();
            }
            i -= c - b;
            if (i > 0)
            {
                if (jke1.a(a.a, c, i, true))
                {
                    break label0;
                }
                flag = false;
            }
            return flag;
        }
        c = i + c;
        return true;
    }

    public final boolean b(jke jke1, byte abyte0[], int i, int j)
    {
        return c(jke1, abyte0, 0, 4);
    }

    public final void c()
    {
        b = e;
    }
}
