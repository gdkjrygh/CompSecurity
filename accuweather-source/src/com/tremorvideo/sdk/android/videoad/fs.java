// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fp, az, ey, ch, 
//            ct

public class fs extends fp
{

    az a;
    File b;
    Context c;
    boolean d;

    public fs(fp.a a1, Context context, az az1)
    {
        super(a1);
        a = az1;
        c = context;
        d = false;
    }

    private void h()
    {
        if (a.s() == null)
        {
            a(fp.b.b);
            return;
        }
        i();
        if (!d)
        {
            a(fp.b.c);
            return;
        } else
        {
            a.s().a(b);
            a(fp.b.b);
            return;
        }
    }

    private void i()
    {
        Object obj;
        FileOutputStream fileoutputstream;
        FileOutputStream fileoutputstream1;
        BasicHttpParams basichttpparams;
        basichttpparams = null;
        fileoutputstream1 = null;
        fileoutputstream = fileoutputstream1;
        obj = basichttpparams;
        b = ch.a(c.getFilesDir(), "survey-image");
        fileoutputstream = fileoutputstream1;
        obj = basichttpparams;
        fileoutputstream1 = c.openFileOutput(b.getName(), 32769);
        fileoutputstream = fileoutputstream1;
        obj = fileoutputstream1;
        basichttpparams = new BasicHttpParams();
        fileoutputstream = fileoutputstream1;
        obj = fileoutputstream1;
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 18000);
        fileoutputstream = fileoutputstream1;
        obj = fileoutputstream1;
        HttpConnectionParams.setSoTimeout(basichttpparams, 18000);
        fileoutputstream = fileoutputstream1;
        obj = fileoutputstream1;
        basichttpparams.setBooleanParameter("http.protocol.expect-continue", false);
        fileoutputstream = fileoutputstream1;
        obj = fileoutputstream1;
        basichttpparams.setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
        fileoutputstream = fileoutputstream1;
        obj = fileoutputstream1;
        (new DefaultHttpClient(basichttpparams)).execute(new HttpGet(a.s().c())).getEntity().writeTo(fileoutputstream1);
        fileoutputstream = fileoutputstream1;
        obj = fileoutputstream1;
        d = true;
        if (fileoutputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        fileoutputstream1.close();
_L2:
        return;
        Exception exception3;
        exception3;
        obj = fileoutputstream;
        ct.a("Error Downloading Image: ", exception3);
        if (fileoutputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            fileoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        Exception exception2;
        exception2;
        Exception exception;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            catch (Exception exception1) { }
        }
        throw exception2;
        exception;
    }

    protected void e()
    {
        h();
    }

    protected void f()
    {
    }

    protected void g()
    {
        h();
    }

    public String toString()
    {
        return "Download Survey";
    }
}
