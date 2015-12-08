// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import android.content.SharedPreferences;
import b.a.a.a.a.b.m;
import b.a.a.a.a.f.b;
import b.a.a.a.a.f.c;
import b.a.a.a.d;
import b.a.a.a.l;
import b.a.a.a.o;
import org.json.JSONObject;

// Referenced classes of package b.a.a.a.a.g:
//            s, v, r, g, 
//            t, x, w

final class j
    implements s
{

    private final w a;
    private final v b;
    private final m c;
    private final g d;
    private final x e;
    private final l f;
    private final b g;

    public j(l l1, w w, m m1, v v1, g g1, x x1)
    {
        f = l1;
        a = w;
        c = m1;
        b = v1;
        d = g1;
        e = x1;
        g = new c(f);
    }

    private void a(JSONObject jsonobject, String s1)
    {
        JSONObject jsonobject1 = jsonobject;
        if (!b.a.a.a.a.b.j.f(f.v()))
        {
            jsonobject1 = b.a(jsonobject);
        }
        b.a.a.a.d.c();
        (new StringBuilder()).append(s1).append(jsonobject1.toString());
    }

    private t b(r r1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (b.a.a.a.a.g.r.b.equals(r1)) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = d.a();
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        long l1;
        obj = b.a(c, jsonobject);
        a(jsonobject, "Loaded cached settings: ");
        l1 = c.a();
        if (b.a.a.a.a.g.r.c.equals(r1)) goto _L6; else goto _L5
_L5:
        long l2 = ((t) (obj)).g;
        boolean flag;
        if (l2 < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L7; else goto _L6
_L6:
        b.a.a.a.d.c();
_L2:
        return ((t) (obj));
_L7:
        b.a.a.a.d.c();
        return null;
        obj;
        r1 = obj1;
_L9:
        b.a.a.a.d.c().b("Fabric", "Failed to get cached settings", ((Throwable) (obj)));
        return r1;
_L4:
        b.a.a.a.d.c();
        return null;
        Exception exception;
        exception;
        r1 = ((r) (obj));
        obj = exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String b()
    {
        return b.a.a.a.a.b.j.a(new String[] {
            b.a.a.a.a.b.j.m(f.v())
        });
    }

    public final t a()
    {
        return a(r.a);
    }

    public final t a(r r1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (b.a.a.a.d.d())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        android.content.SharedPreferences.Editor editor;
        boolean flag;
        if (!g.a().getString("existing_instance_identifier", "").equals(b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = obj1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = b(r1);
        Exception exception;
        r1 = ((r) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        r1 = ((r) (obj));
        try
        {
            obj1 = e.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            continue; /* Loop/switch isn't completed */
        }
        r1 = ((r) (obj));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        r1 = ((r) (obj));
        obj = b.a(c, ((JSONObject) (obj1)));
        r1 = ((r) (obj));
        d.a(((t) (obj)).g, ((JSONObject) (obj1)));
        r1 = ((r) (obj));
        a(((JSONObject) (obj1)), "Loaded settings: ");
        r1 = ((r) (obj));
        obj1 = b();
        r1 = ((r) (obj));
        editor = g.b();
        r1 = ((r) (obj));
        editor.putString("existing_instance_identifier", ((String) (obj1)));
        r1 = ((r) (obj));
        g.a(editor);
        r1 = ((r) (obj));
        obj = r1;
        if (r1 != null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = b(b.a.a.a.a.g.r.c);
        return ((t) (obj));
        exception;
        r1 = null;
_L2:
        b.a.a.a.d.c().b("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", exception);
        return r1;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
