// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.amf;

import android.graphics.Bitmap;

public class AMFNative
{

    public static final String b = com/roidapp/amf/AMFNative.getSimpleName();

    public AMFNative()
    {
    }

    protected static native int nativeConcatFiles(String as[], String s);

    protected native int nativeAddCompressedFrameA(int i, long l, byte abyte0[], int j, int k, int i1);

    protected native int nativeAddCompressedFrameV(int i, long l, byte abyte0[], int j, int k, int i1);

    protected native int nativeAddExtraDataA(int i, byte abyte0[], int j, int k);

    protected native int nativeAddExtraDataV(int i, byte abyte0[], int j, int k);

    protected native long nativeDecodeActualTimestampA(int i);

    protected native long nativeDecodeActualTimestampV(int i);

    protected native int nativeDecodeEoF(int i);

    protected native int nativeDecodeFrameA(int i, long l, byte abyte0[], int j, int k);

    protected native int nativeDecodeFrameV(int i, long l, byte abyte0[], int j, int k, int i1, 
            int j1);

    protected native int nativeDecodeGetAudioBufferSize(int i);

    protected native int nativeDecodeGetAudioChannelLayout(int i);

    protected native int nativeDecodeGetAudioChannels(int i);

    protected native int nativeDecodeGetAudioFormat(int i);

    protected native int nativeDecodeGetAudioFrameSize(int i);

    protected native int nativeDecodeGetAudioSamplerate(int i);

    protected native int nativeDecodeSeekTo(int i, long l);

    protected native int nativeDecodeSetAudioChannels(int i, int j);

    protected native int nativeDecodeSetAudioFormat(int i, int j);

    protected native int nativeDecodeSetAudioFrameSize(int i, int j);

    protected native int nativeDecodeSetAudioSamplerate(int i, int j);

    protected native int nativeEncodeBufferA(int i, long l, byte abyte0[], int j, int k);

    protected native int nativeEncodeBufferV(int i, long l, byte abyte0[], int j, int k, int i1, 
            int j1);

    protected native int nativeEncodeFrameV(int i, long l, Bitmap bitmap, boolean flag, boolean flag1);

    protected native long nativeEncodeGetDurationA(int i);

    protected native long nativeEncodeGetDurationV(int i);

    protected native int nativeEncodeSetFps(int i, double d);

    protected native int nativeEncodeSetResolution(int i, int j, int k);

    protected native int nativeEncodeSetVideoQuality(int i, int j);

    protected native int nativeGetLastError(int i);

    protected native int nativeInit();

    protected native void nativeRelease(int i);

    protected native int nativeRgbaBitmapToRgbaBuffer(int i, Bitmap bitmap, byte abyte0[]);

    protected native int nativeRgbaBitmapToYuv(int i, Bitmap bitmap, byte abyte0[], int j);

    protected native int nativeRgbaToYuv(int i, byte abyte0[], byte abyte1[], int j, int k, int l);

    protected native int nativeSetAudioStartFrom(int i, long l);

    protected native int nativeSetDecodeFrom(int i, String s);

    protected native int nativeSetEncodeDuration(int i, long l);

    protected native int nativeSetEncodeTo(int i, String s);

    static 
    {
        try
        {
            System.loadLibrary("avutil-54");
            System.loadLibrary("swresample-1");
            System.loadLibrary("swscale-3");
            System.loadLibrary("avcodec-56");
            System.loadLibrary("avformat-56");
            System.loadLibrary("amf");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            unsatisfiedlinkerror.printStackTrace();
            throw unsatisfiedlinkerror;
        }
    }
}
