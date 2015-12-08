// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, z_T4JInternalParseUtil, DataObjectFactoryUtil

class TwitterAPIConfigurationJSONImpl extends TwitterResponseImpl
    implements TwitterAPIConfiguration
{

    private static final long serialVersionUID = 0x504d099b9651fb89L;
    private int charactersReservedPerMedia;
    private int maxMediaPerUpload;
    private String nonUsernamePaths[];
    private int photoSizeLimit;
    private Map photoSizes;
    private int shortURLLength;
    private int shortURLLengthHttps;

    TwitterAPIConfigurationJSONImpl(HttpResponse httpresponse, Configuration configuration)
    {
        super(httpresponse);
        JSONObject jsonobject;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        jsonobject1 = httpresponse.asJSONObject();
        photoSizeLimit = z_T4JInternalParseUtil.getInt("photo_size_limit", jsonobject1);
        shortURLLength = z_T4JInternalParseUtil.getInt("short_url_length", jsonobject1);
        shortURLLengthHttps = z_T4JInternalParseUtil.getInt("short_url_length_https", jsonobject1);
        charactersReservedPerMedia = z_T4JInternalParseUtil.getInt("characters_reserved_per_media", jsonobject1);
        jsonobject2 = jsonobject1.getJSONObject("photo_sizes");
        photoSizes = new HashMap(4);
        photoSizes.put(twitter4j.MediaEntity.Size.LARGE, new MediaEntityJSONImpl.Size(jsonobject2.getJSONObject("large")));
        if (!jsonobject2.isNull("med"))
        {
            break MISSING_BLOCK_LABEL_270;
        }
        jsonobject = jsonobject2.getJSONObject("medium");
_L1:
        photoSizes.put(twitter4j.MediaEntity.Size.MEDIUM, new MediaEntityJSONImpl.Size(jsonobject));
        photoSizes.put(twitter4j.MediaEntity.Size.SMALL, new MediaEntityJSONImpl.Size(jsonobject2.getJSONObject("small")));
        photoSizes.put(twitter4j.MediaEntity.Size.THUMB, new MediaEntityJSONImpl.Size(jsonobject2.getJSONObject("thumb")));
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse.asJSONObject());
        }
        httpresponse = jsonobject1.getJSONArray("non_username_paths");
        nonUsernamePaths = new String[httpresponse.length()];
        int i = 0;
        do
        {
            try
            {
                if (i >= httpresponse.length())
                {
                    break;
                }
                nonUsernamePaths[i] = httpresponse.getString(i);
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                throw new TwitterException(httpresponse);
            }
            i++;
        } while (true);
        break MISSING_BLOCK_LABEL_281;
        jsonobject = jsonobject2.getJSONObject("med");
          goto _L1
        maxMediaPerUpload = z_T4JInternalParseUtil.getInt("max_media_per_upload", jsonobject1);
        return;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof TwitterAPIConfigurationJSONImpl))
            {
                return false;
            }
            obj = (TwitterAPIConfigurationJSONImpl)obj;
            if (charactersReservedPerMedia != ((TwitterAPIConfigurationJSONImpl) (obj)).charactersReservedPerMedia)
            {
                return false;
            }
            if (maxMediaPerUpload != ((TwitterAPIConfigurationJSONImpl) (obj)).maxMediaPerUpload)
            {
                return false;
            }
            if (photoSizeLimit != ((TwitterAPIConfigurationJSONImpl) (obj)).photoSizeLimit)
            {
                return false;
            }
            if (shortURLLength != ((TwitterAPIConfigurationJSONImpl) (obj)).shortURLLength)
            {
                return false;
            }
            if (shortURLLengthHttps != ((TwitterAPIConfigurationJSONImpl) (obj)).shortURLLengthHttps)
            {
                return false;
            }
            if (!Arrays.equals(nonUsernamePaths, ((TwitterAPIConfigurationJSONImpl) (obj)).nonUsernamePaths))
            {
                return false;
            }
            if (photoSizes == null ? ((TwitterAPIConfigurationJSONImpl) (obj)).photoSizes != null : !photoSizes.equals(((TwitterAPIConfigurationJSONImpl) (obj)).photoSizes))
            {
                return false;
            }
        }
        return true;
    }

    public int getCharactersReservedPerMedia()
    {
        return charactersReservedPerMedia;
    }

    public int getMaxMediaPerUpload()
    {
        return maxMediaPerUpload;
    }

    public String[] getNonUsernamePaths()
    {
        return nonUsernamePaths;
    }

    public int getPhotoSizeLimit()
    {
        return photoSizeLimit;
    }

    public Map getPhotoSizes()
    {
        return photoSizes;
    }

    public int getShortURLLength()
    {
        return shortURLLength;
    }

    public int getShortURLLengthHttps()
    {
        return shortURLLengthHttps;
    }

    public int hashCode()
    {
        int j = 0;
        int k = photoSizeLimit;
        int l = shortURLLength;
        int i1 = shortURLLengthHttps;
        int j1 = charactersReservedPerMedia;
        int i;
        if (photoSizes != null)
        {
            i = photoSizes.hashCode();
        } else
        {
            i = 0;
        }
        if (nonUsernamePaths != null)
        {
            j = Arrays.hashCode(nonUsernamePaths);
        }
        return ((i + (((k * 31 + l) * 31 + i1) * 31 + j1) * 31) * 31 + j) * 31 + maxMediaPerUpload;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("TwitterAPIConfigurationJSONImpl{photoSizeLimit=")).append(photoSizeLimit).append(", shortURLLength=").append(shortURLLength).append(", shortURLLengthHttps=").append(shortURLLengthHttps).append(", charactersReservedPerMedia=").append(charactersReservedPerMedia).append(", photoSizes=").append(photoSizes).append(", nonUsernamePaths=");
        java.util.List list;
        if (nonUsernamePaths == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(nonUsernamePaths);
        }
        return stringbuilder.append(list).append(", maxMediaPerUpload=").append(maxMediaPerUpload).append('}').toString();
    }
}
