// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            y, ca, bw, ay, 
//            ba, bx, cm, cj, 
//            bu

final class an extends y
    implements ca
{

    public an(String s, String s1, bu bu)
    {
        this(s, s1, bu, bw.a);
    }

    private an(String s, String s1, bu bu, bw bw1)
    {
        super(s, s1, bu, bw1);
    }

    public final JSONObject a(ay ay1)
    {
        Object obj2;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", ay1.e);
        hashmap.put("display_version", ay1.d);
        hashmap.put("source", Integer.toString(ay1.f));
        if (ay1.g != null)
        {
            hashmap.put("icon_hash", ay1.g);
        }
        String s = ay1.c;
        if (!ba.e(s))
        {
            hashmap.put("instance", s);
        }
        obj2 = a(((Map) (hashmap)));
        Object obj;
        Object obj1;
        obj = obj2;
        obj1 = obj2;
        ay1 = ((bx) (obj2)).a("X-CRASHLYTICS-API-KEY", ay1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-D", ay1.b).a("X-CRASHLYTICS-API-CLIENT-VERSION", cm.a().f()).a("Accept", "application/json");
        obj = ay1;
        obj1 = ay1;
        cm.a().b().a("Crashlytics", (new StringBuilder("Requesting settings from ")).append(a()).toString());
        obj = ay1;
        obj1 = ay1;
        cm.a().b().a("Crashlytics", (new StringBuilder("Settings query params were: ")).append(hashmap).toString());
        obj = ay1;
        obj1 = ay1;
        obj2 = new JSONObject(ay1.c());
        if (ay1 != null)
        {
            cm.a().b().a("Crashlytics", (new StringBuilder("Settings request ID: ")).append(ay1.a("X-REQUEST-ID")).toString());
        }
        return ((JSONObject) (obj2));
        ay1;
        obj1 = null;
_L4:
        obj = obj1;
        cm.a().b().a("Crashlytics", (new StringBuilder("Failed to retrieve settings from ")).append(a()).toString(), ay1);
        if (obj1 != null)
        {
            cm.a().b().a("Crashlytics", (new StringBuilder("Settings request ID: ")).append(((bx) (obj1)).a("X-REQUEST-ID")).toString());
            return null;
        } else
        {
            return null;
        }
        ay1;
        obj = null;
_L2:
        if (obj != null)
        {
            cm.a().b().a("Crashlytics", (new StringBuilder("Settings request ID: ")).append(((bx) (obj)).a("X-REQUEST-ID")).toString());
        }
        throw ay1;
        ay1;
        if (true) goto _L2; else goto _L1
_L1:
        ay1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
