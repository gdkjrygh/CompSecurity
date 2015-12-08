// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import android.app.IntentService;
import android.content.Intent;
import com.android.volley.Request;
import com.android.volley.c;
import com.google.android.gms.iid.a;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.utils.n;
import com.tinder.utils.v;
import org.json.JSONException;
import org.json.JSONObject;

public class GCMRegistrationIntentService extends IntentService
{

    ae a;
    n b;

    public GCMRegistrationIntentService()
    {
        super("gcmRegistrationIntentService");
        ManagerApp.h().a(this);
    }

    protected void onHandleIntent(Intent intent)
    {
        JSONObject jsonobject;
        String s;
        s = com.google.android.gms.iid.a.b(this).a("465293127427", "GCM");
        intent = b;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("device_token", s);
        }
        catch (JSONException jsonexception)
        {
            try
            {
                v.b(jsonexception.toString());
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                v.a("GCM Failed to complete token refresh", intent);
                ae.b(false);
                return;
            }
        }
        intent = new d(1, ((n) (intent)).a.m, jsonobject, new com.tinder.utils.n._cls1(intent), new com.tinder.utils.n._cls2(intent), com.tinder.managers.d.b());
        intent.j = new c(20000, 0, 1.0F);
        ManagerApp.b().a(intent);
        return;
    }
}
