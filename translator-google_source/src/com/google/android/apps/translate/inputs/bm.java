// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.widget.TextView;
import com.google.android.apps.translate.widget.VoiceLangButton;
import com.google.android.libraries.translate.c.c;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.e.n;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            VoiceInputPopup, aq

final class bm
    implements Runnable
{

    final VoiceInputPopup a;

    bm(VoiceInputPopup voiceinputpopup)
    {
        a = voiceinputpopup;
        super();
    }

    public final void run()
    {
        a.g();
        Object obj = n.a((String)VoiceInputPopup.a(a).getTag(aq.a));
        m m1 = (m)VoiceInputPopup.a(a).getTag(com.google.android.apps.translate.inputs.aq.b);
        if (!((String) (obj)).isEmpty() && m1 != null)
        {
            com.google.android.apps.translate.inputs.VoiceInputPopup.b(a);
            obj = new Entry(VoiceInputPopup.a(com.google.android.apps.translate.inputs.VoiceInputPopup.c(a)), VoiceInputPopup.a(VoiceInputPopup.d(a)), ((String) (obj)), m1.toString());
            (new c()).a(a.getContext(), ((Entry) (obj)));
        }
        int i = ((Integer)com.google.android.apps.translate.inputs.VoiceInputPopup.c(a).getTag(com.google.android.apps.translate.inputs.VoiceInputPopup.m())).intValue();
        com.google.android.apps.translate.inputs.VoiceInputPopup.c(a).setTag(com.google.android.apps.translate.inputs.VoiceInputPopup.m(), Integer.valueOf(i + 1));
        if (com.google.android.apps.translate.inputs.VoiceInputPopup.e(a) < 0)
        {
            VoiceInputPopup.a(a, VoiceInputPopup.a(a).getText().toString().length());
        }
        Singleton.b().a(Event.SPEECH_INPUT_USED, VoiceInputPopup.a(com.google.android.apps.translate.inputs.VoiceInputPopup.c(a)).getShortName(), VoiceInputPopup.a(VoiceInputPopup.d(a)).getShortName());
        if (b.g(a.getContext()))
        {
            VoiceInputPopup.a(a, VoiceInputPopup.a(a).getText().toString(), VoiceInputPopup.a(VoiceInputPopup.d(a)));
            return;
        } else
        {
            a.j();
            return;
        }
    }
}
