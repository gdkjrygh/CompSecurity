// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place;

import com.pinterest.api.model.Place;

public class PlaceSelectedEvent
{

    private Place selectedPlace;

    public PlaceSelectedEvent(Place place)
    {
        selectedPlace = place;
    }

    public Place getSelectedPlace()
    {
        return selectedPlace;
    }
}
