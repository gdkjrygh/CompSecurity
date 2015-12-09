// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.os.Build;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ErrorLogging;

// Referenced classes of package com.netflix.mediaclient.service.configuration.drm:
//            WidevineDrmManager

class val.url
    implements dewineProvisiongCallback
{

    final WidevineDrmManager this$0;
    final String val$url;

    public void done(byte abyte0[])
    {
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        if (Log.isLoggable(WidevineDrmManager.TAG, 3))
        {
            Log.d(WidevineDrmManager.TAG, (new StringBuilder()).append("Got CDM provisiong ").append(new String(abyte0)).toString());
        }
        WidevineDrmManager.access$100(WidevineDrmManager.this).provideProvisionResponse(abyte0);
        init();
_L2:
        return;
        abyte0;
        Log.d(WidevineDrmManager.TAG, (new StringBuilder()).append("Server declined Widewine provisioning request. Server URL: ").append(val$url).toString(), abyte0);
        WidevineDrmManager.access$200(WidevineDrmManager.this).drmError(-101);
        WidevineDrmManager.access$300(WidevineDrmManager.this).logHandledException(new Exception((new StringBuilder()).append("Server declined Widewine provisioning request. Server URL: ").append(val$url).append(". Build: ").append(Build.DISPLAY).toString(), abyte0));
        return;
        abyte0;
        Log.d(WidevineDrmManager.TAG, "Fatal error on seting Widewine provisioning response", abyte0);
        WidevineDrmManager.access$300(WidevineDrmManager.this).logHandledException(new Exception((new StringBuilder()).append("Fatal error on seting Widewine provisioning response received from URL: ").append(val$url).append(". Build: ").append(Build.DISPLAY).toString(), abyte0));
        if (WidevineDrmManager.access$200(WidevineDrmManager.this) == null) goto _L2; else goto _L1
_L1:
        WidevineDrmManager.access$200(WidevineDrmManager.this).drmError(-100);
        return;
        Log.e(WidevineDrmManager.TAG, "Failed to get provisiong certificate");
        WidevineDrmManager.access$200(WidevineDrmManager.this).drmError(-100);
        WidevineDrmManager.access$300(WidevineDrmManager.this).logHandledException((new StringBuilder()).append("Failed to get provisiong certificate. Response is null from URL ").append(val$url).toString());
        return;
    }

    llback()
    {
        this$0 = final_widevinedrmmanager;
        val$url = String.this;
        super();
    }
}
