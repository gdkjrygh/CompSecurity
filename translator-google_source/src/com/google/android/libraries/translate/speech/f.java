// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.speech:
//            h, c, g, e

public final class f
    implements RecognitionListener, h
{

    private final Context a;
    private final SpeechRecognizer b;
    private final com.google.android.libraries.translate.speech.e c;
    private String d;
    private String e;
    private boolean f;

    public f(Context context, String s, com.google.android.libraries.translate.speech.e e1)
    {
        f = false;
        a = context;
        d = s;
        c = e1;
        b = SpeechRecognizer.createSpeechRecognizer(a);
        b.setRecognitionListener(this);
    }

    private static String a(Bundle bundle)
    {
        bundle = bundle.getStringArrayList("results_recognition");
        if (bundle != null && !bundle.isEmpty())
        {
            return (String)bundle.get(0);
        } else
        {
            return null;
        }
    }

    public final void b()
    {
        b.stopListening();
        b.destroy();
        f = true;
    }

    public final void b_()
    {
        if (((c)Singleton.e.b()).b(d))
        {
            Intent intent = (new Intent("android.speech.action.RECOGNIZE_SPEECH")).putExtra("calling_package", Singleton.a().getPackageName()).putExtra("android.speech.extra.LANGUAGE", d).putExtra("android.speech.extra.PARTIAL_RESULTS", true).putExtra("android.speech.extra.MAX_RESULTS", 5).putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            b.startListening(intent);
            f = true;
            return;
        } else
        {
            (new Handler()).post(new g(this));
            return;
        }
    }

    public final void c()
    {
        b.stopListening();
        f = true;
    }

    public final void onBeginningOfSpeech()
    {
    }

    public final void onBufferReceived(byte abyte0[])
    {
    }

    public final void onEndOfSpeech()
    {
        c.g();
        if (!f)
        {
            Singleton.b().a(Event.NATIVE_SPEECH_OUT_OF_SYNC, d, null);
        }
    }

    public final void onError(int i)
    {
        Object obj;
        com.google.android.libraries.translate.speech.e e1;
        e1 = c;
        obj = a;
        i;
        JVM INSTR tableswitch 1 7: default 52
    //                   1 125
    //                   2 125
    //                   3 133
    //                   4 125
    //                   5 52
    //                   6 133
    //                   7 114;
           goto _L1 _L2 _L2 _L3 _L2 _L1 _L3 _L4
_L1:
        int j = com.google.android.libraries.translate.f.voice_error;
_L7:
        obj = String.valueOf(((Context) (obj)).getString(j));
        obj = (new StringBuilder(String.valueOf(obj).length() + 15)).append(((String) (obj))).append(" (E").append(i).append(")").toString();
_L5:
        e1.c(((String) (obj)));
        return;
_L4:
        obj = ((Context) (obj)).getString(com.google.android.libraries.translate.f.voice_no_match);
        if (true) goto _L5; else goto _L2
_L2:
        j = com.google.android.libraries.translate.f.voice_network_error;
        continue; /* Loop/switch isn't completed */
_L3:
        j = com.google.android.libraries.translate.f.voice_recoverable_error;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void onEvent(int i, Bundle bundle)
    {
    }

    public final void onPartialResults(Bundle bundle)
    {
        e = a(bundle);
        c.a(e, null, false);
    }

    public final void onReadyForSpeech(Bundle bundle)
    {
        c.f();
    }

    public final void onResults(Bundle bundle)
    {
        String s = a(bundle);
        bundle = s;
        if (TextUtils.isEmpty(s))
        {
            bundle = s;
            if (e != null)
            {
                bundle = e;
            }
        }
        c.a(bundle, null, true);
        Singleton.b().a(Event.NATIVE_SPEECH_USED, d, null);
        f = false;
    }

    public final void onRmsChanged(float f1)
    {
        c.a(Math.min(f1, 10F));
    }
}
