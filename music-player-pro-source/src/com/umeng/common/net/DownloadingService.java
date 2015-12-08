// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.umeng.common.Log;
import com.umeng.common.a.a;
import com.umeng.common.a.b;
import com.umeng.common.a.c;
import com.umeng.common.b.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.umeng.common.net:
//            l, i, f, g, 
//            h, d, e, c, 
//            j

public class DownloadingService extends Service
{
    private static interface a
    {

        public abstract void a(int i1);

        public abstract void a(int i1, int j1);

        public abstract void a(int i1, Exception exception);

        public abstract void a(int i1, String s1);
    }

    class b extends Thread
    {

        final DownloadingService a;
        private Context b;
        private String c;
        private int d;
        private long e;
        private long f;
        private int g;
        private int h;
        private a i;
        private a.a j;

        static Context a(b b1)
        {
            return b1.b;
        }

        private void a(Exception exception)
        {
            Log.b(com.umeng.common.net.DownloadingService.a(), (new StringBuilder("can not install. ")).append(exception.getMessage()).toString());
            if (i != null)
            {
                i.a(h, exception);
            }
            com.umeng.common.net.DownloadingService.a(a, j, e, f, d);
        }

        private void a(boolean flag)
        {
            Object obj1 = (new StringBuilder(String.valueOf(com.umeng.common.b.g.a(j.c)))).append(".apk.tmp").toString();
            if (!com.umeng.common.b.b()) goto _L2; else goto _L1
_L1:
            Object obj;
            Object obj2;
            obj2 = new File(c, ((String) (obj1)));
            obj = new FileOutputStream(((File) (obj2)), true);
_L8:
            Object obj3;
            Log.c(com.umeng.common.net.DownloadingService.a(), String.format("saveAPK: url = %1$15s\t|\tfilename = %2$15s", new Object[] {
                j.c, ((File) (obj2)).getAbsolutePath()
            }));
            obj3 = (HttpURLConnection)(new URL(j.c)).openConnection();
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
            Log.c(com.umeng.common.net.DownloadingService.a(), String.format("getContentLength: %1$15s", new Object[] {
                Long.valueOf(f)
            }));
            obj6 = obj;
            obj5 = obj1;
            byte abyte0[] = new byte[4096];
            int i1;
            i1 = 0;
            obj6 = obj;
            obj5 = obj1;
            Log.c(com.umeng.common.net.DownloadingService.a(), (new StringBuilder(String.valueOf(j.b))).append("saveAPK getContentLength ").append(String.valueOf(f)).toString());
            obj6 = obj;
            obj5 = obj1;
            com.umeng.common.net.c.a(b).a(j.a, j.c);
_L35:
            obj6 = obj;
            obj5 = obj1;
            if (g >= 0) goto _L4; else goto _L3
_L3:
            obj6 = obj;
            obj5 = obj1;
            int j1 = ((InputStream) (obj1)).read(abyte0);
            if (j1 > 0) goto _L5; else goto _L4
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
            obj2 = (d)com.umeng.common.net.DownloadingService.c().get(Integer.valueOf(h));
            obj6 = obj;
            obj5 = obj1;
            ((d) (obj2)).f[0] = e;
            obj6 = obj;
            obj5 = obj1;
            ((d) (obj2)).f[1] = f;
            obj6 = obj;
            obj5 = obj1;
            ((d) (obj2)).f[2] = d;
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
            ((FileOutputStream) (obj)).write(abyte0, 0, j1);
            obj6 = obj;
            obj5 = obj1;
            long l1 = e;
            obj6 = obj;
            obj5 = obj1;
            e = (long)j1 + l1;
            if (i1 % 50 != 0)
            {
                break MISSING_BLOCK_LABEL_2284;
            }
            obj6 = obj;
            obj5 = obj1;
            if (com.umeng.common.b.m(b))
            {
                break MISSING_BLOCK_LABEL_650;
            }
            i1 = 0;
              goto _L9
            obj6 = obj;
            obj5 = obj1;
            j1 = (int)(((float)e * 100F) / (float)f);
            if (j1 > 100)
            {
                j1 = 99;
            }
            obj6 = obj;
            obj5 = obj1;
            if (i == null)
            {
                break MISSING_BLOCK_LABEL_719;
            }
            obj6 = obj;
            obj5 = obj1;
            i.a(h, j1);
            obj6 = obj;
            obj5 = obj1;
            if (com.umeng.common.net.DownloadingService.b().get(j) == null)
            {
                break MISSING_BLOCK_LABEL_772;
            }
            obj6 = obj;
            obj5 = obj1;
            ((Messenger)com.umeng.common.net.DownloadingService.b().get(j)).send(Message.obtain(null, 3, j1, 0));
_L11:
            obj6 = obj;
            obj5 = obj1;
            com.umeng.common.net.c.a(b).a(j.a, j.c, j1);
            break MISSING_BLOCK_LABEL_2284;
            obj5;
            obj6 = obj;
            obj5 = obj1;
            Log.b(com.umeng.common.net.DownloadingService.a(), String.format("Service Client for downloading %1$15s is dead. Removing messenger from the service", new Object[] {
                j.b
            }));
            obj6 = obj;
            obj5 = obj1;
            com.umeng.common.net.DownloadingService.b().put(j, null);
            if (true) goto _L11; else goto _L10
_L10:
            obj2;
_L34:
            Log.c(com.umeng.common.net.DownloadingService.a(), ((IOException) (obj2)).getMessage(), ((Exception) (obj2)));
            i1 = d + 1;
            d = i1;
            if (i1 <= 3) goto _L13; else goto _L12
_L12:
            flag = j.e;
            if (flag) goto _L13; else goto _L14
_L14:
            Log.b(com.umeng.common.net.DownloadingService.a(), "Download Fail out of max repeat count");
            ((Messenger)com.umeng.common.net.DownloadingService.b().get(j)).send(Message.obtain(null, 5, 0, 0));
            com.umeng.common.net.DownloadingService.a(a, h);
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
            com.umeng.common.net.DownloadingService.a(a, j, e, f, d);
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
            if (i1 != 0)
            {
                break MISSING_BLOCK_LABEL_1355;
            }
            obj6 = obj;
            obj5 = obj1;
            Log.b(com.umeng.common.net.DownloadingService.a(), (new StringBuilder("Download Fail repeat count=")).append(d).toString());
            obj6 = obj;
            obj5 = obj1;
            ((Messenger)com.umeng.common.net.DownloadingService.b().get(j)).send(Message.obtain(null, 5, 0, 0));
            obj6 = obj;
            obj5 = obj1;
            com.umeng.common.net.DownloadingService.a(a, h);
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
            if (j.d == null)
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
            com.umeng.common.net.DownloadingService.a(abyte0, true, j.d);
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
            com.umeng.common.net.DownloadingService.a(a, h);
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
            com.umeng.common.net.DownloadingService.a(a, h);
            a(((Exception) (obj2)));
            com.umeng.common.net.DownloadingService.c(a).post(new j(this));
            throw obj4;
_L13:
            Log.c(com.umeng.common.net.DownloadingService.a(), (new StringBuilder("wait for repeating Test network repeat count=")).append(d).toString());
            if (j.e) goto _L25; else goto _L24
_L24:
            Thread.sleep(8000L);
            if (f >= 1L) goto _L27; else goto _L26
_L26:
            a(false);
              goto _L23
            obj2;
            a(((Exception) (obj2)));
            com.umeng.common.net.DownloadingService.a(a, h);
              goto _L23
_L27:
            a(true);
              goto _L23
_L25:
            obj2 = (d)com.umeng.common.net.DownloadingService.c().get(Integer.valueOf(h));
            ((d) (obj2)).f[0] = e;
            ((d) (obj2)).f[1] = f;
            ((d) (obj2)).f[2] = d;
            obj2 = com.umeng.common.net.l.a(h, "continue");
            Intent intent = new Intent(b, com/umeng/common/net/DownloadingService);
            intent.putExtra("com.umeng.broadcast.download.msg", ((String) (obj2)));
            com.umeng.common.net.DownloadingService.a(a, b, intent);
            a.a(b.getString(com.umeng.common.c.a(b).f("Download_info_interrupt")));
            Log.c(com.umeng.common.net.DownloadingService.a(), "changed play state button on op-notification.");
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
            com.umeng.common.net.DownloadingService.a(a, h);
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
            i1 = 1;
              goto _L9
            i1++;
              goto _L35
        }

