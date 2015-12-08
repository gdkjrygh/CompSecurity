// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import com.arist.b.b;
import com.arist.c.a;
import com.arist.c.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.arist.model.lrc:
//            LrcView

public final class e extends AsyncTask
{

    private static final Executor a = Executors.newFixedThreadPool(3);
    private b b;
    private LrcView c;

    private e(b b1, LrcView lrcview)
    {
        b = b1;
        c = lrcview;
    }

    private transient String a()
    {
        Object obj1;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 10000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        obj1 = new DefaultHttpClient(basichttpparams);
        Object obj = obj1;
        Object obj2 = ((HttpClient) (obj1)).execute(new HttpGet((new StringBuilder("http://box.zhangmen.baidu.com/x?op=12&count=1&title=")).append(Uri.encode(b.d())).append("$$").append(Uri.encode(b.j())).append("$$$$").toString()));
        obj = obj1;
        int i = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
        if (i != 200)
        {
            ((HttpClient) (obj1)).getConnectionManager().closeExpiredConnections();
            return null;
        }
        obj = obj1;
        obj2 = a(((HttpResponse) (obj2)).getEntity().getContent());
        if (obj2 == null)
        {
            ((HttpClient) (obj1)).getConnectionManager().closeExpiredConnections();
            return null;
        }
        obj = obj1;
        obj2 = ((HttpClient) (obj1)).execute(new HttpGet(((String) (obj2))));
        obj = obj1;
        if (((HttpResponse) (obj2)).getStatusLine().getStatusCode() != 200) goto _L2; else goto _L1
_L1:
        obj = obj1;
        String s = (new StringBuilder(String.valueOf(a.F))).append(com.arist.c.c.d(b.e())).toString();
        obj = obj1;
        obj2 = a(((HttpResponse) (obj2)).getEntity().getContent(), s);
        ((HttpClient) (obj1)).getConnectionManager().closeExpiredConnections();
        return ((String) (obj2));
        Object obj3;
        obj3;
        obj1 = null;
_L10:
        obj = obj1;
        ((ClientProtocolException) (obj3)).printStackTrace();
        ((HttpClient) (obj1)).getConnectionManager().closeExpiredConnections();
        return null;
        obj;
        obj1 = null;
_L8:
        obj = obj1;
        Log.i("timeout", "chaoshi");
        ((HttpClient) (obj1)).getConnectionManager().closeExpiredConnections();
        return null;
        obj3;
        obj1 = null;
_L6:
        obj = obj1;
        ((Exception) (obj3)).printStackTrace();
        ((HttpClient) (obj1)).getConnectionManager().closeExpiredConnections();
        return null;
        obj;
        obj3 = null;
        obj1 = obj;
_L4:
        ((HttpClient) (obj3)).getConnectionManager().closeExpiredConnections();
        throw obj1;
_L2:
        ((HttpClient) (obj1)).getConnectionManager().closeExpiredConnections();
        return null;
        obj1;
        obj3 = obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj3;
        if (true) goto _L6; else goto _L5
_L5:
        SocketTimeoutException sockettimeoutexception;
        sockettimeoutexception;
        if (true) goto _L8; else goto _L7
_L7:
        obj3;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private static String a(InputStream inputstream)
    {
        XmlPullParser xmlpullparser;
        int i;
        xmlpullparser = Xml.newPullParser();
        xmlpullparser.setInput(inputstream, "UTF-8");
        i = xmlpullparser.getEventType();
_L5:
        if (i == 1)
        {
            return null;
        }
        i;
        JVM INSTR tableswitch 2 2: default 48
    //                   2 58;
           goto _L1 _L2
_L1:
        i = xmlpullparser.next();
          goto _L3
_L2:
        if ("lrcid".equals(xmlpullparser.getName()))
        {
            int j = Integer.parseInt(xmlpullparser.nextText());
            return (new StringBuilder("http://box.zhangmen.baidu.com/bdlrc/")).append(j / 100).append("/").append(j).append(".lrc").toString();
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static String a(InputStream inputstream, String s)
    {
        Object obj1 = null;
        com/arist/model/lrc/e;
        JVM INSTR monitorenter ;
        FileOutputStream fileoutputstream;
        File file;
        file = com.arist.c.c.b(s);
        fileoutputstream = new FileOutputStream(file);
        Object obj = fileoutputstream;
        byte abyte0[] = new byte[1024];
_L5:
        obj = fileoutputstream;
        int i = inputstream.read(abyte0);
        if (i != -1) goto _L2; else goto _L1
_L1:
        obj = fileoutputstream;
        inputstream = new File((new StringBuilder(String.valueOf(s))).append(".lrc").toString());
        obj = fileoutputstream;
        if (!file.renameTo(inputstream)) goto _L4; else goto _L3
_L3:
        obj = fileoutputstream;
        inputstream = inputstream.getAbsolutePath();
        fileoutputstream.flush();
        fileoutputstream.close();
        s = inputstream;
_L7:
        com/arist/model/lrc/e;
        JVM INSTR monitorexit ;
        return s;
_L2:
        obj = fileoutputstream;
        fileoutputstream.write(abyte0, 0, i);
          goto _L5
        s;
        inputstream = fileoutputstream;
_L10:
        obj = inputstream;
        s.printStackTrace();
        s = obj1;
        if (inputstream == null) goto _L7; else goto _L6
_L6:
        inputstream.flush();
        inputstream.close();
        s = obj1;
          goto _L7
        inputstream;
        inputstream.printStackTrace();
        s = obj1;
          goto _L7
        inputstream;
        throw inputstream;
        s;
        s.printStackTrace();
        s = inputstream;
          goto _L7
        inputstream;
        obj = null;
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ((FileOutputStream) (obj)).flush();
        ((FileOutputStream) (obj)).close();
_L8:
        throw inputstream;
        s;
        s.printStackTrace();
          goto _L8
_L4:
        fileoutputstream.flush();
        fileoutputstream.close();
        s = obj1;
          goto _L7
        inputstream;
        inputstream.printStackTrace();
        s = obj1;
          goto _L7
        inputstream;
          goto _L9
        s;
        inputstream = null;
          goto _L10
    }

    public static void a(b b1, LrcView lrcview)
    {
        String s = (new StringBuilder(String.valueOf(a.F))).append(b1.d()).append(".lrc").toString();
        if (com.arist.c.c.a(s))
        {
            lrcview.a(s);
            return;
        }
        s = (new StringBuilder(String.valueOf(a.F))).append(com.arist.c.c.d(b1.e())).append(".lrc").toString();
        if (com.arist.c.c.a(s))
        {
            lrcview.a(s);
            return;
        } else
        {
            lrcview.b();
            lrcview.setTag(b1.e());
            (new e(b1, lrcview)).executeOnExecutor(a, new Void[0]);
            return;
        }
    }

    protected final transient Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        if (c.getTag() != null && c.getTag().equals(b.e()))
        {
            c.a(((String) (obj)));
        }
    }

}
