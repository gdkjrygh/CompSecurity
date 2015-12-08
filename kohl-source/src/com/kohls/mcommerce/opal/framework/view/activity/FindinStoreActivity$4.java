// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FindinStoreActivity

class this._cls0 extends ResultReceiver
{

    final FindinStoreActivity this$0;

    protected void onReceiveResult(int i, Bundle bundle)
    {
        int j;
        j = 0;
        if (bundle != null)
        {
            j = bundle.getInt("dialogId");
        }
        i;
        JVM INSTR tableswitch 4006 4007: default 36
    //                   4006 37
    //                   4007 36;
           goto _L1 _L2 _L1
_L1:
        return;
_L2:
        if (j > 0)
        {
            onBackPressed();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    (Handler handler)
    {
        this$0 = FindinStoreActivity.this;
        super(handler);
    }
}
