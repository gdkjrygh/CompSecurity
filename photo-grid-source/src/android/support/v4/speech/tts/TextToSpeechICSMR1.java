// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.speech.tts;

import android.speech.tts.TextToSpeech;
import java.util.Locale;
import java.util.Set;

class TextToSpeechICSMR1
{

    public static final String KEY_FEATURE_EMBEDDED_SYNTHESIS = "embeddedTts";
    public static final String KEY_FEATURE_NETWORK_SYNTHESIS = "networkTts";

    TextToSpeechICSMR1()
    {
    }

    static Set getFeatures(TextToSpeech texttospeech, Locale locale)
    {
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            return texttospeech.getFeatures(locale);
        } else
        {
            return null;
        }
    }

    static void setUtteranceProgressListener(TextToSpeech texttospeech, final UtteranceProgressListenerICSMR1 listener)
    {
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            texttospeech.setOnUtteranceProgressListener(new _cls1());
            return;
        } else
        {
            texttospeech.setOnUtteranceCompletedListener(new _cls2());
            return;
        }
    }

    private class _cls1 extends UtteranceProgressListener
    {

        final UtteranceProgressListenerICSMR1 val$listener;

        public final void onDone(String s)
        {
            listener.onDone(s);
        }

        public final void onError(String s)
        {
            listener.onError(s);
        }

        public final void onStart(String s)
        {
            listener.onStart(s);
        }

        _cls1()
        {
            listener = utteranceprogresslistenericsmr1;
            super();
        }

        private class UtteranceProgressListenerICSMR1
        {

            public abstract void onDone(String s);

            public abstract void onError(String s);

            public abstract void onStart(String s);
        }

    }


    private class _cls2
        implements android.speech.tts.TextToSpeech.OnUtteranceCompletedListener
    {

        final UtteranceProgressListenerICSMR1 val$listener;

        public final void onUtteranceCompleted(String s)
        {
            listener.onStart(s);
            listener.onDone(s);
        }

        _cls2()
        {
            listener = utteranceprogresslistenericsmr1;
            super();
        }
    }

}
