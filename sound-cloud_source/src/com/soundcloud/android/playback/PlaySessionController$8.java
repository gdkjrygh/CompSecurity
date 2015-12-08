// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.graphics.Bitmap;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.ErrorUtils;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController

class val.resourceUrn
    implements f
{

    final PlaySessionController this$0;
    final Urn val$resourceUrn;

    public Boolean call(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            ErrorUtils.handleSilentException(new IllegalArgumentException((new StringBuilder("Artwork bitmap is null ")).append(val$resourceUrn).toString()));
            return Boolean.valueOf(false);
        }
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0)
        {
            ErrorUtils.handleSilentException(new IllegalArgumentException((new StringBuilder("Artwork bitmap has no size ")).append(val$resourceUrn).toString()));
            return Boolean.valueOf(false);
        } else
        {
            return Boolean.valueOf(true);
        }
    }

    public volatile Object call(Object obj)
    {
        return call((Bitmap)obj);
    }

    ()
    {
        this$0 = final_playsessioncontroller;
        val$resourceUrn = Urn.this;
        super();
    }
}
