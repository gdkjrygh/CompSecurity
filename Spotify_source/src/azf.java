// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

public final class azf
    implements azd
{

    private final int a;
    private MediaCodecInfo b[];

    public azf(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a = i;
    }

    private void c()
    {
        if (b == null)
        {
            b = (new MediaCodecList(a)).getCodecInfos();
        }
    }

    public final int a()
    {
        c();
        return b.length;
    }

    public final MediaCodecInfo a(int i)
    {
        c();
        return b[i];
    }

    public final boolean a(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
    {
        return codeccapabilities.isFeatureSupported("secure-playback");
    }

    public final boolean b()
    {
        return true;
    }
}
