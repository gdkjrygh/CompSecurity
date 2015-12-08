// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.common.b.g;
import com.umeng.common.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService, c, j, l

class h extends Thread
{

    final DownloadingService a;
    private Context b;
    private String c;
    private int d;
    private long e;
    private long f;
    private int g;
    private int h;
    private opSelf i;
    private opSelf j;

    static Context a(h h1)
    {
        return h1.b;
    }

    private void a(Exception exception)
    {
        Log.b(DownloadingService.a(), (new StringBuilder("can not install. ")).append(exception.getMessage()).toString());
        if (i != null)
        {
            i.a(h, exception);
        }
        DownloadingService.a(a, j, e, f, d);
    }

    private void a(boolean flag)
    {
        Object obj1 = (new StringBuilder(String.valueOf(com.umeng.common.b.g.a(j.j)))).append(".apk.tmp").toString();
        if (!com.umeng.common.b.b()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        obj2 = new File(c, ((String) (obj1)));
        obj = new FileOutputStream(((File) (obj2)), true);
_L8:
        Object obj3;
        Log.c(DownloadingService.a(), String.format("saveAPK: url = %1$15s\t|\tfilename = %2$15s", new Object[] {
            j.j, ((File) (obj2)).getAbsolutePath()
        }));
        obj3 = (HttpURLConnection)(new URL(j.j)).openConnection();
        ((HttpURLConnection) (obj3)).setRequestMethod("GET");
        ((HttpURLConnection) (obj3)).setRequestProperty("Accept-Encoding", "identity");
        ((HttpURLConnection) (obj3)).addRequestProperty("Connection", "keep-alive");
        ((HttpURLConnection) (obj3)).setConnectTimeout(5000);
        ((HttpURLConnection) (obj3)).setReadTimeout(10000);
        if (((File) (obj2)).exists() && ((File) (obj2)).length() > 0L)
        {
            ((HttpURLConnection) (obj3)).setRequestProperty("Range", (new StringBuilder("bytes=")).append(((File) (obj2)).length()).append("-").toString());
        }
        ((HttpURLConnection) (obj3)).connect();
        obj1 = ((HttpURLConnection) (obj3)).getInputStream();
        Object obj5;
        Object obj6;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        obj6 = obj;
        obj5 = obj1;
        e = 0L;
        obj6 = obj;
        obj5 = obj1;
        f = ((HttpURLConnection) (obj3)).getContentLength();
        obj6 = obj;
        obj5 = obj1;
        Log.c(DownloadingService.a(), String.format("getContentLength: %1$15s", new Object[] {
            Long.valueOf(f)
        }));
        obj6 = obj;
        obj5 = obj1;
        byte abyte0[] = new byte[4096];
        int k;
        k = 0;
        obj6 = obj;
        obj5 = obj1;
        Log.c(DownloadingService.a(), (new StringBuilder(String.valueOf(j.j))).append("saveAPK getContentLength ").append(String.valueOf(f)).toString());
        obj6 = obj;
        obj5 = obj1;
        com.umeng.common.net.c.a(b).a(j.j, j.j);
_L35:
        obj6 = obj;
        obj5 = obj1;
        if (g >= 0) goto _L4; else goto _L3
_L3:
        obj6 = obj;
        obj5 = obj1;
        int i1 = ((InputStream) (obj1)).read(abyte0);
        if (i1 > 0) goto _L5; else goto _L4
_L9:
        obj6 = obj;
        obj5 = obj1;
        ((InputStream) (obj1)).close();
        obj6 = obj;
        obj5 = obj1;
        ((FileOutputStream) (obj)).close();
        obj6 = obj;
        obj5 = obj1;
        if (g != 1) goto _L7; else goto _L6
_L6:
        obj6 = obj;
        obj5 = obj1;
        obj2 = (g)com.umeng.common.net.DownloadingService.c().get(Integer.valueOf(h));
        obj6 = obj;
        obj5 = obj1;
        ((h) (obj2)).f[0] = e;
        obj6 = obj;
        obj5 = obj1;
        ((e) (obj2)).f[1] = f;
        obj6 = obj;
        obj5 = obj1;
        ((f) (obj2)).f[2] = d;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        ((InputStream) (obj1)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_537;
        }
        ((FileOutputStream) (obj)).close();
_L16:
        return;
_L2:
        c = b.getFilesDir().getAbsolutePath();
        obj = b.openFileOutput(((String) (obj1)), 32771);
        obj2 = b.getFileStreamPath(((String) (obj1)));
          goto _L8
_L5:
        obj6 = obj;
        obj5 = obj1;
        ((FileOutputStream) (obj)).write(abyte0, 0, i1);
        obj6 = obj;
        obj5 = obj1;
        long l1 = e;
        obj6 = obj;
        obj5 = obj1;
        e = (long)i1 + l1;
        if (k % 50 != 0)
        {
            break MISSING_BLOCK_LABEL_2284;
        }
        obj6 = obj;
        obj5 = obj1;
        if (com.umeng.common.b.m(b))
        {
            break MISSING_BLOCK_LABEL_650;
        }
        k = 0;
          goto _L9
        obj6 = obj;
        obj5 = obj1;
        i1 = (int)(((float)e * 100F) / (float)f);
        if (i1 > 100)
        {
            i1 = 99;
        }
        obj6 = obj;
        obj5 = obj1;
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_719;
        }
        obj6 = obj;
        obj5 = obj1;
        i.a(h, i1);
        obj6 = obj;
        obj5 = obj1;
        if (com.umeng.common.net.DownloadingService.b().get(j) == null)
        {
            break MISSING_BLOCK_LABEL_772;
        }
        obj6 = obj;
        obj5 = obj1;
        ((Messenger)com.umeng.common.net.DownloadingService.b().get(j)).send(Message.obtain(null, 3, i1, 0));
_L11:
        obj6 = obj;
        obj5 = obj1;
        com.umeng.common.net.c.a(b).a(j.j, j.j, i1);
        break MISSING_BLOCK_LABEL_2284;
        obj5;
        obj6 = obj;
        obj5 = obj1;
        Log.b(DownloadingService.a(), String.format("Service Client for downloading %1$15s is dead. Removing messenger from the service", new Object[] {
            j.j
        }));
        obj6 = obj;
        obj5 = obj1;
        com.umeng.common.net.DownloadingService.b().put(j, null);
        if (true) goto _L11; else goto _L10
_L10:
        obj2;
_L34:
        Log.c(DownloadingService.a(), ((IOException) (obj2)).getMessage(), ((Exception) (obj2)));
        k = d + 1;
        d = k;
        if (k <= 3) goto _L13; else goto _L12
_L12:
        flag = j.j;
        if (flag) goto _L13; else goto _L14
_L14:
        Log.b(DownloadingService.a(), "Download Fail out of max repeat count");
        ((Messenger)com.umeng.common.net.DownloadingService.b().get(j)).send(Message.obtain(null, 5, 0, 0));
        DownloadingService.a(a, h);
        a(((Exception) (obj2)));
        com.umeng.common.net.DownloadingService.c(a).post(new j(this));
_L23:
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((InputStream) (obj1)).close();
        if (obj == null) goto _L16; else goto _L15
_L15:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        ((IOException) (obj1)).printStackTrace();
        if (obj == null) goto _L16; else goto _L17
_L17:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj;
        ((IOException) (obj)).printStackTrace();
        return;
_L7:
        obj6 = obj;
        obj5 = obj1;
        if (g != 2)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        obj6 = obj;
        obj5 = obj1;
        DownloadingService.a(a, j, e, f, d);
        obj6 = obj;
        obj5 = obj1;
        com.umeng.common.net.DownloadingService.b(a).cancel(h);
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((InputStream) (obj1)).close();
        if (obj == null) goto _L16; else goto _L18
_L18:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        ((IOException) (obj1)).printStackTrace();
        if (obj == null) goto _L16; else goto _L19
_L19:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_1355;
        }
        obj6 = obj;
        obj5 = obj1;
        Log.b(DownloadingService.a(), (new StringBuilder("Download Fail repeat count=")).append(d).toString());
        obj6 = obj;
        obj5 = obj1;
        ((Messenger)com.umeng.common.net.DownloadingService.b().get(j)).send(Message.obtain(null, 5, 0, 0));
        obj6 = obj;
        obj5 = obj1;
        DownloadingService.a(a, h);
        obj6 = obj;
        obj5 = obj1;
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_1293;
        }
        obj6 = obj;
        obj5 = obj1;
        i.a(h, null);
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((InputStream) (obj1)).close();
        if (obj == null) goto _L16; else goto _L20
