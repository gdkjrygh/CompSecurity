// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import b.a.a.a.a.b.a;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.g;
import b.a.a.a.l;
import b.a.a.a.o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.a.a.b:
//            b, e, f

final class d extends a
{

    private final f b;

    public d(l l1, String s, String s1, g g, f f)
    {
        super(l1, s, s1, g, c.a);
        b = f;
    }

    public final e a(String s, String s1, b b1)
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", b1.a);
        hashmap.put("display_version", b1.b);
        hashmap.put("instance", b1.c);
        hashmap.put("source", "3");
        obj = a(((Map) (hashmap)));
        b1 = ((b) (obj));
        s = ((b.a.a.a.a.e.d) (obj)).a("Accept", "application/json").a("User-Agent", (new StringBuilder("Crashlytics Android SDK/")).append(a.a()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "bca6990fc3c15a8105800c0673517a4b579634a1").a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", a.a()).a("X-CRASHLYTICS-API-KEY", s).a("X-CRASHLYTICS-D", s1);
        b.a.a.a.d.c();
        (new StringBuilder("Checking for updates from ")).append(a());
        b.a.a.a.d.c();
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
        b.a.a.a.d.c();
        s1 = new JSONObject(s.c());
        b1 = s1.optString("url", null);
        obj = s1.optString("version_string", null);
        s2 = s1.optString("build_version", null);
        s1 = new e(b1, ((String) (obj)), s1.optString("display_version", null), s2, s1.optString("identifier", null), s1.optString("instance_identifier", null));
        if (s != null)
        {
            s.a("X-REQUEST-ID");
            b.a.a.a.d.c();
        }
        return s1;
        b.a.a.a.d.c().b("Beta", (new StringBuilder("Checking for updates failed. Response code: ")).append(s.b()).toString());
        if (s != null)
        {
            s.a("X-REQUEST-ID");
            b.a.a.a.d.c();
        }
_L1:
        return null;
        s1;
        s = null;
_L4:
        b1 = s;
        b.a.a.a.d.c().b("Beta", (new StringBuilder("Error while checking for updates from ")).append(a()).toString(), s1);
        if (s != null)
        {
            s.a("X-REQUEST-ID");
            b.a.a.a.d.c();
        }
          goto _L1
        s1;
        s = null;
_L3:
        if (s != null)
        {
            s.a("X-REQUEST-ID");
            b.a.a.a.d.c();
        }
        throw s1;
        s1;
        s = b1;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L3; else goto _L2
_L2:
        s1;
        s = ((String) (obj));
          goto _L4
        s1;
          goto _L4
    }
}
