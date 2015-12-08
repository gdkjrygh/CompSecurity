// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.widget.Toast;
import com.google.userfeedback.android.api.a.a.f;
import java.io.File;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.FileEntity;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.google.userfeedback.android.api:
//            k, i, m, z, 
//            ah, j

public class SendUserFeedbackService extends Service
{

    private static boolean e;
    public String a;
    public ah b;
    private final IBinder c = new k(this);
    private int d;

    public SendUserFeedbackService()
    {
        d = i.gf_report_sent_failure;
    }

    static int a(SendUserFeedbackService senduserfeedbackservice)
    {
        return senduserfeedbackservice.d;
    }

    static int a(SendUserFeedbackService senduserfeedbackservice, int l)
    {
        senduserfeedbackservice.d = l;
        return l;
    }

    private void a()
    {
        e = false;
        if (m.c == null || m.c.g == null)
        {
            stopSelf();
            return;
        }
        if (!m.c.g.a())
        {
            break MISSING_BLOCK_LABEL_277;
        }
        Object obj = getString(i.gf_receiver_transport_scheme);
        String s = ((String) (obj));
        if ("".equals(obj))
        {
            s = "http";
        }
        obj = getString(i.gf_receiver_port);
        String s1;
        String s2;
        if ("".equals(obj))
        {
            obj = "";
        } else
        {
            obj = String.valueOf(obj);
            if (((String) (obj)).length() != 0)
            {
                obj = ":".concat(((String) (obj)));
            } else
            {
                obj = new String(":");
            }
        }
        s1 = String.valueOf(getString(i.gf_receiver_host));
        s2 = String.valueOf(getString(i.gf_receiver_path));
        a = (new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s1).length() + String.valueOf(obj).length() + String.valueOf(s2).length())).append(s).append("://").append(s1).append(((String) (obj))).append(s2).toString();
        b = m.c.a;
        try
        {
            obj = ((ConnectivityManager)b.a.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b();
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (((NetworkInfo) (obj)).isConnected())
        {
            b();
            return;
        }
        d = i.gf_report_queued;
        a(d);
        stopSelf();
        return;
        stopSelf();
        return;
    }

    private void b()
    {
        (new Thread(new j(this, m.c.g, this))).start();
    }

    protected final int a(File file)
    {
        Object obj = new HttpPost(a);
        ((HttpPost) (obj)).setHeader("Content-encoding", "gzip");
        ((HttpPost) (obj)).setEntity(new FileEntity(file, "application/x-protobuf"));
        file = new f(b.a.getContentResolver(), "AndroidGoogleUIF/1.0");
        org.apache.http.params.HttpParams httpparams = file.getParams();
        HttpConnectionParams.setConnectionTimeout(httpparams, 20000);
        HttpConnectionParams.setSoTimeout(httpparams, 20000);
        int l;
        try
        {
            obj = file.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
            file.a();
            l = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        }
        catch (IOException ioexception)
        {
            file.a();
            throw ioexception;
        }
        if (l < 300)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        (new StringBuilder(33)).append("Http response status: ").append(l);
        return l;
    }

    protected final void a(int l)
    {
        if (!e && !m.h)
        {
            Toast.makeText(b.a, l, 0).show();
            m.h = true;
        }
        e = true;
    }

    public IBinder onBind(Intent intent)
    {
        return c;
    }

    public void onCreate()
    {
        super.onCreate();
    }

    public void onStart(Intent intent, int l)
    {
        a();
    }

    public int onStartCommand(Intent intent, int l, int i1)
    {
        a();
        return 2;
    }
}
