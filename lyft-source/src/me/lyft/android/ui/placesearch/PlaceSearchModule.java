// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.res.Resources;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.application.topdestinations.ITopDestinationProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.placesearch.IPlaceSearchService;
import me.lyft.android.infrastructure.placesearch.PlaceSearchService;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchPresenter, IPlaceSearchPresenter

public class PlaceSearchModule
{

    public PlaceSearchModule()
    {
    }

    IPlaceSearchPresenter providePlaceSearchPresenter(IGooglePlaceService igoogleplaceservice, ILocationService ilocationservice, IShortcutService ishortcutservice, ITopDestinationProvider itopdestinationprovider, IPlaceSearchService iplacesearchservice, AppFlow appflow, Resources resources, 
            IConstantsProvider iconstantsprovider)
    {
        return new PlaceSearchPresenter(igoogleplaceservice, ilocationservice, ishortcutservice, itopdestinationprovider, iplacesearchservice, appflow, resources, iconstantsprovider);
    }

    IPlaceSearchService providePlaceSearchService(ILyftApi ilyftapi, ILocationService ilocationservice)
    {
        return new PlaceSearchService(ilyftapi, ilocationservice);
    }
}
