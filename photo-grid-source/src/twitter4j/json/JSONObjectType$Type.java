// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.json;


public final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN BLOCK;
    public static final UNKNOWN DELETE;
    public static final UNKNOWN DIRECT_MESSAGE;
    public static final UNKNOWN DISCONNECTION;
    public static final UNKNOWN FAVORITE;
    public static final UNKNOWN FOLLOW;
    public static final UNKNOWN FRIENDS;
    public static final UNKNOWN LIMIT;
    public static final UNKNOWN SCRUB_GEO;
    public static final UNKNOWN SENDER;
    public static final UNKNOWN STALL_WARNING;
    public static final UNKNOWN STATUS;
    public static final UNKNOWN UNBLOCK;
    public static final UNKNOWN UNFAVORITE;
    public static final UNKNOWN UNFOLLOW;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN USER_LIST_CREATED;
    public static final UNKNOWN USER_LIST_DESTROYED;
    public static final UNKNOWN USER_LIST_MEMBER_ADDED;
    public static final UNKNOWN USER_LIST_MEMBER_DELETED;
    public static final UNKNOWN USER_LIST_SUBSCRIBED;
    public static final UNKNOWN USER_LIST_UNSUBSCRIBED;
    public static final UNKNOWN USER_LIST_UPDATED;
    public static final UNKNOWN USER_UPDATE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(twitter4j/json/JSONObjectType$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SENDER = new <init>("SENDER", 0);
        STATUS = new <init>("STATUS", 1);
        DIRECT_MESSAGE = new <init>("DIRECT_MESSAGE", 2);
        DELETE = new <init>("DELETE", 3);
        LIMIT = new <init>("LIMIT", 4);
        STALL_WARNING = new <init>("STALL_WARNING", 5);
        SCRUB_GEO = new <init>("SCRUB_GEO", 6);
        FRIENDS = new <init>("FRIENDS", 7);
        FAVORITE = new <init>("FAVORITE", 8);
        UNFAVORITE = new <init>("UNFAVORITE", 9);
        FOLLOW = new <init>("FOLLOW", 10);
        UNFOLLOW = new <init>("UNFOLLOW", 11);
        USER_LIST_MEMBER_ADDED = new <init>("USER_LIST_MEMBER_ADDED", 12);
        USER_LIST_MEMBER_DELETED = new <init>("USER_LIST_MEMBER_DELETED", 13);
        USER_LIST_SUBSCRIBED = new <init>("USER_LIST_SUBSCRIBED", 14);
        USER_LIST_UNSUBSCRIBED = new <init>("USER_LIST_UNSUBSCRIBED", 15);
        USER_LIST_CREATED = new <init>("USER_LIST_CREATED", 16);
        USER_LIST_UPDATED = new <init>("USER_LIST_UPDATED", 17);
        USER_LIST_DESTROYED = new <init>("USER_LIST_DESTROYED", 18);
        USER_UPDATE = new <init>("USER_UPDATE", 19);
        BLOCK = new <init>("BLOCK", 20);
        UNBLOCK = new <init>("UNBLOCK", 21);
        DISCONNECTION = new <init>("DISCONNECTION", 22);
        UNKNOWN = new <init>("UNKNOWN", 23);
        $VALUES = (new .VALUES[] {
            SENDER, STATUS, DIRECT_MESSAGE, DELETE, LIMIT, STALL_WARNING, SCRUB_GEO, FRIENDS, FAVORITE, UNFAVORITE, 
            FOLLOW, UNFOLLOW, USER_LIST_MEMBER_ADDED, USER_LIST_MEMBER_DELETED, USER_LIST_SUBSCRIBED, USER_LIST_UNSUBSCRIBED, USER_LIST_CREATED, USER_LIST_UPDATED, USER_LIST_DESTROYED, USER_UPDATE, 
            BLOCK, UNBLOCK, DISCONNECTION, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
