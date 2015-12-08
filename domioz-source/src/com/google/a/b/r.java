// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            n, cy, e

final class r extends n
    implements Set
{

    final e a;

    r(e e1, Object obj, Set set)
    {
        a = e1;
        super(e1, obj, set, null);
    }

    public final boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = cy.a((Set)c, collection);
            flag = flag1;
            if (flag1)
            {
                int j = c.size();
                e.a(a, j - i);
                b();
                return flag1;
            }
        }
        return flag;
    }
}
