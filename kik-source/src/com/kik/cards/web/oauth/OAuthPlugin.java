// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.oauth;

import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import org.c.b;
import org.c.c;
import org.json.JSONException;
import org.json.JSONObject;

public class OAuthPlugin extends d
{

    private static final b a = c.a("OAuthPlugin");

    public j execute(JSONObject jsonobject)
    {
        try
        {
            jsonobject.getString("url");
            jsonobject.getString("callbackID");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
        }
        return new j();
    }

}
