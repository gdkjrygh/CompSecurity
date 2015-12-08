// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.AccountSettings;
import twitter4j.AccountTotals;
import twitter4j.DirectMessage;
import twitter4j.GeoLocation;
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
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalStringUtil;

// Referenced classes of package twitter4j.internal.json:
//            z_T4JInternalFactory, RateLimitStatusJSONImpl, UserListJSONImpl, AccountSettingsJSONImpl, 
//            AccountTotalsJSONImpl, CategoryJSONImpl, DirectMessageJSONImpl, ResponseListImpl, 
//            FriendshipJSONImpl, IDsJSONImpl, LanguageJSONImpl, LocationJSONImpl, 
//            UserJSONImpl, PlaceJSONImpl, ProfileImageImpl, QueryResultJSONImpl, 
//            RelatedResultsJSONImpl, RelationshipJSONImpl, SavedSearchJSONImpl, SimilarPlacesImpl, 
//            StatusJSONImpl, TrendsJSONImpl, TwitterAPIConfigurationJSONImpl

public class z_T4JInternalJSONImplFactory
    implements z_T4JInternalFactory
{

    private Configuration conf;

    public z_T4JInternalJSONImplFactory(Configuration configuration)
    {
        conf = configuration;
    }

    static GeoLocation[][] coordinatesAsGeoLocationArray(JSONArray jsonarray)
        throws TwitterException
    {
        GeoLocation ageolocation[][];
        JSONArray jsonarray1;
        JSONArray jsonarray2;
        int i;
        int j;
        try
        {
            ageolocation = new GeoLocation[jsonarray.length()][];
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new TwitterException(jsonarray);
        }
        i = 0;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray1 = jsonarray.getJSONArray(i);
        ageolocation[i] = new GeoLocation[jsonarray1.length()];
        j = 0;
_L2:
        if (j >= jsonarray1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray2 = jsonarray1.getJSONArray(j);
        ageolocation[i][j] = new GeoLocation(jsonarray2.getDouble(1), jsonarray2.getDouble(0));
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        i++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_11;
_L3:
        return ageolocation;
    }

    public static RateLimitStatus createFeatureSpecificRateLimitStatusFromResponseHeader(HttpResponse httpresponse)
    {
        return RateLimitStatusJSONImpl.createFeatureSpecificRateLimitStatusFromResponseHeader(httpresponse);
    }

    static GeoLocation createGeoLocation(JSONObject jsonobject)
        throws TwitterException
    {
label0:
        {
            try
            {
                if (jsonobject.isNull("geo"))
                {
                    break label0;
                }
                jsonobject = jsonobject.getJSONObject("geo").getString("coordinates");
                jsonobject = z_T4JInternalStringUtil.split(jsonobject.substring(1, jsonobject.length() - 1), ",");
                jsonobject = new GeoLocation(Double.parseDouble(jsonobject[0]), Double.parseDouble(jsonobject[1]));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new TwitterException(jsonobject);
            }
            return jsonobject;
        }
        return null;
    }

    public static RateLimitStatus createRateLimitStatusFromResponseHeader(HttpResponse httpresponse)
    {
        return RateLimitStatusJSONImpl.createFromResponseHeader(httpresponse);
    }

    public UserList createAUserList(JSONObject jsonobject)
        throws TwitterException
    {
        return new UserListJSONImpl(jsonobject);
    }

    public UserList createAUserList(HttpResponse httpresponse)
        throws TwitterException
    {
        return new UserListJSONImpl(httpresponse, conf);
    }

    public AccountSettings createAccountSettings(HttpResponse httpresponse)
        throws TwitterException
    {
        return new AccountSettingsJSONImpl(httpresponse, conf);
    }

    public AccountTotals createAccountTotals(HttpResponse httpresponse)
        throws TwitterException
    {
        return new AccountTotalsJSONImpl(httpresponse, conf);
    }

    public ResponseList createCategoryList(HttpResponse httpresponse)
        throws TwitterException
    {
        return CategoryJSONImpl.createCategoriesList(httpresponse, conf);
    }

    public DirectMessage createDirectMessage(JSONObject jsonobject)
        throws TwitterException
    {
        return new DirectMessageJSONImpl(jsonobject);
    }

    public DirectMessage createDirectMessage(HttpResponse httpresponse)
        throws TwitterException
    {
        return new DirectMessageJSONImpl(httpresponse, conf);
    }

    public ResponseList createDirectMessageList(HttpResponse httpresponse)
        throws TwitterException
    {
        return DirectMessageJSONImpl.createDirectMessageList(httpresponse, conf);
    }

    public ResponseList createEmptyResponseList()
    {
        return new ResponseListImpl(0, null);
    }

    public ResponseList createFriendshipList(HttpResponse httpresponse)
        throws TwitterException
    {
        return FriendshipJSONImpl.createFriendshipList(httpresponse, conf);
    }

    public IDs createIDs(HttpResponse httpresponse)
        throws TwitterException
    {
        return new IDsJSONImpl(httpresponse, conf);
    }

    public ResponseList createLanguageList(HttpResponse httpresponse)
        throws TwitterException
    {
        return LanguageJSONImpl.createLanguageList(httpresponse, conf);
    }

    public ResponseList createLocationList(HttpResponse httpresponse)
        throws TwitterException
    {
        return LocationJSONImpl.createLocationList(httpresponse, conf);
    }

    public PagableResponseList createPagableUserList(HttpResponse httpresponse)
        throws TwitterException
    {
        return UserJSONImpl.createPagableUserList(httpresponse, conf);
    }

    public PagableResponseList createPagableUserListList(HttpResponse httpresponse)
        throws TwitterException
    {
        return UserListJSONImpl.createPagableUserListList(httpresponse, conf);
    }

    public Place createPlace(HttpResponse httpresponse)
        throws TwitterException
    {
        return new PlaceJSONImpl(httpresponse, conf);
    }

    public ResponseList createPlaceList(HttpResponse httpresponse)
        throws TwitterException
    {
        try
        {
            httpresponse = PlaceJSONImpl.createPlaceList(httpresponse, conf);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            if (httpresponse.getStatusCode() == 404)
            {
                return new ResponseListImpl(0, null);
            } else
            {
                throw httpresponse;
            }
        }
        return httpresponse;
    }

    public ProfileImage createProfileImage(HttpResponse httpresponse)
        throws TwitterException
    {
        return new ProfileImageImpl(httpresponse);
    }

    public QueryResult createQueryResult(HttpResponse httpresponse, Query query)
        throws TwitterException
    {
        try
        {
            httpresponse = new QueryResultJSONImpl(httpresponse, conf);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            if (404 == httpresponse.getStatusCode())
            {
                return new QueryResultJSONImpl(query);
            } else
            {
                throw httpresponse;
            }
        }
        return httpresponse;
    }

    public RateLimitStatus createRateLimitStatus(HttpResponse httpresponse)
        throws TwitterException
    {
        return new RateLimitStatusJSONImpl(httpresponse, conf);
    }

    public RelatedResults createRelatedResults(HttpResponse httpresponse)
        throws TwitterException
    {
        return new RelatedResultsJSONImpl(httpresponse, conf);
    }

    public Relationship createRelationship(HttpResponse httpresponse)
        throws TwitterException
    {
        return new RelationshipJSONImpl(httpresponse, conf);
    }

    public SavedSearch createSavedSearch(HttpResponse httpresponse)
        throws TwitterException
    {
        return new SavedSearchJSONImpl(httpresponse, conf);
    }

    public ResponseList createSavedSearchList(HttpResponse httpresponse)
        throws TwitterException
    {
        return SavedSearchJSONImpl.createSavedSearchList(httpresponse, conf);
    }

    public SimilarPlaces createSimilarPlaces(HttpResponse httpresponse)
        throws TwitterException
    {
        return SimilarPlacesImpl.createSimilarPlaces(httpresponse, conf);
    }

    public Status createStatus(JSONObject jsonobject)
        throws TwitterException
    {
        return new StatusJSONImpl(jsonobject);
    }

    public Status createStatus(HttpResponse httpresponse)
        throws TwitterException
    {
        return new StatusJSONImpl(httpresponse, conf);
    }

    public ResponseList createStatusList(HttpResponse httpresponse)
        throws TwitterException
    {
        return StatusJSONImpl.createStatusList(httpresponse, conf);
    }

    public Trends createTrends(HttpResponse httpresponse)
        throws TwitterException
    {
        return new TrendsJSONImpl(httpresponse, conf);
    }

    public ResponseList createTrendsList(HttpResponse httpresponse)
        throws TwitterException
    {
        return TrendsJSONImpl.createTrendsList(httpresponse, conf.isJSONStoreEnabled());
    }

    public TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse httpresponse)
        throws TwitterException
    {
        return new TwitterAPIConfigurationJSONImpl(httpresponse, conf);
    }

    public User createUser(JSONObject jsonobject)
        throws TwitterException
    {
        return new UserJSONImpl(jsonobject);
    }

    public User createUser(HttpResponse httpresponse)
        throws TwitterException
    {
        return new UserJSONImpl(httpresponse, conf);
    }

    public ResponseList createUserList(HttpResponse httpresponse)
        throws TwitterException
    {
        return UserJSONImpl.createUserList(httpresponse, conf);
    }

    public ResponseList createUserListFromJSONArray(HttpResponse httpresponse)
        throws TwitterException
    {
        return UserJSONImpl.createUserList(httpresponse.asJSONArray(), httpresponse, conf);
    }

    public ResponseList createUserListFromJSONArray_Users(HttpResponse httpresponse)
        throws TwitterException
    {
        try
        {
            httpresponse = UserJSONImpl.createUserList(httpresponse.asJSONObject().getJSONArray("users"), httpresponse, conf);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse);
        }
        return httpresponse;
    }

    public ResponseList createUserListList(HttpResponse httpresponse)
        throws TwitterException
    {
        return UserListJSONImpl.createUserListList(httpresponse, conf);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof z_T4JInternalJSONImplFactory))
            {
                return false;
            }
            obj = (z_T4JInternalJSONImplFactory)obj;
            if (conf == null ? ((z_T4JInternalJSONImplFactory) (obj)).conf != null : !conf.equals(((z_T4JInternalJSONImplFactory) (obj)).conf))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (conf != null)
        {
            return conf.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return "JSONImplFactory{conf=" + conf + '}';
    }
}
