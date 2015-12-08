// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android:
//            b, ay, d, aw, 
//            aB, HttpRequest, Crashlytics

final class ae extends b
    implements ay
{

    public ae(String s, String s1)
    {
        super(s, s1, d.a);
    }

    public final JSONObject a(aw aw1)
    {
        Object obj2;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", aw1.e);
        hashmap.put("display_version", aw1.d);
        hashmap.put("source", Integer.toString(aw1.f));
        hashmap.put("icon_hash", aw1.g);
        String s = aw1.c;
        if (!aB.d(s))
        {
            hashmap.put("instance", s);
        }
        obj2 = a(((Map) (hashmap)));
        Object obj;
        Object obj1;
        obj = obj2;
        obj1 = obj2;
        aw1 = ((HttpRequest) (obj2)).a("X-CRASHLYTICS-API-KEY", aw1.a).a("X-CRASHLYTICS-CLIENT-TYPE", "android").a("X-CRASHLYTICS-D", aw1.b).a("X-CRASHLYTICS-API-CLIENT-VERSION", Crashlytics.getCrashlyticsVersion()).a("Accept", "application/json");
        obj = aw1;
        obj1 = aw1;
        aB.c((new StringBuilder("Requesting settings from ")).append(a()).toString());
        obj = aw1;
        obj1 = aw1;
        aB.c((new StringBuilder("Settings query params were: ")).append(hashmap).toString());
        obj = aw1;
        obj1 = aw1;
        obj2 = new JSONObject(aw1.c());
        if (aw1 != null)
        {
            aB.c((new StringBuilder("Settings request ID: ")).append(aw1.a("X-REQUEST-ID")).toString());
        }
        return ((JSONObject) (obj2));
        aw1;
        obj1 = null;
_L4:
        obj = obj1;
        aB.a((new StringBuilder("Failed to retrieve settings from ")).append(a()).toString(), aw1);
        if (obj1 != null)
        {
            aB.c((new StringBuilder("Settings request ID: ")).append(((HttpRequest) (obj1)).a("X-REQUEST-ID")).toString());
            return null;
        } else
        {
            return null;
        }
        aw1;
        obj = null;
_L2:
        if (obj != null)
        {
            aB.c((new StringBuilder("Settings request ID: ")).append(((HttpRequest) (obj)).a("X-REQUEST-ID")).toString());
        }
        throw aw1;
        aw1;
        if (true) goto _L2; else goto _L1
_L1:
        aw1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
