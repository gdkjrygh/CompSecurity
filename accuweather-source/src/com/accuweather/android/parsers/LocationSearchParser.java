// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.location.LocationSearch;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser, LocationSearchResultParser

public class LocationSearchParser extends BaseJsonParser
{

    private static LocationSearchResultParser locationSearchResultParser = new LocationSearchResultParser();

    public LocationSearchParser()
    {
    }

    public LocationSearch parse(JsonReader jsonreader)
        throws IOException
    {
        LocationSearch locationsearch = new LocationSearch();
        if (jsonreader.peek() == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); locationsearch.add(locationSearchResultParser.parse(jsonreader))) { }
            jsonreader.endArray();
        }
        return locationsearch;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }

}
