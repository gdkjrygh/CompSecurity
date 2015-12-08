// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import java.nio.ByteBuffer;

public interface AudioInput
{
    public static interface FillBufferCallback
    {

        public abstract void onBufferFilled$57db82$2e70e3b3(int i, int j, long l, int k);
    }


    public abstract void fillBufferRequest(int i, ByteBuffer bytebuffer);

    public abstract boolean release();

    public abstract void setFillBufferResponseHandler(FillBufferCallback fillbuffercallback);

    public abstract void setIsEnabled(boolean flag);

    public abstract boolean start();

    public abstract boolean stop();
}
