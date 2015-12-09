// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import oauth.signpost.AbstractOAuthProvider;
import oauth.signpost.http.a;
import oauth.signpost.http.b;

// Referenced classes of package oauth.signpost.basic:
//            a, b

public class DefaultOAuthProvider extends AbstractOAuthProvider
{

    private static final long serialVersionUID = 1L;

    public DefaultOAuthProvider(String s, String s1, String s2)
    {
        super(s, s1, s2);
    }

    protected a a(String s)
        throws MalformedURLException, IOException
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setRequestMethod("POST");
        s.setAllowUserInteraction(false);
        s.setRequestProperty("Content-Length", "0");
        return new oauth.signpost.basic.a(s);
    }

    protected b a(a a1)
        throws IOException
    {
        a1 = (HttpURLConnection)a1.f();
        a1.connect();
        return new oauth.signpost.basic.b(a1);
    }

    protected void a(a a1, b b1)
    {
        a1 = (HttpURLConnection)a1.f();
        if (a1 != null)
        {
            a1.disconnect();
        }
    }
}