        static DownloadingService b(b b1)
        {
            return b1.a;
        }

        public void a(int i1)
        {
            g = i1;
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

        public b(Context context, a.a a1, int i1, int j1, a a2)
        {
            a = DownloadingService.this;
            super();
            d = 0;
            e = -1L;
            f = -1L;
            g = -1;
            b = context;
            j = a1;
            d = j1;
            if (!com.umeng.common.net.DownloadingService.c().containsKey(Integer.valueOf(i1)))
            {
                break MISSING_BLOCK_LABEL_109;
            }
            downloadingservice = ((d)com.umeng.common.net.DownloadingService.c().get(Integer.valueOf(i1))).f;
            if (DownloadingService.this == null)
            {
                break MISSING_BLOCK_LABEL_109;
            }
            if (DownloadingService.this.length > 1)
            {
                e = DownloadingService.this[0];
                f = DownloadingService.this[1];
            }
            i = a2;
            h = i1;
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
                Log.c(com.umeng.common.net.DownloadingService.a(), getMessage(), DownloadingService.this);
                i.a(h, DownloadingService.this);
                return;
            }
              goto _L1
        }
    }

    class c extends Handler
    {

        final DownloadingService a;

        public void handleMessage(Message message)
        {
            Log.c(com.umeng.common.net.DownloadingService.a(), (new StringBuilder("IncomingHandler(msg.what:")).append(message.what).append(" msg.arg1:").append(message.arg1).append(" msg.arg2:").append(message.arg2).append(" msg.replyTo:").append(message.replyTo).toString());
            Object obj;
            switch (message.what)
            {
            default:
                super.handleMessage(message);
                return;

            case 4: // '\004'
                obj = message.getData();
                break;
            }
            Log.c(com.umeng.common.net.DownloadingService.a(), (new StringBuilder("IncomingHandler(msg.getData():")).append(obj).toString());
            obj = com.umeng.common.net.a.a.a(((Bundle) (obj)));
            if (com.umeng.common.net.DownloadingService.b(((a.a) (obj))))
            {
                Log.a(com.umeng.common.net.DownloadingService.a(), (new StringBuilder(String.valueOf(((a.a) (obj)).b))).append(" is already in downloading list. ").toString());
                Toast.makeText(com.umeng.common.net.DownloadingService.a(a), com.umeng.common.c.a(com.umeng.common.net.DownloadingService.a(a)).f("umeng_common_action_info_exist"), 0).show();
                return;
            } else
            {
                com.umeng.common.net.DownloadingService.b().put(obj, message.replyTo);
                com.umeng.common.net.DownloadingService.a(a, ((a.a) (obj)));
                return;
            }
        }

