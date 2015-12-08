// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.util.escape.PercentEscaper;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.google.api.client.auth.oauth:
//            OAuthSigner

public final class OAuthParameters
    implements HttpExecuteInterceptor, HttpRequestInitializer
{

    private static final PercentEscaper ESCAPER = new PercentEscaper("-_.~", false);
    private static final SecureRandom RANDOM = new SecureRandom();
    public String callback;
    public String consumerKey;
    public String nonce;
    public String realm;
    public String signature;
    public String signatureMethod;
    public OAuthSigner signer;
    public String timestamp;
    public String token;
    public String verifier;
    public String version;

    public OAuthParameters()
    {
    }

    private void appendParameter(StringBuilder stringbuilder, String s, String s1)
    {
        if (s1 != null)
        {
            stringbuilder.append(' ').append(escape(s)).append("=\"").append(escape(s1)).append("\",");
        }
    }

    public static String escape(String s)
    {
        return ESCAPER.escape(s);
    }

    private void putParameter(TreeMap treemap, String s, Object obj)
    {
        String s1 = escape(s);
        if (obj == null)
        {
            s = null;
        } else
        {
            s = escape(obj.toString());
        }
        treemap.put(s1, s);
    }

    private void putParameterIfValueNotNull(TreeMap treemap, String s, String s1)
    {
        if (s1 != null)
        {
            putParameter(treemap, s, s1);
        }
    }

    public void computeNonce()
    {
        nonce = Long.toHexString(Math.abs(RANDOM.nextLong()));
    }

    public void computeSignature(String s, GenericUrl genericurl)
        throws GeneralSecurityException
    {
        OAuthSigner oauthsigner;
        Object obj;
        Object obj1;
        int i;
label0:
        {
            oauthsigner = signer;
            obj1 = oauthsigner.getSignatureMethod();
            signatureMethod = ((String) (obj1));
            obj = new TreeMap();
            putParameterIfValueNotNull(((TreeMap) (obj)), "oauth_callback", callback);
            putParameterIfValueNotNull(((TreeMap) (obj)), "oauth_consumer_key", consumerKey);
            putParameterIfValueNotNull(((TreeMap) (obj)), "oauth_nonce", nonce);
            putParameterIfValueNotNull(((TreeMap) (obj)), "oauth_signature_method", ((String) (obj1)));
            putParameterIfValueNotNull(((TreeMap) (obj)), "oauth_timestamp", timestamp);
            putParameterIfValueNotNull(((TreeMap) (obj)), "oauth_token", token);
            putParameterIfValueNotNull(((TreeMap) (obj)), "oauth_verifier", verifier);
            putParameterIfValueNotNull(((TreeMap) (obj)), "oauth_version", version);
            obj1 = genericurl.entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                Object obj4 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                Object obj2 = ((java.util.Map.Entry) (obj4)).getValue();
                if (obj2 != null)
                {
                    obj4 = (String)((java.util.Map.Entry) (obj4)).getKey();
                    if (obj2 instanceof Collection)
                    {
                        obj2 = ((Collection)obj2).iterator();
                        while (((Iterator) (obj2)).hasNext()) 
                        {
                            putParameter(((TreeMap) (obj)), ((String) (obj4)), ((Iterator) (obj2)).next());
                        }
                    } else
                    {
                        putParameter(((TreeMap) (obj)), ((String) (obj4)), obj2);
                    }
                }
            } while (true);
            obj1 = new StringBuilder();
            boolean flag = true;
            obj = ((TreeMap) (obj)).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                boolean flag1;
                if (flag)
                {
                    flag1 = false;
                } else
                {
                    ((StringBuilder) (obj1)).append('&');
                    flag1 = flag;
                }
                ((StringBuilder) (obj1)).append((String)((java.util.Map.Entry) (obj3)).getKey());
                obj3 = (String)((java.util.Map.Entry) (obj3)).getValue();
                flag = flag1;
                if (obj3 != null)
                {
                    ((StringBuilder) (obj1)).append('=').append(((String) (obj3)));
                    flag = flag1;
                }
            } while (true);
            obj = ((StringBuilder) (obj1)).toString();
            obj1 = new GenericUrl();
            String s1 = genericurl.getScheme();
            ((GenericUrl) (obj1)).setScheme(s1);
            ((GenericUrl) (obj1)).setHost(genericurl.getHost());
            ((GenericUrl) (obj1)).setPathParts(genericurl.getPathParts());
            int j = genericurl.getPort();
            if (!"http".equals(s1) || j != 80)
            {
                i = j;
                if (!"https".equals(s1))
                {
                    break label0;
                }
                i = j;
                if (j != 443)
                {
                    break label0;
                }
            }
            i = -1;
        }
        ((GenericUrl) (obj1)).setPort(i);
        genericurl = ((GenericUrl) (obj1)).build();
        obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append(escape(s)).append('&');
        ((StringBuilder) (obj1)).append(escape(genericurl)).append('&');
        ((StringBuilder) (obj1)).append(escape(((String) (obj))));
        signature = oauthsigner.computeSignature(((StringBuilder) (obj1)).toString());
    }

    public void computeTimestamp()
    {
        timestamp = Long.toString(System.currentTimeMillis() / 1000L);
    }

    public String getAuthorizationHeader()
    {
        StringBuilder stringbuilder = new StringBuilder("OAuth");
        appendParameter(stringbuilder, "realm", realm);
        appendParameter(stringbuilder, "oauth_callback", callback);
        appendParameter(stringbuilder, "oauth_consumer_key", consumerKey);
        appendParameter(stringbuilder, "oauth_nonce", nonce);
        appendParameter(stringbuilder, "oauth_signature", signature);
        appendParameter(stringbuilder, "oauth_signature_method", signatureMethod);
        appendParameter(stringbuilder, "oauth_timestamp", timestamp);
        appendParameter(stringbuilder, "oauth_token", token);
        appendParameter(stringbuilder, "oauth_verifier", verifier);
        appendParameter(stringbuilder, "oauth_version", version);
        return stringbuilder.substring(0, stringbuilder.length() - 1);
    }

    public void initialize(HttpRequest httprequest)
        throws IOException
    {
        httprequest.setInterceptor(this);
    }

    public void intercept(HttpRequest httprequest)
        throws IOException
    {
        computeNonce();
        computeTimestamp();
        try
        {
            computeSignature(httprequest.getRequestMethod(), httprequest.getUrl());
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            IOException ioexception = new IOException();
            ioexception.initCause(httprequest);
            throw ioexception;
        }
        httprequest.getHeaders().setAuthorization(getAuthorizationHeader());
    }

}
