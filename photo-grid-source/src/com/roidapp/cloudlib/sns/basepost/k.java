// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            r, i

final class k
    implements Runnable
{

    final ArrayList a;
    final i b;

    k(i j, ArrayList arraylist)
    {
        b = j;
        a = arraylist;
        super();
    }

    public final void run()
    {
        r r1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); i.a(b, r1))
        {
            r1 = (r)iterator.next();
        }

        a.clear();
        i.b(b).remove(a);
    }
}
