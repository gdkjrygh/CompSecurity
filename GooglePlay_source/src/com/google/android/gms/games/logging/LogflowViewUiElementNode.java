// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;


// Referenced classes of package com.google.android.gms.games.logging:
//            LogflowGamesUiElementNode, GamesLogflowLogger

public final class LogflowViewUiElementNode
    implements LogflowGamesUiElementNode
{

    private final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement mFauxParentUiElement;
    private final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement mUiElement;

    private LogflowViewUiElementNode(int i)
    {
        mUiElement = GamesLogflowLogger.obtainPlaylogGamesUiElement(i);
        mFauxParentUiElement = null;
    }

    public LogflowViewUiElementNode(int i, byte byte0)
    {
        this(i);
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getFauxParentLogflowUiElement()
    {
        return null;
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getPlaylogGamesUiElement()
    {
        return mUiElement;
    }

    public final boolean isLeaf()
    {
        return false;
    }
}
