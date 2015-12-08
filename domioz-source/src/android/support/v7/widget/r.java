// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            aa, q

final class r
    implements Runnable
{

    final ArrayList a;
    final q b;

    r(q q1, ArrayList arraylist)
    {
        b = q1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        aa aa1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); q.a(b, aa1.a, aa1.b, aa1.c, aa1.d, aa1.e))
        {
            aa1 = (aa)iterator.next();
        }

        a.clear();
        q.a(b).remove(a);
    }
}
