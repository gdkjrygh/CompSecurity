// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.jcp.helper.v;

// Referenced classes of package com.jcp.util:
//            ai, ae

public class JCPLocalAdsDownloadService extends IntentService
{

    private static final String a = com/jcp/util/JCPLocalAdsDownloadService.getSimpleName();

    public JCPLocalAdsDownloadService()
    {
        super(com/jcp/util/JCPLocalAdsDownloadService.getName());
    }

    protected void onHandleIntent(Intent intent)
    {
        String s = intent.getStringExtra("storeCode");
        if (s == null)
        {
            s = ai.a().c();
        }
        intent = (ResultReceiver)intent.getParcelableExtra("resultReceiver");
        v v1 = new v();
        v1.a(intent);
        ae.d(a, getString(0x7f070277));
        intent.send(0, Bundle.EMPTY);
        v1.a(s);
        intent.send(5, Bundle.EMPTY);
        v1.a();
        ae.d(a, getString(0x7f070278));
        stopSelf();
    }

}
