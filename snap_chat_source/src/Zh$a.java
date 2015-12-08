// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.FutureTask;

static final class a extends FutureTask
    implements Comparable
{

    private final YN a;

    public final volatile int compareTo(Object obj)
    {
        obj = (reTo)obj;
        int i = a.o;
        int j = ((a) (obj)).a.o;
        if (i == j)
        {
            return a.a - ((a) (obj)).a.a;
        } else
        {
            return j - 1 - (i - 1);
        }
    }

    public >(YN yn)
    {
        super(yn, null);
        a = yn;
    }
}
