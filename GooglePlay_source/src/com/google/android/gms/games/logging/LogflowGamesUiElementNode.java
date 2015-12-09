// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;


public interface LogflowGamesUiElementNode
{

    public abstract com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getFauxParentLogflowUiElement();

    public abstract com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getPlaylogGamesUiElement();

    public abstract boolean isLeaf();
}
