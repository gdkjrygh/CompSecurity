// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class alk extends gyp
{

    public alk(gyh gyh1, String s, String s1, hba hba)
    {
        super(gyh1, s, s1, hba, HttpMethod.a);
    }

    public final all a(String s, String s1, alj alj1)
    {
        HttpRequest httprequest;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", alj1.a);
        hashmap.put("display_version", alj1.b);
        hashmap.put("instance", alj1.c);
        hashmap.put("source", "3");
        httprequest = a(((Map) (hashmap)));
        Object obj;
        alj1 = httprequest;
        obj = httprequest;
        s = httprequest.a("Accept", "application/json").a("User-Agent", (new StringBuilder("Crashlytics Android SDK/")).append(b.a()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()).a("X-CRASHLYTICS-API-KEY", s).a("X-CRASHLYTICS-D", s1);
        alj1 = s;
        obj = s;
        gya.a().a("Beta", (new StringBuilder("Checking for updates from ")).append(super.a).toString());
        alj1 = s;
        obj = s;
        gya.a().a("Beta", (new StringBuilder("Checking for updates query params are: ")).append(hashmap).toString());
        alj1 = s;
        obj = s;
        boolean flag;
        if (200 == s.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        alj1 = s;
        obj = s;
        gya.a().a("Beta", "Checking for updates was successful");
        alj1 = s;
        obj = s;
        s1 = new JSONObject(s.c());
        alj1 = s;
        obj = s;
        s1.optString("url", null);
        alj1 = s;
        obj = s;
        s1.optString("version_string", null);
        alj1 = s;
        obj = s;
        s1.optString("build_version", null);
        alj1 = s;
        obj = s;
        s1.optString("display_version", null);
        alj1 = s;
        obj = s;
        s1.optString("identifier", null);
        alj1 = s;
        obj = s;
        s1.optString("instance_identifier", null);
        alj1 = s;
        obj = s;
        s1 = new all();
        if (s != null)
        {
            s = s.a("X-REQUEST-ID");
            gya.a().a("Fabric", (new StringBuilder("Checking for updates request ID: ")).append(s).toString());
        }
        return s1;
        alj1 = s;
        obj = s;
        gya.a().e("Beta", (new StringBuilder("Checking for updates failed. Response code: ")).append(s.b()).toString());
        if (s != null)
        {
            s = s.a("X-REQUEST-ID");
            gya.a().a("Fabric", (new StringBuilder("Checking for updates request ID: ")).append(s).toString());
        }
_L1:
        return null;
        s;
        obj = null;
_L4:
        alj1 = ((alj) (obj));
        gya.a().c("Beta", (new StringBuilder("Error while checking for updates from ")).append(super.a).toString(), s);
        if (obj != null)
        {
            s = ((HttpRequest) (obj)).a("X-REQUEST-ID");
            gya.a().a("Fabric", (new StringBuilder("Checking for updates request ID: ")).append(s).toString());
        }
          goto _L1
        s;
        alj1 = null;
_L3:
        if (alj1 != null)
        {
            s1 = alj1.a("X-REQUEST-ID");
            gya.a().a("Fabric", (new StringBuilder("Checking for updates request ID: ")).append(s1).toString());
        }
        throw s;
        s;
        if (true) goto _L3; else goto _L2
_L2:
        s;
          goto _L4
    }
}
