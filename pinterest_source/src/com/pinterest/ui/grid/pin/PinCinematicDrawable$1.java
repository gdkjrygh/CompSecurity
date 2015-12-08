// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import com.pinterest.kit.utils.GifDecoder;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCinematicDrawable

class wnloadGifTask.Listener extends wnloadGifTask.Listener
{

    final PinCinematicDrawable this$0;

    public void onDecodeFinished(int i)
    {
        PinCinematicDrawable.access$402(PinCinematicDrawable.this, i);
    }

    public void onDecoderReady(GifDecoder gifdecoder)
    {
        PinCinematicDrawable.access$102(PinCinematicDrawable.this, gifdecoder);
    }

    public void onFirstFrameReady(Bitmap bitmap)
    {
        PinCinematicDrawable.access$202(PinCinematicDrawable.this, bitmap);
        PinCinematicDrawable.access$302(PinCinematicDrawable.this, true);
        invalidateSelf();
    }

    public void onMemoryMappedFinish()
    {
        PinCinematicDrawable.access$302(PinCinematicDrawable.this, true);
        invalidateSelf();
    }

    public void onStatusChanged(atus atus)
    {
        PinCinematicDrawable.access$002(PinCinematicDrawable.this, atus);
    }

    atus()
    {
        this$0 = PinCinematicDrawable.this;
        super();
    }
}
