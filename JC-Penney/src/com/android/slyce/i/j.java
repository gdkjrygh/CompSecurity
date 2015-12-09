// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import android.hardware.Camera;
import android.os.Message;

// Referenced classes of package com.android.slyce.i:
//            g, h

class j extends Thread
{

    private g a;
    private boolean b;
    private boolean c;

    private j(g g1, boolean flag, boolean flag1)
    {
        a = g1;
        c = flag1;
        b = flag;
    }

    j(g g1, boolean flag, boolean flag1, h h)
    {
        this(g1, flag, flag1);
    }

    public void run()
    {
        int l;
        int i1;
        int j1;
        int k1;
        byte byte0;
        byte0 = -1;
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        int j2 = Camera.getNumberOfCameras();
        int i = 0;
        l = -1;
        i1 = -1;
        k1 = -1;
        int l1;
        for (j1 = -1; i < j2; j1 = l1)
        {
            Camera.getCameraInfo(i, camerainfo);
            int i2 = k1;
            l1 = j1;
            if (j1 < 0)
            {
                i2 = k1;
                l1 = j1;
                if (camerainfo.facing == 0)
                {
                    i2 = camerainfo.orientation;
                    l1 = i;
                }
            }
            k1 = l;
            j1 = i1;
            if (i1 < 0)
            {
                k1 = l;
                j1 = i1;
                if (camerainfo.facing == 1)
                {
                    k1 = camerainfo.orientation;
                    j1 = i;
                }
            }
            i++;
            l = k1;
            i1 = j1;
            k1 = i2;
        }

        if (!b) goto _L2; else goto _L1
_L1:
        if (j1 < 0) goto _L4; else goto _L3
_L3:
        int k;
        boolean flag;
        flag = false;
        k = k1;
        l = j1;
_L10:
        Object obj = null;
        if (l >= 0) goto _L6; else goto _L5
_L5:
        String s = "";
        if (c && !b)
        {
            obj = "front-facing ";
        } else
        {
            obj = s;
            if (b)
            {
                obj = s;
                if (!c)
                {
                    obj = "back-facing ";
                }
            }
        }
        obj = new Exception((new StringBuilder()).append("No available ").append(((String) (obj))).append("camera").toString());
_L8:
        if (isInterrupted())
        {
            if (obj == null)
            {
                g.a(a);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (c && i1 >= 0)
        {
            flag = true;
            k = l;
            l = i1;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L6:
        Camera camera = Camera.open(l);
        if (camera != null)
        {
            try
            {
                g.a(a, camera, flag, k);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            continue; /* Loop/switch isn't completed */
        }
        obj = new Exception("Opening camera failed (unknown reason)");
        if (true) goto _L8; else goto _L7
_L7:
        if (obj != null)
        {
            a.obtainMessage(1, obj).sendToTarget();
            return;
        } else
        {
            a.obtainMessage(0, Boolean.valueOf(flag)).sendToTarget();
            return;
        }
_L4:
        flag = false;
        k = -1;
        l = byte0;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
