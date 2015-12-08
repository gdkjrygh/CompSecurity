// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ek, gs, ci, bd, 
//            ch, j, n, em, 
//            bc, hi, cs, shelduck, 
//            hq, cd, cn, cu

final class cm
    implements ek
{

    final hq a;
    final ci b;

    cm(ci ci1, hq hq1)
    {
        b = ci1;
        a = hq1;
        super();
    }

    public final void a(bd bd1)
    {
        boolean flag;
        flag = true;
        if (gs.b())
        {
            gs.a("Got TLProperties!!");
        }
        ci.e(b);
        Boolean boolean1;
        Object obj;
        Object obj1;
        if (ci.a(b) == null)
        {
            flag = false;
        }
        boolean1 = Boolean.valueOf(flag);
        if (boolean1.booleanValue())
        {
            bd1.n = ci.a(b).m;
        }
        ci.b(b, bd1);
        if (ci.a(b, ci.a(b)))
        {
            return;
        }
        ch.a().a(ci.a(b));
        b.b(false);
        ci.c(b).c.a();
        ci.b(b);
        ci.f(b);
        if (ci.g(b) != null)
        {
            ci.g(b);
            ci.h(b);
        }
        if (ci.i(b) && !em.a().a)
        {
            em.a().a(null);
        }
        if (ci.a(b).b == null || !ci.a(b, ci.a(b).b) || ci.j(b))
        {
            break MISSING_BLOCK_LABEL_395;
        }
        bd1 = em.a();
        obj = ci.b().t;
        if (ci.b().q || obj == null)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        if (((bd) (obj)).c == null || !((em) (bd1)).a)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        ci.b().d.a("tlHasAppLinking", null, null);
        try
        {
            JSONObject jsonobject = new JSONObject();
            if (((bd) (obj)).c != null && ((bd) (obj)).c.has("_id"))
            {
                jsonobject.put("project_id", ((bd) (obj)).c.opt("_id"));
            }
            if (((bd) (obj)).k != null && ((bd) (obj)).k.has("_id"))
            {
                jsonobject.put("appUser_id", ((bd) (obj)).k.opt("_id"));
            }
            if (((bd) (obj)).a != null)
            {
                jsonobject.put("session_id", ((bd) (obj)).a);
            }
            bd1.a("hasAppLinking", jsonobject);
            ci.b().q = true;
        }
        // Misplaced declaration of an exception variable
        catch (bd bd1)
        {
            try
            {
                gs.b("Sending hasAppLinking Socket", bd1);
            }
            // Misplaced declaration of an exception variable
            catch (bd bd1)
            {
                gs.b("error processing tlproperties response", bd1);
                return;
            }
        }
        if (ci.k(b) == null || !hi.a(ci.k(b), "com.google.android.c2dm.permission.RECEIVE")) goto _L2; else goto _L1
_L1:
        if (gs.b())
        {
            gs.a("Getting Push token");
        }
        obj = ci.m(b);
        flag = ci.l(b);
        if (((cs) (obj)).a.booleanValue() && !flag) goto _L2; else goto _L3
_L3:
        if (ci.b().j && !hi.a(shelduck.s)) goto _L4; else goto _L2
_L2:
        if (ci.n(b) != null)
        {
            ci.n(b).a();
        }
        if (ci.a(b).m == null || ci.a(b).n != null && ci.a(b).n.toString().equals(ci.a(b).m.toString())) goto _L6; else goto _L5
_L5:
        cd.a().d = new cn(this);
        cd.a().a(ci.a(b).m);
_L11:
        if (!boolean1.booleanValue())
        {
            ci.c(b).c();
            return;
        }
          goto _L7
_L4:
        if (ci.b().t == null) goto _L9; else goto _L8
_L8:
        bd1 = ci.b().t.c;
_L12:
        if (bd1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        bd1 = bd1.optJSONObject("credentials");
        if (bd1 != null)
        {
            break MISSING_BLOCK_LABEL_688;
        }
        try
        {
            if (gs.b())
            {
                gs.a("Project does not have GCM credentials");
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (bd bd1) { }
        gs.b("Getting GCM senderID", bd1);
        continue; /* Loop/switch isn't completed */
        obj1 = bd1.optJSONObject("gcm");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_772;
        }
        obj1 = ((JSONObject) (obj1)).getString("gcmSenderId");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_772;
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("Sender ID: ")).append(((String) (obj1))).toString());
        }
        (new cu(((cs) (obj)), (byte)0)).execute(new String[] {
            obj1, "prod"
        });
        bd1 = bd1.optJSONObject("gcmSandbox");
        if (bd1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!ci.b().g)
        {
            continue; /* Loop/switch isn't completed */
        }
        bd1 = bd1.getString("gcmSenderId");
        if (bd1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("Sandbox Sender ID: ")).append(bd1).toString());
        }
        (new cu(((cs) (obj)), (byte)0)).execute(new String[] {
            bd1, "sandbox"
        });
        continue; /* Loop/switch isn't completed */
_L6:
        if (a == null) goto _L11; else goto _L10
_L10:
        a.a();
          goto _L11
_L9:
        bd1 = null;
          goto _L12
_L7:
        return;
        if (true) goto _L2; else goto _L13
_L13:
    }

    public final void a(Exception exception)
    {
        gs.b("Getting Properties from server", exception);
        ci.f(b);
        if (a != null)
        {
            a.b();
        }
        if (ci.n(b) != null)
        {
            ci.n(b).b();
        }
    }
}
