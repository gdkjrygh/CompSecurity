// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.hardware.Camera;
import android.media.MediaScannerConnection;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.pinterest.activity.create.model.PhotoItem;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.camera.CameraManager;
import com.pinterest.ui.camera.CameraPreview;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements android.hardware.lback
{

    final CameraActivity this$0;

    public void onPictureTaken(byte abyte0[], Camera camera)
    {
        _captureLayout.setVisibility(8);
        _captureButton.setClickable(true);
        _photoLayout.setVisibility(0);
        CameraActivity.access$300(CameraActivity.this).setClickable(false);
        CameraActivity.access$402(CameraActivity.this, CameraManager.getOutputMediaFile());
        _useButton.setClickable(true);
        if (CameraActivity.access$400(CameraActivity.this) == null)
        {
            PLog.log("CameraActivity", "Error creating media file, check storage permissions: ", new Object[0]);
            return;
        }
        camera = new FileOutputStream(CameraActivity.access$400(CameraActivity.this));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        camera.write(abyte0);
        camera.close();
_L2:
        MediaScannerConnection.scanFile(Application.context(), new String[] {
            CameraActivity.access$400(CameraActivity.this).getPath()
        }, null, null);
        Events.post(new PhotoItem(CameraActivity.access$400(CameraActivity.this).getPath()));
        return;
        abyte0;
        PLog.log("CameraActivity", (new StringBuilder("File not found: ")).append(abyte0.getMessage()).toString(), new Object[0]);
        continue; /* Loop/switch isn't completed */
        abyte0;
        PLog.log("CameraActivity", (new StringBuilder("Error accessing file: ")).append(abyte0.getMessage()).toString(), new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
