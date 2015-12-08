// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

// Referenced classes of package com.soundcloud.android.creators.record:
//            AudioConfig

public class ScAudioTrack extends AudioTrack
{

    private final byte audioData[];

    public ScAudioTrack(AudioConfig audioconfig, int i)
    {
        super(3, audioconfig.sampleRate, audioconfig.getChannelConfig(false), audioconfig.getFormat(), i, 1);
        audioData = new byte[i];
    }

    public int write(ByteBuffer bytebuffer, int i)
    {
        bytebuffer.get(audioData, 0, i);
        return write(audioData, 0, i);
    }
}
