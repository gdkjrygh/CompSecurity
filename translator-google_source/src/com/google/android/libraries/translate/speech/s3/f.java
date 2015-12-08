// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import android.media.AudioTrack;
import com.google.android.apps.gsa.speech.audio.h;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e;
import com.google.android.libraries.translate.speech.a;
import com.google.android.libraries.translate.speech.b;
import java.util.concurrent.ExecutorService;

final class f extends h
{

    f()
    {
    }

    public final int a()
    {
        a a1 = (a)Singleton.f.b();
        byte abyte0[] = a1.a(e.speak_now);
        if (abyte0 == a.a)
        {
            return -1;
        }
        int i = abyte0.length;
        AudioTrack audiotrack = new AudioTrack(3, 16000, 4, 2, i, 1);
        if (audiotrack.getState() != 1)
        {
            return -1;
        } else
        {
            com.google.android.libraries.translate.speech.a.a(abyte0, audiotrack, i);
            int j = audiotrack.getAudioSessionId();
            audiotrack.play();
            a1.b.execute(new b(audiotrack, i));
            return j;
        }
    }
}
