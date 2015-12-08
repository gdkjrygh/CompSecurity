// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b.d;

import android.os.AsyncTask;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.b.e.a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.cmcm.adsdk.b.d:
//            d

public final class c extends AsyncTask
{

    private String a;
    private String b;
    private d c;

    public c(String s, String s1, d d1)
    {
        a = s;
        b = s1;
        c = d1;
    }

    private static String a(String s, String s1)
    {
        String s2;
        s2 = s;
        if (com.cmcm.adsdk.b.e.a.a(s1))
        {
            s2 = (new StringBuilder()).append(s).append("?").append(s1).toString();
        }
        com.cmcm.adsdk.b.c.b.a("RequestTask", (new StringBuilder("Get Url:")).append(s2).toString());
        s = new HttpGet(s2);
        s1 = s.getParams();
        HttpConnectionParams.setConnectionTimeout(s1, 5000);
        HttpConnectionParams.setSoTimeout(s1, 5000);
        s = (new DefaultHttpClient()).execute(s);
        if (s.getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        s = new String(a(s.getEntity().getContent()));
        return s;
        s;
        com.cmcm.adsdk.b.c.b.c("RequestTask", (new StringBuilder("get response error...")).append(s.getMessage()).toString());
        return null;
    }

    private static byte[] a(InputStream inputstream)
    {
        if (inputstream != null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            byte abyte0[] = new byte[1024];
            do
            {
                int i = inputstream.read(abyte0);
                if (i != -1)
                {
                    bytearrayoutputstream.write(abyte0, 0, i);
                } else
                {
                    inputstream.close();
                    return bytearrayoutputstream.toByteArray();
                }
            } while (true);
        } else
        {
            return null;
        }
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = a(a, b);
        com.cmcm.adsdk.b.c.b.a("RequestTask", (new StringBuilder("result:")).append(((String) (aobj))).toString());
        return ((Object) (aobj));
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        super.onPostExecute(obj);
        if (c != null)
        {
            c.a(((String) (obj)));
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
    }
}
