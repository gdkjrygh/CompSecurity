// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import org.json.JSONObject;
import twitter4j.AccountSettings;
import twitter4j.AccountTotals;
import twitter4j.DirectMessage;
import twitter4j.IDs;
import twitter4j.PagableResponseList;
import twitter4j.Place;
import twitter4j.ProfileImage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.RelatedResults;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.SimilarPlaces;
import twitter4j.Status;
import twitter4j.Trends;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.internal.http.HttpResponse;

public interface z_T4JInternalFactory
    extends Serializable
{

    public abstract UserList createAUserList(JSONObject jsonobject)
        throws TwitterException;

    public abstract UserList createAUserList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract AccountSettings createAccountSettings(HttpResponse httpresponse)
        throws TwitterException;

    public abstract AccountTotals createAccountTotals(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createCategoryList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract DirectMessage createDirectMessage(JSONObject jsonobject)
        throws TwitterException;

    public abstract DirectMessage createDirectMessage(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createDirectMessageList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createEmptyResponseList();

    public abstract ResponseList createFriendshipList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract IDs createIDs(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createLanguageList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createLocationList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract PagableResponseList createPagableUserList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract PagableResponseList createPagableUserListList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Place createPlace(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createPlaceList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ProfileImage createProfileImage(HttpResponse httpresponse)
        throws TwitterException;

    public abstract QueryResult createQueryResult(HttpResponse httpresponse, Query query)
        throws TwitterException;

    public abstract RateLimitStatus createRateLimitStatus(HttpResponse httpresponse)
        throws TwitterException;

    public abstract RelatedResults createRelatedResults(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Relationship createRelationship(HttpResponse httpresponse)
        throws TwitterException;

    public abstract SavedSearch createSavedSearch(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createSavedSearchList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract SimilarPlaces createSimilarPlaces(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Status createStatus(JSONObject jsonobject)
        throws TwitterException;

    public abstract Status createStatus(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createStatusList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Trends createTrends(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createTrendsList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse httpresponse)
        throws TwitterException;

    public abstract User createUser(JSONObject jsonobject)
        throws TwitterException;

    public abstract User createUser(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createUserList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createUserListFromJSONArray(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createUserListFromJSONArray_Users(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createUserListList(HttpResponse httpresponse)
        throws TwitterException;
}
