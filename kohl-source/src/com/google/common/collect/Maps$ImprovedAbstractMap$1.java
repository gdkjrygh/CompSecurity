// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, Maps

class val.delegate extends ForwardingSet
{

    final move this$0;
    final Set val$delegate;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Set _mthdelegate()
    {
        return val$delegate;
    }

    public boolean isEmpty()
    {
        return Empty();
    }

    public boolean remove(Object obj)
    {
        if (contains(obj))
        {
            move(obj);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = final_;
        val$delegate = Set.this;
        super();
    }
}
