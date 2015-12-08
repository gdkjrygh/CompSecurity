// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.BASE64Encoder;
import twitter4j.internal.http.HttpClientWrapper;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.http.HttpRequest;
import twitter4j.internal.http.RequestMethod;
import twitter4j.internal.logging.Logger;
import twitter4j.internal.util.z_T4JInternalStringUtil;

// Referenced classes of package twitter4j.auth:
//            Authorization, OAuthSupport, AccessToken, OAuthToken, 
//            RequestToken

public class OAuthAuthorization
    implements Serializable, Authorization, OAuthSupport
{

    private static final String HMAC_SHA1 = "HmacSHA1";
    private static final HttpParameter OAUTH_SIGNATURE_METHOD = new HttpParameter("oauth_signature_method", "HMAC-SHA1");
    private static Random RAND = new Random();
    private static transient HttpClientWrapper http;
    private static final Logger logger = Logger.getLogger(twitter4j/auth/OAuthAuthorization);
    private static final long serialVersionUID = 0xc3603b1500a84fe6L;
    private final Configuration conf;
    private String consumerKey;
    private String consumerSecret;
    private OAuthToken oauthToken;
    private String realm;

    public OAuthAuthorization(Configuration configuration)
    {
        consumerKey = "";
        realm = null;
        oauthToken = null;
        conf = configuration;
        http = new HttpClientWrapper(configuration);
        setOAuthConsumer(configuration.getOAuthConsumerKey(), configuration.getOAuthConsumerSecret());
        if (configuration.getOAuthAccessToken() != null && configuration.getOAuthAccessTokenSecret() != null)
        {
            setOAuthAccessToken(new AccessToken(configuration.getOAuthAccessToken(), configuration.getOAuthAccessTokenSecret()));
        }
    }

    static String constructRequestURL(String s)
    {
        String s1;
        String s2;
        int i;
        int j;
        i = s.indexOf("?");
        s1 = s;
        if (-1 != i)
        {
            s1 = s.substring(0, i);
        }
        i = s1.indexOf("/", 8);
        s2 = s1.substring(0, i).toLowerCase();
        j = s2.indexOf(":", 8);
        s = s2;
        if (-1 == j) goto _L2; else goto _L1
_L1:
        if (!s2.startsWith("http://") || !s2.endsWith(":80")) goto _L4; else goto _L3
_L3:
        s = s2.substring(0, j);
_L2:
        return (new StringBuilder()).append(s).append(s1.substring(i)).toString();
_L4:
        s = s2;
        if (s2.startsWith("https://"))
        {
            s = s2;
            if (s2.endsWith(":443"))
            {
                s = s2.substring(0, j);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static String encodeParameters(List list)
    {
        return encodeParameters(list, "&", false);
    }

    public static String encodeParameters(List list, String s, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            HttpParameter httpparameter = (HttpParameter)list.next();
            if (!httpparameter.isFile())
            {
                if (stringbuilder.length() != 0)
                {
                    if (flag)
                    {
                        stringbuilder.append("\"");
                    }
                    stringbuilder.append(s);
                }
                stringbuilder.append(HttpParameter.encode(httpparameter.getName())).append("=");
                if (flag)
                {
                    stringbuilder.append("\"");
                }
                stringbuilder.append(HttpParameter.encode(httpparameter.getValue()));
            }
        } while (true);
        if (stringbuilder.length() != 0 && flag)
        {
            stringbuilder.append("\"");
        }
        return stringbuilder.toString();
    }

    private void ensureTokenIsAvailable()
    {
        if (oauthToken == null)
        {
            throw new IllegalStateException("No Token available.");
        } else
        {
            return;
        }
    }

    static String normalizeAuthorizationHeaders(List list)
    {
        Collections.sort(list);
        return encodeParameters(list);
    }

    static String normalizeRequestParameters(List list)
    {
        Collections.sort(list);
        return encodeParameters(list);
    }

    static String normalizeRequestParameters(HttpParameter ahttpparameter[])
    {
        return normalizeRequestParameters(toParamList(ahttpparameter));
    }

    private void parseGetParameters(String s, List list)
    {
        int i;
        int j;
        i = 0;
        j = s.indexOf("?");
        if (-1 == j) goto _L2; else goto _L1
_L1:
        s = z_T4JInternalStringUtil.split(s.substring(j + 1), "&");
        j = s.length;
_L8:
        if (i >= j) goto _L2; else goto _L3
_L3:
        String as[] = z_T4JInternalStringUtil.split(s[i], "=");
        if (as.length != 2) goto _L5; else goto _L4
_L4:
        list.add(new HttpParameter(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8")));
          goto _L6
_L5:
        list.add(new HttpParameter(URLDecoder.decode(as[0], "UTF-8"), ""));
          goto _L6
        s;
_L2:
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static List toParamList(HttpParameter ahttpparameter[])
    {
        ArrayList arraylist = new ArrayList(ahttpparameter.length);
        arraylist.addAll(Arrays.asList(ahttpparameter));
        return arraylist;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof OAuthSupport))
            {
                return false;
            }
            obj = (OAuthAuthorization)obj;
            if (consumerKey == null ? ((OAuthAuthorization) (obj)).consumerKey != null : !consumerKey.equals(((OAuthAuthorization) (obj)).consumerKey))
            {
                return false;
            }
            if (consumerSecret == null ? ((OAuthAuthorization) (obj)).consumerSecret != null : !consumerSecret.equals(((OAuthAuthorization) (obj)).consumerSecret))
            {
                return false;
            }
            if (oauthToken == null ? ((OAuthAuthorization) (obj)).oauthToken != null : !oauthToken.equals(((OAuthAuthorization) (obj)).oauthToken))
            {
                return false;
            }
        }
        return true;
    }

    String generateAuthorizationHeader(String s, String s1, HttpParameter ahttpparameter[], String s2, String s3, OAuthToken oauthtoken)
    {
        HttpParameter ahttpparameter1[] = ahttpparameter;
        if (ahttpparameter == null)
        {
            ahttpparameter1 = new HttpParameter[0];
        }
        ahttpparameter = new ArrayList(5);
        ahttpparameter.add(new HttpParameter("oauth_consumer_key", consumerKey));
        ahttpparameter.add(OAUTH_SIGNATURE_METHOD);
        ahttpparameter.add(new HttpParameter("oauth_timestamp", s3));
        ahttpparameter.add(new HttpParameter("oauth_nonce", s2));
        ahttpparameter.add(new HttpParameter("oauth_version", "1.0"));
        if (oauthtoken != null)
        {
            ahttpparameter.add(new HttpParameter("oauth_token", oauthtoken.getToken()));
        }
        s2 = new ArrayList(ahttpparameter.size() + ahttpparameter1.length);
        s2.addAll(ahttpparameter);
        if (!HttpParameter.containsFile(ahttpparameter1))
        {
            s2.addAll(toParamList(ahttpparameter1));
        }
        parseGetParameters(s1, s2);
        s = (new StringBuilder(s)).append("&").append(HttpParameter.encode(constructRequestURL(s1))).append("&");
        s.append(HttpParameter.encode(normalizeRequestParameters(s2)));
        s = s.toString();
        logger.debug("OAuth base string: ", s);
        s = generateSignature(s, oauthtoken);
        logger.debug("OAuth signature: ", s);
        ahttpparameter.add(new HttpParameter("oauth_signature", s));
        if (realm != null)
        {
            ahttpparameter.add(new HttpParameter("realm", realm));
        }
        return (new StringBuilder("OAuth ")).append(encodeParameters(ahttpparameter, ",", true)).toString();
    }

    String generateAuthorizationHeader(String s, String s1, HttpParameter ahttpparameter[], OAuthToken oauthtoken)
    {
        long l = System.currentTimeMillis() / 1000L;
        return generateAuthorizationHeader(s, s1, ahttpparameter, String.valueOf((long)RAND.nextInt() + l), String.valueOf(l), oauthtoken);
    }

    public List generateOAuthSignatureHttpParams(String s, String s1)
    {
        long l = System.currentTimeMillis() / 1000L;
        long l1 = RAND.nextInt();
        ArrayList arraylist = new ArrayList(5);
        arraylist.add(new HttpParameter("oauth_consumer_key", consumerKey));
        arraylist.add(OAUTH_SIGNATURE_METHOD);
        arraylist.add(new HttpParameter("oauth_timestamp", l));
        arraylist.add(new HttpParameter("oauth_nonce", l1 + l));
        arraylist.add(new HttpParameter("oauth_version", "1.0"));
        if (oauthToken != null)
        {
            arraylist.add(new HttpParameter("oauth_token", oauthToken.getToken()));
        }
        ArrayList arraylist1 = new ArrayList(arraylist.size());
        arraylist1.addAll(arraylist);
        parseGetParameters(s1, arraylist1);
        s = (new StringBuilder(s)).append("&").append(HttpParameter.encode(constructRequestURL(s1))).append("&");
        s.append(HttpParameter.encode(normalizeRequestParameters(arraylist1)));
        arraylist.add(new HttpParameter("oauth_signature", generateSignature(s.toString(), oauthToken)));
        return arraylist;
    }

    String generateSignature(String s)
    {
        return generateSignature(s, null);
    }

    String generateSignature(String s, OAuthToken oauthtoken)
    {
        SecretKeySpec secretkeyspec;
        SecretKeySpec secretkeyspec1;
        Mac mac;
        try
        {
            mac = Mac.getInstance("HmacSHA1");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            logger.error("Failed initialize \"Message Authentication Code\" (MAC)", s);
            throw new AssertionError(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            logger.error("Failed to get HmacSHA1 \"Message Authentication Code\" (MAC)", s);
            throw new AssertionError(s);
        }
        if (oauthtoken != null) goto _L2; else goto _L1
_L1:
        secretkeyspec = new SecretKeySpec((new StringBuilder()).append(HttpParameter.encode(consumerSecret)).append("&").toString().getBytes(), "HmacSHA1");
_L4:
        mac.init(secretkeyspec);
        s = mac.doFinal(s.getBytes());
        return BASE64Encoder.encode(s);
_L2:
        secretkeyspec1 = oauthtoken.getSecretKeySpec();
        secretkeyspec = secretkeyspec1;
        if (secretkeyspec1 != null) goto _L4; else goto _L3
_L3:
        secretkeyspec = new SecretKeySpec((new StringBuilder()).append(HttpParameter.encode(consumerSecret)).append("&").append(HttpParameter.encode(oauthtoken.getTokenSecret())).toString().getBytes(), "HmacSHA1");
        oauthtoken.setSecretKeySpec(secretkeyspec);
          goto _L4
    }

    public String getAuthorizationHeader(HttpRequest httprequest)
    {
        return generateAuthorizationHeader(httprequest.getMethod().name(), httprequest.getURL(), httprequest.getParameters(), oauthToken);
    }

    public AccessToken getOAuthAccessToken()
    {
        ensureTokenIsAvailable();
        if (oauthToken instanceof AccessToken)
        {
            return (AccessToken)oauthToken;
        } else
        {
            oauthToken = new AccessToken(http.post(conf.getOAuthAccessTokenURL(), this));
            return (AccessToken)oauthToken;
        }
    }

    public AccessToken getOAuthAccessToken(String s)
    {
        ensureTokenIsAvailable();
        oauthToken = new AccessToken(http.post(conf.getOAuthAccessTokenURL(), new HttpParameter[] {
            new HttpParameter("oauth_verifier", s)
        }, this));
        return (AccessToken)oauthToken;
    }

    public AccessToken getOAuthAccessToken(String s, String s1)
    {
        String s2;
        String s3;
        try
        {
            s3 = conf.getOAuthAccessTokenURL();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException("The screen name / password combination seems to be invalid.", s, s.getStatusCode());
        }
        s2 = s3;
        if (s3.indexOf("http://") == 0)
        {
            s2 = (new StringBuilder("https://")).append(s3.substring(7)).toString();
        }
        oauthToken = new AccessToken(http.post(s2, new HttpParameter[] {
            new HttpParameter("x_auth_username", s), new HttpParameter("x_auth_password", s1), new HttpParameter("x_auth_mode", "client_auth")
        }, this));
        s = (AccessToken)oauthToken;
        return s;
    }

    public AccessToken getOAuthAccessToken(RequestToken requesttoken)
    {
        oauthToken = requesttoken;
        return getOAuthAccessToken();
    }

    public AccessToken getOAuthAccessToken(RequestToken requesttoken, String s)
    {
        oauthToken = requesttoken;
        return getOAuthAccessToken(s);
    }

    public RequestToken getOAuthRequestToken()
    {
        return getOAuthRequestToken(null, null);
    }

    public RequestToken getOAuthRequestToken(String s)
    {
        return getOAuthRequestToken(s, null);
    }

    public RequestToken getOAuthRequestToken(String s, String s1)
    {
        if (oauthToken instanceof AccessToken)
        {
            throw new IllegalStateException("Access token already available.");
        }
        ArrayList arraylist = new ArrayList();
        if (s != null)
        {
            arraylist.add(new HttpParameter("oauth_callback", s));
        }
        if (s1 != null)
        {
            arraylist.add(new HttpParameter("x_auth_access_type", s1));
        }
        oauthToken = new RequestToken(http.post(conf.getOAuthRequestTokenURL(), (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()]), this), this);
        return (RequestToken)oauthToken;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (consumerKey != null)
        {
            i = consumerKey.hashCode();
        } else
        {
            i = 0;
        }
        if (consumerSecret != null)
        {
            j = consumerSecret.hashCode();
        } else
        {
            j = 0;
        }
        if (oauthToken != null)
        {
            k = oauthToken.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public boolean isEnabled()
    {
        return oauthToken != null && (oauthToken instanceof AccessToken);
    }

    public void setOAuthAccessToken(AccessToken accesstoken)
    {
        oauthToken = accesstoken;
    }

    public void setOAuthConsumer(String s, String s1)
    {
        if (s == null)
        {
            s = "";
        }
        consumerKey = s;
        if (s1 == null)
        {
            s1 = "";
        }
        consumerSecret = s1;
    }

    public void setOAuthRealm(String s)
    {
        realm = s;
    }

    public String toString()
    {
        return (new StringBuilder("OAuthAuthorization{consumerKey='")).append(consumerKey).append('\'').append(", consumerSecret='******************************************', oauthToken=").append(oauthToken).append('}').toString();
    }

}
