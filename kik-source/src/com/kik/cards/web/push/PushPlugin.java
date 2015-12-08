// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.push;

import com.kik.cards.util.b;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import org.json.JSONArray;
import org.json.JSONObject;

public class PushPlugin extends d
{

    private final String a;
    private com.kik.cards.web.browser.BrowserPlugin.a b;

    public PushPlugin(String s, com.kik.cards.web.browser.BrowserPlugin.a a1)
    {
        super("Push");
        a = s;
        b = a1;
    }

    public final void f_()
    {
    }

    public j getNotificationList(JSONObject jsonobject)
    {
        com.kik.cards.util.b.b(a);
        jsonobject = new JSONArray();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("notifications", jsonobject);
        return new j(200, jsonobject1);
    }

    public j getPushToken(a a1, JSONObject jsonobject)
    {
        return new j(420);
    }

    public j isBadgeVisible(JSONObject jsonobject)
    {
        jsonobject = new JSONObject();
        jsonobject.put("visible", false);
        return new j(200, jsonobject);
    }

    public j setBadgeVisibility(JSONObject jsonobject)
    {
        return new j();
    }
}
