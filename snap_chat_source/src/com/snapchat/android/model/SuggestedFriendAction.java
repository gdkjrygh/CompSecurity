// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


public final class SuggestedFriendAction extends Enum
{

    private static final SuggestedFriendAction $VALUES[];
    public static final SuggestedFriendAction HIDE;
    public static final SuggestedFriendAction LIST;
    public static final SuggestedFriendAction NONE;
    public static final SuggestedFriendAction SEEN;
    public static final SuggestedFriendAction UPDATE;
    private String mServerActionName;

    private SuggestedFriendAction(String s, int i, String s1)
    {
        super(s, i);
        mServerActionName = s1;
    }

    public static SuggestedFriendAction valueOf(String s)
    {
        return (SuggestedFriendAction)Enum.valueOf(com/snapchat/android/model/SuggestedFriendAction, s);
    }

    public static SuggestedFriendAction[] values()
    {
        return (SuggestedFriendAction[])$VALUES.clone();
    }

    public final String getServerActionName()
    {
        return mServerActionName;
    }

    static 
    {
        LIST = new SuggestedFriendAction("LIST", 0, "list");
        UPDATE = new SuggestedFriendAction("UPDATE", 1, "update");
        SEEN = new SuggestedFriendAction("SEEN", 2, "seen");
        HIDE = new SuggestedFriendAction("HIDE", 3, "hide");
        NONE = new SuggestedFriendAction("NONE", 4, null);
        $VALUES = (new SuggestedFriendAction[] {
            LIST, UPDATE, SEEN, HIDE, NONE
        });
    }
}
