// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.data.DataRepository;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            IntegratedClientLoggingManager

class this._cls0
    implements Runnable
{

    final IntegratedClientLoggingManager this$0;

    public void run()
    {
        Log.d("nf_log", "Check if we have not delivered events from last time our app was runnung...");
        com.netflix.mediaclient.util.data.ger._cls1 _lcls1 = new com.netflix.mediaclient.util.data.DataRepository.LoadedCallback() {

            final IntegratedClientLoggingManager._cls1 this$1;

            public void onLoaded(com.netflix.mediaclient.util.data.DataRepository.Entry aentry[])
            {
                if (aentry != null && aentry.length > 0)
                {
                    IntegratedClientLoggingManager.access$000(this$0, aentry);
                    return;
                } else
                {
                    Log.d("nf_log", "No saved payloads found.");
                    return;
                }
            }

            
            {
                this$1 = IntegratedClientLoggingManager._cls1.this;
                super();
            }
        };
        IntegratedClientLoggingManager.access$100(IntegratedClientLoggingManager.this).loadAll(_lcls1);
    }

    _cls1.this._cls1()
    {
        this$0 = IntegratedClientLoggingManager.this;
        super();
    }
}
