// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterResponseImpl, TwitterAPIConfiguration, TwitterException, JSONException, 
//            HttpResponse, ParseUtil, JSONObject, TwitterObjectFactory, 
//            JSONArray

class TwitterAPIConfigurationJSONImpl extends TwitterResponseImpl
    implements TwitterAPIConfiguration
{

    private static final long serialVersionUID = 0xce31a6536c4562baL;
    private int charactersReservedPerMedia;
    private int maxMediaPerUpload;
    private String nonUsernamePaths[];
    private int photoSizeLimit;
    private Map photoSizes;
    private int shortURLLength;
    private int shortURLLengthHttps;

    TwitterAPIConfigurationJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        JSONObject jsonobject;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        jsonobject1 = httpresponse.asJSONObject();
        photoSizeLimit = ParseUtil.getInt("photo_size_limit", jsonobject1);
        shortURLLength = ParseUtil.getInt("short_url_length", jsonobject1);
        shortURLLengthHttps = ParseUtil.getInt("short_url_length_https", jsonobject1);
        charactersReservedPerMedia = ParseUtil.getInt("characters_reserved_per_media", jsonobject1);
        jsonobject2 = jsonobject1.getJSONObject("photo_sizes");
        photoSizes = new HashMap(4);
        photoSizes.put(MediaEntity.Size.LARGE, new MediaEntityJSONImpl.Size(jsonobject2.getJSONObject("large")));
        if (!jsonobject2.isNull("med"))
        {
            break MISSING_BLOCK_LABEL_270;
        }
        jsonobject = jsonobject2.getJSONObject("medium");
_L1:
        photoSizes.put(MediaEntity.Size.MEDIUM, new MediaEntityJSONImpl.Size(jsonobject));
        photoSizes.put(MediaEntity.Size.SMALL, new MediaEntityJSONImpl.Size(jsonobject2.getJSONObject("small")));
        photoSizes.put(MediaEntity.Size.THUMB, new MediaEntityJSONImpl.Size(jsonobject2.getJSONObject("thumb")));
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, httpresponse.asJSONObject());
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
        maxMediaPerUpload = ParseUtil.getInt("max_media_per_upload", jsonobject1);
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
        return (((((k * 31 + l) * 31 + i1) * 31 + j1) * 31 + i) * 31 + j) * 31 + maxMediaPerUpload;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("TwitterAPIConfigurationJSONImpl{photoSizeLimit=").append(photoSizeLimit).append(", shortURLLength=").append(shortURLLength).append(", shortURLLengthHttps=").append(shortURLLengthHttps).append(", charactersReservedPerMedia=").append(charactersReservedPerMedia).append(", photoSizes=").append(photoSizes).append(", nonUsernamePaths=");
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
