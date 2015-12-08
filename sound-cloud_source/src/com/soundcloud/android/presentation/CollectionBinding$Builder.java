// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import com.soundcloud.rx.Pager;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.presentation:
//            CollectionBinding, PagingAwareAdapter, PagedCollectionBinding, ItemAdapter

public static class transformer
{

    private ItemAdapter adapter;
    private com.soundcloud.rx.ter pagingFunction;
    private final b source;
    private final f transformer;

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

    public adapter withAdapter(ItemAdapter itemadapter)
    {
        adapter = itemadapter;
        return this;
    }

    public adapter withPager(com.soundcloud.rx.onBinding.Builder builder)
    {
        pagingFunction = builder;
        return this;
    }

    (b b1, f f)
    {
        source = b1;
        transformer = f;
    }
}
