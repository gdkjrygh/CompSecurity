// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, AbstractBiMap

private class <init> extends ForwardingSet
{

    final AbstractBiMap this$0;
    final Set valuesDelegate;

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
        return valuesDelegate;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            final AbstractBiMap.ValueSet this$1;
            final Iterator val$iterator;
            Object valueToRemove;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public Object next()
            {
                Object obj = iterator.next();
                valueToRemove = obj;
                return obj;
            }

            public void remove()
            {
                iterator.remove();
                AbstractBiMap.access$400(this$0, valueToRemove);
            }

            
            {
                this$1 = AbstractBiMap.ValueSet.this;
                iterator = iterator1;
                super();
            }
        };
    }

    public Object[] toArray()
    {
        return standardToArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return standardToArray(aobj);
    }

    public String toString()
    {
        return standardToString();
    }

    private _cls1.val.iterator()
    {
        this$0 = AbstractBiMap.this;
        super();
        valuesDelegate = AbstractBiMap.access$600(AbstractBiMap.this).keySet();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
