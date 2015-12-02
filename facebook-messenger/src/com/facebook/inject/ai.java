// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.a.kl;
import java.util.Iterator;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.inject:
//            ah, t

class ai
    implements a
{

    final ah a;

    ai(ah ah1)
    {
        a = ah1;
        super();
    }

    public Set a()
    {
        java.util.LinkedHashSet linkedhashset = kl.b();
        com.google.inject.a a1;
        for (Iterator iterator = com.facebook.inject.ah.a(a).iterator(); iterator.hasNext(); linkedhashset.add(ah.b(a).a(a1)))
        {
            a1 = (com.google.inject.a)iterator.next();
        }

        return linkedhashset;
    }

    public Object b()
    {
        return a();
    }
}
