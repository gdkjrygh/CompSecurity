// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class hbq extends gyp
    implements hcc
{

    public hbq(gyh gyh1, String s, String s1, hba hba)
    {
        this(gyh1, s, s1, hba, HttpMethod.a);
    }

    private hbq(gyh gyh1, String s, String s1, hba hba, HttpMethod httpmethod)
    {
        super(gyh1, s, s1, hba, httpmethod);
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
            gya.a().a("Fabric", (new StringBuilder("Failed to parse settings JSON from ")).append(super.a).toString(), exception);
            gya.a().a("Fabric", (new StringBuilder("Settings response ")).append(s).toString());
            return null;
        }
        return jsonobject;
    }

    public final JSONObject a(hcb hcb1)
    {
        Object obj = null;
        HttpRequest httprequest1;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", hcb1.e);
        hashmap.put("display_version", hcb1.d);
        hashmap.put("source", Integer.toString(hcb1.f));
        if (hcb1.g != null)
        {
            hashmap.put("icon_hash", hcb1.g);
        }
        String s = hcb1.c;
        if (!CommonUtils.d(s))
        {
            hashmap.put("instance", s);
        }
        httprequest1 = a(((Map) (hashmap)));
        HttpRequest httprequest = httprequest1;
        httprequest1 = httprequest1.a("X-CRASHLYTICS-API-KEY", hcb1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-D", hcb1.b).a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()).a("Accept", "application/json");
        httprequest = httprequest1;
        gya.a().a("Fabric", (new StringBuilder("Requesting settings from ")).append(super.a).toString());
        httprequest = httprequest1;
        gya.a().a("Fabric", (new StringBuilder("Settings query params were: ")).append(hashmap).toString());
        httprequest = httprequest1;
        int i = httprequest1.b();
        httprequest = httprequest1;
        gya.a().a("Fabric", (new StringBuilder("Settings result was: ")).append(i).toString());
        if (i != 200 && i != 201 && i != 202 && i != 203)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (!i) goto _L2; else goto _L1
_L1:
        httprequest = httprequest1;
        hcb1 = a(httprequest1.c());
_L4:
        if (httprequest1 != null)
        {
            gya.a().a("Fabric", (new StringBuilder("Settings request ID: ")).append(httprequest1.a("X-REQUEST-ID")).toString());
        }
        return hcb1;
_L2:
        httprequest = httprequest1;
        gya.a().e("Fabric", (new StringBuilder("Failed to retrieve settings from ")).append(super.a).toString());
        hcb1 = obj;
        if (true) goto _L4; else goto _L3
_L3:
        hcb1;
_L6:
        if (httprequest != null)
        {
            gya.a().a("Fabric", (new StringBuilder("Settings request ID: ")).append(httprequest.a("X-REQUEST-ID")).toString());
        }
        throw hcb1;
        hcb1;
        httprequest = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
