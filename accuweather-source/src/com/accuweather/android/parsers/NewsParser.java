// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.news.NewsMediaContentImage;
import com.accuweather.android.models.news.NewsMediaThumbnail;
import com.accuweather.android.models.news.NewsResult;
import com.accuweather.android.models.news.NewsResults;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser

public class NewsParser extends BaseJsonParser
{

    private static final String CHANNEL_OBJECT_JSON_NAME = "Channel";
    private static final String DESCRIPTION_JSON_NAME = "Description";
    private static final String ITEMS_ARRAY_JSON_NAME = "Items";
    private static final String LAST_UPDATED_JSON_NAME = "lastUpdated";
    private static final String LINK_JSON_NAME = "Link";
    private static final String MEDIA_CONTENT_IMAGE_JSON_NAME = "media_content";
    private static final String MEDIA_THUMBNAILS_JSON_NAME = "media_thumbnails";
    private static final String PUB_DATE_JSON_NAME = "pubDate";
    private static final String THUMBNAIL_HEIGHT_JSON_NAME = "Height";
    private static final String THUMBNAIL_URL_JSON_NAME = "Url";
    private static final String THUMBNAIL_WIDTH_JSON_NAME = "Width";
    private static final String TITLE_JSON_NAME = "Title";

    public NewsParser()
    {
    }

    private List parseMediaContentImage(JsonReader jsonreader)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        NewsMediaContentImage newsmediacontentimage;
        for (; jsonreader.hasNext(); arraylist.add(newsmediacontentimage))
        {
            newsmediacontentimage = new NewsMediaContentImage();
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (s.equals("Url"))
                {
                    newsmediacontentimage.setUrl(jsonreader.nextString());
                } else
                if (s.equals("Height"))
                {
                    newsmediacontentimage.setHeight(jsonreader.nextInt());
                } else
                if (s.equals("Width"))
                {
                    newsmediacontentimage.setWidth(jsonreader.nextInt());
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        }

        jsonreader.endArray();
        return arraylist;
    }

    private List parseThumbnail(JsonReader jsonreader)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        NewsMediaThumbnail newsmediathumbnail;
        for (; jsonreader.hasNext(); arraylist.add(newsmediathumbnail))
        {
            newsmediathumbnail = new NewsMediaThumbnail();
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (s.equals("Url"))
                {
                    newsmediathumbnail.setUrl(jsonreader.nextString());
                } else
                if (s.equals("Height"))
                {
                    newsmediathumbnail.setHeight(jsonreader.nextInt());
                } else
                if (s.equals("Width"))
                {
                    newsmediathumbnail.setWidth(jsonreader.nextInt());
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        }

        jsonreader.endArray();
        return arraylist;
    }

    public NewsResults parse(JsonReader jsonreader)
        throws IOException
    {
        NewsResults newsresults;
        newsresults = new NewsResults();
        jsonreader.beginObject();
        do
        {
label0:
            {
                do
                {
                    if (!jsonreader.hasNext())
                    {
                        break label0;
                    }
                    Object obj = jsonreader.nextName();
                    boolean flag;
                    if (jsonreader.peek() == JsonToken.NULL)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } while (!((String) (obj)).equals("Channel") || flag);
                jsonreader.beginObject();
                obj = newsresults;
                do
                {
                    newsresults = ((NewsResults) (obj));
                    if (!jsonreader.hasNext())
                    {
                        break;
                    }
                    if (jsonreader.nextName().equals("Items"))
                    {
                        obj = parseNews(jsonreader, ((NewsResults) (obj)));
                    } else
                    {
                        jsonreader.skipValue();
                    }
                } while (true);
            }
        } while (true);
        jsonreader.endArray();
        jsonreader.endObject();
        return newsresults;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }

    public NewsResults parseNews(JsonReader jsonreader, NewsResults newsresults)
        throws IOException
    {
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); jsonreader.endObject())
        {
            NewsResult newsresult = new NewsResult();
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (s.equals("Title"))
                {
                    newsresult.setTitle(jsonreader.nextString());
                } else
                if (s.equals("Description"))
                {
                    newsresult.setDescription(jsonreader.nextString());
                } else
                if (s.equals("Link"))
                {
                    newsresult.setLink(jsonreader.nextString());
                } else
                if (s.equals("pubDate"))
                {
                    newsresult.setPubDate(jsonreader.nextString());
                } else
                if (s.equals("lastUpdated"))
                {
                    newsresult.setLastUpdated(jsonreader.nextString());
                } else
                if (s.equals("media_content"))
                {
                    newsresult.setMediaContent(parseMediaContentImage(jsonreader));
                } else
                if (s.equals("media_thumbnails"))
                {
                    newsresult.setMediaThumbnails(parseThumbnail(jsonreader));
                } else
                {
                    jsonreader.skipValue();
                }
            }
            newsresults.add(newsresult);
        }

        return newsresults;
    }
}
