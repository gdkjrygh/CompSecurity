// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import b.a.a.a.a.b.a;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.d;
import b.a.a.a.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.a.a.b:
//            f, h, i

final class g extends a
{

    private final i c;

    public g(l l1, String s, String s1, b.a.a.a.a.e.g g1, i i)
    {
        super(l1, s, s1, g1, c.a);
        c = i;
    }

    public final h a(String s, String s1, f f1)
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", f1.a);
        hashmap.put("display_version", f1.b);
        hashmap.put("instance", f1.c);
        hashmap.put("source", "3");
        obj = a(((Map) (hashmap)));
        f1 = ((f) (obj));
        s = ((d) (obj)).a("Accept", "application/json").a("User-Agent", (new StringBuilder("Crashlytics Android SDK/")).append(b.a()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()).a("X-CRASHLYTICS-API-KEY", s).a("X-CRASHLYTICS-D", s1);
        b.a.a.a.d.a();
        (new StringBuilder("Checking for updates from ")).append(super.a);
        b.a.a.a.d.a();
        (new StringBuilder("Checking for updates query params are: ")).append(hashmap);
        String s2;
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
            break MISSING_BLOCK_LABEL_306;
        }
        b.a.a.a.d.a();
        s1 = new JSONObject(s.c());
        f1 = s1.optString("url", null);
        obj = s1.optString("version_string", null);
        s2 = s1.optString("build_version", null);
        s1 = new h(f1, ((String) (obj)), s1.optString("display_version", null), s2, s1.optString("identifier", null), s1.optString("instance_identifier", null));
        if (s != null)
        {
            s.a("X-REQUEST-ID");
            b.a.a.a.d.a();
        }
        return s1;
        b.a.a.a.d.a();
        (new StringBuilder("Checking for updates failed. Response code: ")).append(s.b());
        if (s != null)
        {
            s.a("X-REQUEST-ID");
            b.a.a.a.d.a();
        }
_L1:
        return null;
        s;
        s = null;
_L4:
        f1 = s;
        b.a.a.a.d.a();
        f1 = s;
        (new StringBuilder("Error while checking for updates from ")).append(super.a);
        if (s != null)
        {
            s.a("X-REQUEST-ID");
            b.a.a.a.d.a();
        }
          goto _L1
        s1;
        s = null;
_L3:
        if (s != null)
        {
            s.a("X-REQUEST-ID");
            b.a.a.a.d.a();
        }
        throw s1;
        s1;
        s = f1;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L3; else goto _L2
_L2:
        s;
        s = ((String) (obj));
          goto _L4
        s1;
          goto _L4
    }
}
