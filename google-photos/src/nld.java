// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class nld
    implements Comparator
{

    private nlc a;

    nld(nlc nlc1)
    {
        a = nlc1;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (nlg)obj;
        obj1 = (nlg)obj1;
        nlc nlc1 = a;
        int i = ((nlg) (obj)).a.b;
        int j = ((nlg) (obj1)).a.b;
        if (i == j)
        {
            return 0;
        }
        if (i == nlc1.b)
        {
            return -1;
        }
        if (j == nlc1.b)
        {
            return 1;
        } else
        {
            return i - j;
        }
    }
}
