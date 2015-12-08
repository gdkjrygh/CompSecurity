// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.util.Map;
import twitter4j.AccountSettings;
import twitter4j.AccountTotals;
import twitter4j.DirectMessage;
import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.IDs;
import twitter4j.OEmbed;
import twitter4j.PagableResponseList;
import twitter4j.Place;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.SimilarPlaces;
import twitter4j.Status;
import twitter4j.Trends;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserMentionEntity;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;
import twitter4j.internal.util.z_T4JInternalStringUtil;

// Referenced classes of package twitter4j.internal.json:
//            z_T4JInternalFactory, HashtagEntityJSONImpl, RateLimitStatusJSONImpl, URLEntityJSONImpl, 
//            UserMentionEntityJSONImpl, UserListJSONImpl, AccountSettingsJSONImpl, AccountTotalsJSONImpl, 
//            CategoryJSONImpl, DirectMessageJSONImpl, ResponseListImpl, FriendshipJSONImpl, 
//            IDsJSONImpl, LanguageJSONImpl, LocationJSONImpl, OEmbedJSONImpl, 
//            UserJSONImpl, PlaceJSONImpl, QueryResultJSONImpl, RelationshipJSONImpl, 
//            SavedSearchJSONImpl, SimilarPlacesImpl, StatusJSONImpl, TrendsJSONImpl, 
//            TwitterAPIConfigurationJSONImpl

