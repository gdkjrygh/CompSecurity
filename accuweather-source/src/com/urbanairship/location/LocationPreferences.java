// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import com.urbanairship.Logger;
import com.urbanairship.PreferenceDataStore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.location:
//            LocationRequestOptions

class LocationPreferences
    implements com.urbanairship.PreferenceDataStore.PreferenceChangeListener
{

    static final String BACKGROUND_UPDATES_ALLOWED = "com.urbanairship.location.BACKGROUND_UPDATES_ALLOWED";
    static final String KEY_PREFIX = "com.urbanairship.location";
    static final String LOCATION_OPTIONS = "com.urbanairship.location.LOCATION_OPTIONS";
    static final String LOCATION_UPDATES_ENABLED = "com.urbanairship.location.LOCATION_UPDATES_ENABLED";
    private com.urbanairship.PreferenceDataStore.PreferenceChangeListener preferenceChangeListener;
    private final PreferenceDataStore preferenceDataStore;

    LocationPreferences(PreferenceDataStore preferencedatastore)
    {
        preferenceDataStore = preferencedatastore;
        preferencedatastore.addListener(this);
    }

    LocationRequestOptions getLocationRequestOptions()
    {
        Object obj = null;
        String s = preferenceDataStore.getString("com.urbanairship.location.LOCATION_OPTIONS", null);
        if (s != null)
        {
            try
            {
                obj = new JSONObject(s);
                obj = (new LocationRequestOptions.Builder()).setMinDistance(Float.parseFloat(((JSONObject) (obj)).getString("minDistance"))).setMinTime(Long.parseLong(((JSONObject) (obj)).getString("minTime")), TimeUnit.MILLISECONDS).setPriority(((JSONObject) (obj)).getInt("priority")).create();
            }
            catch (JSONException jsonexception)
            {
                Logger.error((new StringBuilder()).append("Failed parsing LocationRequestOptions from JSON: ").append(jsonexception.getMessage()).toString());
                return null;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Logger.error((new StringBuilder()).append("Invalid LocationRequestOptions from JSON: ").append(illegalargumentexception.getMessage()).toString());
                return null;
            }
        }
        return ((LocationRequestOptions) (obj));
    }

    boolean isBackgroundLocationAllowed()
    {
        return preferenceDataStore.getBoolean("com.urbanairship.location.BACKGROUND_UPDATES_ALLOWED", false);
    }

    boolean isLocationUpdatesEnabled()
    {
        return preferenceDataStore.getBoolean("com.urbanairship.location.LOCATION_UPDATES_ENABLED", false);
    }

    public void onPreferenceChange(String s)
    {
        if (!s.startsWith("com.urbanairship.location"))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        this;
        JVM INSTR monitorenter ;
        if (preferenceChangeListener != null)
        {
            preferenceChangeListener.onPreferenceChange(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    void setBackgroundLocationAllowed(boolean flag)
    {
        preferenceDataStore.put("com.urbanairship.location.BACKGROUND_UPDATES_ALLOWED", Boolean.valueOf(flag));
    }

    void setListener(com.urbanairship.PreferenceDataStore.PreferenceChangeListener preferencechangelistener)
    {
        this;
        JVM INSTR monitorenter ;
        preferenceChangeListener = preferencechangelistener;
        this;
        JVM INSTR monitorexit ;
        return;
        preferencechangelistener;
        this;
        JVM INSTR monitorexit ;
        throw preferencechangelistener;
    }

    void setLocationRequestOptions(LocationRequestOptions locationrequestoptions)
    {
        if (locationrequestoptions == null)
        {
            preferenceDataStore.put("com.urbanairship.location.LOCATION_OPTIONS", null);
            return;
        }
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("priority", locationrequestoptions.getPriority());
            jsonobject.put("minDistance", locationrequestoptions.getMinDistance());
            jsonobject.put("minTime", locationrequestoptions.getMinTime());
            preferenceDataStore.put("com.urbanairship.location.LOCATION_OPTIONS", jsonobject.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationRequestOptions locationrequestoptions)
        {
            Logger.error((new StringBuilder()).append("Failed saving LocationRequestOptions as JSON: ").append(locationrequestoptions.getMessage()).toString());
        }
    }

    void setLocationUpdatesEnabled(boolean flag)
    {
        preferenceDataStore.put("com.urbanairship.location.LOCATION_UPDATES_ENABLED", Boolean.valueOf(flag));
    }
}
