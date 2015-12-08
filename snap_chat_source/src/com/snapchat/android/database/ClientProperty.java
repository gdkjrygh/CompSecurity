// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database;


public final class ClientProperty extends Enum
{

    private static final ClientProperty $VALUES[];
    public static final ClientProperty LAST_STORY_PAGE_PROMPT_ID;
    public static final ClientProperty LAST_STORY_PAGE_PROMPT_TIMESTAMP;
    public static final ClientProperty SNAPCASH_NEW_TOS_ACCEPTED;
    public static final ClientProperty SQUARE_TOS_ACCEPTED;
    public static final ClientProperty TOS_ACCEPTED;
    public static final ClientProperty TOU_9_14_ACCEPTED;

    private ClientProperty(String s, int i)
    {
        super(s, i);
    }

    public static ClientProperty valueOf(String s)
    {
        return (ClientProperty)Enum.valueOf(com/snapchat/android/database/ClientProperty, s);
    }

    public static ClientProperty[] values()
    {
        return (ClientProperty[])$VALUES.clone();
    }

    static 
    {
        SQUARE_TOS_ACCEPTED = new ClientProperty("SQUARE_TOS_ACCEPTED", 0);
        SNAPCASH_NEW_TOS_ACCEPTED = new ClientProperty("SNAPCASH_NEW_TOS_ACCEPTED", 1);
        TOS_ACCEPTED = new ClientProperty("TOS_ACCEPTED", 2);
        TOU_9_14_ACCEPTED = new ClientProperty("TOU_9_14_ACCEPTED", 3);
        LAST_STORY_PAGE_PROMPT_ID = new ClientProperty("LAST_STORY_PAGE_PROMPT_ID", 4);
        LAST_STORY_PAGE_PROMPT_TIMESTAMP = new ClientProperty("LAST_STORY_PAGE_PROMPT_TIMESTAMP", 5);
        $VALUES = (new ClientProperty[] {
            SQUARE_TOS_ACCEPTED, SNAPCASH_NEW_TOS_ACCEPTED, TOS_ACCEPTED, TOU_9_14_ACCEPTED, LAST_STORY_PAGE_PROMPT_ID, LAST_STORY_PAGE_PROMPT_TIMESTAMP
        });
    }
}
