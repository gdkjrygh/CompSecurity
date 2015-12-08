// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.faresplit;

import java.util.List;

public class FareSplitInviteRequestDTO
{

    public final List contributors;
    public final String rideId;

    public FareSplitInviteRequestDTO(String s, List list)
    {
        rideId = s;
        contributors = list;
    }
}
