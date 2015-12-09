// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Map;
import twitter4j.auth.AccessToken;
import twitter4j.auth.OAuth2Token;
import twitter4j.auth.RequestToken;

// Referenced classes of package twitter4j:
//            User, Status, SavedSearch, UserList, 
//            DirectMessage, TwitterAPIConfiguration, AccountSettings, ResponseList, 
//            IDs, PagableResponseList, Place, OEmbed, 
//            Trends, Relationship, TwitterException, TwitterMethod, 
//            QueryResult

public interface TwitterListener
{

    public abstract void checkedUserListMembership(User user);

    public abstract void checkedUserListSubscription(User user);

    public abstract void createdBlock(User user);

    public abstract void createdFavorite(Status status);

    public abstract void createdFriendship(User user);

    public abstract void createdMute(User user);

    public abstract void createdSavedSearch(SavedSearch savedsearch);

    public abstract void createdUserList(UserList userlist);

    public abstract void createdUserListMember(UserList userlist);

    public abstract void createdUserListMembers(UserList userlist);

    public abstract void destroyedBlock(User user);

    public abstract void destroyedDirectMessage(DirectMessage directmessage);

    public abstract void destroyedFavorite(Status status);

    public abstract void destroyedFriendship(User user);

    public abstract void destroyedMute(User user);

    public abstract void destroyedSavedSearch(SavedSearch savedsearch);

    public abstract void destroyedStatus(Status status);

    public abstract void destroyedUserList(UserList userlist);

    public abstract void destroyedUserListMember(UserList userlist);

    public abstract void gotAPIConfiguration(TwitterAPIConfiguration twitterapiconfiguration);

    public abstract void gotAccountSettings(AccountSettings accountsettings);

    public abstract void gotAvailableTrends(ResponseList responselist);

    public abstract void gotBlockIDs(IDs ids);

    public abstract void gotBlocksList(ResponseList responselist);

    public abstract void gotClosestTrends(ResponseList responselist);

    public abstract void gotContributees(ResponseList responselist);

    public abstract void gotContributors(ResponseList responselist);

    public abstract void gotDirectMessage(DirectMessage directmessage);

    public abstract void gotDirectMessages(ResponseList responselist);

    public abstract void gotFavorites(ResponseList responselist);

    public abstract void gotFollowersIDs(IDs ids);

    public abstract void gotFollowersList(PagableResponseList pagableresponselist);

    public abstract void gotFriendsIDs(IDs ids);

    public abstract void gotFriendsList(PagableResponseList pagableresponselist);

    public abstract void gotGeoDetails(Place place);

    public abstract void gotHomeTimeline(ResponseList responselist);

    public abstract void gotIncomingFriendships(IDs ids);

    public abstract void gotLanguages(ResponseList responselist);

    public abstract void gotMemberSuggestions(ResponseList responselist);

    public abstract void gotMentions(ResponseList responselist);

    public abstract void gotMuteIDs(IDs ids);

    public abstract void gotMutesList(ResponseList responselist);

    public abstract void gotOAuth2Token(OAuth2Token oauth2token);

    public abstract void gotOAuthAccessToken(AccessToken accesstoken);

    public abstract void gotOAuthRequestToken(RequestToken requesttoken);

    public abstract void gotOEmbed(OEmbed oembed);

    public abstract void gotOutgoingFriendships(IDs ids);

    public abstract void gotPlaceTrends(Trends trends);

    public abstract void gotPrivacyPolicy(String s);

    public abstract void gotRateLimitStatus(Map map);

    public abstract void gotRetweets(ResponseList responselist);

    public abstract void gotRetweetsOfMe(ResponseList responselist);

    public abstract void gotReverseGeoCode(ResponseList responselist);

    public abstract void gotSavedSearch(SavedSearch savedsearch);

    public abstract void gotSavedSearches(ResponseList responselist);

    public abstract void gotSentDirectMessages(ResponseList responselist);

    public abstract void gotShowFriendship(Relationship relationship);

    public abstract void gotShowStatus(Status status);

    public abstract void gotShowUserList(UserList userlist);

    public abstract void gotSimilarPlaces(ResponseList responselist);

    public abstract void gotSuggestedUserCategories(ResponseList responselist);

    public abstract void gotTermsOfService(String s);

    public abstract void gotUserDetail(User user);

    public abstract void gotUserListMembers(PagableResponseList pagableresponselist);

    public abstract void gotUserListMemberships(PagableResponseList pagableresponselist);

    public abstract void gotUserListStatuses(ResponseList responselist);

    public abstract void gotUserListSubscribers(PagableResponseList pagableresponselist);

    public abstract void gotUserListSubscriptions(PagableResponseList pagableresponselist);

    public abstract void gotUserLists(ResponseList responselist);

    public abstract void gotUserSuggestions(ResponseList responselist);

    public abstract void gotUserTimeline(ResponseList responselist);

    public abstract void lookedUpFriendships(ResponseList responselist);

    public abstract void lookedup(ResponseList responselist);

    public abstract void lookedupUsers(ResponseList responselist);

    public abstract void onException(TwitterException twitterexception, TwitterMethod twittermethod);

    public abstract void removedProfileBanner();

    public abstract void reportedSpam(User user);

    public abstract void retweetedStatus(Status status);

    public abstract void searched(QueryResult queryresult);

    public abstract void searchedPlaces(ResponseList responselist);

    public abstract void searchedUser(ResponseList responselist);

    public abstract void sentDirectMessage(DirectMessage directmessage);

    public abstract void subscribedUserList(UserList userlist);

    public abstract void unsubscribedUserList(UserList userlist);

    public abstract void updatedAccountSettings(AccountSettings accountsettings);

    public abstract void updatedFriendship(Relationship relationship);

    public abstract void updatedProfile(User user);

    public abstract void updatedProfileBackgroundImage(User user);

    public abstract void updatedProfileBanner();

    public abstract void updatedProfileColors(User user);

    public abstract void updatedProfileImage(User user);

    public abstract void updatedStatus(Status status);

    public abstract void updatedUserList(UserList userlist);

    public abstract void verifiedCredentials(User user);
}
