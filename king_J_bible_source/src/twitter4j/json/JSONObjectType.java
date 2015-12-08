// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.json;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.internal.logging.Logger;

public final class JSONObjectType
    implements Serializable
{

    public static final JSONObjectType BLOCK = new JSONObjectType("BLOCK");
    public static final JSONObjectType DELETE = new JSONObjectType("DELETE");
    public static final JSONObjectType DIRECT_MESSAGE = new JSONObjectType("DIRECT_MESSAGE");
    public static final JSONObjectType FAVORITE = new JSONObjectType("FAVORITE");
    public static final JSONObjectType FOLLOW = new JSONObjectType("FOLLOW");
    public static final JSONObjectType FRIENDS = new JSONObjectType("FRIENDS");
    public static final JSONObjectType LIMIT = new JSONObjectType("LIMIT");
    public static final JSONObjectType RETWEET = new JSONObjectType("RETWEET");
    public static final JSONObjectType SCRUB_GEO = new JSONObjectType("SCRUB_GEO");
    public static final JSONObjectType SENDER = new JSONObjectType("SENDER");
    public static final JSONObjectType STATUS = new JSONObjectType("STATUS");
    public static final JSONObjectType UNBLOCK = new JSONObjectType("UNBLOCK");
    public static final JSONObjectType UNFAVORITE = new JSONObjectType("UNFAVORITE");
    public static final JSONObjectType UNFOLLOW = new JSONObjectType("UNFOLLOW");
    public static final JSONObjectType USER_LIST_CREATED = new JSONObjectType("USER_LIST_CREATED");
    public static final JSONObjectType USER_LIST_DESTROYED = new JSONObjectType("USER_LIST_DESTROYED");
    public static final JSONObjectType USER_LIST_MEMBER_ADDED = new JSONObjectType("USER_LIST_MEMBER_ADDED");
    public static final JSONObjectType USER_LIST_MEMBER_DELETED = new JSONObjectType("USER_LIST_MEMBER_DELETED");
    public static final JSONObjectType USER_LIST_SUBSCRIBED = new JSONObjectType("USER_LIST_SUBSCRIBED");
    public static final JSONObjectType USER_LIST_UNSUBSCRIBED = new JSONObjectType("USER_LIST_UNSUBSCRIBED");
    public static final JSONObjectType USER_LIST_UPDATED = new JSONObjectType("USER_LIST_UPDATED");
    public static final JSONObjectType USER_UPDATE = new JSONObjectType("USER_UPDATE");
    static Class class$twitter4j$json$JSONObjectType;
    private static final Logger logger;
    private static final long serialVersionUID = 0xc1b8f73de42757dcL;
    private final String name;

    private JSONObjectType()
    {
        throw new AssertionError();
    }

    private JSONObjectType(String s)
    {
        name = s;
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

    public static JSONObjectType determine(JSONObject jsonobject)
    {
        if (!jsonobject.isNull("sender"))
        {
            return SENDER;
        }
        if (!jsonobject.isNull("text"))
        {
            return STATUS;
        }
        if (!jsonobject.isNull("direct_message"))
        {
            return DIRECT_MESSAGE;
        }
        if (!jsonobject.isNull("delete"))
        {
            return DELETE;
        }
        if (!jsonobject.isNull("limit"))
        {
            return LIMIT;
        }
        if (!jsonobject.isNull("scrub_geo"))
        {
            return SCRUB_GEO;
        }
        if (!jsonobject.isNull("friends"))
        {
            return FRIENDS;
        }
        if (jsonobject.isNull("event"))
        {
            break MISSING_BLOCK_LABEL_327;
        }
        Object obj;
        obj = jsonobject.getString("event");
        if ("favorite".equals(obj))
        {
            return FAVORITE;
        }
        if ("unfavorite".equals(obj))
        {
            return UNFAVORITE;
        }
        if ("retweet".equals(obj))
        {
            return RETWEET;
        }
        if ("follow".equals(obj))
        {
            return FOLLOW;
        }
        if ("unfollow".equals(obj))
        {
            return UNFOLLOW;
        }
        if (((String) (obj)).startsWith("list"))
        {
            if ("list_member_added".equals(obj))
            {
                return USER_LIST_MEMBER_ADDED;
            }
            if ("list_member_removed".equals(obj))
            {
                return USER_LIST_MEMBER_DELETED;
            }
            if ("list_user_subscribed".equals(obj))
            {
                return USER_LIST_SUBSCRIBED;
            }
            if ("list_user_unsubscribed".equals(obj))
            {
                return USER_LIST_UNSUBSCRIBED;
            }
            if ("list_created".equals(obj))
            {
                return USER_LIST_CREATED;
            }
            if ("list_updated".equals(obj))
            {
                return USER_LIST_UPDATED;
            }
            if ("list_destroyed".equals(obj))
            {
                return USER_LIST_DESTROYED;
            }
            break MISSING_BLOCK_LABEL_327;
        }
        if ("user_update".equals(obj))
        {
            return USER_UPDATE;
        }
        if ("block".equals(obj))
        {
            return BLOCK;
        }
        if (!"unblock".equals(obj))
        {
            break MISSING_BLOCK_LABEL_327;
        }
        obj = UNBLOCK;
        return ((JSONObjectType) (obj));
        JSONException jsonexception;
        jsonexception;
        try
        {
            logger.warn("Failed to get event element: ", jsonobject.toString(2));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        return null;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (JSONObjectType)obj;
            if (name == null ? ((JSONObjectType) (obj)).name != null : !name.equals(((JSONObjectType) (obj)).name))
            {
                return false;
            }
        }
        return true;
    }

    public String getName()
    {
        return name;
    }

    public int hashCode()
    {
        if (name != null)
        {
            return name.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        Class class1;
        if (class$twitter4j$json$JSONObjectType == null)
        {
            class1 = _mthclass$("twitter4j.json.JSONObjectType");
            class$twitter4j$json$JSONObjectType = class1;
        } else
        {
            class1 = class$twitter4j$json$JSONObjectType;
        }
        logger = Logger.getLogger(class1);
    }
}
