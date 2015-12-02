// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import com.mobvista.sdk.m.a.b.a.a;
import com.mobvista.sdk.m.a.e.c;
import com.mobvista.sdk.m.a.f.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.mobvista.sdk.m.a.d.a:
//            j

public final class i extends c
{

    private String a;
    private String b;
    private String f;
    private boolean g;
    private com.mobvista.sdk.m.a.d.a.j h;

    public i(String s, String s1, String s2)
    {
        g = false;
        a = s;
        b = s1;
        f = s2;
    }

    private void a(String s, String s1)
    {
        if (h != null)
        {
            h.a(s, s1);
        }
    }

    private void b(String s, String s1)
    {
        if (h != null)
        {
            h.a(s);
        }
    }

    private void c()
    {
        if (d())
        {
            String s = f;
            e();
        }
    }

    private boolean d()
    {
        Object obj2;
        boolean flag;
        flag = true;
        obj2 = null;
        Object obj;
        File file;
        File file1;
        file = new File(f);
        if (!file.exists())
        {
            file.mkdirs();
        }
        if (file.exists())
        {
            file.delete();
        }
        file1 = new File((new StringBuilder()).append(f).append(".temp").toString());
        if (file1.exists())
        {
            file1.delete();
        }
        obj = new DefaultHttpClient();
        HttpParams httpparams = ((DefaultHttpClient) (obj)).getParams();
        httpparams.setParameter("http.protocol.expect-continue", Boolean.valueOf(false));
        ((DefaultHttpClient) (obj)).setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        HttpConnectionParams.setConnectionTimeout(httpparams, 30000);
        HttpConnectionParams.setSoTimeout(httpparams, 30000);
        Object obj1 = obj;
        obj2 = ((HttpClient) (obj)).execute(new HttpGet(b));
        obj1 = obj;
        int k = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
        if (k != 200) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        obj2 = ((HttpResponse) (obj2)).getEntity();
        obj1 = obj;
        ((HttpEntity) (obj2)).getContentLength();
        obj1 = obj;
        obj2 = ((HttpEntity) (obj2)).getContent();
        obj1 = obj;
        FileOutputStream fileoutputstream = new FileOutputStream(file1, true);
        obj1 = obj;
        byte abyte0[] = new byte[2048];
_L4:
        obj1 = obj;
        k = ((InputStream) (obj2)).read(abyte0);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        fileoutputstream.write(abyte0, 0, k);
        if (true) goto _L4; else goto _L3
        obj1;
_L13:
        b(b, ((Exception) (obj1)).getMessage());
        ((Exception) (obj1)).printStackTrace();
        if (obj != null)
        {
            ((HttpClient) (obj)).getConnectionManager().shutdown();
        }
_L8:
        return false;
_L3:
        obj1 = obj;
        ((InputStream) (obj2)).close();
        obj1 = obj;
        fileoutputstream.flush();
        obj1 = obj;
        fileoutputstream.close();
        obj1 = obj;
        file1.renameTo(file);
        obj1 = obj;
        com.mobvista.sdk.m.a.b.a.a.b("ImageWorker", (new StringBuilder("download file from [")).append(b).append("] save to [").append(f).append("]").toString());
_L6:
        ((HttpClient) (obj)).getConnectionManager().shutdown();
        return flag;
_L2:
        obj1 = obj;
        b(b, (new StringBuilder("load image from http faild because http return code: ")).append(k).append(".image url is ").append(b).toString());
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        obj = null;
_L11:
        obj1 = obj;
        b(b, ((OutOfMemoryError) (obj2)).getMessage());
        if (obj == null) goto _L8; else goto _L7
_L7:
        ((HttpClient) (obj)).getConnectionManager().shutdown();
        return false;
        obj;
        obj1 = null;
_L10:
        if (obj1 != null)
        {
            ((HttpClient) (obj1)).getConnectionManager().shutdown();
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L10; else goto _L9
_L9:
        obj2;
          goto _L11
        obj1;
        obj = obj2;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private void e()
    {
        if ((new File(f)).exists())
        {
            a(b, f);
            return;
        } else
        {
            String s = (new StringBuilder("load image faild.because file[")).append(f).append("] is not exist!").toString();
            com.mobvista.sdk.m.a.b.a.a.b("ImageWorker", s);
            b(b, s);
            return;
        }
    }

    public final void a()
    {
        if (!g)
        {
            if (j.a(f))
            {
                b(b, "save path is null.");
                return;
            }
            File file = new File(f);
            if (!file.exists() || file.length() <= 0L)
            {
                c();
                return;
            } else
            {
                e();
                return;
            }
        } else
        {
            c();
            return;
        }
    }

    public final void a(com.mobvista.sdk.m.a.d.a.j j1)
    {
        h = j1;
    }

    public final void a(boolean flag)
    {
        g = flag;
    }
}
