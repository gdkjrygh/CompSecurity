// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.presentation.ItemAdapter;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

public final class PrependItemToListSubscriber extends DefaultSubscriber
{

    private final ItemAdapter adapter;

    public PrependItemToListSubscriber(ItemAdapter itemadapter)
    {
        adapter = itemadapter;
    }

    public final void onNext(ListItem listitem)
    {
        adapter.prependItem(listitem);
        adapter.notifyDataSetChanged();
    }

    public final volatile void onNext(Object obj)
    {
        onNext((ListItem)obj);
    }
}
