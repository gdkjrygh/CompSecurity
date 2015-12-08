// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, ImmutableMultimap, UnmodifiableIterator

private static class multimap extends ImmutableCollection
{

    private static final long serialVersionUID = 0L;
    final ImmutableMultimap multimap;

    boolean isPartialView()
    {
        return true;
    }

    public UnmodifiableIterator iterator()
    {
        return new UnmodifiableIterator() {

            final ImmutableMultimap.Values this$0;
            final Iterator val$entryIterator;

            public boolean hasNext()
            {
                return entryIterator.hasNext();
            }

            public Object next()
            {
                return ((java.util.Map.Entry)entryIterator.next()).getValue();
            }

            
            {
                this$0 = ImmutableMultimap.Values.this;
                entryIterator = iterator1;
                super();
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return multimap.size();
    }

    t>(ImmutableMultimap immutablemultimap)
    {
        multimap = immutablemultimap;
    }
}
