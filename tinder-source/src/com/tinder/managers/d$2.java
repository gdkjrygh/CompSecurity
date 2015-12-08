// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.Request;
import com.android.volley.c;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.activities.ActivityLogin;
import com.tinder.b.n;
import com.tinder.e.m;
import com.tinder.events.EventLoggedIn;
import com.tinder.f.ak;
import com.tinder.parse.UserParse;
import com.tinder.utils.t;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            d, ae, ManagerApp, z, 
//            y, i

final class a
    implements com.android.volley.
{

    final m a;
    final com.tinder.managers.d b;

    public final void a(Object obj)
    {
        boolean flag;
        flag = true;
        obj = (JSONObject)obj;
        (new StringBuilder("response=")).append(obj);
        Object obj1;
        Object obj3;
        Object obj4;
        if (((JSONObject) (obj)).isNull("user"))
        {
            break MISSING_BLOCK_LABEL_365;
        }
        obj1 = ((JSONObject) (obj)).getJSONObject("user");
        com.tinder.managers.d.c(b);
        obj3 = com.tinder.managers.ae.f();
        obj4 = ((JSONObject) (obj1)).optString("create_date", "");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (!((String) (obj3)).isEmpty() && !((String) (obj3)).equals(obj4))
        {
            b.d();
            obj = new Intent(com.tinder.managers.ManagerApp.c(), com/tinder/activities/ActivityLogin);
            ((Intent) (obj)).setFlags(0x10008000);
            obj1 = new Bundle();
            ((Bundle) (obj1)).putString("extra_show_intro", "");
            ((Intent) (obj)).putExtras(((Bundle) (obj1)));
            com.tinder.managers.ManagerApp.c().startActivity(((Intent) (obj)));
            return;
        }
        com.tinder.managers.d.c(b);
        ae.b.putString("ACCOUNT CREATED DATE", ((String) (obj4)));
        ae.b.commit();
        obj3 = new n();
        obj4 = com.tinder.managers.d.d(b);
        boolean flag1;
        boolean flag2;
        if (((n) (obj3)).c())
        {
            flag = false;
        }
        obj3 = ((z) (obj4)).a(flag, ((JSONObject) (obj1)));
        if (com.tinder.managers.d.d(b).b() != null)
        {
            d.e(b).a(com.tinder.managers.d.d(b).b(), ((JSONObject) (obj1)));
        }
        flag = ((b) (obj3)).e;
        flag1 = ((e) (obj3)).f;
        flag2 = ((f) (obj3)).g;
        if (((JSONObject) (obj)).getString("token") == null)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        d.b(((JSONObject) (obj)).getString("token"));
        (new StringBuilder("Tinder token found! = ")).append(d.g());
        d.a(d.g());
        if (flag || flag1 || flag2)
        {
            try
            {
                b.a(false);
                a.onVerificationNeeded(flag, flag1, flag2);
                com.tinder.managers.d.d(b).a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.a("Failed to parse and setup user object for login", ((Throwable) (obj)));
            }
            a.onTinderLoginFailure();
            return;
        }
        break MISSING_BLOCK_LABEL_395;
        v.b("user not found in response");
        a.onTinderLoginFailure();
        return;
        v.b("Tinder token not found in response");
        a.onTinderLoginFailure();
        return;
        b.a(true);
        Object obj2 = ManagerApp.h().f();
        obj = String.format(((y) (obj2)).d.B, new Object[] {
            t.a()
        });
        obj2 = new <init>(((y) (obj2)));
        ManagerApp.h().g();
        obj = new d(0, ((String) (obj)), null, ((com.android.volley.h) (obj2)), null, d.b());
        obj.j = new c(5000, 0, 1.0F);
        ManagerApp.b().a(((Request) (obj)));
        ManagerApp.h().h().a(true);
        com.tinder.managers.d.f(b).c(new EventLoggedIn());
        a.onTinderLoginSuccess();
        com.tinder.managers.d.d(b).a();
        return;
    }

    oggedIn(com.tinder.managers.d d1, m m1)
    {
        b = d1;
        a = m1;
        super();
    }
}
