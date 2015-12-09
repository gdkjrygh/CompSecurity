// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.data.DataRepository;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            IntegratedClientLoggingManager

class this._cls1
    implements com.netflix.mediaclient.util.data.r._cls1._cls1
{

    final is._cls0 this$1;

    public void onLoaded(com.netflix.mediaclient.util.data.r._cls1._cls1 a_pcls1[])
    {
        if (a_pcls1 != null && a_pcls1.length > 0)
        {
            IntegratedClientLoggingManager.access$000(_fld0, a_pcls1);
            return;
        } else
        {
            Log.d("nf_log", "No saved payloads found.");
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/logging/IntegratedClientLoggingManager$1

/* anonymous class */
    class IntegratedClientLoggingManager._cls1
        implements Runnable
    {

        final IntegratedClientLoggingManager this$0;

        public void run()
        {
            Log.d("nf_log", "Check if we have not delivered events from last time our app was runnung...");
            IntegratedClientLoggingManager._cls1._cls1 _lcls1 = new IntegratedClientLoggingManager._cls1._cls1();
            IntegratedClientLoggingManager.access$100(IntegratedClientLoggingManager.this).loadAll(_lcls1);
        }

            
            {
                this$0 = IntegratedClientLoggingManager.this;
                super();
            }
    }

}
