// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videotranscoder.video;

import VM;
import VN;
import VO;
import VU;
import VV;
import WJ;
import WK;
import WS;
import Wc;
import Wy;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import dv;

public class VideoDecoder extends VV
{

    protected static final String TAG = "VideoDecoder";
    private int mBlurLevel;
    public VN mDecoderOutputSurface;
    private WS mEncoder;
    private double mPlaybackRate;
    private final WJ mTranscodingResources;
    int tries;

    private VideoDecoder(WJ wj, VO vo, MediaFormat mediaformat, int i, double d, Wc wc, 
            WK wk, Bitmap bitmap)
    {
        this(wj, mediaformat, i, d, VO.a(wj, wk, bitmap), wc);
    }

    public VideoDecoder(WJ wj, MediaFormat mediaformat, int i, double d, VN vn, Wc wc)
    {
        super(mediaformat, vn.b(), wc);
        mDecoderOutputSurface = null;
        tries = 0;
        (new StringBuilder("input media format w ")).append(mediaformat.getInteger("width")).append(", h ").append(mediaformat.getInteger("height")).append(", blur level ").append(i);
        mTranscodingResources = (WJ)dv.a(wj);
        mDecoderOutputSurface = (VN)dv.a(vn);
        mDecoderOutputSurface.a(mediaformat.getInteger("height"), mediaformat.getInteger("width"));
        mBlurLevel = i;
        mPlaybackRate = d;
        mDecoderOutputSurface.a(i);
    }

    public VideoDecoder(WJ wj, MediaFormat mediaformat, int i, double d, Wc wc, WK wk, 
            Bitmap bitmap)
    {
        this(wj, new VO(), mediaformat, i, d, wc, wk, bitmap);
    }

    private void getFrameFromDecoder()
    {
        boolean flag = false;
        int i = mCodec.a();
        (new StringBuilder("Buffer: ")).append(i).append(" was returned");
        if (i < 0)
        {
            mCodec.a(i);
            return;
        }
        if (mCodec.e())
        {
            mCodec.a(i, false);
            return;
        }
        if (mCodec.c.size != 0)
        {
            flag = true;
        }
        (new StringBuilder("video decoder: returned buffer for time ")).append(mCodec.c.presentationTimeUs).append(" Rending:").append(flag);
        mCodec.a(i, flag);
        mDecodedBufferIndex = i;
    }

    public void outputFrame()
    {
        (new StringBuilder("output surface: await new image trie: ")).append(tries);
        tries = tries + 1;
        if (mDecoderOutputSurface.c())
        {
            long l = (long)(((double)mCodec.c.presentationTimeUs * 1000D) / mPlaybackRate);
            VM vm = mEncoder.d;
            if (vm == null)
            {
                throw new Wy("Error getting encoder input surface");
            }
            mDecoderOutputSurface.d();
            vm.a(l);
            vm.c();
            mDecodedBufferIndex = -1;
            tries = 0;
        }
        if (VU.a(mCodec.c))
        {
            mEncoder.b();
            stageComplete();
        }
    }

    public void processFrame()
    {
        if (mDecodedBufferIndex == -1)
        {
            getFrameFromDecoder();
        }
        if (mDecodedBufferIndex != -1)
        {
            outputFrame();
        }
    }

    public void setEncoder(WS ws)
    {
        mEncoder = ws;
        (new StringBuilder("Setting encoder:")).append(mEncoder);
    }

    public void setShader(WP.b b, boolean flag)
    {
        dv.a(mDecoderOutputSurface);
        (new StringBuilder("Setting output surface shader: ")).append(b.name()).append(", blurLevel ").append(mBlurLevel);
        if (mBlurLevel > 0 && mBlurLevel < 11)
        {
            WP.a a = new WP.a(mTranscodingResources);
            a.d = b;
            a.b = flag;
            a.c = true;
            b = a.a();
            mDecoderOutputSurface.a(b);
            return;
        } else
        {
            WP.a a1 = new WP.a(mTranscodingResources);
            a1.d = b;
            a1.b = flag;
            b = a1.a();
            mDecoderOutputSurface.a(b);
            return;
        }
    }

    public void stop()
    {
        super.stop();
        try
        {
            if (mDecoderOutputSurface != null)
            {
                mDecoderOutputSurface.a();
                mDecoderOutputSurface = null;
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }
}
