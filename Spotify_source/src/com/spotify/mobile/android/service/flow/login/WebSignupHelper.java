// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import dme;
import dmh;
import dva;
import dyn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebSignupHelper
{

    public dme a;
    public HashMap b;
    dyn c;

    public WebSignupHelper(dme dme, dyn dyn)
    {
        a = dme;
        b = new HashMap();
        b.put("key", "142b583129b2df829de3656f9eb484e6");
        c = dyn;
    }

    // Unreferenced inner class com/spotify/mobile/android/service/flow/login/WebSignupHelper$1

/* anonymous class */
    public final class _cls1
        implements dmh
    {

        private WebSignupHelper a;

        public final void a(int i, Object obj)
        {
            Object obj1;
            HashMap hashmap;
            obj = (JSONObject)obj;
            Iterator iterator;
            String s;
            try
            {
                if (((JSONObject) (obj)).getInt("status") == 1)
                {
                    dva dva1 = new dva(((JSONObject) (obj)));
                    a.c.a(((JSONObject) (obj)).getString("username"), dva1);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj1 = new HashMap();
                ((Map) (obj1)).put("json", ((JSONException) (obj)).getLocalizedMessage());
                a.c.a(5, ((Map) (obj1)));
                return;
            }
            obj1 = a;
            i = ((JSONObject) (obj)).getInt("status");
            hashmap = new HashMap();
            for (iterator = ((JSONObject) (obj)).getJSONObject("errors").keys(); iterator.hasNext(); hashmap.put(s, ((JSONObject) (obj)).getJSONObject("errors").getString(s)))
            {
                s = (String)iterator.next();
            }

            ((WebSignupHelper) (obj1)).c.a(i, hashmap);
            return;
        }

        public final void a(Throwable throwable, String s)
        {
            s = new HashMap();
            s.put("unknown", throwable.getLocalizedMessage());
            a.c.a(5, s);
        }

            public 
            {
                a = WebSignupHelper.this;
                super();
            }
    }

}
