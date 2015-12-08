// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class jja
    implements jiz
{

    jja()
    {
    }

    public final int a()
    {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo a(int i)
    {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean a(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
    {
        return "video/avc".equals(s);
    }

    public final boolean b()
    {
        return false;
    }
}
