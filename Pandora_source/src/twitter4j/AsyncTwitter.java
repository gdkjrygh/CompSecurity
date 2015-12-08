// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import twitter4j.api.DirectMessagesResourcesAsync;
import twitter4j.api.FavoritesResourcesAsync;
import twitter4j.api.FriendsFollowersResourcesAsync;
import twitter4j.api.HelpResourcesAsync;
import twitter4j.api.ListsResourcesAsync;
import twitter4j.api.PlacesGeoResourcesAsync;
import twitter4j.api.SavedSearchesResourcesAsync;
import twitter4j.api.SearchResourceAsync;
import twitter4j.api.SpamReportingResourceAsync;
import twitter4j.api.SuggestedUsersResourcesAsync;
import twitter4j.api.TimelinesResourcesAsync;
import twitter4j.api.TrendsResourcesAsync;
import twitter4j.api.TweetsResourcesAsync;
import twitter4j.api.UsersResourcesAsync;
import twitter4j.auth.AsyncOAuth2Support;
import twitter4j.auth.AsyncOAuthSupport;
import twitter4j.auth.OAuth2Support;
import twitter4j.auth.OAuthSupport;

// Referenced classes of package twitter4j:
//            TwitterBase, TwitterListener

public interface AsyncTwitter
    extends Serializable, TwitterBase, DirectMessagesResourcesAsync, FavoritesResourcesAsync, FriendsFollowersResourcesAsync, HelpResourcesAsync, ListsResourcesAsync, PlacesGeoResourcesAsync, SavedSearchesResourcesAsync, SearchResourceAsync, SpamReportingResourceAsync, SuggestedUsersResourcesAsync, TimelinesResourcesAsync, TrendsResourcesAsync, TweetsResourcesAsync, UsersResourcesAsync, AsyncOAuth2Support, AsyncOAuthSupport, OAuth2Support, OAuthSupport
{

    public abstract void addListener(TwitterListener twitterlistener);

    public abstract void shutdown();
}
