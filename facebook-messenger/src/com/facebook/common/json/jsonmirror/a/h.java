// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror.a;

import com.facebook.common.json.jsonmirror.f;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.common.json.jsonmirror.a:
//            a, c, j, l

public class h extends a
{

    protected final Set g;
    public final int h;
    public final int i;

    public h(Set set)
    {
        this(set, 0, 0);
    }

    public h(Set set, int k, int i1)
    {
        Iterator iterator = set.iterator();
        int l1 = 0;
        int k1 = 0;
        int j1 = 0;
        while (iterator.hasNext()) 
        {
            a a1 = (a)iterator.next();
            int j2;
            if (a1 instanceof h)
            {
                int i2 = l1;
                k1++;
                l1 = j1;
                j1 = i2;
            } else
            if ((a1 instanceof c) || (a1 instanceof j))
            {
                int k2 = l1 + 1;
                l1 = j1;
                j1 = k2;
            } else
            if (a1 instanceof l)
            {
                int l2 = j1 + 1;
                j1 = l1;
                l1 = l2;
            } else
            {
                int i3 = j1;
                j1 = l1;
                l1 = i3;
            }
            j2 = l1;
            l1 = j1;
            j1 = j2;
        }
        if (k1 > 1)
        {
            throw new f("We don't handle multiple types of child lists in the same list.");
        }
        if (l1 > 1)
        {
            throw new f("We don't handle multiple types of child dictionaries in the same list.");
        }
        if (j1 > 1)
        {
            throw new f("We don't handle multiple types of strings in the same list.");
        } else
        {
            g = set;
            h = k;
            i = i1;
            return;
        }
    }

    public Set a()
    {
        return Collections.unmodifiableSet(g);
    }
}
