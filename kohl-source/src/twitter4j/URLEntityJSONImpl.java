// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            EntityIndex, URLEntity, TwitterException, JSONException, 
//            JSONObject, JSONArray

final class URLEntityJSONImpl extends EntityIndex
    implements URLEntity
{

    private static final long serialVersionUID = 0x65c6035c458ad1a4L;
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
        throws TwitterException
    {
        init(jsonobject);
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
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

    public boolean equals(Object obj)
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

    public String getDisplayURL()
    {
        return displayURL;
    }

    public int getEnd()
    {
        return super.getEnd();
    }

    public String getExpandedURL()
    {
        return expandedURL;
    }

    public int getStart()
    {
        return super.getStart();
    }

    public String getText()
    {
        return url;
    }

    public String getURL()
    {
        return url;
    }

    public int hashCode()
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
        return (i * 31 + j) * 31 + k;
    }

    public String toString()
    {
        return (new StringBuilder()).append("URLEntityJSONImpl{url='").append(url).append('\'').append(", expandedURL='").append(expandedURL).append('\'').append(", displayURL='").append(displayURL).append('\'').append('}').toString();
    }
}
