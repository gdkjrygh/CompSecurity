// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;


// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            MP3TrackImpl

class this._cls0
{

    int bitRate;
    int bitRateIndex;
    int channelCount;
    int channelMode;
    int layer;
    int mpegVersion;
    int padding;
    int protectionAbsent;
    int sampleFrequencyIndex;
    int sampleRate;
    final MP3TrackImpl this$0;

    int getFrameLength()
    {
        return (bitRate * 144) / sampleRate + padding;
    }

    ()
    {
        this$0 = MP3TrackImpl.this;
        super();
    }
}
