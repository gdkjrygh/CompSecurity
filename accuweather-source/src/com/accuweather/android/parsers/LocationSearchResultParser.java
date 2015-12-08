// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.location.DMA;
import com.accuweather.android.models.location.Details;
import com.accuweather.android.models.location.GeoPosition;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.models.location.Region;
import com.accuweather.android.models.location.TimeZone;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser

public class LocationSearchResultParser extends BaseJsonParser
{

    private static final String ADMINISTRATIVE_AREA_JSON_NAME = "AdministrativeArea";
    private static final String CANONICAL_LOCATION_KEY_JSON_NAME = "CanonicalLocationKey";
    private static final String CANONICAL_POSTAL_CODE_JSON_NAME = "CanonicalPostalCode";
    private static final String CODE_JSON_NAME = "Code";
    private static final String COUNTRY_JSON_NAME = "Country";
    private static final String DETAILS_JSON_NAME = "Details";
    private static final String DMA_JSON_NAME = "DMA";
    private static final String ENGLISH_NAME_JSON_NAME = "EnglishName";
    private static final String GEO_POSITION_JSON_NAME = "GeoPosition";
    private static final String GMT_OFFSET_JSON_NAME = "GmtOffset";
    private static final String ID_JSON_NAME = "ID";
    private static final String KEY_JSON_NAME = "Key";
    private static final String LATITUDE_JSON_NAME = "Latitude";
    private static final String LOCALIZED_NAME_JSON_NAME = "LocalizedName";
    private static final String LONGITUDE_JSON_NAME = "Longitude";
    private static final String NAME_JSON_NAME = "Name";
    private static final String PRIMARY_POSTAL_CODE_JSON_NAME = "PrimaryPostalCode";
    private static final String REGION_JSON_NAME = "Region";
    private static final String TIME_ZONE_JSON_NAME = "TimeZone";
    private static final String TYPE_JSON_NAME = "Type";
    private static final String VIDEO_CODE_JSON_NAME = "VideoCode";

    public LocationSearchResultParser()
    {
    }

    private Details parseDetails(JsonReader jsonreader)
        throws IOException
    {
        Details details = new Details();
        if (jsonreader.peek() == JsonToken.BEGIN_OBJECT)
        {
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (jsonreader.hasNext() && jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.skipValue();
                } else
                if (s.equals("Key"))
                {
                    details.setKey(jsonreader.nextString());
                } else
                if (s.equals("VideoCode"))
                {
                    details.setVideoCode(jsonreader.nextString());
                } else
                if (s.equals("DMA"))
                {
                    details.setDMA(parseDma(jsonreader));
                } else
                if (s.equals("CanonicalLocationKey"))
                {
                    details.setCanonicalLocationKey(jsonreader.nextString());
                } else
                if (s.equals("CanonicalPostalCode"))
                {
                    details.setCanonicalPostalCode(jsonreader.nextString());
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        }
        return details;
    }

    private DMA parseDma(JsonReader jsonreader)
        throws IOException
    {
        DMA dma = new DMA();
        if (jsonreader.peek() == JsonToken.BEGIN_OBJECT)
        {
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (jsonreader.hasNext() && jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.skipValue();
                } else
                if (s.equals("ID"))
                {
                    dma.setID(jsonreader.nextString());
                } else
                if (s.equals("EnglishName"))
                {
                    dma.setEnglishName(jsonreader.nextString());
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        }
        return dma;
    }

    private GeoPosition parseGeoPosition(JsonReader jsonreader)
        throws IOException
    {
        GeoPosition geoposition = new GeoPosition();
        if (jsonreader.peek() == JsonToken.BEGIN_OBJECT)
        {
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (jsonreader.hasNext() && jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.skipValue();
                } else
                if (s.equals("Latitude"))
                {
                    geoposition.setLatitude(Double.valueOf(jsonreader.nextDouble()));
                } else
                if (s.equals("Longitude"))
                {
                    geoposition.setLongitude(Double.valueOf(jsonreader.nextDouble()));
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        }
        return geoposition;
    }

    private Region parseRegion(JsonReader jsonreader)
        throws IOException
    {
        Region region = new Region();
        if (jsonreader.peek() == JsonToken.BEGIN_OBJECT)
        {
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (jsonreader.hasNext() && jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.skipValue();
                } else
                if (s.equals("ID"))
                {
                    region.setID(jsonreader.nextString());
                } else
                if (s.equals("LocalizedName"))
                {
                    region.setLocalizedName(jsonreader.nextString());
                } else
                if (s.equals("EnglishName"))
                {
                    region.setEnglishName(jsonreader.nextString());
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        }
        return region;
    }

    private TimeZone parseTimeZone(JsonReader jsonreader)
        throws IOException
    {
        TimeZone timezone = new TimeZone();
        if (jsonreader.peek() == JsonToken.BEGIN_OBJECT)
        {
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (jsonreader.hasNext() && jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.skipValue();
                } else
                if (s.equals("Code"))
                {
                    timezone.setCode(jsonreader.nextString());
                } else
                if (s.equals("Name"))
                {
                    timezone.setName(jsonreader.nextString());
                } else
                if (s.equals("GmtOffset"))
                {
                    timezone.setGmtOffset(jsonreader.nextDouble());
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        }
        return timezone;
    }

    public LocationSearchResult parse(JsonReader jsonreader)
        throws IOException
    {
        LocationSearchResult locationsearchresult = new LocationSearchResult();
        if (jsonreader.peek() == JsonToken.BEGIN_OBJECT)
        {
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (jsonreader.hasNext() && jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.skipValue();
                } else
                if (s.equals("Key"))
                {
                    locationsearchresult.setKey(jsonreader.nextString());
                } else
                if (s.equals("Type"))
                {
                    locationsearchresult.setType(jsonreader.nextString());
                } else
                if (s.equals("LocalizedName"))
                {
                    locationsearchresult.setLocalizedName(jsonreader.nextString());
                } else
                if (s.equals("EnglishName"))
                {
                    locationsearchresult.setEnglishName(jsonreader.nextString());
                } else
                if (s.equals("PrimaryPostalCode"))
                {
                    locationsearchresult.setPrimaryPostalCode(jsonreader.nextString());
                } else
                if (s.equals("Region"))
                {
                    locationsearchresult.setRegion(parseRegion(jsonreader));
                } else
                if (s.equals("Country"))
                {
                    locationsearchresult.setCountry(parseRegion(jsonreader));
                } else
                if (s.equals("AdministrativeArea"))
                {
                    locationsearchresult.setAdministrativeArea(parseRegion(jsonreader));
                } else
                if (s.equals("TimeZone"))
                {
                    locationsearchresult.setTimeZone(parseTimeZone(jsonreader));
                } else
                if (s.equals("GeoPosition"))
                {
                    locationsearchresult.setGeoPosition(parseGeoPosition(jsonreader));
                } else
                if (s.equals("Details"))
                {
                    locationsearchresult.setDetails(parseDetails(jsonreader));
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        }
        return locationsearchresult;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }
}
