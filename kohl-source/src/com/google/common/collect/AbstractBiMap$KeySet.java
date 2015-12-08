// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, AbstractBiMap

private class <init> extends ForwardingSet
{

    final AbstractBiMap this$0;

    public void clear()
    {
        AbstractBiMap.this.clear();
    }

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
        return AbstractBiMap.access$200(AbstractBiMap.this).keySet();
    }

    public Iterator iterator()
    {
        return new Iterator() {

            java.util.Map.Entry entry;
            final AbstractBiMap.KeySet this$1;
            final Iterator val$iterator;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public Object next()
            {
                entry = (java.util.Map.Entry)iterator.next();
                return entry.getKey();
            }

            public void remove()
            {
                Object obj;
                boolean flag;
                if (entry != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag);
                obj = entry.getValue();
                iterator.remove();
                AbstractBiMap.access$400(this$0, obj);
            }

            
            {
                this$1 = AbstractBiMap.KeySet.this;
                iterator = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        if (!contains(obj))
        {
            return false;
        } else
        {
            AbstractBiMap.access$300(AbstractBiMap.this, obj);
            return true;
        }
    }

    public boolean removeAll(Collection collection)
    {
        return standardRemoveAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return standardRetainAll(collection);
    }

    private _cls1.val.iterator()
    {
        this$0 = AbstractBiMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
