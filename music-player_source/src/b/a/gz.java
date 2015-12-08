// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ha

public final class gz extends ha
{

    private byte a[];
    private int b;
    private int c;

    public gz()
    {
    }

    public final int a(byte abyte0[], int i, int j)
    {
        int l = d();
        int k = j;
        if (j > l)
        {
            k = l;
        }
        if (k > 0)
        {
            System.arraycopy(a, b, abyte0, i, k);
            a(k);
        }
        return k;
    }

    public final void a()
    {
        a = null;
    }

    public final void a(int i)
    {
        b = b + i;
    }

    public final void a(byte abyte0[], int i)
    {
        a = abyte0;
        b = 0;
        c = i + 0;
    }

    public final void b(byte abyte0[], int i, int j)
    {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    public final byte[] b()
    {
        return a;
    }

    public final int c()
    {
        return b;
    }

    public final int d()
    {
        return c - b;
    }
}
