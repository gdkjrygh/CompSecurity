// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.megaphone;


public final class A extends Enum
{

    private static final WRITE_BANNED $VALUES[];
    public static final WRITE_BANNED CONFIRM_EMAIL;
    public static final WRITE_BANNED EMPTY_FEED;
    public static final WRITE_BANNED UPDATE;
    public static final WRITE_BANNED WRITE_BANNED;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/pinterest/ui/megaphone/HomeFeedMegaphoneEvent$EventType, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        UPDATE = new <init>("UPDATE", 0);
        EMPTY_FEED = new <init>("EMPTY_FEED", 1);
        CONFIRM_EMAIL = new <init>("CONFIRM_EMAIL", 2);
        WRITE_BANNED = new <init>("WRITE_BANNED", 3);
        $VALUES = (new .VALUES[] {
            UPDATE, EMPTY_FEED, CONFIRM_EMAIL, WRITE_BANNED
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
