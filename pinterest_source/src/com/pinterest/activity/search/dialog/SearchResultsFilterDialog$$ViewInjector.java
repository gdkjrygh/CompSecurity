// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.dialog;


// Referenced classes of package com.pinterest.activity.search.dialog:
//            SearchResultsFilterDialog

public class 
{

    public static void inject(butterknife.lterDialog lterdialog, SearchResultsFilterDialog searchresultsfilterdialog, Object obj)
    {
        searchresultsfilterdialog._pins = lterdialog._pins(obj, 0x7f0f0191, "field '_pins'");
        searchresultsfilterdialog._yourPins = lterdialog._yourPins(obj, 0x7f0f0194, "field '_yourPins'");
        searchresultsfilterdialog._pinners = lterdialog._pinners(obj, 0x7f0f0192, "field '_pinners'");
        searchresultsfilterdialog._board = lterdialog._board(obj, 0x7f0f0193, "field '_board'");
        searchresultsfilterdialog._buyablePins = lterdialog._buyablePins(obj, 0x7f0f0195, "field '_buyablePins'");
    }

    public static void reset(SearchResultsFilterDialog searchresultsfilterdialog)
    {
        searchresultsfilterdialog._pins = null;
        searchresultsfilterdialog._yourPins = null;
        searchresultsfilterdialog._pinners = null;
        searchresultsfilterdialog._board = null;
        searchresultsfilterdialog._buyablePins = null;
    }

    public ()
    {
    }
}
