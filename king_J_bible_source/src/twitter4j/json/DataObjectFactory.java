// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.json;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.AccountTotals;
import twitter4j.Category;
import twitter4j.DirectMessage;
import twitter4j.IDs;
import twitter4j.Location;
import twitter4j.Place;
import twitter4j.RateLimitStatus;
import twitter4j.RelatedResults;
import twitter4j.Relationship;
import twitter4j.SavedSearch;
import twitter4j.Status;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.Tweet;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;

// Referenced classes of package twitter4j.json:
//            JSONObjectType

public final class DataObjectFactory
{

    private static final Constructor IDsConstructor;
    private static final Constructor accountTotalsConstructor;
    private static final Constructor categoryConstructor;
    static Class class$java$lang$String;
    static Class class$org$json$JSONArray;
    static Class class$org$json$JSONObject;
    private static final Constructor directMessageConstructor;
    private static final Constructor locationConstructor;
    private static final Constructor placeConstructor;
    private static final Constructor rateLimitStatusConstructor;
    private static final ThreadLocal rawJsonMap;
    private static final Constructor relatedResultsConstructor;
    private static final Constructor relationshipConstructor;
    private static final Constructor savedSearchConstructor;
    private static final Constructor statusConstructor;
    private static final Constructor statusDeletionNoticeConstructor;
    private static final Constructor trendConstructor;
    private static final Constructor trendsConstructor;
    private static final Constructor tweetConstructor;
    private static final Constructor userConstructor;
    private static final Constructor userListConstructor;

    private DataObjectFactory()
    {
        throw new AssertionError("not intended to be instantiated.");
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
    }

    static void clearThreadLocalMap()
    {
        ((Map)rawJsonMap.get()).clear();
    }

