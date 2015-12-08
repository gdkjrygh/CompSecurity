// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.queue;


public final class  extends Enum
{

    private static final SERVER_ERROR $VALUES[];
    public static final SERVER_ERROR CONFLICT;
    public static final SERVER_ERROR SERVER_ERROR;
    public static final SERVER_ERROR UNSUPPORTED_MEDIA_TPYE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/cosmos/player/v2/queue/QueueManager$QueueObserver$ErrorCause, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONFLICT = new <init>("CONFLICT", 0);
        UNSUPPORTED_MEDIA_TPYE = new <init>("UNSUPPORTED_MEDIA_TPYE", 1);
        SERVER_ERROR = new <init>("SERVER_ERROR", 2);
        $VALUES = (new .VALUES[] {
            CONFLICT, UNSUPPORTED_MEDIA_TPYE, SERVER_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
