// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.TwitterException;
import twitter4j.URLEntity;

final class URLEntityJSONImpl
    implements URLEntity
{

    private static final long serialVersionUID = 0x102b94bf50a65174L;
    private String displayURL;
    private int end;
    private URL expandedURL;
    private int start;
    private URL url;

    URLEntityJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        start = -1;
        end = -1;
        init(jsonobject);
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        JSONArray jsonarray = jsonobject.getJSONArray("indices");
        start = jsonarray.getInt(0);
        end = jsonarray.getInt(1);
        boolean flag;
        try
        {
            url = new URL(jsonobject.getString("url"));
        }
        catch (MalformedURLException malformedurlexception1) { }
        flag = jsonobject.isNull("expanded_url");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        try
        {
            expandedURL = new URL(jsonobject.getString("expanded_url"));
        }
        catch (MalformedURLException malformedurlexception) { }
        if (!jsonobject.isNull("display_url"))
        {
            displayURL = jsonobject.getString("display_url");
        }
        return;
        jsonobject;
        throw new TwitterException(jsonobject);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (URLEntityJSONImpl)obj;
            if (end != ((URLEntityJSONImpl) (obj)).end)
            {
                return false;
            }
            if (start != ((URLEntityJSONImpl) (obj)).start)
            {
                return false;
            }
            if (displayURL == null ? ((URLEntityJSONImpl) (obj)).displayURL != null : !displayURL.equals(((URLEntityJSONImpl) (obj)).displayURL))
            {
                return false;
            }
            if (expandedURL == null ? ((URLEntityJSONImpl) (obj)).expandedURL != null : !expandedURL.equals(((URLEntityJSONImpl) (obj)).expandedURL))
            {
                return false;
            }
            if (url == null ? ((URLEntityJSONImpl) (obj)).url != null : !url.equals(((URLEntityJSONImpl) (obj)).url))
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
        int k = 0;
        int l = start;
        int i1 = end;
        int i;
        int j;
        if (url != null)
        {
            i = url.hashCode();
        } else
        {
            i = 0;
        }
        if (expandedURL != null)
        {
            j = expandedURL.hashCode();
        } else
        {
            j = 0;
        }
        if (displayURL != null)
        {
            k = displayURL.hashCode();
        }
        return (((l * 31 + i1) * 31 + i) * 31 + j) * 31 + k;
    }

    public String toString()
    {
        return "URLEntityJSONImpl{start=" + start + ", end=" + end + ", url=" + url + ", expandedURL=" + expandedURL + ", displayURL=" + displayURL + '}';
    }
}
