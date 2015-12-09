// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            ek, ag, ao, q, 
//            be

final class ah extends ek
{

    final List a;
    final q b;

    ah(List list, q q1)
    {
        a = list;
        b = q1;
        super();
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            synchronized ((ag)iterator.next())
            {
                if (ag.a(ag1) == ao.b)
                {
                    b.o.b(ag1);
                }
            }
        }

    }
}
