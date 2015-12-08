// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.Place;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.SymbolEntity;
import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.logging.Logger;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, ResponseListImpl, z_T4JInternalParseUtil, 
//            UserJSONImpl, z_T4JInternalJSONImplFactory, PlaceJSONImpl, UserMentionEntityJSONImpl, 
//            URLEntityJSONImpl, HashtagEntityJSONImpl, MediaEntityJSONImpl, HTMLEntity

final class StatusJSONImpl extends TwitterResponseImpl
    implements Serializable, Status
{

    private static final Logger logger = Logger.getLogger(twitter4j/internal/json/StatusJSONImpl);
    private static final long serialVersionUID = 0x68c214e4e0c8cc29L;
    private long contributorsIDs[];
    private Date createdAt;
    private long currentUserRetweetId;
    private int favoriteCount;
    private GeoLocation geoLocation;
    private HashtagEntity hashtagEntities[];
    private long id;
    private String inReplyToScreenName;
    private long inReplyToStatusId;
    private long inReplyToUserId;
    private boolean isFavorited;
    private boolean isPossiblySensitive;
    private boolean isRetweeted;
    private boolean isTruncated;
    private String isoLanguageCode;
    private MediaEntity mediaEntities[];
    private Place place;
    private long retweetCount;
    private Status retweetedStatus;
    private String source;
    private SymbolEntity symbolEntities[];
    private String text;
    private URLEntity urlEntities[];
    private User user;
    private UserMentionEntity userMentionEntities[];

    StatusJSONImpl()
    {
        geoLocation = null;
        place = null;
        currentUserRetweetId = -1L;
        user = null;
    }

    StatusJSONImpl(HttpResponse httpresponse, Configuration configuration)
    {
        super(httpresponse);
        geoLocation = null;
        place = null;
        currentUserRetweetId = -1L;
        user = null;
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    StatusJSONImpl(JSONObject jsonobject)
    {
        geoLocation = null;
        place = null;
        currentUserRetweetId = -1L;
        user = null;
        init(jsonobject);
    }

    StatusJSONImpl(JSONObject jsonobject, Configuration configuration)
    {
        geoLocation = null;
        place = null;
        currentUserRetweetId = -1L;
        user = null;
        init(jsonobject);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(this, jsonobject);
        }
    }

    static ResponseList createStatusList(HttpResponse httpresponse, Configuration configuration)
    {
        JSONArray jsonarray;
        JSONObject jsonobject;
        StatusJSONImpl statusjsonimpl;
        int i;
        int j;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.clearThreadLocalMap();
            }
            jsonarray = httpresponse.asJSONArray();
            j = jsonarray.length();
            httpresponse = new ResponseListImpl(j, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse);
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        statusjsonimpl = new StatusJSONImpl(jsonobject);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(statusjsonimpl, jsonobject);
        }
        httpresponse.add(statusjsonimpl);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
    }

    private void init(JSONObject jsonobject)
    {
        boolean flag;
        flag = false;
        id = z_T4JInternalParseUtil.getLong("id", jsonobject);
        source = z_T4JInternalParseUtil.getUnescapedString("source", jsonobject);
        createdAt = z_T4JInternalParseUtil.getDate("created_at", jsonobject);
        isTruncated = z_T4JInternalParseUtil.getBoolean("truncated", jsonobject);
        inReplyToStatusId = z_T4JInternalParseUtil.getLong("in_reply_to_status_id", jsonobject);
        inReplyToUserId = z_T4JInternalParseUtil.getLong("in_reply_to_user_id", jsonobject);
        isFavorited = z_T4JInternalParseUtil.getBoolean("favorited", jsonobject);
        isRetweeted = z_T4JInternalParseUtil.getBoolean("retweeted", jsonobject);
        inReplyToScreenName = z_T4JInternalParseUtil.getUnescapedString("in_reply_to_screen_name", jsonobject);
        retweetCount = z_T4JInternalParseUtil.getLong("retweet_count", jsonobject);
        favoriteCount = z_T4JInternalParseUtil.getInt("favorite_count", jsonobject);
        isPossiblySensitive = z_T4JInternalParseUtil.getBoolean("possibly_sensitive", jsonobject);
        Object obj;
        if (!jsonobject.isNull("user"))
        {
            user = new UserJSONImpl(jsonobject.getJSONObject("user"));
        }
        geoLocation = z_T4JInternalJSONImplFactory.createGeoLocation(jsonobject);
        if (!jsonobject.isNull("place"))
        {
            place = new PlaceJSONImpl(jsonobject.getJSONObject("place"));
        }
        if (!jsonobject.isNull("retweeted_status"))
        {
            retweetedStatus = new StatusJSONImpl(jsonobject.getJSONObject("retweeted_status"));
        }
        if (jsonobject.isNull("contributors"))
        {
            break MISSING_BLOCK_LABEL_272;
        }
        obj = jsonobject.getJSONArray("contributors");
        contributorsIDs = new long[((JSONArray) (obj)).length()];
        int i = 0;
        do
        {
            Object aobj[];
            JSONArray jsonarray;
            int j;
            try
            {
                if (i >= ((JSONArray) (obj)).length())
                {
                    break;
                }
                contributorsIDs[i] = Long.parseLong(((JSONArray) (obj)).getString(i));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new TwitterException(jsonobject);
            }
            i++;
        } while (true);
        break MISSING_BLOCK_LABEL_279;
        contributorsIDs = new long[0];
        if (jsonobject.isNull("entities")) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONObject("entities");
        if (((JSONObject) (obj)).isNull("user_mentions")) goto _L4; else goto _L3
_L3:
        jsonarray = ((JSONObject) (obj)).getJSONArray("user_mentions");
        j = jsonarray.length();
        userMentionEntities = new UserMentionEntity[j];
        i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        userMentionEntities[i] = new UserMentionEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (((JSONObject) (obj)).isNull("urls")) goto _L7; else goto _L6
_L6:
        jsonarray = ((JSONObject) (obj)).getJSONArray("urls");
        j = jsonarray.length();
        urlEntities = new URLEntity[j];
        i = 0;
_L8:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        urlEntities[i] = new URLEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        if (((JSONObject) (obj)).isNull("hashtags")) goto _L10; else goto _L9
_L9:
        jsonarray = ((JSONObject) (obj)).getJSONArray("hashtags");
        j = jsonarray.length();
        hashtagEntities = new HashtagEntity[j];
        i = 0;
_L11:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hashtagEntities[i] = new HashtagEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        if (((JSONObject) (obj)).isNull("symbols")) goto _L13; else goto _L12
_L12:
        jsonarray = ((JSONObject) (obj)).getJSONArray("symbols");
        j = jsonarray.length();
        symbolEntities = new SymbolEntity[j];
        i = 0;
_L14:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        symbolEntities[i] = new HashtagEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        if (((JSONObject) (obj)).isNull("media")) goto _L2; else goto _L15
_L15:
        obj = ((JSONObject) (obj)).getJSONArray("media");
        j = ((JSONArray) (obj)).length();
        mediaEntities = new MediaEntity[j];
        i = ((flag) ? 1 : 0);
_L16:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        mediaEntities[i] = new MediaEntityJSONImpl(((JSONArray) (obj)).getJSONObject(i));
        i++;
        if (true) goto _L16; else goto _L2
_L2:
        isoLanguageCode = z_T4JInternalParseUtil.getRawString("lang", jsonobject);
        if (userMentionEntities != null) goto _L18; else goto _L17
_L17:
        aobj = new UserMentionEntity[0];
_L33:
        userMentionEntities = ((UserMentionEntity []) (aobj));
        if (urlEntities != null) goto _L20; else goto _L19
_L19:
        aobj = new URLEntity[0];
_L28:
        urlEntities = ((URLEntity []) (aobj));
        if (hashtagEntities != null) goto _L22; else goto _L21
_L21:
        aobj = new HashtagEntity[0];
_L29:
        hashtagEntities = ((HashtagEntity []) (aobj));
        if (symbolEntities != null) goto _L24; else goto _L23
_L23:
        aobj = new SymbolEntity[0];
_L30:
        symbolEntities = ((SymbolEntity []) (aobj));
        if (mediaEntities != null) goto _L26; else goto _L25
_L25:
        aobj = new MediaEntity[0];
_L31:
        mediaEntities = ((MediaEntity []) (aobj));
        text = HTMLEntity.unescapeAndSlideEntityIncdices(jsonobject.getString("text"), userMentionEntities, urlEntities, hashtagEntities, mediaEntities);
        if (!jsonobject.isNull("current_user_retweet"))
        {
            currentUserRetweetId = jsonobject.getJSONObject("current_user_retweet").getLong("id");
            return;
        }
          goto _L27
_L18:
        aobj = userMentionEntities;
        continue; /* Loop/switch isn't completed */
_L20:
        aobj = urlEntities;
          goto _L28
_L22:
        aobj = hashtagEntities;
          goto _L29
_L24:
        aobj = symbolEntities;
          goto _L30
_L26:
        aobj = mediaEntities;
          goto _L31
_L27:
        return;
        if (true) goto _L33; else goto _L32
_L32:
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((Status)obj);
    }

    public final int compareTo(Status status)
    {
        long l = id - status.getId();
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

    public final boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if ((obj instanceof Status) && ((Status)obj).getId() == id)
            {
                return true;
            }
        }
        return false;
    }

    public final long[] getContributors()
    {
        return contributorsIDs;
    }

    public final Date getCreatedAt()
    {
        return createdAt;
    }

    public final long getCurrentUserRetweetId()
    {
        return currentUserRetweetId;
    }

    public final int getFavoriteCount()
    {
        return favoriteCount;
    }

    public final GeoLocation getGeoLocation()
    {
        return geoLocation;
    }

    public final HashtagEntity[] getHashtagEntities()
    {
        return hashtagEntities;
    }

    public final long getId()
    {
        return id;
    }

    public final String getInReplyToScreenName()
    {
        return inReplyToScreenName;
    }

    public final long getInReplyToStatusId()
    {
        return inReplyToStatusId;
    }

    public final long getInReplyToUserId()
    {
        return inReplyToUserId;
    }

    public final String getIsoLanguageCode()
    {
        return isoLanguageCode;
    }

    public final MediaEntity[] getMediaEntities()
    {
        return mediaEntities;
    }

    public final Place getPlace()
    {
        return place;
    }

    public final int getRetweetCount()
    {
        return (int)retweetCount;
    }

    public final Status getRetweetedStatus()
    {
        return retweetedStatus;
    }

    public final String getSource()
    {
        return source;
    }

    public final SymbolEntity[] getSymbolEntities()
    {
        return symbolEntities;
    }

    public final String getText()
    {
        return text;
    }

    public final URLEntity[] getURLEntities()
    {
        return urlEntities;
    }

    public final User getUser()
    {
        return user;
    }

    public final UserMentionEntity[] getUserMentionEntities()
    {
        return userMentionEntities;
    }

    public final int hashCode()
    {
        return (int)id;
    }

    public final boolean isFavorited()
    {
        return isFavorited;
    }

    public final boolean isPossiblySensitive()
    {
        return isPossiblySensitive;
    }

    public final boolean isRetweet()
    {
        return retweetedStatus != null;
    }

    public final boolean isRetweeted()
    {
        return isRetweeted;
    }

    public final boolean isRetweetedByMe()
    {
        return currentUserRetweetId != -1L;
    }

    public final boolean isTruncated()
    {
        return isTruncated;
    }

    public final String toString()
    {
        Object obj = null;
        StringBuilder stringbuilder = (new StringBuilder("StatusJSONImpl{createdAt=")).append(createdAt).append(", id=").append(id).append(", text='").append(text).append('\'').append(", source='").append(source).append('\'').append(", isTruncated=").append(isTruncated).append(", inReplyToStatusId=").append(inReplyToStatusId).append(", inReplyToUserId=").append(inReplyToUserId).append(", isFavorited=").append(isFavorited).append(", isRetweeted=").append(isRetweeted).append(", favoriteCount=").append(favoriteCount).append(", inReplyToScreenName='").append(inReplyToScreenName).append('\'').append(", geoLocation=").append(geoLocation).append(", place=").append(place).append(", retweetCount=").append(retweetCount).append(", isPossiblySensitive=").append(isPossiblySensitive).append(", isoLanguageCode=").append(isoLanguageCode).append(", contributorsIDs=").append(contributorsIDs).append(", retweetedStatus=").append(retweetedStatus).append(", userMentionEntities=");
        java.util.List list;
        if (userMentionEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(userMentionEntities);
        }
        stringbuilder = stringbuilder.append(list).append(", urlEntities=");
        if (urlEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(urlEntities);
        }
        stringbuilder = stringbuilder.append(list).append(", hashtagEntities=");
        if (hashtagEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(hashtagEntities);
        }
        stringbuilder = stringbuilder.append(list).append(", mediaEntities=");
        if (mediaEntities == null)
        {
            list = obj;
        } else
        {
            list = Arrays.asList(mediaEntities);
        }
        return stringbuilder.append(list).append(", currentUserRetweetId=").append(currentUserRetweetId).append(", user=").append(user).append('}').toString();
    }

}