        c()
        {
            a = DownloadingService.this;
            super();
        }
    }

    private static class d
    {

        b a;
        Notification b;
        int c;
        int d;
        a.a e;
        long f[];

        public void a()
        {
            com.umeng.common.net.DownloadingService.c().put(Integer.valueOf(c), this);
        }

        public void b()
        {
            if (com.umeng.common.net.DownloadingService.c().containsKey(Integer.valueOf(c)))
            {
                com.umeng.common.net.DownloadingService.c().remove(Integer.valueOf(c));
            }
        }

        public d(a.a a1, int i1)
        {
            f = new long[3];
            c = i1;
            e = a1;
        }
    }


    static final int a = 3;
    static final int b = 4;
    static final int c = 5;
    static final int d = 0;
    static final int e = 1;
    static final int f = 100;
    static final String g = "filename";
    public static boolean h = false;
    private static final String j = com/umeng/common/net/DownloadingService.getName();
    private static final int l = 3;
    private static final long p = 8000L;
    private static Map q = new HashMap();
    private static Map r = new HashMap();
    private static Boolean t = Boolean.valueOf(false);
    final Messenger i = new Messenger(new c());
    private NotificationManager k;
    private Context m;
    private Handler n;
    private a o;
    private BroadcastReceiver s;

    public DownloadingService()
    {
    }

