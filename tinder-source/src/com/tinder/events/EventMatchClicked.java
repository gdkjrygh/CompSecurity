// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;

import com.tinder.model.Match;

public class EventMatchClicked
{

    private Match mMatch;

    public EventMatchClicked(Match match)
    {
        mMatch = match;
    }

    public Match getMatch()
    {
        return mMatch;
    }
}
