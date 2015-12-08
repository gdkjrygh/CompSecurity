// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx.observers;


// Referenced classes of package com.soundcloud.android.rx.observers:
//            DefaultSubscriber

public class RefreshRecyclerViewAdapterSubscriber extends DefaultSubscriber
{

    private final android.support.v7.widget.RecyclerView.Adapter adapter;

    public RefreshRecyclerViewAdapterSubscriber(android.support.v7.widget.RecyclerView.Adapter adapter1)
    {
        adapter = adapter1;
    }

    public void onNext(Object obj)
    {
        adapter.notifyDataSetChanged();
    }
}
