// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.paywall;

import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.MidTierTrackEvent;
import com.soundcloud.android.presentation.ItemAdapter;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;

public class PaywallImpressionController
    implements android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
{

    static final int HANDLER_MESSAGE = 0;
    private final Handler deduplicateHandler;
    private final EventBus eventBus;
    private LinearLayoutManager linearLayoutManager;
    private ItemAdapter listItemAdapter;
    private final ScreenProvider screenProvider;

    public PaywallImpressionController(EventBus eventbus, Handler handler, ScreenProvider screenprovider)
    {
        eventBus = eventbus;
        deduplicateHandler = handler;
        screenProvider = screenprovider;
    }

    public PaywallImpressionController(EventBus eventbus, ScreenProvider screenprovider)
    {
        this(eventbus, new Handler(), screenprovider);
    }

    private void addToDeduplicateHandler(ListItem listitem)
    {
        deduplicateHandler.sendMessage(Message.obtain(deduplicateHandler, 0, listitem.getEntityUrn()));
    }

    private boolean isMidTierTrack(ListItem listitem)
    {
        return (listitem instanceof TrackItem) && ((TrackItem)listitem).isMidTier();
    }

    private boolean isNotDuplicate(ListItem listitem)
    {
        boolean flag = false;
        if (!deduplicateHandler.hasMessages(0, listitem.getEntityUrn()))
        {
            flag = true;
        }
        return flag;
    }

    private void safeAssignLayoutManager(RecyclerView recyclerview)
    {
        recyclerview = recyclerview.getLayoutManager();
        boolean flag;
        if (recyclerview != null && (recyclerview instanceof LinearLayoutManager))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "PaywallImpressionCreator expects a LinearLayoutManager");
        linearLayoutManager = (LinearLayoutManager)recyclerview;
    }

    private void safeAssignListAdapter(RecyclerView recyclerview)
    {
        recyclerview = recyclerview.getAdapter();
        boolean flag;
        if (recyclerview != null && (recyclerview instanceof ItemAdapter))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "PaywallImpressionCreator expects an ItemAdapter");
        listItemAdapter = (ItemAdapter)recyclerview;
    }

    public void attachRecyclerView(RecyclerView recyclerview)
    {
        safeAssignLayoutManager(recyclerview);
        safeAssignListAdapter(recyclerview);
        recyclerview.addOnChildAttachStateChangeListener(this);
    }

    public void detachRecyclerView(RecyclerView recyclerview)
    {
        recyclerview.removeOnChildAttachStateChangeListener(this);
    }

    public void onChildViewAttachedToWindow(View view)
    {
        int i = linearLayoutManager.getPosition(view);
        if (i < listItemAdapter.getItems().size())
        {
            view = (ListItem)listItemAdapter.getItem(i);
            if (isMidTierTrack(view) && isNotDuplicate(view))
            {
                eventBus.publish(EventQueue.TRACKING, MidTierTrackEvent.forImpression(view.getEntityUrn(), screenProvider.getLastScreenTag()));
            }
        }
    }

    public void onChildViewDetachedFromWindow(View view)
    {
        int i = linearLayoutManager.getPosition(view);
        if (i < listItemAdapter.getItems().size())
        {
            view = (ListItem)listItemAdapter.getItem(i);
            if (isMidTierTrack(view))
            {
                addToDeduplicateHandler(view);
            }
        }
    }
}
