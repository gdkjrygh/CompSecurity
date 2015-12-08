// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.presentation.ItemAdapter;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class UpdateEntityListSubscriber extends DefaultSubscriber
{

    private final ItemAdapter adapter;

    public UpdateEntityListSubscriber(ItemAdapter itemadapter)
    {
        adapter = itemadapter;
    }

    public final void onNext(EntityStateChangedEvent entitystatechangedevent)
    {
        entitystatechangedevent = entitystatechangedevent.getChangeMap();
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
            if (entitystatechangedevent.containsKey(urn))
            {
                listitem.update((PropertySet)entitystatechangedevent.get(urn));
                flag = true;
            }
        } while (true);
        if (flag)
        {
            adapter.notifyDataSetChanged();
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((EntityStateChangedEvent)obj);
    }
}
