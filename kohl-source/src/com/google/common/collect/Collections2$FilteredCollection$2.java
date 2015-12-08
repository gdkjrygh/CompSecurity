// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            Collections2

class val.collection
    implements Predicate
{

    final val.collection this$0;
    final Collection val$collection;

    public boolean apply(Object obj)
    {
        return edicate.apply(obj) && !val$collection.contains(obj);
    }

    A()
    {
        this$0 = final_a;
        val$collection = Collection.this;
        super();
    }
}
