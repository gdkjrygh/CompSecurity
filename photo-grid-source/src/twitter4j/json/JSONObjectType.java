// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.json;

import twitter4j.internal.logging.Logger;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

public final class JSONObjectType
{

    private static final Logger logger = Logger.getLogger(twitter4j/json/JSONObjectType);

    public JSONObjectType()
    {
    }

    public static Type determine(JSONObject jsonobject)
    {
        if (!jsonobject.isNull("sender"))
        {
            return Type.SENDER;
        }
        if (!jsonobject.isNull("text"))
        {
            return Type.STATUS;
        }
        if (!jsonobject.isNull("direct_message"))
        {
            return Type.DIRECT_MESSAGE;
        }
        if (!jsonobject.isNull("delete"))
        {
            return Type.DELETE;
        }
        if (!jsonobject.isNull("limit"))
        {
            return Type.LIMIT;
        }
        if (!jsonobject.isNull("warning"))
        {
            return Type.STALL_WARNING;
        }
        if (!jsonobject.isNull("scrub_geo"))
        {
            return Type.SCRUB_GEO;
        }
        if (!jsonobject.isNull("friends"))
        {
            return Type.FRIENDS;
        }
        if (jsonobject.isNull("event"))
        {
            break MISSING_BLOCK_LABEL_331;
        }
        Object obj;
        obj = jsonobject.getString("event");
        if ("favorite".equals(obj))
        {
            return Type.FAVORITE;
        }
        if ("unfavorite".equals(obj))
        {
            return Type.UNFAVORITE;
        }
        if ("follow".equals(obj))
        {
            return Type.FOLLOW;
        }
        if ("unfollow".equals(obj))
        {
            return Type.UNFOLLOW;
        }
        if (((String) (obj)).startsWith("list"))
        {
            if ("list_member_added".equals(obj))
            {
                return Type.USER_LIST_MEMBER_ADDED;
            }
            if ("list_member_removed".equals(obj))
            {
                return Type.USER_LIST_MEMBER_DELETED;
            }
            if ("list_user_subscribed".equals(obj))
            {
                return Type.USER_LIST_SUBSCRIBED;
            }
            if ("list_user_unsubscribed".equals(obj))
            {
                return Type.USER_LIST_UNSUBSCRIBED;
            }
            if ("list_created".equals(obj))
            {
                return Type.USER_LIST_CREATED;
            }
            if ("list_updated".equals(obj))
            {
                return Type.USER_LIST_UPDATED;
            }
            if ("list_destroyed".equals(obj))
            {
                return Type.USER_LIST_DESTROYED;
            }
            break MISSING_BLOCK_LABEL_327;
        }
        if ("user_update".equals(obj))
        {
            return Type.USER_UPDATE;
        }
        if ("block".equals(obj))
        {
            return Type.BLOCK;
        }
        if (!"unblock".equals(obj))
        {
            break MISSING_BLOCK_LABEL_327;
        }
        obj = Type.UNBLOCK;
        return ((Type) (obj));
        JSONException jsonexception;
        jsonexception;
        try
        {
            logger.warn("Failed to get event element: ", jsonobject.toString(2));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        return Type.UNKNOWN;
        if (!jsonobject.isNull("disconnect"))
        {
            return Type.DISCONNECTION;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_327;
_L1:
    }


    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type BLOCK;
        public static final Type DELETE;
        public static final Type DIRECT_MESSAGE;
        public static final Type DISCONNECTION;
        public static final Type FAVORITE;
        public static final Type FOLLOW;
        public static final Type FRIENDS;
        public static final Type LIMIT;
        public static final Type SCRUB_GEO;
        public static final Type SENDER;
        public static final Type STALL_WARNING;
        public static final Type STATUS;
        public static final Type UNBLOCK;
        public static final Type UNFAVORITE;
        public static final Type UNFOLLOW;
        public static final Type UNKNOWN;
        public static final Type USER_LIST_CREATED;
        public static final Type USER_LIST_DESTROYED;
        public static final Type USER_LIST_MEMBER_ADDED;
        public static final Type USER_LIST_MEMBER_DELETED;
        public static final Type USER_LIST_SUBSCRIBED;
        public static final Type USER_LIST_UNSUBSCRIBED;
        public static final Type USER_LIST_UPDATED;
        public static final Type USER_UPDATE;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(twitter4j/json/JSONObjectType$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            SENDER = new Type("SENDER", 0);
            STATUS = new Type("STATUS", 1);
            DIRECT_MESSAGE = new Type("DIRECT_MESSAGE", 2);
            DELETE = new Type("DELETE", 3);
            LIMIT = new Type("LIMIT", 4);
            STALL_WARNING = new Type("STALL_WARNING", 5);
            SCRUB_GEO = new Type("SCRUB_GEO", 6);
            FRIENDS = new Type("FRIENDS", 7);
            FAVORITE = new Type("FAVORITE", 8);
            UNFAVORITE = new Type("UNFAVORITE", 9);
            FOLLOW = new Type("FOLLOW", 10);
            UNFOLLOW = new Type("UNFOLLOW", 11);
            USER_LIST_MEMBER_ADDED = new Type("USER_LIST_MEMBER_ADDED", 12);
            USER_LIST_MEMBER_DELETED = new Type("USER_LIST_MEMBER_DELETED", 13);
            USER_LIST_SUBSCRIBED = new Type("USER_LIST_SUBSCRIBED", 14);
            USER_LIST_UNSUBSCRIBED = new Type("USER_LIST_UNSUBSCRIBED", 15);
            USER_LIST_CREATED = new Type("USER_LIST_CREATED", 16);
            USER_LIST_UPDATED = new Type("USER_LIST_UPDATED", 17);
            USER_LIST_DESTROYED = new Type("USER_LIST_DESTROYED", 18);
            USER_UPDATE = new Type("USER_UPDATE", 19);
            BLOCK = new Type("BLOCK", 20);
            UNBLOCK = new Type("UNBLOCK", 21);
            DISCONNECTION = new Type("DISCONNECTION", 22);
            UNKNOWN = new Type("UNKNOWN", 23);
            $VALUES = (new Type[] {
                SENDER, STATUS, DIRECT_MESSAGE, DELETE, LIMIT, STALL_WARNING, SCRUB_GEO, FRIENDS, FAVORITE, UNFAVORITE, 
                FOLLOW, UNFOLLOW, USER_LIST_MEMBER_ADDED, USER_LIST_MEMBER_DELETED, USER_LIST_SUBSCRIBED, USER_LIST_UNSUBSCRIBED, USER_LIST_CREATED, USER_LIST_UPDATED, USER_LIST_DESTROYED, USER_UPDATE, 
                BLOCK, UNBLOCK, DISCONNECTION, UNKNOWN
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
