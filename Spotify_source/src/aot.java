// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.facebook.Request;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executor;

public class aot extends AsyncTask
{

    private static final String a = aot.getCanonicalName();
    private static Method b;
    private final aou c;
    private Exception d;

    public aot(aou aou1)
    {
        this(aou1, (byte)0);
    }

    private aot(aou aou1, byte byte0)
    {
        c = aou1;
    }

    private transient List b()
    {
        List list;
        try
        {
            list = Request.a(c);
        }
        catch (Exception exception)
        {
            d = exception;
            return null;
        }
        return list;
    }

    public final aot a()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        b.invoke(this, new Object[] {
            aph.c(), null
        });
        return this;
        Object obj;
        obj;
_L2:
        execute(new Void[0]);
        return this;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected Object doInBackground(Object aobj[])
    {
        return b();
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute((List)obj);
        if (d != null)
        {
            Log.d(a, String.format("onPostExecute: exception encountered during request: %s", new Object[] {
                d.getMessage()
            }));
        }
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (c.a == null)
        {
            c.a = new Handler();
        }
    }

    public String toString()
    {
        return (new StringBuilder("{RequestAsyncTask:  connection: ")).append(null).append(", requests: ").append(c).append("}").toString();
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
