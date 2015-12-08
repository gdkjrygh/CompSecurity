// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdListener;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            g, h

public abstract class f extends AsyncTask
{

    private static final ScheduledThreadPoolExecutor a = new ScheduledThreadPoolExecutor(10);
    private final AdListener b;
    private final h c;
    private final Object d = new Object();
    private boolean e;
    private int f;

    f(h h1, AdListener adlistener)
    {
        b = adlistener;
        c = h1;
        f = 0;
        e = false;
    }

    public static Future a(Callable callable)
    {
        return a.submit(callable);
    }

    protected abstract Object a(JSONObject jsonobject);

    protected transient Object a(JSONObject ajsonobject[])
    {
        Object obj;
        obj = null;
        if (ajsonobject.length != 1)
        {
            Log.w("Ads", "Incorrect number of ad JSON objects.");
            a(0);
            return null;
        }
        ajsonobject = ((JSONObject []) (a(ajsonobject[0])));
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        if (e)
        {
            ajsonobject = obj;
        }
        obj1;
        JVM INSTR monitorexit ;
        return ajsonobject;
        ajsonobject;
        obj1;
        JVM INSTR monitorexit ;
        throw ajsonobject;
    }

    protected Future a(JSONObject jsonobject, String s, boolean flag)
    {
        if (flag)
        {
            jsonobject = jsonobject.getJSONObject(s);
        } else
        {
            jsonobject = jsonobject.optJSONObject(s);
        }
        s = jsonobject;
        if (jsonobject == null)
        {
            s = new JSONObject();
        }
        if (flag)
        {
            jsonobject = s.getString("url");
        } else
        {
            jsonobject = s.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            a(0, flag);
            return new g(null);
        } else
        {
            return c.a(jsonobject, new _cls1(flag));
        }
    }

    protected void a(int i)
    {
        synchronized (d)
        {
            e = true;
            f = i;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(int i, boolean flag)
    {
        if (flag)
        {
            a(i);
        }
    }

    protected abstract void a(Object obj);

    protected Object doInBackground(Object aobj[])
    {
        return a((JSONObject[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        if (e || obj == null)
        {
            if (b != null)
            {
                b.onAdFailedToLoad(f);
            }
            return;
        } else
        {
            a(obj);
            return;
        }
    }


    private class _cls1
        implements h.a
    {

        final boolean a;
        final f b;

        public Drawable a()
        {
            b.a(2, a);
            return null;
        }

        public Drawable a(InputStream inputstream)
        {
            inputstream = h.a(inputstream);
            if (inputstream == null)
            {
                b.a(2, a);
                return null;
            }
            inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
            if (inputstream == null)
            {
                b.a(2, a);
                return null;
            } else
            {
                return new BitmapDrawable(Resources.getSystem(), inputstream);
            }
        }

        public Object b()
        {
            return a();
        }

        public Object b(InputStream inputstream)
        {
            return a(inputstream);
        }

        _cls1(boolean flag)
        {
            b = f.this;
            a = flag;
            super();
        }
    }

}
