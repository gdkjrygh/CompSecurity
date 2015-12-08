// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import com.soundcloud.rx.Pager;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.presentation:
//            CollectionBinding, PagingAwareAdapter, ItemAdapter

public class PagedCollectionBinding extends CollectionBinding
{

    private final PagingAwareAdapter adapter;
    private final Pager pager;

    PagedCollectionBinding(b b, PagingAwareAdapter pagingawareadapter, Pager pager1)
    {
        super(b, pagingawareadapter);
        adapter = pagingawareadapter;
        pager = pager1;
    }

    PagedCollectionBinding(b b, PagingAwareAdapter pagingawareadapter, Pager pager1, R r)
    {
        super(b, pagingawareadapter, r);
        adapter = pagingawareadapter;
        pager = pager1;
    }

    public volatile ItemAdapter adapter()
    {
        return adapter();
    }

    public PagingAwareAdapter adapter()
    {
        return adapter;
    }

    PagedCollectionBinding fromCurrentPage()
    {
        return new PagedCollectionBinding(pager.currentPage(), adapter, pager);
    }

    public Pager pager()
    {
        return pager;
    }
}
