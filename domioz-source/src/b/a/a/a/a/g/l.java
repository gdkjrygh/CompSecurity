// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import b.a.a.a.a.b.a;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.a.e.m;
import b.a.a.a.f;
import b.a.a.a.o;
import b.a.a.a.q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package b.a.a.a.a.g:
//            z, y

final class l extends a
    implements z
{

    public l(o o1, String s, String s1, m m)
    {
        this(o1, s, s1, m, d.a);
    }

    private l(o o1, String s, String s1, m m, int i)
    {
        super(o1, s, s1, m, i);
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
            f.c().a("Fabric", (new StringBuilder("Failed to parse settings JSON from ")).append(a()).toString(), exception);
            f.c().a("Fabric", (new StringBuilder("Settings response ")).append(s).toString());
            return null;
        }
        return jsonobject;
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
        String s = y1.c;
        if (!b.a.a.a.a.b.l.d(s))
        {
            hashmap.put("instance", s);
        }
        e2 = a(((Map) (hashmap)));
        e e1 = e2;
        e2 = e2.a("X-CRASHLYTICS-API-KEY", y1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-D", y1.b).a("X-CRASHLYTICS-API-CLIENT-VERSION", a.d()).a("Accept", "application/json");
        e1 = e2;
        f.c().a("Fabric", (new StringBuilder("Requesting settings from ")).append(a()).toString());
        e1 = e2;
        f.c().a("Fabric", (new StringBuilder("Settings query params were: ")).append(hashmap).toString());
        e1 = e2;
        int i = e2.b();
        e1 = e2;
        f.c().a("Fabric", (new StringBuilder("Settings result was: ")).append(i).toString());
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
            f.c().a("Fabric", (new StringBuilder("Settings request ID: ")).append(e2.a("X-REQUEST-ID")).toString());
        }
        return y1;
_L2:
        e1 = e2;
        f.c().d("Fabric", (new StringBuilder("Failed to retrieve settings from ")).append(a()).toString());
        y1 = obj;
        if (true) goto _L4; else goto _L3
_L3:
        y1;
_L6:
        if (e1 != null)
        {
            f.c().a("Fabric", (new StringBuilder("Settings request ID: ")).append(e1.a("X-REQUEST-ID")).toString());
        }
        throw y1;
        y1;
        e1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
