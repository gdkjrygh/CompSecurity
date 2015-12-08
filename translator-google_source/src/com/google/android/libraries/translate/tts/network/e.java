// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.media.MediaPlayer;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.tts.network:
//            h, c, g, LongTextNetworkTts, 
//            a

final class e extends h
{

    final com.google.android.libraries.translate.tts.e a;
    final long b;
    final Language c;
    final String d;
    final LongTextNetworkTts e;

    e(LongTextNetworkTts longtextnetworktts, List list, Language language, String s, a a1, com.google.android.libraries.translate.tts.e e1, long l, Language language1, String s1)
    {
        e = longtextnetworktts;
        a = e1;
        b = l;
        c = language1;
        d = s1;
        super(list, language, s, a1);
    }

    public final void a(int i)
    {
        a.b(i);
    }

    public final void a(List list)
    {
        Singleton.b().a(Event.NETWORK_TTS_LOAD, b, c.getShortName(), null);
        a.b(d, c);
        if (o.b)
        {
            list = new c(list, a);
        } else
        {
            list = new g(list, a);
        }
        ((MediaPlayer)((g) (list)).a.get(0)).start();
    }
}
