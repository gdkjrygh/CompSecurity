// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.os.Bundle;
import android.speech.RecognitionListener;
import java.util.ArrayList;

// Referenced classes of package org.chromium.content.browser:
//            SpeechRecognition

class this._cls0
    implements RecognitionListener
{

    static final boolean $assertionsDisabled;
    final SpeechRecognition this$0;

    private void handleResults(Bundle bundle, boolean flag)
    {
        boolean flag1 = flag;
        if (SpeechRecognition.access$300(SpeechRecognition.this))
        {
            flag1 = flag;
            if (flag)
            {
                flag1 = false;
            }
        }
        ArrayList arraylist = bundle.getStringArrayList("results_recognition");
        String as[] = (String[])arraylist.toArray(new String[arraylist.size()]);
        bundle = bundle.getFloatArray("confidence_scores");
        SpeechRecognition.access$800(SpeechRecognition.this, SpeechRecognition.access$100(SpeechRecognition.this), as, bundle, flag1);
    }

    public void onBeginningOfSpeech()
    {
        SpeechRecognition.access$002(SpeechRecognition.this, 2);
        SpeechRecognition.access$200(SpeechRecognition.this, SpeechRecognition.access$100(SpeechRecognition.this));
    }

    public void onBufferReceived(byte abyte0[])
    {
    }

    public void onEndOfSpeech()
    {
        if (!SpeechRecognition.access$300(SpeechRecognition.this))
        {
            SpeechRecognition.access$400(SpeechRecognition.this, SpeechRecognition.access$100(SpeechRecognition.this));
            SpeechRecognition.access$500(SpeechRecognition.this, SpeechRecognition.access$100(SpeechRecognition.this));
            SpeechRecognition.access$002(SpeechRecognition.this, 0);
        }
    }

    public void onError(int i)
    {
        i;
        JVM INSTR tableswitch 1 9: default 52
    //                   1 87
    //                   2 87
    //                   3 66
    //                   4 87
    //                   5 77
    //                   6 98
    //                   7 92
    //                   8 82
    //                   9 82;
           goto _L1 _L2 _L2 _L3 _L2 _L4 _L5 _L6 _L7 _L7
_L1:
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        }
          goto _L8
_L3:
        i = 2;
_L10:
        SpeechRecognition.access$600(SpeechRecognition.this, i);
_L8:
        return;
_L4:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 4;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 6;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 5;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onEvent(int i, Bundle bundle)
    {
    }

    public void onPartialResults(Bundle bundle)
    {
        handleResults(bundle, true);
    }

    public void onReadyForSpeech(Bundle bundle)
    {
        SpeechRecognition.access$002(SpeechRecognition.this, 1);
        SpeechRecognition.access$700(SpeechRecognition.this, SpeechRecognition.access$100(SpeechRecognition.this));
    }

    public void onResults(Bundle bundle)
    {
        handleResults(bundle, false);
        SpeechRecognition.access$600(SpeechRecognition.this, 0);
    }

    public void onRmsChanged(float f)
    {
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/SpeechRecognition.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    ()
    {
        this$0 = SpeechRecognition.this;
        super();
    }
}
