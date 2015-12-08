// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class ljc
    implements Runnable
{

    private liy a;
    private ljb b;

    public ljc(ljb ljb1, liy liy1)
    {
        b = ljb1;
        a = liy1;
        super();
    }

    public final void run()
    {
        a.a.a(a);
        for (Iterator iterator = ljb.a(b).iterator(); iterator.hasNext(); iterator.next()) { }
        ljb.a(b, a);
    }
}
