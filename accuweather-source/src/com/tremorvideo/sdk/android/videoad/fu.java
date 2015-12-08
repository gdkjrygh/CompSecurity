// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fp, az, ct, ch

public class fu extends fp
{
    private class a extends Exception
    {

        final fu a;

        public a(String s)
        {
            a = fu.this;
            super(s);
        }
    }


    Context a;
    az b;
    boolean c;
    boolean d;
    int e;
    Checksum f;

    public fu(fp.a a1, Context context, Map map)
    {
        super(a1);
        e = 0;
        a = context;
        b = (az)map.get("ad");
        e = ((Integer)map.get("index")).intValue();
        f = new CRC32();
    }

    private long a(String s)
        throws Exception
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 18000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 18000);
        basichttpparams.setBooleanParameter("http.protocol.expect-continue", false);
        basichttpparams.setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
        return (new DefaultHttpClient(basichttpparams)).execute(new HttpGet(s)).getEntity().getContentLength();
    }

    private void a(File file)
        throws Exception
    {
        int i;
        long l;
        i = b.b(e);
        l = file.length();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        i = (int)a(b.a(e));
        if (l != (long)i) goto _L2; else goto _L1
_L1:
        if (!ct.a(f, file, b.f(e))) goto _L4; else goto _L3
_L3:
        ct.d("Video is fully cached.");
        if (false)
        {
            throw new NullPointerException();
        }
        if (false)
        {
            throw new NullPointerException();
        }
        if (false)
        {
            throw new NullPointerException();
        }
_L15:
        return;
_L4:
        file.delete();
        throw new a("CRC Failure");
        file;
        Object obj;
        java.io.FileOutputStream fileoutputstream;
        fileoutputstream = null;
        obj = null;
_L5:
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        if (false)
        {
            throw new NullPointerException();
        }
        if (fileoutputstream != null)
        {
            fileoutputstream.close();
        }
        throw file;
_L2:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        ct.d((new StringBuilder()).append("Resuming download from: ").append(l).append(" bytes...").toString());
        ct.a(f, file);
        fileoutputstream = a.openFileOutput(file.getName(), 32769);
_L6:
        Object obj1;
        obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 18000);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 18000);
        ((HttpParams) (obj)).setBooleanParameter("http.protocol.expect-continue", false);
        ((HttpParams) (obj)).setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
        obj1 = new DefaultHttpClient(((HttpParams) (obj)));
        obj = new HttpGet(b.a(e));
        ((HttpGet) (obj)).addHeader("Range", (new StringBuilder()).append("bytes=").append(l).append("-").toString());
        obj = ((HttpClient) (obj1)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        obj1 = ((HttpResponse) (obj)).getEntity();
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() / 100 != 2)
        {
            throw new Exception((new StringBuilder()).append("Connection response is invalid: ").append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).toString());
        }
        break MISSING_BLOCK_LABEL_426;
        file;
        obj = null;
          goto _L5
        ct.d("Begining Download...");
        fileoutputstream = a.openFileOutput(file.getName(), 1);
          goto _L6
        long l1 = ((HttpEntity) (obj1)).getContentLength();
        if (l1 >= 1L)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        throw new Exception((new StringBuilder()).append("Content length is invalid: ").append(l1).toString());
        obj1 = ((HttpEntity) (obj1)).getContent();
        obj = new byte[1024];
_L8:
        int j = ((InputStream) (obj1)).read(((byte []) (obj)));
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_539;
        }
        f.update(((byte []) (obj)), 0, j);
        fileoutputstream.write(((byte []) (obj)), 0, j);
        l += j;
        if (!c) goto _L8; else goto _L7
_L7:
        d = true;
        if (d) goto _L10; else goto _L9
_L9:
        l = file.length();
        l1 = b.f(e);
        if (l1 != 0L) goto _L12; else goto _L11
_L11:
        ct.d("No CRC");
        obj = null;
_L13:
        if (l == (long)i)
        {
            break MISSING_BLOCK_LABEL_633;
        }
        obj = (new StringBuilder()).append("Incomplete Download. Recieved: ").append(l).append(". Expected: ").append(b.b(e)).append(".").toString();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        file.delete();
        throw new a(((String) (obj)));
_L12:
        if (f.getValue() != l1)
        {
            obj = (new StringBuilder()).append("CRC is invalid got: ").append(f.getValue()).append(", expected: ").append(l1).toString();
            continue; /* Loop/switch isn't completed */
        }
        ct.d((new StringBuilder()).append("CRC is GOOD: ").append(l1).toString());
        obj = null;
        if (true) goto _L13; else goto _L10
_L10:
        if (obj1 != null)
        {
            ((InputStream) (obj1)).close();
        }
        if (false)
        {
            throw new NullPointerException();
        }
        if (fileoutputstream == null) goto _L15; else goto _L14
_L14:
        fileoutputstream.close();
        return;
        file;
        obj = obj1;
          goto _L5
    }

    private void a(boolean flag)
    {
        boolean flag2 = false;
        a(ch.a(a.getFilesDir(), b.e(e)));
        boolean flag1 = false;
_L2:
        if (flag1)
        {
            a(fp.b.d);
            return;
        }
        break; /* Loop/switch isn't completed */
        Object obj;
        obj;
        ct.a("An error occured while downloading a video: ", ((Throwable) (obj)));
        flag1 = true;
        continue; /* Loop/switch isn't completed */
        obj;
        ct.a("An error occured while downloading a video: ", ((Throwable) (obj)));
        flag1 = false;
        flag2 = true;
        if (true) goto _L2; else goto _L1
_L1:
        if (flag2)
        {
            a(fp.b.c);
            return;
        }
        if (d)
        {
            a(fp.b.e);
            return;
        } else
        {
            a(fp.b.b);
            return;
        }
    }

    protected void e()
    {
        c = false;
        d = false;
        a(false);
    }

    protected void f()
    {
        c = true;
    }

    protected void g()
    {
        c = false;
        d = false;
        a(true);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Download Video (").append(e).append("): ").append(b.e(e)).toString();
    }
}
