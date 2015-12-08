// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.a;
import oauth.signpost.http.b;

// Referenced classes of package oauth.signpost:
//            OAuthProvider, OAuthConsumer, a, b

public abstract class AbstractOAuthProvider
    implements OAuthProvider
{

    private static final long serialVersionUID = 1L;
    private transient oauth.signpost.b a;
    private String accessTokenEndpointUrl;
    private String authorizationWebsiteUrl;
    private Map defaultHeaders;
    private boolean isOAuth10a;
    private String requestTokenEndpointUrl;
    private HttpParameters responseParameters;

    public AbstractOAuthProvider(String s, String s1, String s2)
    {
        requestTokenEndpointUrl = s;
        accessTokenEndpointUrl = s1;
        authorizationWebsiteUrl = s2;
        responseParameters = new HttpParameters();
        defaultHeaders = new HashMap();
    }

    public transient String a(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        this;
        JVM INSTR monitorenter ;
        oauthconsumer.a(null, null);
        HttpParameters httpparameters = new HttpParameters();
        httpparameters.a(as, true);
        httpparameters.a("oauth_callback", s, true);
        a(oauthconsumer, requestTokenEndpointUrl, httpparameters);
        as = responseParameters.b("oauth_callback_confirmed");
        responseParameters.d("oauth_callback_confirmed");
        isOAuth10a = Boolean.TRUE.toString().equals(as);
        if (!isOAuth10a) goto _L2; else goto _L1
_L1:
        oauthconsumer = oauth.signpost.a.a(authorizationWebsiteUrl, new String[] {
            "oauth_token", oauthconsumer.a()
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return oauthconsumer;
_L2:
        oauthconsumer = oauth.signpost.a.a(authorizationWebsiteUrl, new String[] {
            "oauth_token", oauthconsumer.a(), "oauth_callback", s
        });
        if (true) goto _L4; else goto _L3
_L3:
        oauthconsumer;
        throw oauthconsumer;
    }

    public HttpParameters a()
    {
        return responseParameters;
    }

    protected abstract a a(String s)
        throws Exception;

    protected abstract b a(a a1)
        throws Exception;

    protected void a(int i, b b1)
        throws Exception
    {
        if (b1 == null)
        {
            return;
        }
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(b1.a()));
        StringBuilder stringbuilder = new StringBuilder();
        for (String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
        {
            stringbuilder.append(s);
        }

        switch (i)
        {
        default:
            throw new OAuthCommunicationException((new StringBuilder()).append("Service provider responded in error: ").append(i).append(" (").append(b1.c()).append(")").toString(), stringbuilder.toString());

        case 401: 
            throw new OAuthNotAuthorizedException(stringbuilder.toString());
        }
    }

    public void a(String s, String s1)
    {
        defaultHeaders.put(s, s1);
    }

    protected void a(OAuthConsumer oauthconsumer, String s, HttpParameters httpparameters)
        throws OAuthMessageSignerException, OAuthCommunicationException, OAuthNotAuthorizedException, OAuthExpectationFailedException
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = f();
        if (oauthconsumer.c() == null || oauthconsumer.d() == null)
        {
            throw new OAuthExpectationFailedException("Consumer key or secret not set");
        }
        s = a(s);
        String s1;
        for (obj = ((Map) (obj1)).keySet().iterator(); ((Iterator) (obj)).hasNext(); s.a(s1, (String)((Map) (obj1)).get(s1)))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

          goto _L1
        obj;
        httpparameters = null;
        oauthconsumer = s;
        s = ((String) (obj));
_L5:
        throw s;
        obj;
        s = oauthconsumer;
        oauthconsumer = ((OAuthConsumer) (obj));
_L2:
        HttpParameters httpparameters1;
        String s2;
        String s3;
        int i;
        boolean flag;
        try
        {
            a(((a) (s)), ((b) (httpparameters)));
        }
        // Misplaced declaration of an exception variable
        catch (OAuthConsumer oauthconsumer)
        {
            throw new OAuthCommunicationException(oauthconsumer);
        }
        throw oauthconsumer;
_L1:
        if (httpparameters == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (!httpparameters.isEmpty())
        {
            oauthconsumer.a(httpparameters);
        }
        if (a != null)
        {
            a.a(s);
        }
        oauthconsumer.a(s);
        if (a != null)
        {
            a.b(s);
        }
        httpparameters = a(((a) (s)));
        obj = httpparameters;
        obj1 = s;
        i = httpparameters.b();
        flag = false;
        obj = httpparameters;
        obj1 = s;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        obj = httpparameters;
        obj1 = s;
        flag = a.a(s, httpparameters);
        if (flag)
        {
            try
            {
                a(((a) (s)), ((b) (httpparameters)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OAuthConsumer oauthconsumer)
            {
                throw new OAuthCommunicationException(oauthconsumer);
            }
        }
        if (i < 300)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        obj = httpparameters;
        obj1 = s;
        a(i, ((b) (httpparameters)));
        obj = httpparameters;
        obj1 = s;
        httpparameters1 = oauth.signpost.a.a(httpparameters.a());
        obj = httpparameters;
        obj1 = s;
        s2 = httpparameters1.b("oauth_token");
        obj = httpparameters;
        obj1 = s;
        s3 = httpparameters1.b("oauth_token_secret");
        obj = httpparameters;
        obj1 = s;
        httpparameters1.d("oauth_token");
        obj = httpparameters;
        obj1 = s;
        httpparameters1.d("oauth_token_secret");
        obj = httpparameters;
        obj1 = s;
        a(httpparameters1);
        if (s2 != null && s3 != null)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        obj = httpparameters;
        obj1 = s;
        throw new OAuthExpectationFailedException("Request token or token secret not set in server reply. The service provider you use is probably buggy.");
        obj = httpparameters;
        obj1 = s;
        oauthconsumer.a(s2, s3);
        try
        {
            a(((a) (s)), ((b) (httpparameters)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OAuthConsumer oauthconsumer)
        {
            throw new OAuthCommunicationException(oauthconsumer);
        }
        oauthconsumer;
        httpparameters = null;
        s = null;
_L4:
        obj = httpparameters;
        obj1 = s;
        throw oauthconsumer;
_L3:
        obj = httpparameters;
        obj1 = s;
        throw new OAuthCommunicationException(oauthconsumer);
        oauthconsumer;
        httpparameters = null;
        s = null;
          goto _L2
        oauthconsumer;
        httpparameters = null;
          goto _L2
        oauthconsumer;
        httpparameters = null;
          goto _L3
        oauthconsumer;
          goto _L3
        oauthconsumer;
        httpparameters = null;
          goto _L4
        oauthconsumer;
          goto _L4
        s;
        httpparameters = null;
        oauthconsumer = ((OAuthConsumer) (obj));
          goto _L5
        obj;
        oauthconsumer = s;
        s = ((String) (obj));
          goto _L5
        oauthconsumer;
        httpparameters = ((HttpParameters) (obj));
        s = ((String) (obj1));
          goto _L2
        oauthconsumer;
        httpparameters = null;
        s = null;
          goto _L3
    }

    public void a(oauth.signpost.b b1)
    {
        a = b1;
    }

    public void a(HttpParameters httpparameters)
    {
        responseParameters = httpparameters;
    }

    protected void a(a a1, b b1)
        throws Exception
    {
    }

    public void a(boolean flag)
    {
        isOAuth10a = flag;
    }

    protected String b(String s)
    {
        return responseParameters.b(s);
    }

    public transient void b(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        this;
        JVM INSTR monitorenter ;
        if (oauthconsumer.a() == null || oauthconsumer.b() == null)
        {
            throw new OAuthExpectationFailedException("Authorized request token or token secret not set. Did you retrieve an authorized request token before?");
        }
        break MISSING_BLOCK_LABEL_35;
        oauthconsumer;
        this;
        JVM INSTR monitorexit ;
        throw oauthconsumer;
        HttpParameters httpparameters;
        httpparameters = new HttpParameters();
        httpparameters.a(as, true);
        if (!isOAuth10a || s == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        httpparameters.a("oauth_verifier", s, true);
        a(oauthconsumer, accessTokenEndpointUrl, httpparameters);
        this;
        JVM INSTR monitorexit ;
    }

    public void b(oauth.signpost.b b1)
    {
        a = null;
    }

    public boolean b()
    {
        return isOAuth10a;
    }

    public String c()
    {
        return requestTokenEndpointUrl;
    }

    public String d()
    {
        return accessTokenEndpointUrl;
    }

    public String e()
    {
        return authorizationWebsiteUrl;
    }

    public Map f()
    {
        return defaultHeaders;
    }
}
