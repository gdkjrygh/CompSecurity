// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class gym
    implements gpz
{

    private gyl a;

    gym(gyl gyl1)
    {
        a = gyl1;
        super();
    }

    public final void a()
    {
        gyl gyl1 = a;
        Object obj = gyl.a(a);
        ArrayList arraylist = new ArrayList();
        obj = ((gpu) (obj)).b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ds ds1 = (ds)((Iterator) (obj)).next();
            if (gpt.isInstance(ds1))
            {
                arraylist.add(gpt.cast(ds1));
            }
        } while (true);
        gyl.a(gyl1, arraylist);
        gyl.b(a).a();
    }
}
