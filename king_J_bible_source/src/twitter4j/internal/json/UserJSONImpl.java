// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.PagableResponseList;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, PagableResponseListImpl, ResponseListImpl, 
//            StatusJSONImpl

final class UserJSONImpl extends TwitterResponseImpl
    implements User, Serializable
{

    private static final long serialVersionUID = 0xa7eedbb8d7ed08daL;
    private Date createdAt;
    private String description;
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
    private int utcOffset;

    UserJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    UserJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
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

    static ResponseList createUserList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        return createUserList(httpresponse.asJSONArray(), httpresponse, configuration);
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        try
        {
            id = z_T4JInternalParseUtil.getLong("id", jsonobject);
            name = z_T4JInternalParseUtil.getRawString("name", jsonobject);
            screenName = z_T4JInternalParseUtil.getRawString("screen_name", jsonobject);
            location = z_T4JInternalParseUtil.getRawString("location", jsonobject);
            description = z_T4JInternalParseUtil.getRawString("description", jsonobject);
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
            profileBackgroundTiled = z_T4JInternalParseUtil.getBoolean("profile_background_tile", jsonobject);
            lang = z_T4JInternalParseUtil.getRawString("lang", jsonobject);
            statusesCount = z_T4JInternalParseUtil.getInt("statuses_count", jsonobject);
            listedCount = z_T4JInternalParseUtil.getInt("listed_count", jsonobject);
            isFollowRequestSent = z_T4JInternalParseUtil.getBoolean("follow_request_sent", jsonobject);
            if (!jsonobject.isNull("status"))
            {
                status = new StatusJSONImpl(jsonobject.getJSONObject("status"));
            }
            return;
        }
        catch (JSONException jsonexception)
        {
            throw new TwitterException(jsonexception.getMessage() + ":" + jsonobject.toString(), jsonexception);
        }
    }

    public int compareTo(Object obj)
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

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getDescription()
    {
        return description;
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

    public String getName()
    {
        return name;
    }

    public String getProfileBackgroundColor()
    {
        return profileBackgroundColor;
    }

    public String getProfileBackgroundImageUrl()
    {
        return profileBackgroundImageUrl;
    }

    public String getProfileBackgroundImageUrlHttps()
    {
        return profileBackgroundImageUrlHttps;
    }

    public URL getProfileImageURL()
    {
        URL url1;
        try
        {
            url1 = new URL(profileImageUrl);
        }
        catch (MalformedURLException malformedurlexception)
        {
            return null;
        }
        return url1;
    }

    public URL getProfileImageUrlHttps()
    {
        if (profileImageUrlHttps == null)
        {
            return null;
        }
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

    public URL getURL()
    {
        URL url1;
        try
        {
            url1 = new URL(url);
        }
        catch (MalformedURLException malformedurlexception)
        {
            return null;
        }
        return url1;
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
        return "UserJSONImpl{id=" + id + ", name='" + name + '\'' + ", screenName='" + screenName + '\'' + ", location='" + location + '\'' + ", description='" + description + '\'' + ", isContributorsEnabled=" + isContributorsEnabled + ", profileImageUrl='" + profileImageUrl + '\'' + ", profileImageUrlHttps='" + profileImageUrlHttps + '\'' + ", url='" + url + '\'' + ", isProtected=" + isProtected + ", followersCount=" + followersCount + ", status=" + status + ", profileBackgroundColor='" + profileBackgroundColor + '\'' + ", profileTextColor='" + profileTextColor + '\'' + ", profileLinkColor='" + profileLinkColor + '\'' + ", profileSidebarFillColor='" + profileSidebarFillColor + '\'' + ", profileSidebarBorderColor='" + profileSidebarBorderColor + '\'' + ", profileUseBackgroundImage=" + profileUseBackgroundImage + ", showAllInlineMedia=" + showAllInlineMedia + ", friendsCount=" + friendsCount + ", createdAt=" + createdAt + ", favouritesCount=" + favouritesCount + ", utcOffset=" + utcOffset + ", timeZone='" + timeZone + '\'' + ", profileBackgroundImageUrl='" + profileBackgroundImageUrl + '\'' + ", profileBackgroundImageUrlHttps='" + profileBackgroundImageUrlHttps + '\'' + ", profileBackgroundTiled=" + profileBackgroundTiled + ", lang='" + lang + '\'' + ", statusesCount=" + statusesCount + ", isGeoEnabled=" + isGeoEnabled + ", isVerified=" + isVerified + ", translator=" + translator + ", listedCount=" + listedCount + ", isFollowRequestSent=" + isFollowRequestSent + '}';
    }
}
