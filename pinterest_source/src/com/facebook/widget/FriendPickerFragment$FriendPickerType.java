// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


public final class requestIsCacheable extends Enum
{

    private static final INVITABLE_FRIENDS $VALUES[];
    public static final INVITABLE_FRIENDS FRIENDS;
    public static final INVITABLE_FRIENDS INVITABLE_FRIENDS;
    public static final INVITABLE_FRIENDS TAGGABLE_FRIENDS;
    private final boolean requestIsCacheable;
    private final String requestPath;

    public static requestIsCacheable valueOf(String s)
    {
        return (requestIsCacheable)Enum.valueOf(com/facebook/widget/FriendPickerFragment$FriendPickerType, s);
    }

    public static requestIsCacheable[] values()
    {
        return (requestIsCacheable[])$VALUES.clone();
    }

    final String getRequestPath()
    {
        return requestPath;
    }

    final boolean isCacheable()
    {
        return requestIsCacheable;
    }

    static 
    {
        FRIENDS = new <init>("FRIENDS", 0, "/friends", true);
        TAGGABLE_FRIENDS = new <init>("TAGGABLE_FRIENDS", 1, "/taggable_friends", false);
        INVITABLE_FRIENDS = new <init>("INVITABLE_FRIENDS", 2, "/invitable_friends", false);
        $VALUES = (new .VALUES[] {
            FRIENDS, TAGGABLE_FRIENDS, INVITABLE_FRIENDS
        });
    }

    private (String s, int i, String s1, boolean flag)
    {
        super(s, i);
        requestPath = s1;
        requestIsCacheable = flag;
    }
}
