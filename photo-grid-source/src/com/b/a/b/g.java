// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import a.a.a.a.a.b.a;
import a.a.a.a.a.e.d;
import a.a.a.a.a.e.e;
import a.a.a.a.a.e.m;
import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.s;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.b.a.b:
//            f, h, i

final class g extends a
{

    private final i b;

    public g(p p1, String s1, String s2, m m, i i)
    {
        super(p1, s1, s2, m, d.a);
        b = i;
    }

    public final h a(String s1, String s2, com.b.a.b.f f1)
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", f1.a);
        hashmap.put("display_version", f1.b);
        hashmap.put("instance", f1.c);
        hashmap.put("source", "3");
        obj = a(((Map) (hashmap)));
        f1 = ((com.b.a.b.f) (obj));
        s1 = ((e) (obj)).a("Accept", "application/json").a("User-Agent", (new StringBuilder("Crashlytics Android SDK/")).append(a.a()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", a.a()).a("X-CRASHLYTICS-API-KEY", s1).a("X-CRASHLYTICS-D", s2);
        f.d();
        (new StringBuilder("Checking for updates from ")).append(a());
        f.d();
        (new StringBuilder("Checking for updates query params are: ")).append(hashmap);
        String s3;
        boolean flag;
        if (200 == s1.b())
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
        f.d();
        s2 = new JSONObject(s1.c());
        f1 = s2.optString("url", null);
        obj = s2.optString("version_string", null);
        s3 = s2.optString("build_version", null);
        s2 = new h(f1, ((String) (obj)), s2.optString("display_version", null), s3, s2.optString("identifier", null), s2.optString("instance_identifier", null));
        if (s1 != null)
        {
            s1.a("X-REQUEST-ID");
            f.d();
        }
        return s2;
        f.d().c("Beta", (new StringBuilder("Checking for updates failed. Response code: ")).append(s1.b()).toString());
        if (s1 != null)
        {
            s1.a("X-REQUEST-ID");
            f.d();
        }
_L1:
        return null;
        s2;
        s1 = null;
_L4:
        f1 = s1;
        f.d().b("Beta", (new StringBuilder("Error while checking for updates from ")).append(a()).toString(), s2);
        if (s1 != null)
        {
            s1.a("X-REQUEST-ID");
            f.d();
        }
          goto _L1
        s2;
        s1 = null;
_L3:
        if (s1 != null)
        {
            s1.a("X-REQUEST-ID");
            f.d();
        }
        throw s2;
        s2;
        s1 = f1;
        continue; /* Loop/switch isn't completed */
        s2;
        if (true) goto _L3; else goto _L2
_L2:
        s2;
        s1 = ((String) (obj));
          goto _L4
        s2;
          goto _L4
    }
}
