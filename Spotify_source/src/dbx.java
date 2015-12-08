// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.sony.snei.np.android.common.oauth.exception.OAuthResponseParserException;
import org.json.JSONException;
import org.json.JSONObject;

public final class dbx
    implements dby
{

    private final JSONObject a;

    public dbx(String s)
    {
        try
        {
            a = new JSONObject(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OAuthResponseParserException(s);
        }
    }

    private boolean c(String s)
    {
        return a.has(s);
    }

    public final Object a(String s)
    {
        try
        {
            s = ((String) (a.get(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OAuthResponseParserException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OAuthResponseParserException(s);
        }
        return s;
    }

    public final Object a(String s, Object obj)
    {
        Object obj1 = obj;
        try
        {
            if (!a.isNull(s))
            {
                obj1 = a.opt(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return obj;
        }
        return obj1;
    }

    public final boolean a()
    {
        return c("error");
    }

    public final String b(String s)
    {
        return (String)a("id_token", s);
    }

    public final boolean b()
    {
        return c("error_code");
    }

    public final int c()
    {
        return ((Integer)a("error_code")).intValue();
    }

    public final String d()
    {
        return (String)a("error");
    }

    public final String e()
    {
        return (String)a("error_description", null);
    }

    public final String f()
    {
        return (String)a("code");
    }

    public final String g()
    {
        return (String)a("access_token");
    }

    public final String h()
    {
        return (String)a("token_type");
    }

    public final String i()
    {
        return (String)a("scope");
    }

    public final int j()
    {
        return ((Integer)a("expires_in")).intValue();
    }

    public final String k()
    {
        return (String)a("refresh_token", null);
    }
}
