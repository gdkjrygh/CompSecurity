// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.DataHolder;

public interface Notifications
{
    public static interface ContactSettingLoadResult
        extends Result
    {

        public abstract DataHolder getDataHolder();
    }

    public static interface GameMuteStatusChangeResult
        extends Result
    {

        public abstract String getExternalGameId();

        public abstract boolean isMuted();
    }

    public static interface InboxCountResult
        extends Result
    {

        public abstract int getActivityCount(String s);

        public abstract int getTotalCount();

        public abstract boolean hasNewActivity();
    }


    public abstract void clear(GoogleApiClient googleapiclient, int i);

    public abstract void clearFirstParty(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult getInboxActivityCounts(GoogleApiClient googleapiclient);

    public abstract PendingResult loadContactSettingsInternalV2$4b6585cf(GoogleApiClient googleapiclient);

    public abstract PendingResult muteGameInternal(GoogleApiClient googleapiclient, String s);

    public abstract void notificationOpenedFirstParty(GoogleApiClient googleapiclient);

    public abstract void setAllowLevelUpNotificationsFirstParty(GoogleApiClient googleapiclient, boolean flag);

    public abstract boolean shouldAllowLevelUpNotificationsFirstParty(GoogleApiClient googleapiclient);

    public abstract PendingResult unmuteGameInternal(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult updateContactSettingsInternal(GoogleApiClient googleapiclient, boolean flag, Bundle bundle);
}
