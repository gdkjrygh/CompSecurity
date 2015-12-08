// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.cards.util.UserDataParcelable;
import com.kik.cards.web.bf;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import java.util.HashMap;
import kik.a.e.d;
import org.c.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.auth:
//            AuthPlugin

final class k extends r
{

    final a a;
    final String b;
    final String c;
    final AuthPlugin d;

    k(AuthPlugin authplugin, a a1, String s, String s1)
    {
        d = authplugin;
        a = a1;
        b = s;
        c = s1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (UserDataParcelable)obj;
        Object obj1 = AuthPlugin.c(d).c();
        Object obj2 = AuthPlugin.c(d).b();
        if (obj1 == null || obj2 == null)
        {
            a.a(new j(500));
            return;
        }
        obj2 = new HashMap();
        ((HashMap) (obj2)).put("kikUsr", ((UserDataParcelable) (obj)).a);
        obj1 = bf.j(b);
        ((HashMap) (obj2)).put("kikCrdDm", obj1);
        if (!bf.a(b) && com.kik.cards.web.auth.AuthPlugin.b(d).h())
        {
            ((HashMap) (obj2)).put("kikDbg", Boolean.valueOf(true));
        }
        String s;
        try
        {
            s = AuthPlugin.c(d).a(((java.util.Map) (obj2)), c);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            AuthPlugin.e(d).b("Failed to sign", ((Throwable) (obj)));
            com.a.a.a.a("GenerateSignedRequestException", ((Exception) (obj)).getLocalizedMessage());
            a.a(new j(500));
            return;
        }
        obj2 = new JSONObject();
        try
        {
            ((JSONObject) (obj2)).put("signedRequest", s);
            ((JSONObject) (obj2)).put("username", ((UserDataParcelable) (obj)).a);
            ((JSONObject) (obj2)).put("host", obj1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
        }
        a.a(new j(((JSONObject) (obj2))));
    }

    public final void a(Throwable throwable)
    {
        a.a(new j(500));
    }
}
