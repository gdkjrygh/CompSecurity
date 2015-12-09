// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import java.util.Iterator;
import java.util.Set;
import oauth.signpost.a;
import oauth.signpost.http.HttpParameters;

// Referenced classes of package oauth.signpost.signature:
//            SigningStrategy

public class AuthorizationHeaderSigningStrategy
    implements SigningStrategy
{

    private static final long serialVersionUID = 1L;

    public AuthorizationHeaderSigningStrategy()
    {
    }

    public String a(String s, oauth.signpost.http.a a1, HttpParameters httpparameters)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("OAuth ");
        if (httpparameters.containsKey("realm"))
        {
            stringbuilder.append(httpparameters.a("realm"));
            stringbuilder.append(", ");
        }
        httpparameters = httpparameters.a();
        httpparameters.a("oauth_signature", s, true);
        s = httpparameters.keySet().iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            stringbuilder.append(httpparameters.a((String)s.next()));
            if (s.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        s = stringbuilder.toString();
        oauth.signpost.a.c("Auth Header", s);
        a1.a("Authorization", s);
        return s;
    }
}
