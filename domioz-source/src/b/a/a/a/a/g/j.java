// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import android.content.SharedPreferences;
import b.a.a.a.a.b.l;
import b.a.a.a.a.f.b;
import b.a.a.a.a.f.c;
import b.a.a.a.f;
import b.a.a.a.o;
import b.a.a.a.q;
import org.json.JSONObject;

// Referenced classes of package b.a.a.a.a.g:
//            u, x, t, g, 
//            v, z, y

final class j
    implements u
{

    private final y a;
    private final x b;
    private final b.a.a.a.a.b.q c;
    private final g d;
    private final z e;
    private final o f;
    private final b g;

    public j(o o1, y y, b.a.a.a.a.b.q q1, x x1, g g1, z z1)
    {
        f = o1;
        a = y;
        c = q1;
        b = x1;
        d = g1;
        e = z1;
        g = new c(f);
    }

    private void a(JSONObject jsonobject, String s)
    {
        JSONObject jsonobject1 = jsonobject;
        if (!l.e(f.w()))
        {
            jsonobject1 = b.a(jsonobject);
        }
        b.a.a.a.f.c().a("Fabric", (new StringBuilder()).append(s).append(jsonobject1.toString()).toString());
    }

    private v b(t t1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (b.a.a.a.a.g.t.b.equals(t1)) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = d.a();
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        long l1;
        obj = b.a(c, jsonobject);
        a(jsonobject, "Loaded cached settings: ");
        l1 = c.a();
        if (b.a.a.a.a.g.t.c.equals(t1)) goto _L6; else goto _L5
_L5:
        long l2 = ((v) (obj)).g;
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
        b.a.a.a.f.c().a("Fabric", "Returning cached settings.");
_L2:
        return ((v) (obj));
_L7:
        b.a.a.a.f.c().a("Fabric", "Cached settings have expired.");
        return null;
        obj;
        t1 = obj1;
_L9:
        b.a.a.a.f.c().c("Fabric", "Failed to get cached settings", ((Throwable) (obj)));
        return t1;
_L4:
        b.a.a.a.f.c().a("Fabric", "No cached settings data found.");
        return null;
        Exception exception;
        exception;
        t1 = ((t) (obj));
        obj = exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String b()
    {
        return l.a(new String[] {
            l.l(f.w())
        });
    }

    public final v a()
    {
        return a(t.a);
    }

    public final v a(t t1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (b.a.a.a.f.d())
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
        obj = b(t1);
        Exception exception;
        t1 = ((t) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        t1 = ((t) (obj));
        try
        {
            obj1 = e.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            continue; /* Loop/switch isn't completed */
        }
        t1 = ((t) (obj));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        t1 = ((t) (obj));
        obj = b.a(c, ((JSONObject) (obj1)));
        t1 = ((t) (obj));
        d.a(((v) (obj)).g, ((JSONObject) (obj1)));
        t1 = ((t) (obj));
        a(((JSONObject) (obj1)), "Loaded settings: ");
        t1 = ((t) (obj));
        obj1 = b();
        t1 = ((t) (obj));
        editor = g.b();
        t1 = ((t) (obj));
        editor.putString("existing_instance_identifier", ((String) (obj1)));
        t1 = ((t) (obj));
        g.a(editor);
        t1 = ((t) (obj));
        obj = t1;
        if (t1 != null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = b(b.a.a.a.a.g.t.c);
        return ((v) (obj));
        exception;
        t1 = null;
_L2:
        b.a.a.a.f.c().c("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", exception);
        return t1;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
