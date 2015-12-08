// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterResponseImpl, Status, Logger, TwitterException, 
//            HttpResponse, TwitterObjectFactory, JSONException, JSONArray, 
//            ResponseListImpl, ResponseList, ParseUtil, JSONObject, 
//            UserJSONImpl, JSONImplFactory, PlaceJSONImpl, UserMentionEntity, 
//            UserMentionEntityJSONImpl, URLEntity, URLEntityJSONImpl, HashtagEntity, 
//            HashtagEntityJSONImpl, SymbolEntity, MediaEntity, MediaEntityJSONImpl, 
//            HTMLEntity, ScopesImpl, GeoLocation, Place, 
//            Scopes, User

final class StatusJSONImpl extends TwitterResponseImpl
    implements Serializable, Status
{

    private static final Logger logger = Logger.getLogger(twitter4j/StatusJSONImpl);
    private static final long serialVersionUID = 0xa65538e45c21f60fL;
    private long contributorsIDs[];
    private Date createdAt;
    private long currentUserRetweetId;
    private MediaEntity extendedMediaEntities[];
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
    private String lang;
    private MediaEntity mediaEntities[];
    private Place place;
    private long retweetCount;
    private Status retweetedStatus;
    private Scopes scopes;
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
        throws TwitterException
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
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, httpresponse);
        }
    }

    StatusJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        geoLocation = null;
        place = null;
        currentUserRetweetId = -1L;
        user = null;
        init(jsonobject);
    }

    StatusJSONImpl(JSONObject jsonobject, Configuration configuration)
        throws TwitterException
    {
        geoLocation = null;
        place = null;
        currentUserRetweetId = -1L;
        user = null;
        init(jsonobject);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(this, jsonobject);
        }
    }

    static ResponseList createStatusList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
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
                TwitterObjectFactory.clearThreadLocalMap();
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
            TwitterObjectFactory.registerJSONObject(statusjsonimpl, jsonobject);
        }
        httpresponse.add(statusjsonimpl);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        boolean flag;
        flag = false;
        id = ParseUtil.getLong("id", jsonobject);
        source = ParseUtil.getUnescapedString("source", jsonobject);
        createdAt = ParseUtil.getDate("created_at", jsonobject);
        isTruncated = ParseUtil.getBoolean("truncated", jsonobject);
        inReplyToStatusId = ParseUtil.getLong("in_reply_to_status_id", jsonobject);
        inReplyToUserId = ParseUtil.getLong("in_reply_to_user_id", jsonobject);
        isFavorited = ParseUtil.getBoolean("favorited", jsonobject);
        isRetweeted = ParseUtil.getBoolean("retweeted", jsonobject);
        inReplyToScreenName = ParseUtil.getUnescapedString("in_reply_to_screen_name", jsonobject);
        retweetCount = ParseUtil.getLong("retweet_count", jsonobject);
        favoriteCount = ParseUtil.getInt("favorite_count", jsonobject);
        isPossiblySensitive = ParseUtil.getBoolean("possibly_sensitive", jsonobject);
        Object obj;
        if (!jsonobject.isNull("user"))
        {
            user = new UserJSONImpl(jsonobject.getJSONObject("user"));
        }
        geoLocation = JSONImplFactory.createGeoLocation(jsonobject);
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
        i = 0;
_L16:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        mediaEntities[i] = new MediaEntityJSONImpl(((JSONArray) (obj)).getJSONObject(i));
        i++;
        if (true) goto _L16; else goto _L2
_L2:
        if (jsonobject.isNull("extended_entities")) goto _L18; else goto _L17
_L17:
        obj = jsonobject.getJSONObject("extended_entities");
        if (((JSONObject) (obj)).isNull("media")) goto _L18; else goto _L19
_L19:
        obj = ((JSONObject) (obj)).getJSONArray("media");
        j = ((JSONArray) (obj)).length();
        extendedMediaEntities = new MediaEntity[j];
        i = 0;
_L20:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        extendedMediaEntities[i] = new MediaEntityJSONImpl(((JSONArray) (obj)).getJSONObject(i));
        i++;
        if (true) goto _L20; else goto _L18
_L18:
        if (userMentionEntities != null) goto _L22; else goto _L21
_L21:
        aobj = new UserMentionEntity[0];
_L44:
        userMentionEntities = ((UserMentionEntity []) (aobj));
        if (urlEntities != null) goto _L24; else goto _L23
_L23:
        aobj = new URLEntity[0];
_L38:
        urlEntities = ((URLEntity []) (aobj));
        if (hashtagEntities != null) goto _L26; else goto _L25
_L25:
        aobj = new HashtagEntity[0];
_L39:
        hashtagEntities = ((HashtagEntity []) (aobj));
        if (symbolEntities != null) goto _L28; else goto _L27
_L27:
        aobj = new SymbolEntity[0];
_L40:
        symbolEntities = ((SymbolEntity []) (aobj));
        if (mediaEntities != null) goto _L30; else goto _L29
_L29:
        aobj = new MediaEntity[0];
_L41:
        mediaEntities = ((MediaEntity []) (aobj));
        if (extendedMediaEntities != null) goto _L32; else goto _L31
_L31:
        aobj = new MediaEntity[0];
