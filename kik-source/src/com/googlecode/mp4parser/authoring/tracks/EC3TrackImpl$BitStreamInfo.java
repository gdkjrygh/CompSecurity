// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;


// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            EC3TrackImpl

public static class  extends com.googlecode.mp4parser.boxes.StreamInfo
{

    public int bitrate;
    public int chanmap;
    public int frameSize;
    public int samplerate;
    public int strmtyp;
    public int substreamid;

    public String toString()
    {
        return (new StringBuilder("BitStreamInfo{frameSize=")).append(frameSize).append(", substreamid=").append(substreamid).append(", bitrate=").append(bitrate).append(", samplerate=").append(samplerate).append(", strmtyp=").append(strmtyp).append(", chanmap=").append(chanmap).append('}').toString();
    }

    public ()
    {
    }
}
