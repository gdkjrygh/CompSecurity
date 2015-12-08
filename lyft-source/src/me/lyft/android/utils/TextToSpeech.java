// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.Context;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.SecureSubscriber;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.subjects.BehaviorSubject;

public class TextToSpeech
{

    private final android.speech.tts.OnInitListener onInitListener = new android.speech.tts.OnInitListener() {

        final TextToSpeech this$0;

        public void onInit(int i)
        {
            if (i == 0)
            {
                textToSpeechInitializedSubject.onNext(Unit.create());
                return;
            } else
            {
                String s = String.format("Initialization of TextToSpeech failed with status : %s", new Object[] {
                    Integer.valueOf(i)
                });
                textToSpeechInitializedSubject.onError(new Throwable(s));
                return;
            }
        }

            
            {
                this$0 = TextToSpeech.this;
                super();
            }
    };
    private final android.speech.tts.TextToSpeech textToSpeech;
    private BehaviorSubject textToSpeechInitializedSubject;

    public TextToSpeech(Context context)
    {
        textToSpeechInitializedSubject = BehaviorSubject.create();
        textToSpeech = new android.speech.tts.TextToSpeech(context, onInitListener);
    }

    public void speak(final String phrase)
    {
        textToSpeechInitializedSubject.observeOn(AndroidSchedulers.mainThread()).subscribe(new SecureSubscriber() {

            final TextToSpeech this$0;
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
                textToSpeech.speak(phrase, 0, null);
                unsubscribe();
            }

            
            {
                this$0 = TextToSpeech.this;
                phrase = s;
                super();
            }
        });
    }


}
