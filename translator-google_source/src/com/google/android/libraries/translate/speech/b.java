// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech;

import android.media.AudioTrack;

// Referenced classes of package com.google.android.libraries.translate.speech:
//            a

public final class b
    implements Runnable
{

    final AudioTrack a;
    final int b;

    public b(AudioTrack audiotrack, int i)
    {
        a = audiotrack;
        b = i;
    }

    public final void run()
    {
        int i;
        int k;
        long l;
        k = b / 2;
        i = -1;
        l = 0L;
_L6:
        int j = a.getPlaybackHeadPosition();
        if (j >= k || a.getPlayState() != 3) goto _L2; else goto _L1
_L1:
        long l2 = com.google.android.libraries.translate.speech.a.a(((k - j) * 1000) / 16000);
        if (j != i) goto _L4; else goto _L3
_L3:
        long l1;
        l1 = l + l2;
        l = l1;
        if (l1 <= 500L) goto _L5; else goto _L2
_L2:
        a.release();
        return;
_L4:
        l = 0L;
_L5:
        Thread.sleep(l2);
        i = j;
          goto _L6
        InterruptedException interruptedexception;
        interruptedexception;
          goto _L2
    }
}
