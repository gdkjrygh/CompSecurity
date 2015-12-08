// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.data.bl.o;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.Profile;
import com.fitbit.galileo.a.f;
import com.fitbit.pedometer.k;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.savedstate.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.device:
//            BondInfo, TrackerOption, e, TrackerSettings, 
//            c, FirmwareVersion, FirmwareUpdate, b, 
//            DeviceVersion, BatteryLevel, DeviceType, DeviceFeature, 
//            TrackerType, TrackerInfo, GuideInfo

public class Device extends Entity
    implements b
{
    public static final class a
    {

        public static final String A = "exercises";
        public static final String B = "id";
        public static final String C = "tapGesture";
        public static final String D = "watchCheck";
        public static final String E = "displayName";
        public static final String F = "fwUpdate";
        public static final String G = "bondedPeerId";
        public static final String H = "bondedPeerName";
        public static final String I = "autoLapInterval";
        public static final String J = "value";
        public static final String a = "settings";
        public static final String b = "latestFirmware";
        public static final String c = "currentFirmware";
        public static final String d = "bsl";
        public static final String e = "app";
        public static final String f = "screenOrder";
        public static final String g = "name";
        public static final String h = "imageUrl";
        public static final String i = "clockFace";
        public static final String j = "primaryGoal";
        public static final String k = "onDominantHand";
        public static final String l = "greeting";
        public static final String m = "displayGreeting";
        public static final String n = "displayEmote";
        public static final String o = "displayElevation";
        public static final String p = "displayClock";
        public static final String q = "displayChatter";
        public static final String r = "displayCalories";
        public static final String s = "displayDistance";
        public static final String t = "displayActiveMinutes";
        public static final String u = "displaySteps";
        public static final String v = "displayHeartRate";
        public static final String w = "enableAncs";
        public static final String x = "enableSleepAnnotations";
        public static final String y = "wireId";
        public static final String z = "heartRateTracking";

        public a()
        {
        }
    }


    private List alarms;
    private final List autoLapOptions = new ArrayList();
    private BatteryLevel batteryLevel;
    private BondInfo bondInfo;
    private c currentFirmware;
    private String deviceName;
    private String encodedId;
    private boolean encrypted;
    private FirmwareUpdate fwUpdate;
    private String imageUrl;
    private Date lastSyncTime;
    private c lastestFirmware;
    private String mac;
    private Profile profile;
    private final List supportedClockFaces = new ArrayList();
    private final List supportedExerciseOptions = new ArrayList();
    private final List supportedPrimaryGoals = new ArrayList();
    private final List supportedTapGestureOptions = new ArrayList();
    private final List supportedWatchCheckOptions = new ArrayList();
    private TrackerSettings trackerSettings;
    private DeviceType type;
    private DeviceVersion version;
    private String wireId;

    public Device()
    {
        alarms = new ArrayList();
        bondInfo = new BondInfo();
    }

    private void a(BondInfo bondinfo)
    {
        bondInfo = bondinfo;
    }

    public List B()
    {
        return supportedWatchCheckOptions;
    }

    public List C()
    {
        return autoLapOptions;
    }

    public String a()
    {
        return imageUrl;
    }

    public void a(Context context)
    {
        a(com.fitbit.data.domain.device.BondInfo.a(context));
        context = o();
        context.a(TrackerOption.BONDED_PEER_NAME, new e(bondInfo.c));
        context.a(TrackerOption.BONDED_PEER_ID, new e(bondInfo.b));
    }

    public void a(Profile profile1)
    {
        profile = profile1;
    }

    public void a(BatteryLevel batterylevel)
    {
        batteryLevel = batterylevel;
    }

    public void a(DeviceType devicetype)
    {
        type = devicetype;
    }

    public void a(DeviceVersion deviceversion)
    {
        version = deviceversion;
    }

    public void a(FirmwareUpdate firmwareupdate)
    {
        fwUpdate = firmwareupdate;
    }

    public void a(TrackerSettings trackersettings)
    {
        trackerSettings = trackersettings;
    }

    public void a(c c1)
    {
        currentFirmware = c1;
    }

    public void a(String s1)
    {
        imageUrl = s1;
    }

    public void a(Date date)
    {
        lastSyncTime = date;
    }

    public void a(List list)
    {
        alarms = list;
    }

    public void a(JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("currentFirmware");
        JSONObject jsonobject2 = jsonobject.optJSONObject("latestFirmware");
        Object obj = jsonobject.optJSONObject("settings");
        b(com.fitbit.d.a.a(jsonobject, "wireId"));
        a(com.fitbit.d.a.a(jsonobject, "imageUrl"));
        jsonobject = jsonobject.optJSONObject("fwUpdate");
        if (jsonobject1 != null)
        {
            a(new c(com.fitbit.data.domain.device.FirmwareVersion.a(jsonobject1.getString("app")), com.fitbit.data.domain.device.FirmwareVersion.a(jsonobject1.getString("bsl"))));
        }
        if (jsonobject2 != null)
        {
            b(new c(com.fitbit.data.domain.device.FirmwareVersion.a(jsonobject2.getString("app")), com.fitbit.data.domain.device.FirmwareVersion.a(jsonobject2.getString("bsl"))));
        }
        if (obj != null)
        {
            TrackerSettings trackersettings = new TrackerSettings();
            trackersettings.initFromPublicApiJsonObject(((JSONObject) (obj)));
            if (trackerSettings != null)
            {
                trackersettings.setEntityId(trackerSettings.getEntityId());
            }
            obj = trackersettings.a(TrackerOption.BONDED_PEER_NAME);
            e e1 = trackersettings.a(TrackerOption.BONDED_PEER_ID);
            if (obj != null && e1 != null)
            {
                a(new BondInfo((String)((e) (obj)).c(), (String)e1.c()));
            }
            a(trackersettings);
        } else
        {
            a(((TrackerSettings) (null)));
        }
        if (jsonobject != null)
        {
            fwUpdate = new FirmwareUpdate();
            fwUpdate.initFromPublicApiJsonObject(jsonobject);
        }
        setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
    }

    public void a(boolean flag)
    {
        encrypted = flag;
    }

    public void a(boolean flag, boolean flag1)
    {
        TrackerSyncPreferencesSavedState.a(encodedId, flag, flag1);
    }

    public boolean a(DeviceFeature devicefeature)
    {
        return com.fitbit.data.domain.device.b.a().a(this, devicefeature);
    }

    public String b()
    {
        return wireId;
    }

    public void b(c c1)
    {
        lastestFirmware = c1;
    }

    public void b(String s1)
    {
        wireId = s1;
    }

    public void b(List list)
    {
        supportedPrimaryGoals.clear();
        supportedPrimaryGoals.addAll(list);
    }

    public void b(boolean flag)
    {
        TrackerSyncPreferencesSavedState.a(encodedId, flag);
    }

    public boolean b(DeviceFeature devicefeature)
    {
        return com.fitbit.data.domain.device.b.a().b(this, devicefeature);
    }

    public String c()
    {
        return encodedId;
    }

    public void c(String s1)
    {
        encodedId = s1;
    }

    public void c(List list)
    {
        supportedExerciseOptions.clear();
        supportedExerciseOptions.addAll(list);
    }

    public void c(boolean flag)
    {
        if (flag && lastestFirmware != null)
        {
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("app", lastestFirmware.a().toString());
                jsonobject.put("bsl", lastestFirmware.b().toString());
                TrackerSyncPreferencesSavedState.b(jsonobject.toString());
                return;
            }
            catch (JSONException jsonexception)
            {
                TrackerSyncPreferencesSavedState.b(null);
            }
            return;
        } else
        {
            TrackerSyncPreferencesSavedState.b(null);
            return;
        }
    }

    public boolean c(DeviceFeature devicefeature)
    {
        return com.fitbit.data.domain.device.b.a().c(this, devicefeature);
    }

    public String d()
    {
        return mac;
    }

    public void d(String s1)
    {
        mac = s1;
    }

    public void d(List list)
    {
        supportedClockFaces.clear();
        supportedClockFaces.addAll(list);
    }

    public Date e()
    {
        return lastSyncTime;
    }

    public void e(String s1)
    {
        deviceName = s1;
    }

    public void e(List list)
    {
        supportedTapGestureOptions.clear();
        supportedTapGestureOptions.addAll(list);
    }

    public BatteryLevel f()
    {
        return batteryLevel;
    }

    public void f(List list)
    {
        supportedWatchCheckOptions.clear();
        supportedWatchCheckOptions.addAll(list);
    }

    public DeviceType g()
    {
        return type;
    }

    public void g(List list)
    {
        autoLapOptions.clear();
        autoLapOptions.addAll(list);
    }

    public DeviceVersion h()
    {
        return version;
    }

    public String i()
    {
        if (h() == DeviceVersion.MOTIONBIT && com.fitbit.pedometer.k.a())
        {
            return Build.MODEL;
        } else
        {
            return j();
        }
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        c(com.fitbit.d.a.a(jsonobject, "id"));
        a(com.fitbit.d.a.c(jsonobject, "lastSyncTime"));
        a(BatteryLevel.parse(com.fitbit.d.a.a(jsonobject, "battery")));
        a(DeviceType.parse(com.fitbit.d.a.a(jsonobject, "type")));
        String s1 = com.fitbit.d.a.a(jsonobject, "deviceVersion");
        a(DeviceVersion.parse(s1));
        e(s1);
        d(com.fitbit.d.a.a(jsonobject, "mac"));
        a(com.fitbit.d.a.a(jsonobject, "encrypted", true).booleanValue());
        setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
    }

    public String j()
    {
        return deviceName;
    }

    public Profile k()
    {
        return profile;
    }

    public List l()
    {
        return alarms;
    }

    public c m()
    {
        return currentFirmware;
    }

    public c n()
    {
        return lastestFirmware;
    }

    public TrackerSettings o()
    {
        return trackerSettings;
    }

    public boolean p()
    {
        return encrypted;
    }

    public List q()
    {
        return supportedPrimaryGoals;
    }

    public List r()
    {
        return supportedExerciseOptions;
    }

    public List s()
    {
        return supportedClockFaces;
    }

    public List t()
    {
        return supportedTapGestureOptions;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" type: ").append(g());
        stringbuilder.append(" version: ").append(h());
        stringbuilder.append(" encodedId: ").append(c());
        stringbuilder.append(" lastSyncTime: ").append(e());
        return stringbuilder.toString();
    }

    public boolean u()
    {
        if (a(DeviceFeature.WIRELESS_SYNC))
        {
            return TrackerSyncPreferencesSavedState.a(encodedId);
        } else
        {
            return false;
        }
    }

    public FirmwareUpdate v()
    {
        return fwUpdate;
    }

    public boolean w()
    {
        String s1;
        s1 = TrackerSyncPreferencesSavedState.j();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        Object obj = new JSONObject(s1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        boolean flag;
        FirmwareVersion firmwareversion = com.fitbit.data.domain.device.FirmwareVersion.a(((JSONObject) (obj)).getString("app"));
        obj = com.fitbit.data.domain.device.FirmwareVersion.a(((JSONObject) (obj)).getString("bsl"));
        if (lastestFirmware == null || !lastestFirmware.a().equals(firmwareversion))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        flag = lastestFirmware.b().equals(obj);
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_81;
        JSONException jsonexception;
        jsonexception;
        return false;
    }

    public boolean x()
    {
        while (com.fitbit.savedstate.h.h() || v() != null && (v().d() || v().c() || v().b())) 
        {
            return true;
        }
        return false;
    }

    public String y()
    {
        if (mac != null)
        {
            return com.fitbit.galileo.a.f.b(com.fitbit.galileo.a.f.a(mac));
        } else
        {
            return mac;
        }
    }

    public GuideInfo z()
    {
        Object obj = com.fitbit.data.bl.o.a().a(j());
        if (obj != null && ((TrackerType) (obj)).d() != null)
        {
            obj = ((TrackerType) (obj)).d().k();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return new GuideInfo(((String) (obj)), 0x7f080632, 0x7f080633);
            }
        }
        return null;
    }
}
