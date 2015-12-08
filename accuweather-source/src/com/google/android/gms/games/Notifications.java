// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

public interface Notifications
{
    public static interface ContactSettingLoadResult
        extends Result
    {
    }

    public static interface GameMuteStatusChangeResult
        extends Result
    {
    }

    public static interface GameMuteStatusLoadResult
        extends Result
    {
    }

    public static interface InboxCountResult
        extends Result
    {
    }


    public static final int NOTIFICATION_TYPES_ALL = 31;
    public static final int NOTIFICATION_TYPES_MULTIPLAYER = 3;
    public static final int NOTIFICATION_TYPE_INVITATION = 1;
    public static final int NOTIFICATION_TYPE_LEVEL_UP = 16;
    public static final int NOTIFICATION_TYPE_MATCH_UPDATE = 2;
    public static final int NOTIFICATION_TYPE_QUEST = 8;
    public static final int NOTIFICATION_TYPE_REQUEST = 4;

    public abstract void clear(GoogleApiClient googleapiclient, int i);

    public abstract void clearAll(GoogleApiClient googleapiclient);
}
