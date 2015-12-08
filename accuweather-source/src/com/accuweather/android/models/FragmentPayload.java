// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models:
//            ForecastFragmentModel, HourlyFragmentModel

public class FragmentPayload
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private ForecastFragmentModel ffm;
    private HourlyFragmentModel hfm;
    private String locationKey;

    public FragmentPayload()
    {
    }

    public ForecastFragmentModel getForecastFragmentModel()
    {
        return ffm;
    }

    public HourlyFragmentModel getHourlyFragmentModel()
    {
        return hfm;
    }

    public String getLocationKey()
    {
        return locationKey;
    }

    public void setForecastFragmentModel(ForecastFragmentModel forecastfragmentmodel)
    {
        ffm = forecastfragmentmodel;
    }

    public void setHourlyFragmentModel(HourlyFragmentModel hourlyfragmentmodel)
    {
        hfm = hourlyfragmentmodel;
    }

    public void setLocationKey(String s)
    {
        locationKey = s;
    }
}
