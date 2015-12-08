// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.model;

import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.task.model:
//            Location

public class Sitemap
{

    public static final String CONVERSATIONS = "conversations";
    public static final String HF_BUILDER = "homefeed_builder/recommended_topics";
    public static final String INVITE_FRIENDS = "invite_friends";
    public static final String NOTIFICATIONS = "notifications";
    public static final String SETTINGS = "settings";
    private static HashMap sSiteMapLocation = new _cls1();

    public Sitemap()
    {
    }

    public static Location getLocation(String s)
    {
        return (Location)sSiteMapLocation.get(s);
    }


    private class _cls1 extends HashMap
    {

        _cls1()
        {
            put("invite_friends", Location.INVITE_FRIENDS);
            put("settings", Location.ACCOUNT_SETTINGS);
            put("notifications", Location.NOTIFICATIONS);
        }
    }

}
