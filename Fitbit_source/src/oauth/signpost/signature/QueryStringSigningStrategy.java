// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import java.util.Iterator;
import java.util.Set;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.a;

// Referenced classes of package oauth.signpost.signature:
//            SigningStrategy

public class QueryStringSigningStrategy
    implements SigningStrategy
{

    private static final long serialVersionUID = 1L;

    public QueryStringSigningStrategy()
    {
    }

    public String a(String s, a a1, HttpParameters httpparameters)
    {
        httpparameters = httpparameters.a();
        httpparameters.a("oauth_signature", s, true);
        s = httpparameters.keySet().iterator();
        Object obj = (String)s.next();
        obj = new StringBuilder(oauth.signpost.a.a(a1.e(), httpparameters.c(obj)));
        for (; s.hasNext(); ((StringBuilder) (obj)).append(httpparameters.c((String)s.next())))
        {
            ((StringBuilder) (obj)).append("&");
        }

        s = ((StringBuilder) (obj)).toString();
        a1.b(s);
        return s;
    }
}
