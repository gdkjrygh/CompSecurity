// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.SharedPreferences;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.c.d;
import io.fabric.sdk.android.services.common.CommonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            r, SettingsCacheBehavior, g, u, 
//            s, w, v

final class j
    implements r
{

    private final v a;
    private final u b;
    private final io.fabric.sdk.android.services.common.j c;
    private final g d;
    private final w e;
    private final h f;
    private final io.fabric.sdk.android.services.c.c g;

    public j(h h1, v v, io.fabric.sdk.android.services.common.j j1, u u1, g g1, w w1)
    {
        f = h1;
        a = v;
        c = j1;
        b = u1;
        d = g1;
        e = w1;
        g = new d(f);
    }

    private static void a(JSONObject jsonobject, String s1)
        throws JSONException
    {
        io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder()).append(s1).append(jsonobject.toString()).toString());
    }

    private s b(SettingsCacheBehavior settingscachebehavior)
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
        if (io.fabric.sdk.android.services.settings.SettingsCacheBehavior.c.equals(settingscachebehavior)) goto _L6; else goto _L5
_L5:
        long l1 = ((s) (obj)).g;
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
        io.fabric.sdk.android.c.a().a("Fabric", "Returning cached settings.");
_L2:
        return ((s) (obj));
_L7:
        io.fabric.sdk.android.c.a().a("Fabric", "Cached settings have expired.");
        return null;
        obj;
        settingscachebehavior = obj1;
_L9:
        io.fabric.sdk.android.c.a().c("Fabric", "Failed to get cached settings", ((Throwable) (obj)));
        return settingscachebehavior;
_L4:
        io.fabric.sdk.android.c.a().a("Fabric", "No cached settings data found.");
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
            CommonUtils.k(f.n)
        });
    }

    public final s a()
    {
        return a(SettingsCacheBehavior.a);
    }

    public final s a(SettingsCacheBehavior settingscachebehavior)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (io.fabric.sdk.android.c.b())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        android.content.SharedPreferences.Editor editor;
        boolean flag;
        if (!g.a().getString("existing_instance_identifier", "").equals(b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = obj1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = b(settingscachebehavior);
        Exception exception;
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_172;
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
            break MISSING_BLOCK_LABEL_172;
        }
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        obj = b.a(c, ((JSONObject) (obj1)));
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        d.a(((s) (obj)).g, ((JSONObject) (obj1)));
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
            break MISSING_BLOCK_LABEL_186;
        }
        obj = b(io.fabric.sdk.android.services.settings.SettingsCacheBehavior.c);
        return ((s) (obj));
        exception;
        settingscachebehavior = null;
_L2:
        io.fabric.sdk.android.c.a().c("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", exception);
        return settingscachebehavior;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