_L20:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        ((IOException) (obj1)).printStackTrace();
        if (obj == null) goto _L16; else goto _L21
_L21:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj6 = obj;
        obj5 = obj1;
        if (j.j == null)
        {
            break MISSING_BLOCK_LABEL_1481;
        }
        obj6 = obj;
        obj5 = obj1;
        abyte0 = new HashMap();
        obj6 = obj;
        obj5 = obj1;
        abyte0.put("dsize", String.valueOf(f));
        obj6 = obj;
        obj5 = obj1;
        abyte0.put("dtime", com.umeng.common.b.g.a().split(" ")[1]);
        obj6 = obj;
        obj5 = obj1;
        abyte0.put("ptimes", String.valueOf(d));
        obj6 = obj;
        obj5 = obj1;
        DownloadingService.a(abyte0, true, j.j);
        obj6 = obj;
        obj5 = obj1;
        abyte0 = new File(((File) (obj2)).getParent(), ((File) (obj2)).getName().replace(".tmp", ""));
        obj6 = obj;
        obj5 = obj1;
        ((File) (obj2)).renameTo(abyte0);
        obj6 = obj;
        obj5 = obj1;
        obj2 = abyte0.getAbsolutePath();
        obj6 = obj;
        obj5 = obj1;
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_1576;
        }
        obj6 = obj;
        obj5 = obj1;
        i.a(h, ((String) (obj2)));
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((InputStream) (obj1)).close();
        if (obj == null) goto _L16; else goto _L22
