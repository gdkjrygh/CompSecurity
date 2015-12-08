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
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.logging.Logger;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, ResponseListImpl, UserJSONImpl, 
//            z_T4JInternalJSONImplFactory, PlaceJSONImpl, UserMentionEntityJSONImpl, URLEntityJSONImpl, 
//            HashtagEntityJSONImpl, MediaEntityJSONImpl

final class StatusJSONImpl extends TwitterResponseImpl
    implements Status, Serializable
{

    static Class class$twitter4j$internal$json$StatusJSONImpl;
    private static final Logger logger;
    private static final long serialVersionUID = 0x68c214e4e0c8cc29L;
    private Annotations annotations;
    private String contributors[];
    private long contributorsIDs[];
    private Date createdAt;
    private GeoLocation geoLocation;
    private HashtagEntity hashtagEntities[];
    private long id;
    private String inReplyToScreenName;
    private long inReplyToStatusId;
    private long inReplyToUserId;
    private boolean isFavorited;
    private boolean isTruncated;
    private MediaEntity mediaEntities[];
    private Status myRetweetedStatus;
    private Place place;
    private long retweetCount;
    private Status retweetedStatus;
    private String source;
    private String text;
    private URLEntity urlEntities[];
    private User user;
    private UserMentionEntity userMentionEntities[];
    private boolean wasRetweetedByMe;

    StatusJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        geoLocation = null;
        place = null;
        contributors = null;
        annotations = null;
        user = null;
        init(jsonobject);
    }

    StatusJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        geoLocation = null;
        place = null;
        contributors = null;
        annotations = null;
        user = null;
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
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
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw httpresponse;
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
        throws TwitterException
    {
        id = z_T4JInternalParseUtil.getLong("id", jsonobject);
        text = z_T4JInternalParseUtil.getUnescapedString("text", jsonobject);
        source = z_T4JInternalParseUtil.getUnescapedString("source", jsonobject);
        createdAt = z_T4JInternalParseUtil.getDate("created_at", jsonobject);
        isTruncated = z_T4JInternalParseUtil.getBoolean("truncated", jsonobject);
        inReplyToStatusId = z_T4JInternalParseUtil.getLong("in_reply_to_status_id", jsonobject);
        inReplyToUserId = z_T4JInternalParseUtil.getLong("in_reply_to_user_id", jsonobject);
        isFavorited = z_T4JInternalParseUtil.getBoolean("favorited", jsonobject);
        inReplyToScreenName = z_T4JInternalParseUtil.getUnescapedString("in_reply_to_screen_name", jsonobject);
        retweetCount = z_T4JInternalParseUtil.getLong("retweet_count", jsonobject);
        JSONArray jsonarray;
        int i;
        try
        {
            if (!jsonobject.isNull("user"))
            {
                user = new UserJSONImpl(jsonobject.getJSONObject("user"));
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new TwitterException(jsonobject);
        }
        geoLocation = z_T4JInternalJSONImplFactory.createGeoLocation(jsonobject);
        if (!jsonobject.isNull("place"))
        {
            try
            {
                place = new PlaceJSONImpl(jsonobject.getJSONObject("place"));
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                logger.warn("failed to parse place:" + jsonobject);
            }
        }
        if (!jsonobject.isNull("retweeted_status"))
        {
            try
            {
                retweetedStatus = new StatusJSONImpl(jsonobject.getJSONObject("retweeted_status"));
            }
            catch (JSONException jsonexception1)
            {
                jsonexception1.printStackTrace();
                logger.warn("failed to parse retweeted_status:" + jsonobject);
            }
        }
        if (jsonobject.isNull("contributors")) goto _L2; else goto _L1
_L1:
        jsonarray = jsonobject.getJSONArray("contributors");
        contributorsIDs = new long[jsonarray.length()];
        i = 0;
_L4:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        contributorsIDs[i] = Long.parseLong(jsonarray.getString(i));
        i++;
        if (true) goto _L4; else goto _L3
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
        logger.warn("failed to parse contributors:" + jsonobject);
_L3:
        if (jsonobject.isNull("entities")) goto _L6; else goto _L5
_L5:
        Object obj = jsonobject.getJSONObject("entities");
        if (((JSONObject) (obj)).isNull("user_mentions")) goto _L8; else goto _L7
_L7:
        JSONArray jsonarray1;
        int k;
        jsonarray1 = ((JSONObject) (obj)).getJSONArray("user_mentions");
        k = jsonarray1.length();
        userMentionEntities = new UserMentionEntity[k];
        int j = 0;
        while (j < k) 
        {
            int l;
            try
            {
                userMentionEntities[j] = new UserMentionEntityJSONImpl(jsonarray1.getJSONObject(j));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new TwitterException(jsonobject);
            }
            j++;
        }
          goto _L8
        obj;
        ((JSONException) (obj)).printStackTrace();
        logger.warn("failed to parse contributors:" + jsonobject);
          goto _L3
_L2:
        contributors = null;
          goto _L3
_L8:
        if (((JSONObject) (obj)).isNull("urls")) goto _L10; else goto _L9
_L9:
        jsonarray1 = ((JSONObject) (obj)).getJSONArray("urls");
        l = jsonarray1.length();
        urlEntities = new URLEntity[l];
        j = 0;
_L11:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        urlEntities[j] = new URLEntityJSONImpl(jsonarray1.getJSONObject(j));
        j++;
        if (true) goto _L11; else goto _L10
_L10:
        if (((JSONObject) (obj)).isNull("hashtags")) goto _L13; else goto _L12
_L12:
        jsonarray1 = ((JSONObject) (obj)).getJSONArray("hashtags");
        l = jsonarray1.length();
        hashtagEntities = new HashtagEntity[l];
        j = 0;
_L14:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        hashtagEntities[j] = new HashtagEntityJSONImpl(jsonarray1.getJSONObject(j));
        j++;
        if (true) goto _L14; else goto _L13
_L13:
        if (((JSONObject) (obj)).isNull("media")) goto _L6; else goto _L15
_L15:
        obj = ((JSONObject) (obj)).getJSONArray("media");
        l = ((JSONArray) (obj)).length();
        mediaEntities = new MediaEntity[l];
        j = 0;
_L16:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        mediaEntities[j] = new MediaEntityJSONImpl(((JSONArray) (obj)).getJSONObject(j));
        j++;
        if (true) goto _L16; else goto _L6
_L6:
        JSONException jsonexception2;
        if (!jsonobject.isNull("annotations"))
        {
            try
            {
                annotations = new Annotations(jsonobject.getJSONArray("annotations"));
            }
            catch (JSONException jsonexception3) { }
        }
        if (jsonobject.isNull("current_user_retweet"))
        {
            break MISSING_BLOCK_LABEL_777;
        }
        myRetweetedStatus = new StatusJSONImpl(jsonobject.getJSONObject("current_user_retweet"));
        wasRetweetedByMe = true;
        return;
        jsonexception2;
        jsonexception2.printStackTrace();
        logger.warn("failed to parse current_user_retweet:" + jsonobject);
        return;
    }

    public int compareTo(Object obj)
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

    public Annotations getAnnotations()
    {
        return annotations;
    }

    public long[] getContributors()
    {
        if (contributors != null)
        {
            contributorsIDs = new long[contributors.length];
            int i = 0;
            do
            {
                if (i >= contributors.length)
                {
                    break;
                }
                try
                {
                    contributorsIDs[i] = Long.parseLong(contributors[i]);
                }
                catch (NumberFormatException numberformatexception)
                {
                    numberformatexception.printStackTrace();
                    logger.warn("failed to parse contributors:" + numberformatexception);
                }
                i++;
            } while (true);
            contributors = null;
        }
        return contributorsIDs;
    }

    public Date getCreatedAt()
    {
        return createdAt;
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

    public MediaEntity[] getMediaEntities()
    {
        return mediaEntities;
    }

    public Place getPlace()
    {
        return place;
    }

    public long getRetweetCount()
    {
        return retweetCount;
    }

    public Status getRetweetedStatus()
    {
        return retweetedStatus;
    }

    public String getSource()
    {
        return source;
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

    public boolean isRetweet()
    {
        return retweetedStatus != null;
    }

    public boolean isRetweetedByMe()
    {
        return wasRetweetedByMe;
    }

    public boolean isTruncated()
    {
        return isTruncated;
    }

    public String toString()
    {
        Object obj = null;
        StringBuffer stringbuffer = (new StringBuffer()).append("StatusJSONImpl{createdAt=").append(createdAt).append(", id=").append(id).append(", text='").append(text).append('\'').append(", source='").append(source).append('\'').append(", isTruncated=").append(isTruncated).append(", inReplyToStatusId=").append(inReplyToStatusId).append(", inReplyToUserId=").append(inReplyToUserId).append(", isFavorited=").append(isFavorited).append(", inReplyToScreenName='").append(inReplyToScreenName).append('\'').append(", geoLocation=").append(geoLocation).append(", place=").append(place).append(", retweetCount=").append(retweetCount).append(", wasRetweetedByMe=").append(wasRetweetedByMe).append(", contributors=");
        java.util.List list;
        if (contributorsIDs == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(new long[][] {
                contributorsIDs
            });
        }
        stringbuffer = stringbuffer.append(list).append(", annotations=").append(annotations).append(", retweetedStatus=").append(retweetedStatus).append(", userMentionEntities=");
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
            list = obj;
        } else
        {
            list = Arrays.asList(hashtagEntities);
        }
        return stringbuffer.append(list).append(", user=").append(user).append('}').toString();
    }

    static 
    {
        Class class1;
        if (class$twitter4j$internal$json$StatusJSONImpl == null)
        {
            class1 = _mthclass$("twitter4j.internal.json.StatusJSONImpl");
            class$twitter4j$internal$json$StatusJSONImpl = class1;
        } else
        {
            class1 = class$twitter4j$internal$json$StatusJSONImpl;
        }
        logger = Logger.getLogger(class1);
    }
}
