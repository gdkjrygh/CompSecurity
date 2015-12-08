// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;

public final class WE
{

    private static final WE a = new WE();

    private WE()
    {
    }

    public static int a(MediaExtractor mediaextractor)
    {
        for (int i = 0; i < mediaextractor.getTrackCount(); i++)
        {
            (new StringBuilder("format for track:")).append(i).append(" is ").append(mediaextractor.getTrackFormat(i).getString("mime"));
            if (mediaextractor.getTrackFormat(i).getString("mime").startsWith("audio/"))
            {
                return i;
            }
        }

        return -1;
    }

    public static WE a()
    {
        return a;
    }

    public static MediaCodecInfo a(String s)
    {
        int k = MediaCodecList.getCodecCount();
label0:
        for (int i = 0; i < k; i++)
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
            if (!mediacodecinfo.isEncoder())
            {
                continue;
            }
            String as[] = mediacodecinfo.getSupportedTypes();
            int j = 0;
            do
            {
                if (j >= as.length)
                {
                    continue label0;
                }
                if (as[j].equalsIgnoreCase(s))
                {
                    (new StringBuilder("Using codec : ")).append(mediacodecinfo.getName());
                    return mediacodecinfo;
                }
                j++;
            } while (true);
        }

        throw new Wu((new StringBuilder("No codec for ")).append(s).toString());
    }

    public static String a(MediaFormat mediaformat)
    {
        return mediaformat.getString("mime");
    }

    public static int b(MediaFormat mediaformat)
    {
        return mediaformat.getInteger("sample-rate");
    }

    public static MediaExtractor b(String s)
    {
        MediaExtractor mediaextractor = new MediaExtractor();
        mediaextractor.setDataSource(s);
        return mediaextractor;
    }

    public static int c(MediaFormat mediaformat)
    {
        return mediaformat.getInteger("channel-count");
    }

    public static long c(String s)
    {
        return (new File(s)).length();
    }

    public static long d(MediaFormat mediaformat)
    {
        return (long)(mediaformat.getInteger("sample-rate") * mediaformat.getInteger("channel-count") << 1);
    }

}
