// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.sony.snei.np.android.common.oauth.exception.OAuthResponseParserException;
import java.util.Set;

public final class dcd
    implements dby
{

    private final Uri a;

    public dcd(Uri uri)
    {
        a = uri;
    }

    private String a(String s, String s1)
    {
        String s2 = s1;
        if (a(s))
        {
            s = a.getQueryParameter(s);
            s2 = s1;
            if (!TextUtils.isEmpty(s))
            {
                s2 = s;
            }
        }
        return s2;
    }

    private boolean a(String s)
    {
        return a.getQueryParameterNames().contains(s);
    }

    private String c(String s)
    {
        if (a(s))
        {
            s = a.getQueryParameter(s);
            if (!TextUtils.isEmpty(s))
            {
                return s;
            }
        }
        throw new OAuthResponseParserException();
    }

    public final boolean a()
    {
        return a.getQueryParameterNames().contains("error");
    }

    public final String b(String s)
    {
        return a("id_token", s);
    }

    public final boolean b()
    {
        return a.getQueryParameterNames().contains("error_code");
    }

    public final int c()
    {
        return Integer.valueOf(a.getQueryParameter("error_code")).intValue();
    }

    public final String d()
    {
        return c("error");
    }

    public final String e()
    {
        return a("error_description", null);
    }

    public final String f()
    {
        return c("code");
    }

    public final String g()
    {
        return c("access_token");
    }

    public final String h()
    {
        return c("token_type");
    }

    public final String i()
    {
        return c("scope");
    }

    public final int j()
    {
        int l;
        try
        {
            l = Integer.valueOf(c("expires_in")).intValue();
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new OAuthResponseParserException();
        }
        return l;
    }

    public final String k()
    {
        return a("refresh_token", null);
    }
}
