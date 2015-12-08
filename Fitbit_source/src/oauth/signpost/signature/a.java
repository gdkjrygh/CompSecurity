// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Set;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;

public class a
{

    private oauth.signpost.http.a a;
    private HttpParameters b;

    public a(oauth.signpost.http.a a1, HttpParameters httpparameters)
    {
        a = a1;
        b = httpparameters;
    }

    public String a()
        throws OAuthMessageSignerException
    {
        String s;
        try
        {
            s = b();
            String s1 = c();
            s = (new StringBuilder()).append(a.d()).append('&').append(oauth.signpost.a.a(s)).append('&').append(oauth.signpost.a.a(s1)).toString();
        }
        catch (Exception exception)
        {
            throw new OAuthMessageSignerException(exception);
        }
        return s;
    }

    public String b()
        throws URISyntaxException
    {
label0:
        {
            Object obj = new URI(a.e());
            String s2 = ((URI) (obj)).getScheme().toLowerCase();
            String s1 = ((URI) (obj)).getAuthority().toLowerCase();
            String s;
            int i;
            if (s2.equals("http") && ((URI) (obj)).getPort() == 80 || s2.equals("https") && ((URI) (obj)).getPort() == 443)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s = s1;
            if (i != 0)
            {
                i = s1.lastIndexOf(":");
                s = s1;
                if (i >= 0)
                {
                    s = s1.substring(0, i);
                }
            }
            obj = ((URI) (obj)).getRawPath();
            if (obj != null)
            {
                s1 = ((String) (obj));
                if (((String) (obj)).length() > 0)
                {
                    break label0;
                }
            }
            s1 = "/";
        }
        return (new StringBuilder()).append(s2).append("://").append(s).append(s1).toString();
    }

    public String c()
        throws IOException
    {
        if (b == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = b.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            if (!"oauth_signature".equals(s) && !"realm".equals(s))
            {
                if (i > 0)
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append(b.b(s, false));
            }
            i++;
        }
        return stringbuilder.toString();
    }
}
