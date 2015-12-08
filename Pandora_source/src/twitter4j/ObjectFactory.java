// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.Map;

// Referenced classes of package twitter4j:
//            TwitterException, HttpResponse, UserList, JSONObject, 
//            AccountSettings, AccountTotals, ResponseList, DirectMessage, 
//            IDs, OEmbed, PagableResponseList, Place, 
//            Query, QueryResult, Relationship, SavedSearch, 
//            Status, Trends, TwitterAPIConfiguration, User

interface ObjectFactory
    extends Serializable
{

    public abstract UserList createAUserList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract UserList createAUserList(JSONObject jsonobject)
        throws TwitterException;

    public abstract AccountSettings createAccountSettings(HttpResponse httpresponse)
        throws TwitterException;

    public abstract AccountTotals createAccountTotals(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createCategoryList(HttpResponse httpresponse)
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

    public abstract OEmbed createOEmbed(HttpResponse httpresponse)
        throws TwitterException;

    public abstract PagableResponseList createPagableUserList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract PagableResponseList createPagableUserListList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Place createPlace(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createPlaceList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract QueryResult createQueryResult(HttpResponse httpresponse, Query query)
        throws TwitterException;

    public abstract Map createRateLimitStatuses(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Relationship createRelationship(HttpResponse httpresponse)
        throws TwitterException;

    public abstract SavedSearch createSavedSearch(HttpResponse httpresponse)
        throws TwitterException;

    public abstract ResponseList createSavedSearchList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Status createStatus(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Status createStatus(JSONObject jsonobject)
        throws TwitterException;

    public abstract ResponseList createStatusList(HttpResponse httpresponse)
        throws TwitterException;

    public abstract Trends createTrends(HttpResponse httpresponse)
        throws TwitterException;

    public abstract TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse httpresponse)
        throws TwitterException;

    public abstract User createUser(HttpResponse httpresponse)
        throws TwitterException;

    public abstract User createUser(JSONObject jsonobject)
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