_L22:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        Object obj4;
        obj4;
        ((RemoteException) (obj4)).printStackTrace();
        DownloadingService.a(a, h);
        a(((Exception) (obj2)));
        com.umeng.common.net.DownloadingService.c(a).post(new j(this));
          goto _L23
        obj4;
        obj2 = obj1;
        obj1 = obj4;
_L32:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1663;
        }
        ((InputStream) (obj2)).close();
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj4;
        DownloadingService.a(a, h);
        a(((Exception) (obj2)));
        com.umeng.common.net.DownloadingService.c(a).post(new j(this));
        throw obj4;
_L13:
        Log.c(DownloadingService.a(), (new StringBuilder("wait for repeating Test network repeat count=")).append(d).toString());
        if (j.j) goto _L25; else goto _L24
_L24:
        Thread.sleep(8000L);
        if (f >= 1L) goto _L27; else goto _L26
_L26:
        a(false);
          goto _L23
        obj2;
        a(((Exception) (obj2)));
        DownloadingService.a(a, h);
          goto _L23
_L27:
        a(true);
          goto _L23
_L25:
        obj2 = (a)com.umeng.common.net.DownloadingService.c().get(Integer.valueOf(h));
        ((h) (obj2)).f[0] = e;
        ((e) (obj2)).f[1] = f;
        ((f) (obj2)).f[2] = d;
        obj2 = l.a(h, "continue");
        Intent intent = new Intent(b, com/umeng/common/net/DownloadingService);
        intent.putExtra("com.umeng.broadcast.download.msg", ((String) (obj2)));
        DownloadingService.a(a, b, intent);
        a.a(b.getString(com.umeng.common.c.a(b).f("Download_info_interrupt")));
        Log.c(DownloadingService.a(), "changed play state button on op-notification.");
          goto _L23
        obj1;
        ((IOException) (obj1)).printStackTrace();
        if (obj == null) goto _L16; else goto _L28
