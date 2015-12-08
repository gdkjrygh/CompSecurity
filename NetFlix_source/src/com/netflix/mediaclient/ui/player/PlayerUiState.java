// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


public final class PlayerUiState extends Enum
{

    private static final PlayerUiState $VALUES[];
    public static final PlayerUiState Interrupter;
    public static final PlayerUiState Loading;
    public static final PlayerUiState Playing;
    public static final PlayerUiState PlayingWithTrickPlayOverlay;
    public static final PlayerUiState PostPlay;

    private PlayerUiState(String s, int i)
    {
        super(s, i);
    }

    public static PlayerUiState valueOf(String s)
    {
        return (PlayerUiState)Enum.valueOf(com/netflix/mediaclient/ui/player/PlayerUiState, s);
    }

    public static PlayerUiState[] values()
    {
        return (PlayerUiState[])$VALUES.clone();
    }

    static 
    {
        Loading = new PlayerUiState("Loading", 0);
        Playing = new PlayerUiState("Playing", 1);
        PlayingWithTrickPlayOverlay = new PlayerUiState("PlayingWithTrickPlayOverlay", 2);
        PostPlay = new PlayerUiState("PostPlay", 3);
        Interrupter = new PlayerUiState("Interrupter", 4);
        $VALUES = (new PlayerUiState[] {
            Loading, Playing, PlayingWithTrickPlayOverlay, PostPlay, Interrupter
        });
    }
}
