// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;

import com.tinder.model.Match;

public class EventNewMatch
{

    private Match mNewMatch;

    public EventNewMatch(Match match)
    {
        mNewMatch = match;
    }

    public Match getNewMatch()
    {
        return mNewMatch;
    }
}
