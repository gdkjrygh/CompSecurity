// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ksb extends krs
{

    private byte c[];
    private byte d[][];
    private boolean e;

    public ksb()
    {
        c = kry.e;
        d = kry.d;
        e = false;
        a = null;
        b = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (!Arrays.equals(c, kry.e))
        {
            i = j + krr.b(1, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < d.length;)
                {
                    byte abyte0[] = d[j];
                    int j1 = k;
                    int i1 = l;
                    if (abyte0 != null)
                    {
                        i1 = l + 1;
                        j1 = k + krr.a(abyte0);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        return j;
    }

    public final void a(krr krr1)
    {
        if (!Arrays.equals(c, kry.e))
        {
            krr1.a(1, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                byte abyte0[] = d[i];
                if (abyte0 != null)
                {
                    krr1.a(2, abyte0);
                }
            }

        }
        super.a(krr1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof ksb)
            {
                obj = (ksb)obj;
                flag = flag1;
                if (Arrays.equals(c, ((ksb) (obj)).c))
                {
                    flag = flag1;
                    if (krv.a(d, ((ksb) (obj)).d))
                    {
                        return a(((krs) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (((Arrays.hashCode(c) + 527) * 31 + krv.a(d)) * 31 + 1237) * 31 + b();
    }
}
