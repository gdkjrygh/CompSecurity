// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import android.content.SharedPreferences;
import b.a.a.a.a.b.m;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.d;
import b.a.a.a.l;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a.a.a.a.g:
//            s, r, g, v, 
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
    private final c g;

    public j(l l1, w w, m m1, v v1, g g1, x x1)
    {
        f = l1;
        a = w;
        c = m1;
        b = v1;
        d = g1;
        e = x1;
        g = new d(f);
    }

    private static void a(JSONObject jsonobject, String s1)
        throws JSONException
    {
        b.a.a.a.d.a();
        (new StringBuilder()).append(s1).append(jsonobject.toString());
    }

    private t b(r r1)
    {
        t t1;
        Object obj;
        obj = null;
        t1 = null;
        if (r.b.equals(r1)) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = d.a();
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        long l1;
        t1 = b.a(c, jsonobject);
        a(jsonobject, "Loaded cached settings: ");
        l1 = c.a();
        if (b.a.a.a.a.g.r.c.equals(r1)) goto _L6; else goto _L5
_L5:
        long l2 = t1.g;
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
        b.a.a.a.d.a();
_L2:
        return t1;
_L7:
        b.a.a.a.d.a();
        return null;
        r1;
        r1 = obj;
_L9:
        b.a.a.a.d.a();
        return r1;
_L4:
        b.a.a.a.d.a();
        return null;
        r1;
        r1 = t1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String b()
    {
        return b.a.a.a.a.b.j.a(new String[] {
            b.a.a.a.a.b.j.m(f.n)
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
        Object obj2;
        Object obj4;
        obj4 = null;
        obj2 = null;
        obj1 = obj2;
        obj = obj4;
        if (b.a.a.a.d.b())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = obj4;
        boolean flag;
        if (!g.a().getString("existing_instance_identifier", "").equals(b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = obj2;
        if (!flag)
        {
            obj = obj4;
            Object obj3;
            try
            {
                obj1 = b(r1);
            }
            // Misplaced declaration of an exception variable
            catch (r r1)
            {
                b.a.a.a.d.a();
                return ((t) (obj));
            }
        }
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        obj = obj1;
        obj3 = e.a(a);
        obj = obj1;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        obj = obj1;
        r1 = b.a(c, ((JSONObject) (obj3)));
        obj = r1;
        d.a(((t) (r1)).g, ((JSONObject) (obj3)));
        obj = r1;
        a(((JSONObject) (obj3)), "Loaded settings: ");
        obj = r1;
        obj1 = b();
        obj = r1;
        obj3 = g.b();
        obj = r1;
        ((android.content.SharedPreferences.Editor) (obj3)).putString("existing_instance_identifier", ((String) (obj1)));
        obj = r1;
        g.a(((android.content.SharedPreferences.Editor) (obj3)));
        obj = r1;
        r1 = ((r) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        r1 = b(b.a.a.a.a.g.r.c);
        return r1;
    }
}
