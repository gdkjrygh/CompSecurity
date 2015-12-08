// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import com.urbanairship.Logger;
import com.urbanairship.Preferences;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.PushPreferencesChangedEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

public class PushPreferences extends Preferences
{
    private static final class QuietTime
    {

        public static final String ENABLED = "com.urbanairship.push.QuietTime.ENABLED";
        public static final String END_HOUR_KEY = "com.urbanairship.push.QuietTime.END_HOUR";
        public static final String END_MIN_KEY = "com.urbanairship.push.QuietTime.END_MINUTE";
        public static final int NOT_SET_VAL = -1;
        public static final String START_HOUR_KEY = "com.urbanairship.push.QuietTime.START_HOUR";
        public static final String START_MIN_KEY = "com.urbanairship.push.QuietTime.START_MINUTE";

        private QuietTime()
        {
        }
    }


    private static final String ALIAS_KEY = "com.urbanairship.push.ALIAS";
    private static final String APID_KEY = "com.urbanairship.push.APID";
    private static final String APID_READY_KEY = "com.urbanairship.push.APID_READY";
    private static final String APID_UPDATE_NEEDED_KEY = "com.urbanairship.push.APID_UPDATE_NEEDED";
    private static final String APP_VERSION_KEY = "com.urbanairship.push.APP_VERSION";
    private static final String BOX_OFFICE_SECRET_KEY = "com.urbanairship.push.BOX_OFFICE_SECRET";
    private static final String DEVICE_ID_KEY = "com.urbanairship.push.DEVICE_ID";
    private static final String GCM_REGISTRATION_ID_KEY = "com.urbanairship.push.GCM_REGISTRATION_ID_KEY";
    private static final String KEY_PREFIX = "com.urbanairship.push";
    private static final String LAST_APID_REGISTRATION_TIME_KEY = "com.urbanairship.push.LAST_APID_REGISTRATION_TIME";
    private static final String PUSH_ENABLED_KEY = "com.urbanairship.push.PUSH_ENABLED";
    private static final String RETRY_AFTER_KEY = "com.urbanairship.push.RETRY_AFTER";
    private static final String SOUND_ENABLED_KEY = "com.urbanairship.push.SOUND_ENABLED";
    private static final String TAGS_KEY = "com.urbanairship.push.TAGS";
    private static final String VIBRATE_ENABLED_KEY = "com.urbanairship.push.VIBRATE_ENABLED";

    public PushPreferences()
    {
        super(UAirship.shared().getApplicationContext());
        migratePreferencesFromFileToDb("com.urbanairship.push");
    }

    private void sendPrefsChangedEvent()
    {
        UAirship.shared().getAnalytics().addEvent(new PushPreferencesChangedEvent());
    }

    public String getAlias()
    {
        return getString("com.urbanairship.push.ALIAS", null);
    }

    public int getAppVersionCode()
    {
        return getInt("com.urbanairship.push.APP_VERSION", -1);
    }

    public String getDeviceId()
    {
        return getString("com.urbanairship.push.DEVICE_ID", null);
    }

    public String getGcmId()
    {
        return getString("com.urbanairship.push.GCM_REGISTRATION_ID_KEY", null);
    }

    long getLastApidRegistrationTime()
    {
        return getLong("com.urbanairship.push.LAST_APID_REGISTRATION_TIME", 0L);
    }

    public String getPushId()
    {
        return getString("com.urbanairship.push.APID", null);
    }

    public String getPushSecret()
    {
        return getString("com.urbanairship.push.BOX_OFFICE_SECRET", null);
    }

