// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.SharedPreferences;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            SettingsController, SettingsJsonTransform, SettingsCacheBehavior, CachedSettingsIo, 
//            SettingsData, SettingsSpiCall, SettingsRequest

class DefaultSettingsController
    implements SettingsController
{

    private final SettingsRequest a;
    private final SettingsJsonTransform b;
    private final CurrentTimeProvider c;
    private final CachedSettingsIo d;
    private final SettingsSpiCall e;
    private final Kit f;
    private final PreferenceStore g;

    public DefaultSettingsController(Kit kit, SettingsRequest settingsrequest, CurrentTimeProvider currenttimeprovider, SettingsJsonTransform settingsjsontransform, CachedSettingsIo cachedsettingsio, SettingsSpiCall settingsspicall)
    {
        f = kit;
        a = settingsrequest;
        c = currenttimeprovider;
        b = settingsjsontransform;
        d = cachedsettingsio;
        e = settingsspicall;
        g = new PreferenceStoreImpl(f);
    }

    private void a(JSONObject jsonobject, String s)
    {
        JSONObject jsonobject1 = jsonobject;
        if (!CommonUtils.e(f.C()))
        {
            jsonobject1 = b.a(jsonobject);
        }
        Fabric.g().a("Fabric", (new StringBuilder()).append(s).append(jsonobject1.toString()).toString());
    }

    private SettingsData b(SettingsCacheBehavior settingscachebehavior)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (SettingsCacheBehavior.b.equals(settingscachebehavior)) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = d.a();
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        obj = b.a(c, jsonobject);
        if (obj == null) goto _L6; else goto _L5
_L5:
        long l;
        a(jsonobject, "Loaded cached settings: ");
        l = c.a();
        if (SettingsCacheBehavior.c.equals(settingscachebehavior)) goto _L8; else goto _L7
_L7:
        boolean flag = ((SettingsData) (obj)).a(l);
        if (flag) goto _L9; else goto _L8
_L8:
        Fabric.g().a("Fabric", "Returning cached settings.");
_L2:
        return ((SettingsData) (obj));
_L9:
        Fabric.g().a("Fabric", "Cached settings have expired.");
        return null;
        obj;
        settingscachebehavior = obj1;
_L11:
        Fabric.g().d("Fabric", "Failed to get cached settings", ((Throwable) (obj)));
        return settingscachebehavior;
_L6:
        Fabric.g().d("Fabric", "Failed to transform cached settings data.", null);
        return null;
_L4:
        Fabric.g().a("Fabric", "No cached settings data found.");
        return null;
        Exception exception;
        exception;
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        obj = exception;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public SettingsData a()
    {
        return a(SettingsCacheBehavior.a);
    }

    public SettingsData a(SettingsCacheBehavior settingscachebehavior)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (Fabric.h())
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = obj1;
        if (!d())
        {
            obj = b(settingscachebehavior);
        }
        Exception exception;
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        JSONObject jsonobject;
        try
        {
            jsonobject = e.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            continue; /* Loop/switch isn't completed */
        }
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        obj = b.a(c, jsonobject);
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        d.a(((SettingsData) (obj)).g, jsonobject);
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        a(jsonobject, "Loaded settings: ");
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        a(b());
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        obj = settingscachebehavior;
        if (settingscachebehavior != null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = b(SettingsCacheBehavior.c);
        return ((SettingsData) (obj));
        exception;
        settingscachebehavior = null;
_L2:
        Fabric.g().d("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", exception);
        return settingscachebehavior;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    boolean a(String s)
    {
        android.content.SharedPreferences.Editor editor = g.b();
        editor.putString("existing_instance_identifier", s);
        return g.a(editor);
    }

    String b()
    {
        return CommonUtils.a(new String[] {
            CommonUtils.m(f.C())
        });
    }

    String c()
    {
        return g.a().getString("existing_instance_identifier", "");
    }

    boolean d()
    {
        return !c().equals(b());
    }
}
