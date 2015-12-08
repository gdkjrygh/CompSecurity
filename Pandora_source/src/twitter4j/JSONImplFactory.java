// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Map;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            ObjectFactory, TwitterException, JSONException, JSONArray, 
//            GeoLocation, JSONObject, HashtagEntityJSONImpl, RateLimitStatusJSONImpl, 
//            URLEntityJSONImpl, UserMentionEntityJSONImpl, UserListJSONImpl, AccountSettingsJSONImpl, 
//            AccountTotalsJSONImpl, CategoryJSONImpl, DirectMessageJSONImpl, ResponseListImpl, 
//            FriendshipJSONImpl, IDsJSONImpl, LanguageJSONImpl, LocationJSONImpl, 
//            OEmbedJSONImpl, UserJSONImpl, PlaceJSONImpl, QueryResultJSONImpl, 
//            RelationshipJSONImpl, SavedSearchJSONImpl, StatusJSONImpl, TrendsJSONImpl, 
//            TwitterAPIConfigurationJSONImpl, HttpResponse, HashtagEntity, RateLimitStatus, 
//            URLEntity, UserMentionEntity, UserList, AccountSettings, 
//            AccountTotals, ResponseList, DirectMessage, IDs, 
//            OEmbed, PagableResponseList, Place, Query, 
//            QueryResult, Relationship, SavedSearch, Status, 
//            Trends, TwitterAPIConfiguration, User

class JSONImplFactory
    implements ObjectFactory
{

    private static final long serialVersionUID = 0xe646e5ddb7c5a751L;
    private final Configuration conf;

    public JSONImplFactory(Configuration configuration)
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

    static GeoLocation createGeoLocation(JSONObject jsonobject)
        throws TwitterException
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
                jsonobject = jsonobject.substring(1, jsonobject.length() - 1).split(",");
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
        throws TwitterException
    {
        return new UserListJSONImpl(httpresponse, conf);
    }

    public UserList createAUserList(JSONObject jsonobject)
        throws TwitterException
    {
        return new UserListJSONImpl(jsonobject);
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

    public OEmbed createOEmbed(HttpResponse httpresponse)
        throws TwitterException
    {
        return new OEmbedJSONImpl(httpresponse, conf);
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

    public Map createRateLimitStatuses(HttpResponse httpresponse)
        throws TwitterException
    {
        return RateLimitStatusJSONImpl.createRateLimitStatuses(httpresponse, conf);
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

    public Status createStatus(HttpResponse httpresponse)
        throws TwitterException
    {
        return new StatusJSONImpl(httpresponse, conf);
    }

    public Status createStatus(JSONObject jsonobject)
        throws TwitterException
    {
        return new StatusJSONImpl(jsonobject);
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

    public TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse httpresponse)
        throws TwitterException
    {
        return new TwitterAPIConfigurationJSONImpl(httpresponse, conf);
    }

    public User createUser(HttpResponse httpresponse)
        throws TwitterException
    {
        return new UserJSONImpl(httpresponse, conf);
    }

    public User createUser(JSONObject jsonobject)
        throws TwitterException
    {
        return new UserJSONImpl(jsonobject);
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
            if (!(obj instanceof JSONImplFactory))
            {
                return false;
            }
            obj = (JSONImplFactory)obj;
            if (conf == null ? ((JSONImplFactory) (obj)).conf != null : !conf.equals(((JSONImplFactory) (obj)).conf))
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
        return (new StringBuilder()).append("JSONImplFactory{conf=").append(conf).append('}').toString();
    }
}
