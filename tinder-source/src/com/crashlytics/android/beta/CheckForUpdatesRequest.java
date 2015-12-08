// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.beta:
//            BuildProperties, CheckForUpdatesResponseTransform, CheckForUpdatesResponse

class CheckForUpdatesRequest extends a
{

    private final CheckForUpdatesResponseTransform c;

    public CheckForUpdatesRequest(h h1, String s, String s1, io.fabric.sdk.android.services.network.c c1, CheckForUpdatesResponseTransform checkforupdatesresponsetransform)
    {
        super(h1, s, s1, c1, HttpMethod.a);
        c = checkforupdatesresponsetransform;
    }

    public final CheckForUpdatesResponse a(String s, String s1, BuildProperties buildproperties)
    {
        Object obj1 = null;
        HttpRequest httprequest;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", buildproperties.a);
        hashmap.put("display_version", buildproperties.b);
        hashmap.put("instance", buildproperties.c);
        hashmap.put("source", "3");
        httprequest = a(((Map) (hashmap)));
        Object obj;
        buildproperties = httprequest;
        obj = httprequest;
        s = httprequest.a("Accept", "application/json").a("User-Agent", (new StringBuilder("Crashlytics Android SDK/")).append(b.a()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()).a("X-CRASHLYTICS-API-KEY", s).a("X-CRASHLYTICS-D", s1);
        buildproperties = s;
        obj = s;
        io.fabric.sdk.android.c.a().a("Beta", (new StringBuilder("Checking for updates from ")).append(super.a).toString());
        buildproperties = s;
        obj = s;
        io.fabric.sdk.android.c.a().a("Beta", (new StringBuilder("Checking for updates query params are: ")).append(hashmap).toString());
        buildproperties = s;
        obj = s;
        boolean flag;
        if (200 == s.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        buildproperties = s;
        obj = s;
        io.fabric.sdk.android.c.a().a("Beta", "Checking for updates was successful");
        buildproperties = s;
        obj = s;
        s1 = com.crashlytics.android.beta.CheckForUpdatesResponseTransform.a(new JSONObject(s.c()));
        buildproperties = s1;
        if (s != null)
        {
            s = s.a("X-REQUEST-ID");
            io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("Checking for updates request ID: ")).append(s).toString());
            buildproperties = s1;
        }
_L4:
        return buildproperties;
_L2:
        buildproperties = s;
        obj = s;
        io.fabric.sdk.android.c.a().e("Beta", (new StringBuilder("Checking for updates failed. Response code: ")).append(s.b()).toString());
        buildproperties = obj1;
        if (s == null) goto _L4; else goto _L3
_L3:
        s = s.a("X-REQUEST-ID");
        io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("Checking for updates request ID: ")).append(s).toString());
        return null;
        s;
        obj = null;
_L8:
        buildproperties = ((BuildProperties) (obj));
        io.fabric.sdk.android.c.a().c("Beta", (new StringBuilder("Error while checking for updates from ")).append(super.a).toString(), s);
        buildproperties = obj1;
        if (obj == null) goto _L4; else goto _L5
_L5:
        s = ((HttpRequest) (obj)).a("X-REQUEST-ID");
        io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("Checking for updates request ID: ")).append(s).toString());
        return null;
        s;
        buildproperties = null;
_L7:
        if (buildproperties != null)
        {
            s1 = buildproperties.a("X-REQUEST-ID");
            io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("Checking for updates request ID: ")).append(s1).toString());
        }
        throw s;
        s;
        if (true) goto _L7; else goto _L6
_L6:
        s;
          goto _L8
    }
}
