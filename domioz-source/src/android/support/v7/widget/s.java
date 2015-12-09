// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            z, q

final class s
    implements Runnable
{

    final ArrayList a;
    final q b;

    s(q q1, ArrayList arraylist)
    {
        b = q1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        z z1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); q.a(b, z1))
        {
            z1 = (z)iterator.next();
        }

        a.clear();
        q.b(b).remove(a);
    }
}
