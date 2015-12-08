// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.speech.tts.TextToSpeech;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.translate.tts.a:
//            j

final class b extends j
{

    final String a;
    final long b;
    final Locale c;
    final TextToSpeech d;
    final int e;

    b(com.google.android.libraries.translate.tts.e e1, String s, long l, Locale locale, TextToSpeech texttospeech, int i)
    {
        a = s;
        b = l;
        c = locale;
        d = texttospeech;
        e = i;
        super(e1);
    }

    public final void onUtteranceCompleted(String s)
    {
        super.onUtteranceCompleted(s);
        Singleton.b().b(a);
        Singleton.b().a(Event.TTS_LOCAL, b, c.getLanguage(), null, (new LogParams()).addParam("ttsengine", d.getDefaultEngine()), e);
    }
}
