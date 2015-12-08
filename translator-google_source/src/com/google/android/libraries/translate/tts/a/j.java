// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.os.Handler;
import com.google.android.libraries.translate.tts.e;

public class j
    implements android.speech.tts.TextToSpeech.OnUtteranceCompletedListener, Runnable
{

    private final e a;
    private final Handler b = new Handler();

    public j(e e1)
    {
        a = e1;
    }

    public void onUtteranceCompleted(String s)
    {
        b.post(this);
    }

    public void run()
    {
        if (a != null)
        {
            a.j();
        }
    }
}
