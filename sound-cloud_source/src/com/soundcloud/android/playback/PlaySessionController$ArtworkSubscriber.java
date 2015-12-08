// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.graphics.Bitmap;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import java.util.Collections;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController, IRemoteAudioManager

private final class <init> extends DefaultSubscriber
{

    final PlaySessionController this$0;

    private void logArtworkException(Bitmap bitmap, IllegalArgumentException illegalargumentexception)
    {
        if (bitmap == null)
        {
            bitmap = "null";
        } else
        {
            bitmap = (new StringBuilder()).append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString();
        }
        ErrorUtils.handleSilentException(illegalargumentexception, Collections.singletonMap("bitmap_size", bitmap));
    }

    public final void onNext(Bitmap bitmap)
    {
        try
        {
            PlaySessionController.access$700(PlaySessionController.this).onTrackChanged(PlaySessionController.access$2500(PlaySessionController.this), bitmap);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            logArtworkException(bitmap, illegalargumentexception);
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((Bitmap)obj);
    }

    private ()
    {
        this$0 = PlaySessionController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
