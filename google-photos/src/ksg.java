// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksg extends krs
{

    private int c;
    private int d;
    private int e;

    public ksg()
    {
        c = 1;
        d = 0;
        e = 0;
        a = null;
        b = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (c != 1)
        {
            i = j + krr.b(1, c);
        }
        return i;
    }

    public final void a(krr krr1)
    {
        if (c != 1)
        {
            krr1.a(1, c);
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
            if (obj instanceof ksg)
            {
                obj = (ksg)obj;
                flag = flag1;
                if (c == ((ksg) (obj)).c)
                {
                    return a(((krs) (obj)));
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (c + 527) * 31 * 31 * 31 + b();
    }
}
