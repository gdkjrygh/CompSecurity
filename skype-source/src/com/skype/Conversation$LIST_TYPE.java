// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Conversation

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value ALL_CONVERSATIONS;
    public static final value BOOKMARKED_CONVERSATIONS;
    public static final value INBOX_CONVERSATIONS;
    public static final value LIVE_CONVERSATIONS;
    public static final value PINNED_CONVERSATIONS;
    public static final value REALLY_ALL_CONVERSATIONS;
    public static final value WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Conversation$LIST_TYPE, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        ALL_CONVERSATIONS = new <init>("ALL_CONVERSATIONS", 0, 0);
        INBOX_CONVERSATIONS = new <init>("INBOX_CONVERSATIONS", 1, 1);
        BOOKMARKED_CONVERSATIONS = new <init>("BOOKMARKED_CONVERSATIONS", 2, 2);
        LIVE_CONVERSATIONS = new <init>("LIVE_CONVERSATIONS", 3, 3);
        PINNED_CONVERSATIONS = new <init>("PINNED_CONVERSATIONS", 4, 4);
        REALLY_ALL_CONVERSATIONS = new <init>("REALLY_ALL_CONVERSATIONS", 5, 5);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            ALL_CONVERSATIONS, INBOX_CONVERSATIONS, BOOKMARKED_CONVERSATIONS, LIVE_CONVERSATIONS, PINNED_CONVERSATIONS, REALLY_ALL_CONVERSATIONS, WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
