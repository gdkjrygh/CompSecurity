// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.content.Context;
import android.speech.tts.TextToSpeech;

// Referenced classes of package com.google.android.libraries.translate.tts.a:
//            i

final class h
{

    TextToSpeech a;
    String b;
    private String c;

    public h(Context context, android.speech.tts.TextToSpeech.EngineInfo engineinfo)
    {
        b = engineinfo.name;
        c = engineinfo.label;
        a = new TextToSpeech(context, new i(this), engineinfo.name);
    }
}
