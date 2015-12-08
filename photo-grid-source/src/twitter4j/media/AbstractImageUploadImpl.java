// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.media;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpClientWrapper;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.logging.Logger;

// Referenced classes of package twitter4j.media:
//            ImageUpload

abstract class AbstractImageUploadImpl
    implements ImageUpload
{

    public static final String TWITTER_VERIFY_CREDENTIALS_JSON_V1 = "https://api.twitter.com/1/account/verify_credentials.json";
    public static final String TWITTER_VERIFY_CREDENTIALS_JSON_V1_1 = "https://api.twitter.com/1.1/account/verify_credentials.json";
    public static final String TWITTER_VERIFY_CREDENTIALS_XML_V1 = "https://api.twitter.com/1/account/verify_credentials.xml";
    protected static final Logger logger = Logger.getLogger(twitter4j/media/AbstractImageUploadImpl);
    protected String apiKey;
    protected HttpParameter appendParameter[];
    private HttpClientWrapper client;
    protected Configuration conf;
    protected Map headers;
    protected HttpResponse httpResponse;
    protected HttpParameter image;
    protected HttpParameter message;
    protected OAuthAuthorization oauth;
    protected HttpParameter postParameter[];
    protected String uploadUrl;

    public AbstractImageUploadImpl(Configuration configuration, String s, OAuthAuthorization oauthauthorization)
    {
        this(configuration, oauthauthorization);
        apiKey = s;
    }

    AbstractImageUploadImpl(Configuration configuration, OAuthAuthorization oauthauthorization)
    {
        conf = null;
        apiKey = null;
        oauth = null;
        uploadUrl = null;
        postParameter = null;
        appendParameter = null;
        image = null;
        message = null;
        headers = new HashMap();
        httpResponse = null;
        oauth = oauthauthorization;
        conf = configuration;
        client = new HttpClientWrapper(configuration);
    }

    private String upload()
    {
        if (conf.getMediaProviderParameters() != null)
        {
            Object obj = conf.getMediaProviderParameters().keySet();
            HttpParameter ahttpparameter[] = new HttpParameter[((Set) (obj)).size()];
            obj = ((Set) (obj)).iterator();
            for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
            {
                Object obj1 = ((Iterator) (obj)).next();
                String s1 = conf.getMediaProviderParameters().getProperty((String)obj1);
                ahttpparameter[i] = new HttpParameter((String)obj1, s1);
            }

            appendParameter = ahttpparameter;
        }
        preUpload();
        if (postParameter == null)
        {
            throw new AssertionError("Incomplete implementation. postParameter is not set.");
        }
        if (uploadUrl == null)
        {
            throw new AssertionError("Incomplete implementation. uploadUrl is not set.");
        }
        if (conf.getMediaProviderParameters() != null && appendParameter.length > 0)
        {
            postParameter = appendHttpParameters(postParameter, appendParameter);
        }
        httpResponse = client.post(uploadUrl, postParameter, headers);
        String s = postUpload();
        logger.debug((new StringBuilder("uploaded url [")).append(s).append("]").toString());
        return s;
    }

    protected HttpParameter[] appendHttpParameters(HttpParameter ahttpparameter[], HttpParameter ahttpparameter1[])
    {
        int i = ahttpparameter.length;
        int j = ahttpparameter1.length;
        HttpParameter ahttpparameter2[] = new HttpParameter[i + j];
        System.arraycopy(ahttpparameter, 0, ahttpparameter2, 0, i);
        System.arraycopy(ahttpparameter1, 0, ahttpparameter2, i, j);
        return ahttpparameter2;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AbstractImageUploadImpl)obj;
            if (apiKey == null ? ((AbstractImageUploadImpl) (obj)).apiKey != null : !apiKey.equals(((AbstractImageUploadImpl) (obj)).apiKey))
            {
                return false;
            }
            if (!Arrays.equals(appendParameter, ((AbstractImageUploadImpl) (obj)).appendParameter))
            {
                return false;
            }
            if (client == null ? ((AbstractImageUploadImpl) (obj)).client != null : !client.equals(((AbstractImageUploadImpl) (obj)).client))
            {
                return false;
            }
            if (conf == null ? ((AbstractImageUploadImpl) (obj)).conf != null : !conf.equals(((AbstractImageUploadImpl) (obj)).conf))
            {
                return false;
            }
            if (headers == null ? ((AbstractImageUploadImpl) (obj)).headers != null : !headers.equals(((AbstractImageUploadImpl) (obj)).headers))
            {
                return false;
            }
            if (httpResponse == null ? ((AbstractImageUploadImpl) (obj)).httpResponse != null : !httpResponse.equals(((AbstractImageUploadImpl) (obj)).httpResponse))
            {
                return false;
            }
            if (image == null ? ((AbstractImageUploadImpl) (obj)).image != null : !image.equals(((AbstractImageUploadImpl) (obj)).image))
            {
                return false;
            }
            if (message == null ? ((AbstractImageUploadImpl) (obj)).message != null : !message.equals(((AbstractImageUploadImpl) (obj)).message))
            {
                return false;
            }
            if (oauth == null ? ((AbstractImageUploadImpl) (obj)).oauth != null : !oauth.equals(((AbstractImageUploadImpl) (obj)).oauth))
            {
                return false;
            }
            if (!Arrays.equals(postParameter, ((AbstractImageUploadImpl) (obj)).postParameter))
            {
                return false;
            }
            if (uploadUrl == null ? ((AbstractImageUploadImpl) (obj)).uploadUrl != null : !uploadUrl.equals(((AbstractImageUploadImpl) (obj)).uploadUrl))
            {
                return false;
            }
        }
        return true;
    }

    protected String generateVerifyCredentialsAuthorizationHeader(String s)
    {
        s = oauth.generateOAuthSignatureHttpParams("GET", s);
        return (new StringBuilder("OAuth realm=\"http://api.twitter.com/\",")).append(OAuthAuthorization.encodeParameters(s, ",", true)).toString();
    }

    protected String generateVerifyCredentialsAuthorizationURL(String s)
    {
        java.util.List list = oauth.generateOAuthSignatureHttpParams("GET", s);
        return (new StringBuilder()).append(s).append("?").append(OAuthAuthorization.encodeParameters(list)).toString();
    }

    public int hashCode()
    {
        int k2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (client != null)
        {
            i = client.hashCode();
        } else
        {
            i = 0;
        }
        if (conf != null)
        {
            j = conf.hashCode();
        } else
        {
            j = 0;
        }
        if (apiKey != null)
        {
            k = apiKey.hashCode();
        } else
        {
            k = 0;
        }
        if (oauth != null)
        {
            l = oauth.hashCode();
        } else
        {
            l = 0;
        }
        if (uploadUrl != null)
        {
            i1 = uploadUrl.hashCode();
        } else
        {
            i1 = 0;
        }
        if (postParameter != null)
        {
            j1 = Arrays.hashCode(postParameter);
        } else
        {
            j1 = 0;
        }
        if (appendParameter != null)
        {
            k1 = Arrays.hashCode(appendParameter);
        } else
        {
            k1 = 0;
        }
        if (image != null)
        {
            l1 = image.hashCode();
        } else
        {
            l1 = 0;
        }
        if (message != null)
        {
            i2 = message.hashCode();
        } else
        {
            i2 = 0;
        }
        if (headers != null)
        {
            j2 = headers.hashCode();
        } else
        {
            j2 = 0;
        }
        if (httpResponse != null)
        {
            k2 = httpResponse.hashCode();
        }
        return (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k2;
    }

    protected abstract String postUpload();

    protected abstract void preUpload();

    public String toString()
    {
        Object obj = null;
        StringBuilder stringbuilder = (new StringBuilder("AbstractImageUploadImpl{client=")).append(client).append(", conf=").append(conf).append(", apiKey='").append(apiKey).append('\'').append(", oauth=").append(oauth).append(", uploadUrl='").append(uploadUrl).append('\'').append(", postParameter=");
        java.util.List list;
        if (postParameter == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(postParameter);
        }
        stringbuilder = stringbuilder.append(list).append(", appendParameter=");
        if (appendParameter == null)
        {
            list = obj;
        } else
        {
            list = Arrays.asList(appendParameter);
        }
        return stringbuilder.append(list).append(", image=").append(image).append(", message=").append(message).append(", headers=").append(headers).append(", httpResponse=").append(httpResponse).append('}').toString();
    }

    public String upload(File file)
    {
        image = new HttpParameter("media", file);
        return upload();
    }

    public String upload(File file, String s)
    {
        image = new HttpParameter("media", file);
        message = new HttpParameter("message", s);
        return upload();
    }

    public String upload(String s, InputStream inputstream)
    {
        image = new HttpParameter("media", s, inputstream);
        return upload();
    }

    public String upload(String s, InputStream inputstream, String s1)
    {
        image = new HttpParameter("media", s, inputstream);
        message = new HttpParameter("message", s1);
        return upload();
    }

}
