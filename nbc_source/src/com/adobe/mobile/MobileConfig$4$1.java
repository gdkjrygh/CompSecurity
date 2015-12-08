// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.File;

// Referenced classes of package com.adobe.mobile:
//            MobileConfig, RemoteDownload

class this._cls1
    implements moteDownloadBlock
{

    final is._cls0 this$1;

    public void call(boolean flag, File file)
    {
        updateMessagesData(file);
        MobileConfig.access$100(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/adobe/mobile/MobileConfig$4

/* anonymous class */
    class MobileConfig._cls4
        implements Runnable
    {

        final MobileConfig this$0;

        public void run()
        {
            if (MobileConfig.access$000(MobileConfig.this) == null || MobileConfig.access$000(MobileConfig.this).length() <= 0)
            {
                MobileConfig.access$100(MobileConfig.this);
                return;
            } else
            {
                RemoteDownload.remoteDownloadSync(MobileConfig.access$000(MobileConfig.this), new MobileConfig._cls4._cls1());
                return;
            }
        }

            
            {
                this$0 = MobileConfig.this;
                super();
            }
    }

}
