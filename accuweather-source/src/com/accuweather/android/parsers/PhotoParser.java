// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.photos.Category;
import com.accuweather.android.models.photos.Links;
import com.accuweather.android.models.photos.PhotoResult;
import com.accuweather.android.models.photos.PhotoResults;
import com.accuweather.android.models.photos.Tags;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser

public class PhotoParser extends BaseJsonParser
{

    private static final String CATEGORY_ID_JSON_NAME = "Id";
    private static final String CATEGORY_PRIORITY_JSON_NAME = "Priority";
    private static final String CATEGORY_REQUIRED_JSON_NAME = "Required";
    private static final String CATEGORY_TYPE_JSON_NAME = "Type";
    private static final String COUNTRY_CODE_JSON_NAME = "CountryCode";
    private static final String DATE_TAKEN_JSON_NAME = "DateTaken";
    private static final String DESCRIPTION_JSON_NAME = "Description";
    private static final String ID_JSON_NAME = "Id";
    private static final String IS_DEFAULT_JSON_NAME = "IsDefault";
    private static final String LANDSCAPE_LINK_JSON_NAME = "LandscapeLink";
    private static final String LINKS_HEIGHT_JSON_NAME = "Height";
    private static final String LINKS_JSON_NAME = "Links";
    private static final String LINKS_SIZE_JSON_NAME = "size";
    private static final String LINKS_URL_JSON_NAME = "Url";
    private static final String LINKS_WIDTH_JSON_NAME = "Width";
    private static final String LOCATION_KEY_JSON_NAME = "LocationKey";
    private static final String PORTRAIT_LINK_JSON_NAME = "PortraitLink";
    private static final String SOURCE_JSON_NAME = "Source";
    private static final String TAGS_CATEGORY_JSON_NAME = "Category";
    private static final String TAGS_DESCRIPTION_JSON_NAME = "Description";
    private static final String TAGS_ID_JSON_NAME = "Id";
    private static final String TAGS_JSON_NAME = "Tags";

    public PhotoParser()
    {
    }

    private Category parseCategory(JsonReader jsonreader)
        throws IOException
    {
        Category category = new Category();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            String s = jsonreader.nextName();
            if (s.equals("Id"))
            {
                category.setId(jsonreader.nextString());
            } else
            if (s.equals("Type"))
            {
                category.setType(jsonreader.nextString());
            } else
            if (s.equals("Required"))
            {
                category.setRequired(jsonreader.nextBoolean());
            } else
            if (s.equals("Priority"))
            {
                category.setPriority(Integer.valueOf(jsonreader.nextInt()));
            } else
            {
                jsonreader.skipValue();
            }
        }
        jsonreader.endObject();
        return category;
    }

    private Links parseLinks(JsonReader jsonreader)
        throws IOException
    {
        Links links = new Links();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            String s = jsonreader.nextName();
            if (s.equals("Url"))
            {
                links.setUrl(jsonreader.nextString());
            } else
            if (s.equals("Height"))
            {
                links.setHeight(Double.valueOf(jsonreader.nextDouble()));
            } else
            if (s.equals("Width"))
            {
                links.setWidth(Double.valueOf(jsonreader.nextDouble()));
            } else
            if (s.equals("size"))
            {
                links.setSize(Double.valueOf(jsonreader.nextDouble()));
            } else
            {
                jsonreader.skipValue();
            }
        }
        jsonreader.endObject();
        return links;
    }

    private List parseListLinks(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(parseLinks(jsonreader))) { }
        jsonreader.endArray();
        return arraylist;
    }

    private List parseListTags(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(parseTags(jsonreader))) { }
        jsonreader.endArray();
        return arraylist;
    }

    private PhotoResult parsePhoto(JsonReader jsonreader)
        throws IOException
    {
        PhotoResult photoresult = new PhotoResult();
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
                if (s.equals("Id"))
                {
                    photoresult.setId(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("LocationKey"))
                {
                    photoresult.setLocationKey(jsonreader.nextString());
                } else
                if (s.equals("CountryCode"))
                {
                    photoresult.setCountryCode(jsonreader.nextString());
                } else
                if (s.equals("IsDefault"))
                {
                    photoresult.setIsDefault(jsonreader.nextBoolean());
                } else
                if (s.equals("DateTaken"))
                {
                    photoresult.setDateTaken(jsonreader.nextString());
                } else
                if (s.equals("Source"))
                {
                    photoresult.setSource(jsonreader.nextString());
                } else
                if (s.equals("Description"))
                {
                    photoresult.setDescription(jsonreader.nextString());
                } else
                if (s.equals("Tags"))
                {
                    photoresult.setTags(parseListTags(jsonreader));
                } else
                if (s.equals("Links"))
                {
                    photoresult.setLinks(parseListLinks(jsonreader));
                } else
                if (s.equals("PortraitLink"))
                {
                    photoresult.setPortraitLink(jsonreader.nextString());
                } else
                if (s.equals("LandscapeLink"))
                {
                    photoresult.setLandscapeLink(jsonreader.nextString());
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return photoresult;
        }
        return photoresult;
    }

    private Tags parseTags(JsonReader jsonreader)
        throws IOException
    {
        Tags tags = new Tags();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            String s = jsonreader.nextName();
            if (s.equals("Id"))
            {
                tags.setId(jsonreader.nextString());
            } else
            if (s.equals("Description"))
            {
                tags.setDescription(jsonreader.nextString());
            } else
            if (s.equals("Category"))
            {
                tags.setCategory(parseCategory(jsonreader));
            } else
            {
                jsonreader.skipValue();
            }
        }
        jsonreader.endObject();
        return tags;
    }

    public PhotoResults parse(JsonReader jsonreader)
        throws IOException
    {
        PhotoResults photoresults = new PhotoResults();
        if (jsonreader.peek() == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); photoresults.add(parsePhoto(jsonreader))) { }
            jsonreader.endArray();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return photoresults;
        }
        return photoresults;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }
}
