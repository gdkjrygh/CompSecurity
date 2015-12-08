// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.net.URL;
import java.util.Date;

// Referenced classes of package twitter4j:
//            TwitterResponse, Status

public interface User
    extends Comparable, TwitterResponse, Serializable
{

    public abstract Date getCreatedAt();

    public abstract String getDescription();

    public abstract int getFavouritesCount();

    public abstract int getFollowersCount();

    public abstract int getFriendsCount();

    public abstract long getId();

    public abstract String getLang();

    public abstract int getListedCount();

    public abstract String getLocation();

    public abstract String getName();

    public abstract String getProfileBackgroundColor();

    public abstract String getProfileBackgroundImageUrl();

    public abstract String getProfileBackgroundImageUrlHttps();

    public abstract URL getProfileImageURL();

    public abstract URL getProfileImageUrlHttps();

    public abstract String getProfileLinkColor();

    public abstract String getProfileSidebarBorderColor();

    public abstract String getProfileSidebarFillColor();

    public abstract String getProfileTextColor();

    public abstract String getScreenName();

    public abstract Status getStatus();

    public abstract int getStatusesCount();

    public abstract String getTimeZone();

    public abstract URL getURL();

    public abstract int getUtcOffset();

    public abstract boolean isContributorsEnabled();

    public abstract boolean isFollowRequestSent();

    public abstract boolean isGeoEnabled();

    public abstract boolean isProfileBackgroundTiled();

    public abstract boolean isProfileUseBackgroundImage();

    public abstract boolean isProtected();

    public abstract boolean isShowAllInlineMedia();

    public abstract boolean isTranslator();

    public abstract boolean isVerified();
}
