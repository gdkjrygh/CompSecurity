// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            EntityIndex

final class URLEntityJSONImpl extends EntityIndex
    implements URLEntity
{

    private static final long serialVersionUID = 0x83d0a36f60fb8ed0L;
    private String displayURL;
    private String expandedURL;
    private String url;

    URLEntityJSONImpl()
    {
    }

    URLEntityJSONImpl(int i, int j, String s, String s1, String s2)
    {
        setStart(i);
        setEnd(j);
        url = s;
        expandedURL = s1;
        displayURL = s2;
    }

    URLEntityJSONImpl(JSONObject jsonobject)
    {
        init(jsonobject);
    }

    private void init(JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.getJSONArray("indices");
        setStart(jsonarray.getInt(0));
        setEnd(jsonarray.getInt(1));
        url = jsonobject.getString("url");
        if (jsonobject.isNull("expanded_url"))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        expandedURL = jsonobject.getString("expanded_url");
_L1:
        if (!jsonobject.isNull("display_url"))
        {
            displayURL = jsonobject.getString("display_url");
            return;
        }
        break MISSING_BLOCK_LABEL_95;
        try
        {
            expandedURL = url;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new TwitterException(jsonobject);
        }
          goto _L1
        displayURL = url;
        return;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (URLEntityJSONImpl)obj;
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

    public final String getDisplayURL()
    {
        return displayURL;
    }

    public final int getEnd()
    {
        return super.getEnd();
    }

    public final String getExpandedURL()
    {
        return expandedURL;
    }

    public final int getStart()
    {
        return super.getStart();
    }

    public final String getText()
    {
        return url;
    }

    public final String getURL()
    {
        return url;
    }

    public final int hashCode()
    {
        int k = 0;
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
        return (j + i * 31) * 31 + k;
    }

    public final String toString()
    {
        return (new StringBuilder("URLEntityJSONImpl{url='")).append(url).append('\'').append(", expandedURL='").append(expandedURL).append('\'').append(", displayURL='").append(displayURL).append('\'').append('}').toString();
    }
}
