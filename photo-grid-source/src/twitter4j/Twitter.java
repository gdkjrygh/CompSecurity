// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import twitter4j.api.DirectMessagesResources;
import twitter4j.api.FavoritesResources;
import twitter4j.api.FriendsFollowersResources;
import twitter4j.api.HelpResources;
import twitter4j.api.ListsResources;
import twitter4j.api.PlacesGeoResources;
import twitter4j.api.SavedSearchesResources;
import twitter4j.api.SearchResource;
import twitter4j.api.SpamReportingResource;
import twitter4j.api.SuggestedUsersResources;
import twitter4j.api.TimelinesResources;
import twitter4j.api.TrendsResources;
import twitter4j.api.TweetsResources;
import twitter4j.api.UsersResources;
import twitter4j.auth.OAuth2Support;
import twitter4j.auth.OAuthSupport;

// Referenced classes of package twitter4j:
//            TwitterBase

public interface Twitter
    extends Serializable, TwitterBase, DirectMessagesResources, FavoritesResources, FriendsFollowersResources, HelpResources, ListsResources, PlacesGeoResources, SavedSearchesResources, SearchResource, SpamReportingResource, SuggestedUsersResources, TimelinesResources, TrendsResources, TweetsResources, UsersResources, OAuth2Support, OAuthSupport
{

    public abstract DirectMessagesResources directMessages();

    public abstract FavoritesResources favorites();

    public abstract FriendsFollowersResources friendsFollowers();

    public abstract HelpResources help();

    public abstract ListsResources list();

    public abstract PlacesGeoResources placesGeo();

    public abstract SavedSearchesResources savedSearches();

    public abstract SearchResource search();

    public abstract SpamReportingResource spamReporting();

    public abstract SuggestedUsersResources suggestedUsers();

    public abstract TimelinesResources timelines();

    public abstract TrendsResources trends();

    public abstract TweetsResources tweets();

    public abstract UsersResources users();
}
