// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Observable;

public class h extends Observable
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.speech.tts.TextToSpeech.OnUtteranceCompletedListener
{

    final TextToSpeech a;
    final HashMap b = new HashMap();
    final String c;

    public h(TextToSpeech texttospeech, String s)
    {
        a = texttospeech;
        c = s;
        b.put("utteranceId", s);
    }

    public void a()
    {
        TextToSpeech texttospeech = a;
        String s = c;
        int i;
        if (a.isSpeaking())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        texttospeech.speak(s, i, b);
    }

    public void a(float f)
    {
        b.put("volume", String.valueOf(f));
    }

    public void a(int i)
    {
        b.put("streamType", String.valueOf(i));
    }

    public void onAudioFocusChange(int i)
    {
    }

    public void onUtteranceCompleted(String s)
    {
        if (TextUtils.equals(s, (CharSequence)b.get("utteranceId")))
        {
            setChanged();
        }
        notifyObservers();
    }
}
