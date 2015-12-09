// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.graphics.Bitmap;

// Referenced classes of package com.google.android.play.image:
//            FifeImageView

final class val.isLoaded
    implements Runnable
{

    final FifeImageView this$0;
    final Bitmap val$finalBitmap;
    final boolean val$isLoaded;

    public final void run()
    {
        FifeImageView.access$100(FifeImageView.this, val$finalBitmap, val$isLoaded);
    }

    ()
    {
        this$0 = final_fifeimageview;
        val$finalBitmap = bitmap;
        val$isLoaded = Z.this;
        super();
    }
}
