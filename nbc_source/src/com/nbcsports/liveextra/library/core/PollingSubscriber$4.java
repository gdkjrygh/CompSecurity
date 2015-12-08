// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;


// Referenced classes of package com.nbcsports.liveextra.library.core:
//            PollingSubscriber

class this._cls0
    implements Runnable
{

    final PollingSubscriber this$0;

    public void run()
    {
        if (PollingSubscriber.access$200(PollingSubscriber.this) == null || PollingSubscriber.access$500(PollingSubscriber.this) == null)
        {
            return;
        } else
        {
            PollingSubscriber.access$1100(PollingSubscriber.this, PollingSubscriber.access$200(PollingSubscriber.this), PollingSubscriber.access$500(PollingSubscriber.this));
            return;
        }
    }

    ()
    {
        this$0 = PollingSubscriber.this;
        super();
    }
}
