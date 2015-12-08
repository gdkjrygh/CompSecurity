// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;


public final class MediaAuthStatus extends Enum
{

    private static final MediaAuthStatus $VALUES[];
    public static final MediaAuthStatus ABORT_UNKNOWN;
    public static final MediaAuthStatus AUTHORIZED;
    public static final MediaAuthStatus CANCELED_BY_USER;
    public static final MediaAuthStatus FINISHED;
    public static final MediaAuthStatus NOT_AUTHORIZED;
    public static final MediaAuthStatus NOT_STARTED;
    public static final MediaAuthStatus PENDING;
    public static final MediaAuthStatus TIMED_OUT;

    private MediaAuthStatus(String s, int i)
    {
        super(s, i);
    }

    public static MediaAuthStatus valueOf(String s)
    {
        return (MediaAuthStatus)Enum.valueOf(com/google/android/libraries/cast/companionlibrary/cast/player/MediaAuthStatus, s);
    }

    public static MediaAuthStatus[] values()
    {
        return (MediaAuthStatus[])$VALUES.clone();
    }

    static 
    {
        NOT_STARTED = new MediaAuthStatus("NOT_STARTED", 0);
        PENDING = new MediaAuthStatus("PENDING", 1);
        FINISHED = new MediaAuthStatus("FINISHED", 2);
        AUTHORIZED = new MediaAuthStatus("AUTHORIZED", 3);
        NOT_AUTHORIZED = new MediaAuthStatus("NOT_AUTHORIZED", 4);
        TIMED_OUT = new MediaAuthStatus("TIMED_OUT", 5);
        CANCELED_BY_USER = new MediaAuthStatus("CANCELED_BY_USER", 6);
        ABORT_UNKNOWN = new MediaAuthStatus("ABORT_UNKNOWN", 7);
        $VALUES = (new MediaAuthStatus[] {
            NOT_STARTED, PENDING, FINISHED, AUTHORIZED, NOT_AUTHORIZED, TIMED_OUT, CANCELED_BY_USER, ABORT_UNKNOWN
        });
    }
}
