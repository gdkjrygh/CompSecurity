// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.b.ar;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            s, c, AccessToken, ap

class b
{

    private final SharedPreferences a;
    private final c b;
    private ap c;

    public b()
    {
        this(s.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new c());
    }

    b(SharedPreferences sharedpreferences, c c1)
    {
        a = sharedpreferences;
        b = c1;
    }

    private boolean c()
    {
        return a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private AccessToken d()
    {
        AccessToken accesstoken = null;
        String s1 = a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (s1 != null)
        {
            try
            {
                accesstoken = AccessToken.a(new JSONObject(s1));
            }
            catch (JSONException jsonexception)
            {
                return null;
            }
        }
        return accesstoken;
    }

    private boolean e()
    {
        return s.c();
    }

    private AccessToken f()
    {
        Object obj = null;
        android.os.Bundle bundle = g().a();
        AccessToken accesstoken = obj;
        if (bundle != null)
        {
            accesstoken = obj;
            if (ap.a(bundle))
            {
                accesstoken = AccessToken.a(bundle);
            }
        }
        return accesstoken;
    }

    private ap g()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = b.a();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return c;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public AccessToken a()
    {
        AccessToken accesstoken = null;
        if (c())
        {
            accesstoken = d();
        } else
        if (e())
        {
            AccessToken accesstoken1 = f();
            accesstoken = accesstoken1;
            if (accesstoken1 != null)
            {
                a(accesstoken1);
                g().b();
                return accesstoken1;
            }
        }
        return accesstoken;
    }

    public void a(AccessToken accesstoken)
    {
        ar.a(accesstoken, "accessToken");
        try
        {
            accesstoken = accesstoken.j();
            a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accesstoken.toString()).apply();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AccessToken accesstoken)
        {
            return;
        }
    }

    public void b()
    {
        a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (e())
        {
            g().b();
        }
    }
}
