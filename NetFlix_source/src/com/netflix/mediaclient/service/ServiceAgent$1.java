// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service:
//            ServiceAgent

class this._cls0
    implements Runnable
{

    final ServiceAgent this$0;

    public void run()
    {
        Log.d("nf_service_ServiceAgent", (new StringBuilder()).append("Initing ").append(getClass().getSimpleName()).toString());
        doInit();
    }

    ()
    {
        this$0 = ServiceAgent.this;
        super();
    }
}
