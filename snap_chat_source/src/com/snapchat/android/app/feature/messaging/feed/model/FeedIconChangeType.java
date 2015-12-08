// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.model;


public final class FeedIconChangeType extends Enum
{

    private static final FeedIconChangeType $VALUES[];
    public static final FeedIconChangeType FAILED_TO_LOAD;
    public static final FeedIconChangeType FAILED_TO_SEND;
    public static final FeedIconChangeType LOADED;
    public static final FeedIconChangeType LOADING;
    public static final FeedIconChangeType RECEIVED;
    public static final FeedIconChangeType SENDING;
    public static final FeedIconChangeType SENT;
    public static final FeedIconChangeType VIEWED;
    public static final FeedIconChangeType VIEWING;

    private FeedIconChangeType(String s, int i)
    {
        super(s, i);
    }

    public static FeedIconChangeType valueOf(String s)
    {
        return (FeedIconChangeType)Enum.valueOf(com/snapchat/android/app/feature/messaging/feed/model/FeedIconChangeType, s);
    }

    public static FeedIconChangeType[] values()
    {
        return (FeedIconChangeType[])$VALUES.clone();
    }

    static 
    {
        RECEIVED = new FeedIconChangeType("RECEIVED", 0);
        VIEWING = new FeedIconChangeType("VIEWING", 1);
        VIEWED = new FeedIconChangeType("VIEWED", 2);
        SENDING = new FeedIconChangeType("SENDING", 3);
        SENT = new FeedIconChangeType("SENT", 4);
        FAILED_TO_SEND = new FeedIconChangeType("FAILED_TO_SEND", 5);
        LOADING = new FeedIconChangeType("LOADING", 6);
        LOADED = new FeedIconChangeType("LOADED", 7);
        FAILED_TO_LOAD = new FeedIconChangeType("FAILED_TO_LOAD", 8);
        $VALUES = (new FeedIconChangeType[] {
            RECEIVED, VIEWING, VIEWED, SENDING, SENT, FAILED_TO_SEND, LOADING, LOADED, FAILED_TO_LOAD
        });
    }
}
