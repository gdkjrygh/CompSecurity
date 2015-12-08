// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.facebook:
//            GraphRequestBatch, GraphRequest, FacebookSdk

public class GraphRequestAsyncTask extends AsyncTask
{

    private static final String TAG = com/facebook/GraphRequestAsyncTask.getCanonicalName();
    private final HttpURLConnection connection;
    private Exception exception;
    private final GraphRequestBatch requests;

    public GraphRequestAsyncTask(GraphRequestBatch graphrequestbatch)
    {
        this(null, graphrequestbatch);
    }

    public GraphRequestAsyncTask(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
    {
        requests = graphrequestbatch;
        connection = httpurlconnection;
    }

    public GraphRequestAsyncTask(HttpURLConnection httpurlconnection, Collection collection)
    {
        this(httpurlconnection, new GraphRequestBatch(collection));
    }

    public transient GraphRequestAsyncTask(HttpURLConnection httpurlconnection, GraphRequest agraphrequest[])
    {
        this(httpurlconnection, new GraphRequestBatch(agraphrequest));
    }

    public GraphRequestAsyncTask(Collection collection)
    {
        this(null, new GraphRequestBatch(collection));
    }

    public transient GraphRequestAsyncTask(GraphRequest agraphrequest[])
    {
        this(null, new GraphRequestBatch(agraphrequest));
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient List doInBackground(Void avoid[])
    {
        try
        {
            if (connection == null)
            {
                return requests.executeAndWait();
            }
            avoid = GraphRequest.executeConnectionAndWait(connection, requests);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            exception = avoid;
            return null;
        }
        return avoid;
    }

    protected final Exception getException()
    {
        return exception;
    }

    protected final GraphRequestBatch getRequests()
    {
        return requests;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        super.onPostExecute(list);
        if (exception != null)
        {
            Log.d(TAG, String.format("onPostExecute: exception encountered during request: %s", new Object[] {
                exception.getMessage()
            }));
        }
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (FacebookSdk.isDebugEnabled())
        {
            Log.d(TAG, String.format("execute async task: %s", new Object[] {
                this
            }));
        }
        if (requests.getCallbackHandler() == null)
        {
            Handler handler;
            if (Thread.currentThread() instanceof HandlerThread)
            {
                handler = new Handler();
            } else
            {
                handler = new Handler(Looper.getMainLooper());
            }
            requests.setCallbackHandler(handler);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("{RequestAsyncTask: ").append(" connection: ").append(connection).append(", requests: ").append(requests).append("}").toString();
    }

}
