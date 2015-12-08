// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.app.Activity;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

// Referenced classes of package com.roidapp.imagelib.a:
//            aa

final class ae
    implements android.hardware.Camera.PictureCallback
{

    final aa a;

    ae(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void onPictureTaken(byte abyte0[], Camera camera)
    {
        boolean flag = false;
        camera = ImageLibrary.a().a(a.a);
        camera = (new StringBuilder()).append(camera);
        ImageLibrary.a();
        camera = camera.append(ImageLibrary.b()).toString();
        String s = (new StringBuilder(".PhotoGrid_camera_")).append(Calendar.getInstance().getTimeInMillis()).append(".jpg").toString();
        Activity activity = a.a;
        camera = d.a(abyte0, camera, s);
        int i = ((flag) ? 1 : 0);
        a.a.getWindowManager().getDefaultDisplay().getRotation();
        JVM INSTR tableswitch 0 3: default 328
    //                   0 140
    //                   1 375
    //                   2 382
    //                   3 390;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        abyte0 = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(aa.a(a), abyte0);
        if (((android.hardware.Camera.CameraInfo) (abyte0)).facing != 1) goto _L7; else goto _L6
_L6:
        i = (i + ((android.hardware.Camera.CameraInfo) (abyte0)).orientation) % 360;
          goto _L8
_L9:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        ExifInterface exifinterface = new ExifInterface(camera.getPath());
        exifinterface.setAttribute("Orientation", abyte0);
        exifinterface.saveAttributes();
        abyte0 = Message.obtain(a.g, 1, camera.getPath());
        a.g.sendMessage(abyte0);
        return;
_L7:
        i = ((((android.hardware.Camera.CameraInfo) (abyte0)).orientation - i) + 360) % 360;
          goto _L8
_L13:
        abyte0 = "8";
          goto _L9
        abyte0;
        camera = Message.obtain(a.g, 2);
        a.g.sendMessage(camera);
        abyte0.printStackTrace();
        return;
        abyte0;
        throw abyte0;
        abyte0;
        camera = Message.obtain(a.g, 2);
        a.g.sendMessage(camera);
        abyte0.printStackTrace();
        return;
_L1:
        i = ((flag) ? 1 : 0);
          goto _L2
_L8:
        abyte0 = null;
        i;
        JVM INSTR lookupswitch 3: default 372
    //                   90: 398
    //                   180: 404
    //                   270: 259;
           goto _L10 _L11 _L12 _L13
_L10:
        if (true) goto _L9; else goto _L14
_L14:
_L3:
        i = 90;
          goto _L2
_L4:
        i = 180;
          goto _L2
_L5:
        i = 270;
          goto _L2
_L11:
        abyte0 = "6";
          goto _L9
_L12:
        abyte0 = "3";
          goto _L9
    }
}
