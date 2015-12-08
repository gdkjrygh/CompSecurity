// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.json;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import twitter4j.AccountTotals;
import twitter4j.Category;
import twitter4j.DirectMessage;
import twitter4j.IDs;
import twitter4j.Location;
import twitter4j.OEmbed;
import twitter4j.Place;
import twitter4j.Relationship;
import twitter4j.SavedSearch;
import twitter4j.Status;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.json:
//            JSONObjectType

public final class DataObjectFactory
{

    private static final Constructor IDsConstructor;
    private static final Constructor accountTotalsConstructor;
    private static final Constructor categoryConstructor;
    private static final Constructor directMessageConstructor;
    private static final Constructor locationConstructor;
    private static final Constructor oembedConstructor;
    private static final Constructor placeConstructor;
    private static final Method rateLimitStatusConstructor;
    private static final ThreadLocal rawJsonMap = new _cls1();
    private static final Constructor relationshipConstructor;
    private static final Constructor savedSearchConstructor;
    private static final Constructor statusConstructor;
    private static final Constructor statusDeletionNoticeConstructor;
    private static final Constructor trendConstructor;
    private static final Constructor trendsConstructor;
    private static final Constructor userConstructor;
    private static final Constructor userListConstructor;

    private DataObjectFactory()
    {
        throw new AssertionError("not intended to be instantiated.");
    }

    static void clearThreadLocalMap()
    {
        ((Map)rawJsonMap.get()).clear();
    }

    public static AccountTotals createAccountTotals(String s)
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

    public static OEmbed createOEmbed(String s)
    {
        try
        {
            s = new JSONObject(s);
            s = (OEmbed)oembedConstructor.newInstance(new Object[] {
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
    {
        JSONObjectType.Type type;
        s = new JSONObject(s);
        type = JSONObjectType.determine(s);
        _cls2..SwitchMap.twitter4j.json.JSONObjectType.Type[type.ordinal()];
        JVM INSTR tableswitch 1 6: default 198
    //                   1 60
    //                   2 84
    //                   3 103
    //                   4 127
    //                   5 198
    //                   6 198;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1
_L2:
        return registerJSONObject(directMessageConstructor.newInstance(new Object[] {
            s.getJSONObject("direct_message")
        }), s);
_L3:
        return registerJSONObject(statusConstructor.newInstance(new Object[] {
            s
        }), s);
_L4:
        return registerJSONObject(directMessageConstructor.newInstance(new Object[] {
            s.getJSONObject("direct_message")
        }), s);
_L5:
        s = ((String) (registerJSONObject(statusDeletionNoticeConstructor.newInstance(new Object[] {
            s.getJSONObject("delete").getJSONObject("status")
        }), s)));
        return s;
        s;
        throw new TwitterException(s);
        s;
        throw new AssertionError(s);
        s;
        throw new TwitterException(s);
        s;
        throw new TwitterException(s);
_L1:
        return s;
    }

    public static Place createPlace(String s)
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

    public static Map createRateLimitStatus(String s)
    {
        try
        {
            s = new JSONObject(s);
            s = (Map)rateLimitStatusConstructor.invoke(Class.forName("twitter4j.internal.json.RateLimitStatusJSONImpl"), new Object[] {
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

    public static User createUser(String s)
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
        try
        {
            Object obj = Class.forName("twitter4j.internal.json.StatusJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            statusConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.UserJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            userConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.RelationshipJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            relationshipConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.PlaceJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            placeConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.SavedSearchJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            savedSearchConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.TrendJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            trendConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.TrendsJSONImpl").getDeclaredConstructor(new Class[] {
                java/lang/String
            });
            trendsConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.IDsJSONImpl").getDeclaredConstructor(new Class[] {
                java/lang/String
            });
            IDsConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.RateLimitStatusJSONImpl").getDeclaredMethod("createRateLimitStatuses", new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            rateLimitStatusConstructor = ((Method) (obj));
            ((Method) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.CategoryJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            categoryConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.DirectMessageJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            directMessageConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.LocationJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            locationConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.UserListJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            userListConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.StatusDeletionNoticeImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            statusDeletionNoticeConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.AccountTotalsJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            accountTotalsConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
            obj = Class.forName("twitter4j.internal.json.OEmbedJSONImpl").getDeclaredConstructor(new Class[] {
                twitter4j/internal/org/json/JSONObject
            });
            oembedConstructor = ((Constructor) (obj));
            ((Constructor) (obj)).setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new ExceptionInInitializerError(nosuchmethodexception);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new ExceptionInInitializerError(classnotfoundexception);
        }
    }

    private class _cls2
    {

        static final int $SwitchMap$twitter4j$json$JSONObjectType$Type[];

        static 
        {
            $SwitchMap$twitter4j$json$JSONObjectType$Type = new int[JSONObjectType.Type.values().length];
            try
            {
                $SwitchMap$twitter4j$json$JSONObjectType$Type[JSONObjectType.Type.SENDER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$twitter4j$json$JSONObjectType$Type[JSONObjectType.Type.STATUS.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$twitter4j$json$JSONObjectType$Type[JSONObjectType.Type.DIRECT_MESSAGE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$twitter4j$json$JSONObjectType$Type[JSONObjectType.Type.DELETE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$twitter4j$json$JSONObjectType$Type[JSONObjectType.Type.LIMIT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$twitter4j$json$JSONObjectType$Type[JSONObjectType.Type.SCRUB_GEO.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1 extends ThreadLocal
    {

        protected final volatile Object initialValue()
        {
            return initialValue();
        }

        protected final Map initialValue()
        {
            return new HashMap();
        }

        _cls1()
        {
        }
    }

}
