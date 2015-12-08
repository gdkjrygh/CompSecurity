// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.RDC;

import android.hardware.Camera;
import android.view.View;
import android.widget.ImageButton;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.RDC:
//            CameraActivity

class this._cls1
    implements android.hardware.lback
{

    final is._cls0 this$1;

    public void onAutoFocus(boolean flag, Camera camera)
    {
        camera.takePicture(null, null, CameraActivity.access$500(_fld0));
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/EnterpriseMobileBanking/RDC/CameraActivity$1

/* anonymous class */
    class CameraActivity._cls1
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
label0:
            {
                Log.d("CameraActivity", "mTakePictureAction.onClick():");
                CameraActivity.access$000(CameraActivity.this);
                CameraActivity.access$100(CameraActivity.this).setEnabled(false);
                if (CameraActivity.access$200(CameraActivity.this) != null)
                {
                    if (!CameraActivity.access$300(CameraActivity.this) || System.currentTimeMillis() - CameraActivity.access$400(CameraActivity.this) <= 2000L)
                    {
                        break label0;
                    }
                    CameraActivity.access$200(CameraActivity.this).autoFocus(new CameraActivity._cls1._cls1());
                }
                return;
            }
            CameraActivity.access$200(CameraActivity.this).takePicture(null, null, CameraActivity.access$500(CameraActivity.this));
        }

            
            {
                this$0 = CameraActivity.this;
                super();
            }
    }

}
