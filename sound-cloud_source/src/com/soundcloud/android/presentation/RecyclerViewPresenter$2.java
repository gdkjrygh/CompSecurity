// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.view.View;

// Referenced classes of package com.soundcloud.android.presentation:
//            PagingAwareAdapter, PagedCollectionBinding, RecyclerViewPresenter

class val.binding
    implements android.view.ecyclerViewPresenter._cls2
{

    final RecyclerViewPresenter this$0;
    final PagingAwareAdapter val$adapter;
    final PagedCollectionBinding val$binding;

    public void onClick(View view)
    {
        val$adapter.setLoading();
        retryWith(val$binding.fromCurrentPage());
    }

    A()
    {
        this$0 = final_recyclerviewpresenter;
        val$adapter = pagingawareadapter;
        val$binding = PagedCollectionBinding.this;
        super();
    }
}
