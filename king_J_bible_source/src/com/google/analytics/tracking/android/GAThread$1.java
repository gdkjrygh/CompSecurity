// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            GAThread, HitBuilder, ServiceProxy

class val.hitTime
    implements Runnable
{

    final GAThread this$0;
    final Map val$hitCopy;
    final long val$hitTime;

    public void run()
    {
        val$hitCopy.put("clientId", GAThread.access$000(GAThread.this));
        if (GAThread.access$100(GAThread.this) || GAThread.access$200(GAThread.this, val$hitCopy))
        {
            return;
        }
        if (!TextUtils.isEmpty(GAThread.access$300(GAThread.this)))
        {
            val$hitCopy.put("campaign", GAThread.access$300(GAThread.this));
            GAThread.access$302(GAThread.this, null);
        }
        GAThread.access$400(GAThread.this, val$hitCopy);
        GAThread.access$500(GAThread.this, val$hitCopy);
        GAThread.access$600(GAThread.this, val$hitCopy);
        Map map = HitBuilder.generateHitParams(GAThread.access$700(GAThread.this), val$hitCopy);
        GAThread.access$1000(GAThread.this).putHit(map, val$hitTime, GAThread.access$800(GAThread.this, val$hitCopy), GAThread.access$900(GAThread.this));
    }

    y()
    {
        this$0 = final_gathread;
        val$hitCopy = map;
        val$hitTime = J.this;
        super();
    }
}
