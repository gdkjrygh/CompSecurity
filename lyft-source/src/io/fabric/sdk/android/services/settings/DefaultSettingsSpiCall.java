// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            SettingsSpiCall, SettingsRequest

class DefaultSettingsSpiCall extends AbstractSpiCall
    implements SettingsSpiCall
{

    public DefaultSettingsSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
    {
        this(kit, s, s1, httprequestfactory, HttpMethod.a);
    }

    DefaultSettingsSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
    {
        super(kit, s, s1, httprequestfactory, httpmethod);
    }

    private HttpRequest a(HttpRequest httprequest, SettingsRequest settingsrequest)
    {
        return httprequest.a("X-CRASHLYTICS-API-KEY", settingsrequest.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-D", settingsrequest.b).a("X-CRASHLYTICS-API-CLIENT-VERSION", a.d()).a("Accept", "application/json");
    }

    private JSONObject a(String s)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(s);
        }
        catch (Exception exception)
        {
            Fabric.g().a("Fabric", (new StringBuilder()).append("Failed to parse settings JSON from ").append(a()).toString(), exception);
            Fabric.g().a("Fabric", (new StringBuilder()).append("Settings response ").append(s).toString());
            return null;
        }
        return jsonobject;
    }

    private Map b(SettingsRequest settingsrequest)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("build_version", settingsrequest.e);
        hashmap.put("display_version", settingsrequest.d);
        hashmap.put("source", Integer.toString(settingsrequest.f));
        if (settingsrequest.g != null)
        {
            hashmap.put("icon_hash", settingsrequest.g);
        }
        settingsrequest = settingsrequest.c;
        if (!CommonUtils.c(settingsrequest))
        {
            hashmap.put("instance", settingsrequest);
        }
        return hashmap;
    }

    JSONObject a(HttpRequest httprequest)
    {
        int i = httprequest.b();
        Fabric.g().a("Fabric", (new StringBuilder()).append("Settings result was: ").append(i).toString());
        if (a(i))
        {
            return a(httprequest.e());
        } else
        {
            Fabric.g().d("Fabric", (new StringBuilder()).append("Failed to retrieve settings from ").append(a()).toString());
            return null;
        }
    }

    public JSONObject a(SettingsRequest settingsrequest)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        Map map = b(settingsrequest);
        obj = obj1;
        obj1 = a(map);
        obj = obj1;
        settingsrequest = a(((HttpRequest) (obj1)), settingsrequest);
        obj = settingsrequest;
        Fabric.g().a("Fabric", (new StringBuilder()).append("Requesting settings from ").append(a()).toString());
        obj = settingsrequest;
        Fabric.g().a("Fabric", (new StringBuilder()).append("Settings query params were: ").append(map).toString());
        obj = settingsrequest;
        obj1 = a(((HttpRequest) (settingsrequest)));
        if (settingsrequest != null)
        {
            Fabric.g().a("Fabric", (new StringBuilder()).append("Settings request ID: ").append(settingsrequest.b("X-REQUEST-ID")).toString());
        }
        return ((JSONObject) (obj1));
        settingsrequest;
        if (obj != null)
        {
            Fabric.g().a("Fabric", (new StringBuilder()).append("Settings request ID: ").append(((HttpRequest) (obj)).b("X-REQUEST-ID")).toString());
        }
        throw settingsrequest;
    }

    boolean a(int i)
    {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
