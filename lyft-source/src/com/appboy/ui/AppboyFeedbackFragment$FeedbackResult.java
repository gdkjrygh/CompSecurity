// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;


public final class _cls9 extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR CANCELLED;
    public static final ERROR ERROR;
    public static final ERROR SENT;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/appboy/ui/AppboyFeedbackFragment$FeedbackResult, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        SENT = new <init>("SENT", 0);
        CANCELLED = new <init>("CANCELLED", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            SENT, CANCELLED, ERROR
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
