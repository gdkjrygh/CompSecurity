// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.ItemAdapter;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

public final class RemoveEntityListSubscriber extends DefaultSubscriber
{

    private final ItemAdapter adapter;

    public RemoveEntityListSubscriber(ItemAdapter itemadapter)
    {
        adapter = itemadapter;
    }

    private void removeItemFromAdapterAt(int i)
    {
        adapter.removeItem(i);
        adapter.notifyDataSetChanged();
    }

    public final void onNext(Urn urn)
    {
        int j = adapter.getItemCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (!((ListItem)adapter.getItem(i)).getEntityUrn().equals(urn))
                    {
                        break label0;
                    }
                    removeItemFromAdapterAt(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    public final volatile void onNext(Object obj)
    {
        onNext((Urn)obj);
    }
}
