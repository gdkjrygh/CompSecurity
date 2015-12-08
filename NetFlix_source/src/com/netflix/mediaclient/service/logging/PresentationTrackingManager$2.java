// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.data.DataRepository;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            PresentationTrackingManager

class this._cls0
    implements Runnable
{

    final PresentationTrackingManager this$0;

    public void run()
    {
        Log.d("nf_presentation", "Check if we have not delivered events from last time our app was runnung...");
        com.netflix.mediaclient.util.data.ger._cls2 _lcls2 = new com.netflix.mediaclient.util.data.DataRepository.LoadedCallback() {

            final PresentationTrackingManager._cls2 this$1;

            public void onLoaded(com.netflix.mediaclient.util.data.DataRepository.Entry aentry[])
            {
                if (aentry != null && aentry.length > 0)
                {
                    PresentationTrackingManager.access$200(this$0, aentry);
                    return;
                } else
                {
                    Log.d("nf_presentation", "No saved payloads found.");
                    return;
                }
            }

            
            {
                this$1 = PresentationTrackingManager._cls2.this;
                super();
            }
        };
        PresentationTrackingManager.access$300(PresentationTrackingManager.this).loadAll(_lcls2);
    }

    _cls1.this._cls1()
    {
        this$0 = PresentationTrackingManager.this;
        super();
    }
}
