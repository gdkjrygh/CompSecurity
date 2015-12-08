// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Map;
import twitter4j.AccountSettings;
import twitter4j.AccountTotals;
import twitter4j.DirectMessage;
import twitter4j.IDs;
import twitter4j.OEmbed;
import twitter4j.PagableResponseList;
import twitter4j.Place;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.SimilarPlaces;
import twitter4j.Status;
import twitter4j.Trends;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONObject;

public interface z_T4JInternalFactory
    extends Serializable
{

    public abstract UserList createAUserList(HttpResponse httpresponse);

    public abstract UserList createAUserList(JSONObject jsonobject);

    public abstract AccountSettings createAccountSettings(HttpResponse httpresponse);

    public abstract AccountTotals createAccountTotals(HttpResponse httpresponse);

    public abstract ResponseList createCategoryList(HttpResponse httpresponse);

    public abstract DirectMessage createDirectMessage(HttpResponse httpresponse);

    public abstract DirectMessage createDirectMessage(JSONObject jsonobject);

    public abstract ResponseList createDirectMessageList(HttpResponse httpresponse);

    public abstract ResponseList createEmptyResponseList();

    public abstract ResponseList createFriendshipList(HttpResponse httpresponse);

    public abstract IDs createIDs(HttpResponse httpresponse);

    public abstract ResponseList createLanguageList(HttpResponse httpresponse);

    public abstract ResponseList createLocationList(HttpResponse httpresponse);

    public abstract OEmbed createOEmbed(HttpResponse httpresponse);

    public abstract PagableResponseList createPagableUserList(HttpResponse httpresponse);

    public abstract PagableResponseList createPagableUserListList(HttpResponse httpresponse);

    public abstract Place createPlace(HttpResponse httpresponse);

    public abstract ResponseList createPlaceList(HttpResponse httpresponse);

    public abstract QueryResult createQueryResult(HttpResponse httpresponse, Query query);

    public abstract Map createRateLimitStatuses(HttpResponse httpresponse);

    public abstract Relationship createRelationship(HttpResponse httpresponse);

    public abstract SavedSearch createSavedSearch(HttpResponse httpresponse);

    public abstract ResponseList createSavedSearchList(HttpResponse httpresponse);

    public abstract SimilarPlaces createSimilarPlaces(HttpResponse httpresponse);

    public abstract Status createStatus(HttpResponse httpresponse);

    public abstract Status createStatus(JSONObject jsonobject);

    public abstract ResponseList createStatusList(HttpResponse httpresponse);

    public abstract Trends createTrends(HttpResponse httpresponse);

    public abstract TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse httpresponse);

    public abstract User createUser(HttpResponse httpresponse);

    public abstract User createUser(JSONObject jsonobject);

    public abstract ResponseList createUserList(HttpResponse httpresponse);

    public abstract ResponseList createUserListFromJSONArray(HttpResponse httpresponse);

    public abstract ResponseList createUserListFromJSONArray_Users(HttpResponse httpresponse);

    public abstract ResponseList createUserListList(HttpResponse httpresponse);
}