_L28:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        intent;
        obj2 = null;
        obj = null;
_L33:
        obj6 = obj2;
        obj5 = obj;
        DownloadingService.a(a, h);
        obj6 = obj2;
        obj5 = obj;
        intent.printStackTrace();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((InputStream) (obj)).close();
        if (obj2 == null) goto _L16; else goto _L29
_L29:
        try
        {
            ((FileOutputStream) (obj2)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj;
        ((IOException) (obj)).printStackTrace();
        if (obj2 == null) goto _L16; else goto _L30
_L30:
        try
        {
            ((FileOutputStream) (obj2)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj;
        if (obj2 != null)
        {
            try
            {
                ((FileOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        throw obj;
        obj2;
        ((IOException) (obj2)).printStackTrace();
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        break MISSING_BLOCK_LABEL_1671;
        obj1;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj1;
        ((IOException) (obj1)).printStackTrace();
        if (obj == null) goto _L16; else goto _L31
_L31:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj1;
        obj = null;
        obj2 = null;
          goto _L32
        obj1;
        obj2 = null;
          goto _L32
        obj1;
        obj2 = null;
          goto _L32
        obj1;
        obj = obj6;
        obj2 = obj5;
          goto _L32
        intent;
        obj1 = null;
        obj2 = obj;
        obj = obj1;
          goto _L33
        intent;
        obj1 = null;
        obj2 = obj;
        obj = obj1;
          goto _L33
        intent;
        obj2 = obj;
        obj = obj1;
          goto _L33
        obj2;
        obj1 = null;
        obj = null;
          goto _L34
        obj2;
        obj1 = null;
          goto _L34
        obj2;
        obj1 = null;
          goto _L34
_L4:
        k = 1;
          goto _L9
        k++;
          goto _L35
    }

    static DownloadingService b( )
    {
        return .a;
    }

    public void a(int k)
    {
        g = k;
    }

    public void run()
    {
        boolean flag;
        flag = false;
        d = 0;
        if (i != null)
        {
            i.a(h);
        }
        if (e > 0L)
        {
            flag = true;
        }
        try
        {
            a(flag);
            if (com.umeng.common.net.DownloadingService.b().size() <= 0)
            {
                a.stopSelf();
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return;
    }

    public (DownloadingService downloadingservice, Context context,  , int k, int i1,  1)
    {
        a = downloadingservice;
        super();
        d = 0;
        e = -1L;
        f = -1L;
        g = -1;
        b = context;
        j = ;
        d = i1;
        if (!com.umeng.common.net.DownloadingService.c().containsKey(Integer.valueOf(k)))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        downloadingservice = ((d)com.umeng.common.net.DownloadingService.c().get(Integer.valueOf(k))).f;
        if (downloadingservice == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (downloadingservice.length > 1)
        {
            e = downloadingservice[0];
            f = downloadingservice[1];
        }
        i = 1;
        h = k;
        if (!com.umeng.common.b.b())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        c = Environment.getExternalStorageDirectory().getCanonicalPath();
        (new File(c)).mkdirs();
_L1:
        c = (new StringBuilder(String.valueOf(c))).append("/download/.um/apk").toString();
        (new File(c)).mkdirs();
        return;
        try
        {
            c = b.getFilesDir().getAbsolutePath();
        }
        // Misplaced declaration of an exception variable
        catch (DownloadingService downloadingservice)
        {
            Log.c(DownloadingService.a(), downloadingservice.getMessage(), downloadingservice);
            i.a(h, downloadingservice);
            return;
        }
          goto _L1
    }
}
