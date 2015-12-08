// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.oauth;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.RequestContext;
import com.googlecode.flickrjandroid.uploader.ImageParameter;
import com.googlecode.flickrjandroid.util.Base64;
import com.googlecode.flickrjandroid.util.UrlUtilities;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.googlecode.flickrjandroid.oauth:
//            OAuth, OAuthException, OAuthTokenParameter, OAuthToken, 
//            a

public class OAuthUtils
{

    public static final String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";
    public static final String ENC = "UTF-8";
    private static final String HMAC_SHA1 = "HmacSHA1";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final String PARAMETER_SEPARATOR = "&";
    public static final String REQUEST_METHOD_GET = "GET";
    public static final String REQUEST_METHOD_POST = "POST";

    public OAuthUtils()
    {
    }

    public static void addBasicOAuthParams(List list)
    {
        addOAuthNonce(list);
        addOAuthTimestamp(list);
        addOAuthSignatureMethod(list);
        addOAuthVersion(list);
    }

    private static void addOAuthNonce(List list)
    {
        list.add(new Parameter("oauth_nonce", Long.toString(System.nanoTime())));
    }

    public static void addOAuthParams(String s, String s1, List list)
    {
        addBasicOAuthParams(list);
        signPost(s, s1, list);
    }

    private static void addOAuthSignatureMethod(List list)
    {
        list.add(new Parameter("oauth_signature_method", "HMAC-SHA1"));
    }

    private static void addOAuthTimestamp(List list)
    {
        list.add(new Parameter("oauth_timestamp", String.valueOf(System.currentTimeMillis() / 1000L)));
    }

    public static void addOAuthToken(List list)
    {
        OAuth oauth = RequestContext.getRequestContext().getOAuth();
        if (oauth == null || oauth.getToken() == null)
        {
            throw new OAuthException("OAuth token not set");
        } else
        {
            list.add(new OAuthTokenParameter(oauth.getToken().getOauthToken()));
            return;
        }
    }

    private static void addOAuthVersion(List list)
    {
        list.add(new Parameter("oauth_version", "1.0"));
    }

    public static String decode(String s, String s1)
    {
        if (s1 == null)
        {
            s1 = "ISO-8859-1";
        }
        try
        {
            return URLDecoder.decode(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
    }

    public static String format(List list, String s)
    {
        s = new StringBuilder();
        Iterator iterator = list.iterator();
        do
        {
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    return s.toString();
                }
                obj = (Parameter)iterator.next();
                list = ((List) (((Parameter) (obj)).getValue()));
            } while (obj instanceof ImageParameter);
            obj = UrlUtilities.encode(((Parameter) (obj)).getName());
            list = String.valueOf(list);
            if (list != null)
            {
                list = UrlUtilities.encode(list);
            } else
            {
                list = "";
            }
            if (s.length() > 0)
            {
                s.append("&");
            }
            s.append(((String) (obj)));
            s.append("=");
            s.append(list);
        } while (true);
    }

    public static String getRequestBaseString(String s, String s1, List list)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(s);
        stringbuffer.append("&");
        stringbuffer.append(UrlUtilities.encode(s1));
        stringbuffer.append("&");
        Collections.sort(list, new a());
        return stringbuffer.append(UrlUtilities.encode(format(list, "UTF-8"))).toString();
    }

    public static String getSignature(String s, String s1, List list, String s2, String s3)
    {
        try
        {
            s = hmacsha1(getRequestBaseString(s, s1.toLowerCase(Locale.US), list), s2, s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new FlickrException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new FlickrException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new FlickrException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new FlickrException(s);
        }
        return s;
    }

    public static String getSignature(String s, List list, String s1, String s2)
    {
        return getSignature("GET", s, list, s1, s2);
    }

    public static boolean hasSigned()
    {
        for (OAuth oauth = RequestContext.getRequestContext().getOAuth(); oauth == null || oauth.getToken() == null;)
        {
            return false;
        }

        return true;
    }

    public static String hmacsha1(String s, String s1, String s2)
    {
        Mac mac = Mac.getInstance("HmacSHA1");
        String s3 = s2;
        if (s2 == null)
        {
            s3 = "";
        }
        mac.init(new SecretKeySpec((new StringBuilder(String.valueOf(s1))).append("&").append(s3).toString().getBytes(), "HmacSHA1"));
        return new String(Base64.encode(mac.doFinal(s.getBytes("UTF-8"))));
    }

    public static void sign(String s, String s1, String s2, List list)
    {
        Object obj = RequestContext.getRequestContext().getOAuth();
        if (obj != null && ((OAuth) (obj)).getToken() != null)
        {
            obj = ((OAuth) (obj)).getToken().getOauthTokenSecret();
        } else
        {
            obj = "";
        }
        list.add(new Parameter("oauth_signature", getSignature(s, s1, list, s2, ((String) (obj)))));
    }

    public static void signGet(String s, String s1, List list)
    {
        sign("GET", s1, s, list);
    }

    public static void signPost(String s, String s1, List list)
    {
        sign("POST", s1, s, list);
    }
}
