// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import com.moodstocks.android.Configuration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.android.slyce.i:
//            k, s, j, a, 
//            i

public class g extends Handler
    implements android.hardware.Camera.PreviewCallback
{

    private i a;
    private j b;
    private Camera c;
    private k d;
    private a e;

    protected g(i l)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        a = l;
    }

    private void a(Camera camera, boolean flag, int l)
    {
        c = camera;
        d = new k(flag, l);
        camera = c.getParameters();
        camera.setPreviewFormat(17);
        if (Configuration.platform == 1)
        {
            camera.setPreviewFpsRange(10000, 10000);
        }
        Object obj = camera.getSupportedPreviewSizes();
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)((Iterator) (obj)).next();
            if (size.width <= 1280 && size.height <= 1280 && (size.width >= 480 || size.height >= 480))
            {
                arraylist.add(new s(size));
            }
        } while (true);
        d.a(arraylist);
        c.setParameters(camera);
    }

    static void a(g g1)
    {
        g1.c();
    }

    static void a(g g1, Camera camera, boolean flag, int l)
    {
        g1.a(camera, flag, l);
    }

    private void c()
    {
        if (c == null)
        {
            Log.e("CameraInstance", "`closeImpl` called with null camera -> no-op");
            return;
        } else
        {
            c.release();
            c = null;
            return;
        }
    }

    protected void a()
    {
        if (b == null)
        {
            Log.e("CameraInstance", "`close` called with null openThread -> no-op");
            return;
        }
        if (b.isAlive())
        {
            try
            {
                b.interrupt();
                b.join();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                b.interrupt();
                Log.e("CameraInstance", "`close` received InterruptedException");
                interruptedexception.printStackTrace();
                return;
            }
        } else
        {
            c();
            return;
        }
    }

    protected void a(SurfaceHolder surfaceholder)
    {
        if (c == null)
        {
            Log.e("CameraInstance", "`startPreview` called with null camera -> no-op");
        } else
        {
            try
            {
                c.setPreviewDisplay(surfaceholder);
                c.setPreviewCallback(this);
                c.startPreview();
                if (e != null)
                {
                    e.a(false, null);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("CameraInstance", "`startPreview` received IOException");
                surfaceholder.printStackTrace();
                return;
            }
        }
    }

    protected void a(s s1, boolean flag, int l)
    {
        if (c == null)
        {
            Log.e("CameraInstance", "`updatePreviewParameters` called with null camera -> no-op");
            return;
        } else
        {
            d.a(s1, flag, l);
            s1 = d.c();
            l = d.a();
            android.hardware.Camera.Parameters parameters = c.getParameters();
            parameters.setPreviewSize(s1.a, s1.b);
            c.setParameters(parameters);
            c.setDisplayOrientation(l);
            return;
        }
    }

    protected void a(boolean flag, Rect rect)
    {
        if (e != null)
        {
            e.b(flag, rect);
        }
    }

    protected void a(boolean flag, boolean flag1)
    {
        b = new j(this, flag, flag1, null);
        b.start();
    }

    protected void b()
    {
        if (c == null)
        {
            Log.e("CameraInstance", "`stopPreview` called with null camera -> no-op");
            return;
        }
        if (e != null)
        {
            e.a();
        }
        c.setPreviewCallback(null);
        c.stopPreview();
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.e("CameraInstance", (new StringBuilder()).append("handleMessage: bad message received (").append(message.what).append(")").toString());
            return;

        case 0: // '\0'
            if (Configuration.platform != 1)
            {
                e = new a(c);
            } else
            {
                e = null;
            }
            a.a(((Boolean)message.obj).booleanValue());
            return;

        case 1: // '\001'
            a.a((Exception)message.obj);
            return;
        }
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        a.a(abyte0, d.c(), d.b());
    }
}
