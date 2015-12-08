// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Map;
import twitter4j.auth.AccessToken;
import twitter4j.auth.OAuth2Token;
import twitter4j.auth.RequestToken;

// Referenced classes of package twitter4j:
//            TwitterListener, User, Status, SavedSearch, 
//            UserList, DirectMessage, TwitterAPIConfiguration, AccountSettings, 
//            ResponseList, IDs, PagableResponseList, Place, 
//            OEmbed, Trends, Relationship, TwitterException, 
//            TwitterMethod, QueryResult

public class TwitterAdapter
    implements TwitterListener
{

    public TwitterAdapter()
    {
    }

    public void checkedUserListMembership(User user)
    {
    }

    public void checkedUserListSubscription(User user)
    {
    }

    public void createdBlock(User user)
    {
    }

    public void createdFavorite(Status status)
    {
    }

    public void createdFriendship(User user)
    {
    }

    public void createdMute(User user)
    {
    }

    public void createdSavedSearch(SavedSearch savedsearch)
    {
    }

    public void createdUserList(UserList userlist)
    {
    }

    public void createdUserListMember(UserList userlist)
    {
    }

    public void createdUserListMembers(UserList userlist)
    {
    }

    public void destroyedBlock(User user)
    {
    }

    public void destroyedDirectMessage(DirectMessage directmessage)
    {
    }

    public void destroyedFavorite(Status status)
    {
    }

    public void destroyedFriendship(User user)
    {
    }

    public void destroyedMute(User user)
    {
    }

    public void destroyedSavedSearch(SavedSearch savedsearch)
    {
    }

    public void destroyedStatus(Status status)
    {
    }

    public void destroyedUserList(UserList userlist)
    {
    }

    public void destroyedUserListMember(UserList userlist)
    {
    }

    public void gotAPIConfiguration(TwitterAPIConfiguration twitterapiconfiguration)
    {
    }

    public void gotAccountSettings(AccountSettings accountsettings)
    {
    }

    public void gotAvailableTrends(ResponseList responselist)
    {
    }

    public void gotBlockIDs(IDs ids)
    {
    }

    public void gotBlocksList(ResponseList responselist)
    {
    }

    public void gotClosestTrends(ResponseList responselist)
    {
    }

    public void gotContributees(ResponseList responselist)
    {
    }

    public void gotContributors(ResponseList responselist)
    {
    }

    public void gotDirectMessage(DirectMessage directmessage)
    {
    }

    public void gotDirectMessages(ResponseList responselist)
    {
    }

    public void gotFavorites(ResponseList responselist)
    {
    }

    public void gotFollowersIDs(IDs ids)
    {
    }

    public void gotFollowersList(PagableResponseList pagableresponselist)
    {
    }

    public void gotFriendsIDs(IDs ids)
    {
    }

    public void gotFriendsList(PagableResponseList pagableresponselist)
    {
    }

    public void gotGeoDetails(Place place)
    {
    }

    public void gotHomeTimeline(ResponseList responselist)
    {
    }

    public void gotIncomingFriendships(IDs ids)
    {
    }

    public void gotLanguages(ResponseList responselist)
    {
    }

    public void gotMemberSuggestions(ResponseList responselist)
    {
    }

    public void gotMentions(ResponseList responselist)
    {
    }

    public void gotMuteIDs(IDs ids)
    {
    }

    public void gotMutesList(ResponseList responselist)
    {
    }

    public void gotOAuth2Token(OAuth2Token oauth2token)
    {
    }

    public void gotOAuthAccessToken(AccessToken accesstoken)
    {
    }

    public void gotOAuthRequestToken(RequestToken requesttoken)
    {
    }

    public void gotOEmbed(OEmbed oembed)
    {
    }

    public void gotOutgoingFriendships(IDs ids)
    {
    }

    public void gotPlaceTrends(Trends trends)
    {
    }

    public void gotPrivacyPolicy(String s)
    {
    }

    public void gotRateLimitStatus(Map map)
    {
    }

    public void gotRetweets(ResponseList responselist)
    {
    }

    public void gotRetweetsOfMe(ResponseList responselist)
    {
    }

    public void gotReverseGeoCode(ResponseList responselist)
    {
    }

    public void gotSavedSearch(SavedSearch savedsearch)
    {
    }

    public void gotSavedSearches(ResponseList responselist)
    {
    }

    public void gotSentDirectMessages(ResponseList responselist)
    {
    }

    public void gotShowFriendship(Relationship relationship)
    {
    }

    public void gotShowStatus(Status status)
    {
    }

    public void gotShowUserList(UserList userlist)
    {
    }

    public void gotSimilarPlaces(ResponseList responselist)
    {
    }

    public void gotSuggestedUserCategories(ResponseList responselist)
    {
    }

    public void gotTermsOfService(String s)
    {
    }

    public void gotUserDetail(User user)
    {
    }

    public void gotUserListMembers(PagableResponseList pagableresponselist)
    {
    }

    public void gotUserListMemberships(PagableResponseList pagableresponselist)
    {
    }

    public void gotUserListStatuses(ResponseList responselist)
    {
    }

    public void gotUserListSubscribers(PagableResponseList pagableresponselist)
    {
    }

    public void gotUserListSubscriptions(PagableResponseList pagableresponselist)
    {
    }

    public void gotUserLists(ResponseList responselist)
    {
    }

    public void gotUserSuggestions(ResponseList responselist)
    {
    }

    public void gotUserTimeline(ResponseList responselist)
    {
    }

    public void lookedUpFriendships(ResponseList responselist)
    {
    }

    public void lookedup(ResponseList responselist)
    {
    }

    public void lookedupUsers(ResponseList responselist)
    {
    }

    public void onException(TwitterException twitterexception, TwitterMethod twittermethod)
    {
    }

    public void removedProfileBanner()
    {
    }

    public void reportedSpam(User user)
    {
    }

    public void retweetedStatus(Status status)
    {
    }

    public void searched(QueryResult queryresult)
    {
    }

    public void searchedPlaces(ResponseList responselist)
    {
    }

    public void searchedUser(ResponseList responselist)
    {
    }

    public void sentDirectMessage(DirectMessage directmessage)
    {
    }

    public void subscribedUserList(UserList userlist)
    {
    }

    public void unsubscribedUserList(UserList userlist)
    {
    }

    public void updatedAccountSettings(AccountSettings accountsettings)
    {
    }

    public void updatedFriendship(Relationship relationship)
    {
    }

    public void updatedProfile(User user)
    {
    }

    public void updatedProfileBackgroundImage(User user)
    {
    }

    public void updatedProfileBanner()
    {
    }

    public void updatedProfileColors(User user)
    {
    }

    public void updatedProfileImage(User user)
    {
    }

    public void updatedStatus(Status status)
    {
    }

    public void updatedUserList(UserList userlist)
    {
    }

    public void verifiedCredentials(User user)
    {
    }
}
