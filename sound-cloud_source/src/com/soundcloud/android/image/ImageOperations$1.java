// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.Bitmap;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOperations, ImageProcessor

class this._cls0
    implements f
{

    final ImageOperations this$0;

    public Bitmap call(Bitmap bitmap)
    {
        return ImageOperations.access$000(ImageOperations.this).blurBitmap(bitmap);
    }

    public volatile Object call(Object obj)
    {
        return call((Bitmap)obj);
    }

    ()
    {
        this$0 = ImageOperations.this;
        super();
    }
}
