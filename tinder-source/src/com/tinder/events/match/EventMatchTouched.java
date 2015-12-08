// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.match;

import com.tinder.model.Match;

public class EventMatchTouched
{

    private Match match;

    public EventMatchTouched(Match match1)
    {
        match = match1;
    }

    public Match getMatch()
    {
        return match;
    }
}
