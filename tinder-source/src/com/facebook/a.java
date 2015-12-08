// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.n;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            g, AccessToken, k, AccessTokenSource

final class com.facebook.a
{
    static final class a
    {

        a()
        {
        }
    }


    final SharedPreferences a;
    private final a b;
    private k c;

    public com.facebook.a()
    {
        this(g.g().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new a());
    }

    private com.facebook.a(SharedPreferences sharedpreferences, a a1)
    {
        a = sharedpreferences;
        b = a1;
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

    public final AccessToken a()
    {
        Object obj1 = null;
        Object obj = null;
        if (a.contains("com.facebook.AccessTokenManager.CachedAccessToken"))
        {
            obj = c();
        } else
        if (g.c())
        {
            obj = b().a();
            AccessToken accesstoken = obj1;
            if (obj != null)
            {
                accesstoken = obj1;
                if (k.a(((android.os.Bundle) (obj))))
                {
                    accesstoken = AccessToken.a(((android.os.Bundle) (obj)));
                }
            }
            obj = accesstoken;
            if (accesstoken != null)
            {
                a(accesstoken);
                b().b();
                return accesstoken;
            }
        }
        return ((AccessToken) (obj));
    }

    public final void a(AccessToken accesstoken)
    {
        n.a(accesstoken, "accessToken");
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("version", 1);
            jsonobject.put("token", accesstoken.d);
            jsonobject.put("expires_at", accesstoken.a.getTime());
            jsonobject.put("permissions", new JSONArray(accesstoken.b));
            jsonobject.put("declined_permissions", new JSONArray(accesstoken.c));
            jsonobject.put("last_refresh", accesstoken.f.getTime());
            jsonobject.put("source", accesstoken.e.name());
            jsonobject.put("application_id", accesstoken.g);
            jsonobject.put("user_id", accesstoken.h);
            a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", jsonobject.toString()).apply();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AccessToken accesstoken)
        {
            return;
        }
    }

    final k b()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new k(g.g());
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
}
