// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, Maps

class  extends ForwardingCollection
{

    final Empty this$0;
    final Collection val$delegate;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Collection _mthdelegate()
    {
        return val$delegate;
    }

    public boolean isEmpty()
    {
        return Empty();
    }

    ()
    {
        this$0 = final_;
        val$delegate = Collection.this;
        super();
    }
}
