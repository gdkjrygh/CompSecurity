// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook:
//            s, ak, GraphRequest

public class aj extends AsyncTask
{

    private static final String a = com/facebook/aj.getCanonicalName();
    private static Method b;
    private final HttpURLConnection c;
    private final ak d;
    private Exception e;

    public aj(ak ak1)
    {
        this(null, ak1);
    }

    public aj(HttpURLConnection httpurlconnection, ak ak1)
    {
        d = ak1;
        c = httpurlconnection;
    }

    aj a()
    {
        if (b != null)
        {
            try
            {
                b.invoke(this, new Object[] {
                    s.d(), null
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

    protected transient List a(Void avoid[])
    {
        try
        {
            if (c == null)
            {
                return d.g();
            }
            avoid = GraphRequest.a(c, d);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            e = avoid;
            return null;
        }
        return avoid;
    }

    protected void a(List list)
    {
        super.onPostExecute(list);
        if (e != null)
        {
            Log.d(a, String.format("onPostExecute: exception encountered during request: %s", new Object[] {
                e.getMessage()
            }));
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (d.c() == null)
        {
            d.a(new Handler());
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("{RequestAsyncTask: ").append(" connection: ").append(c).append(", requests: ").append(d).append("}").toString();
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
                    b = method;
                }
                return;
            }
            i++;
        } while (true);
    }
}
