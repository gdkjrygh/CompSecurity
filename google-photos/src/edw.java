// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class edw
    implements Runnable
{

    private long a;
    private edp b;

    edw(edp edp1, long l)
    {
        b = edp1;
        a = l;
        super();
    }

    public final void run()
    {
        hgz hgz1 = edp.g(b);
        long l = a;
        int i = hgz1.c.a(l);
        if (i != -1)
        {
            hgz1.b().d(i);
            hgz1.d(i);
        }
    }
}
