// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.content.Context;
import android.net.Uri;
import com.facebook.soloader.SoLoader;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.TrackInfo;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.video.view.exo:
//            SampleExtractor

public final class RtmpSampleExtractor
    implements SampleExtractor
{

    private boolean a;
    private boolean b;
    private final Context c;
    private final Uri d;
    private int e;
    private TrackInfo f[];
    private int g;

    public RtmpSampleExtractor(Context context, Uri uri)
    {
        boolean flag = false;
        super();
        a = false;
        b = false;
        e = 0;
        g = 0;
        if (Util.a >= 16)
        {
            flag = true;
        }
        Assertions.b(flag);
        c = (Context)Assertions.a(context);
        d = (Uri)Assertions.a(uri);
    }

    public final int a(int i, SampleHolder sampleholder)
    {
        String s;
        if (i == 0)
        {
            s = "(V) ";
        } else
        if (i == 1)
        {
            s = "(A) ";
        } else
        {
            s = "(Unknown) ";
        }
        if (sampleholder.b != null)
        {
            StringBuffer stringbuffer = new StringBuffer(40);
            sampleholder.b.clear();
            int j = sampleholder.b.position();
            int k = readRtmpStreamAndAdvance(e, i, sampleholder.b, stringbuffer);
            if (k > 0)
            {
                sampleholder.c = k;
                sampleholder.b.limit(k + j);
                sampleholder.b.position(j + k);
                if (i == 0)
                {
                    sampleholder.e = Long.valueOf(Long.parseLong(stringbuffer.toString())).longValue();
                    if (k > 4)
                    {
                        sampleholder.b.position(j);
                        sampleholder.b.limit(j + k);
                        i = sampleholder.b.get(4);
                        sampleholder.b.position(j + k);
                        if ((i & 0x1f) == 5)
                        {
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
                        if (i != 0)
                        {
                            sampleholder.d = 1;
                        }
                    }
                } else
                {
                    sampleholder.e = Long.valueOf(Long.parseLong(stringbuffer.toString())).longValue();
                    sampleholder.d = 1;
                }
                return -3;
            }
            if (k == -1)
            {
                (new StringBuilder()).append(s).append("error readRtmpStreamAndAdvance END_OF_STREAM");
                return -1;
            }
            if (k == 0)
            {
                return -2;
            }
            (new StringBuilder()).append(s).append("error: readRtmpStreamAndAdvance return=").append(k);
        } else
        {
            sampleholder.c = 0;
        }
        return -3;
    }

    public final void a(int i, MediaFormatHolder mediaformatholder)
    {
        if (i == 0)
        {
            ByteBuffer bytebuffer2 = getCsd0(e);
            ByteBuffer bytebuffer = getCsd1(e);
            ArrayList arraylist = new ArrayList();
            byte abyte2[] = new byte[bytebuffer2.limit()];
            bytebuffer2.get(abyte2);
            arraylist.add(abyte2);
            byte abyte0[] = new byte[bytebuffer.limit()];
            bytebuffer.get(abyte0);
            arraylist.add(abyte0);
            i = getWidth(e);
            mediaformatholder.a = MediaFormat.a("video/avc", i, i, getHeight(e), arraylist);
            mediaformatholder.a.a().toString();
            return;
        }
        if (i == 1)
        {
            i = getAudioChannelCount(e);
            int j = getAudioSampleRate(e);
            ByteBuffer bytebuffer1 = getAsc(e);
            ArrayList arraylist1 = new ArrayList();
            byte abyte1[] = new byte[bytebuffer1.limit()];
            bytebuffer1.get(abyte1);
            arraylist1.add(abyte1);
            mediaformatholder.a = MediaFormat.b("audio/mp4a-latm", -1, i, j, arraylist1);
            mediaformatholder.a.a().toString();
            return;
        } else
        {
            throw new RuntimeException((new StringBuilder("invalid track value=")).append(i).toString());
        }
    }

    public final boolean a()
    {
        g = g + 1;
        int i = g;
        if (b)
        {
            return true;
        }
        if (a) goto _L2; else goto _L1
_L1:
        a = true;
        e = initRtmpStream(d.toString());
        if (e == 0) goto _L4; else goto _L3
_L3:
        int j = e;
        a = true;
_L6:
        return b;
_L4:
        a = false;
        throw new RuntimeException("Failed to init rtmp");
_L2:
        int k = getRtmpStreamStatus(e);
        if (k == 0)
        {
            f = new TrackInfo[2];
            f[0] = new TrackInfo("video/avc", -1L);
            f[1] = new TrackInfo("audio/mp4a-latm", -1L);
            b = true;
        } else
        if (k == 1)
        {
            b = false;
        } else
        {
            throw new RuntimeException((new StringBuilder("unknown stream status from rtmp ret=")).append(k).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final TrackInfo[] b()
    {
        return f;
    }

    public final long c()
    {
        return -1L;
    }

    public final void d()
    {
        if (e > 0)
        {
            releaseRtmpStream(e);
        }
    }

    public final native int fetchValue(StringBuffer stringbuffer);

    public final native ByteBuffer getAdts(int i);

    public final native ByteBuffer getAsc(int i);

    public final native int getAudioChannelCount(int i);

    public final native int getAudioSampleRate(int i);

    public final native ByteBuffer getCsd0(int i);

    public final native ByteBuffer getCsd1(int i);

    public final native int getHeight(int i);

    public final native int getRtmpStreamStatus(int i);

    public final native int getWidth(int i);

    public final native int initRtmpStream(String s);

    public final native int readRtmpStreamAndAdvance(int i, int j, ByteBuffer bytebuffer, StringBuffer stringbuffer);

    public final native void releaseRtmpStream(int i);

    static 
    {
        SoLoader.a("fbrtmp");
    }
}
