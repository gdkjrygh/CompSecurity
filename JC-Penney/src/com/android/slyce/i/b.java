// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.SurfaceView;
import com.android.slyce.k.h;
import com.moodstocks.android.MoodstocksError;
import com.moodstocks.android.Result;
import com.moodstocks.android.Scanner;
import com.moodstocks.android.advanced.Image;
import com.moodstocks.android.advanced.Tools;
import com.moodstocks.android.core.Loader;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.android.slyce.i:
//            p, l, c, d, 
//            e, s

public class b extends Handler
    implements p
{

    boolean a;
    private l b;
    private Scanner c;
    private d d;
    private e e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private AtomicBoolean l;
    private boolean m;

    public b(Activity activity, Scanner scanner, d d1, SurfaceView surfaceview)
    {
        e = null;
        f = false;
        g = false;
        h = 0x80000000;
        i = 0;
        j = 0;
        k = false;
        a = false;
        m = true;
        b = new l(activity, this, surfaceview);
        c = scanner;
        d = d1;
        if (d1 instanceof c)
        {
            k = true;
        }
        l = new AtomicBoolean(false);
    }

    private Result a(Image image)
    {
        Result result = null;
        if ((h & 0x80000000) != 0)
        {
            result = c.search(image, i, j);
        }
        Result result1 = result;
        if (result == null)
        {
            result1 = result;
            if ((h & 0xf) != 0)
            {
                result1 = c.decode(image, h, j);
            }
        }
        return result1;
    }

    private void a(Bitmap bitmap)
    {
        d.a(bitmap);
    }

    private void a(Result result, Bitmap bitmap)
    {
label0:
        {
            if (f && !g)
            {
                d();
                if (!k)
                {
                    break label0;
                }
                ((c)d).a(result, bitmap);
            }
            return;
        }
        d.a(result);
    }

    private void a(String s1)
    {
        if (f && !g)
        {
            d.a(s1);
        }
    }

    public void a()
    {
        g = true;
    }

    public void a(int i1)
    {
        h = i1;
    }

    public void a(e e1)
    {
        Object obj;
        obj = null;
        e = e1;
        Image image = new Image(e1.a, e1.b.a, e1.b.b, e1.c);
        MoodstocksError moodstockserror = null;
_L1:
        Result result;
        if (image != null)
        {
            try
            {
                result = a(image);
            }
            // Misplaced declaration of an exception variable
            catch (MoodstocksError moodstockserror)
            {
                result = null;
            }
            image.release();
        } else
        {
            result = null;
        }
        if (moodstockserror != null)
        {
            obtainMessage(0, moodstockserror).sendToTarget();
        } else
        {
            Bitmap bitmap = obj;
            if (result != null)
            {
                bitmap = obj;
                if (k)
                {
                    bitmap = Tools.convertNV21ToBitmap(e1.a, e1.b.a, e1.b.b, e1.c);
                }
            }
            obtainMessage(1, new Pair(result, bitmap)).sendToTarget();
        }
        if (l.compareAndSet(true, false))
        {
            obtainMessage(2, Tools.convertNV21ToBitmap(e1.a, e1.b.a, e1.b.b, e1.c)).sendToTarget();
        }
        return;
        moodstockserror;
        image = null;
          goto _L1
    }

    public void a(Exception exception)
    {
        d.a(exception);
    }

    public void a(boolean flag)
    {
        d.a(flag);
    }

    public void a(boolean flag, Rect rect)
    {
        b.a(flag, rect);
    }

    public void a(boolean flag, boolean flag1)
    {
        b.a(flag, flag1);
        f = true;
    }

    public void b()
    {
        g = false;
    }

    public void c()
    {
        f = false;
        b.b();
    }

    public void d()
    {
        a = true;
    }

    public void e()
    {
        a = false;
    }

    public void f()
    {
        l.set(true);
    }

    public void g()
    {
        boolean flag1 = true;
        c();
        boolean flag;
        if (!m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, m);
        if (!m)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        m = flag;
    }

    public boolean h()
    {
        return f;
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 72
    //                   1 89
    //                   2 133;
           goto _L1 _L2 _L3 _L4
_L1:
        com.android.slyce.k.h.b("AutoScannerSession", (new StringBuilder()).append("handleMessage: bad message received (").append(message.what).append(")").toString());
_L6:
        e.a();
        return;
_L2:
        a(((MoodstocksError)message.obj).getMessage());
        continue; /* Loop/switch isn't completed */
_L3:
        Object obj = (Pair)message.obj;
        message = (Result)((Pair) (obj)).first;
        obj = (Bitmap)((Pair) (obj)).second;
        if (message != null && !a)
        {
            a(message, ((Bitmap) (obj)));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a((Bitmap)message.obj);
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        Loader.load();
    }
}
