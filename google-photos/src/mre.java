// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class mre
{

    final mqv a;
    final mqm b;
    boolean c;

    public mre(mqv mqv, mqm mqm)
    {
        b = mqm;
        a = mqv;
        c = true;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof mre)
        {
            obj = (mre)obj;
            flag = flag1;
            if (c.c(b, ((mre) (obj)).b))
            {
                flag = flag1;
                if (c.c(a, ((mre) (obj)).a))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, a
        });
    }
}
