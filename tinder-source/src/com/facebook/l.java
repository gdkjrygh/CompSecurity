// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            g, Profile

final class l
{

    final SharedPreferences a = g.g().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    l()
    {
    }

    final Profile a()
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
}
