// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.http;

import android.os.Build;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.UAHttpStatusUtil;
import com.urbanairship.util.UAStringUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.auth.BasicScheme;

// Referenced classes of package com.urbanairship.http:
//            Response

public class Request
{

    private static final String USER_AGENT_FORMAT = "%s (%s; %s; UrbanAirshipLib-%s/%s; %s; %s)";
    protected String body;
    private boolean compressRequestBody;
    protected String contentType;
    private long ifModifiedSince;
    protected String password;
    protected String requestMethod;
    protected Map responseProperties;
    protected URL url;
    protected String user;

    public Request(String s, URL url1)
    {
        ifModifiedSince = 0L;
        compressRequestBody = false;
        requestMethod = s;
        url = url1;
        responseProperties = new HashMap();
        responseProperties.put("User-Agent", getUrbanAirshipUserAgent());
    }

    public static String getUrbanAirshipUserAgent()
    {
        String s;
        if (UAirship.shared().getPlatformType() == 1)
        {
            s = "amazon";
        } else
        {
            s = "android";
        }
        return String.format(Locale.US, "%s (%s; %s; UrbanAirshipLib-%s/%s; %s; %s)", new Object[] {
            UAirship.getPackageName(), Build.MODEL, android.os.Build.VERSION.RELEASE, s, UAirship.getVersion(), UAirship.shared().getAirshipConfigOptions().getAppKey(), Locale.getDefault()
        });
    }

    private String readEntireStream(InputStream inputstream)
        throws IOException
    {
        BufferedReader bufferedreader;
        Object obj;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        obj = new StringBuilder();
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        ((StringBuilder) (obj)).append((new StringBuilder()).append(s).append("\n").toString());
          goto _L1
        obj;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        inputstream.close();
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Logger.error("Failed to close streams", inputstream);
            }
        }
        throw obj;
        bufferedreader.close();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        inputstream.close();
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Logger.error("Failed to close streams", inputstream);
            }
        }
        return ((StringBuilder) (obj)).toString();
    }

    public Response execute()
    {
        Object obj;
        Object obj1;
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            System.setProperty("http.keepAlive", "false");
        }
        obj1 = null;
        obj = null;
        Object obj2 = (HttpURLConnection)url.openConnection();
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setRequestMethod(requestMethod);
        obj = obj2;
        obj1 = obj2;
        if (body == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setDoOutput(true);
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setRequestProperty("Content-Type", contentType);
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setDoInput(true);
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setUseCaches(false);
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setAllowUserInteraction(false);
        obj = obj2;
        obj1 = obj2;
        if (ifModifiedSince <= 0L)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setIfModifiedSince(ifModifiedSince);
        obj = obj2;
        obj1 = obj2;
        Object obj3 = responseProperties.keySet().iterator();
_L2:
        obj = obj2;
        obj1 = obj2;
        if (!((Iterator) (obj3)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        obj1 = obj2;
        Object obj4 = (String)((Iterator) (obj3)).next();
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setRequestProperty(((String) (obj4)), (String)responseProperties.get(obj4));
        if (true) goto _L2; else goto _L1
        obj2;
        obj1 = obj;
        Logger.error((new StringBuilder()).append("Request failed. URL: ").append(url).append(" requestMethod: ").append(requestMethod).toString(), ((Throwable) (obj2)));
        obj2 = null;
        obj1 = obj2;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            obj1 = obj2;
        }
_L8:
        return ((Response) (obj1));
_L1:
        obj = obj2;
        obj1 = obj2;
        if (UAStringUtil.isEmpty(user))
        {
            break MISSING_BLOCK_LABEL_341;
        }
        obj = obj2;
        obj1 = obj2;
        if (UAStringUtil.isEmpty(password))
        {
            break MISSING_BLOCK_LABEL_341;
        }
        obj = obj2;
        obj1 = obj2;
        obj3 = BasicScheme.authenticate(new UsernamePasswordCredentials(user, password), "UTF-8", false);
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setRequestProperty(((Header) (obj3)).getName(), ((Header) (obj3)).getValue());
        obj = obj2;
        obj1 = obj2;
        if (body == null) goto _L4; else goto _L3
_L3:
        obj = obj2;
        obj1 = obj2;
        if (!compressRequestBody) goto _L6; else goto _L5
_L5:
        obj = obj2;
        obj1 = obj2;
        ((HttpURLConnection) (obj2)).setRequestProperty("Content-Encoding", "gzip");
        obj = obj2;
        obj1 = obj2;
        obj3 = ((HttpURLConnection) (obj2)).getOutputStream();
        obj = obj2;
        obj1 = obj2;
        obj4 = new GZIPOutputStream(((OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj2;
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(((OutputStream) (obj4)), "UTF-8");
        obj = obj2;
        obj1 = obj2;
        outputstreamwriter.write(body);
        obj = obj2;
        obj1 = obj2;
        outputstreamwriter.close();
        obj = obj2;
        obj1 = obj2;
        ((GZIPOutputStream) (obj4)).close();
        obj = obj2;
        obj1 = obj2;
        ((OutputStream) (obj3)).close();
_L4:
        obj = obj2;
        obj1 = obj2;
        obj3 = (new Response.Builder(((HttpURLConnection) (obj2)).getResponseCode())).setResponseMessage(((HttpURLConnection) (obj2)).getResponseMessage()).setResponseHeaders(((HttpURLConnection) (obj2)).getHeaderFields()).setLastModified(((HttpURLConnection) (obj2)).getLastModified());
        obj = obj2;
        obj1 = obj2;
        if (!UAHttpStatusUtil.inSuccessRange(((HttpURLConnection) (obj2)).getResponseCode()))
        {
            break MISSING_BLOCK_LABEL_530;
        }
        obj = obj2;
        obj1 = obj2;
        ((Response.Builder) (obj3)).setResponseBody(readEntireStream(((HttpURLConnection) (obj2)).getInputStream()));
        obj = obj2;
        obj1 = obj2;
        obj3 = ((Response.Builder) (obj3)).create();
        obj = obj3;
        obj1 = obj;
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
            return ((Response) (obj));
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj = obj2;
        obj1 = obj2;
        obj3 = ((HttpURLConnection) (obj2)).getOutputStream();
        obj = obj2;
        obj1 = obj2;
        obj4 = new OutputStreamWriter(((OutputStream) (obj3)), "UTF-8");
        obj = obj2;
        obj1 = obj2;
        ((Writer) (obj4)).write(body);
        obj = obj2;
        obj1 = obj2;
        ((Writer) (obj4)).close();
        obj = obj2;
        obj1 = obj2;
        ((OutputStream) (obj3)).close();
          goto _L4
        Exception exception;
        exception;
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Request setCompressRequestBody(boolean flag)
    {
        compressRequestBody = flag;
        return this;
    }

    public Request setCredentials(String s, String s1)
    {
        user = s;
        password = s1;
        return this;
    }

    public Request setHeader(String s, String s1)
    {
        if (s1 == null)
        {
            responseProperties.remove(s);
            return this;
        } else
        {
            responseProperties.put(s, s1);
            return this;
        }
    }

    public Request setIfModifiedSince(long l)
    {
        ifModifiedSince = l;
        return this;
    }

    public Request setRequestBody(String s, String s1)
    {
        body = s;
        contentType = s1;
        return this;
    }
}
