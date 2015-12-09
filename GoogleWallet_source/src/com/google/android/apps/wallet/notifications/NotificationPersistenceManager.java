// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class NotificationPersistenceManager
{

    private final SharedPreferences sharedPreferences;

    public NotificationPersistenceManager(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public final void addNotificationIds(Collection collection)
    {
        java.util.HashSet hashset = Sets.newHashSet(getNotificationIds());
        hashset.addAll(collection);
        SharedPreference.DISPLAYED_NOTIFICATION_IDS.putAndCommit(sharedPreferences, hashset);
    }

    public final Set getNotificationIds()
    {
        return (Set)SharedPreference.DISPLAYED_NOTIFICATION_IDS.get(sharedPreferences);
    }

    public final void removeAllNotificationIds()
    {
        SharedPreference.DISPLAYED_NOTIFICATION_IDS.putAndCommit(sharedPreferences, ImmutableSet.of());
    }

    public final void removeNotificationIds(Collection collection)
    {
        java.util.HashSet hashset = Sets.newHashSet(getNotificationIds());
        hashset.removeAll(collection);
        SharedPreference.DISPLAYED_NOTIFICATION_IDS.putAndCommit(sharedPreferences, hashset);
    }
}
