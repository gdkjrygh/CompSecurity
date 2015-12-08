// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.util.GregorianCalendar;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct

public class gc
    implements eb.a, eb.c
{
    public static interface a
    {

        public abstract void a(int i, int j, int k);

        public abstract void a(JSONObject jsonobject);

        public abstract void b(String s);

        public abstract void n();
    }

    class b extends AsyncTask
    {

        final gc a;

        protected transient String a(String as[])
        {
            as = null;
            try
            {
                Object obj = new BasicHttpParams();
                HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 18000);
                HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 18000);
                ((HttpParams) (obj)).setBooleanParameter("http.protocol.expect-continue", false);
                ((HttpParams) (obj)).setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
                String s = "http://api.tmsdatadirect.com/movies/TheatresAndShowtimesByMovie?rType=json&srvcVersion=1.0&aid=tremorvi-401&key=R2r2u2I38QBd&movieId=***MOVIE***&rootId=8618532&postalCode=***ZIP***&country=USA&date=***DATE***&numDays=1&numTheatres=10&radius=20&radiusUnit=mi".replace("***ZIP***", a.d).replace("***DATE***", gc.a(a)).replace("***MOVIE***", a.e);
                ct.d((new StringBuilder()).append("TMS Date: ").append(gc.a(a)).toString());
                obj = (new DefaultHttpClient(((HttpParams) (obj)))).execute(new HttpGet(s));
                if (!isCancelled())
                {
                    as = gc.a(a, ((HttpResponse) (obj)).getEntity());
                }
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                ct.a("Error Sending Response: Exectuing POST", as);
                return null;
            }
            return as;
        }

        protected void a(String s)
        {
            if (!isCancelled() && a.f == this)
            {
                gc.a(a, s);
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((String[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((String)obj);
        }

        b()
        {
            a = gc.this;
            super();
        }
    }


    int a;
    int b;
    int c;
    String d;
    String e;
    b f;
    a g;
    String h;

    public gc()
    {
        d = "";
        e = "";
        h = "http://cac.transpera.com/ad/tms.txt";
    }

    static String a(gc gc1)
    {
        return gc1.c();
    }

    static String a(gc gc1, HttpEntity httpentity)
        throws Exception
    {
        return gc1.a(httpentity);
    }

    private String a(HttpEntity httpentity)
        throws Exception
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(httpentity.getContent());
        httpentity = new StringBuilder(Math.max(0, (int)httpentity.getContentLength()));
        byte abyte0[] = new byte[1024];
        do
        {
            int i = bufferedinputstream.read(abyte0);
            if (i > 0)
            {
                httpentity.append(new String(abyte0, 0, i));
            } else
            {
                return httpentity.toString();
            }
        } while (true);
    }

    static void a(gc gc1, String s)
    {
        gc1.a(s);
    }

    private void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        f = null;
        a1 = g;
        ct.d(s);
        if (a1 != null && s != null)
        {
            try
            {
                s = (new JSONObject(s)).getJSONObject("TMSMoviesWebService");
                if (s.getJSONObject("returnStatus").getInt("code") == 200)
                {
                    a1.a(s);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally
            {
                this;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        throw s;
    }

    private String c()
    {
        return String.format("%04d%02d%02d", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c)
        });
    }

    public void a()
    {
        if (f == null)
        {
            f = new b();
            f.execute(new String[0]);
        }
    }

    public void a(int i)
    {
        String s = String.valueOf(i);
        a(s, a, b, c);
        g.b(s);
    }

    public void a(ea.b b1, int i, int j, int k)
    {
        if (b1 == ea.b.F)
        {
            a(d, i, j + 1, k);
            g.a(i, j, k);
        }
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        g = a1;
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public void a(String s, int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        if (d == s)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        d = s;
        flag = true;
        if (a == i && b == j && c == k)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        a = i;
        b = j;
        c = k;
        flag = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (g != null)
        {
            g.n();
        }
        b();
        a();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(String s, String s1, String s2, GregorianCalendar gregoriancalendar)
    {
        d = s;
        e = s1;
        h = s2;
        a = gregoriancalendar.get(1);
        b = gregoriancalendar.get(2) + 1;
        c = gregoriancalendar.get(5);
    }

    public void b()
    {
        if (f != null)
        {
            f.cancel(true);
            f = null;
        }
    }
}
