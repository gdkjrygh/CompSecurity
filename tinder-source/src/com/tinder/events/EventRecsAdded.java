// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;

import java.util.List;

public class EventRecsAdded
{

    private List addedRecs;

    public EventRecsAdded(List list)
    {
        addedRecs = list;
    }

    public List getAddedRecs()
    {
        return addedRecs;
    }
}
