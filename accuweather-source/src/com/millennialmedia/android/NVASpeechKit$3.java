// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import com.nuance.nmdp.speechkit.GenericCommand;
import com.nuance.nmdp.speechkit.GenericResult;
import com.nuance.nmdp.speechkit.SpeechError;

// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit, MMLog

class this._cls0
    implements com.nuance.nmdp.speechkit.Listener
{

    final NVASpeechKit this$0;

    public void onComplete(GenericCommand genericcommand, GenericResult genericresult, SpeechError speecherror)
    {
        if (speecherror != null)
        {
            MMLog.e("NVASpeechKit", (new StringBuilder()).append("GenericCommand listener. Error: ").append(speecherror.getErrorDetail()).toString());
        } else
        {
            MMLog.d("NVASpeechKit", (new StringBuilder()).append("GenericCommand listener. Success: ").append(genericresult.getQueryResult()).toString());
        }
        NVASpeechKit.access$700(NVASpeechKit.this);
    }

    stener()
    {
        this$0 = NVASpeechKit.this;
        super();
    }
}
