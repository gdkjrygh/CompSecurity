// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;


public final class PlayoutMetadata
{

    private static final long DELTA_CURRENT = 1000L;
    public int audioTrackType;
    public int duration;
    public int instantBitRate;
    public boolean isHD;
    public boolean isSuperHD;
    public String language;
    public int numChannels;
    public int position;
    public int targetBitRate;
    private long timestamp;

    public PlayoutMetadata(int i, int j, int k, int l, boolean flag, boolean flag1, String s, 
            int i1, int j1)
    {
        timestamp = System.currentTimeMillis();
        position = i;
        duration = j;
        instantBitRate = k;
        targetBitRate = l;
        isHD = flag;
        isSuperHD = flag1;
        language = s;
        numChannels = i1;
        audioTrackType = j1;
    }

    public String getAudioChannel()
    {
        switch (numChannels)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        default:
            return String.valueOf(numChannels);

        case 1: // '\001'
            return "Mono";

        case 2: // '\002'
            return "Stereo";

        case 6: // '\006'
            return "5.1";

        case 7: // '\007'
            return "6.1";

        case 8: // '\b'
            return "7.1";
        }
    }

    public String getAudioTrackType()
    {
        switch (audioTrackType)
        {
        default:
            return "uknown";

        case 0: // '\0'
            return "primary";

        case 1: // '\001'
            return "commentary";

        case 2: // '\002'
            return "assitive";
        }
    }

    public boolean isCurrent()
    {
        return System.currentTimeMillis() - 1000L < timestamp;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PlayoutMetadata [timestamp=").append(timestamp).append(", position=").append(position).append(", duration=").append(duration).append(", instantBitRate=").append(instantBitRate).append(", targetBitRate=").append(targetBitRate).append(", isHD=").append(isHD).append(", isSuperHD=").append(isSuperHD).append(", language=").append(language).append(", numChannels=").append(getAudioChannel()).append(", audioTrackType=").append(getAudioTrackType()).append("]").toString();
    }
}
