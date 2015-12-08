// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            s, i

final class j
    implements Runnable
{

    final ArrayList a;
    final i b;

    j(i k, ArrayList arraylist)
    {
        b = k;
        a = arraylist;
        super();
    }

    public final void run()
    {
        s s1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); i.a(b, s1.a, s1.b, s1.c, s1.d, s1.e))
        {
            s1 = (s)iterator.next();
        }

        a.clear();
        i.a(b).remove(a);
    }
}
