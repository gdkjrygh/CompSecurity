// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Handler;
import com.nuance.nmdp.speechkit.Recognition;
import com.nuance.nmdp.speechkit.Recognizer;
import com.nuance.nmdp.speechkit.SpeechError;
import com.nuance.nmdp.speechkit.SpeechKit;

// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit, MMLog

class this._cls0
    implements com.nuance.nmdp.speechkit.ener
{

    final NVASpeechKit this$0;

    public void onError(Recognizer recognizer, SpeechError speecherror)
    {
        MMLog.d("NVASpeechKit", (new StringBuilder()).append("Speech Kit Error code:").append(speecherror.getErrorCode()).append(" detail:").append(speecherror.getErrorDetail()).append(" suggestions:").append(speecherror.getSuggestion()).toString());
        NVASpeechKit.access$1500(NVASpeechKit.this);
        NVASpeechKit.access$1200(NVASpeechKit.this, speecherror);
        NVASpeechKit.access$002(NVASpeechKit.this, null);
        if (NVASpeechKit.access$1600(NVASpeechKit.this) != null)
        {
            MMLog.d("NVASpeechKit", (new StringBuilder()).append("Recognizer.Listener.onError: session id [").append(NVASpeechKit.access$1600(NVASpeechKit.this).getSessionId()).append("]").toString());
        }
    }

    public void onRecordingBegin(Recognizer recognizer)
    {
        MMLog.d("NVASpeechKit", "recording begins");
        _results = null;
        if (!NVASpeechKit.access$200(NVASpeechKit.this).isTrackingAudioSample())
        {
            NVASpeechKit.access$1100(NVASpeechKit.this, ate.RECORDING);
        }
        NVASpeechKit.access$1300(NVASpeechKit.this, recognizer);
        if (NVASpeechKit.access$200(NVASpeechKit.this).isTrackingAudioSample())
        {
            NVASpeechKit.access$600(NVASpeechKit.this).removeCallbacks(NVASpeechKit.access$1400(NVASpeechKit.this));
            NVASpeechKit.access$600(NVASpeechKit.this).postDelayed(NVASpeechKit.access$1400(NVASpeechKit.this), 2000L);
        }
    }

    public void onRecordingDone(Recognizer recognizer)
    {
        MMLog.d("NVASpeechKit", "recording has ended");
        NVASpeechKit.access$1500(NVASpeechKit.this);
        if (!NVASpeechKit.access$200(NVASpeechKit.this).isTrackingAudioSample())
        {
            NVASpeechKit.access$1100(NVASpeechKit.this, ate.PROCESSING);
        }
        if (NVASpeechKit.access$1600(NVASpeechKit.this) != null)
        {
            NVASpeechKit.access$1702(NVASpeechKit.this, NVASpeechKit.access$1600(NVASpeechKit.this).getSessionId());
        }
    }

    public void onResults(Recognizer recognizer, Recognition recognition)
    {
        MMLog.d("NVASpeechKit", "recording results returned.");
        NVASpeechKit.access$1500(NVASpeechKit.this);
        if (!NVASpeechKit.access$200(NVASpeechKit.this).isTrackingAudioSample)
        {
            NVASpeechKit.access$1800(NVASpeechKit.this, recognition.getDetailedResults());
            if (NVASpeechKit.access$1700(NVASpeechKit.this) != null)
            {
                MMLog.d("NVASpeechKit", (new StringBuilder()).append("Recognizer.Listener.onResults: session id [").append(NVASpeechKit.access$1700(NVASpeechKit.this)).append("]").toString());
            }
            logEvent();
            return;
        } else
        {
            _results = new sult[0];
            NVASpeechKit.access$700(NVASpeechKit.this);
            return;
        }
    }

    sult()
    {
        this$0 = NVASpeechKit.this;
        super();
    }
}
