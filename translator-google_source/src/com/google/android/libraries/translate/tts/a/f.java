// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.tts.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.google.android.libraries.translate.tts.a:
//            a, g, h, e

public final class f extends a
{

    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final Semaphore d = new Semaphore(1);
    private final boolean e;
    private TextToSpeech f;

    public f(Context context)
    {
        f = new TextToSpeech(context, new g(this));
        android.speech.tts.TextToSpeech.EngineInfo engineinfo;
        for (Iterator iterator = f.getEngines().iterator(); iterator.hasNext(); c.add(new h(context, engineinfo)))
        {
            engineinfo = (android.speech.tts.TextToSpeech.EngineInfo)iterator.next();
        }

        e = com.google.android.libraries.translate.tts.a.a.a(context, "com.marvin.espeak");
    }

    private boolean a(Locale locale, String s)
    {
        f.setEngineByPackageName(s);
        f.setLanguage(locale);
        int i = f.isLanguageAvailable(locale);
        return i != -1 && i != -2;
    }

    public final void a()
    {
        if (f != null)
        {
            f.shutdown();
            f = null;
        }
    }

    public final void a(Context context, Language language, String s, String s1, e e1)
    {
        context = com.google.android.libraries.translate.core.b.i(context, language.getShortName());
        if (!(context instanceof com.google.android.libraries.translate.tts.a.e)) goto _L2; else goto _L1
_L1:
        com.google.android.libraries.translate.tts.a.e e2;
        e2 = (com.google.android.libraries.translate.tts.a.e)context;
        context = c.iterator();
_L6:
        if (!context.hasNext()) goto _L4; else goto _L3
_L3:
        h h1 = (h)context.next();
        if (!TextUtils.equals(h1.b, e2.a)) goto _L6; else goto _L5
_L5:
        context = h1.a;
_L8:
        a(((TextToSpeech) (context)), language, e2.b, s, s1, c(), e1);
        return;
_L2:
        a(f, language, com.google.android.libraries.translate.e.f.a(language.getShortName()), s, s1, c(), e1);
        return;
_L4:
        context = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean a(Language language)
    {
        if (f != null)
        {
            language = com.google.android.libraries.translate.e.f.a(language.getShortName());
            String s = f.getDefaultEngine();
            if (s != null)
            {
                if (f.areDefaultsEnforced())
                {
                    return true;
                }
                if (!s.equals("com.svox.pico") && !s.equals("com.marvin.espeak") && a(((Locale) (language)), s))
                {
                    return true;
                }
            }
            if (f.isLanguageAvailable(language) >= 0)
            {
                return true;
            }
            s = language.getLanguage();
            if (a.a.contains(s))
            {
                return true;
            }
            if (e)
            {
                return a(((Locale) (language)), "com.marvin.espeak");
            }
        }
        return false;
    }

    public final void b()
    {
        f.stop();
    }
}
