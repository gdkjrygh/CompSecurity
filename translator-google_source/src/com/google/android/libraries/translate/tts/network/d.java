// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.tts.e;

// Referenced classes of package com.google.android.libraries.translate.tts.network:
//            LongTextNetworkTts

final class d
    implements e
{

    long a;
    final e b;
    final String c;
    final Language d;
    final String e;
    final LongTextNetworkTts f;

    d(LongTextNetworkTts longtextnetworktts, e e1, String s, Language language, String s1)
    {
        f = longtextnetworktts;
        b = e1;
        c = s;
        d = language;
        e = s1;
        super();
    }

    public final void b(int i)
    {
        b.b(i);
    }

    public final void b(String s, Language language)
    {
        a = System.currentTimeMillis();
        b.b(c, language);
    }

    public final void j()
    {
        Singleton.b().b(c);
        com.google.android.libraries.translate.logging.e e1 = Singleton.b();
        Event event = Event.TTS_TWS;
        long l = a;
        String s = d.getShortName();
        int i;
        if (TextUtils.isEmpty(e))
        {
            i = 0;
        } else
        {
            i = e.length();
        }
        e1.a(event, l, s, null, i);
        b.j();
    }

    public final void k()
    {
        b.k();
    }
}
