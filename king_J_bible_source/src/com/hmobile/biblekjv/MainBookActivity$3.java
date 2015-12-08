// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.speech.tts.TextToSpeech;
import android.telephony.PhoneStateListener;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class it> extends PhoneStateListener
{

    final MainBookActivity this$0;

    public void onCallStateChanged(int i, String s)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        if (isttsOn && tts != null)
        {
            tts.stop();
            tts.shutdown();
        }
_L4:
        super.onCallStateChanged(i, s);
        return;
_L2:
        if (i == 2 && isttsOn)
        {
            tts.stop();
            tts.shutdown();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
