// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import me.lyft.android.common.Objects;

public class GoogleLatLngDTO
{

    private Double lat;
    private Double lng;

    public GoogleLatLngDTO(Double double1, Double double2)
    {
        lat = double1;
        lng = double2;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GoogleLatLngDTO)
        {
            if (Objects.equals(lat, ((GoogleLatLngDTO) (obj = (GoogleLatLngDTO)obj)).lat) && Objects.equals(lng, ((GoogleLatLngDTO) (obj)).lng))
            {
                return true;
            }
        }
        return false;
    }

    public Double getLat()
    {
        return lat;
    }

    public Double getLng()
    {
        return lng;
    }

    public void setLat(Double double1)
    {
        lat = double1;
    }

    public void setLng(Double double1)
    {
        lng = double1;
    }
}
