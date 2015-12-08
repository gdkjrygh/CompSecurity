// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class glq
{

    public final List a;
    public final long b;

    public glq(List list, long l)
    {
        a = list;
        b = l;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof glq)
        {
            obj = (glq)obj;
            flag = flag1;
            if (b == ((glq) (obj)).b)
            {
                flag = flag1;
                if (a.equals(((glq) (obj)).a))
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
            Integer.valueOf(a.hashCode()), Integer.valueOf((int)b)
        });
    }

    public final String toString()
    {
        String s = String.valueOf("Month{media size: ");
        int i = a.size();
        String s1 = String.valueOf((new Date(b)).toGMTString());
        return (new StringBuilder(String.valueOf(s).length() + 25 + String.valueOf(s1).length())).append(s).append(i).append(", startTime: ").append(s1).append("}").toString();
    }
}
