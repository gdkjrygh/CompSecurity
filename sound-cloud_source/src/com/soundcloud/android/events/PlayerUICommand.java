// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


public final class PlayerUICommand
{

    private static final int COLLAPSE_PLAYER = 1;
    private static final int EXPAND_PLAYER = 0;
    private static final int SHOW_PLAYER = 2;
    private final int kind;

    private PlayerUICommand(int i)
    {
        kind = i;
    }

    public static PlayerUICommand collapsePlayer()
    {
        return new PlayerUICommand(1);
    }

    public static PlayerUICommand expandPlayer()
    {
        return new PlayerUICommand(0);
    }

    public static PlayerUICommand showPlayer()
    {
        return new PlayerUICommand(2);
    }

    public final boolean isCollapse()
    {
        return kind == 1;
    }

    public final boolean isExpand()
    {
        return kind == 0;
    }

    public final boolean isShow()
    {
        return kind == 2;
    }

    public final String toString()
    {
        return (new StringBuilder("player UI command: ")).append(kind).toString();
    }
}
