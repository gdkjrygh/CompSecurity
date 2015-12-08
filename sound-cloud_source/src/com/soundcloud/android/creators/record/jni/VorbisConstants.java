// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.jni;


public final class VorbisConstants extends Enum
{

    private static final VorbisConstants $VALUES[];
    public static final VorbisConstants OV_EBADHEADER;
    public static final VorbisConstants OV_EBADLINK;
    public static final VorbisConstants OV_EBADPACKET;
    public static final VorbisConstants OV_EFAULT;
    public static final VorbisConstants OV_EIMPL;
    public static final VorbisConstants OV_EINVAL;
    public static final VorbisConstants OV_ENOSEEK;
    public static final VorbisConstants OV_ENOTAUDIO;
    public static final VorbisConstants OV_ENOTVORBIS;
    public static final VorbisConstants OV_EOF;
    public static final VorbisConstants OV_EREAD;
    public static final VorbisConstants OV_EVERSION;
    public static final VorbisConstants OV_FALSE;
    public static final VorbisConstants OV_HOLE;
    private final int code;

    private VorbisConstants(String s, int i, int j)
    {
        super(s, i);
        code = j;
    }

    public static String getString(int i)
    {
        VorbisConstants avorbisconstants[] = values();
        int k = avorbisconstants.length;
        for (int j = 0; j < k; j++)
        {
            VorbisConstants vorbisconstants = avorbisconstants[j];
            if (vorbisconstants.code == i)
            {
                return vorbisconstants.name();
            }
        }

        return "unknown";
    }

    public static VorbisConstants valueOf(String s)
    {
        return (VorbisConstants)Enum.valueOf(com/soundcloud/android/creators/record/jni/VorbisConstants, s);
    }

    public static VorbisConstants[] values()
    {
        return (VorbisConstants[])$VALUES.clone();
    }

    static 
    {
        OV_FALSE = new VorbisConstants("OV_FALSE", 0, -1);
        OV_EOF = new VorbisConstants("OV_EOF", 1, -2);
        OV_HOLE = new VorbisConstants("OV_HOLE", 2, -3);
        OV_EREAD = new VorbisConstants("OV_EREAD", 3, -128);
        OV_EFAULT = new VorbisConstants("OV_EFAULT", 4, -129);
        OV_EIMPL = new VorbisConstants("OV_EIMPL", 5, -130);
        OV_EINVAL = new VorbisConstants("OV_EINVAL", 6, -131);
        OV_ENOTVORBIS = new VorbisConstants("OV_ENOTVORBIS", 7, -132);
        OV_EBADHEADER = new VorbisConstants("OV_EBADHEADER", 8, -133);
        OV_EVERSION = new VorbisConstants("OV_EVERSION", 9, -134);
        OV_ENOTAUDIO = new VorbisConstants("OV_ENOTAUDIO", 10, -135);
        OV_EBADPACKET = new VorbisConstants("OV_EBADPACKET", 11, -136);
        OV_EBADLINK = new VorbisConstants("OV_EBADLINK", 12, -137);
        OV_ENOSEEK = new VorbisConstants("OV_ENOSEEK", 13, -138);
        $VALUES = (new VorbisConstants[] {
            OV_FALSE, OV_EOF, OV_HOLE, OV_EREAD, OV_EFAULT, OV_EIMPL, OV_EINVAL, OV_ENOTVORBIS, OV_EBADHEADER, OV_EVERSION, 
            OV_ENOTAUDIO, OV_EBADPACKET, OV_EBADLINK, OV_ENOSEEK
        });
    }
}
