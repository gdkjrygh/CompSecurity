// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import com.sony.snei.np.android.common.oauth.exception.OAuthResponseParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dcc
    implements dby
{

    private final Bundle a = new Bundle();

    public dcc(Uri uri)
    {
        a.putAll(d(uri.getFragment()));
    }

    private String a(String s, String s1)
    {
        return a.getString(s, s1);
    }

    private boolean a(String s)
    {
        return a.containsKey(s);
    }

    private String c(String s)
    {
        if (a.containsKey(s))
        {
            return a.getString(s);
        } else
        {
            throw new OAuthResponseParserException(s);
        }
    }

    private static Bundle d(String s)
    {
        Bundle bundle = new Bundle();
        s = s.split("&");
        Pattern pattern = Pattern.compile("^(\\w+)=(.*)$");
        int i1 = s.length;
        for (int l = 0; l < i1; l++)
        {
            Matcher matcher = pattern.matcher(s[l]);
            if (matcher.find())
            {
                bundle.putString(matcher.group(1), matcher.group(2));
            }
        }

        return bundle;
    }

    public final boolean a()
    {
        return a("error");
    }

    public final String b(String s)
    {
        return a("id_token", s);
    }

    public final boolean b()
    {
        return a("error_code");
    }

    public final int c()
    {
        int l;
        try
        {
            l = Integer.parseInt(c("error_code"));
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new OAuthResponseParserException(numberformatexception);
        }
        return l;
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
            l = Integer.parseInt(c("expires_in"));
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new OAuthResponseParserException(numberformatexception);
        }
        return l;
    }

    public final String k()
    {
        return a("refresh_token", null);
    }
}
