// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;

public final class gsd
    implements Closeable
{

    public final String a;
    public final long b;
    public final hcw c[];
    public final gsa d;

    private gsd(gsa gsa, String s, long l, hcw ahcw[])
    {
        d = gsa;
        super();
        a = s;
        b = l;
        c = ahcw;
    }

    gsd(gsa gsa, String s, long l, hcw ahcw[], byte byte0)
    {
        this(gsa, s, l, ahcw);
    }

    public final void close()
    {
        hcw ahcw[] = c;
        int j = ahcw.length;
        for (int i = 0; i < j; i++)
        {
            gsp.a(ahcw[i]);
        }

    }
}
