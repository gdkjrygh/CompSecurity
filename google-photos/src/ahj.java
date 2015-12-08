// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Camera;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class ahj
    implements Runnable
{

    ahc a;
    ajr b;
    private ahm c;
    private LinkedBlockingQueue d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j[];
    private int k;
    private int l;
    private boolean m;
    private Display n;
    private int o;
    private int p;
    private int q;
    private String r;
    private Camera s;
    private int t;
    private Set u;
    private ReentrantLock v;
    private Condition w;
    private ahk x;
    private ajv y;
    private ahb z;

    public ahj(ahb ahb1, ajr ajr1)
    {
        z = ahb1;
        super();
        c = new ahm();
        d = new LinkedBlockingQueue(32);
        e = 30;
        f = 640;
        g = 480;
        h = 640;
        i = 480;
        j = null;
        k = 0;
        l = 0;
        m = true;
        n = null;
        o = 0;
        p = -1;
        q = 0;
        r = "off";
        s = null;
        t = 0;
        a = null;
        u = new HashSet();
        v = new ReentrantLock(true);
        w = v.newCondition();
        x = new ahk(this);
        b = ajr1;
        if (!b.h)
        {
            throw new RuntimeException("Attempting to use OpenGL ES 2 in a context that does not support it!");
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new ahi(z);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            a = new ahf(z, (byte)0);
        } else
        {
            a = new ahd(z);
        }
        a.e = this;
        (new Thread(this)).start();
    }

    private ahl a()
    {
        ahl ahl1;
        try
        {
            ahl1 = (ahl)d.take();
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("GraphRunner", "Event queue processing was interrupted.");
            return null;
        }
        return ahl1;
    }

    static Camera a(ahj ahj1)
    {
        return ahj1.s;
    }

    private static int[] a(int i1, int j1, List list)
    {
        int l1 = ((android.hardware.Camera.Size)list.get(0)).width;
        int k1 = ((android.hardware.Camera.Size)list.get(0)).height;
        list = list.iterator();
        int j2 = -1;
        int i2;
        int k2;
        for (i2 = -1; list.hasNext(); i2 = k2)
        {
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)list.next();
            int l2 = j2;
            k2 = i2;
            if (size.width <= i1)
            {
                l2 = j2;
                k2 = i2;
                if (size.height <= j1)
                {
                    l2 = j2;
                    k2 = i2;
                    if (size.width >= i2)
                    {
                        l2 = j2;
                        k2 = i2;
                        if (size.height >= j2)
                        {
                            k2 = size.width;
                            l2 = size.height;
                        }
                    }
                }
            }
            if (size.width < l1 && size.height < k1)
            {
                l1 = size.width;
                k1 = size.height;
            }
            j2 = l2;
        }

        if (i2 != -1)
        {
            k1 = j2;
            l1 = i2;
        }
        return (new int[] {
            l1, k1
        });
    }

    private int[] a(int i1, android.hardware.Camera.Parameters parameters)
    {
        List list = parameters.getSupportedPreviewFpsRange();
        parameters = (int[])list.get(0);
        int k1 = i1 * 1000;
        i1 = 0xf4240;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int ai[] = (int[])iterator.next();
            int j1 = ai[0];
            int l1 = ai[1];
            if (j1 <= k1 && l1 >= k1)
            {
                j1 = (k1 - j1) + (l1 - k1);
                if (j1 < i1)
                {
                    parameters = ai;
                    i1 = j1;
                }
            }
        } while (true);
        return parameters;
    }

    static int b(ahj ahj1)
    {
        return ahj1.l;
    }

    private void b()
    {
        if (c.a.get() != 2)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        for (Iterator iterator = u.iterator(); iterator.hasNext();)
        {
            k k1 = (k)iterator.next();
            synchronized (u)
            {
                u.remove(k1);
            }
        }

        break MISSING_BLOCK_LABEL_71;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        u.clear();
        return;
        Log.e("CameraStreamer", "Could not tear-down CameraStreamer as camera still seems to be running!");
        return;
    }

    private ajv c()
    {
        if (y == null)
        {
            y = ajv.a(1, 1);
        }
        return y;
    }

    static boolean c(ahj ahj1)
    {
        return ahj1.m;
    }

    private void d()
    {
        Object obj;
        int i1;
        i1 = 1;
        try
        {
            if (!ahb.a.tryLock(5L, TimeUnit.SECONDS))
            {
                throw new RuntimeException("Timed out while waiting to acquire camera!");
            }
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException("Interrupted while waiting to acquire camera!");
        }
        obj = new Object();
        x.a(obj);
        this;
        JVM INSTR monitorenter ;
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        if (Camera.getNumberOfCameras() == 0)
        {
            throw new RuntimeException("Device does not have any cameras!");
        }
        break MISSING_BLOCK_LABEL_94;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj2;
        t = 0;
        int j1 = t;
        obj2 = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(j1, ((android.hardware.Camera.CameraInfo) (obj2)));
        o = ((android.hardware.Camera.CameraInfo) (obj2)).orientation;
        p = -1;
        ahc ahc1;
        int ai[];
        int k1;
        if (((android.hardware.Camera.CameraInfo) (obj2)).facing != 1)
        {
            i1 = 2;
        }
        l = i1;
        s = Camera.open(t);
        obj2 = s.getParameters();
        j = a(f, g, ((android.hardware.Camera.Parameters) (obj2)).getSupportedPreviewSizes());
        ahc1 = a;
        i1 = j[0];
        k1 = j[1];
        ahc1.a = i1;
        ahc1.b = k1;
        ((android.hardware.Camera.Parameters) (obj2)).setPreviewSize(j[0], j[1]);
        ai = a(h, i, ((android.hardware.Camera.Parameters) (obj2)).getSupportedPictureSizes());
        ((android.hardware.Camera.Parameters) (obj2)).setPictureSize(ai[0], ai[1]);
        ai = a(e, ((android.hardware.Camera.Parameters) (obj2)));
        ((android.hardware.Camera.Parameters) (obj2)).setPreviewFpsRange(ai[0], ai[1]);
        if (((android.hardware.Camera.Parameters) (obj2)).getFlashMode() != null)
        {
            ((android.hardware.Camera.Parameters) (obj2)).setFlashMode(r);
        }
        s.setParameters(((android.hardware.Camera.Parameters) (obj2)));
        obj1;
        JVM INSTR monitorexit ;
        a.a();
        this;
        JVM INSTR monitorexit ;
        s.startPreview();
        obj1 = u;
        obj1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = u.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_376;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        JVM INSTR monitorexit ;
        x.b(obj);
        v.lock();
        w.signal();
        v.unlock();
        return;
    }

    private void e()
    {
        Object obj = new Object();
        x.a(obj);
        if (s != null)
        {
            s.stopPreview();
            s.release();
            s = null;
        }
        ahb.a.unlock();
        a.c();
        x.b(obj);
        Set set = u;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = u.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_105;
        Exception exception;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        set;
        JVM INSTR monitorexit ;
    }

    public final void a(int i1, boolean flag)
    {
        if (flag)
        {
            try
            {
                d.put(new ahl(i1));
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                Log.e("CameraStreamer", (new StringBuilder(27)).append("Dropping event ").append(i1).append("!").toString());
            }
            break MISSING_BLOCK_LABEL_72;
        }
        d.offer(new ahl(i1));
        return;
    }

    public final boolean a(ahv ahv, int i1)
    {
label0:
        {
            synchronized (c)
            {
                if (c.a.get() == 1)
                {
                    break label0;
                }
            }
            return false;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ahm1;
        JVM INSTR monitorexit ;
        return false;
        ahv;
        ahm1;
        JVM INSTR monitorexit ;
        throw ahv;
        a.a(ahv, i1);
        ahm1;
        JVM INSTR monitorexit ;
        return true;
    }

    public final void run()
    {
_L1:
        ahl ahl1;
        do
        {
            ahl1 = a();
        } while (ahl1 == null);
        ahl1.a;
        JVM INSTR tableswitch 1 7: default 337
    //                   1 56
    //                   2 209
    //                   3 134
    //                   4 233
    //                   5 265
    //                   6 301
    //                   7 330;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
        Exception exception;
        if (c.a.get() == 2)
        {
            c.a(1);
            c().b();
            d();
            Iterator iterator = a.f.iterator();
            while (iterator.hasNext()) 
            {
                ((aka)iterator.next()).o_();
            }
        }
          goto _L1
_L4:
        try
        {
            if (c.a.get() == 1)
            {
                e();
                ajv.c();
            }
            c.a(2);
            Iterator iterator1 = (new ArrayList(a.f)).iterator();
            while (iterator1.hasNext()) 
            {
                ((aka)iterator1.next()).i();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
          goto _L1
_L3:
        if (c.a.get() != 1) goto _L1; else goto _L9
_L9:
        a.b();
          goto _L1
_L5:
        if (c.a.get() != 1) goto _L1; else goto _L10
_L10:
        e();
        ajv.c();
        c.a(3);
          goto _L1
_L6:
        if (c.a.get() != 3) goto _L1; else goto _L11
_L11:
        c.a(1);
        c().b();
        d();
          goto _L1
_L7:
        if (c.a.get() != 1) goto _L1; else goto _L12
_L12:
        a(3, true);
        a(1, true);
          goto _L1
_L8:
        b();
          goto _L1
    }
}
