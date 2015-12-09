// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Network;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.webkit.URLUtil;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.Security;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.android.gms.http:
//            GoogleURLConnectionFactory, GoogleHttpServiceClient, BlockedRequestException, NetworkWrapper, 
//            IGoogleHttpService

public class GoogleHttpClient
    implements HttpClient
{
    static final class GoogleHttpResponse extends BasicHttpResponse
    {

        private static final StatusLine DEFAULT_STATUS;
        HttpURLConnection httpURLConnection;

        static 
        {
            DEFAULT_STATUS = new BasicStatusLine(HttpVersion.HTTP_1_1, 500, "Unknown error");
        }

        GoogleHttpResponse()
        {
            super(DEFAULT_STATUS, null, null);
        }
    }

    static final class LoggingConfiguration
    {

        final int level;
        final boolean logAuthToken;
        final String tag;

        protected LoggingConfiguration(String s, int i, boolean flag)
        {
            tag = s;
            level = i;
            logAuthToken = flag;
        }
    }


    private static final String textContentTypes[] = {
        "text/", "application/xml", "application/json"
    };
    private LoggingConfiguration curlConfiguration;
    protected GoogleURLConnectionFactory mConnectionFactory;
    private Context mContext;
    private String mDefaultUserAgent;
    protected HttpParams mParams = new AbstractHttpParams() {

        final GoogleHttpClient this$0;

        public final HttpParams copy()
        {
            throw new UnsupportedOperationException();
        }

        public final Object getParameter(String s2)
        {
            return null;
        }

        public final boolean removeParameter(String s2)
        {
            Log.w("GoogleHttpClient", (new StringBuilder("Ignoring unsupported remove operation for: ")).append(s2).toString());
            return true;
        }

        public final HttpParams setParameter(String s2, Object obj)
        {
label0:
            {
                if (!s2.equals("http.conn-manager.timeout"))
                {
                    if (!s2.equals("http.socket.timeout"))
                    {
                        break label0;
                    }
                    s2 = (Integer)obj;
                    mConnectionFactory.defaultReadTimeout = s2.intValue();
                }
                return this;
            }
            if (s2.equals("http.connection.timeout"))
            {
                s2 = (Integer)obj;
                mConnectionFactory.defaultConnectTimeout = s2.intValue();
                return this;
            } else
            {
                Log.w("GoogleHttpClient", (new StringBuilder("Ignoring unsupported parameter: ")).append(s2).toString());
                return this;
            }
        }

            
            {
                this$0 = GoogleHttpClient.this;
                super();
            }
    };

    public GoogleHttpClient(Context context, String s, boolean flag)
    {
        boolean flag1;
        if (Security.getProvider("com.google.android.gms.common.security.ProviderInstallerImpl") != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        this(context, s, flag, flag1);
    }

    public GoogleHttpClient(Context context, String s, boolean flag, boolean flag1)
    {
        String s1 = (new StringBuilder()).append(s).append(" (").append(Build.DEVICE).append(" ").append(Build.ID).append(")").toString();
        s = s1;
        if (flag)
        {
            s = (new StringBuilder()).append(s1).append("; gzip").toString();
        }
        mContext = context;
        mDefaultUserAgent = s;
        mConnectionFactory = new GoogleURLConnectionFactory(mContext, flag1);
    }

    public GoogleHttpClient(Context context, String s, boolean flag, boolean flag1, boolean flag2)
    {
        this(context, s, flag, flag1);
    }

    private HttpResponse executeInternal(HttpUriRequest httpurirequest, NetworkWrapper networkwrapper)
        throws IOException
    {
        Object obj;
        URL url;
        GoogleURLConnectionFactory googleurlconnectionfactory;
        Object obj1;
        long l;
label0:
        {
            if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())
            {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
            if (!(httpurirequest instanceof HttpEntityEnclosingRequest))
            {
                break label0;
            }
            obj = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            if (obj == null)
            {
                l = 0L;
            } else
            {
                if (((HttpEntity) (obj)).isChunked())
                {
                    break label0;
                }
                l = ((HttpEntity) (obj)).getContentLength();
            }
        }
_L1:
        if (l >= 0L)
        {
            httpurirequest.addHeader("content-length", Long.toString(l));
        }
        url = httpurirequest.getURI().toURL();
        googleurlconnectionfactory = mConnectionFactory;
        if (networkwrapper == null)
        {
            networkwrapper = null;
        } else
        {
            networkwrapper = networkwrapper._flddelegate;
        }
        Preconditions.checkNotNull(url);
        obj1 = googleurlconnectionfactory.mClient.checkRules(url.toString());
        obj = url;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        if (((Bundle) (obj1)).getString("block") != null)
        {
            Log.w("GoogleURLConnFactory", (new StringBuilder("Blocked by ")).append(((Bundle) (obj1)).getString("name")).append(": ").append(url).toString());
            throw new BlockedRequestException(((Bundle) (obj1)));
        }
        break MISSING_BLOCK_LABEL_215;
        l = -1L;
          goto _L1
        obj1 = ((Bundle) (obj1)).getString("rewrite");
        obj = url;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        if (!URLUtil.isHttpUrl(((String) (obj1))))
        {
            obj = url;
            if (!URLUtil.isHttpsUrl(((String) (obj1))))
            {
                break MISSING_BLOCK_LABEL_306;
            }
        }
        if (Log.isLoggable("GoogleURLConnFactory", 3))
        {
            Log.d("GoogleURLConnFactory", (new StringBuilder("Rewrote ")).append(url.toString()).append(" to ").append(((String) (obj1))).toString());
        }
        obj = new URL(((String) (obj1)));
        if (networkwrapper == null)
        {
            networkwrapper = ((URL) (obj)).openConnection();
        } else
        {
            googleurlconnectionfactory.mContext.getSystemService("connectivity");
            networkwrapper = networkwrapper.openConnection(((URL) (obj)));
        }
        networkwrapper.setConnectTimeout(googleurlconnectionfactory.defaultConnectTimeout);
        networkwrapper.setReadTimeout(googleurlconnectionfactory.defaultReadTimeout);
        if (networkwrapper instanceof HttpsURLConnection)
        {
            if (googleurlconnectionfactory.defaultSSLSocketFactory != null)
            {
                ((HttpsURLConnection)networkwrapper).setSSLSocketFactory(googleurlconnectionfactory.defaultSSLSocketFactory);
            }
            if (googleurlconnectionfactory.mVerifier != null)
            {
                ((HttpsURLConnection)networkwrapper).setHostnameVerifier(googleurlconnectionfactory.mVerifier);
            }
        }
        networkwrapper = (HttpURLConnection)networkwrapper;
        networkwrapper.setInstanceFollowRedirects(false);
        obj = curlConfiguration;
        if (obj != null && Log.isLoggable(((LoggingConfiguration) (obj)).tag, ((LoggingConfiguration) (obj)).level))
        {
            String s = toCurl(httpurirequest, networkwrapper, ((LoggingConfiguration) (obj)).logAuthToken);
            Log.println(((LoggingConfiguration) (obj)).level, ((LoggingConfiguration) (obj)).tag, s);
        }
        makeRequest(networkwrapper, httpurirequest);
        return getResponse(networkwrapper);
    }

    public static AbstractHttpEntity getCompressedEntity(byte abyte0[], ContentResolver contentresolver)
        throws IOException
    {
        if ((long)abyte0.length < getMinGzipSize(contentresolver))
        {
            return new ByteArrayEntity(abyte0);
        } else
        {
            contentresolver = new ByteArrayOutputStream();
            GZIPOutputStream gzipoutputstream = new GZIPOutputStream(contentresolver);
            gzipoutputstream.write(abyte0);
            gzipoutputstream.close();
            abyte0 = new ByteArrayEntity(contentresolver.toByteArray());
            abyte0.setContentEncoding("gzip");
            return abyte0;
        }
    }

    public static long getMinGzipSize(ContentResolver contentresolver)
    {
        return 256L;
    }

    private HttpResponse getResponse(HttpURLConnection httpurlconnection)
        throws IOException
    {
        Object obj;
        Object obj1;
        int i;
        i = httpurlconnection.getResponseCode();
        if (i < 0)
        {
            throw new IOException("Cannot retrieve a valid HTTP status code from server response");
        }
        obj = mConnectionFactory;
        obj1 = httpurlconnection.getURL().toString();
        obj = ((GoogleURLConnectionFactory) (obj)).mClient;
        if (((GoogleHttpServiceClient) (obj)).bindHttpService()) goto _L2; else goto _L1
_L1:
        ((GoogleHttpServiceClient) (obj)).unbindHttpService();
_L10:
        GoogleHttpResponse googlehttpresponse;
        Iterator iterator;
        googlehttpresponse = new GoogleHttpResponse();
        googlehttpresponse.httpURLConnection = httpurlconnection;
        googlehttpresponse.setStatusLine(HttpVersion.HTTP_1_1, i, httpurlconnection.getResponseMessage());
        obj = null;
        obj1 = null;
        iterator = httpurlconnection.getHeaderFields().entrySet().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj2;
        String s;
        obj2 = (java.util.Map.Entry)iterator.next();
        s = (String)((java.util.Map.Entry) (obj2)).getKey();
        if (s == null) goto _L6; else goto _L5
_L5:
        Object obj3;
        Iterator iterator1;
        iterator1 = ((List)((java.util.Map.Entry) (obj2)).getValue()).iterator();
        obj2 = obj;
        obj3 = obj1;
_L8:
        obj1 = obj3;
        obj = obj2;
        if (!iterator1.hasNext()) goto _L6; else goto _L7
_L7:
        obj = (String)iterator1.next();
        if (s.equalsIgnoreCase("content-type"))
        {
            obj1 = obj;
        } else
        {
            obj1 = obj2;
            if (s.equalsIgnoreCase("content-encoding"))
            {
                obj3 = obj;
                obj1 = obj2;
            }
        }
        googlehttpresponse.addHeader(new BasicHeader(s, ((String) (obj))));
        obj2 = obj1;
          goto _L8
_L2:
        if (((GoogleHttpServiceClient) (obj)).mHttpService == null || i <= 0)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        ((GoogleHttpServiceClient) (obj)).mHttpService.reportHttpRequestResult(((String) (obj1)), i);
        ((GoogleHttpServiceClient) (obj)).unbindHttpService();
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", ((Throwable) (obj1)));
        ((GoogleHttpServiceClient) (obj)).unbindHttpService();
        continue; /* Loop/switch isn't completed */
        httpurlconnection;
        ((GoogleHttpServiceClient) (obj)).unbindHttpService();
        throw httpurlconnection;
_L4:
        if (i >= 400)
        {
            httpurlconnection = httpurlconnection.getErrorStream();
        } else
        {
            httpurlconnection = httpurlconnection.getInputStream();
        }
        if (httpurlconnection != null)
        {
            httpurlconnection = new InputStreamEntity(httpurlconnection, -1L);
            if (obj != null)
            {
                httpurlconnection.setContentType(((String) (obj)));
            }
            if (obj1 != null)
            {
                httpurlconnection.setContentEncoding(((String) (obj1)));
            }
            googlehttpresponse.setEntity(httpurlconnection);
        }
        return googlehttpresponse;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static InputStream getUngzippedContent(HttpEntity httpentity)
        throws IOException
    {
        InputStream inputstream = httpentity.getContent();
        if (inputstream == null)
        {
            return inputstream;
        }
        httpentity = httpentity.getContentEncoding();
        if (httpentity == null)
        {
            return inputstream;
        }
        String s = httpentity.getValue();
        if (s == null)
        {
            return inputstream;
        }
        httpentity = inputstream;
        if (s.contains("gzip"))
        {
            httpentity = new GZIPInputStream(inputstream);
        }
        return httpentity;
    }

    private static boolean isBinaryContent(HttpUriRequest httpurirequest)
    {
        Header aheader[];
        int i;
        int k;
        aheader = httpurirequest.getHeaders("content-encoding");
        if (aheader == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k = aheader.length;
        i = 0;
_L3:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (!"gzip".equalsIgnoreCase(aheader[i].getValue())) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        i++;
          goto _L3
        httpurirequest = httpurirequest.getHeaders("content-type");
        if (httpurirequest != null)
        {
            int i1 = httpurirequest.length;
            int j = 0;
            while (j < i1) 
            {
                Header header = httpurirequest[j];
                String as[] = textContentTypes;
                for (int l = 0; l < 3; l++)
                {
                    String s = as[l];
                    if (header.getValue().startsWith(s))
                    {
                        return false;
                    }
                }

                j++;
            }
        }
          goto _L1
    }

    private void makeRequest(HttpURLConnection httpurlconnection, HttpUriRequest httpurirequest)
        throws IOException
    {
        httpurlconnection.setRequestMethod(httpurirequest.getMethod());
        Header aheader[] = httpurirequest.getAllHeaders();
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header1 = aheader[i];
            httpurlconnection.addRequestProperty(header1.getName(), header1.getValue());
        }

        if (httpurlconnection.getRequestProperty("User-Agent") == null)
        {
            httpurlconnection.setRequestProperty("User-Agent", mDefaultUserAgent);
        }
        if ((httpurirequest instanceof HttpEntityEnclosingRequest) && ((HttpEntityEnclosingRequest)httpurirequest).getEntity() != null)
        {
            httpurirequest = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            httpurlconnection.setDoOutput(true);
            Header header;
            Header header2;
            long l;
            if (httpurirequest.isChunked())
            {
                l = -1L;
            } else
            {
                l = httpurirequest.getContentLength();
            }
            header = httpurirequest.getContentType();
            header2 = httpurirequest.getContentEncoding();
            if (l > 0L)
            {
                httpurlconnection.setRequestProperty("content-length", Long.toString(l));
            }
            if (header != null)
            {
                httpurlconnection.setRequestProperty("content-type", header.getValue());
            }
            if (header2 != null)
            {
                httpurlconnection.setRequestProperty("content-encoding", header2.getValue());
            }
            httpurirequest.writeTo(httpurlconnection.getOutputStream());
            return;
        } else
        {
            httpurlconnection.connect();
            return;
        }
    }

    public static void modifyRequestToAcceptGzipResponse(HttpRequest httprequest)
    {
        httprequest.addHeader("Accept-Encoding", "gzip");
    }

    public static GoogleHttpClient newInstance(String s, Context context)
    {
        return new GoogleHttpClient(context, s, false);
    }

    private static String toCurl(HttpUriRequest httpurirequest, HttpURLConnection httpurlconnection, boolean flag)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("curl ");
        stringbuilder.append("-X ");
        stringbuilder.append(httpurirequest.getMethod());
        stringbuilder.append(" ");
        Header aheader[] = httpurirequest.getAllHeaders();
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header = aheader[i];
            if (flag || !header.getName().equals("Authorization") && !header.getName().equals("Cookie"))
            {
                stringbuilder.append("--header \"");
                stringbuilder.append(header.toString().trim());
                stringbuilder.append("\" ");
            }
        }

        stringbuilder.append("\"");
        stringbuilder.append(httpurlconnection.getURL());
        stringbuilder.append("\"");
        if (httpurirequest instanceof HttpEntityEnclosingRequest)
        {
            httpurlconnection = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            if (httpurlconnection != null && httpurlconnection.isRepeatable())
            {
                if (httpurlconnection.getContentLength() < 0x100000L)
                {
                    ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                    httpurlconnection.writeTo(bytearrayoutputstream);
                    if (isBinaryContent(httpurirequest))
                    {
                        httpurirequest = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 2);
                        stringbuilder.insert(0, (new StringBuilder("echo '")).append(httpurirequest).append("' | base64 -d > /tmp/$$.bin; ").toString());
                        stringbuilder.append(" --data-binary @/tmp/$$.bin");
                    } else
                    {
                        httpurirequest = bytearrayoutputstream.toString();
                        stringbuilder.append(" --data-ascii \"").append(httpurirequest).append("\"");
                    }
                } else
                {
                    stringbuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                }
            }
        }
        return stringbuilder.toString();
    }

    public void close()
    {
        mConnectionFactory.close();
    }

    public void disableCurlLogging()
    {
        curlConfiguration = null;
    }

    public void enableCurlLogging(String s, int i)
    {
        enableCurlLogging(s, i, false);
    }

    public void enableCurlLogging(String s, int i, boolean flag)
    {
        if (s == null)
        {
            throw new NullPointerException("name");
        }
        if (i < 2 || i > 7)
        {
            throw new IllegalArgumentException("Level is out of range [27]");
        } else
        {
            curlConfiguration = new LoggingConfiguration(s, i, flag);
            return;
        }
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
        throws IOException
    {
        throw new UnsupportedOperationException();
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException
    {
        throw new UnsupportedOperationException();
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
        throws IOException
    {
        return execute(httpurirequest, responsehandler, ((HttpContext) (null)));
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException
    {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
        throws IOException
    {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws IOException
    {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
        throws IOException
    {
        return execute(httpurirequest, ((HttpContext) (null)));
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, NetworkWrapper networkwrapper)
        throws IOException
    {
        return executeInternal(httpurirequest, networkwrapper);
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
        throws IOException
    {
        return executeInternal(httpurirequest, null);
    }

    public GoogleURLConnectionFactory getConnectionFactory()
    {
        return mConnectionFactory;
    }

    public ClientConnectionManager getConnectionManager()
    {
        throw new UnsupportedOperationException();
    }

    public HttpParams getParams()
    {
        return mParams;
    }

    public SSLSocketFactory getSocketFactory()
    {
        return mConnectionFactory.defaultSSLSocketFactory;
    }

    public void setConnectionFactory(GoogleURLConnectionFactory googleurlconnectionfactory)
    {
        mConnectionFactory = googleurlconnectionfactory;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameverifier)
    {
        mConnectionFactory.mVerifier = hostnameverifier;
    }

    public void setSslSocketFactory(SSLSocketFactory sslsocketfactory)
    {
        mConnectionFactory.defaultSSLSocketFactory = sslsocketfactory;
    }

}
