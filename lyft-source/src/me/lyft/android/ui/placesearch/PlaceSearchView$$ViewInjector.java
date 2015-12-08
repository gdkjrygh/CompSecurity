// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, PlaceSearchToolbar, PlaceSearchResultsView

public class 
    implements butterknife.View..ViewInjector
{

    public volatile void inject(butterknife.View..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PlaceSearchView)obj, obj1);
    }

    public void inject(butterknife.View..ViewInjector viewinjector, PlaceSearchView placesearchview, Object obj)
    {
        placesearchview.toolbar = (PlaceSearchToolbar)viewinjector.Toolbar((View)viewinjector.Toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        placesearchview.resultsView = (PlaceSearchResultsView)viewinjector.ResultsView((View)viewinjector.ResultsView(obj, 0x7f0d034b, "field 'resultsView'"), 0x7f0d034b, "field 'resultsView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PlaceSearchView)obj);
    }

    public void reset(PlaceSearchView placesearchview)
    {
        placesearchview.toolbar = null;
        placesearchview.resultsView = null;
    }

    public ()
    {
    }
}
