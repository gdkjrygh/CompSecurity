// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.audio;

import android.media.AudioTrack;
import android.os.ConditionVariable;

// Referenced classes of package com.google.android.exoplayer.audio:
//            AudioTrack

public final class a extends Thread
{

    private AudioTrack a;
    private com.google.android.exoplayer.audio.AudioTrack b;

    public final void run()
    {
        a.release();
        b.a.open();
        return;
        Exception exception;
        exception;
        b.a.open();
        throw exception;
    }

    (com.google.android.exoplayer.audio.AudioTrack audiotrack, AudioTrack audiotrack1)
    {
        b = audiotrack;
        a = audiotrack1;
        super();
    }
}