    public static int a(a.a a1)
    {
        return Math.abs((int)((long)((a1.b.hashCode() >> 2) + (a1.c.hashCode() >> 3)) + System.currentTimeMillis()));
    }

    static Notification a(DownloadingService downloadingservice, a.a a1, int i1, int j1)
    {
        return downloadingservice.a(a1, i1, j1);
    }

    private Notification a(a.a a1, int i1, int j1)
    {
        Context context = getApplicationContext();
        Notification notification = new Notification(0x1080081, "\u6B63\u5728\u4E0B\u8F7D\u5E94\u7528", 1L);
        RemoteViews remoteviews = new RemoteViews(context.getPackageName(), com.umeng.common.a.b.a(context));
        remoteviews.setProgressBar(com.umeng.common.a.a.c(context), 100, j1, false);
        remoteviews.setTextViewText(com.umeng.common.a.a.b(context), (new StringBuilder(String.valueOf(j1))).append("%").toString());
        remoteviews.setTextViewText(com.umeng.common.a.a.d(context), (new StringBuilder(String.valueOf(context.getResources().getString(com.umeng.common.a.c.g(context.getApplicationContext()))))).append(a1.b).toString());
        remoteviews.setTextViewText(com.umeng.common.a.a.a(context), "");
        remoteviews.setImageViewResource(com.umeng.common.a.a.e(context), 0x1080081);
        notification.contentView = remoteviews;
        notification.contentIntent = PendingIntent.getActivity(context, 0, new Intent(), 0x8000000);
        if (a1.e)
        {
            notification.flags = 2;
            a1 = com.umeng.common.net.l.b(getApplicationContext(), com.umeng.common.net.l.a(i1, "continue"));
            remoteviews.setOnClickPendingIntent(com.umeng.common.a.a.f(context), a1);
            remoteviews.setViewVisibility(com.umeng.common.a.a.f(context), 0);
            b(notification, i1);
            a1 = com.umeng.common.net.l.b(getApplicationContext(), com.umeng.common.net.l.a(i1, "cancel"));
            remoteviews.setViewVisibility(com.umeng.common.a.a.h(context), 0);
            remoteviews.setOnClickPendingIntent(com.umeng.common.a.a.h(context), a1);
            return notification;
        } else
        {
            notification.flags = 16;
            remoteviews.setViewVisibility(com.umeng.common.a.a.f(context), 8);
            remoteviews.setViewVisibility(com.umeng.common.a.a.h(context), 8);
            return notification;
        }
    }

    static Context a(DownloadingService downloadingservice)
    {
        return downloadingservice.m;
    }

    static String a()
    {
        return j;
    }

    private void a(int i1)
    {
        d d1 = (d)r.get(Integer.valueOf(i1));
        Log.c(j, (new StringBuilder("download service clear cache ")).append(d1.e.b).toString());
        if (d1.a != null)
        {
            d1.a.a(2);
        }
        k.cancel(d1.c);
        if (q.containsKey(d1.e))
        {
            q.remove(d1.e);
        }
        d1.b();
        e();
    }

    private void a(Notification notification, int i1)
    {
        int j1 = com.umeng.common.a.a.f(m);
        notification.contentView.setTextViewText(j1, m.getResources().getString(com.umeng.common.a.c.e(m.getApplicationContext())));
        notification.contentView.setInt(j1, "setBackgroundResource", com.umeng.common.c.a(m).c("umeng_common_gradient_green"));
        k.notify(i1, notification);
    }

    static void a(DownloadingService downloadingservice, int i1)
    {
        downloadingservice.a(i1);
    }

    static void a(DownloadingService downloadingservice, NotificationManager notificationmanager)
    {
        downloadingservice.k = notificationmanager;
    }

