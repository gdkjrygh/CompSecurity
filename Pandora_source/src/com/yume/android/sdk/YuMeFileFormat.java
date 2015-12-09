// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeFileFormat extends Enum
{

    public static final YuMeFileFormat IMAGE_BMP;
    public static final YuMeFileFormat IMAGE_GIF;
    public static final YuMeFileFormat IMAGE_JPEG;
    public static final YuMeFileFormat IMAGE_PNG;
    public static final YuMeFileFormat IMAGE_WEBP;
    public static final YuMeFileFormat NONE;
    public static final YuMeFileFormat VIDEO_3GPP_H263_AMR;
    public static final YuMeFileFormat VIDEO_3GPP_H264AVC_AAC;
    public static final YuMeFileFormat VIDEO_3GPP_MPEG4_AAC;
    public static final YuMeFileFormat VIDEO_3GPP_MPEG4_AMR;
    public static final YuMeFileFormat VIDEO_MKV_VP8_VORBIS;
    public static final YuMeFileFormat VIDEO_MP4_H263_AAC;
    public static final YuMeFileFormat VIDEO_MP4_H264AVC_AAC;
    public static final YuMeFileFormat VIDEO_TS_H264AVC_AAC;
    public static final YuMeFileFormat VIDEO_WEBM_VP8_VORBIS;
    private static final YuMeFileFormat a[];

    private YuMeFileFormat(String s, int i)
    {
        super(s, i);
    }

    public static YuMeFileFormat valueOf(String s)
    {
        return (YuMeFileFormat)Enum.valueOf(com/yume/android/sdk/YuMeFileFormat, s);
    }

    public static YuMeFileFormat[] values()
    {
        YuMeFileFormat ayumefileformat[] = a;
        int i = ayumefileformat.length;
        YuMeFileFormat ayumefileformat1[] = new YuMeFileFormat[i];
        System.arraycopy(ayumefileformat, 0, ayumefileformat1, 0, i);
        return ayumefileformat1;
    }

    static 
    {
        NONE = new YuMeFileFormat("NONE", 0);
        VIDEO_3GPP_H263_AMR = new YuMeFileFormat("VIDEO_3GPP_H263_AMR", 1);
        VIDEO_MP4_H263_AAC = new YuMeFileFormat("VIDEO_MP4_H263_AAC", 2);
        VIDEO_3GPP_H264AVC_AAC = new YuMeFileFormat("VIDEO_3GPP_H264AVC_AAC", 3);
        VIDEO_MP4_H264AVC_AAC = new YuMeFileFormat("VIDEO_MP4_H264AVC_AAC", 4);
        VIDEO_TS_H264AVC_AAC = new YuMeFileFormat("VIDEO_TS_H264AVC_AAC", 5);
        VIDEO_3GPP_MPEG4_AAC = new YuMeFileFormat("VIDEO_3GPP_MPEG4_AAC", 6);
        VIDEO_3GPP_MPEG4_AMR = new YuMeFileFormat("VIDEO_3GPP_MPEG4_AMR", 7);
        VIDEO_WEBM_VP8_VORBIS = new YuMeFileFormat("VIDEO_WEBM_VP8_VORBIS", 8);
        VIDEO_MKV_VP8_VORBIS = new YuMeFileFormat("VIDEO_MKV_VP8_VORBIS", 9);
        IMAGE_JPEG = new YuMeFileFormat("IMAGE_JPEG", 10);
        IMAGE_PNG = new YuMeFileFormat("IMAGE_PNG", 11);
        IMAGE_GIF = new YuMeFileFormat("IMAGE_GIF", 12);
        IMAGE_BMP = new YuMeFileFormat("IMAGE_BMP", 13);
        IMAGE_WEBP = new YuMeFileFormat("IMAGE_WEBP", 14);
        a = (new YuMeFileFormat[] {
            NONE, VIDEO_3GPP_H263_AMR, VIDEO_MP4_H263_AAC, VIDEO_3GPP_H264AVC_AAC, VIDEO_MP4_H264AVC_AAC, VIDEO_TS_H264AVC_AAC, VIDEO_3GPP_MPEG4_AAC, VIDEO_3GPP_MPEG4_AMR, VIDEO_WEBM_VP8_VORBIS, VIDEO_MKV_VP8_VORBIS, 
            IMAGE_JPEG, IMAGE_PNG, IMAGE_GIF, IMAGE_BMP, IMAGE_WEBP
        });
    }
}
