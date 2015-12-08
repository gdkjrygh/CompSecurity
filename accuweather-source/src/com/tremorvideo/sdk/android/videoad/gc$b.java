// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.os.AsyncTask;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            gc, ct

class a extends AsyncTask
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

    ient(gc gc1)
    {
        a = gc1;
        super();
    }
}
