// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums.inappmessage;


public final class ClickAction extends Enum
{

    public static final ClickAction NEWS_FEED;
    public static final ClickAction NONE;
    public static final ClickAction URI;
    private static final ClickAction a[];

    private ClickAction(String s, int i)
    {
        super(s, i);
    }

    public static ClickAction valueOf(String s)
    {
        return (ClickAction)Enum.valueOf(com/appboy/enums/inappmessage/ClickAction, s);
    }

    public static ClickAction[] values()
    {
        return (ClickAction[])a.clone();
    }

    static 
    {
        NEWS_FEED = new ClickAction("NEWS_FEED", 0);
        URI = new ClickAction("URI", 1);
        NONE = new ClickAction("NONE", 2);
        a = (new ClickAction[] {
            NEWS_FEED, URI, NONE
        });
    }
}
