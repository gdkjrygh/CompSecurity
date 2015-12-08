// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.fips;

import android.content.Context;
import android.util.Log;
import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.io.AbstractSessionInputBuffer;
import org.apache.http.impl.io.HttpResponseParser;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.message.BasicLineParser;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.worklight.wlclient.fips:
//            MicroVPNLib

public class FipsHttpClient
    implements HttpClient
{

    private static final String LOG_TAG = com/worklight/wlclient/fips/FipsHttpClient.getSimpleName();
    private static final String UNIMPLEMENTED_METHOD_MSG = "FipsHttpClient does not implement this method";
    private static Context ctx = null;
    private static final Logger logger = Logger.getInstance(com/worklight/wlclient/fips/FipsHttpClient.getName());
    private ClientConnectionManager mManager;
    private HttpParams mParams;
    private MicroVPNLib nativeLib;
    private long share;
    private int uvpn;

    protected FipsHttpClient()
    {
        if (!Thread.currentThread().getStackTrace()[2].toString().contains("FipsHttpClientTest"))
        {
            throw new RuntimeException("This constructor is for unit tests only, and should not be called in production code!");
        } else
        {
            mParams = new BasicHttpParams();
            return;
        }
    }

    public FipsHttpClient(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        WLUtils.loadLib(ctx, "libcrypto.so.1.0.0");
        WLUtils.loadLib(ctx, "libssl.so.1.0.0");
        nativeLib = new MicroVPNLib();
        if (nativeLib.FIPSInit() != 1)
        {
            throw new RuntimeException("FIPS initialization failed.");
        }
        share = nativeLib.curlInit();
        if (share == -1L)
        {
            throw new RuntimeException("HTTP client initialization failed.");
        }
        Object obj = httpparams;
        if (httpparams == null)
        {
            obj = new BasicHttpParams();
            HttpConnectionParams.setStaleCheckingEnabled(((HttpParams) (obj)), false);
            HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 60000);
            HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 60000);
            HttpConnectionParams.setSocketBufferSize(((HttpParams) (obj)), 8192);
            HttpClientParams.setRedirecting(((HttpParams) (obj)), false);
        }
        mParams = ((HttpParams) (obj));
        mManager = clientconnectionmanager;
        uvpn = 0;
    }

    public static void setCtx(Context context)
    {
        com/worklight/wlclient/fips/FipsHttpClient;
        JVM INSTR monitorenter ;
        ctx = context;
        com/worklight/wlclient/fips/FipsHttpClient;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        throw new RuntimeException("FipsHttpClient does not implement this method");
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        throw new RuntimeException("FipsHttpClient does not implement this method");
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        throw new RuntimeException("FipsHttpClient does not implement this method");
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        throw new RuntimeException("FipsHttpClient does not implement this method");
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        throw new RuntimeException("FipsHttpClient does not implement this method");
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        throw new RuntimeException("FipsHttpClient does not implement this method");
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
        throws IOException
    {
        try
        {
            httpurirequest = execute(httpurirequest, (HttpContext)null);
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            logger.error("IOException: ", httpurirequest);
            return null;
        }
        return httpurirequest;
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
        throws IOException
    {
        String s1 = httpurirequest.getMethod().toString();
        String s2 = httpurirequest.getURI().toString();
        String s = "";
        httpcontext = httpurirequest.getAllHeaders();
        String as[] = new String[httpcontext.length];
        for (int i = 0; i < httpcontext.length; i++)
        {
            as[i] = (new StringBuilder()).append(httpcontext[i].getName()).append(": ").append(httpcontext[i].getValue()).toString();
        }

        httpcontext = s;
        if (s1 == "POST")
        {
            try
            {
                httpcontext = EntityUtils.toString(((HttpEntityEnclosingRequest)httpurirequest).getEntity());
            }
            // Misplaced declaration of an exception variable
            catch (HttpUriRequest httpurirequest)
            {
                logger.debug((new StringBuilder()).append("IOException: ").append(httpurirequest).toString());
                httpcontext = s;
            }
        }
        httpurirequest = new String[5];
        httpurirequest[0] = (new StringBuilder()).append("redirect: ").append(HttpClientParams.isRedirecting(mParams)).toString();
        if (HttpConnectionParams.getConnectionTimeout(mParams) > 0)
        {
            httpurirequest[1] = (new StringBuilder()).append("connectTO: ").append(HttpConnectionParams.getConnectionTimeout(mParams)).toString();
        } else
        {
            httpurirequest[1] = "connectTO: 30";
        }
        if (HttpConnectionParams.getSoTimeout(mParams) > 0)
        {
            httpurirequest[2] = (new StringBuilder()).append("socketTO: ").append(HttpConnectionParams.getSoTimeout(mParams)).toString();
        } else
        {
            httpurirequest[2] = "socketTO: 30";
        }
        if (HttpConnectionParams.getSocketBufferSize(mParams) > 0)
        {
            httpurirequest[3] = (new StringBuilder()).append("socketSize: ").append(HttpConnectionParams.getSocketBufferSize(mParams)).toString();
        } else
        {
            httpurirequest[3] = "socketSize: 0";
        }
        httpurirequest[4] = (new StringBuilder()).append("CAPath: ").append(ctx.getFilesDir()).toString();
        return parseCurlResponse(nativeLib.curlExecute(share, uvpn, s2, s1, httpcontext, as, httpurirequest));
    }

    public String executeRaw(String s, String s1, String s2, String as[])
        throws IOException
    {
        Log.d(com/worklight/wlclient/fips/FipsHttpClient.getName(), (new StringBuilder()).append("entering executeRaw(),  url = ").append(s).toString());
        Log.d(com/worklight/wlclient/fips/FipsHttpClient.getName(), (new StringBuilder()).append("entering executeRaw(),  httpMethod = ").append(s1).toString());
        Log.d(com/worklight/wlclient/fips/FipsHttpClient.getName(), (new StringBuilder()).append("entering executeRaw(),  headers = ").append(as).toString());
        Log.d(com/worklight/wlclient/fips/FipsHttpClient.getName(), (new StringBuilder()).append("entering executeRaw(),  body = ").append(s2).toString());
        logger.debug("entering executeRaw(), ");
        String as1[] = new String[5];
        as1[0] = (new StringBuilder()).append("redirect: ").append(HttpClientParams.isRedirecting(mParams)).toString();
        if (HttpConnectionParams.getConnectionTimeout(mParams) > 0)
        {
            as1[1] = (new StringBuilder()).append("connectTO: ").append(HttpConnectionParams.getConnectionTimeout(mParams)).toString();
        } else
        {
            as1[1] = "connectTO: 30";
        }
        if (HttpConnectionParams.getSoTimeout(mParams) > 0)
        {
            as1[2] = (new StringBuilder()).append("socketTO: ").append(HttpConnectionParams.getSoTimeout(mParams)).toString();
        } else
        {
            as1[2] = "socketTO: 30";
        }
        if (HttpConnectionParams.getSocketBufferSize(mParams) > 0)
        {
            as1[3] = (new StringBuilder()).append("socketSize: ").append(HttpConnectionParams.getSocketBufferSize(mParams)).toString();
        } else
        {
            as1[3] = "socketSize: 0";
        }
        as1[4] = (new StringBuilder()).append("CAPath: ").append(ctx.getFilesDir()).toString();
        return new String(nativeLib.curlExecute(share, uvpn, s, s1, s2, as, as1));
    }

    public ClientConnectionManager getConnectionManager()
    {
        return mManager;
    }

    public HttpParams getParams()
    {
        return mParams;
    }

    protected HttpResponse parseCurlResponse(final byte curlRetBytes[])
        throws IOException
    {
        Object obj = new HttpResponseParser(new AbstractSessionInputBuffer() {

            final FipsHttpClient this$0;
            final byte val$curlRetBytes[];

            public boolean isDataAvailable(int j)
                throws IOException
            {
                throw new RuntimeException("SessionInputBuffer.isDataAvailable was unexpectedly called.");
            }

            
            {
                this$0 = FipsHttpClient.this;
                curlRetBytes = abyte0;
                super();
                init(new ByteArrayInputStream(curlRetBytes), 10, new BasicHttpParams());
            }
        }, new BasicLineParser(), new DefaultHttpResponseFactory(), new BasicHttpParams());
        try
        {
            obj = (HttpResponse)((HttpMessageParser) (obj)).parse();
            int i = Integer.valueOf(((HttpResponse) (obj)).getFirstHeader("Content-Length").getValue()).intValue();
            byte abyte0[] = new byte[i];
            System.arraycopy(curlRetBytes, curlRetBytes.length - i, abyte0, 0, i);
            curlRetBytes = new InputStreamEntity(new ByteArrayInputStream(abyte0), i);
            curlRetBytes.setContentType(((HttpResponse) (obj)).getFirstHeader("Content-Type"));
            ((HttpResponse) (obj)).setEntity(curlRetBytes);
        }
        // Misplaced declaration of an exception variable
        catch (final byte curlRetBytes[])
        {
            logger.error("Problem parsing Curl response: ", curlRetBytes);
            throw new IOException(curlRetBytes);
        }
        return ((HttpResponse) (obj));
    }

    public void resetCookies()
    {
        nativeLib.resetCookies();
    }

}
