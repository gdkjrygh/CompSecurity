// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            gg

class az extends AbstractCollection
{

    final Collection a;
    final Function b;

    az(Collection collection, Function function)
    {
        a = (Collection)Preconditions.checkNotNull(collection);
        b = (Function)Preconditions.checkNotNull(function);
    }

    public void clear()
    {
        a.clear();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return gg.a(a.iterator(), b);
    }

    public int size()
    {
        return a.size();
    }
}
