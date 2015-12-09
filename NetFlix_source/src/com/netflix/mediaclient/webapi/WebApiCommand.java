// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;

import android.util.Pair;
import com.android.volley.toolbox.InputStreamUtil;
import com.netflix.mediaclient.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.webapi:
//            AuthorizationCredentials, HttpClientFactory, CommonRequestParameters

public abstract class WebApiCommand
{

    private static final String COOKIE_SET_CHECK = "Set-Cookie";
    protected static final String HTTP = "http://";
    protected static final String HTTPS = "https://";
    protected static final int MAX_RE_EXECUTION_TIMES = 5;
    private static final String NETFLIX_ID = "NetflixId";
    private static final String NETFLIX_ID_TEST = "NetflixIdTest";
    protected static final String OUTPUT_JSON = "json";
    protected static final String OUTPUT_XML = "xml";
    protected static final String PARAMETER_APP_VERSION = "app_version";
    protected static final String PARAMETER_COUNTRY = "country";
    protected static final String PARAMETER_DEVICE_CAT = "device_cat";
    protected static final String PARAMETER_DEVICE_TYPE = "device_type";
    protected static final String PARAMETER_ESN = "esn";
    protected static final String PARAMETER_GEOLOCATION_COUNTRY = "geolocation_country";
    protected static final String PARAMETER_LANGUAGES = "languages";
    protected static final String PARAMETER_OS_VERSION = "os_version";
    protected static final String PARAMETER_OUTPUT = "output";
    protected static final String PARAMETER_ROUTING = "routing";
    protected static final String PARAMETER_TIMESTAMP = "timestamp";
    protected static final String PARAMETER_UI_VERSION = "ui_version";
    protected static final String PARAMETER_UUID = "uuid";
    protected static final String PARAMETER_VERSION = "v";
    protected static final String PARAMETER_WITH_CREDENTIALS = "withCredentials";
    protected static final String PATH_USERS = "/users";
    protected static final String PATH_USERS_CURRENT = "/users/current";
    protected static final String ROUTING_EMPTY = "reject-empty";
    protected static final String ROUTING_REDIRECT = "redirect";
    protected static final String ROUTING_REJECT = "reject";
    private static final String SECURE_NETFLIX_ID = "SecureNetflixId";
    private static final String SECURE_NETFLIX_ID_TEST = "SecureNetflixIdTest";
    protected static final String TAG = "nf_rest";
    protected static final String VERSION_20 = "2.0";
    protected CommonRequestParameters commonRequestParameters;
    private int count;
    protected AuthorizationCredentials credentials;
    protected String esn;
    protected boolean updated;

    protected WebApiCommand(String s, AuthorizationCredentials authorizationcredentials, CommonRequestParameters commonrequestparameters)
    {
        if (authorizationcredentials == null)
        {
            throw new IllegalArgumentException("Netflix id or secure netflix id is null!");
        } else
        {
            credentials = authorizationcredentials;
            commonRequestParameters = commonrequestparameters;
            return;
        }
    }

    private void checkForCredentialUpdate(List list)
    {
        if (list.isEmpty())
        {
            Log.d("nf_rest", "No cookies in response");
        } else
        {
            int i = 0;
            while (i < list.size()) 
            {
                if (Log.isLoggable("nf_rest", 3))
                {
                    Log.d("nf_rest", (new StringBuilder()).append("Response cookie: ").append(list.get(i)).toString());
                }
                if ("NetflixId".equals(((Cookie)list.get(i)).getName()))
                {
                    credentials.netflixId = updateProperty((Cookie)list.get(i), credentials.netflixId);
                }
                if ("SecureNetflixId".equals(((Cookie)list.get(i)).getName()))
                {
                    credentials.secureNetflixId = updateProperty((Cookie)list.get(i), credentials.secureNetflixId);
                }
                i++;
            }
        }
    }

    private void dumpCookies(HttpResponse httpresponse)
    {
        if (Log.isLoggable("nf_rest", 3))
        {
            int k = 0;
            int i = 0;
            Header aheader[] = httpresponse.getAllHeaders();
            if (aheader != null && aheader.length > 0)
            {
                Log.d("nf_rest", (new StringBuilder()).append("We got headers: ").append(aheader.length).toString());
                int l = aheader.length;
                int j = 0;
                do
                {
                    k = i;
                    if (j >= l)
                    {
                        break;
                    }
                    Header header = aheader[j];
                    Log.d("nf_rest", (new StringBuilder()).append("").append(header).toString());
                    k = i;
                    if (header != null)
                    {
                        k = i;
                        if (header.getValue().contains("Set-Cookie"))
                        {
                            k = i + 1;
                        }
                    }
                    j++;
                    i = k;
                } while (true);
            } else
            {
                Log.e("nf_rest", "No headers!!!");
            }
            Log.d("nf_rest", (new StringBuilder()).append("Cookies set in response: ").append(k).toString());
            Log.d("nf_rest", "----------------------------------------");
            Log.d("nf_rest", (new StringBuilder()).append("Response status line: ").append(httpresponse.getStatusLine()).toString());
            httpresponse = httpresponse.getEntity();
            if (httpresponse != null)
            {
                Log.d("nf_rest", (new StringBuilder()).append("Response content length: ").append(httpresponse.getContentLength()).toString());
            }
        }
    }

