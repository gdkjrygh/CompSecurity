// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.Date;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterResponseImpl, User, TwitterException, TwitterObjectFactory, 
//            HttpResponse, JSONException, JSONObject, JSONArray, 
//            PagableResponseListImpl, PagableResponseList, ResponseListImpl, ResponseList, 
//            URLEntity, URLEntityJSONImpl, ParseUtil, HTMLEntity, 
//            StatusJSONImpl, Status

final class UserJSONImpl extends TwitterResponseImpl
    implements Serializable, User
{

    private static final long serialVersionUID = 0xb463de6321399809L;
    private Date createdAt;
    private String description;
    private URLEntity descriptionURLEntities[];
    private int favouritesCount;
    private int followersCount;
    private int friendsCount;
    private long id;
    private boolean isContributorsEnabled;
    private boolean isDefaultProfile;
    private boolean isDefaultProfileImage;
    private boolean isFollowRequestSent;
    private boolean isGeoEnabled;
    private boolean isProtected;
    private boolean isVerified;
    private String lang;
    private int listedCount;
    private String location;
    private String name;
    private String profileBackgroundColor;
    private String profileBackgroundImageUrl;
    private String profileBackgroundImageUrlHttps;
    private boolean profileBackgroundTiled;
    private String profileBannerImageUrl;
    private String profileImageUrl;
    private String profileImageUrlHttps;
    private String profileLinkColor;
    private String profileSidebarBorderColor;
    private String profileSidebarFillColor;
    private String profileTextColor;
    private boolean profileUseBackgroundImage;
    private String screenName;
    private boolean showAllInlineMedia;
    private Status status;
    private int statusesCount;
    private String timeZone;
    private boolean translator;
    private String url;
    private URLEntity urlEntity;
    private int utcOffset;

    UserJSONImpl()
    {
    }

    UserJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(this, httpresponse);
        }
    }

    UserJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    static PagableResponseList createPagableUserList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        JSONObject jsonobject1;
        UserJSONImpl userjsonimpl;
        int i;
        int j;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            jsonobject = httpresponse.asJSONObject();
            jsonarray = jsonobject.getJSONArray("users");
            j = jsonarray.length();
            httpresponse = new PagableResponseListImpl(j, jsonobject, httpresponse);
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
        jsonobject1 = jsonarray.getJSONObject(i);
        userjsonimpl = new UserJSONImpl(jsonobject1);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(userjsonimpl, jsonobject1);
        }
        httpresponse.add(userjsonimpl);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_45;
