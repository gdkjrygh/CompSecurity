// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class jlw
{

    boolean a;
    public byte b[];
    public int c;
    private final int d;
    private boolean e;

    public jlw(int i, int j)
    {
        d = i;
        b = new byte[131];
        b[2] = 1;
    }

    public final void a()
    {
        e = false;
        a = false;
    }

    public final void a(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        if (i == d)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        e = flag;
        if (e)
        {
            c = 3;
            a = false;
        }
    }

    public final void a(byte abyte0[], int i, int j)
    {
        if (!e)
        {
            return;
        }
        j -= i;
        if (b.length < c + j)
        {
            b = Arrays.copyOf(b, c + j << 1);
        }
        System.arraycopy(abyte0, i, b, c, j);
        c = j + c;
    }

    public final boolean b(int i)
    {
        if (!e)
        {
            return false;
        } else
        {
            c = c - i;
            e = false;
            a = true;
            return true;
        }
    }
}
