// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class DestinyLocationRequestDTO
{

    public final String appInfoRevision;
    public final LocationDTO destination;

    public DestinyLocationRequestDTO(LocationDTO locationdto, String s)
    {
        destination = locationdto;
        appInfoRevision = s;
    }
}