    public Date[] getQuietTimeInterval()
    {
        int i = getInt("com.urbanairship.push.QuietTime.START_HOUR", -1);
        int j = getInt("com.urbanairship.push.QuietTime.START_MINUTE", -1);
        int k = getInt("com.urbanairship.push.QuietTime.END_HOUR", -1);
        int l = getInt("com.urbanairship.push.QuietTime.END_MINUTE", -1);
        if (i == -1 || j == -1 || k == -1 || l == -1)
        {
            return null;
        }
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).set(11, i);
        ((Calendar) (obj)).set(12, j);
        ((Calendar) (obj)).set(13, 0);
        obj = ((Calendar) (obj)).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, k);
        calendar.set(12, l);
        calendar.set(13, 0);
        if (k < i)
        {
            calendar.add(5, 1);
        }
        return (new Date[] {
            obj, calendar.getTime()
        });
    }

    public long getRetryAfter()
    {
        return getLong("com.urbanairship.push.RETRY_AFTER", 0L);
    }

    public Set getTags()
    {
        HashSet hashset;
        Object obj;
        hashset = new HashSet();
        obj = getString("com.urbanairship.push.TAGS", "[]");
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        try
        {
            obj = new JSONArray(((String) (obj)));
            j = ((JSONArray) (obj)).length();
        }
        catch (JSONException jsonexception)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(((JSONArray) (obj)).getString(i));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        return hashset;
    }

    boolean isAPIDReady()
    {
        return getBoolean("com.urbanairship.push.APID_READY", false);
    }

    boolean isApidUpdateNeeded()
    {
        return getBoolean("com.urbanairship.push.APID_UPDATE_NEEDED", true);
    }

    public boolean isInQuietTime()
    {
        boolean flag = true;
        if (isQuietTimeEnabled())
        {
            Calendar calendar = Calendar.getInstance();
            int i = getInt("com.urbanairship.push.QuietTime.START_HOUR", -1);
            int j = getInt("com.urbanairship.push.QuietTime.START_MINUTE", -1);
            int k = getInt("com.urbanairship.push.QuietTime.END_HOUR", -1);
            int l = getInt("com.urbanairship.push.QuietTime.END_MINUTE", -1);
            if (-1 != i && -1 != j && -1 != k && -1 != l)
            {
                Calendar calendar1 = Calendar.getInstance();
                calendar1.set(11, i);
                calendar1.set(12, j);
                calendar1.set(13, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, k);
                calendar2.set(12, l);
                calendar2.set(13, 0);
                if (calendar1.after(calendar) && calendar2.before(calendar1))
                {
                    calendar1.add(6, -1);
                }
                if (calendar2.before(calendar1))
                {
                    calendar2.add(6, 1);
                }
                if (!calendar.after(calendar1) || !calendar.before(calendar2))
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public boolean isPushEnabled()
    {
        return getBoolean("com.urbanairship.push.PUSH_ENABLED", false);
    }

    public boolean isQuietTimeEnabled()
    {
        return getBoolean("com.urbanairship.push.QuietTime.ENABLED", false);
    }

    public boolean isSoundEnabled()
    {
        return getBoolean("com.urbanairship.push.SOUND_ENABLED", true);
    }

    public boolean isVibrateEnabled()
    {
        return getBoolean("com.urbanairship.push.VIBRATE_ENABLED", true);
    }

    void setAPIDReady(boolean flag)
    {
        put("com.urbanairship.push.APID_READY", Boolean.valueOf(flag));
    }

    public void setAlias(String s)
    {
        put("com.urbanairship.push.ALIAS", s);
    }

    void setApidUpdateNeeded(boolean flag)
    {
        put("com.urbanairship.push.APID_UPDATE_NEEDED", Boolean.valueOf(flag));
    }

    public void setAppVersionCode(int i)
    {
        put("com.urbanairship.push.APP_VERSION", Integer.valueOf(i));
    }

    public void setDeviceId(String s)
    {
        put("com.urbanairship.push.DEVICE_ID", s);
    }

    public void setGcmId(String s)
    {
        put("com.urbanairship.push.GCM_REGISTRATION_ID_KEY", s);
    }

    void setLastApidRegistrationTime(long l)
    {
        put("com.urbanairship.push.LAST_APID_REGISTRATION_TIME", Long.valueOf(l));
    }

    void setPushEnabled(boolean flag)
    {
        if (isPushEnabled() != flag)
        {
            put("com.urbanairship.push.PUSH_ENABLED", Boolean.valueOf(flag));
            sendPrefsChangedEvent();
        }
    }

    public boolean setPushId(String s)
    {
        Pattern pattern = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
        if (s == null || pattern.matcher(s).matches())
        {
            return put("com.urbanairship.push.APID", s);
        } else
        {
            Logger.warn("PushPreferences - attempted to save malformed APID.");
            return false;
        }
    }

    public boolean setPushSecret(String s)
    {
        if (s == null || s.length() > 0)
        {
            put("com.urbanairship.push.BOX_OFFICE_SECRET", s);
            return true;
        } else
        {
            Logger.warn("PushPreferences - attempted to save malformed secret.");
            return false;
        }
    }

    public void setQuietTimeEnabled(boolean flag)
    {
        if (isQuietTimeEnabled() != flag)
        {
            put("com.urbanairship.push.QuietTime.ENABLED", Boolean.valueOf(flag));
            sendPrefsChangedEvent();
        }
    }

    public void setQuietTimeInterval(Date date, Date date1)
    {
        int i = getInt("com.urbanairship.push.QuietTime.START_HOUR", -1);
        int j = getInt("com.urbanairship.push.QuietTime.START_MINUTE", -1);
        int k = getInt("com.urbanairship.push.QuietTime.END_HOUR", -1);
        int l = getInt("com.urbanairship.push.QuietTime.END_MINUTE", -1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i1 = calendar.get(11);
        int j1 = calendar.get(12);
        date = Calendar.getInstance();
        date.setTime(date1);
        int k1 = date.get(11);
        int l1 = date.get(12);
        if (i != i1 || j != j1 || k != k1 || l != l1)
        {
            put("com.urbanairship.push.QuietTime.START_HOUR", Integer.valueOf(i1));
            put("com.urbanairship.push.QuietTime.START_MINUTE", Integer.valueOf(j1));
            put("com.urbanairship.push.QuietTime.END_HOUR", Integer.valueOf(k1));
            put("com.urbanairship.push.QuietTime.END_MINUTE", Integer.valueOf(l1));
            sendPrefsChangedEvent();
        }
    }

    public void setRetryAfter(long l)
    {
        put("com.urbanairship.push.RETRY_AFTER", Long.valueOf(l));
    }

    public void setSoundEnabled(boolean flag)
    {
        if (isSoundEnabled() != flag)
        {
            put("com.urbanairship.push.SOUND_ENABLED", Boolean.valueOf(flag));
            sendPrefsChangedEvent();
        }
    }

    public void setTags(Set set)
    {
        if (set == null)
        {
            return;
        } else
        {
            put("com.urbanairship.push.TAGS", (new JSONArray(set)).toString());
            return;
        }
    }

    public void setVibrateEnabled(boolean flag)
    {
        if (isVibrateEnabled() != flag)
        {
            put("com.urbanairship.push.VIBRATE_ENABLED", Boolean.valueOf(flag));
            sendPrefsChangedEvent();
        }
    }
}
