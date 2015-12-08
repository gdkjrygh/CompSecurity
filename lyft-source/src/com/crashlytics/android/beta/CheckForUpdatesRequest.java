// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.beta:
//            BuildProperties, CheckForUpdatesResponseTransform, CheckForUpdatesResponse

class CheckForUpdatesRequest extends AbstractSpiCall
{

    private final CheckForUpdatesResponseTransform b;

    public CheckForUpdatesRequest(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, CheckForUpdatesResponseTransform checkforupdatesresponsetransform)
    {
        super(kit, s, s1, httprequestfactory, HttpMethod.a);
        b = checkforupdatesresponsetransform;
    }

    private HttpRequest a(HttpRequest httprequest, String s, String s1)
    {
        return httprequest.a("Accept", "application/json").a("User-Agent", (new StringBuilder()).append("Crashlytics Android SDK/").append(a.d()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "bca6990fc3c15a8105800c0673517a4b579634a1").a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", a.d()).a("X-CRASHLYTICS-API-KEY", s).a("X-CRASHLYTICS-D", s1);
    }

    private Map a(BuildProperties buildproperties)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("build_version", buildproperties.a);
        hashmap.put("display_version", buildproperties.b);
        hashmap.put("instance", buildproperties.c);
        hashmap.put("source", "3");
        return hashmap;
    }

    public CheckForUpdatesResponse a(String s, String s1, BuildProperties buildproperties)
    {
        Object obj1 = null;
        HttpRequest httprequest;
        Map map;
        map = a(buildproperties);
        httprequest = a(map);
        Object obj;
        buildproperties = httprequest;
        obj = httprequest;
        s = a(httprequest, s, s1);
        buildproperties = s;
        obj = s;
        Fabric.g().a("Beta", (new StringBuilder()).append("Checking for updates from ").append(a()).toString());
        buildproperties = s;
        obj = s;
        Fabric.g().a("Beta", (new StringBuilder()).append("Checking for updates query params are: ").append(map).toString());
        buildproperties = s;
        obj = s;
        if (!s.c()) goto _L2; else goto _L1
_L1:
        buildproperties = s;
        obj = s;
        Fabric.g().a("Beta", "Checking for updates was successful");
        buildproperties = s;
        obj = s;
        s1 = new JSONObject(s.e());
        buildproperties = s;
        obj = s;
        s1 = b.a(s1);
        buildproperties = s1;
        if (s != null)
        {
            s = s.b("X-REQUEST-ID");
            Fabric.g().a("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
            buildproperties = s1;
        }
_L4:
        return buildproperties;
_L2:
        buildproperties = s;
        obj = s;
        Fabric.g().d("Beta", (new StringBuilder()).append("Checking for updates failed. Response code: ").append(s.b()).toString());
        buildproperties = obj1;
        if (s == null) goto _L4; else goto _L3
_L3:
        s = s.b("X-REQUEST-ID");
        Fabric.g().a("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
        return null;
        s;
        obj = null;
_L8:
        buildproperties = ((BuildProperties) (obj));
        Fabric.g().d("Beta", (new StringBuilder()).append("Error while checking for updates from ").append(a()).toString(), s);
        buildproperties = obj1;
        if (obj == null) goto _L4; else goto _L5
_L5:
        s = ((HttpRequest) (obj)).b("X-REQUEST-ID");
        Fabric.g().a("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
        return null;
        s;
        buildproperties = null;
_L7:
        if (buildproperties != null)
        {
            s1 = buildproperties.b("X-REQUEST-ID");
            Fabric.g().a("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s1).toString());
        }
        throw s;
        s;
        if (true) goto _L7; else goto _L6
_L6:
        s;
          goto _L8
    }
}
