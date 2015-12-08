// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import me.lyft.android.common.Unit;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.utils:
//            TextToSpeech

class this._cls0
    implements android.speech.tts.InitListener
{

    final TextToSpeech this$0;

    public void onInit(int i)
    {
        if (i == 0)
        {
            TextToSpeech.access$100(TextToSpeech.this).onNext(Unit.create());
            return;
        } else
        {
            String s = String.format("Initialization of TextToSpeech failed with status : %s", new Object[] {
                Integer.valueOf(i)
            });
            TextToSpeech.access$100(TextToSpeech.this).onError(new Throwable(s));
            return;
        }
    }

    tListener()
    {
        this$0 = TextToSpeech.this;
        super();
    }
}
