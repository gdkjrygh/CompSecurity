// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import com.android.volley.toolbox.InputStreamUtil;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import com.netflix.mediaclient.webapi.HttpClientFactory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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

public abstract class MdxCeWebApiCommand
{

    private static final String COOKIE_SET_CHECK = "Set-Cookie";
    private static final String CUSTOMEREVENT_ENDPOINT_PROD = "customerevents.netflix.com";
    protected static final String HTTP = "http://";
    protected static final String HTTPS = "https://";
    protected static final int MAX_RE_EXECUTION_TIMES = 5;
    public static final String NETFLIX_ID = "NetflixId";
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
    public static final String SECURE_NETFLIX_ID = "SecureNetflixId";
    protected static final String TAG = "nf_mdxMdxCustomerEventrest";
    protected static final String VERSION_20 = "2.0";
    protected static String mCustomerEventEndPoint = "customerevents.netflix.com";
    protected CommonRequestParameters commonRequestParameters;
    private int count;
    protected AuthorizationCredentials credentials;
    protected String esn;
    protected boolean updated;

    protected MdxCeWebApiCommand(String s, AuthorizationCredentials authorizationcredentials, CommonRequestParameters commonrequestparameters)
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
            Log.d("nf_mdxMdxCustomerEventrest", "No cookies in response");
        } else
        {
            int i = 0;
            while (i < list.size()) 
            {
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
        if (Log.isLoggable("nf_mdxMdxCustomerEventrest", 3))
        {
            int k = 0;
            int i = 0;
            Header aheader[] = httpresponse.getAllHeaders();
            if (aheader != null && aheader.length > 0)
            {
                Log.d("nf_mdxMdxCustomerEventrest", (new StringBuilder()).append("We got headers: ").append(aheader.length).toString());
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
                    Log.d("nf_mdxMdxCustomerEventrest", (new StringBuilder()).append("").append(header).toString());
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
                Log.e("nf_mdxMdxCustomerEventrest", "No headers!!!");
            }
            Log.d("nf_mdxMdxCustomerEventrest", (new StringBuilder()).append("Cookies set in response: ").append(k).toString());
            Log.d("nf_mdxMdxCustomerEventrest", "----------------------------------------");
            Log.d("nf_mdxMdxCustomerEventrest", (new StringBuilder()).append("Response status line: ").append(httpresponse.getStatusLine()).toString());
            httpresponse = httpresponse.getEntity();
            if (httpresponse != null)
            {
                Log.d("nf_mdxMdxCustomerEventrest", (new StringBuilder()).append("Response content length: ").append(httpresponse.getContentLength()).toString());
            }
        }
    }

    private String updateProperty(Cookie cookie, String s)
    {
        cookie = cookie.getValue();
        if (s == null || s.equals(cookie))
        {
            return s;
        } else
        {
            updated = true;
            return cookie;
        }
    }

    protected boolean checkStatus(int i, String s)
        throws JSONException, HttpException
    {
        if (i == 410)
        {
            Log.w("nf_mdxMdxCustomerEventrest", "Received 410: Redirecting... ");
            mCustomerEventEndPoint = (new JSONObject(s)).getString("host");
            if (Log.isLoggable("nf_mdxMdxCustomerEventrest", 3))
            {
                Log.d("nf_mdxMdxCustomerEventrest", (new StringBuilder()).append("Response 410: new WebAPI end point received: ").append(mCustomerEventEndPoint).toString());
            }
            return true;
        }
        if (i == 200 || i == 202)
        {
            if (Log.isLoggable("nf_mdxMdxCustomerEventrest", 3))
            {
                Log.d("nf_mdxMdxCustomerEventrest", (new StringBuilder()).append("Response succeed with code ").append(i).toString());
            }
            return false;
        }
        if (Log.isLoggable("nf_mdxMdxCustomerEventrest", 6))
        {
            Log.e("nf_mdxMdxCustomerEventrest", (new StringBuilder()).append("Response ").append(i).toString());
        }
        throw new HttpException((new StringBuilder()).append("Failed with response code ").append(i).toString());
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
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
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
        Object obj1 = defaulthttpclient1.execute(getHttpMethod());
        defaulthttpclient = defaulthttpclient1;
        HttpEntity httpentity = ((HttpResponse) (obj1)).getEntity();
        defaulthttpclient = defaulthttpclient1;
        obj1 = ((HttpResponse) (obj1)).getStatusLine();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        defaulthttpclient = defaulthttpclient1;
        Log.e("nf_mdxMdxCustomerEventrest", "Status is NULL. It should NOT happen!");
        defaulthttpclient = defaulthttpclient1;
        throw new NullPointerException("Status is NULL. It should NOT happen!");
        defaulthttpclient = defaulthttpclient1;
        int i = ((StatusLine) (obj1)).getStatusCode();
        defaulthttpclient = defaulthttpclient1;
        checkForCredentialUpdate(defaulthttpclient1.getCookieStore().getCookies());
        if (httpentity == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        defaulthttpclient = defaulthttpclient1;
        obj = InputStreamUtil.convertStreamToString(httpentity.getContent());
        defaulthttpclient = defaulthttpclient1;
        httpentity.consumeContent();
        defaulthttpclient = defaulthttpclient1;
        flag = checkStatus(i, ((String) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        defaulthttpclient1.getConnectionManager().shutdown();
        return ((String) (obj));
    }

    protected StringBuilder getBaseUrl()
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
        stringbuilder.append(mCustomerEventEndPoint);
        s = getCommandPath();
        if (s == null)
        {
            Log.e("nf_mdxMdxCustomerEventrest", "Path is NULL!");
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
        return getBaseUrl();
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