_L1:
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonobject);
        }
        return httpresponse;
    }

    static ResponseList createUserList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        return createUserList(httpresponse.asJSONArray(), httpresponse, configuration);
    }

    static ResponseList createUserList(JSONArray jsonarray, HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        int i;
        JSONObject jsonobject;
        UserJSONImpl userjsonimpl;
        int j;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            j = jsonarray.length();
            httpresponse = new ResponseListImpl(j, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new TwitterException(jsonarray);
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        jsonobject = jsonarray.getJSONObject(i);
        userjsonimpl = new UserJSONImpl(jsonobject);
        httpresponse.add(userjsonimpl);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(userjsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_111;
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static URLEntity[] getURLEntitiesFromJSON(JSONObject jsonobject, String s)
        throws JSONException, TwitterException
    {
label0:
        {
            if (!jsonobject.isNull("entities"))
            {
                jsonobject = jsonobject.getJSONObject("entities");
                if (!jsonobject.isNull(s))
                {
                    jsonobject = jsonobject.getJSONObject(s);
                    if (!jsonobject.isNull("urls"))
                    {
                        JSONArray jsonarray = jsonobject.getJSONArray("urls");
                        int j = jsonarray.length();
                        s = new URLEntity[j];
                        int i = 0;
                        do
                        {
                            jsonobject = s;
                            if (i >= j)
                            {
                                break;
                            }
                            s[i] = new URLEntityJSONImpl(jsonarray.getJSONObject(i));
                            i++;
                        } while (true);
                        break label0;
                    }
                }
            }
            jsonobject = null;
        }
        return jsonobject;
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        URLEntity aurlentity[];
        id = ParseUtil.getLong("id", jsonobject);
        name = ParseUtil.getRawString("name", jsonobject);
        screenName = ParseUtil.getRawString("screen_name", jsonobject);
        location = ParseUtil.getRawString("location", jsonobject);
        descriptionURLEntities = getURLEntitiesFromJSON(jsonobject, "description");
        if (descriptionURLEntities != null)
        {
            break MISSING_BLOCK_LABEL_488;
        }
        aurlentity = new URLEntity[0];
_L1:
        descriptionURLEntities = aurlentity;
        aurlentity = getURLEntitiesFromJSON(jsonobject, "url");
        if (aurlentity == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (aurlentity.length > 0)
        {
            urlEntity = aurlentity[0];
        }
        description = ParseUtil.getRawString("description", jsonobject);
        if (description != null)
        {
            description = HTMLEntity.unescapeAndSlideEntityIncdices(description, null, descriptionURLEntities, null, null);
        }
        isContributorsEnabled = ParseUtil.getBoolean("contributors_enabled", jsonobject);
        profileImageUrl = ParseUtil.getRawString("profile_image_url", jsonobject);
        profileImageUrlHttps = ParseUtil.getRawString("profile_image_url_https", jsonobject);
        isDefaultProfileImage = ParseUtil.getBoolean("default_profile_image", jsonobject);
        url = ParseUtil.getRawString("url", jsonobject);
        isProtected = ParseUtil.getBoolean("protected", jsonobject);
        isGeoEnabled = ParseUtil.getBoolean("geo_enabled", jsonobject);
        isVerified = ParseUtil.getBoolean("verified", jsonobject);
        translator = ParseUtil.getBoolean("is_translator", jsonobject);
        followersCount = ParseUtil.getInt("followers_count", jsonobject);
        profileBackgroundColor = ParseUtil.getRawString("profile_background_color", jsonobject);
        profileTextColor = ParseUtil.getRawString("profile_text_color", jsonobject);
        profileLinkColor = ParseUtil.getRawString("profile_link_color", jsonobject);
        profileSidebarFillColor = ParseUtil.getRawString("profile_sidebar_fill_color", jsonobject);
        profileSidebarBorderColor = ParseUtil.getRawString("profile_sidebar_border_color", jsonobject);
        profileUseBackgroundImage = ParseUtil.getBoolean("profile_use_background_image", jsonobject);
        isDefaultProfile = ParseUtil.getBoolean("default_profile", jsonobject);
        showAllInlineMedia = ParseUtil.getBoolean("show_all_inline_media", jsonobject);
        friendsCount = ParseUtil.getInt("friends_count", jsonobject);
        createdAt = ParseUtil.getDate("created_at", jsonobject, "EEE MMM dd HH:mm:ss z yyyy");
        favouritesCount = ParseUtil.getInt("favourites_count", jsonobject);
        utcOffset = ParseUtil.getInt("utc_offset", jsonobject);
        timeZone = ParseUtil.getRawString("time_zone", jsonobject);
        profileBackgroundImageUrl = ParseUtil.getRawString("profile_background_image_url", jsonobject);
        profileBackgroundImageUrlHttps = ParseUtil.getRawString("profile_background_image_url_https", jsonobject);
        profileBannerImageUrl = ParseUtil.getRawString("profile_banner_url", jsonobject);
        profileBackgroundTiled = ParseUtil.getBoolean("profile_background_tile", jsonobject);
        lang = ParseUtil.getRawString("lang", jsonobject);
        statusesCount = ParseUtil.getInt("statuses_count", jsonobject);
        listedCount = ParseUtil.getInt("listed_count", jsonobject);
        isFollowRequestSent = ParseUtil.getBoolean("follow_request_sent", jsonobject);
        if (!jsonobject.isNull("status"))
        {
            status = new StatusJSONImpl(jsonobject.getJSONObject("status"));
            return;
        }
        break MISSING_BLOCK_LABEL_536;
        try
        {
            aurlentity = descriptionURLEntities;
        }
        catch (JSONException jsonexception)
        {
            throw new TwitterException((new StringBuilder()).append(jsonexception.getMessage()).append(":").append(jsonobject.toString()).toString(), jsonexception);
        }
          goto _L1
    }

    private String toResizedURL(String s, String s1)
    {
        if (s != null)
        {
            int i = s.lastIndexOf("_");
            int j = s.lastIndexOf(".");
            int k = s.lastIndexOf("/");
            String s2 = (new StringBuilder()).append(s.substring(0, i)).append(s1).toString();
            s1 = s2;
            if (j > k)
            {
                s1 = (new StringBuilder()).append(s2).append(s.substring(j)).toString();
            }
            return s1;
        } else
        {
            return null;
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((User)obj);
    }

    public int compareTo(User user)
    {
        return (int)(id - user.getId());
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
        if (!(obj instanceof User))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((User)obj).getId() == id) goto _L4; else goto _L5
_L5:
        return false;
    }

    public String getBiggerProfileImageURL()
    {
        return toResizedURL(profileImageUrl, "_bigger");
    }

    public String getBiggerProfileImageURLHttps()
    {
        return toResizedURL(profileImageUrlHttps, "_bigger");
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getDescription()
    {
        return description;
    }

    public URLEntity[] getDescriptionURLEntities()
    {
        return descriptionURLEntities;
    }

    public int getFavouritesCount()
    {
        return favouritesCount;
    }

    public int getFollowersCount()
    {
        return followersCount;
    }

    public int getFriendsCount()
    {
        return friendsCount;
    }

    public long getId()
    {
        return id;
    }

    public String getLang()
    {
        return lang;
    }

    public int getListedCount()
    {
        return listedCount;
    }

    public String getLocation()
    {
        return location;
    }

    public String getMiniProfileImageURL()
    {
        return toResizedURL(profileImageUrl, "_mini");
    }

    public String getMiniProfileImageURLHttps()
    {
        return toResizedURL(profileImageUrlHttps, "_mini");
    }

    public String getName()
    {
        return name;
    }

    public String getOriginalProfileImageURL()
    {
        return toResizedURL(profileImageUrl, "");
    }

    public String getOriginalProfileImageURLHttps()
    {
        return toResizedURL(profileImageUrlHttps, "");
    }

    public String getProfileBackgroundColor()
    {
        return profileBackgroundColor;
    }

    public String getProfileBackgroundImageURL()
    {
        return profileBackgroundImageUrl;
    }

    public String getProfileBackgroundImageUrlHttps()
    {
        return profileBackgroundImageUrlHttps;
    }

    public String getProfileBannerIPadRetinaURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/ipad_retina").toString();
        } else
        {
            return null;
        }
    }

    public String getProfileBannerIPadURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/ipad").toString();
        } else
        {
            return null;
        }
    }

    public String getProfileBannerMobileRetinaURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/mobile_retina").toString();
        } else
        {
            return null;
        }
    }

    public String getProfileBannerMobileURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/mobile").toString();
        } else
        {
            return null;
        }
    }

    public String getProfileBannerRetinaURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/web_retina").toString();
        } else
        {
            return null;
        }
    }

    public String getProfileBannerURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/web").toString();
        } else
        {
            return null;
        }
    }

    public String getProfileImageURL()
    {
        return profileImageUrl;
    }

    public String getProfileImageURLHttps()
    {
        return profileImageUrlHttps;
    }

    public String getProfileLinkColor()
    {
        return profileLinkColor;
    }

    public String getProfileSidebarBorderColor()
    {
        return profileSidebarBorderColor;
    }

    public String getProfileSidebarFillColor()
    {
        return profileSidebarFillColor;
    }

    public String getProfileTextColor()
    {
        return profileTextColor;
    }

    public String getScreenName()
    {
        return screenName;
    }

    public Status getStatus()
    {
        return status;
    }

    public int getStatusesCount()
    {
        return statusesCount;
    }

    public String getTimeZone()
    {
        return timeZone;
    }

    public String getURL()
    {
        return url;
    }

    public URLEntity getURLEntity()
    {
        if (urlEntity == null)
        {
            String s;
            if (url == null)
            {
                s = "";
            } else
            {
                s = url;
            }
            urlEntity = new URLEntityJSONImpl(0, s.length(), s, s, s);
        }
        return urlEntity;
    }

    public int getUtcOffset()
    {
        return utcOffset;
    }

    public int hashCode()
    {
        return (int)id;
    }

    public boolean isContributorsEnabled()
    {
        return isContributorsEnabled;
    }

    public boolean isDefaultProfile()
    {
        return isDefaultProfile;
    }

    public boolean isDefaultProfileImage()
    {
        return isDefaultProfileImage;
    }

    public boolean isFollowRequestSent()
    {
        return isFollowRequestSent;
    }

    public boolean isGeoEnabled()
    {
        return isGeoEnabled;
    }

    public boolean isProfileBackgroundTiled()
    {
        return profileBackgroundTiled;
    }

    public boolean isProfileUseBackgroundImage()
    {
        return profileUseBackgroundImage;
    }

    public boolean isProtected()
    {
        return isProtected;
    }

    public boolean isShowAllInlineMedia()
    {
        return showAllInlineMedia;
    }

    public boolean isTranslator()
    {
        return translator;
    }

    public boolean isVerified()
    {
        return isVerified;
    }

    public String toString()
    {
        return (new StringBuilder()).append("UserJSONImpl{id=").append(id).append(", name='").append(name).append('\'').append(", screenName='").append(screenName).append('\'').append(", location='").append(location).append('\'').append(", description='").append(description).append('\'').append(", isContributorsEnabled=").append(isContributorsEnabled).append(", profileImageUrl='").append(profileImageUrl).append('\'').append(", profileImageUrlHttps='").append(profileImageUrlHttps).append('\'').append(", isDefaultProfileImage=").append(isDefaultProfileImage).append(", url='").append(url).append('\'').append(", isProtected=").append(isProtected).append(", followersCount=").append(followersCount).append(", status=").append(status).append(", profileBackgroundColor='").append(profileBackgroundColor).append('\'').append(", profileTextColor='").append(profileTextColor).append('\'').append(", profileLinkColor='").append(profileLinkColor).append('\'').append(", profileSidebarFillColor='").append(profileSidebarFillColor).append('\'').append(", profileSidebarBorderColor='").append(profileSidebarBorderColor).append('\'').append(", profileUseBackgroundImage=").append(profileUseBackgroundImage).append(", isDefaultProfile=").append(isDefaultProfile).append(", showAllInlineMedia=").append(showAllInlineMedia).append(", friendsCount=").append(friendsCount).append(", createdAt=").append(createdAt).append(", favouritesCount=").append(favouritesCount).append(", utcOffset=").append(utcOffset).append(", timeZone='").append(timeZone).append('\'').append(", profileBackgroundImageUrl='").append(profileBackgroundImageUrl).append('\'').append(", profileBackgroundImageUrlHttps='").append(profileBackgroundImageUrlHttps).append('\'').append(", profileBackgroundTiled=").append(profileBackgroundTiled).append(", lang='").append(lang).append('\'').append(", statusesCount=").append(statusesCount).append(", isGeoEnabled=").append(isGeoEnabled).append(", isVerified=").append(isVerified).append(", translator=").append(translator).append(", listedCount=").append(listedCount).append(", isFollowRequestSent=").append(isFollowRequestSent).append('}').toString();
    }
}
