// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.launcherbadges;

import com.facebook.common.w.q;
import com.google.common.a.fi;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.launcherbadges:
//            a

class c
    implements a
{

    private final fi a;

    c(Set set)
    {
        a = fi.a(set);
    }

    public q a(int i)
    {
        q q1 = q.NO;
        Iterator iterator = a.iterator();
        do
        {
            q q2;
label0:
            {
                q2 = q1;
                if (iterator.hasNext())
                {
                    q2 = ((a)iterator.next()).a(i);
                    if (q2 != q.YES)
                    {
                        break label0;
                    }
                    q2 = q.YES;
                }
                return q2;
            }
            if (q2 == q.UNSET && q1 == q.NO)
            {
                q1 = q2;
            }
        } while (true);
    }
}
