// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost;

import java.io.IOException;
import java.util.Random;
import oauth.signpost.basic.c;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.a;
import oauth.signpost.signature.AuthorizationHeaderSigningStrategy;
import oauth.signpost.signature.HmacSha1MessageSigner;
import oauth.signpost.signature.OAuthMessageSigner;
import oauth.signpost.signature.QueryStringSigningStrategy;
import oauth.signpost.signature.SigningStrategy;

// Referenced classes of package oauth.signpost:
//            OAuthConsumer, a

public abstract class AbstractOAuthConsumer
    implements OAuthConsumer
{

    private static final long serialVersionUID = 1L;
    private HttpParameters additionalParameters;
    private String consumerKey;
    private String consumerSecret;
    private OAuthMessageSigner messageSigner;
    private final Random random = new Random(System.nanoTime());
    private HttpParameters requestParameters;
    private boolean sendEmptyTokens;
    private SigningStrategy signingStrategy;
    private String token;

    public AbstractOAuthConsumer(String s, String s1)
    {
        consumerKey = s;
        consumerSecret = s1;
        a(new HmacSha1MessageSigner());
        a(new AuthorizationHeaderSigningStrategy());
    }

    public String a()
    {
        return token;
    }

    public String a(String s)
        throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        this;
        JVM INSTR monitorenter ;
        s = new c(s);
        SigningStrategy signingstrategy = signingStrategy;
        signingStrategy = new QueryStringSigningStrategy();
        a(((a) (s)));
        signingStrategy = signingstrategy;
        s = s.e();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    protected abstract a a(Object obj);

    public a a(a a1)
        throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        this;
        JVM INSTR monitorenter ;
        if (consumerKey == null)
        {
            throw new OAuthExpectationFailedException("consumer key not set");
        }
        break MISSING_BLOCK_LABEL_24;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        if (consumerSecret == null)
        {
            throw new OAuthExpectationFailedException("consumer secret not set");
        }
        requestParameters = new HttpParameters();
        if (additionalParameters != null)
        {
            requestParameters.a(additionalParameters, false);
        }
        a(a1, requestParameters);
        c(a1, requestParameters);
        b(a1, requestParameters);
        b(requestParameters);
        requestParameters.d("oauth_signature");
        String s = messageSigner.a(a1, requestParameters);
        oauth.signpost.a.c("signature", s);
        signingStrategy.a(s, a1, requestParameters);
        oauth.signpost.a.c("Request URL", a1.e());
        this;
        JVM INSTR monitorexit ;
        return a1;
        a1;
        throw new OAuthCommunicationException(a1);
    }

    public void a(String s, String s1)
    {
        token = s;
        messageSigner.b(s1);
    }

    public void a(HttpParameters httpparameters)
    {
        additionalParameters = httpparameters;
    }

    protected void a(a a1, HttpParameters httpparameters)
    {
        httpparameters.a(oauth.signpost.a.e(a1.a("Authorization")), false);
    }

    public void a(OAuthMessageSigner oauthmessagesigner)
    {
        messageSigner = oauthmessagesigner;
        oauthmessagesigner.a(consumerSecret);
    }

    public void a(SigningStrategy signingstrategy)
    {
        signingStrategy = signingstrategy;
    }

    public void a(boolean flag)
    {
        sendEmptyTokens = flag;
    }

    public String b()
    {
        return messageSigner.c();
    }

    public a b(Object obj)
        throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        this;
        JVM INSTR monitorenter ;
        obj = a(a(obj));
        this;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        obj;
        throw obj;
    }

    protected void b(HttpParameters httpparameters)
    {
        if (!httpparameters.containsKey("oauth_consumer_key"))
        {
            httpparameters.a("oauth_consumer_key", consumerKey, true);
        }
        if (!httpparameters.containsKey("oauth_signature_method"))
        {
            httpparameters.a("oauth_signature_method", messageSigner.a(), true);
        }
        if (!httpparameters.containsKey("oauth_timestamp"))
        {
            httpparameters.a("oauth_timestamp", f(), true);
        }
        if (!httpparameters.containsKey("oauth_nonce"))
        {
            httpparameters.a("oauth_nonce", g(), true);
        }
        if (!httpparameters.containsKey("oauth_version"))
        {
            httpparameters.a("oauth_version", "1.0", true);
        }
        if (!httpparameters.containsKey("oauth_token") && (token != null && !token.equals("") || sendEmptyTokens))
        {
            httpparameters.a("oauth_token", token, true);
        }
    }

    protected void b(a a1, HttpParameters httpparameters)
        throws IOException
    {
        String s = a1.b();
        if (s != null && s.startsWith("application/x-www-form-urlencoded"))
        {
            httpparameters.a(oauth.signpost.a.a(a1.c()), true);
        }
    }

    public String c()
    {
        return consumerKey;
    }

    protected void c(a a1, HttpParameters httpparameters)
    {
        a1 = a1.e();
        int i = a1.indexOf('?');
        if (i >= 0)
        {
            httpparameters.a(oauth.signpost.a.c(a1.substring(i + 1)), true);
        }
    }

    public String d()
    {
        return consumerSecret;
    }

    public HttpParameters e()
    {
        return requestParameters;
    }

    protected String f()
    {
        return Long.toString(System.currentTimeMillis() / 1000L);
    }

    protected String g()
    {
        return Long.toString(random.nextLong());
    }
}
