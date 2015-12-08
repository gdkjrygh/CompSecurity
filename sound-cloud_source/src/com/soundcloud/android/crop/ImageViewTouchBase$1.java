// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;


// Referenced classes of package com.soundcloud.android.crop:
//            ImageViewTouchBase, RotateBitmap

class val.resetSupp
    implements Runnable
{

    final ImageViewTouchBase this$0;
    final RotateBitmap val$bitmap;
    final boolean val$resetSupp;

    public void run()
    {
        setImageRotateBitmapResetBase(val$bitmap, val$resetSupp);
    }

    ()
    {
        this$0 = final_imageviewtouchbase;
        val$bitmap = rotatebitmap;
        val$resetSupp = Z.this;
        super();
    }
}
