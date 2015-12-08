// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.cards.web.bf;
import com.kik.cards.web.plugin.a;
import com.kik.g.r;
import com.kik.m.o;
import java.util.HashMap;
import kik.a.e.d;
import org.c.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.auth:
//            i, AuthPlugin

final class j extends r
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (o)obj;
        obj = (String)((o) (obj1)).a;
        byte abyte0[] = (byte[])((o) (obj1)).b;
        if (obj == null || abyte0 == null)
        {
            a.b.a(new com.kik.cards.web.plugin.j(500));
            return;
        }
        Object obj2 = new HashMap();
        ((HashMap) (obj2)).put("kikAnonId", obj);
        obj1 = bf.j(a.a);
        ((HashMap) (obj2)).put("kikCrdDm", obj1);
        if (!bf.a(a.a) && com.kik.cards.web.auth.AuthPlugin.b(a.d).h())
        {
            ((HashMap) (obj2)).put("kikDbg", Boolean.valueOf(true));
        }
        String s;
        try
        {
            s = AuthPlugin.c(a.d).a(((java.util.Map) (obj2)), a.c, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.kik.cards.web.auth.AuthPlugin.d(a.d).b("Failed to sign (anonymous)", ((Throwable) (obj)));
            com.a.a.a.a("GenerateSignedRequestException", ((Exception) (obj)).getLocalizedMessage());
            a.b.a(new com.kik.cards.web.plugin.j(500));
            return;
        }
        obj2 = new JSONObject();
        try
        {
            ((JSONObject) (obj2)).put("signedRequest", s);
            ((JSONObject) (obj2)).put("anonymousId", obj);
            ((JSONObject) (obj2)).put("host", obj1);
            a.b.a(new com.kik.cards.web.plugin.j(((JSONObject) (obj2))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
        }
        a.b.a(new com.kik.cards.web.plugin.j(500));
    }
}
