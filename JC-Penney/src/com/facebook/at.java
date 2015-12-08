// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.b.ar;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            s, Profile

final class at
{

    private final SharedPreferences a = s.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    at()
    {
    }

    Profile a()
    {
        Object obj;
        obj = a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = new Profile(new JSONObject(((String) (obj))));
        return ((Profile) (obj));
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    void a(Profile profile)
    {
        ar.a(profile, "profile");
        profile = profile.c();
        if (profile != null)
        {
            a.edit().putString("com.facebook.ProfileManager.CachedProfile", profile.toString()).apply();
        }
    }

    void b()
    {
        a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
