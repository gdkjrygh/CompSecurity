// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.os.AsyncTask;
import com.pandora.radio.data.ad;
import com.pandora.radio.util.i;
import java.net.URI;
import java.net.URL;
import p.cw.c;
import p.cx.n;
import p.cx.t;

public class a extends AsyncTask
{

    public a()
    {
    }

    private void a(String s)
    {
        String s1;
        String s2;
        s1 = s;
        s2 = s;
        URL url = new URL(s);
        s1 = s;
        s2 = s;
        s = (new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef())).toURL().toString();
        s1 = s;
        s2 = s;
        c.z.p().a(s, p.cx.t.a.b);
_L1:
        return;
        s;
        if (s.a() != 204)
        {
            p.df.a.b("AdTrackingAsyncTask", (new StringBuilder()).append("Exception pinging tracking url : ").append(s1).toString(), s);
            return;
        }
          goto _L1
        s;
        p.df.a.c("AdTrackingAsyncTask", (new StringBuilder()).append("Exception pinging tracking url : ").append(s2).toString(), s);
        return;
    }

    protected transient Void a(ad aad[])
    {
        int j = 0;
        if (aad != null && aad[0] != null)
        {
            aad = aad[0].a();
            int k = aad.length;
            while (j < k) 
            {
                ad ad1 = aad[j];
                if (!i.a(ad1))
                {
                    a(((String) (ad1)));
                }
                j++;
            }
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((ad[])aobj);
    }
}
