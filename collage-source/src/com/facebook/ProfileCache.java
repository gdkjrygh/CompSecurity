// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            FacebookSdk, Profile

final class ProfileCache
{

    static final String CACHED_PROFILE_KEY = "com.facebook.ProfileManager.CachedProfile";
    static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    private final SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    ProfileCache()
    {
    }

    void clear()
    {
        sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    Profile load()
    {
        Object obj;
        obj = sharedPreferences.getString("com.facebook.ProfileManager.CachedProfile", null);
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

    void save(Profile profile)
    {
        Validate.notNull(profile, "profile");
        profile = profile.toJSONObject();
        if (profile != null)
        {
            sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", profile.toString()).apply();
        }
    }
}
