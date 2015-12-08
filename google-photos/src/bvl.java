// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;

final class bvl
{

    public final int a;
    public final MediaFormat b;
    public final int c;
    public final MediaFormat d;
    public final long e;

    public bvl(int i, MediaFormat mediaformat, int j, MediaFormat mediaformat1, long l)
    {
        boolean flag2 = true;
        super();
        boolean flag;
        boolean flag1;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mediaformat == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 ^ flag)
        {
            flag2 = false;
        }
        b.a(flag2, "audioTrackIndex and audioTrackFormat must be either both set or both unset");
        a = i;
        b = mediaformat;
        c = b.a(j, "videoTrackIndex", null);
        d = (MediaFormat)b.a(mediaformat1, "videoTrackFormat", null);
        e = b.a(l, "resumePresentationTimeUs");
    }
}
