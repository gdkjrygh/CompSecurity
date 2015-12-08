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

    static final String BUILD_VERSION_PARAM = "build_version";
    static final String DISPLAY_VERSION_PARAM = "display_version";
    static final String ICON_HASH = "icon_hash";
    static final String INSTANCE_PARAM = "instance";
    static final String SOURCE_PARAM = "source";

    public DefaultSettingsSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
    {
        this(kit, s, s1, httprequestfactory, HttpMethod.GET);
    }

    DefaultSettingsSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
    {
        super(kit, s, s1, httprequestfactory, httpmethod);
    }

    private HttpRequest applyHeadersTo(HttpRequest httprequest, SettingsRequest settingsrequest)
    {
        return httprequest.header("X-CRASHLYTICS-API-KEY", settingsrequest.apiKey).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-D", settingsrequest.deviceId).header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("Accept", "application/json");
    }

    private Map getQueryParamsFor(SettingsRequest settingsrequest)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("build_version", settingsrequest.buildVersion);
        hashmap.put("display_version", settingsrequest.displayVersion);
        hashmap.put("source", Integer.toString(settingsrequest.source));
        if (settingsrequest.iconHash != null)
        {
            hashmap.put("icon_hash", settingsrequest.iconHash);
        }
        settingsrequest = settingsrequest.instanceId;
        if (!CommonUtils.isNullOrEmpty(settingsrequest))
        {
            hashmap.put("instance", settingsrequest);
        }
        return hashmap;
    }

    public JSONObject invoke(SettingsRequest settingsrequest)
    {
        Object obj;
        Object obj1;
        String s;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj3 = null;
        obj5 = null;
        obj2 = null;
        obj4 = null;
        obj = obj2;
        s = obj4;
        obj1 = obj5;
        Map map = getQueryParamsFor(settingsrequest);
        obj = obj2;
        s = obj4;
        obj1 = obj5;
        obj2 = getHttpRequest(map);
        obj = obj2;
        s = obj4;
        obj1 = obj2;
        settingsrequest = applyHeadersTo(((HttpRequest) (obj2)), settingsrequest);
        obj = settingsrequest;
        s = obj4;
        obj1 = settingsrequest;
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Requesting settings from ").append(getUrl()).toString());
        obj = settingsrequest;
        s = obj4;
        obj1 = settingsrequest;
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings query params were: ").append(map).toString());
        obj = settingsrequest;
        s = obj4;
        obj1 = settingsrequest;
        int i = settingsrequest.code();
        obj = settingsrequest;
        s = obj4;
        obj1 = settingsrequest;
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings result was: ").append(i).toString());
        obj = settingsrequest;
        s = obj4;
        obj1 = settingsrequest;
        obj2 = settingsrequest.body();
        obj = settingsrequest;
        s = ((String) (obj2));
        obj1 = settingsrequest;
        obj2 = new JSONObject(((String) (obj2)));
        if (settingsrequest == null)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings request ID: ").append(settingsrequest.header("X-REQUEST-ID")).toString());
        settingsrequest = ((SettingsRequest) (obj2));
_L2:
        return settingsrequest;
        settingsrequest;
        obj1 = obj;
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Failed to retrieve settings from ").append(getUrl()).toString(), settingsrequest);
        obj1 = obj;
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings response ").append(s).toString());
        settingsrequest = obj3;
        if (obj == null) goto _L2; else goto _L1
_L1:
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings request ID: ").append(((HttpRequest) (obj)).header("X-REQUEST-ID")).toString());
        return null;
        settingsrequest;
        if (obj1 != null)
        {
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings request ID: ").append(((HttpRequest) (obj1)).header("X-REQUEST-ID")).toString());
        }
        throw settingsrequest;
        return ((JSONObject) (obj2));
    }
}
