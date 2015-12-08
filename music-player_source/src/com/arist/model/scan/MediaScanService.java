// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.scan;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.arist.c.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.arist.model.scan:
//            c, d, f, e

public class MediaScanService extends Service
    implements android.media.MediaScannerConnection.MediaScannerConnectionClient
{

    private static final List a = new ArrayList();
    private static int f;
    private String b[];
    private MediaScannerConnection c;
    private int d;
    private e e;
    private Handler g;

    public MediaScanService()
    {
        g = new com.arist.model.scan.c(this);
    }

    public static int a()
    {
        return f;
    }

    static void a(int i, Object obj)
    {
        if (i != 0 && f == 0)
        {
            f = i;
        } else
        {
            f = i;
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                d d1 = (d)iterator.next();
                if (d1 != null)
                {
                    d1.a(f, obj);
                }
            }
        }
    }

    public static void a(Context context)
    {
        context.startService(new Intent(context, com/arist/model/scan/MediaScanService));
    }

    static void a(MediaScanService mediascanservice)
    {
        if (b())
        {
            f = 3;
            a(3, null);
            com.arist.model.scan.f.a(mediascanservice.getApplicationContext(), mediascanservice.g);
        }
    }

    static void a(MediaScanService mediascanservice, String as[])
    {
        mediascanservice.d = 0;
        mediascanservice.b = as;
        mediascanservice.c = new MediaScannerConnection(mediascanservice.getApplicationContext(), mediascanservice);
        mediascanservice.c.connect();
    }

    public static void a(d d1)
    {
        if (!a.contains(d1))
        {
            a.add(d1);
        }
    }

    public static void b(Context context)
    {
        Intent intent = new Intent(context, com/arist/model/scan/MediaScanService);
        intent.putExtra("exit", true);
        context.startService(intent);
    }

    public static void b(d d1)
    {
        a.remove(d1);
    }

    public static boolean b()
    {
        return f != 0 && f != 4;
    }

    public static void c()
    {
        if (f == 4)
        {
            f = 0;
        }
    }

    private void d()
    {
        if (f != 2)
        {
            return;
        }
        if (b == null || d >= b.length)
        {
            g.sendEmptyMessage(3);
            return;
        } else
        {
            c.scanFile(b[d], "audio/*");
            return;
        }
    }

    private void e()
    {
        if (e != null)
        {
            e.a();
            e = null;
        }
        if (c != null && c.isConnected())
        {
            c.disconnect();
        }
        c = null;
        b = null;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        e();
        super.onDestroy();
    }

    public void onMediaScannerConnected()
    {
        d();
    }

    public void onScanCompleted(String s, Uri uri)
    {
        d = d + 1;
        g.obtainMessage(2, d, b.length).sendToTarget();
        d();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null && intent.getBooleanExtra("exit", false))
        {
            a(0, null);
            e();
            stopSelf();
        } else
        if (!b())
        {
            a(1, "");
            e = new e(getApplicationContext().getContentResolver(), g, com.arist.c.c.a(getApplicationContext()));
            e.start();
            return 1;
        }
        return 1;
    }

}
