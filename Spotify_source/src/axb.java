// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class axb
    implements awz
{

    private axa a;

    private axb(axa axa1)
    {
        a = axa1;
        super();
    }

    axb(axa axa1, byte byte0)
    {
        this(axa1);
    }

    public final void a(byte byte0)
    {
        for (Iterator iterator = a.g.iterator(); iterator.hasNext(); ((axc)iterator.next()).a(byte0)) { }
    }

    public final void a(asw asw1)
    {
        axc axc1 = a.c(asw1.c);
        if (axc1 != null)
        {
            axc1.a(asw1);
        }
    }

    public final void a(atc atc, byte byte0, byte byte1, String s)
    {
        Iterator iterator = a.g.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            axc axc1 = (axc)iterator.next();
            if (axc1.c != 0)
            {
                continue;
            }
            axc1.a(atc, byte0, byte1, s);
            break;
        } while (true);
    }

    public final void a(atc atc, byte byte0, String s)
    {
        axc axc1 = a.c(byte0);
        if (axc1 != null)
        {
            axc1.a(atc, byte0, s);
        }
    }

    public final void a(String s)
    {
        for (Iterator iterator = a.g.iterator(); iterator.hasNext(); ((axc)iterator.next()).a(s)) { }
    }

    public final void a(String s, Exception exception)
    {
        for (Iterator iterator = a.g.iterator(); iterator.hasNext(); ((axc)iterator.next()).a(s, exception)) { }
    }

    public final void b(String s, Exception exception)
    {
        for (Iterator iterator = a.g.iterator(); iterator.hasNext(); ((axc)iterator.next()).b(s, exception)) { }
    }
}
