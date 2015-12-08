// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.osp.AsyncTaskCompat;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.netflix.mediaclient.nccp:
//            NccpKeyStore, NccpTransaction, RequestParameter, NccpResponseHandler, 
//            NccpResponse

public class NccpRequestTask extends AsyncTaskCompat
{

    public static final int DEFAULT_CONNECTION_TIMEOUT = 5000;
    public static final int DEFAULT_SOCKET_TIMEOUT = 3000;
    private final String TAG;
    private int connectionTimeout;
    private int socketTimeout;
    private NccpTransaction transaction;

    public NccpRequestTask(NccpTransaction nccptransaction)
    {
        TAG = "nf_nccp";
        connectionTimeout = 5000;
        socketTimeout = 3000;
        transaction = nccptransaction;
    }

    public NccpRequestTask(NccpTransaction nccptransaction, int i, int j)
    {
        this(nccptransaction);
        connectionTimeout = i;
        socketTimeout = j;
    }

    private HttpClient getNewHttpClient()
    {
        Object obj;
        try
        {
            obj = new SSLSocketFactory(NccpKeyStore.getInstance());
            ((SSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            BasicHttpParams basichttpparams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basichttpparams, "UTF-8");
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
            obj = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
        }
        catch (Exception exception)
        {
            Log.e("nf_nccp", "Failed to initialize http client");
            return new DefaultHttpClient();
        }
        return ((HttpClient) (obj));
    }

    protected transient NccpResponse doInBackground(Void avoid[])
    {
        Log.d("nf_nccp", "Starting nccp call...");
        avoid = getNewHttpClient();
        HttpParams httpparams = avoid.getParams();
        HttpConnectionParams.setConnectionTimeout(httpparams, connectionTimeout);
        HttpConnectionParams.setSoTimeout(httpparams, socketTimeout);
        httpparams.setParameter("http.useragent", transaction.getUserAgent());
        HttpPost httppost;
        Object obj;
        obj = transaction.getRequestBody();
        httppost = new HttpPost(transaction.getEndpoint());
        httppost.setEntity(new StringEntity(((String) (obj)), "UTF-8"));
        if (Log.isLoggable("nf_nccp", 3))
        {
            Log.d("nf_nccp", (new StringBuilder()).append("PostRequest:").append(httppost.getRequestLine()).toString());
            Log.d("nf_nccp", (new StringBuilder()).append("Endpoint ").append(transaction.getEndpoint()).toString());
            Log.d("nf_nccp", (new StringBuilder()).append("Content ").append(((String) (obj))).toString());
        }
        obj = transaction.getRequestHeaders();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        RequestParameter requestparameter;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); httppost.setHeader(requestparameter.name, requestparameter.value))
        {
            requestparameter = (RequestParameter)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_311;
        try
        {
            Log.d("nf_nccp", "Execute...");
            avoid = avoid.execute(httppost);
            Log.d("nf_nccp", "Response received...");
            avoid = transaction.processResponse(avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("nf_nccp", "Connection timeout", avoid);
            avoid = transaction.processError(avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("nf_nccp", "Socket timeout", avoid);
            avoid = transaction.processError(avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("nf_nccp", "Request protocol failed", avoid);
            avoid = transaction.processError(avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("nf_nccp", "Request IO failed ", avoid);
            avoid = transaction.processError(avoid);
        }
        if (transaction.getResponseHandler() != null)
        {
            Log.d("nf_nccp", "Handle response...");
            transaction.getResponseHandler().handle(transaction, avoid);
            return avoid;
        } else
        {
            Log.w("nf_nccp", "Response handler is null!");
            return avoid;
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }
}
