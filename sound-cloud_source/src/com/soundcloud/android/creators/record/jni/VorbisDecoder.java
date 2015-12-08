// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.jni;

import java.io.File;
import java.nio.ByteBuffer;

// Referenced classes of package com.soundcloud.android.creators.record.jni:
//            DecoderException, VorbisInfo

public class VorbisDecoder
{

    private static final boolean ALIGN_SEEK_ON_PAGE = false;
    private static final String TAG = "VorbisDecoder";
    private int decoder_state;
    public final File file;

    public VorbisDecoder(File file1)
        throws DecoderException
    {
        file = file1;
        int i = init(file1.getAbsolutePath());
        if (i != 0)
        {
            throw new DecoderException("Error initializing decoder", i);
        } else
        {
            return;
        }
    }

    private native int decodeToFile(String s);

    private native int init(String s);

    public native int decode(ByteBuffer bytebuffer, int i);

    public void decodeToFile(File file1)
        throws DecoderException
    {
        int i = decodeToFile(file1.getAbsolutePath());
        if (i < 0)
        {
            throw new DecoderException("decode return < 0", i);
        } else
        {
            return;
        }
    }

    protected void finalize()
        throws Throwable
    {
        super.finalize();
        if (getState() >= 0)
        {
            release();
        }
    }

    public native VorbisInfo getInfo();

    public native int getState();

    public int pcmSeek(long l)
    {
        return pcmSeek(l, false);
    }

    public native int pcmSeek(long l, boolean flag);

    public native void release();

    public int timeSeek(double d)
    {
        return timeSeek(d, false);
    }

    public native int timeSeek(double d, boolean flag);

    public native double timeTell();

    static 
    {
        System.loadLibrary("soundcloud_vorbis_decoder");
_L1:
        return;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        if ("Dalvik".equals(System.getProperty("java.vm.name")))
        {
            throw unsatisfiedlinkerror;
        }
          goto _L1
    }
}
