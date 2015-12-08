// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import com.nuance.nmdp.speechkit.DataUploadCommand;
import com.nuance.nmdp.speechkit.DataUploadResult;
import com.nuance.nmdp.speechkit.SpeechError;

// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit, MMLog

class this._cls0
    implements com.nuance.nmdp.speechkit.nd.Listener
{

    final NVASpeechKit this$0;

    private void notifyListener(DataUploadCommand datauploadcommand)
    {
        if (NVASpeechKit.access$300(NVASpeechKit.this) != null && NVASpeechKit.access$800(NVASpeechKit.this) == datauploadcommand)
        {
            if (NVASpeechKit.access$900(NVASpeechKit.this) == stomWordsOp.Add)
            {
                NVASpeechKit.access$300(NVASpeechKit.this).onCustomWordsAdded();
            } else
            {
                NVASpeechKit.access$300(NVASpeechKit.this).onCustomWordsDeleted();
            }
        }
        NVASpeechKit.access$802(NVASpeechKit.this, null);
    }

    public void onError(DataUploadCommand datauploadcommand, SpeechError speecherror)
    {
        MMLog.e("NVASpeechKit", (new StringBuilder()).append("DataUploadCommand listener error. command:").append(datauploadcommand.toString()).append(" Error:").append(speecherror.getErrorDetail()).toString());
        notifyListener(datauploadcommand);
    }

    public void onResults(DataUploadCommand datauploadcommand, DataUploadResult datauploadresult)
    {
        MMLog.d("NVASpeechKit", (new StringBuilder()).append("DataUploadCommand listener successful command:").append(datauploadcommand.toString()).append(" isVocRegenerated:").append(datauploadresult.isVocRegenerated()).append(" results:").append(datauploadresult.toString()).toString());
        notifyListener(datauploadcommand);
    }

    ()
    {
        this$0 = NVASpeechKit.this;
        super();
    }
}
