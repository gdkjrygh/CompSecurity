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
//            GraphRequest, g, i

public class h extends AsyncTask
{

    private static final String a = com/facebook/h.getCanonicalName();
    private static Method b;
    private final HttpURLConnection c;
    private final i d;
    private Exception e;

    public h(i j)
    {
        this(j, (byte)0);
    }

    private h(i j, byte byte0)
    {
        d = j;
        c = null;
    }

    private transient List b()
    {
        List list;
        try
        {
            if (c == null)
            {
                return GraphRequest.a(d);
            }
            list = GraphRequest.a(c, d);
        }
        catch (Exception exception)
        {
            e = exception;
            return null;
        }
        return list;
    }

    final h a()
    {
        if (b != null)
        {
            try
            {
                b.invoke(this, new Object[] {
                    g.e(), null
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

    protected Object doInBackground(Object aobj[])
    {
        return b();
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute((List)obj);
        if (e != null)
        {
            Log.d(a, String.format("onPostExecute: exception encountered during request: %s", new Object[] {
                e.getMessage()
            }));
        }
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (g.b())
        {
            Log.d(a, String.format("execute async task: %s", new Object[] {
                this
            }));
        }
        if (d.a == null)
        {
            d.a = new Handler();
        }
    }

    public String toString()
    {
        return (new StringBuilder("{RequestAsyncTask:  connection: ")).append(c).append(", requests: ").append(d).append("}").toString();
    }

    static 
    {
        Method amethod[] = android/os/AsyncTask.getMethods();
        int k = amethod.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    Method method = amethod[j];
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
            j++;
        } while (true);
    }
}
