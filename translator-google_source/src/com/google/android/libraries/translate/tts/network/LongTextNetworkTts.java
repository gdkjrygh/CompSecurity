// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.content.Context;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.tts.d;
import com.google.android.libraries.translate.tts.e;
import com.google.common.collect.ed;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.tts.network:
//            a, f, d, e, 
//            h

public final class LongTextNetworkTts
    implements d
{

    private static HashSet a = ed.a(new String[] {
        "af", "ar", "bs", "ca", "cs", "cy", "el", "en", "eo", "es", 
        "da", "de", "fi", "fr", "hi", "hr", "ht", "hu", "hy", "id", 
        "is", "it", "ja", "ko", "ku", "lv", "mk", "ro", "sq", "sr", 
        "sw", "vi", "la", "nl", "no", "pl", "pt", "ru", "sk", "sv", 
        "ta", "th", "tr", "zh", "zh-CN", "zh-TW"
    });
    private final a b;
    private h c;

    public LongTextNetworkTts(Context context)
    {
        c = null;
        b = new a(context);
    }

    public final void a()
    {
        b();
    }

    public final void a(Context context, Language language, String s, String s1, e e1)
    {
        b();
        context = new f();
        ((f) (context)).b.clear();
        context.a(s.replaceAll("([ \\u3000\\n\\r\\t\\s]+)", " "), f.a, false);
        context = ((f) (context)).b;
        com.google.android.libraries.translate.tts.network.d d1 = new com.google.android.libraries.translate.tts.network.d(this, e1, s1, language, s);
        long l = System.currentTimeMillis();
        c = new com.google.android.libraries.translate.tts.network.e(this, context, language, s1, b, d1, l, language, s);
        e1.k();
        c.a(new Void[0]);
    }

    public final boolean a(Language language)
    {
        language = language.getShortName();
        return a.contains(language);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            c.cancel(true);
            c.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
