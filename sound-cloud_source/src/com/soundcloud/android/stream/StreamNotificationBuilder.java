// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.PropertySet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Provider;
import rx.b;

public class StreamNotificationBuilder
{

    private static final int NOTIFICATION_MAX = 100;
    protected final Context appContext;
    private final Provider builderProvider;
    private final int notificationMax;

    public StreamNotificationBuilder(Context context, Provider provider)
    {
        this(context, provider, 100);
    }

    public StreamNotificationBuilder(Context context, Provider provider, int i)
    {
        appContext = context;
        builderProvider = provider;
        notificationMax = i;
    }

    private Intent getIntent()
    {
        Intent intent = (new Intent("com.soundcloud.android.action.STREAM")).addFlags(0x4000000).addFlags(0x20000000);
        intent.putExtra("refresh_stream", true);
        Screen.NOTIFICATION.addToIntent(intent);
        Referrer.STREAM_NOTIFICATION.addToIntent(intent);
        return intent;
    }

    private String getNotificationCount(List list)
    {
        if (list.size() > notificationMax)
        {
            list = (new StringBuilder()).append(notificationMax).append("+").toString();
        } else
        {
            list = Integer.valueOf(list.size());
        }
        return String.valueOf(list);
    }

    private LinkedHashSet getUniqueUsersFromStreamItems(List list)
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        for (list = list.iterator(); list.hasNext(); linkedhashset.add(((PropertySet)list.next()).get(PlayableProperty.CREATOR_NAME))) { }
        return linkedhashset;
    }

    protected android.support.v4.app.NotificationCompat.Builder getBuilder(List list)
    {
        PendingIntent pendingintent = PendingIntent.getActivity(appContext, 0, getIntent(), 0x48000000);
        CharSequence charsequence = getTicker(list);
        CharSequence charsequence1 = getTitle(list);
        list = getIncomingNotificationMessage(list);
        android.support.v4.app.NotificationCompat.Builder builder = (android.support.v4.app.NotificationCompat.Builder)builderProvider.get();
        builder.setSmallIcon(0x7f02015d);
        builder.setContentIntent(pendingintent);
        builder.setAutoCancel(true);
        builder.setVisibility(1);
        builder.setTicker(charsequence);
        builder.setContentTitle(appContext.getResources().getString(0x7f07007b));
        builder.setContentText((new StringBuilder()).append(charsequence1).append(" ").append(list).toString());
        return builder;
    }

    public String getIncomingNotificationMessage(List list)
    {
        list = getUniqueUsersFromStreamItems(list);
        Iterator iterator = list.iterator();
        switch (list.size())
        {
        default:
            return appContext.getString(0x7f070115, new Object[] {
                iterator.next(), iterator.next()
            });

        case 1: // '\001'
            return appContext.getString(0x7f070113, new Object[] {
                iterator.next()
            });

        case 2: // '\002'
            return appContext.getString(0x7f070114, new Object[] {
                iterator.next(), iterator.next()
            });
        }
    }

    protected CharSequence getTicker(List list)
    {
        return appContext.getResources().getQuantityString(0x7f09000a, list.size(), new Object[] {
            getNotificationCount(list)
        });
    }

    protected CharSequence getTitle(List list)
    {
        return appContext.getResources().getQuantityString(0x7f09000b, list.size(), new Object[] {
            getNotificationCount(list)
        });
    }

    public b notification(List list)
    {
        return b.just(getBuilder(list).build());
    }
}
