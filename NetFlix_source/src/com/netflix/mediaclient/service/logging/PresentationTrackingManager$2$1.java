// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.data.DataRepository;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            PresentationTrackingManager

class this._cls1
    implements com.netflix.mediaclient.util.data.r._cls2._cls1
{

    final is._cls0 this$1;

    public void onLoaded(com.netflix.mediaclient.util.data.r._cls2._cls1 a_pcls1[])
    {
        if (a_pcls1 != null && a_pcls1.length > 0)
        {
            PresentationTrackingManager.access$200(_fld0, a_pcls1);
            return;
        } else
        {
            Log.d("nf_presentation", "No saved payloads found.");
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/logging/PresentationTrackingManager$2

/* anonymous class */
    class PresentationTrackingManager._cls2
        implements Runnable
    {

        final PresentationTrackingManager this$0;

        public void run()
        {
            Log.d("nf_presentation", "Check if we have not delivered events from last time our app was runnung...");
            PresentationTrackingManager._cls2._cls1 _lcls1 = new PresentationTrackingManager._cls2._cls1();
            PresentationTrackingManager.access$300(PresentationTrackingManager.this).loadAll(_lcls1);
        }

            
            {
                this$0 = PresentationTrackingManager.this;
                super();
            }
    }

}
