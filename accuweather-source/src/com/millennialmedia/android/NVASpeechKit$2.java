// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Handler;
import com.nuance.nmdp.speechkit.Recognizer;

// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit, MMLog

class this._cls0
    implements Runnable
{

    final NVASpeechKit this$0;

    public void run()
    {
        if (NVASpeechKit.access$000(NVASpeechKit.this) != null)
        {
            double d = dioLevelTracker.access._mth100(NVASpeechKit.access$000(NVASpeechKit.this).getAudioLevel());
            MMLog.d("NVASpeechKit", (new StringBuilder()).append("audiolevel changed: level=").append(d).toString());
            if (NVASpeechKit.access$200(NVASpeechKit.this).update(d) && NVASpeechKit.access$300(NVASpeechKit.this) != null)
            {
                NVASpeechKit.access$300(NVASpeechKit.this).onAudioLevelUpdate(d);
            }
            if (NVASpeechKit.access$400(NVASpeechKit.this) == ate.RECORDING || NVASpeechKit.access$200(NVASpeechKit.this).isTrackingAudioSample)
            {
                NVASpeechKit.access$600(NVASpeechKit.this).postDelayed(NVASpeechKit.access$500(NVASpeechKit.this), 50L);
            }
        }
    }

    ate()
    {
        this$0 = NVASpeechKit.this;
        super();
    }
}
