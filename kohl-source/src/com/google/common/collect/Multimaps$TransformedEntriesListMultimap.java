// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ListMultimap, Multimaps, Multimap, Lists

private static final class t> extends t>
    implements ListMultimap
{

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        return transform(obj, fromMultimap.get(obj));
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public List removeAll(Object obj)
    {
        return transform(obj, fromMultimap.removeAll(obj));
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public List replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    volatile Collection transform(Object obj, Collection collection)
    {
        return transform(obj, collection);
    }

    List transform(final Object key, Collection collection)
    {
        return Lists.transform((List)collection, new Function() {

            final Multimaps.TransformedEntriesListMultimap this$0;
            final Object val$key;

            public Object apply(Object obj)
            {
                return transformer.transformEntry(key, obj);
            }

            
            {
                this$0 = Multimaps.TransformedEntriesListMultimap.this;
                key = obj;
                super();
            }
        });
    }

    _cls1.val.key(ListMultimap listmultimap, _cls1.val.key key)
    {
        super(listmultimap, key);
    }
}
