// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;


public final class ah extends Enum
{

    private static final ah $VALUES[];
    public static final ah ACTIVE_FRIENDS;
    public static final ah AUTO_COMPLETE;
    public static final ah FAVORITES;
    public static final ah NEARBY;
    public static final ah SEARCH_RESULT;
    public static final ah SUGGESTIONS;
    public static final ah TOP_FRIENDS;
    public static final ah UNKNOWN;

    private ah(String s, int i)
    {
        super(s, i);
    }

    public static ah valueOf(String s)
    {
        return (ah)Enum.valueOf(com/facebook/contacts/picker/ah, s);
    }

    public static ah[] values()
    {
        return (ah[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new ah("UNKNOWN", 0);
        FAVORITES = new ah("FAVORITES", 1);
        TOP_FRIENDS = new ah("TOP_FRIENDS", 2);
        ACTIVE_FRIENDS = new ah("ACTIVE_FRIENDS", 3);
        SEARCH_RESULT = new ah("SEARCH_RESULT", 4);
        AUTO_COMPLETE = new ah("AUTO_COMPLETE", 5);
        SUGGESTIONS = new ah("SUGGESTIONS", 6);
        NEARBY = new ah("NEARBY", 7);
        $VALUES = (new ah[] {
            UNKNOWN, FAVORITES, TOP_FRIENDS, ACTIVE_FRIENDS, SEARCH_RESULT, AUTO_COMPLETE, SUGGESTIONS, NEARBY
        });
    }
}
