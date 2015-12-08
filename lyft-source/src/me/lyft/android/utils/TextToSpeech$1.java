// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.speech.tts.TextToSpeech;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.SecureSubscriber;

// Referenced classes of package me.lyft.android.utils:
//            TextToSpeech

class init> extends SecureSubscriber
{

    final me.lyft.android.utils.TextToSpeech this$0;
    final String val$phrase;

    public void onSafeError(Throwable throwable)
    {
        super.onSafeError(throwable);
        unsubscribe();
    }

    public volatile void onSafeNext(Object obj)
    {
        onSafeNext((Unit)obj);
    }

    public void onSafeNext(Unit unit)
    {
        super.onSafeNext(unit);
        TextToSpeech.access$000(me.lyft.android.utils.TextToSpeech.this).speak(val$phrase, 0, null);
        unsubscribe();
    }

    ()
    {
        this$0 = final_texttospeech;
        val$phrase = String.this;
        super();
    }
}
