// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;

import android.hardware.Camera;
import android.os.Message;

// Referenced classes of package com.moodstocks.android.camera:
//            CameraInstance

class <init> extends Thread
{

    private CameraInstance instance;
    private boolean wantBack;
    private boolean wantFront;

    public void run()
    {
        int k;
        int l;
        int i1;
        int j1;
        byte byte0;
        byte0 = -1;
        android.hardware.e e = new android.hardware.e();
        int i2 = Camera.getNumberOfCameras();
        int i = 0;
        l = -1;
        k = -1;
        j1 = -1;
        int k1;
        for (i1 = -1; i < i2; i1 = k1)
        {
            Camera.getCameraInfo(i, e);
            int l1 = j1;
            k1 = i1;
            if (i1 < 0)
            {
                l1 = j1;
                k1 = i1;
                if (e.e == 0)
                {
                    l1 = e.ion;
                    k1 = i;
                }
            }
            j1 = l;
            i1 = k;
            if (k < 0)
            {
                j1 = l;
                i1 = k;
                if (e.ion == 1)
                {
                    j1 = e.ion;
                    i1 = i;
                }
            }
            i++;
            l = j1;
            k = i1;
            j1 = l1;
        }

        if (!wantBack) goto _L2; else goto _L1
_L1:
        if (i1 < 0) goto _L4; else goto _L3
_L3:
        int j;
        boolean flag;
        flag = false;
        j = j1;
        k = i1;
_L10:
        Object obj = null;
        if (k >= 0) goto _L6; else goto _L5
_L5:
        String s = "";
        if (wantFront && !wantBack)
        {
            obj = "front-facing ";
        } else
        {
            obj = s;
            if (wantBack)
            {
                obj = s;
                if (!wantFront)
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
                CameraInstance.access$200(instance);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (wantFront && k >= 0)
        {
            j = l;
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L6:
        Camera camera = Camera.open(k);
        if (camera != null)
        {
            try
            {
                CameraInstance.access$100(instance, camera, flag, j);
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
            instance.obtainMessage(1, obj).sendToTarget();
            return;
        } else
        {
            instance.obtainMessage(0).sendToTarget();
            return;
        }
_L4:
        flag = false;
        j = -1;
        k = byte0;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private (CameraInstance camerainstance, boolean flag, boolean flag1)
    {
        instance = camerainstance;
        wantFront = flag1;
        wantBack = flag;
    }

    wantBack(CameraInstance camerainstance, boolean flag, boolean flag1, wantBack wantback)
    {
        this(camerainstance, flag, flag1);
    }
}
