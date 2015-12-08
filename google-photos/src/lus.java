// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class lus
    implements Runnable
{

    private List a;
    private long b;
    private lur c;

    lus(lur lur1, List list, long l)
    {
        c = lur1;
        a = list;
        b = l;
        super();
    }

    public final void run()
    {
        lur.a(c, a, b);
    }
}
