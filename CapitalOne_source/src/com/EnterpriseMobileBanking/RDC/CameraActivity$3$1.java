// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.RDC;

import android.hardware.Camera;
import android.view.View;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.RDC:
//            CameraActivity

class this._cls1
    implements android.hardware.lback
{

    final is._cls0 this$1;

    public void onAutoFocus(boolean flag, Camera camera)
    {
        Log.d("CameraActivity", "Autofocusing image.");
        CameraActivity.access$402(_fld0, System.currentTimeMillis());
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/EnterpriseMobileBanking/RDC/CameraActivity$3

/* anonymous class */
    class CameraActivity._cls3
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
            Log.d("CameraActivity", "mAutoFocusImage.onClick()");
            CameraActivity.access$000(CameraActivity.this);
            if (CameraActivity.access$200(CameraActivity.this) == null || !CameraActivity.access$300(CameraActivity.this))
            {
                break MISSING_BLOCK_LABEL_62;
            }
            CameraActivity.access$200(CameraActivity.this).cancelAutoFocus();
            CameraActivity.access$200(CameraActivity.this).autoFocus(new CameraActivity._cls3._cls1());
            return;
            view;
            Log.d("CameraActivity", (new StringBuilder()).append("Auto focus exception caught: ").append(view).toString());
            return;
        }

            
            {
                this$0 = CameraActivity.this;
                super();
            }
    }

}
