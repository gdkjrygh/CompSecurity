// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package kik.android.util:
//            ct

public final class ak
{

    public static int a(MediaExtractor mediaextractor, boolean flag)
    {
        String s;
        int i;
        if (flag)
        {
            s = "video/";
        } else
        {
            s = "audio/";
        }
        for (i = 0; i < mediaextractor.getTrackCount(); i++)
        {
            if (mediaextractor.getTrackFormat(i).getString("mime").startsWith(s))
            {
                return i;
            }
        }

        return -1;
    }

    public static long a(String s)
    {
        long l = ct.c(s);
        int i = b(s);
        int j = d(s);
        return (long)(((double)l / 1000D) * ((double)i / 8D) + (double)j);
    }

    public static void a(MediaExtractor mediaextractor, MediaMuxer mediamuxer, int i)
    {
        if (mediamuxer != null && i >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ByteBuffer bytebuffer = ByteBuffer.allocate(0x40000);
        android.media.MediaCodec.BufferInfo bufferinfo = new android.media.MediaCodec.BufferInfo();
        mediaextractor.selectTrack(i);
        do
        {
            int j = mediaextractor.readSampleData(bytebuffer, 0);
            if (j < 0)
            {
                continue;
            }
            bufferinfo.presentationTimeUs = mediaextractor.getSampleTime();
            bufferinfo.flags = mediaextractor.getSampleFlags();
            bufferinfo.offset = 0;
            bufferinfo.size = j;
            mediamuxer.writeSampleData(i, bytebuffer, bufferinfo);
            mediaextractor.advance();
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int b(String s)
    {
        double d1 = (double)ct.c(s) / 1000D;
        int i = (int)((double)(0xe49249 - d(s)) / d1) * 8;
        if (i > 0xea600)
        {
            return 0xea600;
        } else
        {
            return i;
        }
    }

    public static boolean c(String s)
    {
        MediaExtractor mediaextractor = new MediaExtractor();
        int i;
        boolean flag;
        try
        {
            mediaextractor.setDataSource(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return true;
        }
        if (a(mediaextractor, true) >= 0) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        i = a(mediaextractor, false);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i < 0)
        {
            flag = false;
        } else
        {
            flag = "audio/mp4a-latm".equals(mediaextractor.getTrackFormat(i).getString("mime"));
        }
        if (!flag) goto _L1; else goto _L3
_L3:
        return false;
    }

    private static int d(String s)
    {
        MediaExtractor mediaextractor = new MediaExtractor();
        int i;
        try
        {
            mediaextractor.setDataSource(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        i = a(mediaextractor, false);
        if (i < 0)
        {
            return 0;
        }
        mediaextractor.selectTrack(i);
        s = ByteBuffer.allocate(0x40000);
        i = 0;
        do
        {
            int j = mediaextractor.readSampleData(s, 0);
            if (j >= 0)
            {
                i += j;
                mediaextractor.advance();
            } else
            {
                return i;
            }
        } while (true);
    }
}
