// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.os.AsyncTask;
import org.apache.http.HttpResponse;

// Referenced classes of package com.qihoo.antivirus.update:
//            d, af, x, t, 
//            ab

public class c extends AsyncTask
    implements x.a
{

    public final d a;
    private final String b;
    private final String c;
    private String d;
    private final String e;
    private final long f;
    private final boolean g;
    private long h;

    public c(d d1, String s, String s1, String s2, long l, boolean flag)
    {
        h = 0L;
        a = d1;
        b = s;
        c = s1;
        e = s2;
        f = l;
        g = flag;
    }

    private String a(String s)
    {
        return (new StringBuilder(String.valueOf(s))).append(".patch").toString();
    }

    protected transient ab a(String as[])
    {
        as = a.e();
        boolean flag = af.a(a.e());
        char c1 = '\0';
        if (flag)
        {
            c1 = '\u2710';
        }
        org.apache.http.client.HttpClient httpclient = x.a(x.e(as), c1);
        if (g)
        {
            as = a(c);
        } else
        {
            as = c;
        }
        d = as;
        as = new t(a, b, d, this, e, f);
        if (!as.a(httpclient))
        {
            return as;
        } else
        {
            return null;
        }
    }

    public void a(int i, String s)
    {
    }

    public void a(long l, long l1)
        throws InterruptedException
    {
        publishProgress(new Long[] {
            Long.valueOf(l), Long.valueOf(l1)
        });
        if (isCancelled())
        {
            throw new InterruptedException();
        } else
        {
            return;
        }
    }

    protected void a(ab ab1)
    {
        if (ab1 == null)
        {
            a.f(d);
            return;
        } else
        {
            a.b(ab1);
            return;
        }
    }

    public void a(HttpResponse httpresponse)
    {
    }

    protected transient void a(Long along[])
    {
        long l = System.currentTimeMillis();
        if (l - h > 1000L)
        {
            h = l;
            a.b(along[0].longValue(), along[1].longValue());
        }
    }

    protected transient Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ab)obj);
    }

    protected transient void onProgressUpdate(Object aobj[])
    {
        a((Long[])aobj);
    }
}
