// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.model;


public final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE AUTO_COMPLETE;
    public static final NONE BOARD;
    public static final NONE CONNECT_FB_PLACEHOLDER;
    public static final NONE CONTACT_NOT_FOUND_MISSING_PERMISSION;
    public static final NONE CONVERSATION;
    public static final NONE EMAIL_CONTACT;
    public static final NONE EMAIL_PLACEHOLDER;
    public static final NONE EMPTY_PLACEHOLDER;
    public static final NONE EXTERNAL_CONTACT;
    public static final NONE FACEBOOK_CONTACT;
    public static final NONE FOLLOWEE;
    public static final NONE GOOGLE_CONTACT;
    public static final NONE MUTUAL_FOLLOW;
    public static final NONE NONE;
    public static final NONE PHONE_CONTACT;
    public static final NONE PINNER;
    public static final NONE RECENT_QUERY;
    public static final NONE SEARCH_PLACEHOLDER;
    public static final NONE TWITTER_CONTACT;
    public static final NONE YAHOO_CONTACT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/search/model/TypeAheadItem$ItemType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EMPTY_PLACEHOLDER = new <init>("EMPTY_PLACEHOLDER", 0);
        SEARCH_PLACEHOLDER = new <init>("SEARCH_PLACEHOLDER", 1);
        CONNECT_FB_PLACEHOLDER = new <init>("CONNECT_FB_PLACEHOLDER", 2);
        EMAIL_PLACEHOLDER = new <init>("EMAIL_PLACEHOLDER", 3);
        RECENT_QUERY = new <init>("RECENT_QUERY", 4);
        AUTO_COMPLETE = new <init>("AUTO_COMPLETE", 5);
        FACEBOOK_CONTACT = new <init>("FACEBOOK_CONTACT", 6);
        TWITTER_CONTACT = new <init>("TWITTER_CONTACT", 7);
        YAHOO_CONTACT = new <init>("YAHOO_CONTACT", 8);
        GOOGLE_CONTACT = new <init>("GOOGLE_CONTACT", 9);
        EMAIL_CONTACT = new <init>("EMAIL_CONTACT", 10);
        EXTERNAL_CONTACT = new <init>("EXTERNAL_CONTACT", 11);
        PHONE_CONTACT = new <init>("PHONE_CONTACT", 12);
        PINNER = new <init>("PINNER", 13);
        MUTUAL_FOLLOW = new <init>("MUTUAL_FOLLOW", 14);
        FOLLOWEE = new <init>("FOLLOWEE", 15);
        BOARD = new <init>("BOARD", 16);
        CONVERSATION = new <init>("CONVERSATION", 17);
        CONTACT_NOT_FOUND_MISSING_PERMISSION = new <init>("CONTACT_NOT_FOUND_MISSING_PERMISSION", 18);
        NONE = new <init>("NONE", 19);
        $VALUES = (new .VALUES[] {
            EMPTY_PLACEHOLDER, SEARCH_PLACEHOLDER, CONNECT_FB_PLACEHOLDER, EMAIL_PLACEHOLDER, RECENT_QUERY, AUTO_COMPLETE, FACEBOOK_CONTACT, TWITTER_CONTACT, YAHOO_CONTACT, GOOGLE_CONTACT, 
            EMAIL_CONTACT, EXTERNAL_CONTACT, PHONE_CONTACT, PINNER, MUTUAL_FOLLOW, FOLLOWEE, BOARD, CONVERSATION, CONTACT_NOT_FOUND_MISSING_PERMISSION, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
