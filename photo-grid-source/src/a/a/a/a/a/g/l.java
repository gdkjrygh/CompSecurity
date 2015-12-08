// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.g;

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

// Referenced classes of package a.a.a.a.a.g:
//            z, y

final class l extends a
    implements z
{

    public l(p p1, String s1, String s2, m m)
    {
        this(p1, s1, s2, m, d.a);
    }

    private l(p p1, String s1, String s2, m m, int i)
    {
        super(p1, s1, s2, m, i);
    }

    private JSONObject a(String s1)
    {
        try
        {
            s1 = new JSONObject(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            f.d();
            (new StringBuilder("Failed to parse settings JSON from ")).append(a());
            f.d();
            return null;
        }
        return s1;
    }

    public final JSONObject a(y y1)
    {
        Object obj = null;
        e e2;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", y1.e);
        hashmap.put("display_version", y1.d);
        hashmap.put("source", Integer.toString(y1.f));
        if (y1.g != null)
        {
            hashmap.put("icon_hash", y1.g);
        }
        String s1 = y1.c;
        if (!a.a.a.a.a.b.l.d(s1))
        {
            hashmap.put("instance", s1);
        }
        e2 = a(((Map) (hashmap)));
        e e1 = e2;
        e2 = e2.a("X-CRASHLYTICS-API-KEY", y1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-D", y1.b).a("X-CRASHLYTICS-API-CLIENT-VERSION", a.a()).a("Accept", "application/json");
        e1 = e2;
        f.d();
        e1 = e2;
        (new StringBuilder("Requesting settings from ")).append(a());
        e1 = e2;
        f.d();
        e1 = e2;
        (new StringBuilder("Settings query params were: ")).append(hashmap);
        e1 = e2;
        int i = e2.b();
        e1 = e2;
        f.d();
        if (i != 200 && i != 201 && i != 202 && i != 203)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (!i) goto _L2; else goto _L1
_L1:
        e1 = e2;
        y1 = a(e2.c());
_L4:
        if (e2 != null)
        {
            f.d();
            (new StringBuilder("Settings request ID: ")).append(e2.a("X-REQUEST-ID"));
        }
        return y1;
_L2:
        e1 = e2;
        f.d().c("Fabric", (new StringBuilder("Failed to retrieve settings from ")).append(a()).toString());
        y1 = obj;
        if (true) goto _L4; else goto _L3
_L3:
        y1;
_L6:
        if (e1 != null)
        {
            f.d();
            (new StringBuilder("Settings request ID: ")).append(e1.a("X-REQUEST-ID"));
        }
        throw y1;
        y1;
        e1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
