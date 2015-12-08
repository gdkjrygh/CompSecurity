// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Synchronized, ForwardingIterator

private static class init> extends init>
{

    private static final long serialVersionUID = 0L;

    public Iterator iterator()
    {
        return new ForwardingIterator() {

            final Synchronized.SynchronizedAsMapValues this$0;
            final Iterator val$iterator;

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected Iterator _mthdelegate()
            {
                return iterator;
            }

            public volatile Object next()
            {
                return next();
            }

            public Collection next()
            {
                return Synchronized.access$400((Collection)iterator.next(), mutex);
            }

            
            {
                this$0 = Synchronized.SynchronizedAsMapValues.this;
                iterator = iterator1;
                super();
            }
        };
    }

    _cls1.val.iterator(Collection collection, Object obj)
    {
        super(collection, obj, null);
    }
}
