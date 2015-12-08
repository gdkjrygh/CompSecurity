// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.cards.web.bf;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import com.kik.cards.web.userdata.a;
import com.kik.cards.web.userdata.e;
import com.kik.g.p;
import java.security.Security;
import kik.android.b.s;
import org.c.b;
import org.json.JSONObject;
import org.spongycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package com.kik.cards.web.auth:
//            f, e, g, i, 
//            k

public class AuthPlugin extends d
{

    private e a;
    private final kik.a.e.d b;
    private com.kik.cards.web.browser.BrowserPlugin.a d;
    private s e;

    public AuthPlugin(a a1, s s1, kik.a.e.d d1, com.kik.cards.web.browser.BrowserPlugin.a a2)
    {
        super("Auth");
        a = null;
        e = s1;
        a = a1.a();
        b = d1;
        d = a2;
        Security.addProvider(new BouncyCastleProvider());
    }

    static s a(AuthPlugin authplugin)
    {
        return authplugin.e;
    }

    static com.kik.cards.web.browser.BrowserPlugin.a b(AuthPlugin authplugin)
    {
        return authplugin.d;
    }

    static kik.a.e.d c(AuthPlugin authplugin)
    {
        return authplugin.b;
    }

    static b d(AuthPlugin authplugin)
    {
        return authplugin.c;
    }

    static b e(AuthPlugin authplugin)
    {
        return authplugin.c;
    }

    protected final p b(String s1)
    {
        return com.kik.g.s.b(com.kik.g.s.b(e.a(s1), new f(this, s1)), new com.kik.cards.web.auth.e(this));
    }

    public j getAnonymousId(com.kik.cards.web.plugin.a a1, JSONObject jsonobject, String s1)
    {
        (new Thread(new g(this, s1, a1))).start();
        return new j(202);
    }

    public j signAnonymousRequest(com.kik.cards.web.plugin.a a1, JSONObject jsonobject, String s1)
    {
        if (e == null || !bf.a(s1) && !d.h())
        {
            return new j(426);
        }
        jsonobject = jsonobject.getString("request");
        if (jsonobject == null)
        {
            return new j(400);
        } else
        {
            (new Thread(new i(this, s1, a1, jsonobject))).start();
            return new j(202);
        }
    }

    public j signRequest(com.kik.cards.web.plugin.a a1, JSONObject jsonobject, String s1)
    {
        if (d.e())
        {
            return new j(405);
        }
        if (e == null || !bf.a(s1) && !d.h())
        {
            return new j(426);
        }
        String s2 = jsonobject.optString("request");
        if (s2 == null)
        {
            return new j(400);
        }
        boolean flag = jsonobject.optBoolean("skipPrompt");
        if (a.a(flag, s1))
        {
            return new j(420);
        } else
        {
            a.a(true, flag, s1).a(new k(this, a1, s1, s2));
            return new j(202);
        }
    }
}
