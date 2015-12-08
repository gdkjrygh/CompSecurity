// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.events.CurrentDownloadEvent;
import com.soundcloud.android.offline.OfflineProperty;
import com.soundcloud.android.presentation.ItemAdapter;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import java.util.Iterator;
import java.util.List;

public class UpdateCurrentDownloadSubscriber extends DefaultSubscriber
{

    private final ItemAdapter adapter;

    public UpdateCurrentDownloadSubscriber(ItemAdapter itemadapter)
    {
        adapter = itemadapter;
    }

    public void onNext(CurrentDownloadEvent currentdownloadevent)
    {
        Iterator iterator = adapter.getItems().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ListItem listitem = (ListItem)iterator.next();
            com.soundcloud.android.model.Urn urn = listitem.getEntityUrn();
            if (currentdownloadevent.entities.contains(urn))
            {
                listitem.update(PropertySet.from(new PropertyBinding[] {
                    OfflineProperty.OFFLINE_STATE.bind(currentdownloadevent.kind)
                }));
                flag = true;
            }
        } while (true);
        if (flag)
        {
            adapter.notifyDataSetChanged();
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentDownloadEvent)obj);
    }
}
