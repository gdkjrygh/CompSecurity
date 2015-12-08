// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PromotedTrackingEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.PromotedListItem;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;

public class PromoterClickViewListener
    implements android.view.View.OnClickListener
{

    private final EventBus eventBus;
    private final PromotedListItem item;
    private final Navigator navigator;
    private final ScreenProvider screenProvider;

    public PromoterClickViewListener(PromotedListItem promotedlistitem, EventBus eventbus, ScreenProvider screenprovider, Navigator navigator1)
    {
        item = promotedlistitem;
        eventBus = eventbus;
        screenProvider = screenprovider;
        navigator = navigator1;
    }

    public void onClick(View view)
    {
        navigator.openProfile(view.getContext(), (Urn)item.getPromoterUrn().get());
        view = PromotedTrackingEvent.forPromoterClick(item, screenProvider.getLastScreenTag());
        eventBus.publish(EventQueue.TRACKING, view);
    }
}
