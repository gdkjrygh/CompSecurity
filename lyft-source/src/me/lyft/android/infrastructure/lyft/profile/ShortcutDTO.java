// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;

import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class ShortcutDTO
{

    public final String label;
    public final LocationDTO place;

    public ShortcutDTO(String s, LocationDTO locationdto)
    {
        label = s;
        place = locationdto;
    }

    public String getLabel()
    {
        return label;
    }

    public LocationDTO getPlace()
    {
        return place;
    }
}
