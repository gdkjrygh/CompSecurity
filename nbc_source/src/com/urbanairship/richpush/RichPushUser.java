// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.Context;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.Preferences;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.util.UAStringUtil;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushInbox

public class RichPushUser
{
    static class UserPreferences extends Preferences
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

        UserPreferences(Context context)
        {
            super(context);
            migratePreferencesFromFileToDb("com.urbanairship.user");
        }
    }


    private static final String MODIFY_USER_URL = "api/user/%s/";
    private static final String NEW_USER_URL = "api/user/";
    private static final String PAYLOAD_APIDS_KEY = "apids";
    private static final String PAYLOAD_PASSWORD_KEY = "password";
    private static final String PAYLOAD_USER_ID_KEY = "user_id";
    static UserPreferences preferences = new UserPreferences(UAirship.shared().getApplicationContext());
    private final Object lock = new Object();

    public RichPushUser()
    {
    }

    static HashSet addCurrentApid(HashSet hashset)
    {
        String s = PushManager.shared().getAPID();
        HashSet hashset1 = hashset;
        if (s != null)
        {
            hashset1 = hashset;
            if (hashset == null)
            {
                hashset1 = new HashSet(1);
            }
            hashset1.add(s);
        }
        return hashset1;
    }

    static JSONObject getUserAttributes()
        throws JSONException
    {
        JSONArray jsonarray = null;
        JSONObject jsonobject = new JSONObject();
        HashSet hashset = addCurrentApid(preferences.getSet("com.urbanairship.user.APIDS", null));
        if (hashset != null)
        {
            jsonarray = new JSONArray(hashset);
        }
        jsonobject.putOpt("apids", jsonarray);
        return jsonobject;
    }

    public static boolean isCreated()
    {
        return !UAStringUtil.isEmpty(preferences.getString("com.urbanairship.user.ID", null));
    }

    static HashSet jsonArrayToSet(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        HashSet hashset = null;
_L4:
        return hashset;
_L2:
        int j = jsonarray.length();
        HashSet hashset1 = new HashSet(j);
        int i = 0;
        do
        {
            hashset = hashset1;
            if (i >= j)
            {
                continue;
            }
            hashset1.add(jsonarray.getString(i));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String newUserUrl()
    {
        return (new StringBuilder()).append(UAirship.shared().getAirshipConfigOptions().hostURL).append("api/user/").toString();
    }

    static void updateUserAttributes(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        Logger.info((new StringBuilder()).append("Updating user attributes for id: ").append(s.optString("user_id")).toString());
        preferences.put("com.urbanairship.user.ID", s.optString("user_id"));
        if (s.has("password"))
        {
            preferences.put("com.urbanairship.user.PASSWORD", s.getString("password"));
        }
        preferences.putSet("com.urbanairship.user.APIDS", jsonArrayToSet(s.optJSONArray("apids")));
    }

    public void addApid(String s)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        HashSet hashset1 = preferences.getSet("com.urbanairship.user.APIDS", null);
        HashSet hashset;
        hashset = hashset1;
        if (hashset1 != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        hashset = new HashSet();
        if (hashset.add(s))
        {
            preferences.putSet("com.urbanairship.user.APIDS", hashset);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public HashSet getApids()
    {
        HashSet hashset;
        synchronized (lock)
        {
            hashset = addCurrentApid(preferences.getSet("com.urbanairship.user.APIDS", null));
        }
        return hashset;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getId()
    {
        return preferences.getString("com.urbanairship.user.ID", null);
    }

    public RichPushInbox getInbox()
    {
        this;
        JVM INSTR monitorenter ;
        RichPushInbox richpushinbox = RichPushInbox.shared();
        this;
        JVM INSTR monitorexit ;
        return richpushinbox;
        Exception exception;
        exception;
        throw exception;
    }

    long getLastUpdateTime()
    {
        return preferences.getLong("com.urbanairship.user.LAST_UPDATE_TIME", 0L);
    }

    public String getPassword()
    {
        return preferences.getString("com.urbanairship.user.PASSWORD", null);
    }

    public void setApids(HashSet hashset)
    {
        synchronized (lock)
        {
            preferences.putSet("com.urbanairship.user.APIDS", hashset);
        }
        return;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
    }

    void setLastUpdateTime(long l)
    {
        preferences.put("com.urbanairship.user.LAST_UPDATE_TIME", Long.valueOf(l));
    }

    String userUrl()
    {
        return String.format((new StringBuilder()).append(UAirship.shared().getAirshipConfigOptions().hostURL).append("api/user/%s/").toString(), new Object[] {
            getId()
        });
    }

}
