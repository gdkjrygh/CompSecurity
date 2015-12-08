// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player.notifications;


public final class PlayerNotificationType extends Enum
{

    public static final PlayerNotificationType a;
    public static final PlayerNotificationType b;
    public static final PlayerNotificationType c;
    private static final PlayerNotificationType d[];

    private PlayerNotificationType(String s, int i)
    {
        super(s, i);
    }

    public static PlayerNotificationType valueOf(String s)
    {
        return (PlayerNotificationType)Enum.valueOf(com/spotify/mobile/android/spotlets/player/notifications/PlayerNotificationType, s);
    }

    public static PlayerNotificationType[] values()
    {
        return (PlayerNotificationType[])d.clone();
    }

    static 
    {
        a = new PlayerNotificationType("DONE", 0);
        b = new PlayerNotificationType("IMPROVING_RADIO", 1);
        c = new PlayerNotificationType("LOADING", 2);
        d = (new PlayerNotificationType[] {
            a, b, c
        });
    }
}
