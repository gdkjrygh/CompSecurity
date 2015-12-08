// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorderService, SoundRecorder

class this._cls0 extends Handler
{

    final SoundRecorderService this$0;

    public void handleMessage(Message message)
    {
        if (!SoundRecorderService.access$000(SoundRecorderService.this).isActive())
        {
            if (Log.isLoggable(SoundRecorderService.access$100(), 3))
            {
                SoundRecorderService.access$100();
            }
            stopSelf(SoundRecorderService.access$200(SoundRecorderService.this));
        }
    }

    ()
    {
        this$0 = SoundRecorderService.this;
        super();
    }
}
