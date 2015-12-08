// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpClientWrapper;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.json.z_T4JInternalFactory;
import twitter4j.internal.util.z_T4JInternalStringUtil;

// Referenced classes of package twitter4j:
//            TwitterBaseImpl, Twitter, TwitterException, TwitterAPIMonitor, 
//            GeoLocation, Paging, GeoQuery, Query, 
//            StatusUpdate, UserList, User, Status, 
//            Place, SavedSearch, DirectMessage, TwitterAPIConfiguration, 
//            AccountSettings, AccountTotals, ResponseList, IDs, 
//            PagableResponseList, Trends, ProfileImage, RateLimitStatus, 
//            RelatedResults, SimilarPlaces, QueryResult, Relationship

class TwitterImpl extends TwitterBaseImpl
    implements Twitter
{

    private static final long serialVersionUID = 0xeb5f6361d798c8fcL;
    private final HttpParameter INCLUDE_ENTITIES;
    private final HttpParameter INCLUDE_MY_RETWEET = new HttpParameter("include_my_retweet", 1);
    private final HttpParameter INCLUDE_RTS;

    TwitterImpl(Configuration configuration, Authorization authorization)
    {
        super(configuration, authorization);
        INCLUDE_ENTITIES = new HttpParameter("include_entities", configuration.isIncludeEntitiesEnabled());
        INCLUDE_RTS = new HttpParameter("include_rts", configuration.isIncludeRTsEnabled());
    }

    private void addParameterToList(List list, String s, String s1)
    {
        if (s1 != null)
        {
            list.add(new HttpParameter(s, s1));
        }
    }

    private void checkFileValidity(File file)
        throws TwitterException
    {
        if (!file.exists())
        {
            throw new TwitterException(new FileNotFoundException(file + " is not found."));
        }
        if (!file.isFile())
        {
            throw new TwitterException(new IOException(file + " is not a file."));
        } else
        {
            return;
        }
    }

    private HttpResponse delete(String s)
        throws TwitterException
    {
        long l;
        if (!conf.isMBeanEnabled())
        {
            return http.delete(s, auth);
        }
        l = System.currentTimeMillis();
        HttpResponse httpresponse = http.delete(s, auth);
        long l1 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l1 - l, isOk(httpresponse));
        return httpresponse;
        Exception exception;
        exception;
        long l2 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l2 - l, isOk(null));
        throw exception;
    }

    private HttpResponse get(String s)
        throws TwitterException
    {
        long l;
        if (!conf.isMBeanEnabled())
        {
            return http.get(s, auth);
        }
        l = System.currentTimeMillis();
        HttpResponse httpresponse = http.get(s, auth);
        long l1 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l1 - l, isOk(httpresponse));
        return httpresponse;
        Exception exception;
        exception;
        long l2 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l2 - l, isOk(null));
        throw exception;
    }

    private HttpResponse get(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        long l;
        if (!conf.isMBeanEnabled())
        {
            return http.get(s, ahttpparameter, auth);
        }
        l = System.currentTimeMillis();
        ahttpparameter = http.get(s, ahttpparameter, auth);
        long l1 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l1 - l, isOk(ahttpparameter));
        return ahttpparameter;
        ahttpparameter;
        long l2 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l2 - l, isOk(null));
        throw ahttpparameter;
    }

    private boolean isOk(HttpResponse httpresponse)
    {
        return httpresponse != null && httpresponse.getStatusCode() < 300;
    }

    private HttpParameter[] mergeParameters(HttpParameter ahttpparameter[], HttpParameter httpparameter)
    {
        if (ahttpparameter != null && httpparameter != null)
        {
            HttpParameter ahttpparameter1[] = new HttpParameter[ahttpparameter.length + 1];
            System.arraycopy(ahttpparameter, 0, ahttpparameter1, 0, ahttpparameter.length);
            ahttpparameter1[ahttpparameter1.length - 1] = httpparameter;
            return ahttpparameter1;
        }
        if (ahttpparameter == null && httpparameter == null)
        {
            return new HttpParameter[0];
        }
        if (ahttpparameter != null)
        {
            return ahttpparameter;
        } else
        {
            return (new HttpParameter[] {
                httpparameter
            });
        }
    }

    private HttpParameter[] mergeParameters(HttpParameter ahttpparameter[], HttpParameter ahttpparameter1[])
    {
        if (ahttpparameter != null && ahttpparameter1 != null)
        {
            HttpParameter ahttpparameter2[] = new HttpParameter[ahttpparameter.length + ahttpparameter1.length];
            System.arraycopy(ahttpparameter, 0, ahttpparameter2, 0, ahttpparameter.length);
            System.arraycopy(ahttpparameter1, 0, ahttpparameter2, ahttpparameter.length, ahttpparameter1.length);
            return ahttpparameter2;
        }
        if (ahttpparameter == null && ahttpparameter1 == null)
        {
            return new HttpParameter[0];
        }
        if (ahttpparameter != null)
        {
            return ahttpparameter;
        } else
        {
            return ahttpparameter1;
        }
    }

    private HttpResponse post(String s)
        throws TwitterException
    {
        long l;
        if (!conf.isMBeanEnabled())
        {
            return http.post(s, auth);
        }
        l = System.currentTimeMillis();
        HttpResponse httpresponse = http.post(s, auth);
        long l1 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l1 - l, isOk(httpresponse));
        return httpresponse;
        Exception exception;
        exception;
        long l2 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l2 - l, isOk(null));
        throw exception;
    }

    private HttpResponse post(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        long l;
        if (!conf.isMBeanEnabled())
        {
            return http.post(s, ahttpparameter, auth);
        }
        l = System.currentTimeMillis();
        ahttpparameter = http.post(s, ahttpparameter, auth);
        long l1 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l1 - l, isOk(ahttpparameter));
        return ahttpparameter;
        ahttpparameter;
        long l2 = System.currentTimeMillis();
        TwitterAPIMonitor.getInstance().methodCalled(s, l2 - l, isOk(null));
        throw ahttpparameter;
    }

    private String toDateStr(Date date)
    {
        Date date1 = date;
        if (date == null)
        {
            date1 = new Date();
        }
        return (new SimpleDateFormat("yyyy-MM-dd")).format(date1);
    }

    public UserList addUserListMember(int i, long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/members/create.json", new HttpParameter[] {
            new HttpParameter("user_id", l), new HttpParameter("list_id", i)
        }));
    }

    public UserList addUserListMembers(int i, long al[])
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter[] {
            new HttpParameter("list_id", i), new HttpParameter("user_id", z_T4JInternalStringUtil.join(al))
        }));
    }

    public UserList addUserListMembers(int i, String as[])
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter[] {
            new HttpParameter("list_id", i), new HttpParameter("screen_name", z_T4JInternalStringUtil.join(as))
        }));
    }

    public User checkUserListMembership(String s, int i, long l)
        throws TwitterException
    {
        return showUserListMembership(i, l);
    }

    public User checkUserListSubscription(String s, int i, long l)
        throws TwitterException
    {
        return showUserListSubscription(i, l);
    }

    public User createBlock(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "blocks/create.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l));
    }

    public User createBlock(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "blocks/create.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s));
    }

    public Status createFavorite(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatus(post(conf.getRestBaseURL() + "favorites/create/" + l + ".json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public User createFriendship(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "friendships/create.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l));
    }

    public User createFriendship(long l, boolean flag)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "friendships/create.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l + "&follow=" + flag));
    }

    public User createFriendship(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "friendships/create.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s));
    }

    public User createFriendship(String s, boolean flag)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "friendships/create.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s + "&follow=" + flag));
    }

    public Place createPlace(String s, String s1, String s2, GeoLocation geolocation, String s3)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        ArrayList arraylist = new ArrayList(3);
        arraylist.add(new HttpParameter("name", s));
        arraylist.add(new HttpParameter("contained_within", s1));
        arraylist.add(new HttpParameter("token", s2));
        arraylist.add(new HttpParameter("lat", geolocation.getLatitude()));
        arraylist.add(new HttpParameter("long", geolocation.getLongitude()));
        if (s3 != null)
        {
            arraylist.add(new HttpParameter("attribute:street_address", s3));
        }
        return factory.createPlace(post(conf.getRestBaseURL() + "geo/place.json", (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()])));
    }

    public SavedSearch createSavedSearch(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createSavedSearch(post(conf.getRestBaseURL() + "saved_searches/create.json", new HttpParameter[] {
            new HttpParameter("query", s)
        }));
    }

    public UserList createUserList(String s, boolean flag, String s1)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new HttpParameter("name", s));
        if (flag)
        {
            s = "public";
        } else
        {
            s = "private";
        }
        arraylist.add(new HttpParameter("mode", s));
        if (s1 != null)
        {
            arraylist.add(new HttpParameter("description", s1));
        }
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/create.json", (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()])));
    }

    public UserList createUserListSubscription(int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/subscribers/create.json", new HttpParameter[] {
            new HttpParameter("list_id", i)
        }));
    }

    public UserList deleteUserListMember(int i, long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter[] {
            new HttpParameter("list_id", i), new HttpParameter("user_id", l)
        }));
    }

    public User destroyBlock(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "blocks/destroy.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l));
    }

    public User destroyBlock(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "blocks/destroy.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s));
    }

    public DirectMessage destroyDirectMessage(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createDirectMessage(post(conf.getRestBaseURL() + "direct_messages/destroy/" + l + ".json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public Status destroyFavorite(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatus(post(conf.getRestBaseURL() + "favorites/destroy/" + l + ".json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public User destroyFriendship(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "friendships/destroy.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l));
    }

    public User destroyFriendship(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "friendships/destroy.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s));
    }

    public SavedSearch destroySavedSearch(int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createSavedSearch(post(conf.getRestBaseURL() + "saved_searches/destroy/" + i + ".json"));
    }

    public Status destroyStatus(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatus(post(conf.getRestBaseURL() + "statuses/destroy/" + l + ".json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public UserList destroyUserList(int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/destroy.json", new HttpParameter[] {
            new HttpParameter("list_id", i)
        }));
    }

    public UserList destroyUserListSubscription(int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/subscribers/destroy.json", new HttpParameter[] {
            new HttpParameter("list_id", i)
        }));
    }

    public User disableNotification(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "notifications/leave.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l));
    }

    public User disableNotification(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "notifications/leave.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s));
    }

    public User enableNotification(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "notifications/follow.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l));
    }

    public User enableNotification(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "notifications/follow.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (TwitterImpl)obj;
            if (!INCLUDE_ENTITIES.equals(((TwitterImpl) (obj)).INCLUDE_ENTITIES))
            {
                return false;
            }
            if (!INCLUDE_RTS.equals(((TwitterImpl) (obj)).INCLUDE_RTS))
            {
                return false;
            }
        }
        return true;
    }

    public boolean existsBlock(long l)
        throws TwitterException
    {
        boolean flag;
        flag = false;
        ensureAuthorizationEnabled();
        int i = get(conf.getRestBaseURL() + "blocks/exists.json?user_id=" + l).asString().indexOf("<error>You are not blocking this user.</error>");
        if (-1 == i)
        {
            flag = true;
        }
_L2:
        return flag;
        TwitterException twitterexception;
        twitterexception;
        if (twitterexception.getStatusCode() != 404)
        {
            throw twitterexception;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean existsBlock(String s)
        throws TwitterException
    {
        boolean flag;
        flag = false;
        ensureAuthorizationEnabled();
        int i = get(conf.getRestBaseURL() + "blocks/exists.json?screen_name=" + s).asString().indexOf("You are not blocking this user.");
        if (-1 == i)
        {
            flag = true;
        }
_L2:
        return flag;
        s;
        if (s.getStatusCode() != 404)
        {
            throw s;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean existsFriendship(String s, String s1)
        throws TwitterException
    {
        return -1 != get(conf.getRestBaseURL() + "friendships/exists.json", HttpParameter.getParameterArray("user_a", s, "user_b", s1)).asString().indexOf("true");
    }

    public TwitterAPIConfiguration getAPIConfiguration()
        throws TwitterException
    {
        return factory.createTwitterAPIConfiguration(get(conf.getRestBaseURL() + "help/configuration.json"));
    }

    public AccountSettings getAccountSettings()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAccountSettings(get(conf.getRestBaseURL() + "account/settings.json"));
    }

    public AccountTotals getAccountTotals()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAccountTotals(get(conf.getRestBaseURL() + "account/totals.json"));
    }

    public ResponseList getAllUserLists(long l)
        throws TwitterException
    {
        return factory.createUserListList(get(conf.getRestBaseURL() + "lists/all.json?user_id=" + l));
    }

    public ResponseList getAllUserLists(String s)
        throws TwitterException
    {
        return factory.createUserListList(get(conf.getRestBaseURL() + "lists/all.json?screen_name=" + s));
    }

    public ResponseList getAvailableTrends()
        throws TwitterException
    {
        return factory.createLocationList(get(conf.getRestBaseURL() + "trends/available.json"));
    }

    public ResponseList getAvailableTrends(GeoLocation geolocation)
        throws TwitterException
    {
        return factory.createLocationList(get(conf.getRestBaseURL() + "trends/available.json", new HttpParameter[] {
            new HttpParameter("lat", geolocation.getLatitude()), new HttpParameter("long", geolocation.getLongitude())
        }));
    }

    public ResponseList getBlockingUsers()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUserList(get(conf.getRestBaseURL() + "blocks/blocking.json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getBlockingUsers(int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUserList(get(conf.getRestBaseURL() + "blocks/blocking.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&page=" + i));
    }

    public IDs getBlockingUsersIDs()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createIDs(get(conf.getRestBaseURL() + "blocks/blocking/ids.json"));
    }

    public ResponseList getDailyTrends()
        throws TwitterException
    {
        return factory.createTrendsList(get(conf.getRestBaseURL() + "trends/daily.json"));
    }

    public ResponseList getDailyTrends(Date date, boolean flag)
        throws TwitterException
    {
        z_T4JInternalFactory z_t4jinternalfactory = factory;
        StringBuffer stringbuffer = (new StringBuffer()).append(conf.getRestBaseURL()).append("trends/daily.json?date=").append(toDateStr(date));
        if (flag)
        {
            date = "&exclude=hashtags";
        } else
        {
            date = "";
        }
        return z_t4jinternalfactory.createTrendsList(get(stringbuffer.append(date).toString()));
    }

    public ResponseList getDirectMessages()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createDirectMessageList(get(conf.getRestBaseURL() + "direct_messages.json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getDirectMessages(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createDirectMessageList(get(conf.getRestBaseURL() + "direct_messages.json", mergeParameters(paging.asPostParameterArray(), INCLUDE_ENTITIES)));
    }

    public ResponseList getFavorites()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "favorites.json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getFavorites(int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "favorites.json", new HttpParameter[] {
            new HttpParameter("page", i), INCLUDE_ENTITIES
        }));
    }

    public ResponseList getFavorites(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "favorites/" + s + ".json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getFavorites(String s, int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "favorites/" + s + ".json", mergeParameters(HttpParameter.getParameterArray("page", i), INCLUDE_ENTITIES)));
    }

    public ResponseList getFavorites(String s, Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "favorites/" + s + ".json", mergeParameters(paging.asPostParameterArray(), INCLUDE_ENTITIES)));
    }

    public ResponseList getFavorites(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "favorites.json", mergeParameters(paging.asPostParameterArray(), INCLUDE_ENTITIES)));
    }

    public IDs getFollowersIDs(long l)
        throws TwitterException
    {
        return factory.createIDs(get(conf.getRestBaseURL() + "followers/ids.json?cursor=" + l));
    }

    public IDs getFollowersIDs(long l, long l1)
        throws TwitterException
    {
        return factory.createIDs(get(conf.getRestBaseURL() + "followers/ids.json?user_id=" + l + "&cursor=" + l1));
    }

    public IDs getFollowersIDs(String s, long l)
        throws TwitterException
    {
        return factory.createIDs(get(conf.getRestBaseURL() + "followers/ids.json?screen_name=" + s + "&cursor=" + l));
    }

    public PagableResponseList getFollowersStatuses(long l)
        throws TwitterException
    {
        return factory.createPagableUserList(get(conf.getRestBaseURL() + "statuses/followers.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&cursor=" + l));
    }

    public PagableResponseList getFollowersStatuses(long l, long l1)
        throws TwitterException
    {
        return factory.createPagableUserList(get(conf.getRestBaseURL() + "statuses/followers.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l + "&cursor=" + l1));
    }

    public PagableResponseList getFollowersStatuses(String s, long l)
        throws TwitterException
    {
        return factory.createPagableUserList(get(conf.getRestBaseURL() + "statuses/followers.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s + "&cursor=" + l));
    }

    public IDs getFriendsIDs(long l)
        throws TwitterException
    {
        return factory.createIDs(get(conf.getRestBaseURL() + "friends/ids.json?cursor=" + l));
    }

    public IDs getFriendsIDs(long l, long l1)
        throws TwitterException
    {
        return factory.createIDs(get(conf.getRestBaseURL() + "friends/ids.json?user_id=" + l + "&cursor=" + l1));
    }

    public IDs getFriendsIDs(String s, long l)
        throws TwitterException
    {
        return factory.createIDs(get(conf.getRestBaseURL() + "friends/ids.json?screen_name=" + s + "&cursor=" + l));
    }

    public PagableResponseList getFriendsStatuses(long l)
        throws TwitterException
    {
        return factory.createPagableUserList(get(conf.getRestBaseURL() + "statuses/friends.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&cursor=" + l));
    }

    public PagableResponseList getFriendsStatuses(long l, long l1)
        throws TwitterException
    {
        return factory.createPagableUserList(get(conf.getRestBaseURL() + "statuses/friends.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l + "&cursor=" + l1));
    }

    public PagableResponseList getFriendsStatuses(String s, long l)
        throws TwitterException
    {
        return factory.createPagableUserList(get(conf.getRestBaseURL() + "statuses/friends.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s + "&cursor=" + l));
    }

    public ResponseList getFriendsTimeline()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/friends_timeline.json?include_my_retweet=1&include_entities=" + conf.isIncludeEntitiesEnabled() + "&include_rts=" + conf.isIncludeRTsEnabled()));
    }

    public ResponseList getFriendsTimeline(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        z_T4JInternalFactory z_t4jinternalfactory = factory;
        String s = conf.getRestBaseURL() + "statuses/friends_timeline.json";
        HttpParameter httpparameter = INCLUDE_RTS;
        HttpParameter httpparameter1 = INCLUDE_ENTITIES;
        HttpParameter httpparameter2 = INCLUDE_MY_RETWEET;
        paging = paging.asPostParameterArray();
        return z_t4jinternalfactory.createStatusList(get(s, mergeParameters(new HttpParameter[] {
            httpparameter, httpparameter1, httpparameter2
        }, paging)));
    }

    public Place getGeoDetails(String s)
        throws TwitterException
    {
        return factory.createPlace(get(conf.getRestBaseURL() + "geo/id/" + s + ".json"));
    }

    public ResponseList getHomeTimeline()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/home_timeline.json?include_my_retweet=1&include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getHomeTimeline(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/home_timeline.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter[] {
            INCLUDE_ENTITIES, INCLUDE_MY_RETWEET
        })));
    }

    public IDs getIncomingFriendships(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createIDs(get(conf.getRestBaseURL() + "friendships/incoming.json?cursor=" + l));
    }

    public ResponseList getLanguages()
        throws TwitterException
    {
        return factory.createLanguageList(get(conf.getRestBaseURL() + "help/languages.json"));
    }

    public Trends getLocationTrends(int i)
        throws TwitterException
    {
        return factory.createTrends(get(conf.getRestBaseURL() + "trends/" + i + ".json"));
    }

    public ResponseList getMemberSuggestions(String s)
        throws TwitterException
    {
        s = get(conf.getRestBaseURL() + "users/suggestions/" + s + "/members.json");
        return factory.createUserListFromJSONArray(s);
    }

    public ResponseList getMentions()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/mentions.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&include_rts=" + conf.isIncludeRTsEnabled()));
    }

    public ResponseList getMentions(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        z_T4JInternalFactory z_t4jinternalfactory = factory;
        String s = conf.getRestBaseURL() + "statuses/mentions.json";
        HttpParameter httpparameter = INCLUDE_RTS;
        HttpParameter httpparameter1 = INCLUDE_ENTITIES;
        paging = paging.asPostParameterArray();
        return z_t4jinternalfactory.createStatusList(get(s, mergeParameters(new HttpParameter[] {
            httpparameter, httpparameter1
        }, paging)));
    }

    public IDs getNoRetweetIds()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createIDs(get(conf.getRestBaseURL() + "friendships/no_retweet_ids.json"));
    }

    public IDs getOutgoingFriendships(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createIDs(get(conf.getRestBaseURL() + "friendships/outgoing.json?cursor=" + l));
    }

    public String getPrivacyPolicy()
        throws TwitterException
    {
        String s;
        try
        {
            s = get(conf.getRestBaseURL() + "legal/privacy.json").asJSONObject().getString("privacy");
        }
        catch (JSONException jsonexception)
        {
            throw new TwitterException(jsonexception);
        }
        return s;
    }

    public ProfileImage getProfileImage(String s, ProfileImage.ImageSize imagesize)
        throws TwitterException
    {
        return factory.createProfileImage(get(conf.getRestBaseURL() + "users/profile_image/" + s + ".json?size=" + imagesize.getName()));
    }

    public ResponseList getPublicTimeline()
        throws TwitterException
    {
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/public_timeline.json?include_my_retweet=1&include_entities=" + conf.isIncludeEntitiesEnabled() + "&include_rts=" + conf.isIncludeRTsEnabled()));
    }

    public RateLimitStatus getRateLimitStatus()
        throws TwitterException
    {
        return factory.createRateLimitStatus(get(conf.getRestBaseURL() + "account/rate_limit_status.json"));
    }

    public RelatedResults getRelatedResults(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createRelatedResults(get(conf.getRestBaseURL() + "related_results/show/" + Long.toString(l) + ".json"));
    }

    public ResponseList getRetweetedBy(long l)
        throws TwitterException
    {
        return getRetweetedBy(l, new Paging(1, 100));
    }

    public ResponseList getRetweetedBy(long l, Paging paging)
        throws TwitterException
    {
        return factory.createUserList(get(conf.getRestBaseURL() + "statuses/" + l + "/retweeted_by.json", paging.asPostParameterArray()));
    }

    public IDs getRetweetedByIDs(long l)
        throws TwitterException
    {
        return getRetweetedByIDs(l, new Paging(1, 100));
    }

    public IDs getRetweetedByIDs(long l, Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createIDs(get(conf.getRestBaseURL() + "statuses/" + l + "/retweeted_by/ids.json", paging.asPostParameterArray()));
    }

    public ResponseList getRetweetedByMe()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweeted_by_me.json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getRetweetedByMe(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweeted_by_me.json", mergeParameters(paging.asPostParameterArray(), INCLUDE_ENTITIES)));
    }

    public ResponseList getRetweetedByUser(long l, Paging paging)
        throws TwitterException
    {
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweeted_by_user.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter[] {
            new HttpParameter("user_id", l), INCLUDE_ENTITIES
        })));
    }

    public ResponseList getRetweetedByUser(String s, Paging paging)
        throws TwitterException
    {
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweeted_by_user.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter[] {
            new HttpParameter("screen_name", s), INCLUDE_ENTITIES
        })));
    }

    public ResponseList getRetweetedToMe()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweeted_to_me.json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getRetweetedToMe(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweeted_to_me.json", mergeParameters(paging.asPostParameterArray(), INCLUDE_ENTITIES)));
    }

    public ResponseList getRetweetedToUser(long l, Paging paging)
        throws TwitterException
    {
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweeted_to_user.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter[] {
            new HttpParameter("user_id", l), INCLUDE_ENTITIES
        })));
    }

    public ResponseList getRetweetedToUser(String s, Paging paging)
        throws TwitterException
    {
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweeted_to_user.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter[] {
            new HttpParameter("screen_name", s), INCLUDE_ENTITIES
        })));
    }

    public ResponseList getRetweets(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweets/" + l + ".json?count=100&include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getRetweetsOfMe()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweets_of_me.json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getRetweetsOfMe(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatusList(get(conf.getRestBaseURL() + "statuses/retweets_of_me.json", mergeParameters(paging.asPostParameterArray(), INCLUDE_ENTITIES)));
    }

    public ResponseList getSavedSearches()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createSavedSearchList(get(conf.getRestBaseURL() + "saved_searches.json"));
    }

    public ResponseList getSentDirectMessages()
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createDirectMessageList(get(conf.getRestBaseURL() + "direct_messages/sent.json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList getSentDirectMessages(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createDirectMessageList(get(conf.getRestBaseURL() + "direct_messages/sent.json", mergeParameters(paging.asPostParameterArray(), INCLUDE_ENTITIES)));
    }

    public SimilarPlaces getSimilarPlaces(GeoLocation geolocation, String s, String s1, String s2)
        throws TwitterException
    {
        ArrayList arraylist = new ArrayList(3);
        arraylist.add(new HttpParameter("lat", geolocation.getLatitude()));
        arraylist.add(new HttpParameter("long", geolocation.getLongitude()));
        arraylist.add(new HttpParameter("name", s));
        if (s1 != null)
        {
            arraylist.add(new HttpParameter("contained_within", s1));
        }
        if (s2 != null)
        {
            arraylist.add(new HttpParameter("attribute:street_address", s2));
        }
        return factory.createSimilarPlaces(get(conf.getRestBaseURL() + "geo/similar_places.json", (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()])));
    }

    public ResponseList getSuggestedUserCategories()
        throws TwitterException
    {
        return factory.createCategoryList(get(conf.getRestBaseURL() + "users/suggestions.json"));
    }

    public String getTermsOfService()
        throws TwitterException
    {
        String s;
        try
        {
            s = get(conf.getRestBaseURL() + "legal/tos.json").asJSONObject().getString("tos");
        }
        catch (JSONException jsonexception)
        {
            throw new TwitterException(jsonexception);
        }
        return s;
    }

    public PagableResponseList getUserListMembers(int i, long l)
        throws TwitterException
    {
        return factory.createPagableUserList(get(conf.getRestBaseURL() + "lists/members.json?list_id=" + i + "&include_entities=" + conf.isIncludeEntitiesEnabled() + "&cursor=" + l));
    }

    public PagableResponseList getUserListMembers(long l, int i, long l1)
        throws TwitterException
    {
        return getUserListMembers(i, l1);
    }

    public PagableResponseList getUserListMembers(String s, int i, long l)
        throws TwitterException
    {
        return getUserListMembers(i, l);
    }

    public PagableResponseList getUserListMemberships(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createPagableUserListList(get(conf.getRestBaseURL() + "lists/memberships.json?cursor=" + l));
    }

    public PagableResponseList getUserListMemberships(long l, long l1)
        throws TwitterException
    {
        return getUserListMemberships(l, l1, false);
    }

    public PagableResponseList getUserListMemberships(long l, long l1, boolean flag)
        throws TwitterException
    {
        if (flag)
        {
            ensureAuthorizationEnabled();
        }
        return factory.createPagableUserListList(get(conf.getRestBaseURL() + "lists/memberships.json?user_id=" + l + "&cursor=" + l1 + "&filter_to_owned_lists=" + flag));
    }

    public PagableResponseList getUserListMemberships(String s, long l)
        throws TwitterException
    {
        return getUserListMemberships(s, l, false);
    }

    public PagableResponseList getUserListMemberships(String s, long l, boolean flag)
        throws TwitterException
    {
        if (flag)
        {
            ensureAuthorizationEnabled();
        }
        return factory.createPagableUserListList(get(conf.getRestBaseURL() + "lists/memberships.json?screen_name=" + s + "&cursor=" + l + "&filter_to_owned_lists=" + flag));
    }

    public ResponseList getUserListStatuses(int i, Paging paging)
        throws TwitterException
    {
        return factory.createStatusList(get(conf.getRestBaseURL() + "lists/statuses.json", mergeParameters(paging.asPostParameterArray(Paging.SMCP, "per_page"), new HttpParameter[] {
            new HttpParameter("list_id", i), INCLUDE_ENTITIES, INCLUDE_RTS
        })));
    }

    public ResponseList getUserListStatuses(long l, int i, Paging paging)
        throws TwitterException
    {
        return getUserListStatuses(i, paging);
    }

    public ResponseList getUserListStatuses(String s, int i, Paging paging)
        throws TwitterException
    {
        return getUserListStatuses(i, paging);
    }

    public PagableResponseList getUserListSubscribers(int i, long l)
        throws TwitterException
    {
        return factory.createPagableUserList(get(conf.getRestBaseURL() + "lists/subscribers.json?list_id=" + i + "&include_entities=" + conf.isIncludeEntitiesEnabled() + "&cursor=" + l));
    }

    public PagableResponseList getUserListSubscribers(String s, int i, long l)
        throws TwitterException
    {
        return getUserListSubscribers(i, l);
    }

    public PagableResponseList getUserListSubscriptions(String s, long l)
        throws TwitterException
    {
        return factory.createPagableUserListList(get(conf.getRestBaseURL() + "lists/subscriptions.json?screen_name=" + s + "&cursor=" + l));
    }

    public PagableResponseList getUserLists(long l, long l1)
        throws TwitterException
    {
        return factory.createPagableUserListList(get(conf.getRestBaseURL() + "lists.json?user_id=" + l + "&cursor=" + l1));
    }

    public PagableResponseList getUserLists(String s, long l)
        throws TwitterException
    {
        return factory.createPagableUserListList(get(conf.getRestBaseURL() + "lists.json?screen_name=" + s + "&cursor=" + l));
    }

    public ResponseList getUserSuggestions(String s)
        throws TwitterException
    {
        s = get(conf.getRestBaseURL() + "users/suggestions/" + s + ".json");
        return factory.createUserListFromJSONArray_Users(s);
    }

    public ResponseList getUserTimeline()
        throws TwitterException
    {
        return getUserTimeline(new Paging());
    }

    public ResponseList getUserTimeline(long l)
        throws TwitterException
    {
        return getUserTimeline(l, new Paging());
    }

    public ResponseList getUserTimeline(long l, Paging paging)
        throws TwitterException
    {
        z_T4JInternalFactory z_t4jinternalfactory = factory;
        String s = conf.getRestBaseURL() + "statuses/user_timeline.json";
        HttpParameter httpparameter = new HttpParameter("user_id", l);
        HttpParameter httpparameter1 = INCLUDE_RTS;
        HttpParameter httpparameter2 = INCLUDE_ENTITIES;
        HttpParameter httpparameter3 = INCLUDE_MY_RETWEET;
        paging = paging.asPostParameterArray();
        return z_t4jinternalfactory.createStatusList(get(s, mergeParameters(new HttpParameter[] {
            httpparameter, httpparameter1, httpparameter2, httpparameter3
        }, paging)));
    }

    public ResponseList getUserTimeline(String s)
        throws TwitterException
    {
        return getUserTimeline(s, new Paging());
    }

    public ResponseList getUserTimeline(String s, Paging paging)
        throws TwitterException
    {
        z_T4JInternalFactory z_t4jinternalfactory = factory;
        String s1 = conf.getRestBaseURL() + "statuses/user_timeline.json";
        s = new HttpParameter("screen_name", s);
        HttpParameter httpparameter = INCLUDE_RTS;
        HttpParameter httpparameter1 = INCLUDE_ENTITIES;
        HttpParameter httpparameter2 = INCLUDE_MY_RETWEET;
        paging = paging.asPostParameterArray();
        return z_t4jinternalfactory.createStatusList(get(s1, mergeParameters(new HttpParameter[] {
            s, httpparameter, httpparameter1, httpparameter2
        }, paging)));
    }

    public ResponseList getUserTimeline(Paging paging)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        z_T4JInternalFactory z_t4jinternalfactory = factory;
        String s = conf.getRestBaseURL() + "statuses/user_timeline.json";
        HttpParameter httpparameter = INCLUDE_RTS;
        HttpParameter httpparameter1 = INCLUDE_ENTITIES;
        HttpParameter httpparameter2 = INCLUDE_MY_RETWEET;
        paging = paging.asPostParameterArray();
        return z_t4jinternalfactory.createStatusList(get(s, mergeParameters(new HttpParameter[] {
            httpparameter, httpparameter1, httpparameter2
        }, paging)));
    }

    public ResponseList getWeeklyTrends()
        throws TwitterException
    {
        return factory.createTrendsList(get(conf.getRestBaseURL() + "trends/weekly.json"));
    }

    public ResponseList getWeeklyTrends(Date date, boolean flag)
        throws TwitterException
    {
        z_T4JInternalFactory z_t4jinternalfactory = factory;
        StringBuffer stringbuffer = (new StringBuffer()).append(conf.getRestBaseURL()).append("trends/weekly.json?date=").append(toDateStr(date));
        if (flag)
        {
            date = "&exclude=hashtags";
        } else
        {
            date = "";
        }
        return z_t4jinternalfactory.createTrendsList(get(stringbuffer.append(date).toString()));
    }

    public int hashCode()
    {
        return (super.hashCode() * 31 + INCLUDE_ENTITIES.hashCode()) * 31 + INCLUDE_RTS.hashCode();
    }

    public ResponseList lookupFriendships(long al[])
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createFriendshipList(get(conf.getRestBaseURL() + "friendships/lookup.json?user_id=" + z_T4JInternalStringUtil.join(al)));
    }

    public ResponseList lookupFriendships(String as[])
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createFriendshipList(get(conf.getRestBaseURL() + "friendships/lookup.json?screen_name=" + z_T4JInternalStringUtil.join(as)));
    }

    public ResponseList lookupUsers(long al[])
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUserList(get(conf.getRestBaseURL() + "users/lookup.json", new HttpParameter[] {
            new HttpParameter("user_id", z_T4JInternalStringUtil.join(al)), INCLUDE_ENTITIES
        }));
    }

    public ResponseList lookupUsers(String as[])
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUserList(get(conf.getRestBaseURL() + "users/lookup.json", new HttpParameter[] {
            new HttpParameter("screen_name", z_T4JInternalStringUtil.join(as)), INCLUDE_ENTITIES
        }));
    }

    public User reportSpam(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "report_spam.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l));
    }

    public User reportSpam(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "report_spam.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s));
    }

    public Status retweetStatus(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatus(post(conf.getRestBaseURL() + "statuses/retweet/" + l + ".json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public ResponseList reverseGeoCode(GeoQuery geoquery)
        throws TwitterException
    {
        try
        {
            geoquery = factory.createPlaceList(get(conf.getRestBaseURL() + "geo/reverse_geocode.json", geoquery.asHttpParameterArray()));
        }
        // Misplaced declaration of an exception variable
        catch (GeoQuery geoquery)
        {
            if (geoquery.getStatusCode() == 404)
            {
                return factory.createEmptyResponseList();
            } else
            {
                throw geoquery;
            }
        }
        return geoquery;
    }

    public QueryResult search(Query query)
        throws TwitterException
    {
        return factory.createQueryResult(get(conf.getSearchBaseURL() + "search.json", query.asHttpParameterArray(INCLUDE_ENTITIES)), query);
    }

    public ResponseList searchPlaces(GeoQuery geoquery)
        throws TwitterException
    {
        return factory.createPlaceList(get(conf.getRestBaseURL() + "geo/search.json", geoquery.asHttpParameterArray()));
    }

    public ResponseList searchUsers(String s, int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUserList(get(conf.getRestBaseURL() + "users/search.json", new HttpParameter[] {
            new HttpParameter("q", s), new HttpParameter("per_page", 20), new HttpParameter("page", i), INCLUDE_ENTITIES
        }));
    }

    public DirectMessage sendDirectMessage(long l, String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createDirectMessage(post(conf.getRestBaseURL() + "direct_messages/new.json", new HttpParameter[] {
            new HttpParameter("user_id", l), new HttpParameter("text", s), INCLUDE_ENTITIES
        }));
    }

    public DirectMessage sendDirectMessage(String s, String s1)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createDirectMessage(post(conf.getRestBaseURL() + "direct_messages/new.json", new HttpParameter[] {
            new HttpParameter("screen_name", s), new HttpParameter("text", s1), INCLUDE_ENTITIES
        }));
    }

    public DirectMessage showDirectMessage(long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createDirectMessage(get(conf.getRestBaseURL() + "direct_messages/show/" + l + ".json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public Relationship showFriendship(long l, long l1)
        throws TwitterException
    {
        return factory.createRelationship(get(conf.getRestBaseURL() + "friendships/show.json", new HttpParameter[] {
            new HttpParameter("source_id", l), new HttpParameter("target_id", l1)
        }));
    }

    public Relationship showFriendship(String s, String s1)
        throws TwitterException
    {
        return factory.createRelationship(get(conf.getRestBaseURL() + "friendships/show.json", HttpParameter.getParameterArray("source_screen_name", s, "target_screen_name", s1)));
    }

    public SavedSearch showSavedSearch(int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createSavedSearch(get(conf.getRestBaseURL() + "saved_searches/show/" + i + ".json"));
    }

    public Status showStatus(long l)
        throws TwitterException
    {
        return factory.createStatus(get(conf.getRestBaseURL() + "statuses/show/" + l + ".json?include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public User showUser(long l)
        throws TwitterException
    {
        return factory.createUser(get(conf.getRestBaseURL() + "users/show.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&user_id=" + l));
    }

    public User showUser(String s)
        throws TwitterException
    {
        return factory.createUser(get(conf.getRestBaseURL() + "users/show.json?include_entities=" + conf.isIncludeEntitiesEnabled() + "&screen_name=" + s));
    }

    public UserList showUserList(int i)
        throws TwitterException
    {
        return factory.createAUserList(get(conf.getRestBaseURL() + "lists/show.json?list_id=" + i));
    }

    public UserList showUserList(String s, int i)
        throws TwitterException
    {
        return showUserList(i);
    }

    public User showUserListMembership(int i, long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(get(conf.getRestBaseURL() + "lists/members/show.json?list_id=" + i + "&user_id=" + l + "&include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public User showUserListSubscription(int i, long l)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(get(conf.getRestBaseURL() + "lists/subscribers/show.json?list_id=" + i + "&user_id=" + l + "&include_entities=" + conf.isIncludeEntitiesEnabled()));
    }

    public UserList subscribeUserList(String s, int i)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createAUserList(post(conf.getRestBaseURL() + s + "/" + i + "/subscribers.json"));
    }

    public boolean test()
        throws TwitterException
    {
        return -1 != get(conf.getRestBaseURL() + "help/test.json").asString().indexOf("ok");
    }

    public String toString()
    {
        return "TwitterImpl{INCLUDE_ENTITIES=" + INCLUDE_ENTITIES + ", INCLUDE_RTS=" + INCLUDE_RTS + '}';
    }

    public UserList unsubscribeUserList(String s, int i)
        throws TwitterException
    {
        return destroyUserListSubscription(i);
    }

    public AccountSettings updateAccountSettings(Integer integer, Boolean boolean1, String s, String s1, String s2, String s3)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        ArrayList arraylist = new ArrayList(6);
        if (integer != null)
        {
            arraylist.add(new HttpParameter("trend_location_woeid", integer.intValue()));
        }
        if (boolean1 != null)
        {
            arraylist.add(new HttpParameter("sleep_time_enabled", boolean1.toString()));
        }
        if (s != null)
        {
            arraylist.add(new HttpParameter("start_sleep_time", s));
        }
        if (s1 != null)
        {
            arraylist.add(new HttpParameter("end_sleep_time", s1));
        }
        if (s2 != null)
        {
            arraylist.add(new HttpParameter("time_zone", s2));
        }
        if (s3 != null)
        {
            arraylist.add(new HttpParameter("lang", s3));
        }
        arraylist.add(INCLUDE_ENTITIES);
        return factory.createAccountSettings(post(conf.getRestBaseURL() + "account/settings.json", (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()])));
    }

    public Relationship updateFriendship(long l, boolean flag, boolean flag1)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createRelationship(post(conf.getRestBaseURL() + "friendships/update.json", new HttpParameter[] {
            new HttpParameter("user_id", l), new HttpParameter("device", flag), new HttpParameter("retweets", flag)
        }));
    }

    public Relationship updateFriendship(String s, boolean flag, boolean flag1)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createRelationship(post(conf.getRestBaseURL() + "friendships/update.json", new HttpParameter[] {
            new HttpParameter("screen_name", s), new HttpParameter("device", flag), new HttpParameter("retweets", flag)
        }));
    }

    public User updateProfile(String s, String s1, String s2, String s3)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        ArrayList arraylist = new ArrayList(4);
        addParameterToList(arraylist, "name", s);
        addParameterToList(arraylist, "url", s1);
        addParameterToList(arraylist, "location", s2);
        addParameterToList(arraylist, "description", s3);
        arraylist.add(INCLUDE_ENTITIES);
        return factory.createUser(post(conf.getRestBaseURL() + "account/update_profile.json", (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()])));
    }

    public User updateProfileBackgroundImage(File file, boolean flag)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        checkFileValidity(file);
        return factory.createUser(post(conf.getRestBaseURL() + "account/update_profile_background_image.json", new HttpParameter[] {
            new HttpParameter("image", file), new HttpParameter("tile", flag), INCLUDE_ENTITIES
        }));
    }

    public User updateProfileBackgroundImage(InputStream inputstream, boolean flag)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "account/update_profile_background_image.json", new HttpParameter[] {
            new HttpParameter("image", "image", inputstream), new HttpParameter("tile", flag), INCLUDE_ENTITIES
        }));
    }

    public User updateProfileColors(String s, String s1, String s2, String s3, String s4)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        ArrayList arraylist = new ArrayList(6);
        addParameterToList(arraylist, "profile_background_color", s);
        addParameterToList(arraylist, "profile_text_color", s1);
        addParameterToList(arraylist, "profile_link_color", s2);
        addParameterToList(arraylist, "profile_sidebar_fill_color", s3);
        addParameterToList(arraylist, "profile_sidebar_border_color", s4);
        arraylist.add(INCLUDE_ENTITIES);
        return factory.createUser(post(conf.getRestBaseURL() + "account/update_profile_colors.json", (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()])));
    }

    public User updateProfileImage(File file)
        throws TwitterException
    {
        checkFileValidity(file);
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "account/update_profile_image.json", new HttpParameter[] {
            new HttpParameter("image", file), INCLUDE_ENTITIES
        }));
    }

    public User updateProfileImage(InputStream inputstream)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createUser(post(conf.getRestBaseURL() + "account/update_profile_image.json", new HttpParameter[] {
            new HttpParameter("image", "image", inputstream), INCLUDE_ENTITIES
        }));
    }

    public Status updateStatus(String s)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        return factory.createStatus(post(conf.getRestBaseURL() + "statuses/update.json", new HttpParameter[] {
            new HttpParameter("status", s), INCLUDE_ENTITIES
        }));
    }

    public Status updateStatus(StatusUpdate statusupdate)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        String s;
        if (statusupdate.isWithMedia())
        {
            s = conf.getUploadBaseURL() + "statuses/update_with_media.json";
        } else
        {
            s = conf.getRestBaseURL() + "statuses/update.json";
        }
        return factory.createStatus(post(s, statusupdate.asHttpParameterArray(INCLUDE_ENTITIES)));
    }

    public UserList updateUserList(int i, String s, boolean flag, String s1)
        throws TwitterException
    {
        ensureAuthorizationEnabled();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new HttpParameter("list_id", i));
        if (s != null)
        {
            arraylist.add(new HttpParameter("name", s));
        }
        if (flag)
        {
            s = "public";
        } else
        {
            s = "private";
        }
        arraylist.add(new HttpParameter("mode", s));
        if (s1 != null)
        {
            arraylist.add(new HttpParameter("description", s1));
        }
        return factory.createAUserList(post(conf.getRestBaseURL() + "lists/update.json", (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()])));
    }

    public User verifyCredentials()
        throws TwitterException
    {
        return super.fillInIDAndScreenName();
    }
}
