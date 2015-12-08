// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.SettingsCacheBehavior;
import org.json.JSONObject;

final class hbo
    implements hby
{

    private final hcb a;
    private final hca b;
    private final gzc c;
    private final hbl d;
    private final hcc e;
    private final gyh f;
    private final hbd g;

    public hbo(gyh gyh1, hcb hcb, gzc gzc1, hca hca1, hbl hbl1, hcc hcc1)
    {
        f = gyh1;
        a = hcb;
        c = gzc1;
        b = hca1;
        d = hbl1;
        e = hcc1;
        g = new hbe(f);
    }

    private static void a(JSONObject jsonobject, String s)
    {
        gya.a().a("Fabric", (new StringBuilder()).append(s).append(jsonobject.toString()).toString());
    }

    private hbz b(SettingsCacheBehavior settingscachebehavior)
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
        long l;
        obj = b.a(c, jsonobject);
        a(jsonobject, "Loaded cached settings: ");
        l = c.a();
        if (SettingsCacheBehavior.c.equals(settingscachebehavior)) goto _L6; else goto _L5
_L5:
        long l1 = ((hbz) (obj)).g;
        boolean flag;
        if (l1 < l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L7; else goto _L6
_L6:
        gya.a().a("Fabric", "Returning cached settings.");
_L2:
        return ((hbz) (obj));
_L7:
        gya.a().a("Fabric", "Cached settings have expired.");
        return null;
        obj;
        settingscachebehavior = obj1;
_L9:
        gya.a().c("Fabric", "Failed to get cached settings", ((Throwable) (obj)));
        return settingscachebehavior;
_L4:
        gya.a().a("Fabric", "No cached settings data found.");
        return null;
        Exception exception;
        exception;
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        obj = exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String b()
    {
        return CommonUtils.a(new String[] {
            CommonUtils.k(f.k)
        });
    }

    public final hbz a()
    {
        return a(SettingsCacheBehavior.a);
    }

    public final hbz a(SettingsCacheBehavior settingscachebehavior)
    {
        Object obj = null;
        gya.b();
        Object obj1;
        android.content.SharedPreferences.Editor editor;
        boolean flag;
        if (!g.a().getString("existing_instance_identifier", "").equals(b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = b(settingscachebehavior);
        Exception exception;
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        try
        {
            obj1 = e.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            continue; /* Loop/switch isn't completed */
        }
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        obj = b.a(c, ((JSONObject) (obj1)));
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        d.a(((hbz) (obj)).g, ((JSONObject) (obj1)));
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        a(((JSONObject) (obj1)), "Loaded settings: ");
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        obj1 = b();
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        editor = g.b();
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        editor.putString("existing_instance_identifier", ((String) (obj1)));
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        g.a(editor);
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        obj = settingscachebehavior;
        if (settingscachebehavior != null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        obj = b(SettingsCacheBehavior.c);
        return ((hbz) (obj));
        exception;
        settingscachebehavior = null;
_L2:
        gya.a().c("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", exception);
        return settingscachebehavior;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
