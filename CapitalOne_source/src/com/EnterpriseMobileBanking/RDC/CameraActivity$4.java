// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.RDC;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.EnterpriseMobileBanking.RDC:
//            CameraActivity

class this._cls0
    implements android.view.ner
{

    final CameraActivity this$0;

    public void onClick(View view)
    {
        view = new Intent();
        view.putExtra("RDCImage", CameraActivity.access$800(CameraActivity.this));
        view.putExtra("callbackId", CameraActivity.access$1500(CameraActivity.this));
        setResult(-1, view);
        CameraActivity.access$802(CameraActivity.this, null);
        CameraActivity.access$1402(CameraActivity.this, false);
        finish();
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
