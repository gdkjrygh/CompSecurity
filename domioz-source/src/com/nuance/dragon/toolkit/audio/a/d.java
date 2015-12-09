// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import com.nuance.dragon.toolkit.audio.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            e

final class d
    implements Runnable
{

    final ArrayList a;
    final ArrayList b;
    final e c;

    d(e e1, ArrayList arraylist, ArrayList arraylist1)
    {
        c = e1;
        a = arraylist;
        b = arraylist1;
        super();
    }

    public final void run()
    {
        e.a(c).addAll(a);
        if (!com.nuance.dragon.toolkit.audio.a.e.b(c).isEmpty())
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); com.nuance.dragon.toolkit.audio.a.e.b(c).remove(0))
            {
                iterator.next();
            }

        }
        if (e.a(c).size() > 0)
        {
            c.f();
        }
        b b1 = e.c(c);
        if (com.nuance.dragon.toolkit.audio.a.e.b(c).isEmpty() && (b1 == null || !b1.c()))
        {
            c.h();
        }
    }
}
