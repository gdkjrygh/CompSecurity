// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import org.json.JSONArray;

// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit

class this._cls0
    implements stener
{

    final NVASpeechKit this$0;

    public void onAudioLevelUpdate(double d)
    {
        audioLevelChange(d);
    }

    public void onAudioSampleUpdate(double d)
    {
        backgroundAudioLevel(d);
    }

    public void onCustomWordsAdded()
    {
    }

    public void onCustomWordsDeleted()
    {
    }

    public void onError()
    {
    }

    public void onResults()
    {
        JSONArray jsonarray = NVASpeechKit.access$1000(NVASpeechKit.this, getResults());
        recognitionResult(jsonarray.toString());
    }

    public void onStateChange(ate ate)
    {
        switch (.SwitchMap.com.millennialmedia.android.NVASpeechKit.State[ate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            voiceStateChangeError();
            return;

        case 2: // '\002'
            voiceStateChangeProcessing();
            return;

        case 3: // '\003'
            voiceStateChangeReady();
            return;

        case 4: // '\004'
            voiceStateChangeRecording();
            return;

        case 5: // '\005'
            voiceStateChangeVocalizing();
            break;
        }
    }

    ate()
    {
        this$0 = NVASpeechKit.this;
        super();
    }
}
