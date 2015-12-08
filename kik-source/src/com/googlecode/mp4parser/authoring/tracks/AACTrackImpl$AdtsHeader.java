// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;


// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            AACTrackImpl

class this._cls0
{

    int bufferFullness;
    int channelconfig;
    int copyrightStart;
    int copyrightedStream;
    int frameLength;
    int home;
    int layer;
    int mpegVersion;
    int numAacFramesPerAdtsFrame;
    int original;
    int profile;
    int protectionAbsent;
    int sampleFrequencyIndex;
    int sampleRate;
    final AACTrackImpl this$0;

    int getSize()
    {
        byte byte0;
        if (protectionAbsent == 0)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        return byte0 + 7;
    }

    ()
    {
        this$0 = AACTrackImpl.this;
        super();
    }
}
