// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.Bitmap;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.cache.Cache;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOperations

class val.resourceUrn
    implements b
{

    final ImageOperations this$0;
    final Urn val$resourceUrn;

    public void call(Bitmap bitmap)
    {
        ImageOperations.access$800(ImageOperations.this).put(val$resourceUrn, bitmap);
    }

    public volatile void call(Object obj)
    {
        call((Bitmap)obj);
    }

    ()
    {
        this$0 = final_imageoperations;
        val$resourceUrn = Urn.this;
        super();
    }
}