public class z_T4JInternalJSONImplFactory
    implements z_T4JInternalFactory
{

    private static final long serialVersionUID = 0x4868b7d54ca3e042L;
    private Configuration conf;

    public z_T4JInternalJSONImplFactory(Configuration configuration)
    {
        conf = configuration;
    }

    static GeoLocation[][] coordinatesAsGeoLocationArray(JSONArray jsonarray)
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

    static GeoLocation createGeoLocation(JSONObject jsonobject)
    {
label0:
        {
            try
            {
                if (jsonobject.isNull("coordinates"))
                {
                    break label0;
                }
                jsonobject = jsonobject.getJSONObject("coordinates").getString("coordinates");
                jsonobject = z_T4JInternalStringUtil.split(jsonobject.substring(1, jsonobject.length() - 1), ",");
                jsonobject = new GeoLocation(Double.parseDouble(jsonobject[1]), Double.parseDouble(jsonobject[0]));
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

    public static HashtagEntity createHashtagEntity(int i, int j, String s)
    {
        return new HashtagEntityJSONImpl(i, j, s);
    }

    public static RateLimitStatus createRateLimitStatusFromResponseHeader(HttpResponse httpresponse)
    {
        return RateLimitStatusJSONImpl.createFromResponseHeader(httpresponse);
    }

    public static URLEntity createUrlEntity(int i, int j, String s, String s1, String s2)
    {
        return new URLEntityJSONImpl(i, j, s, s1, s2);
    }

    public static UserMentionEntity createUserMentionEntity(int i, int j, String s, String s1, long l)
    {
        return new UserMentionEntityJSONImpl(i, j, s, s1, l);
    }

    public UserList createAUserList(HttpResponse httpresponse)
    {
        return new UserListJSONImpl(httpresponse, conf);
    }

    public UserList createAUserList(JSONObject jsonobject)
    {
        return new UserListJSONImpl(jsonobject);
    }

    public AccountSettings createAccountSettings(HttpResponse httpresponse)
    {
        return new AccountSettingsJSONImpl(httpresponse, conf);
    }

    public AccountTotals createAccountTotals(HttpResponse httpresponse)
    {
        return new AccountTotalsJSONImpl(httpresponse, conf);
    }

    public ResponseList createCategoryList(HttpResponse httpresponse)
    {
        return CategoryJSONImpl.createCategoriesList(httpresponse, conf);
    }

    public DirectMessage createDirectMessage(HttpResponse httpresponse)
    {
        return new DirectMessageJSONImpl(httpresponse, conf);
    }

    public DirectMessage createDirectMessage(JSONObject jsonobject)
    {
        return new DirectMessageJSONImpl(jsonobject);
    }

    public ResponseList createDirectMessageList(HttpResponse httpresponse)
    {
        return DirectMessageJSONImpl.createDirectMessageList(httpresponse, conf);
    }

    public ResponseList createEmptyResponseList()
    {
        return new ResponseListImpl(0, null);
    }

    public ResponseList createFriendshipList(HttpResponse httpresponse)
    {
        return FriendshipJSONImpl.createFriendshipList(httpresponse, conf);
    }

    public IDs createIDs(HttpResponse httpresponse)
    {
        return new IDsJSONImpl(httpresponse, conf);
    }

    public ResponseList createLanguageList(HttpResponse httpresponse)
    {
        return LanguageJSONImpl.createLanguageList(httpresponse, conf);
    }

    public ResponseList createLocationList(HttpResponse httpresponse)
    {
        return LocationJSONImpl.createLocationList(httpresponse, conf);
    }

    public OEmbed createOEmbed(HttpResponse httpresponse)
    {
        return new OEmbedJSONImpl(httpresponse, conf);
    }

    public PagableResponseList createPagableUserList(HttpResponse httpresponse)
    {
        return UserJSONImpl.createPagableUserList(httpresponse, conf);
    }

    public PagableResponseList createPagableUserListList(HttpResponse httpresponse)
    {
        return UserListJSONImpl.createPagableUserListList(httpresponse, conf);
    }

    public Place createPlace(HttpResponse httpresponse)
    {
        return new PlaceJSONImpl(httpresponse, conf);
    }

    public ResponseList createPlaceList(HttpResponse httpresponse)
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

    public QueryResult createQueryResult(HttpResponse httpresponse, Query query)
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

    public Map createRateLimitStatuses(HttpResponse httpresponse)
    {
        return RateLimitStatusJSONImpl.createRateLimitStatuses(httpresponse, conf);
    }

    public Relationship createRelationship(HttpResponse httpresponse)
    {
        return new RelationshipJSONImpl(httpresponse, conf);
    }

    public SavedSearch createSavedSearch(HttpResponse httpresponse)
    {
        return new SavedSearchJSONImpl(httpresponse, conf);
    }

    public ResponseList createSavedSearchList(HttpResponse httpresponse)
    {
        return SavedSearchJSONImpl.createSavedSearchList(httpresponse, conf);
    }

    public SimilarPlaces createSimilarPlaces(HttpResponse httpresponse)
    {
        return SimilarPlacesImpl.createSimilarPlaces(httpresponse, conf);
    }

    public Status createStatus(HttpResponse httpresponse)
    {
        return new StatusJSONImpl(httpresponse, conf);
    }

    public Status createStatus(JSONObject jsonobject)
    {
        return new StatusJSONImpl(jsonobject);
    }

    public ResponseList createStatusList(HttpResponse httpresponse)
    {
        return StatusJSONImpl.createStatusList(httpresponse, conf);
    }

    public Trends createTrends(HttpResponse httpresponse)
    {
        return new TrendsJSONImpl(httpresponse, conf);
    }

    public TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse httpresponse)
    {
        return new TwitterAPIConfigurationJSONImpl(httpresponse, conf);
    }

    public User createUser(HttpResponse httpresponse)
    {
        return new UserJSONImpl(httpresponse, conf);
    }

    public User createUser(JSONObject jsonobject)
    {
        return new UserJSONImpl(jsonobject);
    }

    public ResponseList createUserList(HttpResponse httpresponse)
    {
        return UserJSONImpl.createUserList(httpresponse, conf);
    }

    public ResponseList createUserListFromJSONArray(HttpResponse httpresponse)
    {
        return UserJSONImpl.createUserList(httpresponse.asJSONArray(), httpresponse, conf);
    }

    public ResponseList createUserListFromJSONArray_Users(HttpResponse httpresponse)
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
        return (new StringBuilder("JSONImplFactory{conf=")).append(conf).append('}').toString();
    }
}
