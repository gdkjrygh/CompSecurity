// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.os.Handler;
import android.speech.tts.TextToSpeech;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.f;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.translate.tts.a:
//            l

public final class k
    implements android.speech.tts.TextToSpeech.OnInitListener, Runnable
{

    private final Locale a;
    private final Handler b = new Handler();
    private final TextToSpeech c = new TextToSpeech(Singleton.a(), this);

    public k(String s)
    {
        a = f.a(s);
    }

    static TextToSpeech a(k k1)
    {
        return k1.c;
    }

    public final void onInit(int i)
    {
        if (i == 0)
        {
            b.post(this);
            return;
        } else
        {
            b.postDelayed(new l(this), 2000L);
            return;
        }
    }

    public final void run()
    {
        c.setLanguage(a);
        b.postDelayed(new l(this), 2000L);
    }
}
