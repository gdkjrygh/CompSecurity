// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.RDC;

import android.graphics.drawable.BitmapDrawable;
import android.hardware.Camera;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.RDC:
//            CameraActivity

class this._cls0
    implements android.hardware.lback
{

    final CameraActivity this$0;

    public void onPictureTaken(byte abyte0[], Camera camera)
    {
        Log.d("CameraActivity", "onPictureTaken()");
        if (camera != null)
        {
            camera.stopPreview();
        }
        android.graphics.ions ions = new android.graphics.ions();
        ions.inTempStorage = new byte[16384];
        camera = camera.getParameters().getPictureSize();
        int i = ((android.hardware..getPictureSize) (camera)).t;
        float f = (float)(((android.hardware.t) (camera)). * i * 3) / 1024000F;
        if (f > 4F)
        {
            ions.inSampleSize = 4;
        } else
        if (f > 3F)
        {
            ions.inSampleSize = 2;
        } else
        {
            ions.inSampleSize = 1;
        }
        camera = CameraActivity.access$1600(CameraActivity.this, abyte0, 0, abyte0.length, ions);
        if (camera == null)
        {
            return;
        } else
        {
            camera = new BitmapDrawable(getResources(), camera);
            CameraActivity.access$600().setBackgroundDrawable(camera);
            CameraActivity.access$900(CameraActivity.this).setVisibility(0);
            CameraActivity.access$100(CameraActivity.this).setVisibility(8);
            CameraActivity.access$1000(CameraActivity.this).setVisibility(0);
            CameraActivity.access$1100(CameraActivity.this).setVisibility(8);
            CameraActivity.access$1300(CameraActivity.this).setText("PREVIEW");
            CameraActivity.access$1700(CameraActivity.this, abyte0);
            return;
        }
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
