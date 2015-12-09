// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            bv, q

final class t
    implements Runnable
{

    final ArrayList a;
    final q b;

    t(q q1, ArrayList arraylist)
    {
        b = q1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        bv bv1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); q.a(b, bv1))
        {
            bv1 = (bv)iterator.next();
        }

        a.clear();
        q.c(b).remove(a);
    }
}
