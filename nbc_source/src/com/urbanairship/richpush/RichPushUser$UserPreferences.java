// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.Context;
import com.urbanairship.Logger;
import com.urbanairship.Preferences;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushUser

static class migratePreferencesFromFileToDb extends Preferences
{

    private static final String KEY_PREFIX = "com.urbanairship.user";
    private static final String LAST_UPDATE_TIME = "com.urbanairship.user.LAST_UPDATE_TIME";
    private static final String USER_APIDS_KEY = "com.urbanairship.user.APIDS";
    private static final String USER_ID_KEY = "com.urbanairship.user.ID";
    private static final String USER_PASSWORD_KEY = "com.urbanairship.user.PASSWORD";

    public HashSet getSet(String s, HashSet hashset)
    {
        String s1 = getString(s, null);
        HashSet hashset1 = hashset;
        if (s1 != null)
        {
            try
            {
                hashset1 = RichPushUser.jsonArrayToSet(new JSONArray(s1));
            }
            catch (JSONException jsonexception)
            {
                Logger.info((new StringBuilder()).append("Unable to parse the set stored for key: ").append(s).toString());
                Logger.info(jsonexception.getMessage());
                return hashset;
            }
        }
        return hashset1;
    }

    public void putSet(String s, HashSet hashset)
    {
        if (hashset == null)
        {
            remove(s);
            return;
        }
        HashSet hashset1 = getSet(s, null);
        if (hashset1 != null)
        {
            hashset.addAll(hashset1);
        }
        put(s, (new JSONArray(hashset)).toString());
    }

    (Context context)
    {
        super(context);
        migratePreferencesFromFileToDb("com.urbanairship.user");
    }
}
