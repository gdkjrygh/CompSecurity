// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import com.pinterest.kit.utils.GifDecoder;

public abstract class 
{

    public abstract void onDecodeFinished(int i);

    public abstract void onDecoderReady(GifDecoder gifdecoder);

    public abstract void onFirstFrameReady(Bitmap bitmap);

    public abstract void onMemoryMappedFinish();

    public abstract void onStatusChanged( );

    public ()
    {
    }
}
