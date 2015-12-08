// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MapOverlayMetadata extends Enum
{

    private static final MapOverlayMetadata $VALUES[];
    public static final MapOverlayMetadata CANRAD;
    public static final MapOverlayMetadata JAPANRAD;
    public static final MapOverlayMetadata NEXRAD;
    public static final MapOverlayMetadata NORDICRAD;
    private static final Set NORDIC_COUNTRY_CODES = new HashSet(Arrays.asList(new String[] {
        "NO", "SE", "FI", "DK", "EE", "LV"
    }));
    public static final MapOverlayMetadata NW_EURORAD;
    private static final Set NW_EURORAD_COUNTRY_CODES = new HashSet(Arrays.asList(new String[] {
        "GB", "IE", "DE", "FR", "BE", "NL", "IT", "CZ", "AT", "CH", 
        "IM", "LU", "LI"
    }));
    public static final MapOverlayMetadata US_SATELLITE;
    public static final MapOverlayMetadata WORLD_SATELLITE;
    private String jsonUrl;
    private String overlayType;

    private MapOverlayMetadata(String s, int i, String s1, String s2)
    {
        super(s, i);
        overlayType = s1;
        jsonUrl = (new StringBuilder()).append("http://vortex.accuweather.com/tiles/client/accuwxandroidv3/?p=").append(s2).append("&r=json").toString();
    }

    public static List getAvailableOverlayTypesForCountry(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (s == null)
        {
            arraylist.add(WORLD_SATELLITE);
            return arraylist;
        }
        if ("US".equalsIgnoreCase(s))
        {
            arraylist.add(NEXRAD);
            arraylist.add(US_SATELLITE);
            return arraylist;
        }
        if (isNwEuroRadCountry(s))
        {
            arraylist.add(NW_EURORAD);
            arraylist.add(WORLD_SATELLITE);
            return arraylist;
        }
        if (isNordicRadCountry(s))
        {
            arraylist.add(NORDICRAD);
            arraylist.add(WORLD_SATELLITE);
            return arraylist;
        }
        if ("JP".equalsIgnoreCase(s))
        {
            arraylist.add(JAPANRAD);
            arraylist.add(WORLD_SATELLITE);
            return arraylist;
        }
        if ("CA".equalsIgnoreCase(s))
        {
            arraylist.add(CANRAD);
            arraylist.add(WORLD_SATELLITE);
            return arraylist;
        } else
        {
            arraylist.add(WORLD_SATELLITE);
            return arraylist;
        }
    }

    public static String getBestOverlayTypeForCountry(String s)
    {
        return ((MapOverlayMetadata)getAvailableOverlayTypesForCountry(s).get(0)).getOverlayType();
    }

    public static MapOverlayMetadata getOverlayMetadata(String s)
    {
        MapOverlayMetadata amapoverlaymetadata[] = values();
        for (int i = 0; i < amapoverlaymetadata.length; i++)
        {
            if (amapoverlaymetadata[i].getOverlayType().equals(s))
            {
                return amapoverlaymetadata[i];
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("overlayType ").append(s).append(" is not valid.").toString());
    }

    public static String getRadarDisplayType(String s)
    {
        s = getAvailableOverlayTypesForCountry(s);
        if (s.size() <= 1)
        {
            return "";
        } else
        {
            return ((MapOverlayMetadata)s.get(0)).getOverlayType();
        }
    }

    public static String getSatelliteDisplayType(String s)
    {
        if ("US".equals(s))
        {
            return US_SATELLITE.getOverlayType();
        } else
        {
            return WORLD_SATELLITE.getOverlayType();
        }
    }

    private static boolean isNordicRadCountry(String s)
    {
        return NORDIC_COUNTRY_CODES.contains(s.toUpperCase());
    }

    private static boolean isNwEuroRadCountry(String s)
    {
        return NW_EURORAD_COUNTRY_CODES.contains(s.toUpperCase());
    }

    public static boolean isRadarAvailable(String s)
    {
        return !getRadarDisplayType(s).equals("");
    }

    public static MapOverlayMetadata valueOf(String s)
    {
        return (MapOverlayMetadata)Enum.valueOf(com/accuweather/android/maps/MapOverlayMetadata, s);
    }

    public static MapOverlayMetadata[] values()
    {
        return (MapOverlayMetadata[])$VALUES.clone();
    }

    public String getJsonUrl()
    {
        return jsonUrl;
    }

    public String getOverlayType()
    {
        return overlayType;
    }

    static 
    {
        NEXRAD = new MapOverlayMetadata("NEXRAD", 0, "nexrad", "l2radar");
        CANRAD = new MapOverlayMetadata("CANRAD", 1, "canrad", "canrad");
        NW_EURORAD = new MapOverlayMetadata("NW_EURORAD", 2, "nweurorad", "nweurorad");
        NORDICRAD = new MapOverlayMetadata("NORDICRAD", 3, "nordicrad", "nordicrad");
        JAPANRAD = new MapOverlayMetadata("JAPANRAD", 4, "japanrad", "japanrad");
        US_SATELLITE = new MapOverlayMetadata("US_SATELLITE", 5, "us_satellite", "satconus");
        WORLD_SATELLITE = new MapOverlayMetadata("WORLD_SATELLITE", 6, "satellite", "worldsat");
        $VALUES = (new MapOverlayMetadata[] {
            NEXRAD, CANRAD, NW_EURORAD, NORDICRAD, JAPANRAD, US_SATELLITE, WORLD_SATELLITE
        });
    }
}
