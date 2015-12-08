// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.infrastructure.googleplaces.GooglePlaceType;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlacesCategories

class PlaceType
{

    static final int $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[];

    static 
    {
        $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType = new int[GooglePlaceType.values().length];
        try
        {
            $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.BAR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.CAFE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.BUSINESS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.RESTAURANT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.TOP_DESTINATION.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.HOME.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.WORK.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$me$lyft$android$infrastructure$googleplaces$GooglePlaceType[GooglePlaceType.OTHER.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
