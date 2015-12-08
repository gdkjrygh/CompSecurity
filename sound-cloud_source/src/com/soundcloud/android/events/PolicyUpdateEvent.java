// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import java.util.List;

public class PolicyUpdateEvent
{

    private final List updatedTracks;

    private PolicyUpdateEvent(List list)
    {
        updatedTracks = list;
    }

    public static PolicyUpdateEvent success(List list)
    {
        return new PolicyUpdateEvent(list);
    }

    public List getTracks()
    {
        return updatedTracks;
    }
}
