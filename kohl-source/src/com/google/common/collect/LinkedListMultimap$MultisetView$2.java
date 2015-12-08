// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Multiset

class this._cls1 extends AbstractSet
{

    final is._cls0 this$1;

    public Iterator iterator()
    {
        return new Iterator() {

            final LinkedListMultimap.MultisetView._cls2 this$2;
            final Iterator val$keyIterator;

            public boolean hasNext()
            {
                return keyIterator.hasNext();
            }

            public Multiset.Entry next()
            {
                return ((_cls1) (keyIterator.next())). new Multisets.AbstractEntry() {

                    final _cls1 this$3;
                    final Object val$key;

                    public int getCount()
                    {
                        return LinkedListMultimap.access$500(this$0).count(key);
                    }

                    public Object getElement()
                    {
                        return key;
                    }

            
            {
                this$3 = final__pcls1;
                key = Object.this;
                super();
            }
                };
            }

            public volatile Object next()
            {
                return next();
            }

            public void remove()
            {
                keyIterator.remove();
            }

            
            {
                this$2 = LinkedListMultimap.MultisetView._cls2.this;
                keyIterator = iterator1;
                super();
            }
        };
    }

    public int size()
    {
        return LinkedListMultimap.access$500(_fld0).elementSet().size();
    }

    _cls1.val.keyIterator()
    {
        this$1 = this._cls1.this;
        super();
    }
}
