// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            af, x

class ag
    implements Iterator
{

    final Iterator a;
    java.util.Map.Entry b;
    final af c;

    ag(af af1)
    {
        c = af1;
        super();
        a = c.a.entrySet().iterator();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        b = (java.util.Map.Entry)a.next();
        return b.getKey();
    }

    public void remove()
    {
        Collection collection;
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        collection = (Collection)b.getValue();
        a.remove();
        x.b(c.b, collection.size());
        collection.clear();
    }
}