    public static String getNetflixIdName()
    {
        return "NetflixId";
    }

    public static String getSecureNetflixIdName()
    {
        return "SecureNetflixId";
    }

    private String updateProperty(Cookie cookie, String s)
    {
        String s1 = cookie.getName();
        cookie = cookie.getValue();
        if (s == null || s.equals(cookie))
        {
            if (Log.isLoggable("nf_rest", 3))
            {
                Log.d("nf_rest", (new StringBuilder()).append(s1).append(" is not changed").toString());
            }
            return s;
        }
        if (Log.isLoggable("nf_rest", 3))
        {
            Log.d("nf_rest", (new StringBuilder()).append(s1).append(" is now ").append(cookie).toString());
        }
        updated = true;
        return cookie;
    }

    protected void addIfNotNull(StringBuilder stringbuilder, String s, Boolean boolean1)
    {
        if (boolean1 != null)
        {
            stringbuilder.append('&').append(s).append('=').append(boolean1);
        }
    }

    protected void addIfNotNull(StringBuilder stringbuilder, String s, String s1)
    {
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        stringbuilder.append('&').append(s).append('=').append(URLEncoder.encode(s1, "utf-8"));
        return;
        stringbuilder;
        Log.e("nf_rest", "Failed with encoding", stringbuilder);
        return;
    }

    protected boolean checkStatus(int i, String s)
        throws JSONException, HttpException
    {
        boolean flag = false;
        if (i == 410)
        {
            Log.w("nf_rest", "Received 410: Redirecting... ");
            s = (new JSONObject(s)).getString("host");
            if (Log.isLoggable("nf_rest", 3))
            {
                Log.d("nf_rest", (new StringBuilder()).append("Response 410: new WebAPI end point received: ").append(s).toString());
            }
            HttpClientFactory.setWebApiEndPoint(s);
            flag = true;
        } else
        {
            if (i == 200)
            {
                Log.d("nf_rest", "Response 200. All good");
                return false;
            }
            if (i > 200 && i <= 399)
            {
                if (Log.isLoggable("nf_rest", 3))
                {
                    Log.d("nf_rest", (new StringBuilder()).append("Response ").append(i).toString());
                    return false;
                }
            } else
            {
                if (Log.isLoggable("nf_rest", 6))
                {
                    Log.e("nf_rest", (new StringBuilder()).append("Response ").append(i).toString());
                }
                throw new HttpException((new StringBuilder()).append("Failed with response code ").append(i).toString());
            }
        }
        return flag;
    }

