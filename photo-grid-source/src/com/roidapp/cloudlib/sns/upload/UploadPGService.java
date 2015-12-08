// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.upload;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.roidapp.baselib.a.a;
import com.roidapp.baselib.a.b;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.x;
import com.roidapp.baselib.e.d;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.roidapp.cloudlib.sns.upload:
//            e, i, d, c

public class UploadPGService extends Service
    implements d
{

    private static int d = 16;
    private volatile Looper a;
    private volatile c b;
    private aa c;

    public UploadPGService()
    {
    }

    static int a()
    {
        d = -1;
        return -1;
    }

    private static String a(String s)
    {
        Object obj3;
        Object obj4;
        obj4 = null;
        obj3 = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        Object obj2 = null;
_L4:
        return ((String) (obj2));
_L2:
        Object obj;
        Object obj1;
        File file;
        float f;
        boolean flag;
        if (!s.endsWith(".jpg"))
        {
            flag = true;
        } else
        if ((new File(s)).length() >= 0x200000L)
        {
            flag = true;
        } else
        {
            obj = com.roidapp.baselib.a.b.b(new File(s));
            if (obj != null && Math.max(((Integer)((x) (obj)).a).intValue(), ((Integer)((x) (obj)).b).intValue()) > 1080)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        obj2 = s;
        if (!flag) goto _L4; else goto _L3
_L3:
        com.roidapp.baselib.a.a.a();
        obj = com.roidapp.baselib.a.a.a(s, 1080);
        obj2 = s;
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj2 = s;
        if (((Bitmap) (obj)).isRecycled()) goto _L4; else goto _L6
_L6:
        f = (float)Math.max(((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight()) / 1080F;
        obj1 = obj;
        if (f <= 1.0F)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), Math.round((float)((Bitmap) (obj)).getWidth() / f), Math.round((float)((Bitmap) (obj)).getHeight() / f), true);
        if (obj1 == null || obj1 == obj)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        ((Bitmap) (obj)).recycle();
        obj = obj1;
        obj1 = obj;
_L13:
        obj2 = s;
        if (obj1 == null) goto _L4; else goto _L7
_L7:
        obj2 = s;
        if (((Bitmap) (obj1)).isRecycled()) goto _L4; else goto _L8
_L8:
        file = new File(aj.a().getCacheDir(), String.valueOf(System.currentTimeMillis()));
        obj = obj4;
        obj2 = new FileOutputStream(file);
        ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 75, ((OutputStream) (obj2)));
        try
        {
            ((OutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return file.getAbsolutePath();
        obj;
        obj1 = obj3;
_L12:
        obj = obj1;
        file.delete();
        obj2 = s;
        if (obj1 == null) goto _L4; else goto _L9
_L9:
        try
        {
            ((OutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return s;
        }
        return s;
        s;
_L11:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        s;
        obj = obj2;
        if (true) goto _L11; else goto _L10
_L10:
        obj;
        obj1 = obj2;
          goto _L12
        obj1;
        obj1 = obj;
          goto _L13
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        outofmemoryerror = ((OutOfMemoryError) (obj));
          goto _L13
    }

    public final void a(int j)
    {
        com.roidapp.cloudlib.sns.upload.e.a().a(j);
    }

    protected final void a(i j)
    {
        com.roidapp.cloudlib.sns.upload.e.a().b(j);
        com.roidapp.cloudlib.sns.upload.e.a().c(j);
        String s = a(j.a);
        p p1 = q.a(getApplication()).c();
        if (c == null)
        {
            c = new com.roidapp.cloudlib.sns.upload.d(this, (byte)0);
        }
        if (p1 == null)
        {
            c.b(-2, null);
        } else
        {
            com.roidapp.cloudlib.sns.q.a(p1.a, p1.b.a, s, "image/jpeg", j.b, j.c, c, d, this).run();
        }
        if (!TextUtils.equals(s, j.a))
        {
            (new File(s)).delete();
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        HandlerThread handlerthread = new HandlerThread(getClass().getSimpleName());
        handlerthread.start();
        a = handlerthread.getLooper();
        b = new c(this, a);
    }

    public void onDestroy()
    {
        a.quit();
    }

    public void onStart(Intent intent, int j)
    {
        if (intent == null)
        {
            return;
        }
        if (com.roidapp.cloudlib.sns.upload.e.a(intent))
        {
            b.obtainMessage(1).sendToTarget();
            return;
        }
        i k = new i(com.roidapp.cloudlib.sns.upload.e.a(), (byte)0);
        k.a = intent.getStringExtra("upload_path");
        k.c = intent.getStringExtra("upload_comment");
        k.b = intent.getStringExtra("upload_tag");
        k.e = intent.getLongExtra("upload_id", System.currentTimeMillis());
        k.d = -1;
        com.roidapp.cloudlib.sns.upload.e.a().d(k);
        if (com.roidapp.cloudlib.sns.upload.e.a().d())
        {
            com.roidapp.cloudlib.sns.upload.e.a().a(k);
        }
        intent = b.obtainMessage();
        intent.arg1 = j;
        intent.obj = k;
        b.sendMessage(intent);
    }

    public int onStartCommand(Intent intent, int j, int k)
    {
        onStart(intent, k);
        return 2;
    }

}
