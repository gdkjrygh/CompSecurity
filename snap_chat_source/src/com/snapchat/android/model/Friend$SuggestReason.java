// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import java.util.Locale;

// Referenced classes of package com.snapchat.android.model:
//            Friend

public static final class value extends Enum
{

    private static final UNRECOGNIZED_VALUE $VALUES[];
    public static final UNRECOGNIZED_VALUE FRIEND_GRAPH;
    public static final UNRECOGNIZED_VALUE NEW_CONTACT;
    public static final UNRECOGNIZED_VALUE NEW_SNAPCHATTER;
    public static final UNRECOGNIZED_VALUE UNKNOWN;
    public static final UNRECOGNIZED_VALUE UNRECOGNIZED_VALUE;
    private final String value;

    public static value fromValue(String s)
    {
        try
        {
            s = valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return UNRECOGNIZED_VALUE;
        }
        return s;
    }

    public static UNRECOGNIZED_VALUE valueOf(String s)
    {
        return (UNRECOGNIZED_VALUE)Enum.valueOf(com/snapchat/android/model/Friend$SuggestReason, s);
    }

    public static UNRECOGNIZED_VALUE[] values()
    {
        return (UNRECOGNIZED_VALUE[])$VALUES.clone();
    }

    public final String toString()
    {
        return value;
    }

    public final String value()
    {
        return value;
    }

    static 
    {
        NEW_CONTACT = new <init>("NEW_CONTACT", 0, "new_contact");
        NEW_SNAPCHATTER = new <init>("NEW_SNAPCHATTER", 1, "new_snapchatter");
        FRIEND_GRAPH = new <init>("FRIEND_GRAPH", 2, "friend_graph");
        UNKNOWN = new <init>("UNKNOWN", 3, "unknown");
        UNRECOGNIZED_VALUE = new <init>("UNRECOGNIZED_VALUE", 4, "UNRECOGNIZED_VALUE");
        $VALUES = (new .VALUES[] {
            NEW_CONTACT, NEW_SNAPCHATTER, FRIEND_GRAPH, UNKNOWN, UNRECOGNIZED_VALUE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
