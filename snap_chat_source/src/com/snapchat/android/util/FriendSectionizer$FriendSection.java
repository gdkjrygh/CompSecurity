// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            FriendSectionizer

public static final class  extends Enum
{

    private static final RECOMMENDED $VALUES[];
    public static final RECOMMENDED ADD_FRIEND;
    public static final RECOMMENDED ALPHABETICAL;
    public static final RECOMMENDED BEST_FRIEND;
    public static final RECOMMENDED BLOCKED;
    public static final RECOMMENDED DEFAULT;
    public static final RECOMMENDED FRIENDS_WHO_ADDED_ME;
    public static final RECOMMENDED INVITE;
    public static final RECOMMENDED JUST_ADDED;
    public static final RECOMMENDED LIVE;
    public static final RECOMMENDED ME;
    public static final RECOMMENDED MY_ADDRESS_BOOK;
    public static final RECOMMENDED MY_FRIENDS;
    public static final RECOMMENDED NEEDS_LOVE;
    public static final RECOMMENDED NEW_FRIEND;
    public static final RECOMMENDED NONE;
    public static final RECOMMENDED ON_SNAPCHAT;
    public static final RECOMMENDED ON_SNAPCHAT_TRUNCATED;
    public static final RECOMMENDED PENDING;
    public static final RECOMMENDED RECENT;
    public static final RECOMMENDED RECOMMENDED;
    public static final RECOMMENDED STORIES;
    public static final RECOMMENDED SUGGESTED;
    public static final RECOMMENDED SUGGESTED_FRIEND;
    public static final RECOMMENDED USERNAME;
    public static final RECOMMENDED VERIFIED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/FriendSectionizer$FriendSection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STORIES = new <init>("STORIES", 0);
        LIVE = new <init>("LIVE", 1);
        VERIFIED = new <init>("VERIFIED", 2);
        SUGGESTED = new <init>("SUGGESTED", 3);
        ADD_FRIEND = new <init>("ADD_FRIEND", 4);
        PENDING = new <init>("PENDING", 5);
        BLOCKED = new <init>("BLOCKED", 6);
        BEST_FRIEND = new <init>("BEST_FRIEND", 7);
        RECENT = new <init>("RECENT", 8);
        NEEDS_LOVE = new <init>("NEEDS_LOVE", 9);
        DEFAULT = new <init>("DEFAULT", 10);
        JUST_ADDED = new <init>("JUST_ADDED", 11);
        NEW_FRIEND = new <init>("NEW_FRIEND", 12);
        ALPHABETICAL = new <init>("ALPHABETICAL", 13);
        ON_SNAPCHAT = new <init>("ON_SNAPCHAT", 14);
        INVITE = new <init>("INVITE", 15);
        ME = new <init>("ME", 16);
        FRIENDS_WHO_ADDED_ME = new <init>("FRIENDS_WHO_ADDED_ME", 17);
        MY_FRIENDS = new <init>("MY_FRIENDS", 18);
        USERNAME = new <init>("USERNAME", 19);
        NONE = new <init>("NONE", 20);
        MY_ADDRESS_BOOK = new <init>("MY_ADDRESS_BOOK", 21);
        SUGGESTED_FRIEND = new <init>("SUGGESTED_FRIEND", 22);
        ON_SNAPCHAT_TRUNCATED = new <init>("ON_SNAPCHAT_TRUNCATED", 23);
        RECOMMENDED = new <init>("RECOMMENDED", 24);
        $VALUES = (new .VALUES[] {
            STORIES, LIVE, VERIFIED, SUGGESTED, ADD_FRIEND, PENDING, BLOCKED, BEST_FRIEND, RECENT, NEEDS_LOVE, 
            DEFAULT, JUST_ADDED, NEW_FRIEND, ALPHABETICAL, ON_SNAPCHAT, INVITE, ME, FRIENDS_WHO_ADDED_ME, MY_FRIENDS, USERNAME, 
            NONE, MY_ADDRESS_BOOK, SUGGESTED_FRIEND, ON_SNAPCHAT_TRUNCATED, RECOMMENDED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
