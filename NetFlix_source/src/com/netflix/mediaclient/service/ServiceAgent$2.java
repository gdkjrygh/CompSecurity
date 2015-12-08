// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;


// Referenced classes of package com.netflix.mediaclient.service:
//            ServiceAgent

class this._cls0
    implements Runnable
{

    final ServiceAgent this$0;

    public void run()
    {
        ServiceAgent.access$100(ServiceAgent.this).onInitComplete(ServiceAgent.this, ServiceAgent.access$000(ServiceAgent.this));
    }

    itCallback()
    {
        this$0 = ServiceAgent.this;
        super();
    }
}
