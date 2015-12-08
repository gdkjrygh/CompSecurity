// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            dl, dm, LinkedHashMultiset, ImmutableMultiset

class counts
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final int counts[];
    final Object elements[];

    Object readResolve()
    {
        LinkedHashMultiset linkedhashmultiset = LinkedHashMultiset.create(elements.length);
        for (int i = 0; i < elements.length; i++)
        {
            linkedhashmultiset.add(elements[i], counts[i]);
        }

        return ImmutableMultiset.copyOf(linkedhashmultiset);
    }

    (dl dl1)
    {
        int i = dl1.entrySet().size();
        elements = new Object[i];
        counts = new int[i];
        dl1 = dl1.entrySet().iterator();
        for (int j = 0; dl1.hasNext(); j++)
        {
            dm dm1 = (dm)dl1.next();
            elements[j] = dm1.getElement();
            counts[j] = dm1.getCount();
        }

    }
}
