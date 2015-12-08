// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.MediaEntity;
import twitter4j.TwitterException;
import twitter4j.internal.util.z_T4JInternalParseUtil;

public class MediaEntityJSONImpl
    implements MediaEntity
{
    static class Size
        implements twitter4j.MediaEntity.Size
    {

        private static final long serialVersionUID = 0x787c23aefe30ba2dL;
        int height;
        int resize;
        int width;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof Size))
                {
                    return false;
                }
                obj = (Size)obj;
                if (height != ((Size) (obj)).height)
                {
                    return false;
                }
                if (resize != ((Size) (obj)).resize)
                {
                    return false;
                }
                if (width != ((Size) (obj)).width)
                {
                    return false;
                }
            }
            return true;
        }

        public int getHeight()
        {
            return height;
        }

        public int getResize()
        {
            return resize;
        }

        public int getWidth()
        {
            return width;
        }

        public int hashCode()
        {
            return (width * 31 + height) * 31 + resize;
        }

        public String toString()
        {
            return "Size{width=" + width + ", height=" + height + ", resize=" + resize + '}';
        }

        Size(JSONObject jsonobject)
            throws JSONException
        {
            width = jsonobject.getInt("w");
            height = jsonobject.getInt("h");
            int i;
            if ("fit".equals(jsonobject.getString("resize")))
            {
                i = 100;
            } else
            {
                i = 101;
            }
            resize = i;
        }
    }


    private static final long serialVersionUID = 0xb7e28b202efe003fL;
    private String displayURL;
    private int end;
    private URL expandedURL;
    private long id;
    private URL mediaURL;
    private URL mediaURLHttps;
    private Map sizes;
    private int start;
    private URL url;

    public MediaEntityJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        start = -1;
        end = -1;
        JSONArray jsonarray = jsonobject.getJSONArray("indices");
        start = jsonarray.getInt(0);
        end = jsonarray.getInt(1);
        id = z_T4JInternalParseUtil.getLong("id", jsonobject);
        boolean flag;
        try
        {
            url = new URL(jsonobject.getString("url"));
        }
        catch (MalformedURLException malformedurlexception3) { }
        flag = jsonobject.isNull("expanded_url");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        try
        {
            expandedURL = new URL(jsonobject.getString("expanded_url"));
        }
        catch (MalformedURLException malformedurlexception2) { }
        flag = jsonobject.isNull("media_url");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        try
        {
            mediaURL = new URL(jsonobject.getString("media_url"));
        }
        catch (MalformedURLException malformedurlexception1) { }
        flag = jsonobject.isNull("media_url_https");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        try
        {
            mediaURLHttps = new URL(jsonobject.getString("media_url_https"));
        }
        catch (MalformedURLException malformedurlexception) { }
        if (!jsonobject.isNull("display_url"))
        {
            displayURL = jsonobject.getString("display_url");
        }
        jsonobject = jsonobject.getJSONObject("sizes");
        sizes = new HashMap(4);
        sizes.put(twitter4j.MediaEntity.Size.LARGE, new Size(jsonobject.getJSONObject("large")));
        sizes.put(twitter4j.MediaEntity.Size.MEDIUM, new Size(jsonobject.getJSONObject("medium")));
        sizes.put(twitter4j.MediaEntity.Size.SMALL, new Size(jsonobject.getJSONObject("small")));
        sizes.put(twitter4j.MediaEntity.Size.THUMB, new Size(jsonobject.getJSONObject("thumb")));
        return;
        jsonobject;
        throw new TwitterException(jsonobject);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MediaEntityJSONImpl))
            {
                return false;
            }
            obj = (MediaEntityJSONImpl)obj;
            if (id != ((MediaEntityJSONImpl) (obj)).id)
            {
                return false;
            }
        }
        return true;
    }

    public String getDisplayURL()
    {
        return displayURL;
    }

    public int getEnd()
    {
        return end;
    }

    public URL getExpandedURL()
    {
        return expandedURL;
    }

    public long getId()
    {
        return id;
    }

    public URL getMediaURL()
    {
        return mediaURL;
    }

    public URL getMediaURLHttps()
    {
        return mediaURLHttps;
    }

    public Map getSizes()
    {
        return sizes;
    }

    public int getStart()
    {
        return start;
    }

    public URL getURL()
    {
        return url;
    }

    public int hashCode()
    {
        return (int)(id ^ id >>> 32);
    }

    public String toString()
    {
        return "MediaEntityJSONImpl{id=" + id + ", start=" + start + ", end=" + end + ", url=" + url + ", mediaURL=" + mediaURL + ", mediaURLHttps=" + mediaURLHttps + ", expandedURL=" + expandedURL + ", displayURL='" + displayURL + '\'' + ", sizes=" + sizes + '}';
    }
}
