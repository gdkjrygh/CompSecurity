// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.e.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge, gw

final class gv
    implements Runnable
{

    private WeakReference a;
    private Context b;
    private String c;
    private String d;
    private File e;
    private long f;
    private int g;
    private AtomicBoolean h;
    private AtomicBoolean i;
    private boolean j;
    private WeakReference k;

    private gv(Context context, Handler handler, String s, String s1, File file, long l1, 
            long l2)
    {
        a = new WeakReference(handler);
        b = context;
        c = s;
        d = s1;
        e = file;
        f = l1;
        g = (int)l2;
        h = new AtomicBoolean(false);
        i = new AtomicBoolean(false);
    }

    gv(Context context, Handler handler, String s, String s1, File file, long l1, 
            long l2, byte byte0)
    {
        this(context, handler, s, s1, file, l1, l2);
    }

    static void a(gv gv1)
    {
        if (!gv1.h.get() && !gv1.i.get())
        {
            gv1.h.set(true);
            if (gv1.k != null && gv1.j)
            {
                ge.b().submit(new gw(gv1));
                return;
            }
        }
    }

    static WeakReference b(gv gv1)
    {
        return gv1.k;
    }

    public final void run()
    {
        Object obj2;
        byte abyte0[];
        Handler handler;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        handler = (Handler)a.get();
        if (handler == null || h.get())
        {
            return;
        }
        b = null;
        if (!ge.a())
        {
            handler.sendEmptyMessage(5);
            return;
        }
        obj2 = null;
        abyte0 = null;
        flag2 = false;
        flag3 = false;
        flag1 = false;
        Object obj1;
        l.a();
        j = true;
        obj1 = (HttpURLConnection)(new URL((new StringBuilder()).append(d).append(c).toString())).openConnection();
        boolean flag4;
        k = new WeakReference(obj1);
        ((HttpURLConnection) (obj1)).setConnectTimeout(10000);
        ((HttpURLConnection) (obj1)).setReadTimeout(10000);
        ((HttpURLConnection) (obj1)).setRequestMethod("GET");
        flag4 = h.get();
        Object obj;
        Object obj3;
        int i1;
        if (flag4)
        {
            e.delete();
            Object obj4;
            Exception exception1;
            Message message;
            Exception exception3;
            int j1;
            int k1;
            boolean flag;
            int l1;
            int i2;
            boolean flag5;
            if (obj1 != null)
            {
                try
                {
                    ((HttpURLConnection) (obj1)).disconnect();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            j = false;
            if (h.get())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            Message.obtain(handler, 8, 0, i1, this).sendToTarget();
            i.set(true);
            return;
        }
        ((HttpURLConnection) (obj1)).connect();
        flag5 = h.get();
        if (flag5)
        {
            e.delete();
            if (obj1 != null)
            {
                try
                {
                    ((HttpURLConnection) (obj1)).disconnect();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            j = false;
            if (h.get())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            Message.obtain(handler, 8, 0, i1, this).sendToTarget();
            i.set(true);
            return;
        }
        if (((HttpURLConnection) (obj1)).getResponseCode() == 200)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        obj = Message.obtain();
        obj.what = 3;
        obj.obj = e;
        handler.sendMessage(((Message) (obj)));
        e.delete();
        if (obj1 != null)
        {
            try
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        j = false;
        if (h.get())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        Message.obtain(handler, 8, 0, i1, this).sendToTarget();
        i.set(true);
        return;
        if (g <= 0) goto _L2; else goto _L1
_L1:
        k1 = g;
_L7:
        obj = ((HttpURLConnection) (obj1)).getInputStream();
        obj2 = new FileOutputStream(e);
        l1 = 0;
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        abyte0 = new byte[20480];
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        obj4 = new CRC32();
_L4:
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        i2 = ((InputStream) (obj)).read(abyte0);
        if (i2 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        if (h.get())
        {
            break; /* Loop/switch isn't completed */
        }
        l1 += i2;
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        ((OutputStream) (obj2)).write(abyte0, 0, i2);
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        message = Message.obtain();
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        message.what = 1;
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        message.arg1 = (l1 * 100) / k1;
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        handler.sendMessage(message);
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        ((CRC32) (obj4)).update(abyte0, 0, i2);
        if (true) goto _L4; else goto _L3
        obj4;
        abyte0 = ((byte []) (obj2));
        obj2 = obj1;
        obj1 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj4));
_L17:
        flag5 = h.get();
        if (!flag5) goto _L6; else goto _L5
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_646;
        }
        ((InputStream) (obj1)).close();
        Exception exception2;
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (i1 == 0)
        {
            e.delete();
        }
        if (obj2 != null)
        {
            try
            {
                ((HttpURLConnection) (obj2)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        j = false;
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (h.get())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        Message.obtain(handler, 8, i1, j1, this).sendToTarget();
        i.set(true);
        return;
_L2:
        k1 = ((HttpURLConnection) (obj1)).getContentLength();
          goto _L7
_L3:
        if (l1 != k1) goto _L9; else goto _L8
_L8:
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        if (f < 0L) goto _L11; else goto _L10
_L10:
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        if (((CRC32) (obj4)).getValue() != f) goto _L9; else goto _L11
_L11:
        l1 = 1;
        flag1 = true;
        k1 = 1;
        i1 = k1;
        j1 = ((flag1) ? 1 : 0);
        abyte0 = Message.obtain();
        i1 = k1;
        j1 = ((flag1) ? 1 : 0);
        abyte0.what = 2;
        i1 = k1;
        j1 = ((flag1) ? 1 : 0);
        abyte0.obj = e;
        i1 = k1;
        j1 = ((flag1) ? 1 : 0);
        handler.sendMessage(abyte0);
        flag = l1;
_L13:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_860;
        }
        ((InputStream) (obj)).close();
        ((OutputStream) (obj2)).close();
_L18:
        if (!flag)
        {
            e.delete();
        }
        if (obj1 != null)
        {
            try
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        j = false;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (h.get())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        Message.obtain(handler, 8, i1, j1, this).sendToTarget();
        i.set(true);
        return;
_L9:
        i1 = ((flag1) ? 1 : 0);
        flag = flag2;
        j1 = ((flag3) ? 1 : 0);
        if (h.get()) goto _L13; else goto _L12
_L12:
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        abyte0 = Message.obtain();
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        abyte0.what = 7;
        i1 = ((flag1) ? 1 : 0);
        j1 = ((flag3) ? 1 : 0);
        handler.sendMessage(abyte0);
        flag = flag2;
          goto _L13
        exception1;
        abyte0 = ((byte []) (obj2));
        obj2 = obj;
        i1 = j1;
        obj = exception1;
_L16:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1030;
        }
        ((InputStream) (obj2)).close();
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (i1 == 0)
        {
            e.delete();
        }
        if (obj1 != null)
        {
            try
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        j = false;
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (h.get())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        Message.obtain(handler, 8, i1, j1, this).sendToTarget();
        i.set(true);
        throw obj;
_L6:
        if (!(obj3 instanceof UnknownHostException))
        {
            break MISSING_BLOCK_LABEL_1264;
        }
        exception1 = Message.obtain();
        exception1.what = 3;
        exception1.obj = e;
        handler.sendMessage(exception1);
_L14:
        ((Exception) (obj3)).printStackTrace();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1185;
        }
        ((InputStream) (obj1)).close();
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (i1 == 0)
        {
            e.delete();
        }
        if (obj2 != null)
        {
            try
            {
                ((HttpURLConnection) (obj2)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        j = false;
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (h.get())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        Message.obtain(handler, 8, i1, j1, this).sendToTarget();
        i.set(true);
        return;
        exception1 = Message.obtain();
        exception1.what = 7;
        handler.sendMessage(exception1);
          goto _L14
        exception3;
        obj3 = obj2;
        obj2 = obj1;
        exception1 = ((Exception) (obj));
        obj = exception3;
        obj1 = obj3;
        obj3 = exception1;
        continue; /* Loop/switch isn't completed */
        obj;
        obj1 = null;
        i1 = 0;
        continue; /* Loop/switch isn't completed */
        obj;
        i1 = 0;
        continue; /* Loop/switch isn't completed */
        exception2;
        obj2 = obj;
        obj = exception2;
        i1 = 0;
        if (true) goto _L16; else goto _L15
_L15:
        obj3;
        obj = null;
        obj1 = null;
        obj2 = null;
        i1 = 0;
          goto _L17
        obj3;
        i1 = 0;
        obj = null;
        Object obj5 = null;
        obj2 = obj1;
        obj1 = obj5;
          goto _L17
        obj3;
        obj2 = obj1;
        i1 = 0;
        Object obj6 = null;
        obj1 = obj;
        obj = obj6;
          goto _L17
        Exception exception;
        exception;
          goto _L18
    }
}
