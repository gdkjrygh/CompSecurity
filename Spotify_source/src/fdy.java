// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fdy
{

    public int a;
    private final List b = new ArrayList();

    public fdy()
    {
    }

    public final int a()
    {
        return Math.min(190, a + 5);
    }

    public final void a(int i)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((fen)iterator.next()).a(i)) { }
    }

    public final void a(int i, boolean flag)
    {
        i = Math.min(190, Math.max(140, i));
        if (i != a)
        {
            a = i;
            if (flag)
            {
                a(a);
            }
        }
    }

    public final void a(fen fen1)
    {
        b.add(fen1);
    }

    public final int b()
    {
        return Math.max(140, a - 5);
    }

    public final boolean c()
    {
        return a == 140;
    }

    public final boolean d()
    {
        return a == 190;
    }
}
