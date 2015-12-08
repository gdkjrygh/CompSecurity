// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.transcoding;

import Bw;
import VX;
import WA;
import Wx;
import android.media.MediaFormat;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.model.Mediabryo;
import rt;

public final class TranscodingTaskMetrics extends EasyMetric
{
    public static final class TranscodingType extends Enum
    {

        private static final TranscodingType $VALUES[];
        public static final TranscodingType PREVIEW;
        public static final TranscodingType SETUP;
        public static final TranscodingType TRANSCODING;

        public static TranscodingType valueOf(String s)
        {
            return (TranscodingType)Enum.valueOf(com/snapchat/android/analytics/transcoding/TranscodingTaskMetrics$TranscodingType, s);
        }

        public static TranscodingType[] values()
        {
            return (TranscodingType[])$VALUES.clone();
        }

        static 
        {
            PREVIEW = new TranscodingType("PREVIEW", 0);
            TRANSCODING = new TranscodingType("TRANSCODING", 1);
            SETUP = new TranscodingType("SETUP", 2);
            $VALUES = (new TranscodingType[] {
                PREVIEW, TRANSCODING, SETUP
            });
        }

        private TranscodingType(String s, int i)
        {
            super(s, i);
        }
    }


    private TranscodingType f;

    public TranscodingTaskMetrics(TranscodingType transcodingtype)
    {
        super("TRANSCODING");
        b();
        f = transcodingtype;
    }

    public final void a(Bw bw, Wx wx, Wv.c c, String s)
    {
        a("transcoding_status", c.name());
        a("transcoding_message", s);
        a("retries", Integer.valueOf(bw.mTranscodingState.a()));
        a("transcoding_orientation", Integer.valueOf(((Mediabryo) (bw)).mCameraOrientation));
        a("transcoding_type", f);
        if (wx != null)
        {
            a("video_width", Integer.valueOf(wx.c.b.getInteger("width")));
            a("video_height", Integer.valueOf(wx.c.b.getInteger("height")));
            a("bit_rate", Integer.valueOf(wx.c.b.getInteger("bitrate")));
            a("frame_rate", Integer.valueOf(wx.c.b.getInteger("frame-rate")));
            a("media_duration", Integer.valueOf((int)Math.ceil(wx.c.b.getLong("durationUs") / 0xf4240L)));
            a("transcoding_blurlevel", Integer.valueOf(wx.e));
            bw = "";
            wx = wx.a;
            int j = wx.length;
            for (int i = 0; i < j; i++)
            {
                c = wx[i];
                if (c instanceof WA)
                {
                    bw = ((WA)c).f.name();
                }
            }

            a("transcoding_filter", bw);
        }
        super.a(true);
    }
}
