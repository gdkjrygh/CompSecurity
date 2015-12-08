// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;

import Cl;
import java.util.UUID;

public final class SnapMessageFeedRefreshedEvent
{
    public static final class RefreshError extends Enum
    {

        private static final RefreshError $VALUES[];
        public static final RefreshError AUTHENTICATION_ERROR;
        public static final RefreshError EXTERNAL_STORAGE_UNAVAILABLE;
        public static final RefreshError FAIL_TO_UPDATE;
        public static final RefreshError HAS_INTERNET_BUT_CONNECTION_FAIL;
        public static final RefreshError NONE;
        public static final RefreshError NO_INTERNET_CONNECTION;
        public static final RefreshError SERVER_FAILURE;
        public static final RefreshError UNAUTHORIZED;

        public static RefreshError valueOf(String s)
        {
            return (RefreshError)Enum.valueOf(com/snapchat/android/util/eventbus/SnapMessageFeedRefreshedEvent$RefreshError, s);
        }

        public static RefreshError[] values()
        {
            return (RefreshError[])$VALUES.clone();
        }

        static 
        {
            NONE = new RefreshError("NONE", 0);
            EXTERNAL_STORAGE_UNAVAILABLE = new RefreshError("EXTERNAL_STORAGE_UNAVAILABLE", 1);
            FAIL_TO_UPDATE = new RefreshError("FAIL_TO_UPDATE", 2);
            AUTHENTICATION_ERROR = new RefreshError("AUTHENTICATION_ERROR", 3);
            NO_INTERNET_CONNECTION = new RefreshError("NO_INTERNET_CONNECTION", 4);
            HAS_INTERNET_BUT_CONNECTION_FAIL = new RefreshError("HAS_INTERNET_BUT_CONNECTION_FAIL", 5);
            UNAUTHORIZED = new RefreshError("UNAUTHORIZED", 6);
            SERVER_FAILURE = new RefreshError("SERVER_FAILURE", 7);
            $VALUES = (new RefreshError[] {
                NONE, EXTERNAL_STORAGE_UNAVAILABLE, FAIL_TO_UPDATE, AUTHENTICATION_ERROR, NO_INTERNET_CONNECTION, HAS_INTERNET_BUT_CONNECTION_FAIL, UNAUTHORIZED, SERVER_FAILURE
            });
        }

        private RefreshError(String s, int i)
        {
            super(s, i);
        }
    }


    public RefreshError mError;
    public UUID mUUID;

    public SnapMessageFeedRefreshedEvent(UUID uuid, int i)
    {
        mUUID = uuid;
        if (i <= 0)
        {
            if (!Cl.a().c())
            {
                uuid = RefreshError.NO_INTERNET_CONNECTION;
            } else
            {
                uuid = RefreshError.HAS_INTERNET_BUT_CONNECTION_FAIL;
            }
        } else
        if (i == 401)
        {
            uuid = RefreshError.UNAUTHORIZED;
        } else
        if (i >= 400)
        {
            uuid = RefreshError.SERVER_FAILURE;
        } else
        {
            uuid = RefreshError.NONE;
        }
        mError = uuid;
    }

    public SnapMessageFeedRefreshedEvent(UUID uuid, RefreshError refresherror)
    {
        mUUID = uuid;
        mError = refresherror;
    }
}
