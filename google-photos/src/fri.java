// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fri
{

    private int a;
    private int b;
    private int c;
    private int d;

    fri()
    {
    }

    fri(int i, int j, int k, int l)
    {
        a(i, j, k, l);
    }

    final void a(int i, int j, int k, int l)
    {
        a = i;
        b = j;
        c = k;
        d = l;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof fri)
        {
            obj = (fri)obj;
            flag = flag1;
            if (a == ((fri) (obj)).a)
            {
                flag = flag1;
                if (b == ((fri) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((fri) (obj)).c)
                    {
                        flag = flag1;
                        if (d == ((fri) (obj)).d)
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a + (b + (c + (d + 527) * 31) * 31) * 31;
    }
}
