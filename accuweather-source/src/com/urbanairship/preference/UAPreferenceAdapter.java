// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;

import android.os.Handler;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.location.UALocationManager;
import com.urbanairship.push.PushManager;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushUser;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.urbanairship.preference:
//            UAPreference

public class UAPreferenceAdapter
{

    private static int CHANNEL_ID_MAX_RETRIES = 4;
    private static int CHANNEL_ID_RETRY_DELAY = 1000;
    private int channelIdRetryCount;
    private Map preferences;

    public UAPreferenceAdapter(PreferenceScreen preferencescreen)
    {
        preferences = new HashMap();
        channelIdRetryCount = 0;
        checkForUAPreferences(preferencescreen);
    }

    private void checkForUAPreferences(PreferenceGroup preferencegroup)
    {
        if (preferencegroup != null)
        {
            int i = 0;
            while (i < preferencegroup.getPreferenceCount()) 
            {
                Preference preference = preferencegroup.getPreference(i);
                if (preference instanceof PreferenceGroup)
                {
                    checkForUAPreferences((PreferenceGroup)preference);
                } else
                if (preference instanceof UAPreference)
                {
                    trackPreference((UAPreference)preference);
                }
                i++;
            }
        }
    }

    private Object getInternalPreference(UAPreference.PreferenceType preferencetype)
    {
        UAirship uairship = UAirship.shared();
        static class _cls3
        {

            static final int $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[];

            static 
            {
                $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType = new int[UAPreference.PreferenceType.values().length];
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.LOCATION_UPDATES_ENABLED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.LOCATION_BACKGROUND_UPDATES_ALLOWED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.USER_NOTIFICATIONS_ENABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.QUIET_TIME_ENABLE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.QUIET_TIME_END.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.QUIET_TIME_START.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.SOUND_ENABLE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.VIBRATE_ENABLE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.CHANNEL_ID.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.USER_ID.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.urbanairship.preference.UAPreference.PreferenceType[preferencetype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return Boolean.valueOf(UALocationManager.shared().isLocationUpdatesEnabled());

        case 2: // '\002'
            return Boolean.valueOf(UALocationManager.shared().isBackgroundLocationAllowed());

        case 3: // '\003'
            return Boolean.valueOf(uairship.getPushManager().getUserNotificationsEnabled());

        case 4: // '\004'
            return Boolean.valueOf(uairship.getPushManager().isQuietTimeEnabled());

        case 5: // '\005'
            preferencetype = uairship.getPushManager().getQuietTimeInterval();
            if (preferencetype != null)
            {
                return Long.valueOf(preferencetype[1].getTime());
            } else
            {
                return null;
            }

        case 6: // '\006'
            preferencetype = uairship.getPushManager().getQuietTimeInterval();
            if (preferencetype != null)
            {
                return Long.valueOf(preferencetype[0].getTime());
            } else
            {
                return null;
            }

        case 7: // '\007'
            return Boolean.valueOf(uairship.getPushManager().isSoundEnabled());

        case 8: // '\b'
            return Boolean.valueOf(uairship.getPushManager().isVibrateEnabled());

        case 9: // '\t'
            return uairship.getPushManager().getChannelId();

        case 10: // '\n'
            return uairship.getRichPushManager().getRichPushUser().getId();
        }
    }

    private void setInternalPreference(UAPreference.PreferenceType preferencetype, Object obj)
    {
        UAirship uairship = UAirship.shared();
        switch (_cls3..SwitchMap.com.urbanairship.preference.UAPreference.PreferenceType[preferencetype.ordinal()])
        {
        case 9: // '\t'
        case 10: // '\n'
        default:
            return;

        case 2: // '\002'
            UALocationManager.shared().setBackgroundLocationAllowed(((Boolean)obj).booleanValue());
            return;

        case 1: // '\001'
            UALocationManager.shared().setLocationUpdatesEnabled(((Boolean)obj).booleanValue());
            return;

        case 3: // '\003'
            PushManager.shared().setUserNotificationsEnabled(((Boolean)obj).booleanValue());
            return;

        case 4: // '\004'
            uairship.getPushManager().setQuietTimeEnabled(((Boolean)obj).booleanValue());
            return;

        case 7: // '\007'
            uairship.getPushManager().setSoundEnabled(((Boolean)obj).booleanValue());
            return;

        case 8: // '\b'
            uairship.getPushManager().setVibrateEnabled(((Boolean)obj).booleanValue());
            return;

        case 5: // '\005'
            preferencetype = uairship.getPushManager().getQuietTimeInterval();
            if (preferencetype != null)
            {
                preferencetype = preferencetype[0];
            } else
            {
                preferencetype = new Date();
            }
            uairship.getPushManager().setQuietTimeInterval(preferencetype, new Date(((Long)obj).longValue()));
            return;

        case 6: // '\006'
            preferencetype = uairship.getPushManager().getQuietTimeInterval();
            break;
        }
        if (preferencetype != null)
        {
            preferencetype = preferencetype[1];
        } else
        {
            preferencetype = new Date();
        }
        uairship.getPushManager().setQuietTimeInterval(new Date(((Long)obj).longValue()), preferencetype);
    }

    private void trackPreference(final UAPreference preference)
    {
        Object obj1 = UAirship.shared().getPushManager();
        final UAPreference.PreferenceType preferenceType = preference.getPreferenceType();
        if (preferenceType == null)
        {
            Logger.warn((new StringBuilder()).append("Preference returned a null preference type. Ignoring preference ").append(preference).toString());
            return;
        }
        Object obj = getInternalPreference(preferenceType);
        if (obj != null)
        {
            try
            {
                preference.setValue(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Logger.warn((new StringBuilder()).append("Exception setting value ").append(obj).append(". Ignoring preference ").append(preference).toString(), ((Throwable) (obj1)));
                return;
            }
        } else
        if (preferenceType == UAPreference.PreferenceType.CHANNEL_ID && ((PushManager) (obj1)).isPushEnabled() && channelIdRetryCount < CHANNEL_ID_MAX_RETRIES)
        {
            channelIdRetryCount = channelIdRetryCount + 1;
            (new Handler()).postDelayed(new Runnable() {

                final UAPreferenceAdapter this$0;
                final UAPreference val$preference;

                public void run()
                {
                    trackPreference(preference);
                }

            
            {
                this$0 = UAPreferenceAdapter.this;
                preference = uapreference;
                super();
            }
            }, CHANNEL_ID_RETRY_DELAY);
            return;
        }
        ((Preference)preference).setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final UAPreferenceAdapter this$0;
            final UAPreference.PreferenceType val$preferenceType;

            public boolean onPreferenceChange(Preference preference1, Object obj2)
            {
                preferences.put(preferenceType, obj2);
                return true;
            }

            
            {
                this$0 = UAPreferenceAdapter.this;
                preferenceType = preferencetype;
                super();
            }
        });
    }

    public void applyUrbanAirshipPreferences()
    {
        Iterator iterator = preferences.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UAPreference.PreferenceType preferencetype = (UAPreference.PreferenceType)iterator.next();
            Object obj = preferences.get(preferencetype);
            if (obj != null)
            {
                try
                {
                    setInternalPreference(preferencetype, obj);
                }
                catch (Exception exception)
                {
                    Logger.warn((new StringBuilder()).append("Unable to set ").append(preferencetype).append(", invalid value ").append(obj).toString(), exception);
                }
            }
        } while (true);
    }



}
