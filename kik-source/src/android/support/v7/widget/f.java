// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            c

final class f
    implements Runnable
{

    final ArrayList a;
    final c b;

    f(c c1, ArrayList arraylist)
    {
        b = c1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        RecyclerView.t t;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); c.a(b, t))
        {
            t = (RecyclerView.t)iterator.next();
        }

        a.clear();
        c.c(b).remove(a);
    }
}
