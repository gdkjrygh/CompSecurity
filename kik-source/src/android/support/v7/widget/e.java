// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            c

final class e
    implements Runnable
{

    final ArrayList a;
    final c b;

    e(c c1, ArrayList arraylist)
    {
        b = c1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        c.a a1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); c.a(b, a1))
        {
            a1 = (c.a)iterator.next();
        }

        a.clear();
        c.b(b).remove(a);
    }
}
