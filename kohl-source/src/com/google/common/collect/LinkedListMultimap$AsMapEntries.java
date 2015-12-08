// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Multiset, AbstractMapEntry

private class <init> extends AbstractSet
{

    final LinkedListMultimap this$0;

    public Iterator iterator()
    {
        return new Iterator() {

            final LinkedListMultimap.AsMapEntries this$1;
            final Iterator val$keyIterator;

            public boolean hasNext()
            {
                return keyIterator.hasNext();
            }

            public volatile Object next()
            {
                return next();
            }

            public java.util.Map.Entry next()
            {
                return ((_cls1) (keyIterator.next())). new AbstractMapEntry() {

                    final _cls1 this$2;
                    final Object val$key;

                    public Object getKey()
                    {
                        return key;
                    }

                    public volatile Object getValue()
                    {
                        return getValue();
                    }

                    public Collection getValue()
                    {
                        return get(key);
                    }

            
            {
                this$2 = final__pcls1;
                key = Object.this;
                super();
            }
                };
            }

            public void remove()
            {
                keyIterator.remove();
            }

            
            {
                this$1 = LinkedListMultimap.AsMapEntries.this;
                keyIterator = iterator1;
                super();
            }
        };
    }

    public int size()
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).elementSet().size();
    }

    private _cls1.val.keyIterator()
    {
        this$0 = LinkedListMultimap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
