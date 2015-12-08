// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import com.soundcloud.rx.Pager;
import rx.R;
import rx.Y;
import rx.a.b.a;
import rx.b;
import rx.h.f;
import rx.internal.util.q;

// Referenced classes of package com.soundcloud.android.presentation:
//            ItemAdapter, PagingAwareAdapter, PagedCollectionBinding

public class CollectionBinding
{
    public static class Builder
    {

        private ItemAdapter adapter;
        private com.soundcloud.rx.Pager.PagingFunction pagingFunction;
        private final b source;
        private final rx.b.f transformer;

        public CollectionBinding build()
        {
            if (adapter == null)
            {
                throw new IllegalArgumentException("Adapter can't be null");
            }
            if (pagingFunction != null)
            {
                if (!(adapter instanceof PagingAwareAdapter))
                {
                    throw new IllegalArgumentException((new StringBuilder("Adapter must implement ")).append(com/soundcloud/android/presentation/PagingAwareAdapter).append(" when used in a paged binding").toString());
                } else
                {
                    Pager pager = Pager.create(pagingFunction, transformer);
                    return new PagedCollectionBinding(pager.page(source), (PagingAwareAdapter)adapter, pager);
                }
            } else
            {
                return new CollectionBinding(source.map(transformer), adapter);
            }
        }

        public Builder withAdapter(ItemAdapter itemadapter)
        {
            adapter = itemadapter;
            return this;
        }

        public Builder withPager(com.soundcloud.rx.Pager.PagingFunction pagingfunction)
        {
            pagingFunction = pagingfunction;
            return this;
        }

        Builder(b b1, rx.b.f f1)
        {
            source = b1;
            transformer = f1;
        }
    }


    private final ItemAdapter adapter;
    private final rx.c.b items;
    private Y sourceSubscription;

    CollectionBinding(b b1, ItemAdapter itemadapter)
    {
        this(b1, itemadapter, a.a());
    }

    CollectionBinding(b b1, ItemAdapter itemadapter, R r)
    {
        sourceSubscription = f.a();
        items = b1.observeOn(r).replay();
        adapter = itemadapter;
    }

    public static Builder from(b b1)
    {
        return from(b1, q.b());
    }

    public static Builder from(b b1, rx.b.f f1)
    {
        return new Builder(b1, f1);
    }

    public ItemAdapter adapter()
    {
        return adapter;
    }

    public Y connect()
    {
        sourceSubscription = items.a();
        return sourceSubscription;
    }

    public void disconnect()
    {
        sourceSubscription.unsubscribe();
    }

    public b items()
    {
        return items;
    }
}
