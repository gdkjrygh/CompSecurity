// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.FutureTask;

final class cgq extends FutureTask
    implements Comparable
{

    private final cfh a;

    public cgq(cfh cfh1)
    {
        super(cfh1, null);
        a = cfh1;
    }

    private int a(cgq cgq1)
    {
        int i = a.n();
        int j = cgq1.a.n();
        if (i == j)
        {
            return a.a - cgq1.a.a;
        } else
        {
            return j - 1 - (i - 1);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((cgq)obj);
    }
}
