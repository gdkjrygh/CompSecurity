// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

public final class aio
{

    final ArrayList a = new ArrayList();
    ahr b;
    ahp c;
    ajr d;
    private final ArrayList e = new ArrayList();
    private ahq f;

    public aio(ajr ajr)
    {
        d = ajr;
        b = new ahr(d);
        c = new ahp();
    }

    public final ahq a(ahq ahq)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((ain)iterator.next()).a(this)) { }
        if (ahq == null)
        {
            ahq = b;
            ahq.a();
            f = ahq.a(null);
        } else
        {
            ahr ahr1 = b;
            if (ahq == null)
            {
                throw new NullPointerException("Parent graph must be non-null!");
            }
            ahr1.a();
            f = ahr1.a(ahq);
        }
        for (ahq = a.iterator(); ahq.hasNext(); ((ain)ahq.next()).a(this)) { }
        return f;
    }

    public final void a(ain ain1)
    {
        e.add(ain1);
    }
}
