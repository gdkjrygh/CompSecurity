// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import com.nuance.nmdp.speechkit.SpeechError;
import com.nuance.nmdp.speechkit.Vocalizer;

// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit, MMLog

class this._cls0
    implements com.nuance.nmdp.speechkit.ner
{

    final NVASpeechKit this$0;

    public void onSpeakingBegin(Vocalizer vocalizer, String s, Object obj)
    {
        MMLog.d("NVASpeechKit", (new StringBuilder()).append("Vocalization begins. text=").append(s).toString());
        NVASpeechKit.access$1100(NVASpeechKit.this, ate.VOCALIZING);
    }

    public void onSpeakingDone(Vocalizer vocalizer, String s, SpeechError speecherror, Object obj)
    {
        MMLog.d("NVASpeechKit", "Vocalization has ended.");
        if (speecherror != null)
        {
            MMLog.e("NVASpeechKit", (new StringBuilder()).append("Vocalizer error: ").append(speecherror.getErrorDetail()).toString());
            NVASpeechKit.access$1200(NVASpeechKit.this, speecherror);
            return;
        } else
        {
            NVASpeechKit.access$1100(NVASpeechKit.this, ate.READY);
            return;
        }
    }

    ate()
    {
        this$0 = NVASpeechKit.this;
        super();
    }
}
