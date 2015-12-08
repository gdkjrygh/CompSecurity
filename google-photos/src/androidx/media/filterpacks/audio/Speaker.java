// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.audio;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import ajw;
import akd;
import android.media.AudioTrack;

public class Speaker extends ahn
{

    private static final aif AUDIO_INPUT_TYPE = aif.a(akd);
    private AudioTrack mAudioTrack;
    private int mChannelCount;
    private int mSampleRate;

    public Speaker(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        return (new ajw()).a("audio", 2, AUDIO_INPUT_TYPE).a();
    }

    protected final void e()
    {
        akd akd1;
        akd1 = (akd)a("audio").a().d().m();
        if (akd1 == null)
        {
            return;
        }
        if (akd1.a == mSampleRate && akd1.b == mChannelCount) goto _L2; else goto _L1
_L1:
        mSampleRate = akd1.a;
        mChannelCount = akd1.b;
        if (mAudioTrack != null)
        {
            mAudioTrack.release();
        }
        mChannelCount;
        JVM INSTR tableswitch 1 2: default 104
    //                   1 114
    //                   2 183;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException("Only mono and stereo channel configurations are supported");
_L4:
        byte byte0 = 4;
_L7:
        int i = AudioTrack.getMinBufferSize(mSampleRate, byte0, 2);
        mAudioTrack = new AudioTrack(3, mSampleRate, byte0, 2, i, 1);
        if (mAudioTrack.getState() == 1)
        {
            mAudioTrack.play();
        }
_L2:
        mAudioTrack.write(akd1.c, 0, akd1.c.length);
        return;
_L5:
        byte0 = 12;
        if (true) goto _L7; else goto _L6
_L6:
    }

}
