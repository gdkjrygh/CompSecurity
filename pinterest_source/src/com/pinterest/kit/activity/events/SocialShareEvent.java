// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity.events;

import com.pinterest.api.remote.AccountApi;

public class SocialShareEvent
{

    public static final int BOARD = 1;
    public static final int PIN = 0;
    public static final String PINTEREST = "www.pinterest.com/";
    public static final String PIN_LINK = "www.pinterest.com/pin/%s?fb_ref=%s";
    public static final int USER = 2;
    public String fbRef;
    public String id;
    public String link;
    public int type;

    public SocialShareEvent(String s, int i)
    {
        type = 0;
        fbRef = "";
        id = s;
        type = i;
        fbRef = AccountApi.b();
        link = getLink(s);
    }

    public String getLink(String s)
    {
        switch (type)
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return null;

        case 0: // '\0'
            return String.format("www.pinterest.com/pin/%s?fb_ref=%s", new Object[] {
                s, fbRef
            });
        }
    }

    public String getStrType()
    {
        switch (type)
        {
        default:
            return null;

        case 0: // '\0'
            return "pin";

        case 1: // '\001'
            return "board";

        case 2: // '\002'
            return "user";
        }
    }
}
