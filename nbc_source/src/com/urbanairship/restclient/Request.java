// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Locale;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.urbanairship.restclient:
//            Response, AsyncHandler

public class Request extends HttpEntityEnclosingRequestBase
{
    private class BackgroundRequest extends AsyncTask
    {

        private final AsyncHandler handler;
        final Request this$0;

        protected transient Response doInBackground(Request arequest[])
        {
            if (arequest.length > 1)
            {
                throw new RuntimeException("Background Request only handles executing one Request at a time ");
            }
            arequest = arequest[0];
            Response response = arequest.execute();
            arequest = response;
            if (response == null) goto _L2; else goto _L1
_L1:
            if (destination == null) goto _L4; else goto _L3
_L3:
            FileOutputStream fileoutputstream;
            long l;
            destination.getParentFile().mkdirs();
            l = response.length();
            arequest = response.rawBody();
            fileoutputstream = new FileOutputStream(destination);
            int i = 0;
            byte abyte0[] = new byte[8192];
_L7:
            int j = arequest.read(abyte0);
            if (j == -1) goto _L6; else goto _L5
_L5:
            i += j;
            fileoutputstream.write(abyte0, 0, j);
            publishProgress(new Integer[] {
                Integer.valueOf((int)(((float)i / (float)l) * 100F))
            });
              goto _L7
            arequest;
            Logger.error(arequest);
            arequest = null;
_L2:
            return arequest;
_L6:
            fileoutputstream.flush();
            arequest.close();
            fileoutputstream.close();
            return response;
_L4:
            arequest = response;
            if (response.length() >= 0x100000L) goto _L2; else goto _L8
_L8:
            response.body();
            return response;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Request[])aobj);
        }

        protected void onPostExecute(Response response)
        {
            if (response != null)
            {
                handler.onComplete(response);
                return;
            } else
            {
                handler.onError(new Exception("Error when executing request."));
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Response)obj);
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            ainteger = ainteger[0];
            handler.onProgress(ainteger.intValue());
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        public BackgroundRequest(AsyncHandler asynchandler)
        {
            this$0 = Request.this;
            super();
            handler = asynchandler;
        }
    }


    private static final int BUFFER_SIZE = 8192;
    private static final int DEFAULT_SOCKET_BUFFER_SIZE = 16384;
    private static final int DEFAULT_TIMEOUT_MS = 60000;
    private static final long MAX_PREFETCH_BODY_LENGTH = 0x100000L;
    private static final String USER_AGENT_FORMAT = "%s (%s; %s; %s; %s; %s)";
    public static boolean verifySSLHostnames = true;
    File destination;
    DefaultHttpClient httpClient;
    String method;

    public Request(String s, String s1)
    {
        method = s;
        setURI(URI.create(s1));
        params = new BasicHttpParams();
        httpClient = new DefaultHttpClient(params);
        setSocketBufferSize(16384);
        setTimeout(60000);
        setUserAgent();
        Logger.verbose((new StringBuilder()).append("Set Timeout: ").append(HttpConnectionParams.getConnectionTimeout(httpClient.getParams())).toString());
        Logger.verbose((new StringBuilder()).append("Set Socket Buffer Size: ").append(HttpConnectionParams.getSocketBufferSize(httpClient.getParams())).toString());
    }

    private void setUserAgent()
    {
        String s = String.format(Locale.US, "%s (%s; %s; %s; %s; %s)", new Object[] {
            UAirship.getPackageName(), Build.MODEL, android.os.Build.VERSION.RELEASE, (new StringBuilder()).append("UrbanAirshipLib/").append(UAirship.getVersion()).toString(), UAirship.shared().getAirshipConfigOptions().getAppKey(), Locale.getDefault()
        });
        HttpProtocolParams.setUserAgent(params, s);
    }

    public Response execute()
    {
        Response response;
        try
        {
            response = new Response(httpClient.execute(this));
        }
        catch (IOException ioexception)
        {
            Logger.error((new StringBuilder()).append("IOException when executing request. Do you have permission to access the internet? (").append(ioexception.getMessage()).append(")").toString());
            return null;
        }
        return response;
    }

    public void executeAsync(final AsyncHandler asyncHandler)
    {
        (new Handler(Looper.getMainLooper())).post(new Runnable() {

            final Request this$0;
            final AsyncHandler val$asyncHandler;
            final Request val$r;

            public void run()
            {
                try
                {
                    (new BackgroundRequest(asyncHandler)).execute(new Request[] {
                        r
                    });
                    return;
                }
                catch (Exception exception)
                {
                    Logger.error("Unable to execute request.", exception);
                }
            }

            
            {
                this$0 = Request.this;
                asyncHandler = asynchandler;
                r = request1;
                super();
            }
        });
    }

    public String getMethod()
    {
        return method;
    }

    public void setAuth(String s, String s1)
    {
        s = new UsernamePasswordCredentials(s, s1);
        s1 = new BasicCredentialsProvider();
        s1.setCredentials(AuthScope.ANY, s);
        httpClient.setCredentialsProvider(s1);
    }

    public void setDestination(File file)
    {
        destination = file;
    }

    public void setPreemptiveAuth(String s, String s1)
    {
        s = new UsernamePasswordCredentials(s, s1);
        try
        {
            addHeader((new BasicScheme()).authenticate(s, this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error("Attempted to set invalid or non-applicable request credentials", s);
        }
    }

    public void setSocketBufferSize(int i)
    {
        HttpConnectionParams.setSocketBufferSize(params, i);
    }

    public void setTimeout(int i)
    {
        HttpConnectionParams.setConnectionTimeout(params, i);
    }

}
