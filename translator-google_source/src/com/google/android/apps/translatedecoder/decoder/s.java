// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.util.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            t, q, r

final class s
{

    final List a = new ArrayList();
    int b;
    final r c;

    public s(r r1)
    {
        c = r1;
        super();
        b = 0;
    }

    final void a(q q1)
    {
        Iterator iterator = a.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        t t1 = (t)iterator.next();
        if (t1.a != q1.d) goto _L4; else goto _L3
_L3:
        if (t1 == null)
        {
            q1 = new t(c, q1);
            a.add(q1);
        } else
        {
            t1.a(q1);
        }
        b = b + 1;
        return;
_L2:
        t1 = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    final void a(PriorityQueue priorityqueue, PriorityQueue priorityqueue1, int i)
    {
        if (b <= r.a(c).C)
        {
            for (priorityqueue = a.iterator(); priorityqueue.hasNext();)
            {
                Iterator iterator = ((t)priorityqueue.next()).b.iterator();
                while (iterator.hasNext()) 
                {
                    priorityqueue1.add((q)iterator.next());
                }
            }

        } else
        {
            for (Iterator iterator1 = a.iterator(); iterator1.hasNext();)
            {
                Iterator iterator2 = ((t)iterator1.next()).b.iterator();
                while (iterator2.hasNext()) 
                {
                    priorityqueue.add((q)iterator2.next());
                }
            }

            for (; b > r.a(c).C; b = b - 1)
            {
                q q1 = (q)priorityqueue.poll();
                r.a(c, q1, i);
            }

            priorityqueue1.addAll(priorityqueue);
        }
    }

    final boolean b(q q1)
    {
        Iterator iterator = a.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        t t1 = (t)iterator.next();
        if (t1.a != q1.d) goto _L4; else goto _L3
_L3:
        t1.b.remove(q1);
        boolean flag;
        if (t1.b.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L5
_L5:
        q1 = t1;
_L7:
        if (q1 != null)
        {
            a.remove(q1);
        }
        b = b - 1;
        return b == 0;
_L2:
        q1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
