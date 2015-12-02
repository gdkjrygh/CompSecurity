// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.audio;

import android.media.AudioTrack;

// Referenced classes of package com.google.android.exoplayer.audio:
//            AudioTrack

class a extends Thread
{

    final AudioTrack a;
    final com.google.android.exoplayer.audio.AudioTrack b;

    public void run()
    {
        a.release();
    }

    (com.google.android.exoplayer.audio.AudioTrack audiotrack, AudioTrack audiotrack1)
    {
        b = audiotrack;
        a = audiotrack1;
        super();
    }
}
