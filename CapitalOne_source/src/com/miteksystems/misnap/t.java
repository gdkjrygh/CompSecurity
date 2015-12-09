// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.speech.tts.TextToSpeech;
import java.util.Locale;

// Referenced classes of package com.miteksystems.misnap:
//            s, MiSnapAPI

final class t
    implements android.speech.tts.TextToSpeech.OnInitListener
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public final void onInit(int i)
    {
        if (a.b.x() != null)
        {
            s.a(a).setLanguage(new Locale(a.b.x()));
        }
    }
}
