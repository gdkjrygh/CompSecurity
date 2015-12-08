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
import oauth.signpost.http.HttpRequest;
import oauth.signpost.http.HttpResponse;

// Referenced classes of package oauth.signpost:
//            OAuthProvider, OAuthConsumer, OAuth, OAuthProviderListener

public abstract class AbstractOAuthProvider
    implements OAuthProvider
{

    private static final long serialVersionUID = 1L;
    private String accessTokenEndpointUrl;
    private String authorizationWebsiteUrl;
    private Map defaultHeaders;
    private boolean isOAuth10a;
    private transient OAuthProviderListener listener;
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

    protected void closeConnection(HttpRequest httprequest, HttpResponse httpresponse)
        throws Exception
    {
    }

    protected abstract HttpRequest createRequest(String s)
        throws Exception;

    public String getAccessTokenEndpointUrl()
    {
        return accessTokenEndpointUrl;
    }

    public String getAuthorizationWebsiteUrl()
    {
        return authorizationWebsiteUrl;
    }

    public Map getRequestHeaders()
    {
        return defaultHeaders;
    }

    public String getRequestTokenEndpointUrl()
    {
        return requestTokenEndpointUrl;
    }

    protected String getResponseParameter(String s)
    {
        return responseParameters.getFirst(s);
    }

    public HttpParameters getResponseParameters()
    {
        return responseParameters;
    }

    protected void handleUnexpectedResponse(int i, HttpResponse httpresponse)
        throws Exception
    {
        if (httpresponse == null)
        {
            return;
        }
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(httpresponse.getContent()));
        StringBuilder stringbuilder = new StringBuilder();
        for (String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
        {
            stringbuilder.append(s);
        }

        switch (i)
        {
        default:
            throw new OAuthCommunicationException((new StringBuilder()).append("Service provider responded in error: ").append(i).append(" (").append(httpresponse.getReasonPhrase()).append(")").toString(), stringbuilder.toString());

        case 401: 
            throw new OAuthNotAuthorizedException(stringbuilder.toString());
        }
    }

    public boolean isOAuth10a()
    {
        return isOAuth10a;
    }

    public void removeListener(OAuthProviderListener oauthproviderlistener)
    {
        listener = null;
    }

    public void retrieveAccessToken(OAuthConsumer oauthconsumer, String s)
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        if (oauthconsumer.getToken() == null || oauthconsumer.getTokenSecret() == null)
        {
            throw new OAuthExpectationFailedException("Authorized request token or token secret not set. Did you retrieve an authorized request token before?");
        }
        if (isOAuth10a && s != null)
        {
            retrieveToken(oauthconsumer, accessTokenEndpointUrl, new String[] {
                "oauth_verifier", s
            });
            return;
        } else
        {
            retrieveToken(oauthconsumer, accessTokenEndpointUrl, new String[0]);
            return;
        }
    }

    public String retrieveRequestToken(OAuthConsumer oauthconsumer, String s)
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        oauthconsumer.setTokenWithSecret(null, null);
        retrieveToken(oauthconsumer, requestTokenEndpointUrl, new String[] {
            "oauth_callback", s
        });
        String s1 = responseParameters.getFirst("oauth_callback_confirmed");
        responseParameters.remove("oauth_callback_confirmed");
        isOAuth10a = Boolean.TRUE.toString().equals(s1);
        if (isOAuth10a)
        {
            return OAuth.addQueryParameters(authorizationWebsiteUrl, new String[] {
                "oauth_token", oauthconsumer.getToken()
            });
        } else
        {
            return OAuth.addQueryParameters(authorizationWebsiteUrl, new String[] {
                "oauth_token", oauthconsumer.getToken(), "oauth_callback", s
            });
        }
    }

    protected transient void retrieveToken(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthCommunicationException, OAuthNotAuthorizedException, OAuthExpectationFailedException
    {
        String s1;
        HttpResponse httpresponse;
        String s2;
        String as1[];
        String s3;
        String as2[];
        String s4;
        String as3[];
        HttpParameters httpparameters;
        String s5;
        String s6;
        Object obj;
        Map map;
        map = getRequestHeaders();
        if (oauthconsumer.getConsumerKey() == null || oauthconsumer.getConsumerSecret() == null)
        {
            throw new OAuthExpectationFailedException("Consumer key or secret not set");
        }
        s1 = null;
        s3 = null;
        s4 = null;
        s2 = null;
        s5 = null;
        s6 = null;
        obj = null;
        httpparameters = null;
        as1 = httpparameters;
        httpresponse = s5;
        as2 = s6;
        as3 = obj;
        s = createRequest(s);
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        Iterator iterator = map.keySet().iterator();
_L2:
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        String s7 = (String)iterator.next();
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        s.setHeader(s7, (String)map.get(s7));
        if (true) goto _L2; else goto _L1
        oauthconsumer;
        s1 = s2;
        httpresponse = as1;
        throw oauthconsumer;
        oauthconsumer;
        HttpParameters httpparameters1;
        int i;
        boolean flag;
        try
        {
            closeConnection(s1, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (OAuthConsumer oauthconsumer)
        {
            throw new OAuthCommunicationException(oauthconsumer);
        }
        throw oauthconsumer;
_L1:
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        httpparameters1 = new HttpParameters();
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        httpparameters1.putAll(as, true);
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        oauthconsumer.setAdditionalParameters(httpparameters1);
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_458;
        }
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        listener.prepareRequest(s);
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        oauthconsumer.sign(s);
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_567;
        }
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        listener.prepareSubmission(s);
        s2 = s;
        as1 = httpparameters;
        s1 = s;
        httpresponse = s5;
        s3 = s;
        as2 = s6;
        s4 = s;
        as3 = obj;
        as = sendRequest(s);
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        i = as.getStatusCode();
        flag = false;
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_704;
        }
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        flag = listener.onResponseReceived(s, as);
        if (flag)
        {
            try
            {
                closeConnection(s, as);
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
            break MISSING_BLOCK_LABEL_765;
        }
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        handleUnexpectedResponse(i, as);
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        httpparameters = OAuth.decodeForm(as.getContent());
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        s5 = httpparameters.getFirst("oauth_token");
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        s6 = httpparameters.getFirst("oauth_token_secret");
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        httpparameters.remove("oauth_token");
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        httpparameters.remove("oauth_token_secret");
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        setResponseParameters(httpparameters);
        if (s5 != null && s6 != null)
        {
            break MISSING_BLOCK_LABEL_1018;
        }
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        throw new OAuthExpectationFailedException("Request token or token secret not set in server reply. The service provider you use is probably buggy.");
        oauthconsumer;
        s1 = s3;
        httpresponse = as2;
        throw oauthconsumer;
        s2 = s;
        as1 = as;
        s1 = s;
        httpresponse = as;
        s3 = s;
        as2 = as;
        s4 = s;
        as3 = as;
        oauthconsumer.setTokenWithSecret(s5, s6);
        try
        {
            closeConnection(s, as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OAuthConsumer oauthconsumer)
        {
            throw new OAuthCommunicationException(oauthconsumer);
        }
        oauthconsumer;
        s1 = s4;
        httpresponse = as3;
        throw new OAuthCommunicationException(oauthconsumer);
    }

    protected abstract HttpResponse sendRequest(HttpRequest httprequest)
        throws Exception;

    public void setListener(OAuthProviderListener oauthproviderlistener)
    {
        listener = oauthproviderlistener;
    }

    public void setOAuth10a(boolean flag)
    {
        isOAuth10a = flag;
    }

    public void setRequestHeader(String s, String s1)
    {
        defaultHeaders.put(s, s1);
    }

    public void setResponseParameters(HttpParameters httpparameters)
    {
        responseParameters = httpparameters;
    }
}
