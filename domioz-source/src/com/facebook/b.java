// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.bc;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            q, c, AccessToken, al

final class b
{

    private final SharedPreferences a;
    private final c b;
    private al c;

    public b()
    {
        this(q.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new c());
    }

    private b(SharedPreferences sharedpreferences, c c1)
    {
        a = sharedpreferences;
        b = c1;
    }

    private AccessToken c()
    {
        AccessToken accesstoken = null;
        String s = a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (s != null)
        {
            try
            {
                accesstoken = AccessToken.a(new JSONObject(s));
            }
            catch (JSONException jsonexception)
            {
                return null;
            }
        }
        return accesstoken;
    }

    private al d()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new al(q.f());
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

    public final AccessToken a()
    {
        Object obj1 = null;
        Object obj = null;
        if (a.contains("com.facebook.AccessTokenManager.CachedAccessToken"))
        {
            obj = c();
        } else
        if (q.c())
        {
            obj = d().a();
            AccessToken accesstoken = obj1;
            if (obj != null)
            {
                accesstoken = obj1;
                if (al.a(((android.os.Bundle) (obj))))
                {
                    accesstoken = AccessToken.a(((android.os.Bundle) (obj)));
                }
            }
            obj = accesstoken;
            if (accesstoken != null)
            {
                a(accesstoken);
                d().b();
                return accesstoken;
            }
        }
        return ((AccessToken) (obj));
    }

    public final void a(AccessToken accesstoken)
    {
        bc.a(accesstoken, "accessToken");
        try
        {
            accesstoken = accesstoken.h();
            a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accesstoken.toString()).apply();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AccessToken accesstoken)
        {
            return;
        }
    }

    public final void b()
    {
        a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (q.c())
        {
            d().b();
        }
    }
}
