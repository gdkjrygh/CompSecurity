// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.bouncycastle.util:
//            Store, Selector

public class CollectionStore
    implements Store
{

    private Collection a;

    public CollectionStore(Collection collection)
    {
        a = new ArrayList(collection);
    }

    public final Collection a(Selector selector)
    {
        if (selector != null) goto _L2; else goto _L1
_L1:
        Object obj = new ArrayList(a);
_L4:
        return ((Collection) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            obj = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = iterator.next();
            if (selector.a(obj))
            {
                arraylist.add(obj);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
