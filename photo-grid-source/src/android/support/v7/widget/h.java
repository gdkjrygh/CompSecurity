// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            q, g

final class h
    implements Runnable
{

    final ArrayList a;
    final g b;

    h(g g1, ArrayList arraylist)
    {
        b = g1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        q q1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); g.a(b, q1.a, q1.b, q1.c, q1.d, q1.e))
        {
            q1 = (q)iterator.next();
        }

        a.clear();
        g.a(b).remove(a);
    }
}
