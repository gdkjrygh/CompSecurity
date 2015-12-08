// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import twitter4j.PagableResponseList;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, PagableResponseListImpl, ResponseListImpl, 
//            URLEntityJSONImpl, z_T4JInternalParseUtil, HTMLEntity, StatusJSONImpl

final class UserJSONImpl extends TwitterResponseImpl
    implements Serializable, User
{

    private static final long serialVersionUID = 0xa7eedbb8d7ed08daL;
    private Date createdAt;
    private String description;
    private URLEntity descriptionURLEntities[];
    private int favouritesCount;
    private int followersCount;
    private int friendsCount;
    private long id;
    private boolean isContributorsEnabled;
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
    {
        super(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
        }
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    UserJSONImpl(JSONObject jsonobject)
    {
        init(jsonobject);
    }

    static PagableResponseList createPagableUserList(HttpResponse httpresponse, Configuration configuration)
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
                DataObjectFactoryUtil.clearThreadLocalMap();
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
        jsonobject1 = jsonarray.getJSONObject(i);
        userjsonimpl = new UserJSONImpl(jsonobject1);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(userjsonimpl, jsonobject1);
        }
        httpresponse.add(userjsonimpl);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_45;
_L1:
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonobject);
        }
        return httpresponse;
    }

    static ResponseList createUserList(HttpResponse httpresponse, Configuration configuration)
    {
        return createUserList(httpresponse.asJSONArray(), httpresponse, configuration);
    }

    static ResponseList createUserList(JSONArray jsonarray, HttpResponse httpresponse, Configuration configuration)
    {
        int i;
        JSONObject jsonobject;
        UserJSONImpl userjsonimpl;
        int j;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.clearThreadLocalMap();
            }
            j = jsonarray.length();
            httpresponse = new ResponseListImpl(j, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new TwitterException(jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw jsonarray;
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
            DataObjectFactoryUtil.registerJSONObject(userjsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_114;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static URLEntity[] getURLEntitiesFromJSON(JSONObject jsonobject, String s)
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
    {
        URLEntity aurlentity[];
        id = z_T4JInternalParseUtil.getLong("id", jsonobject);
        name = z_T4JInternalParseUtil.getRawString("name", jsonobject);
        screenName = z_T4JInternalParseUtil.getRawString("screen_name", jsonobject);
        location = z_T4JInternalParseUtil.getRawString("location", jsonobject);
        descriptionURLEntities = getURLEntitiesFromJSON(jsonobject, "description");
        if (descriptionURLEntities != null)
        {
            break MISSING_BLOCK_LABEL_466;
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
        description = z_T4JInternalParseUtil.getRawString("description", jsonobject);
        if (description != null)
        {
            description = HTMLEntity.unescapeAndSlideEntityIncdices(description, null, descriptionURLEntities, null, null);
        }
        isContributorsEnabled = z_T4JInternalParseUtil.getBoolean("contributors_enabled", jsonobject);
        profileImageUrl = z_T4JInternalParseUtil.getRawString("profile_image_url", jsonobject);
        profileImageUrlHttps = z_T4JInternalParseUtil.getRawString("profile_image_url_https", jsonobject);
        url = z_T4JInternalParseUtil.getRawString("url", jsonobject);
        isProtected = z_T4JInternalParseUtil.getBoolean("protected", jsonobject);
        isGeoEnabled = z_T4JInternalParseUtil.getBoolean("geo_enabled", jsonobject);
        isVerified = z_T4JInternalParseUtil.getBoolean("verified", jsonobject);
        translator = z_T4JInternalParseUtil.getBoolean("is_translator", jsonobject);
        followersCount = z_T4JInternalParseUtil.getInt("followers_count", jsonobject);
        profileBackgroundColor = z_T4JInternalParseUtil.getRawString("profile_background_color", jsonobject);
        profileTextColor = z_T4JInternalParseUtil.getRawString("profile_text_color", jsonobject);
        profileLinkColor = z_T4JInternalParseUtil.getRawString("profile_link_color", jsonobject);
        profileSidebarFillColor = z_T4JInternalParseUtil.getRawString("profile_sidebar_fill_color", jsonobject);
        profileSidebarBorderColor = z_T4JInternalParseUtil.getRawString("profile_sidebar_border_color", jsonobject);
        profileUseBackgroundImage = z_T4JInternalParseUtil.getBoolean("profile_use_background_image", jsonobject);
        showAllInlineMedia = z_T4JInternalParseUtil.getBoolean("show_all_inline_media", jsonobject);
        friendsCount = z_T4JInternalParseUtil.getInt("friends_count", jsonobject);
        createdAt = z_T4JInternalParseUtil.getDate("created_at", jsonobject, "EEE MMM dd HH:mm:ss z yyyy");
        favouritesCount = z_T4JInternalParseUtil.getInt("favourites_count", jsonobject);
        utcOffset = z_T4JInternalParseUtil.getInt("utc_offset", jsonobject);
        timeZone = z_T4JInternalParseUtil.getRawString("time_zone", jsonobject);
        profileBackgroundImageUrl = z_T4JInternalParseUtil.getRawString("profile_background_image_url", jsonobject);
        profileBackgroundImageUrlHttps = z_T4JInternalParseUtil.getRawString("profile_background_image_url_https", jsonobject);
        profileBannerImageUrl = z_T4JInternalParseUtil.getRawString("profile_banner_url", jsonobject);
        profileBackgroundTiled = z_T4JInternalParseUtil.getBoolean("profile_background_tile", jsonobject);
        lang = z_T4JInternalParseUtil.getRawString("lang", jsonobject);
        statusesCount = z_T4JInternalParseUtil.getInt("statuses_count", jsonobject);
        listedCount = z_T4JInternalParseUtil.getInt("listed_count", jsonobject);
        isFollowRequestSent = z_T4JInternalParseUtil.getBoolean("follow_request_sent", jsonobject);
        if (!jsonobject.isNull("status"))
        {
            status = new StatusJSONImpl(jsonobject.getJSONObject("status"));
            return;
        }
        break MISSING_BLOCK_LABEL_514;
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

    public final volatile int compareTo(Object obj)
    {
        return compareTo((User)obj);
    }

    public final int compareTo(User user)
    {
        return (int)(id - user.getId());
    }

    public final boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if ((obj instanceof User) && ((User)obj).getId() == id)
            {
                return true;
            }
        }
        return false;
    }

    public final String getBiggerProfileImageURL()
    {
        return toResizedURL(profileImageUrl, "_bigger");
    }

    public final String getBiggerProfileImageURLHttps()
    {
        return toResizedURL(profileImageUrlHttps, "_bigger");
    }

    public final Date getCreatedAt()
    {
        return createdAt;
    }

    public final String getDescription()
    {
        return description;
    }

    public final URLEntity[] getDescriptionURLEntities()
    {
        return descriptionURLEntities;
    }

    public final int getFavouritesCount()
    {
        return favouritesCount;
    }

    public final int getFollowersCount()
    {
        return followersCount;
    }

    public final int getFriendsCount()
    {
        return friendsCount;
    }

    public final long getId()
    {
        return id;
    }

    public final String getLang()
    {
        return lang;
    }

    public final int getListedCount()
    {
        return listedCount;
    }

    public final String getLocation()
    {
        return location;
    }

    public final String getMiniProfileImageURL()
    {
        return toResizedURL(profileImageUrl, "_mini");
    }

    public final String getMiniProfileImageURLHttps()
    {
        return toResizedURL(profileImageUrlHttps, "_mini");
    }

    public final String getName()
    {
        return name;
    }

    public final String getOriginalProfileImageURL()
    {
        return toResizedURL(profileImageUrl, "");
    }

    public final String getOriginalProfileImageURLHttps()
    {
        return toResizedURL(profileImageUrlHttps, "");
    }

    public final String getProfileBackgroundColor()
    {
        return profileBackgroundColor;
    }

    public final String getProfileBackgroundImageURL()
    {
        return profileBackgroundImageUrl;
    }

    public final String getProfileBackgroundImageUrl()
    {
        return getProfileBackgroundImageURL();
    }

    public final String getProfileBackgroundImageUrlHttps()
    {
        return profileBackgroundImageUrlHttps;
    }

    public final String getProfileBannerIPadRetinaURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/ipad_retina").toString();
        } else
        {
            return null;
        }
    }

    public final String getProfileBannerIPadURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/ipad").toString();
        } else
        {
            return null;
        }
    }

    public final String getProfileBannerMobileRetinaURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/mobile_retina").toString();
        } else
        {
            return null;
        }
    }

    public final String getProfileBannerMobileURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/mobile").toString();
        } else
        {
            return null;
        }
    }

    public final String getProfileBannerRetinaURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/web_retina").toString();
        } else
        {
            return null;
        }
    }

    public final String getProfileBannerURL()
    {
        if (profileBannerImageUrl != null)
        {
            return (new StringBuilder()).append(profileBannerImageUrl).append("/web").toString();
        } else
        {
            return null;
        }
    }

    public final String getProfileImageURL()
    {
        return profileImageUrl;
    }

    public final String getProfileImageURLHttps()
    {
        return profileImageUrlHttps;
    }

    public final URL getProfileImageUrlHttps()
    {
        URL url1;
        try
        {
            url1 = new URL(profileImageUrlHttps);
        }
        catch (MalformedURLException malformedurlexception)
        {
            return null;
        }
        return url1;
    }

    public final String getProfileLinkColor()
    {
        return profileLinkColor;
    }

    public final String getProfileSidebarBorderColor()
    {
        return profileSidebarBorderColor;
    }

    public final String getProfileSidebarFillColor()
    {
        return profileSidebarFillColor;
    }

    public final String getProfileTextColor()
    {
        return profileTextColor;
    }

    public final String getScreenName()
    {
        return screenName;
    }

    public final Status getStatus()
    {
        return status;
    }

    public final int getStatusesCount()
    {
        return statusesCount;
    }

    public final String getTimeZone()
    {
        return timeZone;
    }

    public final String getURL()
    {
        return url;
    }

    public final URLEntity getURLEntity()
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

    public final int getUtcOffset()
    {
        return utcOffset;
    }

    public final int hashCode()
    {
        return (int)id;
    }

    public final boolean isContributorsEnabled()
    {
        return isContributorsEnabled;
    }

    public final boolean isFollowRequestSent()
    {
        return isFollowRequestSent;
    }

    public final boolean isGeoEnabled()
    {
        return isGeoEnabled;
    }

    public final boolean isProfileBackgroundTiled()
    {
        return profileBackgroundTiled;
    }

    public final boolean isProfileUseBackgroundImage()
    {
        return profileUseBackgroundImage;
    }

    public final boolean isProtected()
    {
        return isProtected;
    }

    public final boolean isShowAllInlineMedia()
    {
        return showAllInlineMedia;
    }

    public final boolean isTranslator()
    {
        return translator;
    }

    public final boolean isVerified()
    {
        return isVerified;
    }

    public final String toString()
    {
        return (new StringBuilder("UserJSONImpl{id=")).append(id).append(", name='").append(name).append('\'').append(", screenName='").append(screenName).append('\'').append(", location='").append(location).append('\'').append(", description='").append(description).append('\'').append(", isContributorsEnabled=").append(isContributorsEnabled).append(", profileImageUrl='").append(profileImageUrl).append('\'').append(", profileImageUrlHttps='").append(profileImageUrlHttps).append('\'').append(", url='").append(url).append('\'').append(", isProtected=").append(isProtected).append(", followersCount=").append(followersCount).append(", status=").append(status).append(", profileBackgroundColor='").append(profileBackgroundColor).append('\'').append(", profileTextColor='").append(profileTextColor).append('\'').append(", profileLinkColor='").append(profileLinkColor).append('\'').append(", profileSidebarFillColor='").append(profileSidebarFillColor).append('\'').append(", profileSidebarBorderColor='").append(profileSidebarBorderColor).append('\'').append(", profileUseBackgroundImage=").append(profileUseBackgroundImage).append(", showAllInlineMedia=").append(showAllInlineMedia).append(", friendsCount=").append(friendsCount).append(", createdAt=").append(createdAt).append(", favouritesCount=").append(favouritesCount).append(", utcOffset=").append(utcOffset).append(", timeZone='").append(timeZone).append('\'').append(", profileBackgroundImageUrl='").append(profileBackgroundImageUrl).append('\'').append(", profileBackgroundImageUrlHttps='").append(profileBackgroundImageUrlHttps).append('\'').append(", profileBackgroundTiled=").append(profileBackgroundTiled).append(", lang='").append(lang).append('\'').append(", statusesCount=").append(statusesCount).append(", isGeoEnabled=").append(isGeoEnabled).append(", isVerified=").append(isVerified).append(", translator=").append(translator).append(", listedCount=").append(listedCount).append(", isFollowRequestSent=").append(isFollowRequestSent).append('}').toString();
    }
}
