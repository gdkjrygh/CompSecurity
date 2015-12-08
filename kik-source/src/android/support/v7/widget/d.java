// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            c

final class d
    implements Runnable
{

    final ArrayList a;
    final c b;

    d(c c1, ArrayList arraylist)
    {
        b = c1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        c.b b1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); c.a(b, b1.a, b1.b, b1.c, b1.d, b1.e))
        {
            b1 = (c.b)iterator.next();
        }

        a.clear();
        c.a(b).remove(a);
    }
}
