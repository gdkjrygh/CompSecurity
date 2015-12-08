// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.tts.e;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.translate.tts.a:
//            a, d, j

public final class c extends a
{

    private TextToSpeech b;
    private final boolean c;

    public c(Context context)
    {
        b = new TextToSpeech(context, new d(this));
        c = com.google.android.libraries.translate.tts.a.a.a(context, "com.marvin.espeak");
    }

    private boolean a(Locale locale, String s)
    {
        b.setEngineByPackageName(s);
        b.setLanguage(locale);
        int i = b.isLanguageAvailable(locale);
        return i != -1 && i != -2;
    }

    public final void a()
    {
        if (b != null)
        {
            b.shutdown();
            b = null;
        }
    }

    public final void a(Context context, Language language, String s, String s1, e e1)
    {
        String s2;
        context = f.a(language.getShortName());
        s2 = b.getDefaultEngine();
        if (s2 == null || s2.equals("com.svox.pico") || s2.equals("com.marvin.espeak") || !a(((Locale) (context)), s2)) goto _L2; else goto _L1
_L1:
        b.setEngineByPackageName(s2);
        b.setLanguage(context);
        b.setOnUtteranceCompletedListener(new j(e1));
        b.speak(s, 0, c());
        e1.b(s, language);
_L4:
        return;
_L2:
        if (!a(((Locale) (context)), "com.svox.pico"))
        {
            continue; /* Loop/switch isn't completed */
        }
        b.setEngineByPackageName("com.svox.pico");
_L5:
        a(b, language, ((Locale) (context)), s, s1, c(), e1);
        return;
        if (!c) goto _L4; else goto _L3
_L3:
        b.setEngineByPackageName("com.marvin.espeak");
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final boolean a(Language language)
    {
        boolean flag1 = true;
        if (b != null && language != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        String s;
        language = f.a(language.getShortName());
        s = b.getDefaultEngine();
        if (s == null || s.equals("com.svox.pico") || s.equals("com.marvin.espeak"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (a(((Locale) (language)), s)) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (!a(((Locale) (language)), "com.svox.pico"))
        {
            if (c)
            {
                return a(((Locale) (language)), "com.marvin.espeak");
            } else
            {
                return false;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void b()
    {
        b.stop();
    }
}