    public static AccountTotals createAccountTotals(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (AccountTotals)accountTotalsConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static Category createCategory(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (Category)categoryConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static DirectMessage createDirectMessage(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (DirectMessage)directMessageConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static IDs createIDs(String s)
        throws TwitterException
    {
        try
        {
            s = (IDs)IDsConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static Location createLocation(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (Location)locationConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static Object createObject(String s)
        throws TwitterException
    {
label0:
        {
            JSONObjectType jsonobjecttype;
            JSONObjectType jsonobjecttype1;
            try
            {
                s = new JSONObject(s);
                jsonobjecttype = JSONObjectType.determine(s);
                if (JSONObjectType.SENDER == jsonobjecttype)
                {
                    return registerJSONObject(directMessageConstructor.newInstance(new Object[] {
                        s.getJSONObject("direct_message")
                    }), s);
                }
                if (JSONObjectType.STATUS == jsonobjecttype)
                {
                    return registerJSONObject(statusConstructor.newInstance(new Object[] {
                        s
                    }), s);
                }
                if (JSONObjectType.DIRECT_MESSAGE == jsonobjecttype)
                {
                    return registerJSONObject(directMessageConstructor.newInstance(new Object[] {
                        s.getJSONObject("direct_message")
                    }), s);
                }
                if (JSONObjectType.DELETE == jsonobjecttype)
                {
                    return registerJSONObject(statusDeletionNoticeConstructor.newInstance(new Object[] {
                        s.getJSONObject("delete").getJSONObject("status")
                    }), s);
                }
                if (JSONObjectType.LIMIT == jsonobjecttype)
                {
                    break label0;
                }
                jsonobjecttype1 = JSONObjectType.SCRUB_GEO;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new TwitterException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new TwitterException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new TwitterException(s);
            }
            if (jsonobjecttype1 == jsonobjecttype)
            {
                return s;
            }
        }
        return s;
    }

    public static Place createPlace(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (Place)placeConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static RateLimitStatus createRateLimitStatus(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (RateLimitStatus)rateLimitStatusConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static RelatedResults createRelatedResults(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONArray(s);
            s = (RelatedResults)relatedResultsConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static Relationship createRelationship(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (Relationship)relationshipConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static SavedSearch createSavedSearch(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (SavedSearch)savedSearchConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static Status createStatus(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (Status)statusConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static Trend createTrend(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (Trend)trendConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static Trends createTrends(String s)
        throws TwitterException
    {
        try
        {
            s = (Trends)trendsConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    public static Tweet createTweet(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (Tweet)tweetConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static User createUser(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (User)userConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static UserList createUserList(String s)
        throws TwitterException
    {
        try
        {
            s = new JSONObject(s);
            s = (UserList)userListConstructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s);
        }
        return s;
    }

    public static String getRawJSON(Object obj)
    {
        obj = ((Map)rawJsonMap.get()).get(obj);
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj != null)
        {
            return obj.toString();
        } else
        {
            return null;
        }
    }

    static Object registerJSONObject(Object obj, Object obj1)
    {
        ((Map)rawJsonMap.get()).put(obj, obj1);
        return obj;
    }

    static 
    {
        Class class2 = Class.forName("twitter4j.internal.json.StatusJSONImpl");
        if (class$org$json$JSONObject != null) goto _L2; else goto _L1
_L1:
        Class class1;
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L33:
        statusConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        statusConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.UserJSONImpl");
        if (class$org$json$JSONObject != null) goto _L4; else goto _L3
_L3:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L34:
        userConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        userConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.TweetJSONImpl");
        if (class$org$json$JSONObject != null) goto _L6; else goto _L5
_L5:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L35:
        tweetConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        tweetConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.RelationshipJSONImpl");
        if (class$org$json$JSONObject != null) goto _L8; else goto _L7
_L7:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L36:
        relationshipConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        relationshipConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.PlaceJSONImpl");
        if (class$org$json$JSONObject != null) goto _L10; else goto _L9
_L9:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L37:
        placeConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        placeConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.SavedSearchJSONImpl");
        if (class$org$json$JSONObject != null) goto _L12; else goto _L11
_L11:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L38:
        savedSearchConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        savedSearchConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.TrendJSONImpl");
        if (class$org$json$JSONObject != null) goto _L14; else goto _L13
_L13:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L39:
        trendConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        trendConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.TrendsJSONImpl");
        if (class$java$lang$String != null) goto _L16; else goto _L15
_L15:
        class1 = _mthclass$("java.lang.String");
        class$java$lang$String = class1;
_L40:
        trendsConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        trendsConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.IDsJSONImpl");
        if (class$java$lang$String != null) goto _L18; else goto _L17
_L17:
        class1 = _mthclass$("java.lang.String");
        class$java$lang$String = class1;
_L41:
        IDsConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        IDsConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.RateLimitStatusJSONImpl");
        if (class$org$json$JSONObject != null) goto _L20; else goto _L19
_L19:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L42:
        rateLimitStatusConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        rateLimitStatusConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.CategoryJSONImpl");
        if (class$org$json$JSONObject != null) goto _L22; else goto _L21
_L21:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L43:
        categoryConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        categoryConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.DirectMessageJSONImpl");
        if (class$org$json$JSONObject != null) goto _L24; else goto _L23
_L23:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L44:
        directMessageConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        directMessageConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.LocationJSONImpl");
        if (class$org$json$JSONObject != null) goto _L26; else goto _L25
_L25:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L45:
        locationConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        locationConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.UserListJSONImpl");
        if (class$org$json$JSONObject != null) goto _L28; else goto _L27
_L27:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L46:
        userListConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        userListConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.RelatedResultsJSONImpl");
        if (class$org$json$JSONArray != null) goto _L30; else goto _L29
_L29:
        class1 = _mthclass$("org.json.JSONArray");
        class$org$json$JSONArray = class1;
_L47:
        relatedResultsConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        relatedResultsConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.StatusDeletionNoticeImpl");
        if (class$org$json$JSONObject != null) goto _L32; else goto _L31
_L31:
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L48:
        statusDeletionNoticeConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        statusDeletionNoticeConstructor.setAccessible(true);
        class2 = Class.forName("twitter4j.internal.json.AccountTotalsJSONImpl");
        if (class$org$json$JSONObject != null)
        {
            break MISSING_BLOCK_LABEL_871;
        }
        class1 = _mthclass$("org.json.JSONObject");
        class$org$json$JSONObject = class1;
_L49:
        accountTotalsConstructor = class2.getDeclaredConstructor(new Class[] {
            class1
        });
        accountTotalsConstructor.setAccessible(true);
        rawJsonMap = new ThreadLocal() {

            protected Object initialValue()
            {
                return initialValue();
            }

            protected Map initialValue()
            {
                return new HashMap();
            }

        };
        return;
_L2:
        try
        {
            class1 = class$org$json$JSONObject;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new ExceptionInInitializerError(nosuchmethodexception);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new ExceptionInInitializerError(classnotfoundexception);
        }
          goto _L33
_L4:
        class1 = class$org$json$JSONObject;
          goto _L34
_L6:
        class1 = class$org$json$JSONObject;
          goto _L35
_L8:
        class1 = class$org$json$JSONObject;
          goto _L36
_L10:
        class1 = class$org$json$JSONObject;
          goto _L37
_L12:
        class1 = class$org$json$JSONObject;
          goto _L38
_L14:
        class1 = class$org$json$JSONObject;
          goto _L39
_L16:
        class1 = class$java$lang$String;
          goto _L40
_L18:
        class1 = class$java$lang$String;
          goto _L41
_L20:
        class1 = class$org$json$JSONObject;
          goto _L42
_L22:
        class1 = class$org$json$JSONObject;
          goto _L43
_L24:
        class1 = class$org$json$JSONObject;
          goto _L44
_L26:
        class1 = class$org$json$JSONObject;
          goto _L45
_L28:
        class1 = class$org$json$JSONObject;
          goto _L46
_L30:
        class1 = class$org$json$JSONArray;
          goto _L47
_L32:
        class1 = class$org$json$JSONObject;
          goto _L48
        class1 = class$org$json$JSONObject;
          goto _L49
    }
}
