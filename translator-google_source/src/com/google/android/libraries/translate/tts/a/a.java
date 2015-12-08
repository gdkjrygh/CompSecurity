// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.tts.d;
import com.google.common.collect.ed;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.translate.tts.a:
//            b

public abstract class a
    implements d
{

    static final HashSet a;

    public a()
    {
    }

    protected static void a(TextToSpeech texttospeech, Language language, Locale locale, String s, String s1, HashMap hashmap, com.google.android.libraries.translate.tts.e e1)
    {
        texttospeech.setLanguage(locale);
        long l = System.currentTimeMillis();
        int i;
        if (TextUtils.isEmpty(s))
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        texttospeech.setOnUtteranceCompletedListener(new b(e1, s1, l, locale, texttospeech, i));
        Singleton.b().b(s1);
        Singleton.b().a(Event.TTS_LOCAL, language.getShortName(), null, i, (new LogParams()).addParam("ttsengine", texttospeech.getDefaultEngine()));
        e1.b(s, language);
        texttospeech.speak(s, 0, hashmap);
    }

    static boolean a(Context context, String s)
    {
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    protected static HashMap c()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("utteranceId", "stringId");
        return hashmap;
    }

    static 
    {
        a = ed.a(com.google.android.libraries.translate.core.a.b);
    }
}
