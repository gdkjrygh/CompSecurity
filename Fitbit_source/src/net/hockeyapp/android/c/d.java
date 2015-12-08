// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.c;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import net.hockeyapp.android.b.a;
import net.hockeyapp.android.l;

public class d extends AsyncTask
{

    protected static final int a = 6;
    protected Context b;
    protected a c;
    protected String d;
    protected String e;
    protected String f;
    protected ProgressDialog g;
    private String h;

    public d(Context context, String s, a a1)
    {
        b = context;
        d = s;
        e = (new StringBuilder()).append(UUID.randomUUID()).append(".apk").toString();
        f = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/Download").toString();
        c = a1;
        h = null;
    }

    protected transient Long a(Void avoid[])
    {
        Object obj;
        int i;
        try
        {
            avoid = a(new URL(b()), 6);
            avoid.connect();
            i = avoid.getContentLength();
            obj = avoid.getContentType();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
            return Long.valueOf(0L);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((String) (obj)).contains("text"))
        {
            h = "The requested download does not appear to be a file.";
            return Long.valueOf(0L);
        }
        obj = new File(f);
        if (!((File) (obj)).mkdirs() && !((File) (obj)).exists())
        {
            throw new IOException((new StringBuilder()).append("Could not create the dir(s):").append(((File) (obj)).getAbsolutePath()).toString());
        }
        byte abyte0[];
        obj = new File(((File) (obj)), e);
        avoid = new BufferedInputStream(avoid.getInputStream());
        obj = new FileOutputStream(((File) (obj)));
        abyte0 = new byte[1024];
        long l1 = 0L;
_L1:
        int j = avoid.read(abyte0);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        l1 += j;
        publishProgress(new Integer[] {
            Integer.valueOf(Math.round(((float)l1 * 100F) / (float)i))
        });
        ((OutputStream) (obj)).write(abyte0, 0, j);
          goto _L1
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
        avoid.close();
        return Long.valueOf(l1);
    }

    protected URLConnection a(URL url, int i)
        throws IOException
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
        a(httpurlconnection);
        int j = httpurlconnection.getResponseCode();
        URL url1;
        if ((j == 301 || j == 302 || j == 303) && i != 0)
        {
            if (!url.getProtocol().equals((url1 = new URL(httpurlconnection.getHeaderField("Location"))).getProtocol()))
            {
                httpurlconnection.disconnect();
                return a(url1, i - 1);
            }
        }
        return httpurlconnection;
    }

    public void a()
    {
        b = null;
        g = null;
    }

    public void a(Context context)
    {
        b = context;
    }

    protected void a(Long long1)
    {
        android.app.AlertDialog.Builder builder;
        if (g != null)
        {
            try
            {
                g.dismiss();
            }
            catch (Exception exception) { }
        }
        if (long1.longValue() > 0L)
        {
            c.a(this);
            long1 = new Intent("android.intent.action.VIEW");
            long1.setDataAndType(Uri.fromFile(new File(f, e)), "application/vnd.android.package-archive");
            long1.setFlags(0x10000000);
            b.startActivity(long1);
            return;
        }
        builder = new android.app.AlertDialog.Builder(b);
        builder.setTitle(l.a(c, 256));
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        long1 = l.a(c, 257);
_L1:
        builder.setMessage(long1);
        builder.setNegativeButton(l.a(c, 258), new _cls1());
        builder.setPositiveButton(l.a(c, 259), new _cls2());
        builder.create().show();
        return;
        try
        {
            long1 = h;
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            return;
        }
          goto _L1
    }

    protected void a(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.addRequestProperty("User-Agent", "HockeySDK/Android");
        httpurlconnection.setInstanceFollowRedirects(true);
        if (android.os.Build.VERSION.SDK_INT <= 9)
        {
            httpurlconnection.setRequestProperty("connection", "close");
        }
    }

    protected transient void a(Integer ainteger[])
    {
        try
        {
            if (g == null)
            {
                g = new ProgressDialog(b);
                g.setProgressStyle(1);
                g.setMessage("Loading...");
                g.setCancelable(false);
                g.show();
            }
            g.setProgress(ainteger[0].intValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Integer ainteger[])
        {
            return;
        }
    }

    protected String b()
    {
        return (new StringBuilder()).append(d).append("&type=apk").toString();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Long)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
