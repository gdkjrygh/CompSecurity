// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.os.AsyncTask;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            RequestBatch, Request, Settings

public class RequestAsyncTask extends AsyncTask
{

    private static final String TAG = com/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask.getCanonicalName();
    private static Method executeOnExecutorMethod;
    private final HttpURLConnection connection;
    private Exception exception;
    private final RequestBatch requests;

    public RequestAsyncTask(RequestBatch requestbatch)
    {
        this(null, requestbatch);
    }

    public RequestAsyncTask(HttpURLConnection httpurlconnection, RequestBatch requestbatch)
    {
        requests = requestbatch;
        connection = httpurlconnection;
    }

    public RequestAsyncTask(HttpURLConnection httpurlconnection, Collection collection)
    {
        this(httpurlconnection, new RequestBatch(collection));
    }

    public transient RequestAsyncTask(HttpURLConnection httpurlconnection, Request arequest[])
    {
        this(httpurlconnection, new RequestBatch(arequest));
    }

    public RequestAsyncTask(Collection collection)
    {
        this(null, new RequestBatch(collection));
    }

    public transient RequestAsyncTask(Request arequest[])
    {
        this(null, new RequestBatch(arequest));
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
            avoid = Request.executeConnectionAndWait(connection, requests);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            exception = avoid;
            return null;
        }
        return avoid;
    }

    RequestAsyncTask executeOnSettingsExecutor()
    {
        if (executeOnExecutorMethod != null)
        {
            try
            {
                executeOnExecutorMethod.invoke(this, new Object[] {
                    Settings.getExecutor(), null
                });
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                return this;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                return this;
            }
            return this;
        } else
        {
            execute(new Void[0]);
            return this;
        }
    }

    protected final Exception getException()
    {
        return exception;
    }

    protected final RequestBatch getRequests()
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
            String.format("onPostExecute: exception encountered during request: %s", new Object[] {
                exception.getMessage()
            });
        }
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (requests.getCallbackHandler() == null)
        {
            requests.setCallbackHandler(new Handler());
        }
    }

    public String toString()
    {
        return (new StringBuilder("{RequestAsyncTask:  connection: ")).append(connection).append(", requests: ").append(requests).append("}").toString();
    }

    static 
    {
        Method amethod[] = android/os/AsyncTask.getMethods();
        int j = amethod.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    Method method = amethod[i];
                    if (!"executeOnExecutor".equals(method.getName()))
                    {
                        break label0;
                    }
                    Class aclass[] = method.getParameterTypes();
                    if (aclass.length != 2 || aclass[0] != java/util/concurrent/Executor || !aclass[1].isArray())
                    {
                        break label0;
                    }
                    executeOnExecutorMethod = method;
                }
                return;
            }
            i++;
        } while (true);
    }
}
