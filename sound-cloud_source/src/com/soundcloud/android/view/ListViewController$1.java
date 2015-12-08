// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.view.View;
import com.soundcloud.android.presentation.PagingListItemAdapter;
import rx.a.a;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.view:
//            ListViewController

class val.itemMapper
    implements android.view.ewController._cls1
{

    final ListViewController this$0;
    final PagingListItemAdapter val$adapter;
    final f val$itemMapper;
    final a val$pager;

    public void onClick(View view)
    {
        val$adapter.setLoading();
        val$pager.currentPage().map(val$itemMapper).observeOn(rx.a.b.a.a()).subscribe(val$adapter);
    }

    mAdapter()
    {
        this$0 = final_listviewcontroller;
        val$adapter = paginglistitemadapter;
        val$pager = a1;
        val$itemMapper = f.this;
        super();
    }
}
