// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import com.accuweather.android.utilities.ConversionUtilities;
import java.util.Locale;

// Referenced classes of package com.accuweather.android.maps:
//            MapOverlayMetadata

public class MapUrlBuilder
{

    private static final int DEFAULT_OPACITY = 100;
    private static final String MAP_URL = "http://vortex.accuweather.com/widget/googlemaps/androidv3/maps_v4.asp";
    private String gmtOffset;
    private Double lat;
    private Locale locale;
    private Double lon;
    private int overlayOpacity;
    private String overlayType;
    private boolean showZoomControl;

    public MapUrlBuilder()
    {
        showZoomControl = false;
        overlayType = MapOverlayMetadata.NEXRAD.getOverlayType();
        gmtOffset = "";
        overlayOpacity = 100;
    }

    private Double getCoordinateToTwoDecimals(Double double1)
    {
        return Double.valueOf(ConversionUtilities.toTwoDecimals(double1.doubleValue()));
    }

    public String buildMapUrl()
    {
        if (lat == null)
        {
            throw new IllegalStateException("The lat must be set.");
        }
        if (lon == null)
        {
            throw new IllegalStateException("The lon must be set.");
        }
        if (locale == null)
        {
            locale = Locale.getDefault();
        }
        return (new StringBuilder()).append("http://vortex.accuweather.com/widget/googlemaps/androidv3/maps_v4.asp?lat=").append(getCoordinateToTwoDecimals(lat)).append("&lon=").append(getCoordinateToTwoDecimals(lon)).append("&zoomControl=").append(showZoomControl).append("&language=").append(locale.getLanguage()).append("&overlayType=").append(overlayType).append("&gmtOffset=").append(gmtOffset).append("&overlayOpacity=").append(overlayOpacity).toString();
    }

    public MapUrlBuilder gmtOffset(String s)
    {
        gmtOffset = s;
        return this;
    }

    public MapUrlBuilder lat(Double double1)
    {
        lat = double1;
        return this;
    }

    public MapUrlBuilder locale(Locale locale1)
    {
        locale = locale1;
        return this;
    }

    public MapUrlBuilder lon(Double double1)
    {
        lon = double1;
        return this;
    }

    public MapUrlBuilder overlayOpacity(int i)
    {
        overlayOpacity = i;
        return this;
    }

    public MapUrlBuilder overlayType(String s)
    {
        overlayType = s;
        return this;
    }

    public MapUrlBuilder showZoomControl(boolean flag)
    {
        showZoomControl = flag;
        return this;
    }
}