    protected String doExecute()
        throws IOException, JSONException, HttpException
    {
        DefaultHttpClient defaulthttpclient;
        Object obj;
        defaulthttpclient = null;
        obj = null;
        DefaultHttpClient defaulthttpclient1 = HttpClientFactory.getHttpClient(credentials.netflixId, credentials.secureNetflixId);
        boolean flag = true;
_L9:
        if (!flag) goto _L2; else goto _L1
_L1:
        defaulthttpclient = defaulthttpclient1;
        if (count <= 5)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        defaulthttpclient = defaulthttpclient1;
        throw new HttpException("Too many retries!");
        obj;
        defaulthttpclient.getConnectionManager().shutdown();
        throw obj;
        defaulthttpclient = defaulthttpclient1;
        count = count + 1;
        defaulthttpclient = defaulthttpclient1;
        Object obj1 = getHttpMethod();
        defaulthttpclient = defaulthttpclient1;
        Pair apair[] = getHeaders();
        if (apair == null) goto _L4; else goto _L3
_L3:
        defaulthttpclient = defaulthttpclient1;
        if (apair.length <= 0) goto _L4; else goto _L5
_L5:
        int i = 0;
_L10:
        defaulthttpclient = defaulthttpclient1;
        if (i >= apair.length) goto _L7; else goto _L6
_L6:
        defaulthttpclient = defaulthttpclient1;
        if (!Log.isLoggable("nf_rest", 3))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        defaulthttpclient = defaulthttpclient1;
        Log.d("nf_rest", (new StringBuilder()).append("Add header ").append((String)apair[i].first).append(" with value: ").append((String)apair[i].second).toString());
        defaulthttpclient = defaulthttpclient1;
        if (apair[i].first == null)
        {
            break MISSING_BLOCK_LABEL_578;
        }
        defaulthttpclient = defaulthttpclient1;
        if (apair[i].second == null)
        {
            break MISSING_BLOCK_LABEL_578;
        }
        defaulthttpclient = defaulthttpclient1;
        ((HttpUriRequest) (obj1)).setHeader((String)apair[i].first, (String)apair[i].second);
        break MISSING_BLOCK_LABEL_578;
_L4:
        defaulthttpclient = defaulthttpclient1;
        Log.d("nf_rest", "No header found");
_L7:
        defaulthttpclient = defaulthttpclient1;
        if (!Log.isLoggable("nf_rest", 3))
        {
            break MISSING_BLOCK_LABEL_320;
        }
        defaulthttpclient = defaulthttpclient1;
        Log.d("nf_rest", (new StringBuilder()).append("executing request ").append(((HttpUriRequest) (obj1)).getURI()).append(", attempt: ").append(count).toString());
        defaulthttpclient = defaulthttpclient1;
        HttpResponse httpresponse = defaulthttpclient1.execute(((HttpUriRequest) (obj1)));
        defaulthttpclient = defaulthttpclient1;
        obj1 = httpresponse.getEntity();
        defaulthttpclient = defaulthttpclient1;
        StatusLine statusline = httpresponse.getStatusLine();
        if (statusline != null)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        defaulthttpclient = defaulthttpclient1;
        Log.e("nf_rest", "Status is NULL. It should NOT happen!");
        defaulthttpclient = defaulthttpclient1;
        throw new NullPointerException("Status is NULL. It should NOT happen!");
        defaulthttpclient = defaulthttpclient1;
        i = statusline.getStatusCode();
        defaulthttpclient = defaulthttpclient1;
        if (!Log.isLoggable("nf_rest", 3))
        {
            break MISSING_BLOCK_LABEL_472;
        }
        defaulthttpclient = defaulthttpclient1;
        Log.d("nf_rest", (new StringBuilder()).append("Response status: code ").append(i).append(", text ").append(statusline.getReasonPhrase()).append(", protocol ").append(statusline.getProtocolVersion()).toString());
        defaulthttpclient = defaulthttpclient1;
        dumpCookies(httpresponse);
        defaulthttpclient = defaulthttpclient1;
        checkForCredentialUpdate(defaulthttpclient1.getCookieStore().getCookies());
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        defaulthttpclient = defaulthttpclient1;
        obj = InputStreamUtil.convertStreamToString(((HttpEntity) (obj1)).getContent());
        defaulthttpclient = defaulthttpclient1;
        if (!Log.isLoggable("nf_rest", 3))
        {
            break MISSING_BLOCK_LABEL_544;
        }
        defaulthttpclient = defaulthttpclient1;
        Log.d("nf_rest", (new StringBuilder()).append("Full content: ").append(((String) (obj))).toString());
        defaulthttpclient = defaulthttpclient1;
        ((HttpEntity) (obj1)).consumeContent();
        defaulthttpclient = defaulthttpclient1;
        flag = checkStatus(i, ((String) (obj)));
          goto _L9
_L2:
        defaulthttpclient1.getConnectionManager().shutdown();
        return ((String) (obj));
        i++;
          goto _L10
    }

    protected StringBuilder getBaseCmsBeaconUrl()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (isSecure())
        {
            stringbuilder.append("https://");
        } else
        {
            stringbuilder.append("http://");
        }
        stringbuilder.append(HttpClientFactory.getCmsBeaconApiEndPoint());
        s = getCommandPath();
        if (s == null)
        {
            Log.e("nf_rest", "Path is NULL!");
            return null;
        }
        s = s.trim();
        if (!s.startsWith("/"))
        {
            stringbuilder.append('/');
        }
        stringbuilder.append(s);
        return stringbuilder;
    }

    protected StringBuilder getBaseCustomerEventBeaconUrl()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (isSecure())
        {
            stringbuilder.append("https://");
        } else
        {
            stringbuilder.append("http://");
        }
        stringbuilder.append(HttpClientFactory.getCustomerEventBeaconApiEndPoint());
        s = getCommandPath();
        if (s == null)
        {
            Log.e("nf_rest", "Path is NULL!");
            return null;
        }
        s = s.trim();
        if (!s.startsWith("/"))
        {
            stringbuilder.append('/');
        }
        stringbuilder.append(s);
        return stringbuilder;
    }

    protected StringBuilder getBaseWebAPiUrl()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (isSecure())
        {
            stringbuilder.append("https://");
        } else
        {
            stringbuilder.append("http://");
        }
        stringbuilder.append(HttpClientFactory.getWebApiEndPoint());
        s = getCommandPath();
        if (s == null)
        {
            Log.e("nf_rest", "Path is NULL!");
            return null;
        }
        s = s.trim();
        if (!s.startsWith("/"))
        {
            stringbuilder.append('/');
        }
        stringbuilder.append(s);
        return stringbuilder;
    }

    public abstract String getCommandPath();

    public CommonRequestParameters getCommonRequestParameters()
    {
        return commonRequestParameters;
    }

    public AuthorizationCredentials getCredentials()
    {
        return credentials;
    }

    public Pair[] getHeaders()
    {
        return new Pair[0];
    }

    protected abstract HttpUriRequest getHttpMethod()
        throws UnsupportedEncodingException;

    public String getOuput()
    {
        return "json";
    }

    public String getRouting()
    {
        return "reject";
    }

    protected StringBuilder getUrl()
    {
        return getBaseWebAPiUrl();
    }

    public String getVersion()
    {
        return "2.0";
    }

    public boolean isSecure()
    {
        return true;
    }

    public boolean isUpdated()
    {
        return updated;
    }

    protected void verifyNotNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" can not be null!").toString());
        } else
        {
            return;
        }
    }
}
