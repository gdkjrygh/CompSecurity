// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.RDC;

import android.hardware.Camera;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.RDC:
//            CameraActivity

class this._cls0
    implements android.view.ner
{

    final CameraActivity this$0;

    public void onClick(View view)
    {
        Log.d("CameraActivity", "mRetakePictureAction.onClick()");
        CameraActivity.access$000(CameraActivity.this);
        CameraActivity.access$600().setBackgroundDrawable(null);
        CameraActivity.access$700(CameraActivity.this).setVisibility(0);
        CameraActivity.access$200(CameraActivity.this).startPreview();
        CameraActivity.access$802(CameraActivity.this, null);
        CameraActivity.access$900(CameraActivity.this).setVisibility(8);
        CameraActivity.access$1000(CameraActivity.this).setVisibility(8);
        CameraActivity.access$1100(CameraActivity.this).setVisibility(0);
        CameraActivity.access$100(CameraActivity.this).setVisibility(0);
        CameraActivity.access$1300(CameraActivity.this).setText(CameraActivity.access$1200(CameraActivity.this));
        CameraActivity.access$402(CameraActivity.this, 0L);
        CameraActivity.access$100(CameraActivity.this).setEnabled(true);
        CameraActivity.access$200(CameraActivity.this).cancelAutoFocus();
        CameraActivity.access$1402(CameraActivity.this, false);
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
