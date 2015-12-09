// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.javabridge.ui.Device;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.Nrdp;

// Referenced classes of package com.netflix.mediaclient.service:
//            NrdController

class this._cls0
    implements EventListener
{

    final NrdController this$0;

    public void received(UIEvent uievent)
    {
        (new BackgroundTask()).execute(new Runnable() {

            final NrdController._cls1 this$1;
            final EventListener val$el;

            public void run()
            {
                Log.d("nf_nrdcontroller", "Bridge is initialized");
                NrdController.access$100(this$0).removeEventListener("init", el);
                NrdController.access$100(this$0).getDevice().setUIVersion(getConfigurationAgent().getSoftwareVersion());
                initCompleted(0);
            }

            
            {
                this$1 = NrdController._cls1.this;
                el = eventlistener;
                super();
            }
        });
    }

    _cls1.val.el()
    {
        this$0 = NrdController.this;
        super();
    }
}
