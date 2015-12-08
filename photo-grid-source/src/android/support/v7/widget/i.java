// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            p, g

final class i
    implements Runnable
{

    final ArrayList a;
    final g b;

    i(g g1, ArrayList arraylist)
    {
        b = g1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        p p1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); g.a(b, p1))
        {
            p1 = (p)iterator.next();
        }

        a.clear();
        g.b(b).remove(a);
    }
}
