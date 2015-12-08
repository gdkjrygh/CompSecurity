// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.media;

import Bm;
import com.snapchat.android.Timber;
import java.util.Locale;

public final class VideoStreamingConfiguration
{
    public static final class StreamingMode extends Enum
    {

        private static final StreamingMode $VALUES[];
        public static final StreamingMode CLIENT_DECIDES;
        public static final StreamingMode HLS;
        public static final StreamingMode MP4;

        public static StreamingMode valueOf(String s)
        {
            return (StreamingMode)Enum.valueOf(com/snapchat/android/discover/ui/media/VideoStreamingConfiguration$StreamingMode, s);
        }

        public static StreamingMode[] values()
        {
            return (StreamingMode[])$VALUES.clone();
        }

        static 
        {
            HLS = new StreamingMode("HLS", 0);
            MP4 = new StreamingMode("MP4", 1);
            CLIENT_DECIDES = new StreamingMode("CLIENT_DECIDES", 2);
            $VALUES = (new StreamingMode[] {
                HLS, MP4, CLIENT_DECIDES
            });
        }

        private StreamingMode(String s, int i)
        {
            super(s, i);
        }
    }


    private static String b;
    public final Bm a;

    public VideoStreamingConfiguration()
    {
        this(Bm.a());
    }

    private VideoStreamingConfiguration(Bm bm)
    {
        a = bm;
    }

    public final StreamingMode a()
    {
        String s = a.a("STREAMING", "STREAMING_MODE", b);
        StreamingMode streamingmode;
        try
        {
            streamingmode = StreamingMode.valueOf(s.toUpperCase(Locale.ENGLISH));
        }
        catch (Exception exception)
        {
            Timber.e("VideoStreamingConfiguration", "Invalid streaming mode %s (%s)", new Object[] {
                s, exception
            });
            return StreamingMode.HLS;
        }
        return streamingmode;
    }

    static 
    {
        b = StreamingMode.MP4.name();
    }
}
