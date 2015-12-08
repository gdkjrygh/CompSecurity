// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

public final class gmc
{

    public static final Comparator a = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (gmc)obj;
            obj1 = (gmc)obj1;
            return (int)(gmc.a(((gmc) (obj))) - gmc.a(((gmc) (obj1))));
        }

    };
    final long b;
    final long c;

    public gmc(long l, long l1)
    {
        b = l;
        c = l1;
    }

    static long a(gmc gmc1)
    {
        return gmc1.b;
    }

}
