// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.outgoing;

import bo.app.ev;
import com.appboy.Constants;
import com.appboy.enums.Gender;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookUser
    implements IPutIntoJson
{

    private static final String a;
    private static String b = "birthday";
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Gender i;
    private final Integer j;
    private final Collection k;
    private final String l;

    public FacebookUser(String s, String s1, String s2, String s3, String s4, String s5, Gender gender, 
            Integer integer, Collection collection, String s6)
    {
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = gender;
        j = integer;
        k = collection;
        l = s6;
    }

    private JSONArray a()
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); jsonarray.put(jsonobject))
        {
            String s = (String)iterator.next();
            jsonobject = new JSONObject();
            jsonobject.put("name", s);
        }

        return jsonarray;
    }

    public volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public JSONObject forJsonPut()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (!ev.c(c))
            {
                jsonobject.put("id", c);
            }
            if (!ev.c(d))
            {
                jsonobject.put("first_name", d);
            }
            if (!ev.c(e))
            {
                jsonobject.put("last_name", e);
            }
            if (!ev.c(f))
            {
                jsonobject.put("email", f);
            }
            if (!ev.c(g))
            {
                jsonobject.put("bio", g);
            }
            if (!ev.c(l))
            {
                jsonobject.put(b, l);
            }
            if (!ev.c(h))
            {
                JSONObject jsonobject1 = new JSONObject();
                jsonobject1.put("name", h);
                jsonobject.put("location", jsonobject1);
            }
            if (i != null)
            {
                jsonobject.put("gender", i.forJsonPut());
            }
            jsonobject.put("num_friends", j);
            if (k != null && !k.isEmpty())
            {
                jsonobject.put("likes", a());
            }
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, "Caught exception creating facebook user Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/outgoing/FacebookUser.getName()
        });
    }
}
