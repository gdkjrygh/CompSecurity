// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap

private class <init> extends AbstractCollection
{

    final AbstractMultimap this$0;

    public void clear()
    {
        AbstractMultimap.this.clear();
    }

    public boolean contains(Object obj)
    {
        return containsValue(obj);
    }

    public Iterator iterator()
    {
        return new erator(AbstractMultimap.this, null);
    }

    public int size()
    {
        return AbstractMultimap.access$200(AbstractMultimap.this);
    }

    private erator()
    {
        this$0 = AbstractMultimap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
