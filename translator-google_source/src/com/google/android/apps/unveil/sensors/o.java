// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.sensors.proxies.camera.CameraProxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            q, r, p

final class o
{

    private static final af a = new af();
    private static final Object b = new Object();
    private static CameraProxy c;
    private static r d;
    private static Map e = new HashMap();
    private final r f;
    private final Executor g;
    private Handler h;

    public o(Executor executor, r r1)
    {
        g = executor;
        f = r1;
    }

    static CameraProxy a(o o1, String s, Map map, Resources resources)
    {
label0:
        {
            a.b("connectCameraBlocking", new Object[0]);
            if (c != null)
            {
                if (d == o1.f)
                {
                    break label0;
                }
                a.c("Already acquired a camera for somebody else!", new Object[0]);
                b(d, c);
            }
            c = o1.b(s, map, resources);
            d = o1.f;
            a.b("Acquired camera for the first time!", new Object[0]);
            return c;
        }
        a.c("This object already owns a connected camera!", new Object[0]);
        return c;
    }

    static r a(o o1)
    {
        return o1.f;
    }

    static Object a()
    {
        return b;
    }

    static void a(r r1, CameraProxy cameraproxy)
    {
        b(r1, cameraproxy);
    }

    private CameraProxy b(String s, Map map, Resources resources)
    {
        int i;
        Object obj = String.valueOf(s);
        Class class1;
        int j;
        if (((String) (obj)).length() != 0)
        {
            obj = "com.google.android.apps.unveil.sensors.proxies.camera.".concat(((String) (obj)));
        } else
        {
            obj = new String("com.google.android.apps.unveil.sensors.proxies.camera.");
        }
        try
        {
            class1 = Class.forName(((String) (obj)));
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            a.f("Error getting camera proxy class for: %s", new Object[] {
                obj
            });
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        obj = class1;
_L4:
        a.b("Connecting to %s with params '%s'", new Object[] {
            s, map
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        s = ((Class) (obj)).getDeclaredMethods();
        j = s.length;
        i = 0;
_L1:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        obj = s[i];
        if (!((Method) (obj)).getName().equals("open"))
        {
            break MISSING_BLOCK_LABEL_184;
        }
        obj = (CameraProxy)((Method) (obj)).invoke(null, new Object[] {
            h, map, resources
        });
        return ((CameraProxy) (obj));
        Object obj1;
        obj1;
        a.f("Error opening camera proxy!", new Object[0]);
_L2:
        i++;
          goto _L1
        obj1;
        a.f("Error opening camera proxy!", new Object[0]);
          goto _L2
        obj1;
        a.f("Error opening camera proxy!", new Object[0]);
          goto _L2
        throw new RuntimeException("Error opening camera proxy!");
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void b(r r1, CameraProxy cameraproxy)
    {
        a.b("releaseCameraBlocking", new Object[0]);
        if (cameraproxy == null)
        {
            a.e("Asked to release null camera!", new Object[0]);
            throw new RuntimeException("Null camera!");
        }
        String s = String.format("%h", new Object[] {
            Integer.valueOf(cameraproxy.hashCode())
        });
        if (e.containsKey(s))
        {
            a.c("Already released this camera!", new Object[0]);
        }
        e.put(s, s);
        r1 = String.format("%h", new Object[] {
            Integer.valueOf(r1.hashCode())
        });
        a.b("Releasing Camera %s owned by CameraManager %s", new Object[] {
            s, r1
        });
        cameraproxy.release();
        if (c == cameraproxy)
        {
            c = null;
            d = null;
            return;
        } else
        {
            a.c("Asked to release non-current camera!", new Object[0]);
            return;
        }
    }

    public final void a(CameraProxy cameraproxy)
    {
        this;
        JVM INSTR monitorenter ;
        a.b("releaseCamera: %h", new Object[] {
            Integer.valueOf(cameraproxy.hashCode())
        });
        g.execute(new q(this, cameraproxy));
        this;
        JVM INSTR monitorexit ;
        return;
        cameraproxy;
        throw cameraproxy;
    }

    public final void a(String s, Map map, Resources resources)
    {
        this;
        JVM INSTR monitorenter ;
        a.b("acquireCamera", new Object[0]);
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new AssertionError("CameraProvider.acquireCamera() not called from main thread!");
        }
        break MISSING_BLOCK_LABEL_38;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (c == null) goto _L2; else goto _L1
_L1:
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (c == null || f != d) goto _L4; else goto _L3
_L3:
        f.a(c);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj;
        JVM INSTR monitorexit ;
_L2:
        if (h == null)
        {
            h = new Handler();
        }
        (new p(this, s, map, resources)).a(g, h);
        if (true) goto _L6; else goto _L5
_L5:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

}