    static void a(DownloadingService downloadingservice, a.a a1)
    {
        downloadingservice.c(a1);
    }

    static void a(DownloadingService downloadingservice, a.a a1, long l1, long l2, long l3)
    {
        downloadingservice.a(a1, l1, l2, l3);
    }

    private void a(a.a a1, long l1, long l2, long l3)
    {
        if (a1.d != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("dsize", String.valueOf(l1));
            hashmap.put("dtime", com.umeng.common.b.g.a().split(" ")[1]);
            float f1 = 0.0F;
            if (l2 > 0L)
            {
                f1 = (float)l1 / (float)l2;
            }
            hashmap.put("dpcent", String.valueOf((int)(f1 * 100F)));
            hashmap.put("ptimes", String.valueOf(l3));
            b(hashmap, false, a1.d);
        }
    }

    static void a(Boolean boolean1)
    {
        t = boolean1;
    }

    static void a(Map map, boolean flag, String as[])
    {
        b(map, flag, as);
    }

    static boolean a(Context context)
    {
        return b(context);
    }

    private boolean a(Context context, Intent intent)
    {
        String s1;
        int i1;
        intent = intent.getExtras().getString("com.umeng.broadcast.download.msg").split(":");
        i1 = Integer.parseInt(intent[0]);
        s1 = intent[1].trim();
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(s1) || !r.containsKey(Integer.valueOf(i1))) goto _L2; else goto _L3
_L3:
        b b1;
        intent = (d)r.get(Integer.valueOf(i1));
        b1 = ((d) (intent)).a;
        if (!"continue".equals(s1))
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        Log.c(j, "Receive action do play click.");
        if (!com.umeng.common.b.a(context, "android.permission.ACCESS_NETWORK_STATE") || com.umeng.common.b.m(context))
        {
            break MISSING_BLOCK_LABEL_147;
        }
        Toast.makeText(context, context.getResources().getString(com.umeng.common.a.c.a(context.getApplicationContext())), 1).show();
        return false;
        context = new b(context, ((d) (intent)).e, i1, ((d) (intent)).d, o);
        intent.a = context;
        context.start();
        b(((d) (intent)).b, i1);
        return true;
        Log.c(j, "Receive action do play click.");
        b1.a(1);
        intent.a = null;
        a(((d) (intent)).b, i1);
        return true;
        if (!"cancel".equals(s1)) goto _L2; else goto _L4
_L4:
        Log.c(j, "Receive action do stop click.");
        if (b1 == null) goto _L6; else goto _L5
_L5:
        b1.a(2);
_L7:
        a(i1);
_L8:
        return true;
_L6:
        long l1 = ((d) (intent)).f[0];
        long l2 = ((d) (intent)).f[1];
        long l3 = ((d) (intent)).f[2];
        a(((d) (intent)).e, l1, l2, l3);
          goto _L7
        context;
        a(i1);
          goto _L8
        context;
        context.printStackTrace();
_L2:
        return false;
        context;
        a(i1);
        throw context;
          goto _L7
    }

    static boolean a(DownloadingService downloadingservice, Context context, Intent intent)
    {
        return downloadingservice.a(context, intent);
    }

    static NotificationManager b(DownloadingService downloadingservice)
    {
        return downloadingservice.k;
    }

    static Map b()
    {
        return q;
    }

    private void b(Notification notification, int i1)
    {
        int j1 = com.umeng.common.a.a.f(m);
        notification.contentView.setTextViewText(j1, m.getResources().getString(com.umeng.common.a.c.d(m.getApplicationContext())));
        notification.contentView.setInt(j1, "setBackgroundResource", com.umeng.common.c.a(m).c("umeng_common_gradient_orange"));
        k.notify(i1, notification);
    }

    private static final void b(Map map, boolean flag, String as[])
    {
        (new Thread(new i(as, flag, map))).start();
    }

    private static boolean b(Context context)
    {
        Object obj = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (obj == null)
        {
            return false;
        }
        context = context.getPackageName();
        obj = ((List) (obj)).iterator();
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return false;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while (runningappprocessinfo.importance != 100 || !runningappprocessinfo.processName.equals(context));
        return true;
    }

    static boolean b(a.a a1)
    {
        return d(a1);
    }

    static Handler c(DownloadingService downloadingservice)
    {
        return downloadingservice.n;
    }

    static Map c()
    {
        return r;
    }

    private void c(a.a a1)
    {
        Log.c(j, (new StringBuilder("startDownload([mComponentName:")).append(a1.a).append(" mTitle:").append(a1.b).append(" mUrl:").append(a1.c).append("])").toString());
        int i1 = a(a1);
        b b1 = new b(getApplicationContext(), a1, i1, 0, o);
        a1 = new d(a1, i1);
        a1.a();
        a1.a = b1;
        b1.start();
        e();
        if (!h) goto _L2; else goto _L1
_L1:
        a1 = r.keySet().iterator();
_L5:
        if (a1.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        Object obj = (Integer)a1.next();
        obj = (d)r.get(obj);
        Log.c(j, (new StringBuilder("Running task ")).append(((d) (obj)).e.b).toString());
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void d()
    {
        IntentFilter intentfilter = new IntentFilter("com.umeng.intent.DOWNLOAD");
        s = new f(this);
        registerReceiver(s, intentfilter);
    }

    private static boolean d(a.a a1)
    {
        if (!h) goto _L2; else goto _L1
_L1:
        int i1 = (new Random()).nextInt(1000);
        if (q == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = q.keySet().iterator();
_L8:
        if (iterator.hasNext()) goto _L5; else goto _L2
_L2:
        if (q == null)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L5:
        a.a a2 = (a.a)iterator.next();
        Log.c(j, (new StringBuilder("_")).append(i1).append(" downling  ").append(a2.b).append("   ").append(a2.c).toString());
        continue; /* Loop/switch isn't completed */
_L4:
        Log.c(j, (new StringBuilder("_")).append(i1).append("downling  null").toString());
        if (true) goto _L2; else goto _L6
_L6:
        Iterator iterator1 = q.keySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                return false;
            }
        } while (!((a.a)iterator1.next()).c.equals(a1.c));
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void e()
    {
        if (h)
        {
            int i1 = q.size();
            int j1 = r.size();
            Log.a(j, (new StringBuilder("Client size =")).append(i1).append("   cacheSize = ").append(j1).toString());
            if (i1 != j1)
            {
                throw new RuntimeException((new StringBuilder("Client size =")).append(i1).append("   cacheSize = ").append(j1).toString());
            }
        }
    }

    public void a(String s1)
    {
        synchronized (t)
        {
            if (!t.booleanValue())
            {
                Log.c(j, (new StringBuilder("show single toast.[")).append(s1).append("]").toString());
                t = Boolean.valueOf(true);
                n.post(new com.umeng.common.net.g(this, s1));
                n.postDelayed(new h(this), 1200L);
            }
        }
        return;
        s1;
        boolean1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public IBinder onBind(Intent intent)
    {
        Log.c(j, "onBind ");
        return i.getBinder();
    }

    public void onCreate()
    {
        super.onCreate();
        if (h)
        {
            Log.LOG = true;
            Debug.waitForDebugger();
        }
        Log.c(j, "onCreate ");
        k = (NotificationManager)getSystemService("notification");
        m = this;
        n = new com.umeng.common.net.d(this);
        o = new e(this);
    }

    public void onDestroy()
    {
        try
        {
            com.umeng.common.net.c.a(getApplicationContext()).a(0x3f480);
            com.umeng.common.net.c.a(getApplicationContext()).finalize();
            if (s != null)
            {
                unregisterReceiver(s);
            }
        }
        catch (Exception exception)
        {
            Log.b(j, exception.getMessage());
        }
        super.onDestroy();
    }

    public void onStart(Intent intent, int i1)
    {
        Log.c(j, "onStart ");
        a(getApplicationContext(), intent);
        super.onStart(intent, i1);
    }

    static 
    {
        h = false;
    }
}
