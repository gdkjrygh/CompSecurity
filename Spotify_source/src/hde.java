// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hde
{

    final int a;
    final int b;

    hde(int i, int j)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hdm.a(flag, String.format("length must be >= 0: %,d", new Object[] {
            Integer.valueOf(i)
        }));
        a = i;
        b = j;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof hde)
        {
            obj = (hde)obj;
            flag = flag1;
            if (b == ((hde) (obj)).b)
            {
                flag = flag1;
                if (a == ((hde) (obj)).a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (b + 31) * 31 + a;
    }

    public final String toString()
    {
        return String.format("ExtendedTypeHeader(type:%d, length:%,d)", new Object[] {
            Integer.valueOf(b), Integer.valueOf(a)
        });
    }
}