_L42:
        extendedMediaEntities = ((MediaEntity []) (aobj));
        text = HTMLEntity.unescapeAndSlideEntityIncdices(jsonobject.getString("text"), userMentionEntities, urlEntities, hashtagEntities, mediaEntities);
        if (!jsonobject.isNull("current_user_retweet"))
        {
            currentUserRetweetId = jsonobject.getJSONObject("current_user_retweet").getLong("id");
        }
        if (!jsonobject.isNull("lang"))
        {
            lang = ParseUtil.getUnescapedString("lang", jsonobject);
        }
        if (jsonobject.isNull("scopes")) goto _L34; else goto _L33
_L33:
        jsonobject = jsonobject.getJSONObject("scopes");
        if (jsonobject.isNull("place_ids")) goto _L34; else goto _L35
_L35:
        jsonobject = jsonobject.getJSONArray("place_ids");
        j = jsonobject.length();
        aobj = new String[j];
        i = ((flag) ? 1 : 0);
_L37:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[i] = jsonobject.getString(i);
        i++;
        if (true) goto _L37; else goto _L36
_L22:
        aobj = userMentionEntities;
        continue; /* Loop/switch isn't completed */
_L24:
        aobj = urlEntities;
          goto _L38
_L26:
        aobj = hashtagEntities;
          goto _L39
_L28:
        aobj = symbolEntities;
          goto _L40
_L30:
        aobj = mediaEntities;
          goto _L41
_L32:
        aobj = extendedMediaEntities;
          goto _L42
_L36:
        scopes = new ScopesImpl(((String []) (aobj)));
_L34:
        return;
        if (true) goto _L44; else goto _L43
_L43:
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Status)obj);
    }

    public int compareTo(Status status)
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

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof Status))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((Status)obj).getId() == id) goto _L4; else goto _L5
_L5:
        return false;
    }

    public long[] getContributors()
    {
        return contributorsIDs;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public long getCurrentUserRetweetId()
    {
        return currentUserRetweetId;
    }

    public MediaEntity[] getExtendedMediaEntities()
    {
        return extendedMediaEntities;
    }

    public int getFavoriteCount()
    {
        return favoriteCount;
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

    public String getInReplyToScreenName()
    {
        return inReplyToScreenName;
    }

    public long getInReplyToStatusId()
    {
        return inReplyToStatusId;
    }

    public long getInReplyToUserId()
    {
        return inReplyToUserId;
    }

    public String getLang()
    {
        return lang;
    }

    public MediaEntity[] getMediaEntities()
    {
        return mediaEntities;
    }

    public Place getPlace()
    {
        return place;
    }

    public int getRetweetCount()
    {
        return (int)retweetCount;
    }

    public Status getRetweetedStatus()
    {
        return retweetedStatus;
    }

    public Scopes getScopes()
    {
        return scopes;
    }

    public String getSource()
    {
        return source;
    }

    public SymbolEntity[] getSymbolEntities()
    {
        return symbolEntities;
    }

    public String getText()
    {
        return text;
    }

    public URLEntity[] getURLEntities()
    {
        return urlEntities;
    }

    public User getUser()
    {
        return user;
    }

    public UserMentionEntity[] getUserMentionEntities()
    {
        return userMentionEntities;
    }

    public int hashCode()
    {
        return (int)id;
    }

    public boolean isFavorited()
    {
        return isFavorited;
    }

    public boolean isPossiblySensitive()
    {
        return isPossiblySensitive;
    }

    public boolean isRetweet()
    {
        return retweetedStatus != null;
    }

    public boolean isRetweeted()
    {
        return isRetweeted;
    }

    public boolean isRetweetedByMe()
    {
        return currentUserRetweetId != -1L;
    }

    public boolean isTruncated()
    {
        return isTruncated;
    }

    public String toString()
    {
        return (new StringBuilder()).append("StatusJSONImpl{createdAt=").append(createdAt).append(", id=").append(id).append(", text='").append(text).append('\'').append(", source='").append(source).append('\'').append(", isTruncated=").append(isTruncated).append(", inReplyToStatusId=").append(inReplyToStatusId).append(", inReplyToUserId=").append(inReplyToUserId).append(", isFavorited=").append(isFavorited).append(", isRetweeted=").append(isRetweeted).append(", favoriteCount=").append(favoriteCount).append(", inReplyToScreenName='").append(inReplyToScreenName).append('\'').append(", geoLocation=").append(geoLocation).append(", place=").append(place).append(", retweetCount=").append(retweetCount).append(", isPossiblySensitive=").append(isPossiblySensitive).append(", lang='").append(lang).append('\'').append(", contributorsIDs=").append(Arrays.toString(contributorsIDs)).append(", retweetedStatus=").append(retweetedStatus).append(", userMentionEntities=").append(Arrays.toString(userMentionEntities)).append(", urlEntities=").append(Arrays.toString(urlEntities)).append(", hashtagEntities=").append(Arrays.toString(hashtagEntities)).append(", mediaEntities=").append(Arrays.toString(mediaEntities)).append(", symbolEntities=").append(Arrays.toString(symbolEntities)).append(", currentUserRetweetId=").append(currentUserRetweetId).append(", user=").append(user).append('}').toString();
    }

}
