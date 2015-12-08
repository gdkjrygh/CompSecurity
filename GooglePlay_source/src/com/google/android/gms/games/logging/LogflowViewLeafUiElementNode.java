// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;


// Referenced classes of package com.google.android.gms.games.logging:
//            LogflowGamesUiElementNode, GamesLogflowLogger

public final class LogflowViewLeafUiElementNode
    implements LogflowGamesUiElementNode
{

    private final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement mFauxParentUiElement;
    private final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement mUiElement;

    public LogflowViewLeafUiElementNode(int i)
    {
        this(i, null);
    }

    public LogflowViewLeafUiElementNode(int i, com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement)
    {
        mUiElement = GamesLogflowLogger.obtainPlaylogGamesUiElement(i);
        mFauxParentUiElement = playloggamesuielement;
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getFauxParentLogflowUiElement()
    {
        return mFauxParentUiElement;
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getPlaylogGamesUiElement()
    {
        return mUiElement;
    }

    public final boolean isLeaf()
    {
        return true;
    }
}
