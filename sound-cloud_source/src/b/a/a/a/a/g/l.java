// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.j;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.g;
import b.a.a.a.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package b.a.a.a.a.g:
//            x, w

final class l extends a
    implements x
{

    public l(b.a.a.a.l l1, String s, String s1, g g)
    {
        this(l1, s, s1, g, c.a);
    }

    private l(b.a.a.a.l l1, String s, String s1, g g, int i)
    {
        super(l1, s, s1, g, i);
    }

    private JSONObject a(String s)
    {
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            d.a();
            (new StringBuilder("Failed to parse settings JSON from ")).append(super.a);
            d.a();
            return null;
        }
        return s;
    }

    public final JSONObject a(w w1)
    {
        Object obj = null;
        b.a.a.a.a.e.d d2;
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("build_version", w1.e);
        hashmap.put("display_version", w1.d);
        hashmap.put("source", Integer.toString(w1.f));
        if (w1.g != null)
        {
            hashmap.put("icon_hash", w1.g);
        }
        String s = w1.c;
        if (!j.d(s))
        {
            hashmap.put("instance", s);
        }
        d2 = a(((Map) (hashmap)));
        b.a.a.a.a.e.d d1 = d2;
        d2 = d2.a("X-CRASHLYTICS-API-KEY", w1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-D", w1.b).a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()).a("Accept", "application/json");
        d1 = d2;
        d.a();
        d1 = d2;
        (new StringBuilder("Requesting settings from ")).append(super.a);
        d1 = d2;
        d.a();
        d1 = d2;
        (new StringBuilder("Settings query params were: ")).append(hashmap);
        d1 = d2;
        int i = d2.b();
        d1 = d2;
        d.a();
        if (i != 200 && i != 201 && i != 202 && i != 203)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (!i) goto _L2; else goto _L1
_L1:
        d1 = d2;
        w1 = a(d2.c());
_L4:
        if (d2 != null)
        {
            d.a();
            (new StringBuilder("Settings request ID: ")).append(d2.a("X-REQUEST-ID"));
        }
        return w1;
_L2:
        d1 = d2;
        d.a();
        d1 = d2;
        (new StringBuilder("Failed to retrieve settings from ")).append(super.a);
        w1 = obj;
        if (true) goto _L4; else goto _L3
_L3:
        w1;
_L6:
        if (d1 != null)
        {
            d.a();
            (new StringBuilder("Settings request ID: ")).append(d1.a("X-REQUEST-ID"));
        }
        throw w1;
        w1;
        d1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
