// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.Annotations;
import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.Place;
import twitter4j.Tweet;
import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.UserMentionEntity;
import twitter4j.conf.Configuration;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            z_T4JInternalJSONImplFactory, PlaceJSONImpl, UserMentionEntityJSONImpl, URLEntityJSONImpl, 
//            HashtagEntityJSONImpl, MediaEntityJSONImpl, DataObjectFactoryUtil

final class TweetJSONImpl
    implements Tweet, Serializable
{

    private static final long serialVersionUID = 0x29e6a7eb8de21fb1L;
    private Annotations annotations;
    private Date createdAt;
    private String fromUser;
    private long fromUserId;
    private GeoLocation geoLocation;
    private HashtagEntity hashtagEntities[];
    private long id;
    private String isoLanguageCode;
    private String location;
    private MediaEntity mediaEntities[];
    private Place place;
    private String profileImageUrl;
    private String source;
    private String text;
    private String toUser;
    private long toUserId;
    private URLEntity urlEntities[];
    private UserMentionEntity userMentionEntities[];

    TweetJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        toUserId = -1L;
        toUser = null;
        isoLanguageCode = null;
        geoLocation = null;
        annotations = null;
        text = z_T4JInternalParseUtil.getUnescapedString("text", jsonobject);
        toUserId = z_T4JInternalParseUtil.getLong("to_user_id", jsonobject);
        toUser = z_T4JInternalParseUtil.getRawString("to_user", jsonobject);
        fromUser = z_T4JInternalParseUtil.getRawString("from_user", jsonobject);
        id = z_T4JInternalParseUtil.getLong("id", jsonobject);
        fromUserId = z_T4JInternalParseUtil.getLong("from_user_id", jsonobject);
        isoLanguageCode = z_T4JInternalParseUtil.getRawString("iso_language_code", jsonobject);
        source = z_T4JInternalParseUtil.getUnescapedString("source", jsonobject);
        profileImageUrl = z_T4JInternalParseUtil.getUnescapedString("profile_image_url", jsonobject);
        createdAt = z_T4JInternalParseUtil.getDate("created_at", jsonobject, "EEE, dd MMM yyyy HH:mm:ss z");
        location = z_T4JInternalParseUtil.getRawString("location", jsonobject);
        geoLocation = z_T4JInternalJSONImplFactory.createGeoLocation(jsonobject);
        JSONArray jsonarray;
        int i;
        int j;
        if (!jsonobject.isNull("annotations"))
        {
            try
            {
                annotations = new Annotations(jsonobject.getJSONArray("annotations"));
            }
            catch (JSONException jsonexception) { }
        }
        if (!jsonobject.isNull("place"))
        {
            try
            {
                place = new PlaceJSONImpl(jsonobject.getJSONObject("place"));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new TwitterException(jsonobject);
            }
        } else
        {
            place = null;
        }
        if (jsonobject.isNull("entities")) goto _L2; else goto _L1
_L1:
        jsonobject = jsonobject.getJSONObject("entities");
        if (jsonobject.isNull("user_mentions"))
        {
            break MISSING_BLOCK_LABEL_301;
        }
        jsonarray = jsonobject.getJSONArray("user_mentions");
        j = jsonarray.length();
        userMentionEntities = new UserMentionEntity[j];
        i = 0;
        while (i < j) 
        {
            try
            {
                userMentionEntities[i] = new UserMentionEntityJSONImpl(jsonarray.getJSONObject(i));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new TwitterException(jsonobject);
            }
            i++;
        }
        if (jsonobject.isNull("urls")) goto _L4; else goto _L3
_L3:
        jsonarray = jsonobject.getJSONArray("urls");
        j = jsonarray.length();
        urlEntities = new URLEntity[j];
        i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        urlEntities[i] = new URLEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (jsonobject.isNull("hashtags")) goto _L7; else goto _L6
_L6:
        jsonarray = jsonobject.getJSONArray("hashtags");
        j = jsonarray.length();
        hashtagEntities = new HashtagEntity[j];
        i = 0;
_L8:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hashtagEntities[i] = new HashtagEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        if (jsonobject.isNull("media")) goto _L2; else goto _L9
_L9:
        jsonobject = jsonobject.getJSONArray("media");
        j = jsonobject.length();
        mediaEntities = new MediaEntity[j];
        i = 0;
_L10:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        mediaEntities[i] = new MediaEntityJSONImpl(jsonobject.getJSONObject(i));
        i++;
        if (true) goto _L10; else goto _L2
_L2:
    }

    TweetJSONImpl(JSONObject jsonobject, Configuration configuration)
        throws TwitterException
    {
        this(jsonobject);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(this, jsonobject);
        }
    }

    public int compareTo(Object obj)
    {
        return compareTo((Tweet)obj);
    }

    public int compareTo(Tweet tweet)
    {
        long l = id - tweet.getId();
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        }
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)l;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Tweet))
            {
                return false;
            }
            obj = (Tweet)obj;
            if (id != ((Tweet) (obj)).getId())
            {
                return false;
            }
        }
        return true;
    }

    public Annotations getAnnotations()
    {
        return annotations;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getFromUser()
    {
        return fromUser;
    }

    public long getFromUserId()
    {
        return fromUserId;
    }

    public GeoLocation getGeoLocation()
    {
        return geoLocation;
    }

    public HashtagEntity[] getHashtagEntities()
    {
        return hashtagEntities;
    }

    public long getId()
    {
        return id;
    }

    public String getIsoLanguageCode()
    {
        return isoLanguageCode;
    }

    public String getLocation()
    {
        return location;
    }

    public MediaEntity[] getMediaEntities()
    {
        return mediaEntities;
    }

    public Place getPlace()
    {
        return place;
    }

    public String getProfileImageUrl()
    {
        return profileImageUrl;
    }

    public String getSource()
    {
        return source;
    }

    public String getText()
    {
        return text;
    }

    public String getToUser()
    {
        return toUser;
    }

    public long getToUserId()
    {
        return toUserId;
    }

    public URLEntity[] getURLEntities()
    {
        return urlEntities;
    }

    public UserMentionEntity[] getUserMentionEntities()
    {
        return userMentionEntities;
    }

    public int hashCode()
    {
        int k3 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int l3;
        int i4;
        int j4;
        if (text != null)
        {
            i = text.hashCode();
        } else
        {
            i = 0;
        }
        l3 = (int)(toUserId ^ toUserId >>> 32);
        if (toUser != null)
        {
            j = toUser.hashCode();
        } else
        {
            j = 0;
        }
        if (fromUser != null)
        {
            k = fromUser.hashCode();
        } else
        {
            k = 0;
        }
        i4 = (int)(id ^ id >>> 32);
        j4 = (int)(fromUserId ^ fromUserId >>> 32);
        if (isoLanguageCode != null)
        {
            l = isoLanguageCode.hashCode();
        } else
        {
            l = 0;
        }
        if (source != null)
        {
            i1 = source.hashCode();
        } else
        {
            i1 = 0;
        }
        if (profileImageUrl != null)
        {
            j1 = profileImageUrl.hashCode();
        } else
        {
            j1 = 0;
        }
        if (createdAt != null)
        {
            k1 = createdAt.hashCode();
        } else
        {
            k1 = 0;
        }
        if (location != null)
        {
            l1 = location.hashCode();
        } else
        {
            l1 = 0;
        }
        if (place != null)
        {
            i2 = place.hashCode();
        } else
        {
            i2 = 0;
        }
        if (geoLocation != null)
        {
            j2 = geoLocation.hashCode();
        } else
        {
            j2 = 0;
        }
        if (annotations != null)
        {
            k2 = annotations.hashCode();
        } else
        {
            k2 = 0;
        }
        if (userMentionEntities != null)
        {
            l2 = Arrays.hashCode(userMentionEntities);
        } else
        {
            l2 = 0;
        }
        if (urlEntities != null)
        {
            i3 = Arrays.hashCode(urlEntities);
        } else
        {
            i3 = 0;
        }
        if (hashtagEntities != null)
        {
            j3 = Arrays.hashCode(hashtagEntities);
        } else
        {
            j3 = 0;
        }
        if (mediaEntities != null)
        {
            k3 = Arrays.hashCode(mediaEntities);
        }
        return ((((((((((((((((i * 31 + l3) * 31 + j) * 31 + k) * 31 + i4) * 31 + j4) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3;
    }

    public String toString()
    {
        Object obj = null;
        StringBuffer stringbuffer = (new StringBuffer()).append("TweetJSONImpl{text='").append(text).append('\'').append(", toUserId=").append(toUserId).append(", toUser='").append(toUser).append('\'').append(", fromUser='").append(fromUser).append('\'').append(", id=").append(id).append(", fromUserId=").append(fromUserId).append(", isoLanguageCode='").append(isoLanguageCode).append('\'').append(", source='").append(source).append('\'').append(", profileImageUrl='").append(profileImageUrl).append('\'').append(", createdAt=").append(createdAt).append(", location='").append(location).append('\'').append(", place=").append(place).append(", geoLocation=").append(geoLocation).append(", annotations=").append(annotations).append(", userMentionEntities=");
        java.util.List list;
        if (userMentionEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(userMentionEntities);
        }
        stringbuffer = stringbuffer.append(list).append(", urlEntities=");
        if (urlEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(urlEntities);
        }
        stringbuffer = stringbuffer.append(list).append(", hashtagEntities=");
        if (hashtagEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(hashtagEntities);
        }
        stringbuffer = stringbuffer.append(list).append(", mediaEntities=");
        if (mediaEntities == null)
        {
            list = obj;
        } else
        {
            list = Arrays.asList(mediaEntities);
        }
        return stringbuffer.append(list).append('}').toString();
    }
}
